package Unidade2;

import javax.swing.JOptionPane;

public class JantarPizza {

	public static void main(String[] args) {
		
		double valor_total = Double.parseDouble(JOptionPane.showInputDialog("Informar o valor total: "));
		double total_clientes = Double.parseDouble(JOptionPane.showInputDialog("Informar o total de clientes: "));
		double valor_cliente = (valor_total/total_clientes);
		JOptionPane.showMessageDialog(null, "O valor por cliente é de: "+valor_cliente);

	}

}
