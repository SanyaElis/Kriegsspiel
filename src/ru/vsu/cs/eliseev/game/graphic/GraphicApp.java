package ru.vsu.cs.eliseev.game.graphic;

import ru.vsu.cs.eliseev.game.battlefield.Cell;
import ru.vsu.cs.eliseev.game.draw.DrawingCell;
import ru.vsu.cs.eliseev.game.field.Battlefield;
import ru.vsu.cs.eliseev.game.units.Position;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class GraphicApp extends JFrame {

    private JButton endOfStep;
    private JButton stopGame;
    private JButton makeMove;
    private JPanel mainPanel;
    private JPanel paintPanelContainer;
    private JLabel statusLabel;

    private PaintPlace myGame;
    private Battlefield bf;
    private boolean stop = false;
    private boolean end = false;
    private Position[] fromTo = null;
    private Position lastPos = null;
    private boolean canMakeStep = false;

    private static class PaintPlace extends JPanel {
        private DrawingCell dc;
        private Cell[][] cells;

        public PaintPlace() {
        }

        @Override
        protected void paintComponent(Graphics g) {
            Graphics2D g2d = (Graphics2D) g;
            drawGrid(g2d);
            if (cells != null) {
                drawField(cells, g2d);
            }
        }

        private void drawGrid(Graphics2D g2d) {
            for (int i = 1; i <= 25; i++) {
                g2d.drawLine(getWidth() * i / 25, 0, getWidth() * i / 25, getHeight());
            }
            for (int i = 1; i <= 20; i++) {
                g2d.drawLine(0, getHeight() * i / 20, getWidth(), getHeight() * i / 20);
            }
        }

        public void drawField(Cell[][] field, Graphics2D g2d) {
            dc = new GraphicDrawer(g2d, getHeight(), getWidth());

            for (Cell[] cells : field) {
                for (Cell cell : cells) {
                    cell.draw(dc);
                }
            }
        }

        public void setBF(Cell[][] field) {
            this.cells = field;
        }
    }

    public GraphicApp(Battlefield bf) {
        this.setTitle("Kriegsspiel");
        this.setContentPane(mainPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.bf = bf;

        paintPanelContainer.setLayout(new BorderLayout());
        myGame = new PaintPlace();
        paintPanelContainer.add(new JScrollPane(myGame));

        myGame.setBF(bf.getField());
        myGame.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (SwingUtilities.isRightMouseButton(e)) {
                    lastPos = null;
                    fromTo = null;
                }

                if (SwingUtilities.isLeftMouseButton(e)) {
                    if (lastPos == null) {
                        lastPos = Position.fromMouseClick(e.getX(), e.getY(), myGame.getWidth(), myGame.getHeight());
                    } else {
                        fromTo = new Position[]{lastPos, Position.fromMouseClick(e.getX(), e.getY(), myGame.getWidth(), myGame.getHeight())};
                        lastPos = null;
                    }
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        endOfStep.addActionListener(e -> end = !end);
        stopGame.addActionListener(e -> stop = !stop);

    }

    public void repaintField() {
        myGame.setBF(bf.getField());
    }

    public boolean isStop() {
        fromTo = null;
        return stop;
    }

    public boolean isEnd() {
        return end;
    }

    public void incorrectPosition() {
        statusLabel.setText("Incorrect Position");
    }

    public Position[] getFromTo() {
        statusLabel.setText("Choose troop and destiny");
//        while (fromTo == null) {
//            new java.util.Timer().schedule(
//                    new java.util.TimerTask() {
//                        @Override
//                        public void run() {
//                            statusLabel.setText("Choose troop and destiny 123");
//                        }
//                    },
//                    5000
//            );
//        }
        return fromTo;
    }

}
