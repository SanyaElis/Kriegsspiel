package ru.vsu.cs.eliseev.game.graphic;

import ru.vsu.cs.eliseev.game.battlefield.Cell;
import ru.vsu.cs.eliseev.game.game.Game;
import ru.vsu.cs.eliseev.game.units.Position;

import javax.swing.*;
import javax.swing.table.TableColumn;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MainFrame extends JFrame {
    private final Cell[][] field;
    private Position[] fromTo = null;
    private Position lastPos = null;
    private Game game = new Game();

    public MainFrame() {
        setTitle("Kriegsspiel");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        field = game.getBf().getField();
        FieldTableModel model = new FieldTableModel(field);
        JTable mainField = new JTable(model);
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
                        game.move(fromTo);
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
}
