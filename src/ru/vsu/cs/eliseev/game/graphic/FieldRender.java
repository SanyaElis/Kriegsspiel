package ru.vsu.cs.eliseev.game.graphic;

import ru.vsu.cs.eliseev.game.battlefield.Cell;
import ru.vsu.cs.eliseev.game.battlefield.Ground;
import ru.vsu.cs.eliseev.game.battlefield.Mountain;
import ru.vsu.cs.eliseev.game.battlefield.MountainPass;
import ru.vsu.cs.eliseev.game.units.Warrior;

import javax.swing.*;
import javax.swing.table.TableCellRenderer;
import java.awt.*;
import java.util.Map;

public class FieldRender extends JLabel implements TableCellRenderer {
    private final IconGetter iconGetter = new IconGetter();
    Map<Class<? extends Cell>, Icon> cellDrawer = iconGetter.getIconsForCell();
    Map<Class<? extends Warrior>, Icon> warriorDrawer = iconGetter.getIconsForWarrior();

    public FieldRender() {
        super.setOpaque(true);
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Cell cell = (Cell) value;
        if (cell.getWarrior() != null) {
            super.setIcon(warriorDrawer.get(cell.getWarrior().getClass()));
        } else {
            super.setIcon(cellDrawer.get(cell.getClass()));
        }
        return this;
    }
}
