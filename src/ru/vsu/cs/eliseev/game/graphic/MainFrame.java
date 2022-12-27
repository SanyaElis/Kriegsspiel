package ru.vsu.cs.eliseev.game.graphic;

import ru.vsu.cs.eliseev.game.battlefield.Cell;
import ru.vsu.cs.eliseev.game.game.API;
import ru.vsu.cs.eliseev.game.game.Game2;
import ru.vsu.cs.eliseev.game.game.VariationOfStep;
import ru.vsu.cs.eliseev.game.units.Position;

import javax.swing.*;
import javax.swing.table.TableColumn;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MainFrame extends JFrame {
    private Game2 game2 = new Game2();
    private Cell[][] field = game2.getBf().getField();
    private Position[] fromTo = null;
    private Position lastPos = null;
    private JTable mainField;

    public MainFrame() {
        setTitle("Kriegsspiel");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        FieldTableModel model = new FieldTableModel(field);
        mainField = new JTable(model);
        mainField.setDefaultRenderer(Cell.class, new FieldRender());
        mainField.setRowHeight(35);
        TableColumn column;
        for (int i = 0; i < mainField.getColumnCount(); i++) {
            column = mainField.getColumnModel().getColumn(i);
            column.setMaxWidth(35);
        }
        this.add(new JScrollPane(mainField));
        mainField.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int row = mainField.rowAtPoint(e.getPoint());
                int col = mainField.columnAtPoint(e.getPoint());
                if (SwingUtilities.isRightMouseButton(e)) {
                    lastPos = null;
                    fromTo = null;
                }

                if (SwingUtilities.isLeftMouseButton(e)) {
                    if (lastPos == null) {
                        lastPos = new Position(col, row);
                    } else {
                        fromTo = new Position[]{lastPos, new Position(col, row)};
                        game2.move(fromTo);
                        lastPos = null;
                        mainField.repaint();
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
        this.pack();
    }

    public static void main(String[] args) {
        MainFrame testFrame = new MainFrame();
        testFrame.setSize(910,775);
        testFrame.setVisible(true);
    }

    public boolean stop() {
        return false;
    }

    public VariationOfStep command() {
        return VariationOfStep.MOVE;
    }

    public void drawBattlefield(Cell[][] field) {
    }


    public Position[] askPosition() {
        while (fromTo == null) {
            //System.out.println("Wait");
            new java.util.Timer().schedule(
                    new java.util.TimerTask() {
                        @Override
                        public void run() {
                            //System.out.println("Wait");
                        }
                    },
                    10000
            );
        }
        Position[] result = fromTo.clone();
        fromTo = null;
        return result;
    }


    public void incorrectPosition() {
        System.out.println("Error");
    }
}
