package lt.baltictalents.stoteliutinklas.code;
import java.util.List;
import javax.swing.*;
import java.awt.event.*;
import java.sql.Date;
import java.time.LocalDateTime;

import lt.baltictalents.stoteliutinklas.data.beans.*;

public class gui {
	static List<Station> b;

	@SuppressWarnings("static-access")
	public gui(List<Station> b) {

	  this.b = b;
	  JFrame frame=new JFrame("Stoteles");
	  frame.setVisible(true);
	  frame.setSize(1000,300);
	  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  
	  JLabel label=new JLabel("Pasirinkit operacija:");
	  JPanel panel=new JPanel();
	  frame.add(panel);
	  panel.add(label);
	  
	  JButton button1=new JButton("Stoteles Kvadrate");
	  JButton button2=new JButton("Stoteles Kvadrate su max Marsrutu");
	  JButton button3=new JButton("Stoteles Rutuly");
	  JButton button4=new JButton("Artimiausia Stotele");
	  JButton button5=new JButton("Stoteles Marsrutai");
	  JButton button6=new JButton("Marsrutu Paeiska");
	  JButton button7=new JButton("Marsrutu Stoteles");
	  JButton button8=new JButton("Daugiausia Marsrutu");
	  JButton button9=new JButton("Marsrutu susikirtimo vieta");
	  JButton button10=new JButton("Sukurti SQlite faila");
	  JButton button11=new JButton("Pakeisti prieziuros darbu data");
	  JButton button12=new JButton("Pakeisti prieziuros darbu datai siandien");

	
	  panel.add(button1);
	  panel.add(button2);
	  panel.add(button3);
	  panel.add(button4);
	  panel.add(button5);
	  panel.add(button6);
	  panel.add(button7);
	  panel.add(button8);
	  panel.add(button9);
	  panel.add(button10);
	  panel.add(button11);
	  panel.add(button12);


	
	  button1.addActionListener(new Action1());
	  button2.addActionListener(new Action2());
	  button3.addActionListener(new Action3());
	  button4.addActionListener(new Action4());
	  button5.addActionListener(new Action5());
	  button6.addActionListener(new Action6());
	  button7.addActionListener(new Action7());
	  button8.addActionListener(new Action8());
	  button9.addActionListener(new Action9());
	  button10.addActionListener(new Action10());
	  button11.addActionListener(new Action11());
	  button12.addActionListener(new Action12());




	  
 }
 	static class Action1 implements ActionListener{
	    public void actionPerformed (ActionEvent e){
	    	String x1 = JOptionPane.showInputDialog("x1");
			String y1 = JOptionPane.showInputDialog("y1");
			String x2 = JOptionPane.showInputDialog("x2");
			String y2 = JOptionPane.showInputDialog("y2");
	 	    control main = new control(b);
		    JFrame frame2=new JFrame("Clicked");
		    frame2.setVisible(true);
		    frame2.setSize(1000,300);
		    JLabel label=new JLabel(String.valueOf(main.StotelesKvadrate(x1, y1, x2, y2)));
		    JPanel panel=new JPanel();
		    frame2.add(panel);
		    panel.add(label);
    
    
	    }
 	}
 	static class Action2 implements ActionListener{
	    public void actionPerformed (ActionEvent e){
	    	String x1 = JOptionPane.showInputDialog("x1");
			String y1 = JOptionPane.showInputDialog("y1");
			String x2 = JOptionPane.showInputDialog("x2");
			String y2 = JOptionPane.showInputDialog("y2");
	 	    control main = new control(b);
		    JFrame frame2=new JFrame("Clicked");
		    frame2.setVisible(true);
		    frame2.setSize(1000,300);
		    JLabel label=new JLabel(String.valueOf(main.StoteleKvadrateSuMax(x1, y1, x2, y2)));
		    JPanel panel=new JPanel();
		    frame2.add(panel);
		    panel.add(label);
    
    
	    }
 	}
 	static class Action3 implements ActionListener{
	    public void actionPerformed (ActionEvent e){
	    	String x = JOptionPane.showInputDialog("x");
			String y = JOptionPane.showInputDialog("y");
			String r = JOptionPane.showInputDialog("r");
	 	    control main = new control(b);
		    JFrame frame2=new JFrame("Clicked");
		    frame2.setVisible(true);
		    frame2.setSize(1000,300);
		    JLabel label=new JLabel(String.valueOf(main.StotelesRutuly(x, y,Integer.parseInt(r))));
		    JPanel panel=new JPanel();
		    frame2.add(panel);
		    panel.add(label);
    
    
	    }
 	}
 	static class Action4 implements ActionListener{
	    public void actionPerformed (ActionEvent e){
	    	String x = JOptionPane.showInputDialog("x");
			String y = JOptionPane.showInputDialog("y");
	 	    control main = new control(b);
		    JFrame frame2=new JFrame("Clicked");
		    frame2.setVisible(true);
		    frame2.setSize(1000,300);
		    JLabel label=new JLabel(main.ArtimiausiaStotele(x, y));
		    JPanel panel=new JPanel();
		    frame2.add(panel);
		    panel.add(label);
    
    
	    }
 	}
 	static class Action5 implements ActionListener{
	    public void actionPerformed (ActionEvent e){
	    	String pav = JOptionPane.showInputDialog("numeris:");
	 	    control main = new control(b);
	    	System.out.println(main.StotelesMarsrutai(pav));
		    JFrame frame2=new JFrame("Clicked");
		    frame2.setVisible(true);
		    frame2.setSize(800,800);
		    String ans = "<html><p>";
		    int n=0;
		    for(Station d : main.marsrutoStoteles(pav)) {
		    	ans +=d.getName()+"  |||  ";
		    	n++;
		    	if(n == 3) {ans+="<br/>";
		    	n=0;
		    	}
		    }
		    ans+="</p></html>";
		    JLabel label=new JLabel(ans, SwingConstants.CENTER);
		    JPanel panel=new JPanel();
		    frame2.add(panel);
		    panel.add(label);
    
    
	    }
 	}
 	static class Action6 implements ActionListener{
	    public void actionPerformed (ActionEvent e){
	    	String x = JOptionPane.showInputDialog("x");
			String y = JOptionPane.showInputDialog("y");
			System.out.println(x);
			//x = "25.2807679";
			System.out.println(x);
			System.out.println(y);
			//y= "54.7553245";
			System.out.println(y);
	 	    control main = new control(b);
		    JFrame frame2=new JFrame("Clicked");
		    frame2.setVisible(true);
		    frame2.setSize(1000,300);
		    JLabel label=new JLabel(String.valueOf(main.MarsrutuPaeiska(x,y ))); // kaip ir praeitas
		    JPanel panel=new JPanel();
		    frame2.add(panel);
		    panel.add(label);
    
    
	    }
 	}
 	static class Action7 implements ActionListener{
	    public void actionPerformed (ActionEvent e){
	    	String pav = JOptionPane.showInputDialog("Stoteles Pavadinimas:");
	    	pav = "Vaikų ligoninė";
	    	System.out.println();
	 	    control main = new control(b);
		    JFrame frame2=new JFrame("Clicked");
		    frame2.setVisible(true);
		    frame2.setSize(1000,300);
		    JLabel label=new JLabel(String.valueOf(main.StotelesMarsrutai(pav)));
		    JPanel panel=new JPanel(); // 
		    frame2.add(panel);
		    panel.add(label);
    
    
	    }
 	}
 
 	static class Action8 implements ActionListener{
	    public void actionPerformed (ActionEvent e){
	    	String pav = JOptionPane.showInputDialog("n");
	 	    control main = new control(b);
		    JFrame frame2=new JFrame("Clicked");
		    frame2.setVisible(true);
		    frame2.setSize(1000,300);
		    JLabel label=new JLabel(String.valueOf(main.DaugiausiaMarsrutu(b, Integer.parseInt(pav)))); 
		    JPanel panel=new JPanel();
		    frame2.add(panel);
		    panel.add(label);
    
    
	    }
 	}
 	static class Action9 implements ActionListener{
	    public void actionPerformed (ActionEvent e){
	    	String pav = JOptionPane.showInputDialog("numeriai atskirti tarpeliais:");
	 	    control main = new control(b);
		    JFrame frame2=new JFrame("Clicked");
		    frame2.setVisible(true);
		    frame2.setSize(1000,300);
		    JLabel label=new JLabel(main.MarsrutuSusikirtimoVietos(pav)); 
		    JPanel panel=new JPanel();
		    frame2.add(panel);
		    panel.add(label);
    
    
	    }
 	}
 	static class Action10 implements ActionListener{
	    public void actionPerformed (ActionEvent e){
	    	String pav = JOptionPane.showInputDialog("failo pavadinimas:");
	 	    control main = new control(b);
	 	    main.writeSQL(pav);
		    JFrame frame2=new JFrame("Clicked");
		    frame2.setVisible(true);
		    frame2.setSize(1000,300);
		    JLabel label1=new JLabel("Failas Sukurtas pavadinimu: "+pav); 
		    JPanel panel=new JPanel();
		    frame2.add(panel);
		    main.AddDataToTable(pav);
		    panel.add(label1);
    
    
	    }
 	}
 	static class Action11 implements ActionListener{
	    public void actionPerformed (ActionEvent e){
	    	String pav = JOptionPane.showInputDialog("Doumenu bazes failo pavadinimas:");
	    	String StotelesPav = JOptionPane.showInputDialog("Stoteles pavadinimas:");
	    	String data = JOptionPane.showInputDialog("Data, kada atnaujinta stotele:");
	 	    control main = new control(b);
		    JFrame frame2=new JFrame("Clicked");
		    frame2.setVisible(true);
		    frame2.setSize(1000,300);
		    main.PakeistiDarbuData(pav, StotelesPav, data);
		    JLabel label1=new JLabel("Data pakeista"); 
		    JPanel panel=new JPanel();
		    frame2.add(panel);
		    main.AddDataToTable(pav);
		    panel.add(label1);
    
    
	    }
 	}
 	static class Action12 implements ActionListener{
	    public void actionPerformed (ActionEvent e){
	    	String pav = JOptionPane.showInputDialog("Doumenu bazes failo pavadinimas:");
	    	String StotelesPav = JOptionPane.showInputDialog("Stoteles pavadinimas:");
	 	    control main = new control(b);
		    JFrame frame2=new JFrame("Clicked");
		    frame2.setVisible(true);
		    frame2.setSize(1000,300);
		    main.PakeistiDarbuData(pav, StotelesPav, String.valueOf(LocalDateTime.now()));
		    JLabel label1=new JLabel("Data pakeistaa"); 
		    JPanel panel=new JPanel();
		    frame2.add(panel);
		    main.AddDataToTable(pav);
		    panel.add(label1);
    
    
	    }
 	}
 
}