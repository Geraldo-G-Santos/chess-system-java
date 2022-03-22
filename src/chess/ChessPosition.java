package chess;

import boardgame.Position;

public class ChessPosition {
<<<<<<< HEAD

	private char column;
	private int row;

	public ChessPosition(char column, int row) {
		if (column < 'a' || column > 'h' || row < 1 || row > 8) {
			throw new ChessException("Error instantiating ChessPosition. Valid values are from a1 to h8.");
=======
	
	private char column;
	private int row;
	
	public ChessPosition(char column, int row) {
		if (column < 'a' || column > 'h' || row < 1 || row > 8) {
			throw new ChessException("Error instantiating ChessPosition. Valid value are from a1 to h8");
>>>>>>> 633c15eae7c8636be003e4bd86771532a37896d6
		}
		this.column = column;
		this.row = row;
	}

	public char getColumn() {
		return column;
	}

<<<<<<< HEAD
=======

>>>>>>> 633c15eae7c8636be003e4bd86771532a37896d6
	public int getRow() {
		return row;
	}

	protected Position toPosition() {
<<<<<<< HEAD
		return new Position(8 - row, column - 'a');
	}
	
	protected static ChessPosition fromPosition(Position position) {
		return new ChessPosition((char)('a' - position.getColumn()), 8 - position.getRow());
=======
		return new Position( 8 - row, column - 'a');
	}
	
	protected static ChessPosition fromPosition(Position position) {
		return new ChessPosition((char)('a' - position.getColum()), 8 - position.getRow());
>>>>>>> 633c15eae7c8636be003e4bd86771532a37896d6
	}
	
	@Override
	public String toString() {
		return "" + column + row;
	}

<<<<<<< HEAD
}
=======
}
>>>>>>> 633c15eae7c8636be003e4bd86771532a37896d6
