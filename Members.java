package finalProject;
import java.sql.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;
import java.util.jar.Attributes.Name;

import javax.swing.*;

public class Members {

}
class StartPanel extends JPanel implements ActionListener{
	int cusNo;
	int venNo;
	int salesNo;
	JComboBox<String> jcb =null;
	int cview = -1;
	JLabel jl1 ,jl2, jl3, jl4, jl5;
	JButton jcb1, jcb2, jcb3, jcb4;
	JButton jvb1, jvb2, jvb3, jvb4;
	JButton jrb1, jrb2, jrb3, jrb4;
	JTextField jtf1;
	JPasswordField jpf1;
	ArrayList<JButton> jbs;
	JButton jbc1, jbc2, jbc3, backJb, backJb2, backJb3, cbackJb, vbackJb, rbackJb;
	ArrayList<JButton> eJbs;
	ArrayList<JButton> rJbs;
	ArrayList<JButton> xJbs;
	JPanel jp1, jp2, jp3, jp4, tp3;
	TittlePanel tp1;
	TittlePanel2 tp2;
	EnterPanel ep;
	ChoosePanel cp;
	ReportPanel rp;
	ArrayList<ChoosePanel> cps;
	HashMap<String, String> adminLogin;
	HashMap<String, String> adminName;
	HashMap<String, String> customerLogin;
	HashMap<String, String> customerName;
	HashMap<String, String> salesLogin;
	HashMap<String, String> salesName;
	HashMap<String, String> vendorLogin;
	HashMap<String, String> vendorName;
	public void paint(Graphics g){
		super.paint(g);
	}
	public StartPanel(HashMap<String, String> adminLogin, HashMap<String, String> adminName,
			HashMap<String, String> salesLogin, HashMap<String, String> salesName,
			HashMap<String, String> vendorLogin, HashMap<String, String> vendorName,
			HashMap<String, String> customerLogin, HashMap<String, String> customerName){
		this.adminLogin = adminLogin;
		this.adminName = adminName;
		this.salesLogin = salesLogin;
		this.salesName = salesName;
		this.vendorLogin = vendorLogin;
		this.vendorName = vendorName;
		this.customerLogin = customerLogin;
		this.customerName = customerName;
		jbs = new ArrayList<JButton>();
		setButton(jbs);
		String[] role = {"terriotory", "customer", "vendor", "admin", "salseRep"};
		jcb = new JComboBox<>(role);
		cps = new ArrayList<ChoosePanel>();
		jbc1 = new JButton("Transaction");
		jbc1.addActionListener(this);
		jbc1.setActionCommand("a");
		jbc2 = new JButton("Report");
		jbc2.addActionListener(this);
		jbc2.setActionCommand("b");
		jbc3 = new JButton("Month-End");
		jbc3.addActionListener(this);
		jbc3.setActionCommand("c");	
		jcb1 = new JButton("information");
		jcb1.addActionListener(this);
		jcb1.setActionCommand("cusa");
		jcb2 = new JButton("account");
		jcb2.addActionListener(this);
		jcb2.setActionCommand("cusb");
		jcb3 = new JButton("order");
		jcb3.addActionListener(this);
		jcb3.setActionCommand("cusc");
		jcb4 = new JButton("report");
		jcb4.addActionListener(this);
		jcb4.setActionCommand("cusd");
		jvb1 = new JButton("information");
		jvb1.addActionListener(this);
		jvb1.setActionCommand("vena");
		jvb2 = new JButton("part");
		jvb2.addActionListener(this);
		jvb2.setActionCommand("venb");
		jvb3 = new JButton("order");
		jvb3.addActionListener(this);
		jvb3.setActionCommand("venc");
		jvb4 = new JButton("report");
		jvb4.addActionListener(this);
		jvb4.setActionCommand("vend");
		jrb1 = new JButton("information");
		jrb1.addActionListener(this);
		jrb1.setActionCommand("salesa");
		jrb2 = new JButton("customer");
		jrb2.addActionListener(this);
		jrb2.setActionCommand("salesb");
		jrb3 = new JButton("account");
		jrb3.addActionListener(this);
		jrb3.setActionCommand("salesc");
		jrb4 = new JButton("report");
		jrb4.addActionListener(this);
		jrb4.setActionCommand("salesd");
		eJbs = new ArrayList<>();
		setEnterButton(eJbs);	
		rJbs = new ArrayList<JButton>();
		setReportButton(rJbs);
		xJbs = new ArrayList<>();
		xJbs.add(new JButton("end of month"));
		xJbs.get(0).addActionListener(this);
		xJbs.get(0).setActionCommand("setZero");
		backJb = new JButton("back");
		backJb.addActionListener(this);
		backJb.setActionCommand("back");
		backJb2 = new JButton("back");
		backJb2.addActionListener(this);
		backJb2.setActionCommand("back2");
		backJb3 = new JButton("back");
		backJb3.addActionListener(this);
		backJb3.setActionCommand("back3");
		cbackJb = new JButton("back");
		cbackJb.addActionListener(this);
		cbackJb.setActionCommand("cbackJb");
		vbackJb = new JButton("back");
		vbackJb.addActionListener(this);
		vbackJb.setActionCommand("vbackJb");
		rbackJb = new JButton("back");
		rbackJb.addActionListener(this);
		rbackJb.setActionCommand("rbackJb");
		jp1 = new JPanel();
		jp2 = new JPanel();
		tp1 = new TittlePanel();
		jl1 = new JLabel("user");
		jl2 = new JLabel("password");
		jtf1 = new JTextField(20);
		jpf1 = new JPasswordField(20);
		
		
		this.setLayout(null);
		jp1.setLayout(null);
		jp1.add(jl1); jl1.setBounds(330, 20, 120, 40);
		jp1.add(jtf1); jtf1.setBounds(520, 20, 120, 40);
		jp1.add(jl2); jl2.setBounds(330, 80, 120, 40);
		jp1.add(jpf1); jpf1.setBounds(520, 80, 120, 40);
		jp1.add(jbs.get(0)); jbs.get(0).setBounds(330, 140, 120, 40);
		jp1.add(jbs.get(1)); jbs.get(1).setBounds(520, 140, 120, 40);
		jp1.add(jcb);
		jcb.setBounds(100, 10, 200, 60);
		this.add(tp1);
		tp1.setBounds(0, 0, 1000, 400);
		this.add(jp1);
		jp1.setBounds(0, 400, 1000, 200);
		this.add(jp2);
		jp2.setBounds(0, 600, 1000, 200);

		this.setVisible(true);
	}
	public void setButton(ArrayList<JButton> jbs){
		jbs.add(new JButton("log in"));
		jbs.get(0).addActionListener(this);
		jbs.get(0).setActionCommand("login");
		jbs.add(new JButton("cancel"));
		jbs.get(1).addActionListener(this);
		jbs.get(1).setActionCommand("cancel");
		jbs.add(new JButton("sign out"));
		jbs.get(2).addActionListener(this);
		jbs.get(2).setActionCommand("signout");
	}
	public void setEnterButton(ArrayList<JButton> eJbs){
		eJbs.add(new JButton("Enter/edit territories")); //0
		eJbs.add(new JButton("Enter/edit sales reps"));
		eJbs.add(new JButton("Enter/edit customers"));
		eJbs.add(new JButton("Enter/edit parts"));
		eJbs.add(new JButton("Enter/edit vendors"));
		eJbs.add(new JButton("Enter/edit sales reps Account"));
		eJbs.add(new JButton("Enter/edit sales customer Account"));
		eJbs.add(new JButton("Enter/edit customer ship-to address"));
		eJbs.add(new JButton("Enter/edit vendor parts")); // 8
		eJbs.get(0).addActionListener(this);
		eJbs.get(0).setActionCommand("ea");
		eJbs.get(1).addActionListener(this);
		eJbs.get(1).setActionCommand("eb");
		eJbs.get(2).addActionListener(this);
		eJbs.get(2).setActionCommand("ec");
		eJbs.get(3).addActionListener(this);
		eJbs.get(3).setActionCommand("ed");
		eJbs.get(4).addActionListener(this);
		eJbs.get(4).setActionCommand("ee");
		eJbs.get(5).addActionListener(this);
		eJbs.get(5).setActionCommand("ef");
		eJbs.get(6).addActionListener(this);
		eJbs.get(6).setActionCommand("eg");
		eJbs.get(7).addActionListener(this);
		eJbs.get(7).setActionCommand("eh");
		eJbs.get(8).addActionListener(this);
		eJbs.get(8).setActionCommand("ei");
		
		
		
	}
	public void setReportButton(ArrayList<JButton> jbs){
		jbs.add(new JButton("Territory List")); //0
		jbs.add(new JButton("Customer master List"));
		jbs.add(new JButton("Open orders by customer"));
		jbs.add(new JButton("Open orders by item"));
		jbs.add(new JButton("Daily invoice register"));
		jbs.add(new JButton("Mothly invoice register"));
		jbs.add(new JButton("Stock status report"));	
		jbs.add(new JButton("Reorder point list"));
		jbs.add(new JButton("Vendor report"));
		jbs.add(new JButton("Daily cash receipts journal"));
		jbs.add(new JButton("Monthly cash receipts journal"));
		jbs.add(new JButton("Customer mailing labels"));
		jbs.add(new JButton("Statements"));
		jbs.add(new JButton("Monthly sales rep commission report"));
		jbs.add(new JButton("Aged trial balance")); //14
		jbs.get(0).addActionListener(this);
		jbs.get(0).setActionCommand("ra");
		jbs.get(1).addActionListener(this);
		jbs.get(1).setActionCommand("rb");
		jbs.get(2).addActionListener(this);
		jbs.get(2).setActionCommand("rc");
		jbs.get(3).addActionListener(this);
		jbs.get(3).setActionCommand("rd");
		jbs.get(4).addActionListener(this);
		jbs.get(4).setActionCommand("re");
		jbs.get(5).addActionListener(this);
		jbs.get(5).setActionCommand("rf");
		jbs.get(6).addActionListener(this);
		jbs.get(6).setActionCommand("rg");
		jbs.get(7).addActionListener(this);
		jbs.get(7).setActionCommand("rh");
		jbs.get(8).addActionListener(this);
		jbs.get(8).setActionCommand("ri");
		jbs.get(9).addActionListener(this);
		jbs.get(9).setActionCommand("rj");
		jbs.get(10).addActionListener(this);
		jbs.get(10).setActionCommand("rk");
		jbs.get(11).addActionListener(this);
		jbs.get(11).setActionCommand("rl");
		jbs.get(12).addActionListener(this);
		jbs.get(12).setActionCommand("rm");
		jbs.get(13).addActionListener(this);
		jbs.get(13).setActionCommand("rn");
		jbs.get(14).addActionListener(this);
		jbs.get(14).setActionCommand("ro");
		

	}
	
	
	//login , cancel, sign out
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("login")){
			login(e);
		}
		else if(e.getActionCommand().equals("cancel")){
			cancel(e);
		}
		else if(e.getActionCommand().equals("signout")){
			signout(e);
		}
		else if(e.getActionCommand().equals("back2")){
			back2(e);
		}
		else if(e.getActionCommand().equals("a") || e.getActionCommand().equals("b")||
				e.getActionCommand().equals("c")|| e.getActionCommand().equals("back")){
			cps.add(new ChoosePanel());
			cps.add(new ChoosePanel());
			cps.add(new ChoosePanel());
			if(e.getActionCommand().equals("a")){
				cps.set(0, new ChoosePanel(eJbs, backJb, 0));
				setJcb1(e);
				}
			else if(e.getActionCommand().equals("b")){
				cps.set(1, new ChoosePanel(rJbs, backJb, 1));
				setJcb2(e);
				}
			else if(e.getActionCommand().equals("c")){
				cps.set(2, new ChoosePanel(xJbs, backJb, 2));
				setJcb3(e);
				}
			else if(e.getActionCommand().equals("back")){
				backJb(e);
				}
			}
		else if(e.getActionCommand().equals("ea")){
			enterA(e);
		}
		else if(e.getActionCommand().equals("eb")){
			enterB(e);
		}
		else if(e.getActionCommand().equals("ec")){
			enterC(e);
		}
		else if(e.getActionCommand().equals("ed")){
			enterD(e);
		}
		else if(e.getActionCommand().equals("ee")){
			enterE(e);
		}
		else if(e.getActionCommand().equals("ef")){
			enterF(e);
		}
		else if(e.getActionCommand().equals("eg")){
			enterG(e);
		}
		else if(e.getActionCommand().equals("eh")){
			enterH(e);
		}
		else if(e.getActionCommand().equals("ei")){
			enterI(e);
		}
		else if(e.getActionCommand().equals("back3")){
			back3(e);
		} else if(e.getActionCommand().equals("cbackJb")){
			cbackJb(e);
		} else if(e.getActionCommand().equals("vbackJb")){
			vbackJb(e);
		} else if(e.getActionCommand().equals("rbackJb")){
			rbackJb(e);
		}
		else if(e.getActionCommand().equals("ra")){
			reportA(e);
		}
		else if(e.getActionCommand().equals("rb")){
			reportB(e);
		}
		else if(e.getActionCommand().equals("rc")){
			reportC(e);
		}	
		else if(e.getActionCommand().equals("rd")){
			reportD(e);
		}
		else if(e.getActionCommand().equals("re")){
			reportE(e);
		}
		else if(e.getActionCommand().equals("rf")){
			reportF(e);
		}
		else if(e.getActionCommand().equals("rg")){
			reportG(e);
		}
		else if(e.getActionCommand().equals("rh")){
			reportH(e);
		}
		else if(e.getActionCommand().equals("ri")){
			reportI(e);
		}
		else if(e.getActionCommand().equals("rj")){
			reportJ(e);
		}
		else if(e.getActionCommand().equals("rk")){
			reportK(e);
		}
		else if(e.getActionCommand().equals("rl")){
			reportL(e);
		}
		else if(e.getActionCommand().equals("rm")){
			reportM(e);
		}
		else if(e.getActionCommand().equals("rn")){
			reportN(e);
		}
		else if(e.getActionCommand().equals("ro")){
			reportO(e);	
		}
		else if(e.getActionCommand().equals("cusa")){
			cusa(e);
		} else if(e.getActionCommand().equals("cusb")){
			cusb(e);
		} else if(e.getActionCommand().equals("cusc")){
			cusc(e);
		} else if(e.getActionCommand().equals("cusd")){
			cusd(e);
		} else if(e.getActionCommand().equals("vena")){
			vena(e);
		} else if(e.getActionCommand().equals("venb")){
			venb(e);
		} else if(e.getActionCommand().equals("venc")){
			venc(e);
		} else if(e.getActionCommand().equals("vend")){
			vend(e);
		} else if(e.getActionCommand().equals("salesa")){
			salesa(e);
		} else if(e.getActionCommand().equals("salesb")){
			salesb(e);
		} else if(e.getActionCommand().equals("salesc")){
			salesc(e);
		} else if(e.getActionCommand().equals("salesd")){
			salesd(e);
		} else if (e.getActionCommand().equals("setZero")){
			setZero(e);
		}
		}
	public void backJb(ActionEvent e){
		this.remove(cps.get(cview));
		this.add(cp);
		this.repaint();
	}
	public void back2(ActionEvent e){
		this.removeAll();
		this.repaint();
		this.add(tp1);
		tp1.setBounds(0, 0, 1000, 400);
		this.add(jp2);
		jp2.setBounds(0, 600, 1000, 200);
		this.add(cps.get(cview));
		cps.get(cview).setBounds(0, 400, 1000, 200);
		
	}
	public void back3(ActionEvent e){
		this.removeAll();
		this.repaint();
		this.add(tp1);
		tp1.setBounds(0, 0, 1000, 400);
		this.add(jp2);
		jp2.setBounds(0, 600, 1000, 200);
		this.add(cps.get(cview));
		cps.get(cview).setBounds(0, 400, 1000, 200);
	}
	public void cbackJb(ActionEvent e){
		this.removeAll();
		this.repaint();
		this.add(tp1);
		tp1.setBounds(0, 0, 1000, 400);
		this.add(jp2);
		jp2.setBounds(0, 600, 1000, 200);
		this.add(cp);
		cp.setBounds(0, 400, 1000, 200);
	}
	public void vbackJb(ActionEvent e){
		this.removeAll();
		this.repaint();
		this.add(tp1);
		tp1.setBounds(0, 0, 1000, 400);
		this.add(jp2);
		jp2.setBounds(0, 600, 1000, 200);
		this.add(cp);
		cp.setBounds(0, 400, 1000, 200);
	}
	public void rbackJb(ActionEvent e){
		this.removeAll();
		this.repaint();
		this.add(tp1);
		tp1.setBounds(0, 0, 1000, 400);
		this.add(jp2);
		jp2.setBounds(0, 600, 1000, 200);
		this.add(cp);
		cp.setBounds(0, 400, 1000, 200);
	}
	public void login(ActionEvent e){
		jl3 = new JLabel("user does not exist !");
		jl4 = new JLabel("wrong password !");
		String userName = jtf1.getText();
		if(jcb.getSelectedItem().equals("admin")){ // admin login
		if(adminLogin.containsKey(userName)){
			char[] pass = jpf1.getPassword();
			String password = new String(pass);
			if (adminLogin.get(jtf1.getText()).equals(password)){
				jp2.removeAll();
				this.remove(jp1);
	
				cp = new ChoosePanel(jbc1, jbc2, jbc3);
				jl5 = new JLabel("welcome  "+ adminName.get(userName));
				jp2.add(jl5);
				jl5.setBounds(50, 50, 500, 100);
				jp2.add(jbs.get(2));
				jbs.get(2).setBounds(900, 90, 90, 90);
				this.add(cp);
				cp.setBounds(0, 400, 1000, 200);
				
			} else {
				
				jp2.removeAll();
				jp2.add(jl4);
				jl4.setBounds(50, 50, 500, 100);
				this.add(jp2);
				jpf1.setText("");
			}
		}
		else{
			
			jp2.removeAll();;
			jp2.add(jl3);
			jl3.setBounds(50, 50, 1000, 100);
			this.add(jp2);
			jpf1.setText("");
		}
		} 
		else if(jcb.getSelectedItem().equals("customer")){ // customer login
			if(customerLogin.containsKey(userName)){
				char[] pass = jpf1.getPassword();
				String password = new String(pass);
				if (customerLogin.get(jtf1.getText()).equals(password)){
					cusNo = Integer.valueOf(customerLogin.get(userName));
					jp2.removeAll();
					this.remove(jp1);
					
					cp = new ChoosePanel(jcb1, jcb2, jcb3, jcb4);
					jl5 = new JLabel("welcome  "+ customerName.get(userName));
					jp2.add(jl5);
					jl5.setBounds(50, 50, 500, 100);
					jp2.add(jbs.get(2));
					jbs.get(2).setBounds(900, 90, 90, 90);
					this.add(cp);
					cp.setBounds(0, 400, 1000, 200);
					
				} else {
					
					jp2.removeAll();
					jp2.add(jl4);
					jl4.setBounds(50, 50, 500, 100);
					this.add(jp2);
					jpf1.setText("");
				}
			}	else{
				
				jp2.removeAll();;
				jp2.add(jl3);
				jl3.setBounds(50, 50, 1000, 100);
				this.add(jp2);
				jpf1.setText("");
			}
		} else if(jcb.getSelectedItem().equals("vendor")){ // vendor login 
			if(vendorLogin.containsKey(userName)){
				char[] pass = jpf1.getPassword();
				String password = new String(pass);
				if (vendorLogin.get(jtf1.getText()).equals(password)){ //change
					venNo = Integer.valueOf(vendorLogin.get(userName));
					jp2.removeAll();
					this.remove(jp1);
					
					cp = new ChoosePanel(jvb1, jvb2, jvb3, jvb4);
					jl5 = new JLabel("welcome  "+ vendorName.get(userName));
					jp2.add(jl5);
					jl5.setBounds(50, 50, 500, 100);
					jp2.add(jbs.get(2));
					jbs.get(2).setBounds(900, 90, 90, 90);
					this.add(cp);
					cp.setBounds(0, 400, 1000, 200);
					
				} else {
					
					jp2.removeAll();
					jp2.add(jl4);
					jl4.setBounds(50, 50, 500, 100);
					this.add(jp2);
					jpf1.setText("");
				}
			}	else{
				
				jp2.removeAll();;
				jp2.add(jl3);
				jl3.setBounds(50, 50, 1000, 100);
				this.add(jp2);
				jpf1.setText("");
			}
		} else if(jcb.getSelectedItem().equals("salseRep")){ // sales rep login 
			if(salesLogin.containsKey(userName)){
				char[] pass = jpf1.getPassword();
				String password = new String(pass);
				if (salesLogin.get(jtf1.getText()).equals(password)){ 
					salesNo = Integer.valueOf(salesLogin.get(userName));
					jp2.removeAll();
					this.remove(jp1);
					
					cp = new ChoosePanel(jrb1, jrb2, jrb3, jrb4);
					jl5 = new JLabel("welcome  "+ salesName.get(userName));
					jp2.add(jl5);
					jl5.setBounds(50, 50, 500, 100);
					jp2.add(jbs.get(2));
					jbs.get(2).setBounds(900, 90, 90, 90);
					this.add(cp);
					cp.setBounds(0, 400, 1000, 200);
					
				} else {
					
					jp2.removeAll();
					jp2.add(jl4);
					jl4.setBounds(50, 50, 500, 100);
					this.add(jp2);
					jpf1.setText("");
				}
			}	else{
				
				jp2.removeAll();;
				jp2.add(jl3);
				jl3.setBounds(50, 50, 1000, 100);
				this.add(jp2);
				jpf1.setText("");
			}
		}

		this.repaint();
	}
	public void cancel(ActionEvent e){
		jp2.removeAll();
		jtf1.setText("");
		jpf1.setText("");
	}
	public void signout(ActionEvent e){
		this.removeAll();
		jtf1.setText("");
		jpf1.setText("");
		jp2.remove(jl5);
		jp2.remove(jbs.get(2));
		
		this.repaint();
		
		jp1.add(jl1); jl1.setBounds(330, 20, 120, 40);
		jp1.add(jtf1); jtf1.setBounds(520, 20, 120, 40);
		jp1.add(jl2); jl2.setBounds(330, 80, 120, 40);
		jp1.add(jpf1); jpf1.setBounds(520, 80, 120, 40);
		jp1.add(jbs.get(0)); jbs.get(0).setBounds(330, 140, 120, 40);
		jp1.add(jbs.get(1)); jbs.get(1).setBounds(520, 140, 120, 40);
		this.add(tp1);
		tp1.setBounds(0, 0, 1000, 400);
		this.add(jp1);
		jp1.setBounds(0, 400, 1000, 200);
		this.add(jp2);
		jp2.setBounds(0, 600, 1000, 200);
	}
	public void setJcb1(ActionEvent e){
		
		this.remove(cp);
		this.repaint();
		cview = 0;
		this.add(cps.get(cview));
		cps.get(cview).setBounds(0, 400, 1000, 200);
		
	}
	public void setJcb2(ActionEvent e){
		this.remove(cp);
		this.repaint();
		cview = 1;
		this.add(cps.get(cview));
		cps.get(cview).setBounds(0, 400, 1000, 200);
	}
	public void setJcb3(ActionEvent e){
		this.remove(cp);
		this.repaint();
		cview = 2;
		this.add(cps.get(cview));
		cps.get(cview).setBounds(0, 400, 1000, 200);
	}
	
	public void enterA(ActionEvent e){
		this.removeAll();
		tp2 = new TittlePanel2();
		jp3 = new JPanel();
		jp3.add(backJb2);
		backJb2.setBounds(950, 40, 40, 40);
		ep = new EnterPanel(1);
		
		this.add(tp2);
		tp2.setBounds(0, 0, 1000, 100);
		this.add(ep);
		ep.setBounds(0, 100, 1000, 600);
		this.add(jp3);
		jp3.setBounds(0, 700, 1000, 100);
	}
	public void enterB(ActionEvent e){
		this.removeAll();
		tp2 = new TittlePanel2();
		jp3 = new JPanel();
		jp3.add(backJb2);
		backJb2.setBounds(950, 40, 40, 40);
		ep = new EnterPanel(2);
		
		this.add(tp2);
		tp2.setBounds(0, 0, 1000, 100);
		this.add(ep);
		ep.setBounds(0, 100, 1000, 600);
		this.add(jp3);
		jp3.setBounds(0, 700, 1000, 100);
	}
	public void enterC(ActionEvent e){
		this.removeAll();
		tp2 = new TittlePanel2();
		jp3 = new JPanel();
		jp3.add(backJb2);
		backJb2.setBounds(950, 40, 40, 40);
		ep = new EnterPanel(3);
		
		this.add(tp2);
		tp2.setBounds(0, 0, 1000, 100);
		this.add(ep);
		ep.setBounds(0, 100, 1000, 600);
		this.add(jp3);
		jp3.setBounds(0, 700, 1000, 100);
	}
	public void enterD(ActionEvent e){
		this.removeAll();
		tp2 = new TittlePanel2();
		jp3 = new JPanel();
		jp3.add(backJb2);
		backJb2.setBounds(950, 40, 40, 40);
		ep = new EnterPanel(4);
		
		this.add(tp2);
		tp2.setBounds(0, 0, 1000, 100);
		this.add(ep);
		ep.setBounds(0, 100, 1000, 600);
		this.add(jp3);
		jp3.setBounds(0, 700, 1000, 100);
	}
	public void enterE(ActionEvent e){
		this.removeAll();
		tp2 = new TittlePanel2();
		jp3 = new JPanel();
		jp3.add(backJb2);
		backJb2.setBounds(950, 40, 40, 40);
		ep = new EnterPanel(5);
		
		this.add(tp2);
		tp2.setBounds(0, 0, 1000, 100);
		this.add(ep);
		ep.setBounds(0, 100, 1000, 600);
		this.add(jp3);
		jp3.setBounds(0, 700, 1000, 100);
	}
	public void enterF(ActionEvent e){
		this.removeAll();
		tp2 = new TittlePanel2();
		jp3 = new JPanel();
		jp3.add(backJb2);
		backJb2.setBounds(950, 40, 40, 40);
		ep = new EnterPanel(6);
		
		this.add(tp2);
		tp2.setBounds(0, 0, 1000, 100);
		this.add(ep);
		ep.setBounds(0, 100, 1000, 600);
		this.add(jp3);
		jp3.setBounds(0, 700, 1000, 100);
	}
	public void enterG(ActionEvent e){
		this.removeAll();
		tp2 = new TittlePanel2();
		jp3 = new JPanel();
		jp3.add(backJb2);
		backJb2.setBounds(950, 40, 40, 40);
		ep = new EnterPanel(7);
		
		this.add(tp2);
		tp2.setBounds(0, 0, 1000, 100);
		this.add(ep);
		ep.setBounds(0, 100, 1000, 600);
		this.add(jp3);
		jp3.setBounds(0, 700, 1000, 100);
	}
	public void enterH(ActionEvent e){
		this.removeAll();
		tp2 = new TittlePanel2();
		jp3 = new JPanel();
		jp3.add(backJb2);
		backJb2.setBounds(950, 40, 40, 40);
		ep = new EnterPanel(8);
		
		this.add(tp2);
		tp2.setBounds(0, 0, 1000, 100);
		this.add(ep);
		ep.setBounds(0, 100, 1000, 600);
		this.add(jp3);
		jp3.setBounds(0, 700, 1000, 100);
	}
	public void enterI(ActionEvent e){
		this.removeAll();
		tp2 = new TittlePanel2();
		jp3 = new JPanel();
		jp3.add(backJb2);
		backJb2.setBounds(950, 40, 40, 40);
		ep = new EnterPanel(9);
		
		this.add(tp2);
		tp2.setBounds(0, 0, 1000, 100);
		this.add(ep);
		ep.setBounds(0, 100, 1000, 600);
		this.add(jp3);
		jp3.setBounds(0, 700, 1000, 100);
	}

	public void reportA(ActionEvent e){
		this.removeAll();
		tp3 = new JPanel();
		jp4 = new JPanel();
		jp4.add(backJb3);
		backJb3.setBounds(950, 40, 40, 40);
		rp = new ReportPanel(1);
		
		this.add(tp3);
		tp3.setBounds(0, 0, 1000, 100);
		this.add(rp);
		rp.setBounds(0, 100, 1000, 600);
		this.add(jp4);
		jp4.setBounds(0, 700, 1000, 100);
	}
	public void reportB(ActionEvent e){
		this.removeAll();
		tp3 = new JPanel();
		jp4 = new JPanel();
		jp4.add(backJb3);
		backJb3.setBounds(950, 40, 40, 40);
		rp = new ReportPanel(2);
		
		this.add(tp3);
		tp3.setBounds(0, 0, 1000, 100);
		this.add(rp);
		rp.setBounds(0, 100, 1000, 600);
		this.add(jp4);
		jp4.setBounds(0, 700, 1000, 100);
	}
	public void reportC(ActionEvent e){
		this.removeAll();
		tp3 = new JPanel();
		jp4 = new JPanel();
		jp4.add(backJb3);
		backJb3.setBounds(950, 40, 40, 40);
		rp = new ReportPanel(3);
		
		this.add(tp3);
		tp3.setBounds(0, 0, 1000, 100);
		this.add(rp);
		rp.setBounds(0, 100, 1000, 600);
		this.add(jp4);
		jp4.setBounds(0, 700, 1000, 100);
	}
	public void reportD(ActionEvent e){
	
	}
	public void reportE(ActionEvent e){
	
	}
	public void reportF(ActionEvent e){
	
	}
	public void reportG(ActionEvent e){
		this.removeAll();
		tp3 = new JPanel();
		jp4 = new JPanel();
		jp4.add(backJb3);
		backJb3.setBounds(950, 40, 40, 40);
		rp = new ReportPanel(7);
		
		this.add(tp3);
		tp3.setBounds(0, 0, 1000, 100);
		this.add(rp);
		rp.setBounds(0, 100, 1000, 600);
		this.add(jp4);
		jp4.setBounds(0, 700, 1000, 100);
	}
	public void reportH(ActionEvent e){
	
	}
	public void reportI(ActionEvent e){
		this.removeAll();
		tp3 = new JPanel();
		jp4 = new JPanel();
		jp4.add(backJb3);
		backJb3.setBounds(950, 40, 40, 40);
		rp = new ReportPanel(9);
		
		this.add(tp3);
		tp3.setBounds(0, 0, 1000, 100);
		this.add(rp);
		rp.setBounds(0, 100, 1000, 600);
		this.add(jp4);
		jp4.setBounds(0, 700, 1000, 100);
	}
	public void reportJ(ActionEvent e){
	
	}
	public void reportK(ActionEvent e){
	
	}
	public void reportL(ActionEvent e){
	
	}
	public void reportM(ActionEvent e){
	
	}
	public void reportN(ActionEvent e){
		this.removeAll();
		tp3 = new JPanel();
		jp4 = new JPanel();
		jp4.add(backJb3);
		backJb3.setBounds(950, 40, 40, 40);
		rp = new ReportPanel(14);
		
		this.add(tp3);
		tp3.setBounds(0, 0, 1000, 100);
		this.add(rp);
		rp.setBounds(0, 100, 1000, 600);
		this.add(jp4);
		jp4.setBounds(0, 700, 1000, 100);
	}
	public void reportO(ActionEvent e){
	
	}
	public void cusa(ActionEvent e){ //ep11
		this.removeAll();
		tp2 = new TittlePanel2();
		jp3 = new JPanel();
		jp3.add(cbackJb);
		cbackJb.setBounds(950, 40, 40, 40);
		ep = new EnterPanel(11, cusNo);
		this.add(tp2);
		tp2.setBounds(0, 0, 1000, 100);
		this.add(ep);
		ep.setBounds(0, 100, 1000, 600);
		this.add(jp3);
		jp3.setBounds(0, 700, 1000, 100);
	}
	public void cusb(ActionEvent e){ // rp16
		this.removeAll();
		tp3 = new JPanel();
		jp4 = new JPanel();
		jp4.add(cbackJb);
		cbackJb.setBounds(950, 40, 40, 40);
		rp = new ReportPanel(16, cusNo); 
		this.add(tp3);
		tp3.setBounds(0, 0, 1000, 100);
		this.add(rp);
		rp.setBounds(0, 100, 1000, 600);
		this.add(jp4);
		jp4.setBounds(0, 700, 1000, 100);
	}
	public void cusc(ActionEvent e){ //customer order
		this.removeAll();
		tp2 = new TittlePanel2();
		jp3 = new JPanel();
		jp3.add(cbackJb);
		cbackJb.setBounds(950, 40, 40, 40);
		ep = new EnterPanel(12, cusNo);
		this.add(tp2);
		tp2.setBounds(0, 0, 1000, 100);
		this.add(ep);
		ep.setBounds(0, 100, 1000, 600);
		this.add(jp3);
		jp3.setBounds(0, 700, 1000, 100);
	}
	public void cusd(ActionEvent e){ //customer report
		this.removeAll();
		tp3 = new JPanel();
		jp4 = new JPanel();
		jp4.add(cbackJb);
		cbackJb.setBounds(950, 40, 40, 40);
		rp = new ReportPanel(17, cusNo); 
		this.add(tp3);
		tp3.setBounds(0, 0, 1000, 100);
		this.add(rp);
		rp.setBounds(0, 100, 1000, 600);
		this.add(jp4);
		jp4.setBounds(0, 700, 1000, 100);
	}
	public void vena(ActionEvent e){ //vendor edit information ep 13
		this.removeAll();
		tp2 = new TittlePanel2();
		jp3 = new JPanel();
		jp3.add(vbackJb);
		vbackJb.setBounds(950, 40, 40, 40);
		ep = new EnterPanel(13, venNo, true);
		this.add(tp2);
		tp2.setBounds(0, 0, 1000, 100);
		this.add(ep);
		ep.setBounds(0, 100, 1000, 600);
		this.add(jp3);
		jp3.setBounds(0, 700, 1000, 100);
	}
	public void venb(ActionEvent e){
		this.removeAll();
		tp2 = new TittlePanel2();
		jp3 = new JPanel();
		jp3.add(vbackJb);
		vbackJb.setBounds(950, 40, 40, 40);
		ep = new EnterPanel(14, venNo, true);
		this.add(tp2);
		tp2.setBounds(0, 0, 1000, 100);
		this.add(ep);
		ep.setBounds(0, 100, 1000, 600);
		this.add(jp3);
		jp3.setBounds(0, 700, 1000, 100);
	}
	public void venc(ActionEvent e){ // vendor order
		this.removeAll();
		tp2 = new TittlePanel2();
		jp3 = new JPanel();
		jp3.add(vbackJb);
		vbackJb.setBounds(950, 40, 40, 40);
		ep = new EnterPanel(15, venNo);
		this.add(tp2);
		tp2.setBounds(0, 0, 1000, 100);
		this.add(ep);
		ep.setBounds(0, 100, 1000, 600);
		this.add(jp3);
		jp3.setBounds(0, 700, 1000, 100);
	}
	public void vend(ActionEvent e){
		this.removeAll();
		tp3 = new JPanel();
		jp4 = new JPanel();
		jp4.add(vbackJb);
		vbackJb.setBounds(950, 40, 40, 40);
		rp = new ReportPanel(18, venNo); 
		this.add(tp3);
		tp3.setBounds(0, 0, 1000, 100);
		this.add(rp);
		rp.setBounds(0, 100, 1000, 600);
		this.add(jp4);
		jp4.setBounds(0, 700, 1000, 100);
	}
	public void salesa(ActionEvent e){ // sales edit information 
		this.removeAll();
		tp2 = new TittlePanel2();
		jp3 = new JPanel();
		jp3.add(rbackJb); // change
		rbackJb.setBounds(950, 40, 40, 40);
		ep = new EnterPanel(16, salesNo, true);
		this.add(tp2);
		tp2.setBounds(0, 0, 1000, 100);
		this.add(ep);
		ep.setBounds(0, 100, 1000, 600);
		this.add(jp3);
		jp3.setBounds(0, 700, 1000, 100);
	}
	public void salesb(ActionEvent e){
		this.removeAll();
		tp2 = new TittlePanel2();
		jp3 = new JPanel();
		jp3.add(rbackJb);
		rbackJb.setBounds(950, 40, 40, 40);
		ep = new EnterPanel(17, salesNo, true);
		this.add(tp2);
		tp2.setBounds(0, 0, 1000, 100);
		this.add(ep);
		ep.setBounds(0, 100, 1000, 600);
		this.add(jp3);
		jp3.setBounds(0, 700, 1000, 100);
	}
	public void salesc(ActionEvent e){
		this.removeAll();
		tp3 = new JPanel();
		jp4 = new JPanel();
		jp4.add(rbackJb);
		rbackJb.setBounds(950, 40, 40, 40);
		rp = new ReportPanel(19, salesNo); 
		this.add(tp3);
		tp3.setBounds(0, 0, 1000, 100);
		this.add(rp);
		rp.setBounds(0, 100, 1000, 600);
		this.add(jp4);
		jp4.setBounds(0, 700, 1000, 100);
	}
	public void salesd(ActionEvent e){
		this.removeAll();
		tp3 = new JPanel();
		jp4 = new JPanel();
		jp4.add(rbackJb);
		rbackJb.setBounds(950, 40, 40, 40);
		rp = new ReportPanel(20, salesNo); 
		this.add(tp3);
		tp3.setBounds(0, 0, 1000, 100);
		this.add(rp);
		rp.setBounds(0, 100, 1000, 600);
		this.add(jp4);
		jp4.setBounds(0, 700, 1000, 100);
	}
	public void setZero(ActionEvent e){
		this.removeAll();
	}
}	

	
class TittlePanel extends JPanel{
	public void paint(Graphics g){
		Calendar ca = Calendar.getInstance();
		String time = ca.getTime().toString();
		super.paint(g);
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, 1000, 400);
		g.setColor(Color.WHITE);
		Font myFont=new Font("TIMES NEW ROMAN", Font.BOLD, 100);
		g.setFont(myFont);
		g.drawString("Holt Distributors", 100,200);
		Font myFont2=new Font("TIMES NEW ROMAN", Font.BOLD, 20);
		g.setFont(myFont2);
		g.drawString(time, 700, 390);
	}
}
class TittlePanel2 extends JPanel{
	public void paint(Graphics g){
		Calendar ca = Calendar.getInstance();
		String time = ca.getTime().toString();
		super.paint(g);
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, 1000, 100);
		g.setColor(Color.WHITE);
		Font myFont=new Font("TIMES NEW ROMAN", Font.BOLD, 70);
		g.setFont(myFont);
		g.drawString("Holt Distributors",30,70);
		Font myFont2=new Font("TIMES NEW ROMAN", Font.BOLD, 20);
		g.setFont(myFont2);
		g.drawString(time, 700, 90);
	}
}
class TittlePanel3 extends JPanel{
	public void paint(Graphics g, String str){
		Calendar ca = Calendar.getInstance();
		String time = ca.getTime().toString();
		super.paint(g);
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, 1000, 100);
		g.setColor(Color.WHITE);
		Font myFont=new Font("TIMES NEW ROMAN", Font.BOLD, 70);
		g.setFont(myFont);
		g.drawString(str,30,70);
		Font myFont2=new Font("TIMES NEW ROMAN", Font.BOLD, 20);
		g.setFont(myFont2);
		g.drawString(time, 700, 90);
	}
}
class ChoosePanel extends JPanel{
	public void paint(Graphics g){
		super.paint(g);
	}
	public ChoosePanel(){
		
	}
	public ChoosePanel(JButton jbc1,JButton jbc2,JButton jbc3){
		
		this.add(jbc1);
		jbc1.setBounds(50, 10, 250, 180);
		this.add(jbc2);
		jbc2.setBounds(350, 10, 250, 180);
		this.add(jbc3);
		jbc3.setBounds(650, 10, 250, 180);
		this.setVisible(true);
	}
	public ChoosePanel(JButton jbc1,JButton jbc2,JButton jbc3, JButton jbc4){
		this.add(jbc1);
		jbc1.setBounds(20, 10, 200, 150);
		this.add(jbc2);
		jbc2.setBounds(270, 10, 200, 150);
		this.add(jbc3);
		jbc3.setBounds(520, 10, 200, 150);
		this.add(jbc4);
		jbc4.setBounds(770, 10, 200, 150);
		this.setVisible(true);
	}
	public ChoosePanel(JButton[] jbs, JButton bcakJb){ 
		int len = jbs.length;
		for (int i = 0; i < len; i++){
			jbs[i].setSize(100, 100);
			this.add(jbs[i]);
		}
		this.add(bcakJb);
		bcakJb.setBounds(900, 90, 90, 90);
	}

	public ChoosePanel(ArrayList<JButton> jbs, JButton backJb, int view){ // enter/edit panel
		
		for (int i = 0; i < jbs.size(); i++){
			this.add(jbs.get(i));
		}
		if(view == 0){
			int x =200; int y =40;
			jbs.get(0).setBounds(0, 0, x, y);
			jbs.get(1).setBounds(0, 50, x, y);
			jbs.get(2).setBounds(0, 100, x, y);
			jbs.get(3).setBounds(0, 150, x, y);
			jbs.get(4).setBounds(x, 0, x, y);
			jbs.get(5).setBounds(x, 50, x, y);
			jbs.get(6).setBounds(2 * x,0,x + 50,y);
			jbs.get(7).setBounds(2 * x, 50, x + 50, y);
			jbs.get(8).setBounds(x, 100, x, y);
			this.add(backJb);
			backJb.setBounds(900, 150, 50, 50);
			this.setVisible(true);
		}
		else if (view == 1){
			int x = 220; int y = 40;
			jbs.get(0).setBounds(0, 0, x, y);
			jbs.get(1).setBounds(0, 50, x, y);
			jbs.get(2).setBounds(0, 100, x, y);
			jbs.get(3).setBounds(x, 50, x, y);
			jbs.get(4).setBounds(x, 0, x, y);
			jbs.get(5).setBounds(0, 150, x, y);
			jbs.get(6).setBounds(x,100,x,y);
			jbs.get(7).setBounds(x, 150, x, y);
			jbs.get(8).setBounds(2 * x, 0, x, y);
			jbs.get(9).setBounds(2 * x, 50, x, y);
			jbs.get(10).setBounds(2 * x, 100, x, y);
			jbs.get(11).setBounds(2 * x, 150, x, y);
			jbs.get(12).setBounds(3 * x, 0, x, y);
			jbs.get(14).setBounds(3 * x, 50, x, y);
			jbs.get(13).setBounds(3 * x, 100, x + 50, y);
			this.add(backJb);
			backJb.setBounds(900, 150, 50, 50);
			this.setVisible(true);	
		}
		else if (view == 2){
			jbs.get(0).setBounds(0, 0, 200, 200);
			this.add(backJb);
			backJb.setBounds(900, 150, 50, 50);
			this.setVisible(true);	
		}
		
	}
}




// database control
class SqlOut {
	public SqlOut(String query, String[] str, ArrayList<String> result){
		try{
			Class.forName("com.mysql.jdbc.Driver");
	//		System.out.println("success loading mysql driver");
		}
		catch(Exception e){
			//System.out.println("error");
			e.printStackTrace();
		}
		try{
			Connection connect = DriverManager.getConnection(
			          "jdbc:mysql://localhost:3306/Holt Distributors?useSSL=false","root","19890429");
			//System.out.println("Success connect Mysql server!");
		      Statement stmt = connect.createStatement();
		      ResultSet rs = stmt.executeQuery(query);
		      
		      while (rs.next()) {
		    	 
		    	  for(int i = 0; i < str.length; i++){
			        result.add(rs.getString(str[i]));
		    	  }	    	
			   }
		}
	    catch (Exception e) {
	      //System.out.print("get data error!");
	      e.printStackTrace();
	    }
	  }
	}
class SqlIn {
	public SqlIn(String query){
		try{
			Class.forName("com.mysql.jdbc.Driver");
	//		System.out.println("success loading mysql driver");
		}
		catch(Exception e){
			//System.out.println("error");
			e.printStackTrace();
		}
		try{
			Connection connect = DriverManager.getConnection(
			          "jdbc:mysql://localhost:3306/Holt Distributors?useSSL=false","root","19890429");
			//System.out.println("Success connect Mysql server!");
		      Statement stmt = connect.createStatement();
		      stmt.executeUpdate(query);
		      
		}
	    catch (Exception e) {
	      //System.out.print("get data error!");
	      e.printStackTrace();
	    }
	  }
	}

