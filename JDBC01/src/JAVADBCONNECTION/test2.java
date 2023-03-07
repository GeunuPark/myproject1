package JAVADBCONNECTION;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;

public class test2 {

	public static void main(String[] args) {
		String s = JOptionPane.showInputDialog("이름입력");
		Connection con = DriverManager.getConnection("", "", "");
		
	}

}
