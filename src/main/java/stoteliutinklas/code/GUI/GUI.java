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
	  frame.setSize(1000,300);
	  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  
	  JLabel label=new JLabel("Pasirinkite operacija:");
	  JPanel panel=new JPanel();
	  frame.add(panel);
	  panel.add(label);
	  
	  JButton button1=new JButton("Stoteles esancios kvadrate");
	  JButton button2=new JButton("Stotele kvadrate su daugiausia marsrutu");
	  JButton button3=new JButton("Stoteles esancios rutulyje");
	  JButton button4=new JButton("Marsrutu Stoteles");
	  JButton button5=new JButton("Daugiausia Marsrutu");
	  JButton button6=new JButton("Sukurti SQlite faila");

	  panel.add(button1);
	  panel.add(button2);
	  panel.add(button3);
	  panel.add(button4);
	  panel.add(button5);
	  panel.add(button6);

	  button1.addActionListener(new Action1());
	  button2.addActionListener(new Action2());
	  button3.addActionListener(new Action3());
	  button4.addActionListener(new Action4());
	  button5.addActionListener(new Action5());
	  button6.addActionListener(new Action6()); 
 }
	
 	static class Action1 implements ActionListener{
	    public void actionPerformed (ActionEvent e){

	    	String x1 = JOptionPane.showInputDialog("Top left side x coordinate?");
			String y1 = JOptionPane.showInputDialog("Top left side y coordinate?");
			String x2 = JOptionPane.showInputDialog("Bottom right side x coordinate?");
			String y2 = JOptionPane.showInputDialog("Bottom right side y coordinate?");
	 	    Controler main = new Controler(b);
		    JFrame frame2=new JFrame("Clicked");
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
		    JFrame frame2=new JFrame("Clicked");
		    frame2.setVisible(true);
		    frame2.setSize(500,500);
		    JLabel label=new JLabel(String.valueOf("Daugiausia marsrutu turi: "+main.StoteleKvadrateSuMax(x1, y1, x2, y2)));
		    JPanel panel=new JPanel();
		    frame2.add(panel);
		    panel.add(label);
    
    
	    }
 	}
 	static class Action3 implements ActionListener{
	    public void actionPerformed (ActionEvent e){
	    	String x = JOptionPane.showInputDialog("x coordinate?");
			String y = JOptionPane.showInputDialog("y coordinate?");
			String r = JOptionPane.showInputDialog("radius of circle?");
	 	    Controler main = new Controler(b);
		    JFrame frame2=new JFrame("Clicked");
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
	    	String pav = JOptionPane.showInputDialog("Stoteles Pavadinimas:");
	 	    Controler main = new Controler(b);
		    JFrame frame2=new JFrame("Clicked");
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
	    	String pav = JOptionPane.showInputDialog("n");
	 	    Controler main = new Controler(b);
		    JFrame frame2=new JFrame("Clicked");
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
	    	String pav = JOptionPane.showInputDialog("failo pavadinimas:");
	 	    Controler main = new Controler(b);
	 	    main.writeSQL(pav);
		    JFrame frame2=new JFrame("Clicked");
		    frame2.setVisible(true);
		    frame2.setSize(500,500);
		    JLabel label1=new JLabel("Failas Sukurtas pavadinimu: "+pav + " database folderyje."); 
		    JPanel panel=new JPanel();
		    frame2.add(panel);
		    main.AddDataToTable(pav);
		    panel.add(label1);
    
    
	    }
 	}


 
}