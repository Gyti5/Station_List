package stoteliutinklas.code.GUI;
import java.util.List;
import javax.swing.*;

import stoteliutinklas.code.controller.Controler;
import stoteliutinklas.data.beans.*;

import java.awt.event.*;

public class GUI {
	static List<Station> b;

	@SuppressWarnings("static-access")
	public GUI(List<Station> b) {

	  this.b = b;
	  JFrame frame=new JFrame("Stoteles");
	  frame.setVisible(true);
	  frame.setSize(800,500);
	  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  
	  JLabel label=new JLabel("Select action:");
	  JPanel panel=new JPanel();
	  frame.add(panel);
	  panel.add(label);
	  
	  JButton button1=new JButton("1.Stations that are in the square");
	  JButton button2=new JButton("2.Station in square with most routes");
	  JButton button3=new JButton("3.Stations in the circle");
	  JButton button4=new JButton("4.Station routes");
	  JButton button5=new JButton("5.N station(s) with most routes");
	  JButton button6=new JButton("6.Create SQlite file");
	  JButton button7=new JButton("HELP");

	  
	  panel.add(button1);
	  panel.add(button2);
	  panel.add(button3);
	  panel.add(button4);
	  panel.add(button5);
	  panel.add(button6);
	  panel.add(button7);

	  
	  button1.addActionListener(new Action1());
	  button2.addActionListener(new Action2());
	  button3.addActionListener(new Action3());
	  button4.addActionListener(new Action4());
	  button5.addActionListener(new Action5());
	  button6.addActionListener(new Action6()); 
	  button7.addActionListener(new Action7()); 

 }
	
 	static class Action1 implements ActionListener{
	    public void actionPerformed (ActionEvent e){

	    	String x1 = JOptionPane.showInputDialog("Top left side x coordinate?");
			String y1 = JOptionPane.showInputDialog("Top left side y coordinate?");
			String x2 = JOptionPane.showInputDialog("Bottom right side x coordinate?");
			String y2 = JOptionPane.showInputDialog("Bottom right side y coordinate?");
	 	    Controler main = new Controler(b);
		    JFrame frame2=new JFrame("Done");
		    frame2.setVisible(true);
		    frame2.setSize(500,500);
		    JLabel label=new JLabel(String.valueOf(main.StotelesKvadrate(x1, y1, x2, y2)));
		    JPanel panel=new JPanel();
		    frame2.add(panel);
		    panel.add(label);
    
    
	    }
 	}
 	static class Action2 implements ActionListener{
	    public void actionPerformed (ActionEvent e){
	    	String x1 = JOptionPane.showInputDialog("Top left side x coordinate?");
			String y1 = JOptionPane.showInputDialog("Top left side y coordinate?");
			String x2 = JOptionPane.showInputDialog("Bottom right side x coordinate?");
			String y2 = JOptionPane.showInputDialog("Bottom right side y coordinate?");
	 	    Controler main = new Controler(b);
		    JFrame frame2=new JFrame("Done");
		    frame2.setVisible(true);
		    frame2.setSize(500,500);
		    JLabel label=new JLabel(String.valueOf("Most routes: "+main.StoteleKvadrateSuMax(x1, y1, x2, y2)));
		    JPanel panel=new JPanel();
		    frame2.add(panel);
		    panel.add(label);
    
    
	    }
 	}
 	static class Action3 implements ActionListener{
	    public void actionPerformed (ActionEvent e){
	    	String x = JOptionPane.showInputDialog("x coordinate?");
			String y = JOptionPane.showInputDialog("y coordinate?");
			String r = JOptionPane.showInputDialog("Radius of circle?");
	 	    Controler main = new Controler(b);
		    JFrame frame2=new JFrame("Done");
		    frame2.setVisible(true);
		    frame2.setSize(500,500);
		    JLabel label=new JLabel(String.valueOf(main.StotelesRutuly(x, y,Integer.parseInt(r))));
		    JPanel panel=new JPanel();
		    frame2.add(panel);
		    panel.add(label);
    
    
	    }
 	}

 	static class Action4 implements ActionListener{
	    public void actionPerformed (ActionEvent e){
	    	String pav = JOptionPane.showInputDialog("Station name?");
	 	    Controler main = new Controler(b);
		    JFrame frame2=new JFrame("Done");
		    frame2.setVisible(true);
		    frame2.setSize(500,500);
		    JLabel label=new JLabel(String.valueOf(main.StotelesMarsrutai(pav)));
		    JPanel panel=new JPanel(); 
		    frame2.add(panel);
		    panel.add(label);
    
    
	    }
 	}
 
 	static class Action5 implements ActionListener{
	    public void actionPerformed (ActionEvent e){
	    	String pav = JOptionPane.showInputDialog("How many stations?");
	 	    Controler main = new Controler(b);
		    JFrame frame2=new JFrame("Done");
		    frame2.setVisible(true);
		    frame2.setSize(500,500);
		    JLabel label=new JLabel(String.valueOf(main.DaugiausiaMarsrutu(b, Integer.parseInt(pav)))); 
		    JPanel panel=new JPanel();
		    frame2.add(panel);
		    panel.add(label);
    
    
	    }
 	}

 	static class Action6 implements ActionListener{
	    public void actionPerformed (ActionEvent e){
	    	String pav = JOptionPane.showInputDialog("File name:");
	 	    Controler main = new Controler(b);
	 	    main.writeSQL(pav);
		    JFrame frame2=new JFrame("Done");
		    frame2.setVisible(true);
		    frame2.setSize(500,500);
		    JLabel label1=new JLabel("File created with name: "+pav + " in 'database' folder."); 
		    JPanel panel=new JPanel();
		    frame2.add(panel);
		    main.AddDataToTable(pav);
		    panel.add(label1);
    
    
	    }
 	}


 	static class Action7 implements ActionListener{
	    public void actionPerformed (ActionEvent e){
		    
		    StringBuilder buff = new StringBuilder();
	        buff.append("<html><table>");
	        
	        buff.append(String.format("<tr><td align='right'>%s</td><td>:</td><td>%s</td></tr>", "1. Insert coordinates to select area from witch the stations will be picked."," eg: 20; 60; 60; 20"));
	        buff.append(String.format("<tr><td align='right'>%s</td><td>:</td><td>%s</td></tr>", "2. Insert coordinates to select area from witch the station will be picked."," eg: 20; 60; 60; 20"));
	        buff.append(String.format("<tr><td align='right'>%s</td><td>:</td><td>%s</td></tr>", "3. Insert coordinates and the radius of the circle from witch the stations will be picked.", " eg: "));
	        buff.append(String.format("<tr><td align='right'>%s</td><td>:</td><td>%s</td></tr>", "4. Enter station name to see the information about busses that stop there", " eg: Vaiku ligonine"));
	        buff.append(String.format("<tr><td align='right'>%s</td><td>:</td><td>%s</td></tr>", "5. Picks n amount of stations that have most busses stopping there", " eg: 3"));
	        buff.append(String.format("<tr><td align='right'>%s</td><td>:</td><td>%s</td></tr>", "6. Creates new .db file with name of your choice with all the info about stops", "eg: Stations"));

	        buff.append("</table></html>");
	        JOptionPane.showMessageDialog(null, new JLabel(buff.toString()));    
    
	    }
 	}
 
}