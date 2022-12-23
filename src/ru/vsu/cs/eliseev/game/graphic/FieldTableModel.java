package ru.vsu.cs.eliseev.game.graphic;

import ru.vsu.cs.eliseev.game.battlefield.Cell;

import javax.swing.table.AbstractTableModel;

public class FieldTableModel extends AbstractTableModel {
    private final Cell[][] field;

    public FieldTableModel(Cell[][] field) {
        this.field = field;
    }

    @Override
    public String getColumnName(int column) {
        return column + "";
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return Cell.class;
    }

    @Override
    public int getRowCount() {
        return field.length;
    }

    @Override
    public int getColumnCount() {
        return field[0].length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return field[rowIndex][columnIndex];
    }
}
