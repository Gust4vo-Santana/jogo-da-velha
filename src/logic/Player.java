package logic;

import view.Table;

public class Player {

	private final Symbol symbol;
	
	public Player(Symbol symbol) {
		this.symbol = symbol;
	}
	
	public void play(int position) {
		Table.positions.putIfAbsent(position, this.symbol);
	}
	
	@Override
	public String toString() {
		if(this.symbol.equals(Symbol.X)) return "\u001B[31mJogador " + this.symbol + "\u001B[0m";
		else return "\u001B[36mJogador " + this.symbol + "\u001B[0m";
	}
}
