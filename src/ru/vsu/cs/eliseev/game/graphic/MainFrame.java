package ru.vsu.cs.eliseev.game.graphic;

import ru.vsu.cs.eliseev.game.battlefield.Cell;
import ru.vsu.cs.eliseev.game.field.Battlefield;
import ru.vsu.cs.eliseev.game.game.Game2;
import ru.vsu.cs.eliseev.game.units.Position;

import javax.swing.*;
import javax.swing.table.TableColumn;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MainFrame extends JFrame {
    private final Cell[][] field;
    private Position[] fromTo = null;
    private Position lastPos = null;
    private Game2 game2 = new Game2();

    public MainFrame() {
        setTitle("Kriegsspiel");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        field = game2.getBf().getField();
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
                //int row = jTable1.rowAtPoint(evt.getPoint());
                //int col = jTable1.columnAtPoint(evt.getPoint());
                if (SwingUtilities.isRightMouseButton(e)) {
                    lastPos = null;
                    fromTo = null;
                }

                if (SwingUtilities.isLeftMouseButton(e)) {
                    if (lastPos == null) {
                        //lastPos = Position.fromMouseClick(new Position(mainField.rowAtPoint(e.getPoint())).getX(), );
                    } else {
                        //fromTo = new Position[]{lastPos, Position.fromMouseClick(e.getX(), e.getY(), myGame.getWidth(), myGame.getHeight())};
                        game2.move(fromTo);
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
        this.pack();
    }

    public static void main(String[] args) {
        MainFrame testFrame = new MainFrame();
        testFrame.setSize(1000,1000);
        testFrame.setVisible(true);
    }
}
