package view;

import java.util.HashMap;
import java.util.Map;

import logic.Symbol;

public class Table {

	public static Map<Integer, Symbol> positions = new HashMap<>();
	
	public static String displayTable() {
	
		StringBuilder sb = new StringBuilder();
		
		int i = 0;
		for(int j = 0; j < 3; j++) {
			sb.append(" -----------\n");
			for(int k = 0; k < 3; k++) {
				sb.append("| ");
				
				if(positions.get(i) != null && positions.get(i).equals(Symbol.X))
					sb.append("\u001B[31m" + positions.get(i)+"\u001B[0m ");
				
				else if (positions.get(i) != null && positions.get(i).equals(Symbol.O))
						  sb.append("\u001B[36m" + positions.get(i)+"\u001B[0m ");
				
				else sb.append(i + " ");
				i++;
			}
			sb.append("|");
			sb.append("\n");
		}
		sb.append(" -----------");
		
		return sb.toString();
	}
}
