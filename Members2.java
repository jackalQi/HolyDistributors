package finalProject;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Members2 {

}
class EnterPanel extends JPanel implements ActionListener{
	int cusNo;
	int venNo;
	int salesNo;
	int x, y, h, w;
	int bx =700, by = 150, bw = 80, bh = 50;
	JButton[] jbs = null;
	JButton editButton = null; // vendor edit
	JButton rEdit;
	JLabel[] jls = null;
	JLabel[] jls1 = null;
	JPanel jp = null;
	JTable jt = null , jt1 = null;
	JScrollPane jsp = null;
	JScrollPane jsp1 = null;
	JTextField[] jtfs = null;
	ArrayList<JTextField> jtfs1 = null;
	ArrayList<JTextField> jtfs2 = null;
	Vector<String> rows = null;
	Vector<Vector<String>> cols = null;
	ArrayList<String> result = null;
	Vector<String> rows1 = null;
	Vector<Vector<String>> cols1 = null;
	ArrayList<String> result1 = null;
	public JButton[] setButtonName(JButton[] jbs){
		jbs[0] = new JButton("enter");
		jbs[0].addActionListener(this);
		jbs[0].setActionCommand("enter1");
		jbs[1] = new JButton("edit");
		jbs[1].addActionListener(this);
		jbs[1].setActionCommand("edit1");
		jbs[2] = new JButton("delete");
		jbs[2].addActionListener(this);
		jbs[2].setActionCommand("delete1");
		jbs[3] = new JButton("enter");
		jbs[3].addActionListener(this);
		jbs[3].setActionCommand("enter2");
		jbs[4] = new JButton("edit");
		jbs[4].addActionListener(this);
		jbs[4].setActionCommand("edit2");
		jbs[5] = new JButton("delete");
		jbs[5].addActionListener(this);
		jbs[5].setActionCommand("delete2");
		jbs[6] = new JButton("enter");
		jbs[6].addActionListener(this);
		jbs[6].setActionCommand("enter3");
		jbs[7] = new JButton("edit");
		jbs[7].addActionListener(this);
		jbs[7].setActionCommand("edit3");
		jbs[8] = new JButton("delete");
		jbs[8].addActionListener(this);
		jbs[8].setActionCommand("delete3");
		jbs[9] = new JButton("enter");
		jbs[9].addActionListener(this);
		jbs[9].setActionCommand("enter4");
		jbs[10] = new JButton("edit");
		jbs[10].addActionListener(this);
		jbs[10].setActionCommand("edit4");
		jbs[11] = new JButton("delete");
		jbs[11].addActionListener(this);
		jbs[11].setActionCommand("delete4");
		jbs[12] = new JButton("enter");
		jbs[12].addActionListener(this);
		jbs[12].setActionCommand("enter5");
		jbs[13] = new JButton("edit");
		jbs[13].addActionListener(this);
		jbs[13].setActionCommand("edit5");
		jbs[14] = new JButton("delete");
		jbs[14].addActionListener(this);
		jbs[14].setActionCommand("delete5");
		jbs[15] = new JButton("enter");
		jbs[15].addActionListener(this);
		jbs[15].setActionCommand("enter2a");
		jbs[16] = new JButton("edit");
		jbs[16].addActionListener(this);
		jbs[16].setActionCommand("edit2a");
		jbs[17] = new JButton("delete");
		jbs[17].addActionListener(this);
		jbs[17].setActionCommand("delete2a");
		jbs[18] = new JButton("enter");
		jbs[18].addActionListener(this);
		jbs[18].setActionCommand("enter3a");
		jbs[19] = new JButton("edit");
		jbs[19].addActionListener(this);
		jbs[19].setActionCommand("edit3a");
		jbs[20] = new JButton("delete");
		jbs[20].addActionListener(this);
		jbs[20].setActionCommand("delete3a");
		jbs[21] = new JButton("enter");
		jbs[21].addActionListener(this);
		jbs[21].setActionCommand("enter3b");
		jbs[22] = new JButton("edit");
		jbs[22].addActionListener(this);
		jbs[22].setActionCommand("edit3b");
		jbs[23] = new JButton("delete");
		jbs[23].addActionListener(this);
		jbs[23].setActionCommand("delete3b");
		jbs[24] = new JButton("enter");
		jbs[24].addActionListener(this);
		jbs[24].setActionCommand("enter5a");
		jbs[25] = new JButton("edit");
		jbs[25].addActionListener(this);
		jbs[25].setActionCommand("edit5a");
		jbs[26] = new JButton("delete");
		jbs[26].addActionListener(this);
		jbs[26].setActionCommand("delete5a");
		jbs[27] = new JButton("");
		jbs[28] = new JButton("");
		jbs[29] = new JButton("");
		jbs[30] = new JButton("");
		jbs[31] = new JButton("");
		jbs[32] = new JButton("");
		jbs[33] = new JButton("");
		jbs[34] = new JButton("");
		jbs[35] = new JButton("");
		jbs[36] = new JButton("");
		jbs[37] = new JButton("");
		jbs[38] = new JButton("");
		jbs[39] = new JButton("");
		jbs[40] = new JButton("");
		
		jbs[41] = new JButton("enter6");
		jbs[42] = new JButton("edit6");
		jbs[43] = new JButton("delete6");
		
		return jbs;
	}
	public void paint(Graphics g){
		super.paint(g);
	}
	// report panel
	public EnterPanel(int num){

		jp = new JPanel();
		jbs = new JButton[3];
		x = 10; y = 10; w =100; h =20;
		rows = new Vector<>();
		cols  = new Vector<Vector<String>>(); 
		result = new ArrayList<String>();
		jtfs =  new JTextField[60];
		if (num == 1){
			setPanel1();
		}else if( num == 2){
			setPanel2();
		}else if( num == 3){
			setPanel10();
		}else if( num == 4){
			setPanel4();
		}else if( num == 5){
			setPanel5();
		}else if( num == 6){
			setPanel6();
		}else if( num == 7){
			setPanel7();
		}else if( num == 8){
			setPanel8();
		}else if( num == 9){
			setPanel9();
		}else if(num == 13){
			setPanel13();
		}
		this.add(jp);
		jp.setBounds(0, 400, 1000, 200);
		this.add(jsp);
		jsp.setBounds(0, 0, 1000, 400);
		this.setVisible(true);
	}
	public EnterPanel(int num, int cusNo){ // customer
		
		jp = new JPanel();
		jbs = new JButton[3];
		x = 10; y = 10; w =100; h =20;
		rows = new Vector<>();
		cols  = new Vector<Vector<String>>();
		rows1 = new Vector<>();
		cols1  = new Vector<Vector<String>>(); 
		result = new ArrayList<String>();
		result1 = new ArrayList<String>();
		jtfs1 = new ArrayList<>();
		jtfs2 = new ArrayList<>();
		this.cusNo = cusNo;
		if (num == 11){  // customer 1 edit info
			editButton = new JButton("edit");
			editButton.addActionListener(this);
			editButton.setActionCommand("editButton");
			setPanel11();
		}else if (num == 12){ // customer places order
			setPanel12();
		}else if (num == 15){ // vendor ship order
			this.venNo = cusNo;
			setPanel15();
		}
		this.add(jp);
		jp.setBounds(0, 400, 1000, 200);
		this.add(jsp);
		jsp.setBounds(0, 0, 1000, 200);
		this.add(jsp1);
		jsp1.setBounds(0, 200, 1000, 200);
		this.setVisible(true);
	}
	public EnterPanel(int num, int venNo, boolean a){ // vendor constructor
		jp = new JPanel();
		jbs = new JButton[3];
		x = 10; y = 10; w =100; h =20;
		rows = new Vector<>();
		cols  = new Vector<Vector<String>>(); 
		result = new ArrayList<String>();
		jtfs1 = new ArrayList<>();
		
		if(num == 13){
			this.venNo = venNo;
			editButton = new JButton("edit");
			editButton.addActionListener(this);
			editButton.setActionCommand("editVendor");
			setPanel13();
		}else if(num == 14){
			this.venNo = venNo;
			setPanel14();
		} else if(num == 16){
			this.salesNo = venNo;
			rEdit = new JButton("edit");
			rEdit.addActionListener(this);
			rEdit.setActionCommand("rEdit");
			setPanel16();
		} else if (num == 17){
			this.salesNo = venNo;
			setPanel17();
		}
		this.add(jp);
		jp.setBounds(0, 400, 1000, 200);
		this.add(jsp);
		jsp.setBounds(0, 0, 1000, 400);
		this.setVisible(true);
	}
	
	
	public void setPanel1(){ 
		String[] str = {"territoryNo","territoryName"};
		int size = str.length;
		SqlOut so1 = new SqlOut("select * from Territory", str, result);
		insertCols(result, cols, 0 ,size, size);
		insortVector(rows, str);
		DefaultTableModel model = new DefaultTableModel(cols, rows);
 		jt = new JTable(model);
 		jt.getTableHeader().setPreferredSize(new Dimension(jt.getColumnModel().getTotalColumnWidth(), 30));
		jsp = new JScrollPane(jt);
		jls = new JLabel[size];
		setLabel(jls, str);
		jbs[0] = new JButton("enter");
		jbs[0].addActionListener(this);
		jbs[0].setActionCommand("enter1");
		jbs[1] = new JButton("edit");
		jbs[1].addActionListener(this);
		jbs[1].setActionCommand("edit1");
		jbs[2] = new JButton("delete");
		jbs[2].addActionListener(this);
		jbs[2].setActionCommand("delete1");
		setPanel(jp, jbs, jtfs, jls, 0, 2);
	}
	public void setPanel2(){
		String[] str = {"repNo","repName","repAddress", "repCity", "repState", "repZip", "territoryNo"};
		int size = str.length;
		SqlOut so1 = new SqlOut("select * from salesRep", str, result);
		insertCols(result, cols, 0 ,size, size);
		insortVector(rows, str);
		DefaultTableModel model = new DefaultTableModel(cols, rows);
 		jt = new JTable(model);
 		jt.getTableHeader().setPreferredSize(new Dimension(jt.getColumnModel().getTotalColumnWidth(), 30));
		jsp = new JScrollPane(jt);
		jls = new JLabel[size];
		setLabel(jls, str);
		jbs[0] = new JButton("enter");
		jbs[0].addActionListener(this);
		jbs[0].setActionCommand("enter2");
		jbs[1] = new JButton("edit");
		jbs[1].addActionListener(this);
		jbs[1].setActionCommand("edit2");
		jbs[2] = new JButton("delete");
		jbs[2].addActionListener(this);
		jbs[2].setActionCommand("delete2");
		setPanel(jp, jbs, jtfs, jls, 2, 9);
	}
	public void setPanel3(){
		String[] str = {"customerNo","customerLastName","customerFirstName", "customerAddresLine1", "customerAdressLine2",
				"customerCity", "customerState", "customerZip", "repNo"};
		int size = str.length;
		SqlOut so1 = new SqlOut("select * from customer", str, result);
		insertCols(result, cols, 0 ,size, size);
		insortVector(rows, str);
		DefaultTableModel model = new DefaultTableModel(cols, rows);
 		jt = new JTable(model);
 		jt.getTableHeader().setPreferredSize(new Dimension(jt.getColumnModel().getTotalColumnWidth(), 30));
		jsp = new JScrollPane(jt);
		jls = new JLabel[size];
		setLabel(jls, str);
		jbs[0] = new JButton("enter");
		jbs[0].addActionListener(this);
		jbs[0].setActionCommand("enter3");
		jbs[1] = new JButton("edit");
		jbs[1].addActionListener(this);
		jbs[1].setActionCommand("edit3");
		jbs[2] = new JButton("delete");
		jbs[2].addActionListener(this);
		jbs[2].setActionCommand("delete3");
		setPanel(jp, jbs, jtfs, jls, 9, 15);
	}
	public void setPanel4(){
		String[] str = {"partNo","partDescription","partPrice"};
		int size = str.length;
		SqlOut so1 = new SqlOut("select * from part", str, result);
		insertCols(result, cols, 0 ,size, size);
		insortVector(rows, str);
		DefaultTableModel model = new DefaultTableModel(cols, rows);
 		jt = new JTable(model);
 		jt.getTableHeader().setPreferredSize(new Dimension(jt.getColumnModel().getTotalColumnWidth(), 30));
		jsp = new JScrollPane(jt);
		jls = new JLabel[size];
		setLabel(jls, str);
		jbs[0] = new JButton("enter");
		jbs[0].addActionListener(this);
		jbs[0].setActionCommand("enter4");
		jbs[1] = new JButton("edit");
		jbs[1].addActionListener(this);
		jbs[1].setActionCommand("edit4");
		jbs[2] = new JButton("delete");
		jbs[2].addActionListener(this);
		jbs[2].setActionCommand("delete4");
		setPanel(jp, jbs, jtfs, jls, 15, 18);
	}
	public void setPanel5(){
		String[] str = {"venderNo","venderName","venderAddress", "venderCity", "venderState", "venderZip"};
		int size = str.length;
		SqlOut so1 = new SqlOut("select * from vender", str, result);
		insertCols(result, cols, 0 ,size, size);
		insortVector(rows, str);
		DefaultTableModel model = new DefaultTableModel(cols, rows);
 		jt = new JTable(model);
 		jt.getTableHeader().setPreferredSize(new Dimension(jt.getColumnModel().getTotalColumnWidth(), 30));
		jsp = new JScrollPane(jt);
		jls = new JLabel[size];
		setLabel(jls, str);
		jbs[0] = new JButton("enter");
		jbs[0].addActionListener(this);
		jbs[0].setActionCommand("enter5");
		jbs[1] = new JButton("edit");
		jbs[1].addActionListener(this);
		jbs[1].setActionCommand("edit5");
		jbs[2] = new JButton("delete");
		jbs[2].addActionListener(this);
		jbs[2].setActionCommand("delete5");
		setPanel(jp, jbs, jtfs, jls, 18, 24);
	}
	public void setPanel6(){
		String[] str = {"repNo","MTDsales","YTDsales", "MTDcommission", "YTDcommission", "commissionRate"};
		int size = str.length;
		SqlOut so1 = new SqlOut("select * from salesRepAccount", str, result);
		insertCols(result, cols, 0 ,size, size);
		insortVector(rows, str);
		DefaultTableModel model = new DefaultTableModel(cols, rows);
 		jt = new JTable(model);
 		jt.getTableHeader().setPreferredSize(new Dimension(jt.getColumnModel().getTotalColumnWidth(), 30));
		jsp = new JScrollPane(jt);
		jls = new JLabel[size];
		setLabel(jls, str);
		jbs[0] = new JButton("enter");
		jbs[0].addActionListener(this);
		jbs[0].setActionCommand("enter6");
		jbs[1] = new JButton("edit");
		jbs[1].addActionListener(this);
		jbs[1].setActionCommand("edit6");
		jbs[2] = new JButton("delete");
		jbs[2].addActionListener(this);
		jbs[2].setActionCommand("delete6");
		setPanel(jp, jbs, jtfs, jls, 24, 30);
	}	
	public void setPanel7(){
		String[] str = {"customerNo","MTDsales","YTDsales", "currentBalance", "creditLimit"};
		int size = str.length;
		SqlOut so1 = new SqlOut("select * from customerAccount", str, result);
		insertCols(result, cols, 0 ,size, size);
		insortVector(rows, str);
		DefaultTableModel model = new DefaultTableModel(cols, rows);
 		jt = new JTable(model);
 		jt.getTableHeader().setPreferredSize(new Dimension(jt.getColumnModel().getTotalColumnWidth(), 30));
		jsp = new JScrollPane(jt);
		jls = new JLabel[size];
		setLabel(jls, str);
		jbs[0] = new JButton("enter");
		jbs[0].addActionListener(this);
		jbs[0].setActionCommand("enter7");
		jbs[1] = new JButton("edit");
		jbs[1].addActionListener(this);
		jbs[1].setActionCommand("edit7");
		jbs[2] = new JButton("delete");
		jbs[2].addActionListener(this);
		jbs[2].setActionCommand("delete7");
		setPanel(jp, jbs, jtfs, jls, 30, 35);
	}
	public void setPanel8(){
		String[] str = {"customerNo","FirstName","LastName","Address", "CITY", "STATE", "ZIP"};
		int size = str.length;
		SqlOut so1 = new SqlOut("select * from Customer_ship_to", str, result);
		insertCols(result, cols, 0 ,size, size);
		insortVector(rows, str);
		DefaultTableModel model = new DefaultTableModel(cols, rows);
 		jt = new JTable(model);
 		jt.getTableHeader().setPreferredSize(new Dimension(jt.getColumnModel().getTotalColumnWidth(), 30));
		jsp = new JScrollPane(jt);
		jls = new JLabel[size];
		setLabel(jls, str);
		jbs[0] = new JButton("enter");
		jbs[0].addActionListener(this);
		jbs[0].setActionCommand("enter8");
		jbs[1] = new JButton("edit");
		jbs[1].addActionListener(this);
		jbs[1].setActionCommand("edit8");
		jbs[2] = new JButton("delete");
		jbs[2].addActionListener(this);
		jbs[2].setActionCommand("delete8");
		setPanel(jp, jbs, jtfs, jls, 35, 42);
	}
	public void setPanel9(){
		String[] str = {"vendorNo","partNo","priceForPart", "minimalOrder", "leadTime"};
		int size = str.length;
		SqlOut so1 = new SqlOut("select * from vendorPart", str, result);
		insertCols(result, cols, 0 ,size, size);
		insortVector(rows, str);
		DefaultTableModel model = new DefaultTableModel(cols, rows);
 		jt = new JTable(model);
 		jt.getTableHeader().setPreferredSize(new Dimension(jt.getColumnModel().getTotalColumnWidth(), 30));
		jsp = new JScrollPane(jt);
		jls = new JLabel[size];
		setLabel(jls, str);
		jbs[0] = new JButton("enter");
		jbs[0].addActionListener(this);
		jbs[0].setActionCommand("enter9");
		jbs[1] = new JButton("edit");
		jbs[1].addActionListener(this);
		jbs[1].setActionCommand("edit9");
		jbs[2] = new JButton("delete");
		jbs[2].addActionListener(this);
		jbs[2].setActionCommand("delete9");
		setPanel(jp, jbs, jtfs, jls, 42, 47);
	}
	public void setPanel10(){
		String[] str = {"customerNo","customerLastName","customerFirstName", "customerAddresLine1", "customerAdressLine2",
				"customerCity", "customerState", "customerZip", "repNo"};
		int size = str.length;
		SqlOut so1 = new SqlOut("select * from customer", str, result);
		insertCols(result, cols, 0 ,size, size);
		insortVector(rows, str);
		DefaultTableModel model = new DefaultTableModel(cols, rows);
 		jt = new JTable(model);
 		jt.getTableHeader().setPreferredSize(new Dimension(jt.getColumnModel().getTotalColumnWidth(), 30));
		jsp = new JScrollPane(jt);
		jls = new JLabel[size];
		setLabel(jls, str);
		jbs[0] = new JButton("enter");
		jbs[0].addActionListener(this);
		jbs[0].setActionCommand("enter3");
		jbs[1] = new JButton("edit");
		jbs[1].addActionListener(this);
		jbs[1].setActionCommand("edit3");
		jbs[2] = new JButton("delete");
		jbs[2].addActionListener(this);
		jbs[2].setActionCommand("delete3");
		setPanel(jp, jbs, jtfs, jls, 47, 56);
	}
	public void setPanel11(){ // customer edit
		String[] str = {"customerNo","customerLastName","customerFirstName", "customerAddresLine1", "customerAdressLine2",
				"customerCity", "customerState", "customerZip", "repNo"};
		String[] strLable1 = {"customerLastName","customerFirstName", "customerAddresLine1", "customerAdressLine2",
				"customerCity", "customerState", "customerZip"};
		int size = str.length;
		SqlOut so1 = new SqlOut("select * from customer where customerNo = "+ cusNo +"; ", str, result);
		insertCols(result, cols, 0 ,size, size);
		insortVector(rows, str);
		DefaultTableModel model = new DefaultTableModel(cols, rows);
 		jt = new JTable(model);
 		jt.getTableHeader().setPreferredSize(new Dimension(jt.getColumnModel().getTotalColumnWidth(), 30));
 		jsp = new JScrollPane(jt);
 		
 		String[] str1 = {"FirstName","LastName", "Address", "CITY",
				"STATE", "ZIP"};
		int size1 = str1.length;
		SqlOut so2 = new SqlOut("select FirstName, LastName, Address , CITY, STATE, ZIP "
				+ "from Customer_ship_to where customerNo = "+ cusNo+";", str1, result1);
		insertCols(result1, cols1, 0 ,size1, size1);
		insortVector(rows1, str1);
		DefaultTableModel model1 = new DefaultTableModel(cols1, rows1);
 		jt1 = new JTable(model1);
 		jt1.getTableHeader().setPreferredSize(new Dimension(jt1.getColumnModel().getTotalColumnWidth(), 30));
		jsp1 = new JScrollPane(jt1);
		
		jls = new JLabel[strLable1.length]; 
		setLabel(jls, strLable1); 
		jls1 = new JLabel[size1];
		setLabel(jls1, str1);
		setCustomerPanel(jp, editButton,jtfs1, jtfs2, jls, jls1);
	}
	public void setPanel12(){ // customer order
		String[] str = {"partNo","partDescription","partPrice"};
		String[] strLable1 = {"partNo","unit","partNo","total"};
		int size = str.length;
		SqlOut so1 = new SqlOut("select * from part", str, result);
		insertCols(result, cols, 0 ,size, size);
		insortVector(rows, str);
		DefaultTableModel model = new DefaultTableModel(cols, rows);
 		jt = new JTable(model);
 		jt.getTableHeader().setPreferredSize(new Dimension(jt.getColumnModel().getTotalColumnWidth(), 30));
 		jsp = new JScrollPane(jt);
 		
 		String[] str1 = {"partNo","partDescription", "partPrice", "unit","total"};
		int size1 = str1.length;
		SqlOut so2 = new SqlOut("select partNo,partDescription,partPrice,unit,total from partOrder where customerNo = "+ cusNo +"", str1, result1);
		insertCols(result1, cols1, 0 ,size1, size1);
		insortVector(rows1, str1);
		DefaultTableModel model1 = new DefaultTableModel(cols1, rows1);
 		jt1 = new JTable(model1);
 		jt1.getTableHeader().setPreferredSize(new Dimension(jt1.getColumnModel().getTotalColumnWidth(), 30));
		jsp1 = new JScrollPane(jt1);
		
		jbs[0] = new JButton("purches");
		jbs[0].addActionListener(this);
		jbs[0].setActionCommand("purches");
		jbs[1] = new JButton("delete");
		jbs[1].addActionListener(this);
		jbs[1].setActionCommand("delete");
		jbs[2] = new JButton("done");
		jbs[2].addActionListener(this);
		jbs[2].setActionCommand("done");
		jls = new JLabel[strLable1.length];  
		setLabel(jls, strLable1); 
		setOrderEnterPanel(jp, jbs, jls, jtfs1);
	}
	public void setPanel13(){ // vendor edit
		String[] str = {"venderNo","venderName","venderAddress", "venderCity", "venderState", "venderZip"};
		String[] strLable = {"venderName","venderAddress", "venderCity", "venderState",
				"venderZip"};
		int size = str.length;
		SqlOut so1 = new SqlOut("select * from vender where venderNo = "+ venNo +"; ", str, result);
		insertCols(result, cols, 0 ,size, size);
		insortVector(rows, str);
		DefaultTableModel model = new DefaultTableModel(cols, rows);
 		jt = new JTable(model);
 		jt.getTableHeader().setPreferredSize(new Dimension(jt.getColumnModel().getTotalColumnWidth(), 30));
		jsp = new JScrollPane(jt);
		jls = new JLabel[strLable.length];
		setLabel(jls, strLable);
		setVendorEditePanel(jp, editButton, jls, jtfs1);
		
	}
	public void setPanel14(){ // vendor parts enter, edit and delete // *******
		String[] str = {"partNo","partDescription","partPrice", "unit"};
		int size = str.length;
		SqlOut so1 = new SqlOut("select * from part where venderNo = "+ venNo +"", str, result);
		insertCols(result, cols, 0 ,size, size);
		insortVector(rows, str);
		DefaultTableModel model = new DefaultTableModel(cols, rows);
 		jt = new JTable(model);
 		jt.getTableHeader().setPreferredSize(new Dimension(jt.getColumnModel().getTotalColumnWidth(), 30));
		jsp = new JScrollPane(jt);
		jls = new JLabel[size];
		setLabel(jls, str);
		jbs[0] = new JButton("enter");
		jbs[0].addActionListener(this);
		jbs[0].setActionCommand("venter");
		jbs[1] = new JButton("edit");
		jbs[1].addActionListener(this);
		jbs[1].setActionCommand("vedit");
		jbs[2] = new JButton("delete");
		jbs[2].addActionListener(this);
		jbs[2].setActionCommand("vdelete");
		setVendorPartPanel(jp, jbs, jtfs1, jls);
	}
	public void setPanel15(){ // vendor order
		String[] str = {"partNo","partDescription","partPrice","unit"};
		String[] strLable1 = {"partNo","unit","orderNo","orderNo"};
		int size = str.length;
		SqlOut so1 = new SqlOut("select * from part where venderNo = "+ venNo +"", str, result);
		insertCols(result, cols, 0 ,size, size);
		insortVector(rows, str);
		DefaultTableModel model = new DefaultTableModel(cols, rows);
 		jt = new JTable(model);
 		jt.getTableHeader().setPreferredSize(new Dimension(jt.getColumnModel().getTotalColumnWidth(), 30));
 		jsp = new JScrollPane(jt);
 		
 		String[] str1 = {"orderNo","customerNo", "partNo", "partDescription","unit","partPrice","total"};
		int size1 = str1.length;// change select * from order where venNo 
		// need change
		SqlOut so2 = new SqlOut("select orderNo,customerNo, `partOrderVendor`.partNo, partDescription,unit, partPrice, total from `partOrderVendor` left join vendorPart on "
				+ "vendorPart.partNo = `partOrderVendor`.partNo where vendorPart.vendorNo = "+ venNo +";", str1, result1);
		insertCols(result1, cols1, 0 ,size1, size1);
		insortVector(rows1, str1);
		DefaultTableModel model1 = new DefaultTableModel(cols1, rows1);
 		jt1 = new JTable(model1);
 		jt1.getTableHeader().setPreferredSize(new Dimension(jt1.getColumnModel().getTotalColumnWidth(), 30));
		jsp1 = new JScrollPane(jt1);
		
		jbs[0] = new JButton("reorder");
		jbs[0].addActionListener(this);
		jbs[0].setActionCommand("reorder");
		jbs[1] = new JButton("ship");
		jbs[1].addActionListener(this);
		jbs[1].setActionCommand("ship");
		jbs[2] = new JButton("cancel");
		jbs[2].addActionListener(this);
		jbs[2].setActionCommand("cancel");
		jls = new JLabel[strLable1.length];  
		setLabel(jls, strLable1); 
		setOrderEnterPanel(jp, jbs, jls, jtfs1);
	}
	public void setPanel16(){
		String[] str = {"repNo","repName","repAddress", "repCity", "repState", "repZip","territoryNo"};
		String[] strLable = {"repName","repAddress", "repCity", "repState",
				"repZip"};
		int size = str.length;
		SqlOut so1 = new SqlOut("select * from salesRep where repNo = "+ salesNo +"; ", str, result);
		insertCols(result, cols, 0 ,size, size);
		insortVector(rows, str);
		DefaultTableModel model = new DefaultTableModel(cols, rows);
 		jt = new JTable(model);
 		jt.getTableHeader().setPreferredSize(new Dimension(jt.getColumnModel().getTotalColumnWidth(), 30));
		jsp = new JScrollPane(jt);
		jls = new JLabel[strLable.length];
		setLabel(jls, strLable);
		setVendorEditePanel(jp, rEdit, jls, jtfs1);
	}
	public void setPanel17(){
		String[] str = {"customerNo","customerLastName","customerFirstName"};
		int size = str.length;
		SqlOut so1 = new SqlOut("select * from customer where repNo = "+ salesNo +"", str, result);
		insertCols(result, cols, 0 ,size, size);
		insortVector(rows, str);
		DefaultTableModel model = new DefaultTableModel(cols, rows);
 		jt = new JTable(model);
 		jt.getTableHeader().setPreferredSize(new Dimension(jt.getColumnModel().getTotalColumnWidth(), 30));
		jsp = new JScrollPane(jt);
		jls = new JLabel[size];
		setLabel(jls, str);
		jbs[0] = new JButton("enter");
		jbs[0].addActionListener(this);
		jbs[0].setActionCommand("Renter");
		jbs[1] = new JButton("edit");
		jbs[1].addActionListener(this);
		jbs[1].setActionCommand("Redit");
		jbs[2] = new JButton("delete");
		jbs[2].addActionListener(this);
		jbs[2].setActionCommand("Rdelete");
		setVendorPartPanel(jp, jbs, jtfs1, jls);
	}
	
	
	public boolean isInteger(String str) {    
	    Pattern pattern = Pattern.compile("^[-\\+]?[\\d]*$");    
	    return pattern.matcher(str).matches();    
	  }  
	public boolean isDouble(String str) {    
	    Pattern pattern = Pattern.compile("^[-\\+]?[.\\d]*$");    
	    return pattern.matcher(str).matches();    
	  }  
	
	

	public void insortVector(Vector<String> rows, String[] str){
		int len = str.length;
		for (int i = 0; i < len; i++){
			rows.add(str[i]);
		}
	}
	public void insertCols(ArrayList<String> result, Vector<Vector<String>> cols, int start, int n, int size){
		if (start > result.size() - 1){
			return;
		}
		Vector<String> list = new Vector<String>();
		int i;
		for (i = start; i < n ; i ++){
			list.add(result.get(i));
		}
		cols.add(list);
		
		insertCols(result, cols, i, n + size, size);
	}
	public void setLabel(JLabel[] jls, String[] str){
		int n = str.length;
		for (int i = 0; i < n; i++){
			jls[i] = new JLabel(str[i]);
		}
	}
	public void setPanel(JPanel jp, JButton[] jbs, JTextField[] jtfs, JLabel[] jls, int start, int end){
		int n = jls.length;
		int a = 0;
		for (int i = 0; i < jbs.length; i++){
			jp.add(jbs[i]);
			jbs[i].setBounds(bx + (i * 100), by, bw, bh);
		}
		for (int i = start; i < end; i++){
			jtfs[i] = new JTextField(10);
		}
		for (int i = 0; i <  jls.length; i++){
			if( i < 5){
			jp.add(jls[i]);
			jls[i].setBounds(x, y + (i * 30), w, h);
			jp.add(jtfs[start]);
			jtfs[start].setBounds(x + 110, y + (i * 30), w, h);
			start++;
			} else if( i >= 5){
					jp.add(jls[i]);
					jls[i].setBounds(x + 300, y + (a * 30), w, h);
					jp.add(jtfs[start]);
					jtfs[start].setBounds(x + 410, y + (a * 30), w, h);
					a++;
					start++;
			}
		}
	}
	public void setVendorPartPanel(JPanel jp, JButton[] jbs, ArrayList<JTextField> jtfs, JLabel[] jls){
		int n = jls.length;
		for (int i = 0; i < jbs.length; i++){
			jp.add(jbs[i]);
			jbs[i].setBounds(bx + (i * 100), by, bw, bh);
		}
		for (int i = 0; i < n; i++){
			jtfs.add(new JTextField(10));
			jp.add(jls[i]);
			jls[i].setBounds(x, y + (i * 23), w, h);
			jp.add(jtfs.get(i));
			jtfs.get(i).setBounds(x + 110, y + (i * 23), w, h);
		}
	}
	
	// most enter panel
	public EnterPanel(JButton[] jbs, int jbStart, JLabel[] jls, JTextField[] jtfs, int first, int last, int rows){
		this.setLayout(new GridLayout(rows, 4));
		for (int i = first; i < last; i++){
			this.add(jls[i]);
			this.add(jtfs[i]);
		}
		this.add(new Label());
		for (int i = (((last - first)*2) % 4);i != 0 && i < 4; i++){
			this.add(new Label());
		}
		this.add(jbs[jbStart]);
		this.add(jbs[jbStart + 1]);
		this.add(jbs[jbStart + 2]);
	}
	// a
	public void setEnterPanel(JButton[] jbs, int jbFirst, int jbLast,
					  JLabel[] jls, int jlFirst, int jlLast,
					  JTextField[] jtfs, int jtfFirst, int jtfLast,
					  int rows, int cols){
		this.setLayout(new GridLayout(rows, cols));
		int n = jtfFirst;
		for(int i = jlFirst ; i <= jlLast; i++){
			this.add(jls[i]);
			for(int j = 3; j > 0 ; j--){
				this.add(jtfs[n]);
				n++;
			}
		}
		this.add(new Label());
		for (int i = jbFirst; i <= jbLast; i++){
			this.add(jbs[i]);
		}
	}
	public void setCustomerPanel(JPanel jp, JButton editButton, ArrayList<JTextField> jtfs1, ArrayList<JTextField> jtfs2, JLabel[] jls, JLabel[] jls1){
		int n = jls.length;
		for (int i = 0; i < n; i++){
			jtfs1.add(new JTextField(10));
			jp.add(jls[i]);
			jls[i].setBounds(x, y + (i * 23), w, h);
			jp.add(jtfs1.get(i));
			jtfs1.get(i).setBounds(x + 110, y + (i * 23), w, h);
		}
		int m = jls1.length;
		for (int i = 0; i < m; i++){
			jtfs2.add(new JTextField(10));
			jp.add(jls1[i]);
			jls1[i].setBounds(x + 230, y + (i * 23), w, h);
			jp.add(jtfs2.get(i));
			jtfs2.get(i).setBounds(x + 110 + 230, y + (i * 23), w, h);
		}
		jp.add(editButton);
		editButton.setBounds(bx + 200, by , bw, bh);
		
	}
	public void setVendorEditePanel(JPanel jp, JButton editButton, JLabel[] jls, ArrayList<JTextField> jtfs){
		int n = jls.length;
		for (int i = 0; i < n; i++){
			jtfs1.add(new JTextField(10));
			jp.add(jls[i]);
			jls[i].setBounds(x, y + (i * 23), w, h);
			jp.add(jtfs1.get(i));
			jtfs1.get(i).setBounds(x + 110, y + (i * 23), w, h);
		}
		jp.add(editButton);
		editButton.setBounds(bx + 200, by , bw, bh);
	}
	public void setOrderEnterPanel(JPanel jp, JButton[] jbs, JLabel[] jls, ArrayList<JTextField> jtfs){
		int n = jls.length;
		int a = 50, b = 120;
		int w = 100; int h = 40;
		jp.add(jbs[0]);
		jbs[0].setBounds(a, b, bw, bh);
		jp.add(jbs[1]);
		jbs[1].setBounds(a + 300, b, bw, bh);
		jp.add(jbs[2]);
		jbs[2].setBounds(a + 600, b, bw, bh);
		for (int i = 0; i < n; i++){
			jtfs1.add(new JTextField(10));
			if (i < 2){
				jp.add(jls[i]);
				jls[i].setBounds(50 , 20 + i * 40, w, h);
				jp.add(jtfs.get(i));
				jtfs.get(i).setBounds(170, 20 + i * 40, w, h);
			} else if(i < 3){
				jp.add(jls[i]);
				jls[i].setBounds(350, 20 , w, h);
				jp.add(jtfs.get(i));
				jtfs.get(i).setBounds(470, 20 , w, h);
			} else{
				jp.add(jls[i]);
				jls[i].setBounds(650, 20 , w, h);
				jp.add(jtfs.get(i));
				jtfs.get(i).setBounds(770, 20 , w, h);
			}
		}
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
			// item1
			if (e.getActionCommand().equals("enter1") || e.getActionCommand().equals("edit1") || e.getActionCommand().equals("delete1")){
					enter1(e);
			}//item 2
			else if(e.getActionCommand().equals("enter2") || e.getActionCommand().equals("edit2") || e.getActionCommand().equals("delete2")){
				enter2(e);
			}// item 3
			else if(e.getActionCommand().equals("enter3") || e.getActionCommand().equals("edit3") || e.getActionCommand().equals("delete3")){
				enter10(e);
			}// item 4
			else if(e.getActionCommand().equals("enter4") || e.getActionCommand().equals("edit4") || e.getActionCommand().equals("delete4")){
				enter4(e);
			}// item 5
			else if(e.getActionCommand().equals("enter5") || e.getActionCommand().equals("edit5") || e.getActionCommand().equals("delete5")){
				enter5(e);
			}// item 6
			else if(e.getActionCommand().equals("enter6") ||e.getActionCommand().equals("edit6") || e.getActionCommand().equals("delete6")){
				enter6(e);
			}// item 7
			else if(e.getActionCommand().equals("enter7") || e.getActionCommand().equals("edit7") || e.getActionCommand().equals("delete7")){
				enter7(e);
			}// item 8
			else if(e.getActionCommand().equals("enter8") ||e.getActionCommand().equals("edit8") || e.getActionCommand().equals("delete8")){
				enter8(e);
			}// item 9
			else if(e.getActionCommand().equals("enter9") ||e.getActionCommand().equals("edit9") || e.getActionCommand().equals("delete9")){
				enter9(e);
			} else if (e.getActionCommand().equals("editButton")){
				editButton(e);
			} else if (e.getActionCommand().equals("purches")){
				purchesButton(e);
			} else if (e.getActionCommand().equals("delete")){
				deleteButton(e);
			} else if (e.getActionCommand().equals("done")){
				doneButton(e);
			} else if (e.getActionCommand().equals("editVendor")){
				editVendorButton(e);
			} else if(e.getActionCommand().equals("venter") || e.getActionCommand().equals("vedit") || e.getActionCommand().equals("vdelete")){
				venterButton(e);
			} else if(e.getActionCommand().equals("reorder")){
				reorderButton(e);
			} else if(e.getActionCommand().equals("ship")){
				shipButton(e);
			} else if(e.getActionCommand().equals("cancel")){
				cancelButton(e);
			} else if(e.getActionCommand().equals("sEnter") || e.getActionCommand().equals("sEdit") || e.getActionCommand().equals("sDelete")){
				salesButton(e);
			}
	}
	public void enter1(ActionEvent e){// 0 - 2 
		this.remove(jsp);
		//item 1 , button enter
		if(e.getActionCommand().equals("enter1")){
		if(!jtfs[0].getText().equals("")){
			SqlIn si1 = new SqlIn("INSERT INTO `Holt Distributors`.`Territory` "
					+ "(`territoryNo`, `territoryName`) VALUES ('" + jtfs[0].getText() + "', '"+ jtfs[1].getText() +"');");
		}
		
		}//item 1, button edit
		else if(e.getActionCommand().equals("edit1")){
		if(!jtfs[0].getText().equals("")){
			if(!jtfs[1].getText().equals("")){
			SqlIn si2 = new SqlIn("UPDATE `Holt Distributors`.`Territory` SET `territoryName`='" + jtfs[1].getText() + "' "
					+ "WHERE `territoryNo`='" + jtfs[0].getText() + "';"); }
		}
			}//item 1, button delete
		else if(e.getActionCommand().equals("delete1")){
		if(!jtfs[0].getText().equals("")){
			SqlIn si3 = new SqlIn("DELETE FROM `Holt Distributors`.`Territory`"
					+ " WHERE `territoryNo`='"+jtfs[0].getText()+"';");
			}
		}
		for (int i = 0; i < 2; i++){
			jtfs[i].setText("");
		}
		rows = new Vector<>();
		cols  = new Vector<Vector<String>>(); 
		result = new ArrayList<String>();
		String[] str = {"territoryNo","territoryName"};
		int size = str.length;
		SqlOut so1 = new SqlOut("select * from Territory", str, result);
		insertCols(result, cols, 0 ,size, size);
		insortVector(rows, str);
		DefaultTableModel model = new DefaultTableModel(cols, rows);
 		jt = new JTable(model);
 		jt.getTableHeader().setPreferredSize(new Dimension(jt.getColumnModel().getTotalColumnWidth(), 30));
		jsp = new JScrollPane(jt);
		this.add(jsp);
		jsp.setBounds(0, 0, 1000, 400);
		this.repaint();
	}
	public void enter2(ActionEvent e){// 2 - 9 
		this.remove(jsp);
		//item 2, button enter
		String[] opTn = {"territoryNo"};
		ArrayList<String> resultTn = new ArrayList<>();
		SqlOut so5 = new SqlOut("select * from Territory", opTn, resultTn);
		if(e.getActionCommand().equals("enter2")){
			if(!jtfs[2].getText().equals("")){
				if(!jtfs[2].getText().equals("") && resultTn.contains(jtfs[8].getText()))
					{SqlIn si4 = new SqlIn("INSERT INTO `Holt Distributors`.`salesRep` "
						+ "(`repNo`, `repName`, `repAddress`, `repCity`, `repState`, `repZip`,`territoryNo` ) "
						+ "VALUES ('"+ jtfs[2].getText() +"', '"+ jtfs[3].getText() +"', '"+ jtfs[4].getText() +""
						+ "', '"+ jtfs[5].getText() +"', '"+jtfs[6].getText() +"', '" + jtfs[7].getText() +"', "
						+ "'"+jtfs[8].getText() +"');");}
				else if (!jtfs[2].getText().equals("") && jtfs[8].getText().equals("")){
					SqlIn si4 = new SqlIn("INSERT INTO `Holt Distributors`.`salesRep` "
						+ "(`repNo`, `repName`, `repAddress`, `repCity`, `repState`, `repZip`,`territoryNo` ) "
						+ "VALUES ('"+ jtfs[2].getText() +"', '"+ jtfs[3].getText() +"', '"+ jtfs[4].getText() +""
						+ "', '"+ jtfs[5].getText() +"', '"+jtfs[6].getText() +"', '" + jtfs[7].getText() +"', '100');");
					SqlIn si6 = new SqlIn("INSERT INTO `Holt Distributors`.`salesRepAccount` (`repNo`) VALUES ('"+ jtfs[2].getText() +"');");
				}
			}
		}// item 2 , button edit
		else if(e.getActionCommand().equals("edit2")){
			if(!jtfs[2].getText().equals("")){
				if(!jtfs[3].getText().equals("")){
					SqlIn si5 = new SqlIn("UPDATE `Holt Distributors`.`salesRep` SET `repName`='"+ jtfs[3].getText()+"' WHERE `repNo`='"+ jtfs[2].getText()+"';");
						}
				if(!jtfs[4].getText().equals("")){
					SqlIn si9 = new SqlIn("UPDATE `Holt Distributors`.`salesRep` SET `repAddress`='"+ jtfs[4].getText()+"' WHERE `repNo`='"+ jtfs[2].getText()+"';");
						}
				if(!jtfs[5].getText().equals("")){
					SqlIn si6 = new SqlIn("UPDATE `Holt Distributors`.`salesRep` SET `repCity`='"+ jtfs[5].getText()+"' WHERE `repNo`='"+ jtfs[2].getText()+"';");
						}
				if(!jtfs[6].getText().equals("") && jtfs[6].getText().length() <= 2){
					SqlIn si7 = new SqlIn("UPDATE `Holt Distributors`.`salesRep` SET `repState`='"+ jtfs[6].getText()+"' WHERE `repNo`='"+ jtfs[2].getText()+"';");
						}
				if(!jtfs[7].getText().equals("") && jtfs[7].getText().length() <= 5){
					SqlIn si8 = new SqlIn("UPDATE `Holt Distributors`.`salesRep` SET `repZip`='"+ jtfs[7].getText()+"' WHERE `repNo`='"+ jtfs[2].getText()+"';");
					}
				if(!jtfs[8].getText().equals("") && resultTn.contains(jtfs[8].getText())){
					SqlIn si10 = new SqlIn("UPDATE `Holt Distributors`.`salesRep` SET `territoryNo`='"+ jtfs[8].getText()+"' WHERE `repNo`='"+ jtfs[2].getText()+"';");
					}
				}		
			}// item 2 , button delete
		else if(e.getActionCommand().equals("delete2")){
			if(!jtfs[2].getText().equals("")){
				SqlIn si11 = new SqlIn("DELETE FROM `Holt Distributors`.`salesRep` WHERE `repNo`='"+ jtfs[2].getText() +"';");
				}		
			}
		for (int i = 2; i < 9; i++){
			jtfs[i].setText("");
		}
		rows = new Vector<>();
		cols  = new Vector<Vector<String>>(); 
		result = new ArrayList<String>();
		String[] str = {"repNo","repName","repAddress", "repCity", "repState", "repZip", "territoryNo"};
		int size = str.length;
		SqlOut so1 = new SqlOut("select * from salesRep", str, result);
		insertCols(result, cols, 0 ,size, size);
		insortVector(rows, str);
		DefaultTableModel model = new DefaultTableModel(cols, rows);
 		jt = new JTable(model);
 		jt.getTableHeader().setPreferredSize(new Dimension(jt.getColumnModel().getTotalColumnWidth(), 30));
		jsp = new JScrollPane(jt);
		this.add(jsp);
		jsp.setBounds(0, 0, 1000, 400);
		this.repaint();
	}
	public void enter10(ActionEvent e){// 47 -56
		this.remove(jsp);
		//item 1 , button enter
		String[] opRn = {"repNo"};
		ArrayList<String> resultRn = new ArrayList<>();
		SqlOut so9 = new SqlOut("select * from salesRep", opRn, resultRn);
		if(e.getActionCommand().equals("enter3")){
			if(!jtfs[47].getText().equals("")){
				if(!jtfs[47].getText().equals("") && resultRn.contains(jtfs[55].getText())){
					SqlIn si12 = new SqlIn("INSERT INTO `Holt Distributors`.`customer` "
							+ "(`customerNo`, `customerLastName`, `customerFirstName`, `customerAddresLine1`,"
							+ " `customerAdressLine2`, `customerCity`, `customerState`, `customerZip`, `repNo`)"
							+ " VALUES ('"+ jtfs[47].getText() +"', '"+ jtfs[48].getText() +"', '"+ jtfs[49].getText() +"',"
									+ " '"+ jtfs[50].getText() +"', '"+ jtfs[51].getText() +"', '"+ jtfs[52].getText() +"',"
											+ " '"+ jtfs[53].getText() +"', '"+ jtfs[54].getText() +"', '"+ jtfs[55].getText()+"');");
				}
				else if(!jtfs[47].getText().equals("") && jtfs[55].getText().equals("")){
					SqlIn si12 = new SqlIn("INSERT INTO `Holt Distributors`.`customer` "
							+ "(`customerNo`, `customerLastName`, `customerFirstName`, `customerAddresLine1`,"
							+ " `customerAdressLine2`, `customerCity`, `customerState`, `customerZip`, `repNo`)"
							+ " VALUES ('"+ jtfs[47].getText() +"', '"+ jtfs[48].getText() +"', '"+ jtfs[49].getText() +"',"
									+ " '"+ jtfs[50].getText() +"', '"+ jtfs[51].getText() +"', '"+ jtfs[52].getText() +"',"
											+ " '"+ jtfs[53].getText() +"', '"+ jtfs[54].getText() +"', '0000');");
				}
			}
		}// item 3, button edit
			else if(e.getActionCommand().equals("edit3")){
				if(!jtfs[47].getText().equals("")){
					if(!jtfs[48].getText().equals("")){
						SqlIn si16 = new SqlIn("UPDATE `Holt Distributors`.`customer` SET `customerLastName`='"+ jtfs[48].getText()+"' WHERE `customerNo`='"+ jtfs[47].getText()+"';");
						}
					if(!jtfs[49].getText().equals("")){
						SqlIn si17 = new SqlIn("UPDATE `Holt Distributors`.`customer` SET `customerFirstName`='"+ jtfs[49].getText()+"' WHERE `customerNo`='"+ jtfs[47].getText()+"';");
						}
					if(!jtfs[50].getText().equals("")){
						SqlIn si18 = new SqlIn("UPDATE `Holt Distributors`.`customer` SET `customerAddresLine1`='"+ jtfs[50].getText()+"' WHERE `customerNo`='"+ jtfs[47].getText()+"';");
						}
					if(!jtfs[51].getText().equals("")){
						SqlIn si19 = new SqlIn("UPDATE `Holt Distributors`.`customer` SET `customerAdressLine2`='"+ jtfs[51].getText()+"' WHERE `customerNo`='"+ jtfs[47].getText()+"';");
						}
					if(!jtfs[52].getText().equals("")){
						SqlIn si20 = new SqlIn("UPDATE `Holt Distributors`.`customer` SET `customerCity`='"+ jtfs[52].getText()+"' WHERE `customerNo`='"+ jtfs[47].getText()+"';");
						}
					if(!jtfs[53].getText().equals("") && jtfs[53].getText().length() <= 2){
						SqlIn si21 = new SqlIn("UPDATE `Holt Distributors`.`customer` SET `customerState`='"+ jtfs[53].getText()+"' WHERE `customerNo`='"+ jtfs[47].getText()+"';");
						}
					if(!jtfs[54].getText().equals("") && jtfs[54].getText().length() <= 5){
						SqlIn si22= new SqlIn("UPDATE `Holt Distributors`.`customer` SET `customerZip`='"+ jtfs[54].getText()+"' WHERE `customerNo`='"+ jtfs[47].getText()+"';");
						}
					if(!jtfs[55].getText().equals("") && resultRn.contains(jtfs[55].getText())){
						SqlIn si23 = new SqlIn("UPDATE `Holt Distributors`.`customer` SET `repNo`='"+ jtfs[55].getText()+"' WHERE `customerNo`='"+ jtfs[47].getText()+"';");
						}
				}
		}// item 3, button delete
			else if(e.getActionCommand().equals("delete3")){
				if(!jtfs[47].getText().equals("")){
					SqlIn si24 = new SqlIn("DELETE FROM `Holt Distributors`.`customer` WHERE `customerNo`='"+ jtfs[47].getText() +"';");
			}
		}
		for (int i = 47; i < 56; i++){
			jtfs[i].setText("");
		}
		rows = new Vector<>();
		cols  = new Vector<Vector<String>>(); 
		result = new ArrayList<String>();
		String[] str = {"customerNo","customerLastName","customerFirstName", "customerAddresLine1", "customerAdressLine2",
				"customerCity", "customerState", "customerZip", "repNo"};
		int size = str.length;
		SqlOut so1 = new SqlOut("select * from customer", str, result);
		insertCols(result, cols, 0 ,size, size);
		insortVector(rows, str);
		DefaultTableModel model = new DefaultTableModel(cols, rows);
 		jt = new JTable(model);
 		jt.getTableHeader().setPreferredSize(new Dimension(jt.getColumnModel().getTotalColumnWidth(), 30));
		jsp = new JScrollPane(jt);
		this.add(jsp);
		jsp.setBounds(0, 0, 1000, 400);
		this.repaint();
	}
	public void enter4(ActionEvent e){// 15 - 18
		this.remove(jsp);
		// item 3, button enter
		if(e.getActionCommand().equals("enter4")){
			if(!jtfs[15].getText().equals("")){
				if (jtfs[17].getText().equals("")){
				SqlIn si12 = new SqlIn("INSERT INTO `Holt Distributors`.`part` "
				+ "(`partNo`, `partDescription`) VALUES ('"+ jtfs[15].getText()+"', '"+ jtfs[16].getText()+"');");
						}
			else if(isInteger(jtfs[17].getText()) || isDouble(jtfs[17].getText())){
						SqlIn si12 = new SqlIn("INSERT INTO `Holt Distributors`.`part` (`partNo`, `partDescription`, `partPrice`) "
								+ "VALUES ('"+ jtfs[15].getText() +"', '"+ jtfs[16].getText() +"', '"+ jtfs[17].getText() +"');");
						}
					}
		}// item 3, button edit
			else if(e.getActionCommand().equals("edit4")){
				if(!jtfs[15].getText().equals("")){
					if(!jtfs[16].getText().equals("")){
						SqlIn si16 = new SqlIn("UPDATE `Holt Distributors`.`part` SET `partDescription`='"+ jtfs[16].getText()+"' WHERE `partNo`='"+ jtfs[15].getText()+"';");
						}
					if(!jtfs[31].getText().equals("")){
						if(isInteger(jtfs[17].getText()) || isDouble(jtfs[17].getText())){
						SqlIn si17 = new SqlIn("UPDATE `Holt Distributors`.`part` SET `partPrice`='"+ jtfs[17].getText()+"' WHERE `partNo`='"+ jtfs[15].getText()+"';");
						}
					}
				}
		}// item 3, button delete
			else if(e.getActionCommand().equals("delete4")){
				if(!jtfs[15].getText().equals("")){
					SqlIn si24 = new SqlIn("DELETE FROM `Holt Distributors`.`part` WHERE `partNo`='"+ jtfs[15].getText() +"';");
					}
				}	
		for (int i = 15; i < 18; i++){
			jtfs[i].setText("");
		}
		rows = new Vector<>();
		cols  = new Vector<Vector<String>>(); 
		result = new ArrayList<String>();
		String[] str = {"partNo","partDescription","partPrice"};
		int size = str.length;
		SqlOut so1 = new SqlOut("select * from part", str, result);
		insertCols(result, cols, 0 ,size, size);
		insortVector(rows, str);
		DefaultTableModel model = new DefaultTableModel(cols, rows);
 		jt = new JTable(model);
 		jt.getTableHeader().setPreferredSize(new Dimension(jt.getColumnModel().getTotalColumnWidth(), 30));
		jsp = new JScrollPane(jt);
		this.add(jsp);
		jsp.setBounds(0, 0, 1000, 400);
		this.repaint();
	}
	public void enter5(ActionEvent e){// 18 - 24
		this.remove(jsp);
		// item 3, button enter
		if(e.getActionCommand().equals("enter5")){
			if(!jtfs[18].getText().equals("")){	
				SqlIn si12 = new SqlIn("INSERT INTO `Holt Distributors`.`vender` "
								+ "(`venderNo`, `venderName`, `venderAddress`, `venderCity`, `venderState`, `venderZip`) "
								+ "VALUES ('"+ jtfs[18].getText() +"', '"+ jtfs[19].getText() +"', '"+ jtfs[20].getText() +"',"
										+ " '"+ jtfs[21].getText() +"', '"+ jtfs[22].getText() +"', '"+ jtfs[23].getText() +"');");
					}
				}// item 3, button edit
					else if(e.getActionCommand().equals("edit5")){
						if(!jtfs[18].getText().equals("")){
							if(!jtfs[19].getText().equals("")){
								SqlIn si16 = new SqlIn("UPDATE `Holt Distributors`.`vender` SET `venderName`='"+ jtfs[19].getText()+"' WHERE `venderNo`='"+ jtfs[18].getText()+"';");
								}
							if(!jtfs[20].getText().equals("")){
								SqlIn si17 = new SqlIn("UPDATE `Holt Distributors`.`vender` SET `venderAddress`='"+ jtfs[20].getText()+"' WHERE `venderNo`='"+ jtfs[18].getText()+"';");
							}
							if(!jtfs[21].getText().equals("")){
								SqlIn si16 = new SqlIn("UPDATE `Holt Distributors`.`vender` SET `venderCity`='"+ jtfs[21].getText()+"' WHERE `venderNo`='"+ jtfs[18].getText()+"';");
								}
							if(!jtfs[22].getText().equals("") && jtfs[22].getText().length() <= 2){
								SqlIn si16 = new SqlIn("UPDATE `Holt Distributors`.`vender` SET `venderState`='"+ jtfs[22].getText()+"' WHERE `venderNo`='"+ jtfs[18].getText()+"';");
								}
							if(!jtfs[23].getText().equals("") && jtfs[23].getText().length() <= 5){
								SqlIn si16 = new SqlIn("UPDATE `Holt Distributors`.`vender` SET `venderZip`='"+ jtfs[23].getText()+"' WHERE `venderNo`='"+ jtfs[18].getText()+"';");
								}
						}
				}// item 3, button delete
					else if(e.getActionCommand().equals("delete5")){
						if(!jtfs[18].getText().equals("")){
							SqlIn si24 = new SqlIn("DELETE FROM `Holt Distributors`.`vender` WHERE `venderNo`='"+ jtfs[18].getText() +"';");
					}
				}
		for (int i = 18; i < 24; i++){
			jtfs[i].setText("");
		}
		rows = new Vector<>();
		cols  = new Vector<Vector<String>>(); 
		result = new ArrayList<String>();
		String[] str = {"venderNo","venderName","venderAddress", "venderCity", "venderState", "venderZip"};
		int size = str.length;
		SqlOut so1 = new SqlOut("select * from vender", str, result);
		insertCols(result, cols, 0 ,size, size);
		insortVector(rows, str);
		DefaultTableModel model = new DefaultTableModel(cols, rows);
 		jt = new JTable(model);
 		jt.getTableHeader().setPreferredSize(new Dimension(jt.getColumnModel().getTotalColumnWidth(), 30));
		jsp = new JScrollPane(jt);
		this.add(jsp);
		jsp.setBounds(0, 0, 1000, 400);
		this.repaint();
	}
	public void enter6(ActionEvent e){// 24 - 30
		this.remove(jsp);
		 // item 6, button enter
		if(e.getActionCommand().equals("enter6")){
			if(!jtfs[24].getText().equals("")){
				if((isInteger(jtfs[25].getText()) || isDouble(jtfs[25].getText()) )&& (isInteger(jtfs[26].getText()) || isDouble(jtfs[26].getText())) 
						&&(isInteger(jtfs[27].getText()) || isDouble(jtfs[27].getText())) && (isInteger(jtfs[28].getText()) || isDouble(jtfs[28].getText())) &&
						(isInteger(jtfs[29].getText()) || isDouble(jtfs[29].getText()))){
				SqlIn si18 = new SqlIn("INSERT INTO `Holt Distributors`.`salesRep` (`repNo`) VALUES ('"+ jtfs[24].getText() +"');") ;
				SqlIn si17 = new SqlIn("INSERT INTO `Holt Distributors`.`salesRepAccount` "
						+ "(`repNo`, `MTDsales`, `YTDsales`, `MTDcommission`, `YTDcommission`, `commissionRate`) "
						+ "VALUES ('"+ jtfs[24].getText() +"', '"+ jtfs[25].getText() +"', '"+ jtfs[26].getText() +"',"
								+ " '"+ jtfs[27].getText() +"', '"+ jtfs[28].getText() +"', '"+ jtfs[29].getText() +"');");
				}
			}
		}// item 6, button edit
			else if(e.getActionCommand().equals("edit6")){
				if(!jtfs[24].getText().equals("")){
					if(!jtfs[25].getText().equals("")){
						if(isInteger(jtfs[25].getText()) || isDouble(jtfs[25].getText())){
						SqlIn si17 = new SqlIn("UPDATE `Holt Distributors`.`salesRepAccount` SET `MTDsales`='"+ jtfs[25].getText()+"' WHERE `repNo`='"+ jtfs[24].getText()+"';");
						}
					}
					if(!jtfs[26].getText().equals("")){
						if(isInteger(jtfs[26].getText()) || isDouble(jtfs[26].getText())){
						SqlIn si17 = new SqlIn("UPDATE `Holt Distributors`.`salesRepAccount` SET `YTDsales`='"+ jtfs[26].getText()+"' WHERE `repNo`='"+ jtfs[24].getText()+"';");
						}
					}
					if(!jtfs[27].getText().equals("")){
						if(isInteger(jtfs[27].getText()) || isDouble(jtfs[27].getText())){
						SqlIn si17 = new SqlIn("UPDATE `Holt Distributors`.`salesRepAccount` SET `MTDcommission`='"+ jtfs[27].getText()+"' WHERE `repNo`='"+ jtfs[24].getText()+"';");
						}
					}
					if(!jtfs[28].getText().equals("")){
						if(isInteger(jtfs[28].getText()) || isDouble(jtfs[28].getText())){
						SqlIn si17 = new SqlIn("UPDATE `Holt Distributors`.`salesRepAccount` SET `YTDcommission`='"+ jtfs[28].getText()+"' WHERE `repNo`='"+ jtfs[24].getText()+"';");
						}
					}
					if(!jtfs[29].getText().equals("")){
						if(isInteger(jtfs[29].getText()) || isDouble(jtfs[29].getText())){
						SqlIn si17 = new SqlIn("UPDATE `Holt Distributors`.`salesRepAccount` SET `commissionRate`='"+ jtfs[29].getText()+"' WHERE `repNo`='"+ jtfs[24].getText()+"';");
						}
					}
				}
		}// item 6, button delete
			else if(e.getActionCommand().equals("delete6")){
				if(!jtfs[24].getText().equals("")){
					SqlIn si24 = new SqlIn("DELETE FROM `Holt Distributors`.`salesRepAccount` WHERE `repNo`='"+ jtfs[24].getText() +"';");
				}
			}	
		for (int i = 24; i < 30; i++){
			jtfs[i].setText("");
		}
		rows = new Vector<>();
		cols  = new Vector<Vector<String>>(); 
		result = new ArrayList<String>();
		String[] str = {"repNo","MTDsales","YTDsales", "MTDcommission", "YTDcommission", "commissionRate"};
		int size = str.length;
		SqlOut so1 = new SqlOut("select * from salesRepAccount", str, result);
		insertCols(result, cols, 0 ,size, size);
		insortVector(rows, str);
		DefaultTableModel model = new DefaultTableModel(cols, rows);
 		jt = new JTable(model);
 		jt.getTableHeader().setPreferredSize(new Dimension(jt.getColumnModel().getTotalColumnWidth(), 30));
		jsp = new JScrollPane(jt);
		this.add(jsp);
		jsp.setBounds(0, 0, 1000, 400);
		this.repaint();
	}
	public void enter7(ActionEvent e){// 30 - 35
		this.remove(jsp);
		 // item 7, button enter
		String[] opCusn = {"customerNo"};
		ArrayList<String> resultCusn = new ArrayList<>();
		SqlOut so19 = new SqlOut("select * from customer", opCusn, resultCusn);
		if(e.getActionCommand().equals("enter7")){
			if(!jtfs[30].getText().equals("")){
				if(!resultCusn.contains(jtfs[30].getText())){
				SqlIn si19 = new SqlIn("INSERT INTO `Holt Distributors`.`customer` (`customerNo`) VALUES ('"+ jtfs[30].getText() +"');") ;
				}
				
				SqlIn si11 = new SqlIn("INSERT INTO `Holt Distributors`.`customerAccount` "
						+ "(`customerNo`, `MTDsales`, `YTDsales`, `currentBalance`, `currentLimit`)"
						+ " VALUES ('"+ jtfs[30].getText() +"', '"+ jtfs[31].getText() +"', '"+ jtfs[32].getText() +"',"
								+ " '"+ jtfs[33].getText() +"', '"+ jtfs[34].getText() +"');");	
			}
		}// item 2a, button edit
			else if(e.getActionCommand().equals("edit7")){
				if(!jtfs[30].getText().equals("")){
					if(!jtfs[31].getText().equals("")){
						if(isInteger(jtfs[31].getText()) || isDouble(jtfs[31].getText())){
						SqlIn si17 = new SqlIn("UPDATE `Holt Distributors`.`customerAccount` SET `MTDsales`='"+ jtfs[31].getText()+"' WHERE `customerNo`='"+ jtfs[30].getText()+"';");
						}
					}
					if(!jtfs[32].getText().equals("")){
						if(isInteger(jtfs[32].getText()) || isDouble(jtfs[32].getText())){
						SqlIn si17 = new SqlIn("UPDATE `Holt Distributors`.`customerAccount` SET `YTDsales`='"+ jtfs[32].getText()+"' WHERE `customerNo`='"+ jtfs[30].getText()+"';");
						}
					}
					if(!jtfs[33].getText().equals("")){
						if(isInteger(jtfs[33].getText()) || isDouble(jtfs[33].getText())){
						SqlIn si17 = new SqlIn("UPDATE `Holt Distributors`.`customerAccount` SET `currentBalance`='"+ jtfs[33].getText()+"' WHERE `customerNo`='"+ jtfs[30].getText()+"';");
						}
					}
					if(!jtfs[34].getText().equals("")){
						if(isInteger(jtfs[34].getText()) || isDouble(jtfs[34].getText())){
						SqlIn si17 = new SqlIn("UPDATE `Holt Distributors`.`customerAccount` SET `currentLimit`='"+ jtfs[34].getText()+"' WHERE `customerNo`='"+ jtfs[30].getText()+"';");
						}
					}
				}
		}// item 2a, button delete
			else if(e.getActionCommand().equals("delete7")){
				if(!jtfs[30].getText().equals("")){
					SqlIn si24 = new SqlIn("DELETE FROM `Holt Distributors`.`customerAccount` WHERE `customerNo`='"+ jtfs[30].getText() +"';");
			}
		}
		for (int i = 30; i < 35; i++){
			jtfs[i].setText("");
		}
		rows = new Vector<>();
		cols  = new Vector<Vector<String>>(); 
		result = new ArrayList<String>();
		String[] str = {"customerNo","MTDsales","YTDsales", "currentBalance", "currentLimit"};
		int size = str.length;
		SqlOut so1 = new SqlOut("select * from customerAccount", str, result);
		insertCols(result, cols, 0 ,size, size);
		insortVector(rows, str);
		DefaultTableModel model = new DefaultTableModel(cols, rows);
 		jt = new JTable(model);
 		jt.getTableHeader().setPreferredSize(new Dimension(jt.getColumnModel().getTotalColumnWidth(), 30));
		jsp = new JScrollPane(jt);
		this.add(jsp);
		jsp.setBounds(0, 0, 1000, 400);
		this.repaint();
	}
	public void enter8(ActionEvent e){// 35 - 42 
		this.remove(jsp);
		// item 8, button enter
		String[] opCusn = {"customerNo"};
		ArrayList<String> resultCusn = new ArrayList<>();
		SqlOut so19 = new SqlOut("select * from customer", opCusn, resultCusn);
		if(e.getActionCommand().equals("enter8")){
			if(!jtfs[35].getText().equals("")){
				if(!resultCusn.contains(jtfs[35].getText())){
					SqlIn si19 = new SqlIn("INSERT INTO `Holt Distributors`.`customer` (`customerNo`) VALUES ('"+ jtfs[35].getText() +"');") ;
					}
					SqlIn si11 = new SqlIn("INSERT INTO `Holt Distributors`.`Customer_ship_to` "
								+ "(`customerNo`,`FirstName`, `LastName`, `Address`, `CITY`,"
								+ " `STATE`, `ZIP`)"
								+ " VALUES ('"+ jtfs[35].getText() +"', '"+ jtfs[36].getText() +"', '"+ jtfs[47].getText() +"',"
										+ " '"+ jtfs[38].getText() +"', '"+ jtfs[39].getText() +"', '"+ jtfs[40].getText() +"', '"+ jtfs[41].getText() +"');");	
					}
				}// item 8, button edit
					else if(e.getActionCommand().equals("edit8")){
						if(!jtfs[35].getText().equals("")){
							if(!jtfs[36].getText().equals("")){
								SqlIn si17 = new SqlIn("UPDATE `Holt Distributors`.`Customer_ship_to` SET `FirstName`='"+ jtfs[36].getText()+"' WHERE `customerNo`='"+ jtfs[35].getText()+"';");
							}
							if(!jtfs[37].getText().equals("")){
								SqlIn si17 = new SqlIn("UPDATE `Holt Distributors`.`Customer_ship_to` SET `LastName`='"+ jtfs[37].getText()+"' WHERE `customerNo`='"+ jtfs[35].getText()+"';");
							}
							if(!jtfs[38].getText().equals("")){
								SqlIn si17 = new SqlIn("UPDATE `Holt Distributors`.`Customer_ship_to` SET `Address`='"+ jtfs[38].getText()+"' WHERE `customerNo`='"+ jtfs[35].getText()+"';");
							}
							if(!jtfs[39].getText().equals("")){
								SqlIn si17 = new SqlIn("UPDATE `Holt Distributors`.`Customer_ship_to` SET `CITY`='"+ jtfs[39].getText()+"' WHERE `customerNo`='"+ jtfs[35].getText()+"';");
							}
							if(!jtfs[40].getText().equals("") && jtfs[40].getText().length() == 2){
								SqlIn si17 = new SqlIn("UPDATE `Holt Distributors`.`Customer_ship_to` SET `STATE`='"+ jtfs[40].getText()+"' WHERE `customerNo`='"+ jtfs[35].getText()+"';");
							}
							if(!jtfs[41].getText().equals("") && jtfs[41].getText().length() == 5){
								SqlIn si17 = new SqlIn("UPDATE `Holt Distributors`.`Customer_ship_to` SET `ZIP`='"+ jtfs[41].getText()+"' WHERE `customerNo`='"+ jtfs[35].getText()+"';");
							}	
						}
				}// item 8, button delete
					else if(e.getActionCommand().equals("delete8")){
						if(!jtfs[35].getText().equals("")){
							SqlIn si24 = new SqlIn("DELETE FROM `Holt Distributors`.`Customer_ship_to` WHERE `customerNo`='"+ jtfs[35].getText() +"';");
					}
				}	
		for (int i = 35; i < 42; i++){
			jtfs[i].setText("");
		}
		rows = new Vector<>();
		cols  = new Vector<Vector<String>>(); 
		result = new ArrayList<String>();
		String[] str = {"customerNo","FirstName","LastName", "Address", "CITY", "STATE", "ZIP"};
		int size = str.length;
		SqlOut so1 = new SqlOut("select * from Customer_ship_to", str, result);
		insertCols(result, cols, 0 ,size, size);
		insortVector(rows, str);
		DefaultTableModel model = new DefaultTableModel(cols, rows);
 		jt = new JTable(model);
 		jt.getTableHeader().setPreferredSize(new Dimension(jt.getColumnModel().getTotalColumnWidth(), 30));
		jsp = new JScrollPane(jt);
		this.add(jsp);
		jsp.setBounds(0, 0, 1000, 400);
		this.repaint();
	}
	public void enter9(ActionEvent e){// 42 - 47
		this.remove(jsp);
		// item 9, button enter
		String[] opParts = {"partNo"};
		ArrayList<String> resultParts = new ArrayList<>();
		SqlOut so19 = new SqlOut("select * from part", opParts, resultParts);
		String[] opVn = {"venderNo"};
		ArrayList<String> resultVn = new ArrayList<>();
		SqlOut so20 = new SqlOut("select * from vender", opVn, resultVn);
		if(e.getActionCommand().equals("enter9")){
			if(!jtfs[42].getText().equals("") && !jtfs[43].getText().equals("")){
				if(resultVn.contains(jtfs[42].getText()) && resultParts.contains(jtfs[43].getText())){
					SqlIn si19 = new SqlIn("INSERT INTO `Holt Distributors`.`vendorPart` (`vendorNo`, `partNo`, `priceForPart`, `minimalOrder`, `leadTime`) "
								+ "VALUES ('"+ jtfs[42].getText() + "', '"+ jtfs[43].getText() + "', '"+ jtfs[44].getText() + "',"
										+ " '"+ jtfs[45].getText() + "', '"+ jtfs[46].getText() + "');") ;
						}
					}
				}// item 9, button edit
					else if(e.getActionCommand().equals("edit9")){
						if(!jtfs[42].getText().equals("") && !jtfs[43].getText().equals("")){
							if(resultVn.contains(jtfs[42].getText()) && resultParts.contains(jtfs[43].getText())){
								if(!jtfs[44].getText().equals("") && isDouble(jtfs[44].getText()) && isInteger(jtfs[44].getText())){
									SqlIn si10 = new SqlIn("UPDATE `Holt Distributors`.`vendorPart` SET `priceForPart`='"+ jtfs[44].getText() +"' "
											+ "WHERE `vendorNo`='"+ jtfs[42].getText() +"' and`partNo`='"+ jtfs[43].getText() +"';");
									}
								if(!jtfs[45].getText().equals("") && isInteger(jtfs[45].getText())){
									SqlIn si10 = new SqlIn("UPDATE `Holt Distributors`.`vendorPart` SET `minimalOrder`='"+ jtfs[45].getText() +"' "
											+ "WHERE `vendorNo`='"+ jtfs[42].getText() +"' and`partNo`='"+ jtfs[43].getText() +"';");
									}
								if(!jtfs[46].getText().equals("")){
									SqlIn si10 = new SqlIn("UPDATE `Holt Distributors`.`vendorPart` SET `leadTime`='"+ jtfs[46].getText() +"' "
											+ "WHERE `vendorNo`='"+ jtfs[42].getText() +"' and`partNo`='"+ jtfs[43].getText() +"';");
									}
								
							}
						}
				}// item 9, button delete
					else if(e.getActionCommand().equals("delete9")){
						if(!jtfs[42].getText().equals("") && !jtfs[43].getText().equals("")){
							if(resultVn.contains(jtfs[42].getText()) && resultParts.contains(jtfs[43].getText())){
							SqlIn si24 = new SqlIn("DELETE FROM `Holt Distributors`.`vendorPart` WHERE `vendorNo`='"+ jtfs[42].getText() + "' and`partNo`='" + jtfs[43].getText() + "';");
							}
						}
					}	
		for (int i = 42; i < 47; i++){
			jtfs[i].setText("");
		}
		rows = new Vector<>();
		cols  = new Vector<Vector<String>>(); 
		result = new ArrayList<String>();
		String[] str = {"vendorNo","partNo","priceForPart", "minimalOrder", "leadTime"};
		int size = str.length;
		SqlOut so1 = new SqlOut("select * from vendorPart", str, result);
		insertCols(result, cols, 0 ,size, size);
		insortVector(rows, str);
		DefaultTableModel model = new DefaultTableModel(cols, rows);
 		jt = new JTable(model);
 		jt.getTableHeader().setPreferredSize(new Dimension(jt.getColumnModel().getTotalColumnWidth(), 30));
		jsp = new JScrollPane(jt);
		this.add(jsp);
		jsp.setBounds(0, 0, 1000, 400);
		this.repaint();
	}
	public void enterOrder(){
		
	}
	public void editButton(ActionEvent e){
		this.remove(jsp);	
			if(!jtfs1.get(0).getText().equals("")){
				SqlIn si16 = new SqlIn("UPDATE `Holt Distributors`.`customer` SET `customerLastName`='"+ jtfs1.get(0).getText()+"' WHERE `customerNo`='"+ cusNo+"';");
				}
			if(!jtfs1.get(1).getText().equals("")){
				SqlIn si17 = new SqlIn("UPDATE `Holt Distributors`.`customer` SET `customerFirstName`='"+ jtfs1.get(1).getText()+"' WHERE `customerNo`='"+ cusNo+"';");
				}
			if(!jtfs1.get(2).getText().equals("")){
				SqlIn si18 = new SqlIn("UPDATE `Holt Distributors`.`customer` SET `customerAddresLine1`='"+ jtfs1.get(2).getText()+"' WHERE `customerNo`='"+ cusNo+"';");
				}
			if(!jtfs1.get(3).getText().equals("")){
				SqlIn si19 = new SqlIn("UPDATE `Holt Distributors`.`customer` SET `customerAdressLine2`='"+ jtfs1.get(3).getText()+"' WHERE `customerNo`='"+ cusNo+"';");
				}
			if(!jtfs1.get(4).getText().equals("")){
				SqlIn si20 = new SqlIn("UPDATE `Holt Distributors`.`customer` SET `customerCity`='"+ jtfs1.get(4).getText()+"' WHERE `customerNo`='"+ cusNo+"';");
				}
			if(!jtfs1.get(5).getText().equals("") && jtfs1.get(5).getText().length() <= 2){
				SqlIn si21 = new SqlIn("UPDATE `Holt Distributors`.`customer` SET `customerState`='"+ jtfs1.get(5).getText()+"' WHERE `customerNo`='"+ cusNo+"';");
				}
			if(!jtfs1.get(6).getText().equals("") && jtfs1.get(6).getText().length() <= 5){
				SqlIn si22= new SqlIn("UPDATE `Holt Distributors`.`customer` SET `customerZip`='"+ jtfs1.get(6).getText()+"' WHERE `customerNo`='"+ cusNo+"';");
				}
			if(!jtfs2.get(0).getText().equals("")){
				SqlIn si16 = new SqlIn("UPDATE `Holt Distributors`.`Customer_ship_to` SET `FirstName`='"+ jtfs2.get(0).getText()+"' WHERE `customerNo`='"+ cusNo+"';");
			}
			if(!jtfs2.get(1).getText().equals("")){
				SqlIn si16 = new SqlIn("UPDATE `Holt Distributors`.`Customer_ship_to` SET `LastName`='"+ jtfs2.get(1).getText()+"' WHERE `customerNo`='"+ cusNo+"';");
			}
			if(!jtfs2.get(2).getText().equals("")){
				SqlIn si16 = new SqlIn("UPDATE `Holt Distributors`.`Customer_ship_to` SET `Address`='"+ jtfs2.get(2).getText()+"' WHERE `customerNo`='"+ cusNo+"';");
			}
			if(!jtfs2.get(3).getText().equals("")){
				SqlIn si16 = new SqlIn("UPDATE `Holt Distributors`.`Customer_ship_to` SET `CITY`='"+ jtfs2.get(3).getText()+"' WHERE `customerNo`='"+ cusNo+"';");
			}
			if(!jtfs2.get(4).getText().equals("")){
				SqlIn si16 = new SqlIn("UPDATE `Holt Distributors`.`Customer_ship_to` SET `STATE`='"+ jtfs2.get(4).getText()+"' WHERE `customerNo`='"+ cusNo+"';");
			}
			if(!jtfs2.get(5).getText().equals("")){
				SqlIn si16 = new SqlIn("UPDATE `Holt Distributors`.`Customer_ship_to` SET `ZIP`='"+ jtfs2.get(5).getText()+"' WHERE `customerNo`='"+ cusNo+"';");
			}
		for (int i = 0; i < jtfs1.size(); i++){
			jtfs1.get(i).setText("");
		}
		for (int i = 0; i < jtfs2.size(); i++){
			jtfs2.get(i).setText("");
		}
		rows = new Vector<>();
		cols  = new Vector<Vector<String>>();
		rows1 = new Vector<>();
		cols1  = new Vector<Vector<String>>(); 
		result = new ArrayList<String>();
		result1 = new ArrayList<String>();
		String[] str = {"customerNo","customerLastName","customerFirstName", "customerAddresLine1", "customerAdressLine2",
				"customerCity", "customerState", "customerZip", "repNo"};
		int size = str.length;
		SqlOut so1 = new SqlOut("select * from customer where customerNo = "+ cusNo +"; ", str, result);
		insertCols(result, cols, 0 ,size, size);
		insortVector(rows, str);
		DefaultTableModel model = new DefaultTableModel(cols, rows);
 		jt = new JTable(model);
 		jt.getTableHeader().setPreferredSize(new Dimension(jt.getColumnModel().getTotalColumnWidth(), 30));
 		jsp = new JScrollPane(jt);
 		
 		String[] str1 = {"FirstName","LastName", "Address", "CITY",
				"STATE", "ZIP"};
		int size1 = str1.length;
		SqlOut so2 = new SqlOut("select FirstName, LastName, Address , CITY, STATE, ZIP "
				+ "from Customer_ship_to where customerNo = "+ cusNo+";", str1, result1);
		insertCols(result1, cols1, 0 ,size1, size1);
		insortVector(rows1, str1);
		DefaultTableModel model1 = new DefaultTableModel(cols1, rows1);
 		jt1 = new JTable(model1);
 		jt1.getTableHeader().setPreferredSize(new Dimension(jt1.getColumnModel().getTotalColumnWidth(), 30));
		jsp1 = new JScrollPane(jt1);
		jp.setBounds(0, 400, 1000, 200);
		this.add(jsp);
		jsp.setBounds(0, 0, 1000, 200);
		this.add(jsp1);
		jsp1.setBounds(0, 200, 1000, 200);
		this.setVisible(true);
	}
	public void purchesButton(ActionEvent e){
		this.remove(jsp1);
		String[] opPartN = {"partNo"};
		ArrayList<String> resultPartNo = new ArrayList<>();
		SqlOut so19 = new SqlOut("select * from part", opPartN, resultPartNo);
		String[] opDes = {"partDescription"};
		ArrayList<String> resultDes = new ArrayList<>();
		SqlOut so18 = new SqlOut("select * from part", opDes, resultDes);
		String[] opPri = {"partPrice"};
		ArrayList<String> resultPri = new ArrayList<>();
		SqlOut so17 = new SqlOut("select * from part", opPri, resultPri);
		String[] opPartN1 = {"partNo"};
		ArrayList<String> resultPartNo1 = new ArrayList<>();
		SqlOut so12 = new SqlOut("select * from partOrder", opPartN1, resultPartNo1);
		
		if (!jtfs1.get(0).getText().equals("") && !jtfs1.get(1).getText().equals("")){
			if(resultPartNo.contains(jtfs1.get(0).getText())){
				if(!resultPartNo1.contains(jtfs1.get(0).getText())){
				SqlIn si17 = new SqlIn("INSERT INTO `Holt Distributors`.`partOrder` (`partNo`, `unit`, `customerNo`) VALUES ('"+ jtfs1.get(0).getText() +"', '" + jtfs1.get(1).getText() +"','"+ cusNo +"');");
	
				SqlIn si19 = new SqlIn("UPDATE `Holt Distributors`.`partOrder` SET `partDescription`='"+resultDes.get(Integer.parseInt(jtfs1.get(0).getText()) - 1) +""
					+ "' WHERE `partNo`='"+ jtfs1.get(0).getText() +"';");
				SqlIn si16 = new SqlIn("UPDATE `Holt Distributors`.`partOrder` SET `partPrice`='"+resultPri.get(Integer.parseInt(jtfs1.get(0).getText()) - 1) +""
					+ "' WHERE `partNo`='"+ jtfs1.get(0).getText() +"';");
			}
				}else { // need change
					String[] opPartUnit = {"unit"};
					ArrayList<String> resultPartUnit = new ArrayList<>();
					SqlOut so16 = new SqlOut("select unit from partOrder where `partNo` = '"+ jtfs1.get(0).getText()+"';", opPartUnit, resultPartUnit);
					SqlIn si19 = new SqlIn("UPDATE `Holt Distributors`.`partOrder` SET "
							+ "`unit`='"+ (Integer.parseInt(resultPartUnit.get(0)) + Integer.parseInt(jtfs1.get(1).getText()))+""
							+ "' WHERE `partNo`='"+ jtfs1.get(0).getText() +"';");
				}
			
		}
		for (int i = 0; i < jtfs1.size(); i++){
			jtfs1.get(i).setText("");
		}
		String[] optotal = {"total"};
		ArrayList<String> resulttotal = new ArrayList<>();
		SqlOut so21 = new SqlOut("select * from partOrder", optotal, resulttotal);
		double res = 0.00;
		for (int i = 0; i < resulttotal.size(); i++){
			res += Double.parseDouble(resulttotal.get(i));
		}
		jtfs1.get(3).setText(res +"");
		rows1 = new Vector<>();
		cols1  = new Vector<Vector<String>>(); 
		result1 = new ArrayList<String>();
		String[] str1 = {"partNo","partDescription", "partPrice", "unit","total"};
		int size1 = str1.length;
		SqlOut so2 = new SqlOut("select partNo,partDescription,partPrice,unit,total from partOrder where customerNo = "+ cusNo +"", str1, result1);
		insertCols(result1, cols1, 0 ,size1, size1);
		insortVector(rows1, str1);
		DefaultTableModel model1 = new DefaultTableModel(cols1, rows1);
 		jt1 = new JTable(model1);
 		jt1.getTableHeader().setPreferredSize(new Dimension(jt1.getColumnModel().getTotalColumnWidth(), 30));
		jsp1 = new JScrollPane(jt1);
		this.add(jsp1);
		jsp1.setBounds(0, 200, 1000, 200);
		this.setVisible(true);
		
	}
	public void deleteButton(ActionEvent e){ // order number change
		this.remove(jsp1);
		String[] opOrderNo = {"partNo"};
		ArrayList<String> resultorderNo = new ArrayList<>();
		SqlOut so20 = new SqlOut("select * from partOrder", opOrderNo, resultorderNo);
		
		if (!jtfs1.get(2).getText().equals("")){
			if(resultorderNo.contains(jtfs1.get(2).getText())){
			SqlIn si17 = new SqlIn("DELETE FROM `Holt Distributors`.`partOrder` WHERE `partNo`='"+ jtfs1.get(2).getText() +"';");
			SqlIn si18 = new SqlIn("DELETE FROM `Holt Distributors`.`partOrderVendor` WHERE `partNo`='"+ jtfs1.get(2).getText() +"';");
			}
		}
		for (int i = 0; i < jtfs1.size(); i++){
			jtfs1.get(i).setText("");
		}
		String[] optotal = {"total"};
		ArrayList<String> resulttotal = new ArrayList<>();
		SqlOut so21 = new SqlOut("select * from partOrder", optotal, resulttotal);
		double res = 0;
		for (int i = 0; i < resulttotal.size(); i++){
			res += Double.parseDouble(resulttotal.get(i));
		}
		jtfs1.get(3).setText(res +"");
		rows1 = new Vector<>();
		cols1  = new Vector<Vector<String>>(); 
		result1 = new ArrayList<String>();
		String[] str1 = {"partNo","partDescription", "partPrice", "unit","total"};
		int size1 = str1.length;
		SqlOut so2 = new SqlOut("select partNo,partDescription,partPrice,unit,total from partOrder where customerNo = "+ cusNo +"", str1, result1);
		insertCols(result1, cols1, 0 ,size1, size1);
		insortVector(rows1, str1);
		DefaultTableModel model1 = new DefaultTableModel(cols1, rows1);
 		jt1 = new JTable(model1);
 		jt1.getTableHeader().setPreferredSize(new Dimension(jt1.getColumnModel().getTotalColumnWidth(), 30));
		jsp1 = new JScrollPane(jt1);
		this.add(jsp1);
		jsp1.setBounds(0, 200, 1000, 200);
		this.setVisible(true);
	}
	public void doneButton(ActionEvent e){
		String[] opOrderNo = {"orderNo"};
		ArrayList<String> resultorderNo = new ArrayList<>();
		SqlOut so20 = new SqlOut("SELECT * FROM `Holt Distributors`.`order`;", opOrderNo, resultorderNo);
		String[] opDes = {"partDescription"};
		ArrayList<String> resultDes = new ArrayList<>();
		SqlOut so18 = new SqlOut("select * from partOrder", opDes, resultDes);
		String[] opUnits = {"unit"};
		ArrayList<String> resultUnits = new ArrayList<>();
		SqlOut so1 = new SqlOut("select * from partOrder", opUnits, resultUnits);
		String[] opPri = {"partPrice"};
		ArrayList<String> resultPri = new ArrayList<>();
		SqlOut so17 = new SqlOut("select * from partOrder", opPri, resultPri);
		String[] opPartNo = {"partNo"};
		ArrayList<String> resultPartNo = new ArrayList<>();
		SqlOut so21 = new SqlOut("select * from partOrder", opPartNo, resultPartNo);
		for (int i = 0; i < resultPartNo.size(); i++){
		if(resultorderNo == null || resultorderNo.size() == 0){
			String firstOrderNo = String.valueOf(1);
			SqlIn si17 = new SqlIn("INSERT INTO `Holt Distributors`.`order` (`orderNo`, `customerNo`, `customerPoNo`,"
					+ " `statu`, `partNo`, `partDescription`, `numberOrdered`, `price`) "
					+ "VALUES ('"+ firstOrderNo +"', '"+ cusNo +"', '"+ firstOrderNo + "', '"+ "ordered" +"', '"+resultPartNo.get(i) +"',"
							+ " '"+ resultDes.get(i) +"', '"+ resultUnits.get(i) +"', '"+ resultPri.get(i) +"');");
			SqlIn si18 = new SqlIn("INSERT INTO `Holt Distributors`.`partOrderVendor` (`orderNo`, `customerNo`,"
					+ " `partNo`, `partDescription`, `unit`, `partPrice`) "
					+ "VALUES ('"+ firstOrderNo +"', '"+ cusNo +"','"+resultPartNo.get(i) +"',"
							+ " '"+ resultDes.get(i) +"', '"+ resultUnits.get(i) +"', '"+ resultPri.get(i) +"');");
			resultorderNo.add(firstOrderNo);
		} else {
			String nextOrderNo = String.valueOf(Integer.parseInt(resultorderNo.get(resultorderNo.size() - 1)) + 1);
			SqlIn si17 = new SqlIn("INSERT INTO `Holt Distributors`.`order` (`orderNo`, `customerNo`, `customerPoNo`,"
					+ " `statu`, `partNo`, `partDescription`, `numberOrdered`, `price`) "
					+ "VALUES ('"+ nextOrderNo +"', '"+ cusNo +"', '"+ nextOrderNo + "', '"+ "ordered" +"', '"+resultPartNo.get(i) +"',"
							+ " '"+ resultDes.get(i) +"', '"+ resultUnits.get(i) +"', '"+ resultPri.get(i) +"');");
			SqlIn si18 = new SqlIn("INSERT INTO `Holt Distributors`.`partOrderVendor` (`orderNo`, `customerNo`,"
					+ " `partNo`, `partDescription`, `unit`, `partPrice`) "
					+ "VALUES ('"+ nextOrderNo +"', '"+ cusNo +"','"+resultPartNo.get(i) +"',"
							+ " '"+ resultDes.get(i) +"', '"+ resultUnits.get(i) +"', '"+ resultPri.get(i) +"');");
			resultorderNo.add(nextOrderNo);
			}
		}
		
		this.remove(jsp1);
		for (int i = 0; i < resultPartNo.size(); i++){
			SqlIn si17 = new SqlIn("DELETE FROM `Holt Distributors`.`partOrder` WHERE `partNo`='"+ resultPartNo.get(i) +"';");
		}
		for (int i = 0; i < jtfs1.size(); i++){
			jtfs1.get(i).setText("");
		}
		rows1 = new Vector<>();
		cols1  = new Vector<Vector<String>>(); 
		result1 = new ArrayList<String>();
		String[] str1 = {"partNo","partDescription", "partPrice", "unit","total"};
		int size1 = str1.length;
		SqlOut so2 = new SqlOut("select partNo,partDescription,partPrice,unit,total from partOrder where customerNo = "+ cusNo +"", str1, result1);
		insertCols(result1, cols1, 0 ,size1, size1);
		insortVector(rows1, str1);
		DefaultTableModel model1 = new DefaultTableModel(cols1, rows1);
 		jt1 = new JTable(model1);
 		jt1.getTableHeader().setPreferredSize(new Dimension(jt1.getColumnModel().getTotalColumnWidth(), 30));
		jsp1 = new JScrollPane(jt1);
		this.add(jsp1);
		jsp1.setBounds(0, 200, 1000, 200);
		this.setVisible(true);
	}
	public void editVendorButton(ActionEvent e){ // vendor edit information 
		this.remove(jsp);	
		if(!jtfs1.get(0).getText().equals("")){
			SqlIn si16 = new SqlIn("UPDATE `Holt Distributors`.`vender` SET `venderName`='"+ jtfs1.get(0).getText()+"' WHERE `venderNo`='"+ venNo+"';");
			}
		if(!jtfs1.get(1).getText().equals("")){
			SqlIn si17 = new SqlIn("UPDATE `Holt Distributors`.`vender` SET `venderAddress`='"+ jtfs1.get(1).getText()+"' WHERE `venderNo`='"+ venNo+"';");
			}
		if(!jtfs1.get(2).getText().equals("")){
			SqlIn si18 = new SqlIn("UPDATE `Holt Distributors`.`vender` SET `venderCity`='"+ jtfs1.get(2).getText()+"' WHERE `venderNo`='"+ venNo+"';");
			}
		if(!jtfs1.get(3).getText().equals("") && jtfs1.get(3).getText().length() <= 2){
			SqlIn si21 = new SqlIn("UPDATE `Holt Distributors`.`vender` SET `venderState`='"+ jtfs1.get(3).getText()+"' WHERE `venderNo`='"+ venNo+"';");
			}
		if(!jtfs1.get(4).getText().equals("") && jtfs1.get(4).getText().length() <= 5){
			SqlIn si22= new SqlIn("UPDATE `Holt Distributors`.`vender` SET `venderZip`='"+ jtfs1.get(4).getText()+"' WHERE `venderNo`='"+ venNo+"';");
			}
		
		for (int i = 0; i < jtfs1.size(); i++){
			jtfs1.get(i).setText("");
		}
		rows = new Vector<>();
		cols  = new Vector<Vector<String>>(); 
		result = new ArrayList<String>();
		String[] str = {"venderNo","venderName","venderAddress", "venderCity", "venderState", "venderZip"};
		String[] strLable = {"venderName","venderAddress", "venderCity", "venderState",
				"venderZip"};
		int size = str.length;
		SqlOut so1 = new SqlOut("select * from vender where venderNo = "+ venNo +"; ", str, result);
		insertCols(result, cols, 0 ,size, size);
		insortVector(rows, str);
		DefaultTableModel model = new DefaultTableModel(cols, rows);
 		jt = new JTable(model);
 		jt.getTableHeader().setPreferredSize(new Dimension(jt.getColumnModel().getTotalColumnWidth(), 30));
		jsp = new JScrollPane(jt);
		this.add(jp);
		jp.setBounds(0, 400, 1000, 200);
		this.add(jsp);
		jsp.setBounds(0, 0, 1000, 400);
		this.setVisible(true);
		
	}
	public void venterButton(ActionEvent e){
		this.remove(jsp);
		String[] opPartN = {"partNo"};
		ArrayList<String> resultPartNo = new ArrayList<>();
		SqlOut so19 = new SqlOut("select * from part", opPartN, resultPartNo);
		
		if(e.getActionCommand().equals("venter")){
		if(!jtfs1.get(0).getText().equals("")){
			SqlIn si1 = new SqlIn("INSERT INTO `Holt Distributors`.`part` "
					+ "(`partNo`,`partDescription`,`partPrice`, `venderNo`, `unit`) VALUES "
					+ "('" + jtfs1.get(0).getText() + "','"+ jtfs1.get(1).getText()+"','"+ jtfs1.get(2).getText()+"'"
							+ ", '"+ venNo +"','"+ jtfs1.get(3).getText() +"');");
		}
		
		}//item 1, button edit
		else if(e.getActionCommand().equals("vedit")){
		if(!jtfs1.get(0).getText().equals("")){
			if(!jtfs1.get(1).getText().equals("")){
				SqlIn si2 = new SqlIn("UPDATE `Holt Distributors`.`part` SET `partDescription`='" + jtfs1.get(1).getText() + "' "
					+ "WHERE `partNo`='" + jtfs1.get(0).getText() + "';"); 
			} else if(!jtfs1.get(2).getText().equals("")){
				SqlIn si2 = new SqlIn("UPDATE `Holt Distributors`.`part` SET `partPrice`='" + jtfs1.get(2).getText() + "' "
					+ "WHERE `partNo`='" + jtfs1.get(0).getText() + "';"); 
			} else if(!jtfs1.get(3).getText().equals("")){
				SqlIn si2 = new SqlIn("UPDATE `Holt Distributors`.`part` SET `unit`='" + jtfs1.get(3).getText() + "' "
						+ "WHERE `partNo`='" + jtfs1.get(0).getText() + "';"); 
			}
		}
		}//item 1, button delete
		else if(e.getActionCommand().equals("vdelete")){
		if(!jtfs1.get(0).getText().equals("")){
			SqlIn si3 = new SqlIn("DELETE FROM `Holt Distributors`.`part`"
					+ " WHERE `partNo`='"+jtfs1.get(0).getText()+"';");
			}
		}
		for (int i = 0; i < jtfs1.size(); i++){
			jtfs1.get(i).setText("");
		}
		rows = new Vector<>();
		cols  = new Vector<Vector<String>>(); 
		result = new ArrayList<String>();
		jtfs1 = new ArrayList<>();
		String[] str = {"partNo","partDescription","partPrice", "unit"};
		int size = str.length;
		SqlOut so1 = new SqlOut("select * from part where venderNo = "+ venNo +"", str, result);
		insertCols(result, cols, 0 ,size, size);
		insortVector(rows, str);
		DefaultTableModel model = new DefaultTableModel(cols, rows);
 		jt = new JTable(model);
 		jt.getTableHeader().setPreferredSize(new Dimension(jt.getColumnModel().getTotalColumnWidth(), 30));
		jsp = new JScrollPane(jt);
		this.add(jsp);
		jsp.setBounds(0, 0, 1000, 400);
		this.repaint();
	}
	public void reorderButton(ActionEvent e){ // vendor reorder
		this.remove(jsp);
		
		String[] opPartN = {"partNo"};
		ArrayList<String> resultPartNo = new ArrayList<>();
		SqlOut so19 = new SqlOut("select * from part where venderNo = "+ venNo +"", opPartN, resultPartNo);
		
		if (!jtfs1.get(0).getText().equals("") && !jtfs1.get(1).getText().equals("")){
				if (resultPartNo.contains(jtfs1.get(0).getText())){
					String[] opUnit = {"unit"};
					ArrayList<String> resultUnit = new ArrayList<>();
					SqlOut so20 = new SqlOut("select * from part where partNo = "+ jtfs1.get(0).getText() +"", opUnit, resultUnit);
			int a = Integer.parseInt(resultUnit.get(0)) + Integer.parseInt(jtfs1.get(1).getText());
					SqlIn si19 = new SqlIn("UPDATE `Holt Distributors`.`part` SET `unit`='"+ a +""
							+ "' WHERE `partNo`='"+ jtfs1.get(0).getText() +"';");
				}
				}
			
		for (int i = 0; i < jtfs1.size(); i++){
			jtfs1.get(i).setText("");
		}
		//
		rows = new Vector<>();
		cols  = new Vector<Vector<String>>(); 
		result = new ArrayList<String>();
		String[] str = {"partNo","partDescription","partPrice","unit"};
		String[] strLable1 = {"partNo","unit","orderNo","orderNo"};
		int size = str.length;
		SqlOut so1 = new SqlOut("select * from part where venderNo = "+ venNo +"", str, result);
		insertCols(result, cols, 0 ,size, size);
		insortVector(rows, str);
		DefaultTableModel model = new DefaultTableModel(cols, rows);
 		jt = new JTable(model);
 		jt.getTableHeader().setPreferredSize(new Dimension(jt.getColumnModel().getTotalColumnWidth(), 30));
 		jsp = new JScrollPane(jt);
 		this.add(jsp);
		jsp.setBounds(0, 0, 1000, 200);
		this.setVisible(true);
		
		
	}
	public void shipButton(ActionEvent e){ // vendor ship // need change
		this.remove(jsp);
		this.remove(jsp1);
		String[] opOrderN = {"orderNo"};
		ArrayList<String> resultOrderNo = new ArrayList<>();
		SqlOut so19 = new SqlOut("select * from `order`", opOrderN, resultOrderNo);
		if (!jtfs1.get(2).getText().equals("") && resultOrderNo.contains(jtfs1.get(2).getText())){
			String[] opUnit = {"unit"};
			ArrayList<String> resultUnit = new ArrayList<>();
			SqlOut so20 = new SqlOut("select unit from part where partNo = (SELECT partNo FROM `Holt Distributors`.`order` where `order`.orderNo = "+ jtfs1.get(2).getText()+");", opUnit, resultUnit);
			String[] opOrderUnit = {"numberOrdered"};
			ArrayList<String> resultOrderUnit = new ArrayList<>();
			SqlOut so21 = new SqlOut("select * from `order` where orderNo = "+ jtfs1.get(2).getText() +"", opOrderUnit, resultOrderUnit);
			// refresh jsp, jsp1, add report
			String[] opTotal = {"total"};
			ArrayList<String> resultTotal = new ArrayList<>();
			SqlOut so0 = new SqlOut("select * from `order` where orderNo = '"+ jtfs1.get(2).getText()+"'", opTotal, resultTotal);
			double totalPrice = Double.parseDouble(resultTotal.get(0));
			String[] opCusNo = {"customerNo"};
			ArrayList<String> resultCusNo = new ArrayList<>();
			SqlOut so10 = new SqlOut("select customerNo from `order` where orderNo = '"+ jtfs1.get(2).getText()+"'", opCusNo, resultCusNo);
			int customerNumber = Integer.parseInt(resultCusNo.get(0));
			String[] oprepNo = {"repNo"};
			ArrayList<String> resultrepNo = new ArrayList<>();
			SqlOut so11 = new SqlOut("select repNo from `customer` where customerNo = '"+ customerNumber +"'", oprepNo, resultrepNo);
			int salesRepNumber = Integer.parseInt(resultrepNo.get(0));
			String[] opPartNo = {"partNo"};
			ArrayList<String> resultPartNo = new ArrayList<>();
			SqlOut so16 = new SqlOut("select partNo from `order` where orderNo = '"+ jtfs1.get(2).getText()+"'", opPartNo, resultPartNo);
			int partNumber = Integer.parseInt(resultPartNo.get(0));
			String[] opcommissionRate = {"commissionRate"}; // sales rep
			ArrayList<String> resultcommissionRate = new ArrayList<>();
			SqlOut so15 = new SqlOut("select commissionRate from `salesRepAccount` where repNo = '"+ salesRepNumber +"'", opcommissionRate, resultcommissionRate);
			double cr = Double.parseDouble(resultcommissionRate.get(0));
			
		
			
			int a = Integer.parseInt(resultUnit.get(0)) - Integer.parseInt(resultOrderUnit.get(0));
			SqlIn si19 = new SqlIn("UPDATE `Holt Distributors`.`part` SET `unit`=  "+a+" WHERE `partNo`=(select partNo from `order` where orderNo = "+jtfs1.get(2).getText()+");");
			SqlIn si17 = new SqlIn("DELETE FROM `Holt Distributors`.`partOrderVendor` WHERE `orderNo`='"+ jtfs1.get(2).getText() +"';");
			// add report
			SqlIn si16 = new SqlIn("UPDATE `Holt Distributors`.`order` SET `statu`='"+ "shiped" +""
					+ "' WHERE `orderNo`='"+ jtfs1.get(2).getText() +"';");
			//customer account change 	
			String[] opMtd = {"MTDsales"};
			ArrayList<String> resultMtd = new ArrayList<>();
			SqlOut so1 = new SqlOut("select MTDsales from `customerAccount` where customerNo = '"+ customerNumber +"'", opMtd, resultMtd);
			double mtd = totalPrice + Double.parseDouble(resultMtd.get(0));
			String[] opYtd = {"YTDsales"};
			ArrayList<String> resultYtd = new ArrayList<>();
			SqlOut so2 = new SqlOut("select YTDsales from `customerAccount` where customerNo = '"+ customerNumber +"'", opYtd, resultYtd);
			double ytd = totalPrice + Double.parseDouble(resultYtd.get(0));
			String[] opCurrentBalance = {"currentBalance"};
			ArrayList<String> resultCurrentBalance = new ArrayList<>();
			SqlOut so3 = new SqlOut("select currentBalance from `customerAccount` where customerNo = '"+ customerNumber +"'", opCurrentBalance, resultCurrentBalance);
			double cb = Double.parseDouble(resultCurrentBalance.get(0)) - totalPrice; 
			String[] opCreditLimit = {"creditLimit"};
			ArrayList<String> resultCreditLimit = new ArrayList<>();
			SqlOut so4 = new SqlOut("select creditLimit from `customerAccount` where customerNo = '"+ customerNumber +"'", opCreditLimit, resultCreditLimit);
			double cl = totalPrice + Double.parseDouble(resultCreditLimit.get(0));
			
			SqlIn si2 = new SqlIn("UPDATE `Holt Distributors`.`customerAccount` SET `MTDsales`='"+ mtd +""
					+ "' WHERE `customerNo`='"+ customerNumber +"';");
			SqlIn si3 = new SqlIn("UPDATE `Holt Distributors`.`customerAccount` SET `YTDsales`='"+ ytd +""
					+ "' WHERE `customerNo`='"+ customerNumber +"';");
			SqlIn si4 = new SqlIn("UPDATE `Holt Distributors`.`customerAccount` SET `currentBalance`='"+ cb +""
					+ "' WHERE `customerNo`='"+ customerNumber +"';");
			SqlIn si5 = new SqlIn("UPDATE `Holt Distributors`.`customerAccount` SET `creditLimit`='"+ cl +""
					+ "' WHERE `customerNo`='"+ customerNumber +"';");
			// sales rep account change
			String[] opSmtd = {"MTDsales"};
			ArrayList<String> resultSmtd = new ArrayList<>();
			SqlOut so99 = new SqlOut("select MTDsales from `salesRepAccount` where repNo = '"+ salesRepNumber +"'", opSmtd, resultSmtd);
			double smtd = totalPrice + Double.parseDouble(resultMtd.get(0));
			String[] opSytd = {"YTDsales"};
			ArrayList<String> resultSytd = new ArrayList<>();
			SqlOut so12 = new SqlOut("select YTDsales from `salesRepAccount` where repNo = '"+ salesRepNumber +"'", opSytd, resultSytd);
			double sytd = totalPrice + Double.parseDouble(resultYtd.get(0));
			String[] opMTDcommission = {"MTDcommission"};
			ArrayList<String> resultMTDcommission = new ArrayList<>();
			SqlOut so13 = new SqlOut("select MTDcommission from `salesRepAccount` where repNo = '"+ salesRepNumber +"'", opMTDcommission, resultMTDcommission);
			double smtdc = totalPrice * cr + Double.parseDouble(resultMTDcommission.get(0));
			String[] opYTDcommission = {"YTDcommission"};
			ArrayList<String> resultYTDcommission = new ArrayList<>();
			SqlOut so14 = new SqlOut("select YTDcommission from `salesRepAccount` where repNo = '"+ salesRepNumber +"'", opYTDcommission, resultYTDcommission);
			double sytdc = totalPrice * cr + Double.parseDouble(resultYTDcommission.get(0));
			
			
			SqlIn si12 = new SqlIn("UPDATE `Holt Distributors`.`salesRepAccount` SET `MTDsales`='"+ smtd +""
					+ "' WHERE `repNo`='"+ salesRepNumber +"';");
			SqlIn si13 = new SqlIn("UPDATE `Holt Distributors`.`salesRepAccount` SET `YTDsales`='"+ sytd +""
					+ "' WHERE `repNo`='"+ salesRepNumber +"';");
			SqlIn si14 = new SqlIn("UPDATE `Holt Distributors`.`salesRepAccount` SET `MTDcommission`='"+ smtdc +""
					+ "' WHERE `repNo`='"+ salesRepNumber +"';");
			SqlIn si15 = new SqlIn("UPDATE `Holt Distributors`.`salesRepAccount` SET `YTDcommission`='"+ sytdc +""
					+ "' WHERE `repNo`='"+ salesRepNumber +"';");
			
			// part account change
						String[] opPmtd = {"MTDsales"};
						ArrayList<String> resultPmtd = new ArrayList<>();
						SqlOut so31 = new SqlOut("select MTDsales from `partAccount` where partNo = '"+ partNumber +"'", opPmtd, resultPmtd);
						double pmtd = totalPrice + Double.parseDouble(resultPmtd.get(0));
						String[] opPytd = {"YTDsales"};
						ArrayList<String> resultPytd = new ArrayList<>();
						SqlOut so32 = new SqlOut("select YTDsales from `partAccount` where partNo = '"+ partNumber +"'", opPytd, resultPytd);
						double pytd = totalPrice + Double.parseDouble(resultPytd.get(0));
						
						
						SqlIn si21 = new SqlIn("UPDATE `Holt Distributors`.`partAccount` SET `MTDsales`='"+ pmtd +""
								+ "' WHERE `partNo`='"+ partNumber +"';");
						SqlIn si22 = new SqlIn("UPDATE `Holt Distributors`.`partAccount` SET `YTDsales`='"+ pytd +""
								+ "' WHERE `partNo`='"+ partNumber +"';");
		}
		
		for (int i = 0; i < jtfs1.size(); i++){
			jtfs1.get(i).setText("");
		}
		rows = new Vector<>();
		cols  = new Vector<Vector<String>>();
		rows1 = new Vector<>();
		cols1  = new Vector<Vector<String>>(); 
		result = new ArrayList<String>();
		result1 = new ArrayList<String>();
		String[] str = {"partNo","partDescription","partPrice","unit"};
		String[] strLable1 = {"partNo","unit","orderNo","orderNo"};
		int size = str.length;
		SqlOut so1 = new SqlOut("select * from part where venderNo = "+ venNo +"", str, result);
		insertCols(result, cols, 0 ,size, size);
		insortVector(rows, str);
		DefaultTableModel model = new DefaultTableModel(cols, rows);
 		jt = new JTable(model);
 		jt.getTableHeader().setPreferredSize(new Dimension(jt.getColumnModel().getTotalColumnWidth(), 30));
 		jsp = new JScrollPane(jt);
 		
 		String[] str1 = {"orderNo","customerNo", "partNo", "partDescription","unit","partPrice","total"};
		int size1 = str1.length;
		SqlOut so2 = new SqlOut("select orderNo,customerNo, `partOrderVendor`.partNo, partDescription,unit, partPrice, total from `partOrderVendor` left join vendorPart on "
				+ "vendorPart.partNo = `partOrderVendor`.partNo where vendorPart.vendorNo = "+ venNo +";", str1, result1);
		insertCols(result1, cols1, 0 ,size1, size1);
		insortVector(rows1, str1);
		DefaultTableModel model1 = new DefaultTableModel(cols1, rows1);
 		jt1 = new JTable(model1);
 		jt1.getTableHeader().setPreferredSize(new Dimension(jt1.getColumnModel().getTotalColumnWidth(), 30));
		jsp1 = new JScrollPane(jt1);
		this.add(jsp);
		jsp.setBounds(0, 0, 1000, 200);
		this.add(jsp1);
		jsp1.setBounds(0, 200, 1000, 200);
		this.setVisible(true);
		
	}
	public void cancelButton(ActionEvent e){
		this.remove(jsp1);
		
		String[] opOrderN = {"orderNo"};
		ArrayList<String> resultOrderNo = new ArrayList<>();
		SqlOut so19 = new SqlOut("select * from `order`", opOrderN, resultOrderNo);
		if (!jtfs1.get(3).getText().equals("") && resultOrderNo.contains(jtfs1.get(3).getText())){
			SqlIn si17 = new SqlIn("DELETE FROM `Holt Distributors`.`partOrderVendor` WHERE `orderNo`='"+ jtfs1.get(3).getText() +"';");
			SqlIn si16 = new SqlIn("UPDATE `Holt Distributors`.`order` SET `statu`='"+ "canceled" +""
					+ "' WHERE `orderNo`='"+ jtfs1.get(3).getText() +"';");
		}
		
		for (int i = 0; i < jtfs1.size(); i++){
			jtfs1.get(i).setText("");
		}
		rows1 = new Vector<>();
		cols1  = new Vector<Vector<String>>(); 
		result1 = new ArrayList<String>();
		String[] str1 = {"orderNo","customerNo", "partNo", "partDescription","unit","partPrice","total"};
		int size1 = str1.length;
		SqlOut so2 = new SqlOut("select orderNo,customerNo, `partOrderVendor`.partNo, partDescription,unit, partPrice, total from `partOrderVendor` left join vendorPart on "
				+ "vendorPart.partNo = `partOrderVendor`.partNo where vendorPart.vendorNo = "+ venNo +";", str1, result1);
		insertCols(result1, cols1, 0 ,size1, size1);
		insortVector(rows1, str1);
		DefaultTableModel model1 = new DefaultTableModel(cols1, rows1);
 		jt1 = new JTable(model1);
 		jt1.getTableHeader().setPreferredSize(new Dimension(jt1.getColumnModel().getTotalColumnWidth(), 30));
		jsp1 = new JScrollPane(jt1);
		this.add(jsp1);
		jsp1.setBounds(0, 200, 1000, 200);
		this.setVisible(true);
	}
	public void rEdit(ActionEvent e){ // change
		this.remove(jsp);	
		if(!jtfs1.get(0).getText().equals("")){
			SqlIn si16 = new SqlIn("UPDATE `Holt Distributors`.`salesRep` SET `repName`='"+ jtfs1.get(0).getText()+"' WHERE `repNo`='"+ salesNo+"';");
			}
		if(!jtfs1.get(1).getText().equals("")){
			SqlIn si17 = new SqlIn("UPDATE `Holt Distributors`.`salesRep` SET `repAddress`='"+ jtfs1.get(1).getText()+"' WHERE `repNo`='"+ salesNo+"';");
			}
		if(!jtfs1.get(2).getText().equals("")){
			SqlIn si18 = new SqlIn("UPDATE `Holt Distributors`.`salesRep` SET `repCity`='"+ jtfs1.get(2).getText()+"' WHERE `repNo`='"+ salesNo+"';");
			}
		if(!jtfs1.get(3).getText().equals("") && jtfs1.get(3).getText().length() <= 2){
			SqlIn si21 = new SqlIn("UPDATE `Holt Distributors`.`salesRep` SET `repState`='"+ jtfs1.get(3).getText()+"' WHERE `repNo`='"+ salesNo+"';");
			}
		if(!jtfs1.get(4).getText().equals("") && jtfs1.get(4).getText().length() <= 5){
			SqlIn si22= new SqlIn("UPDATE `Holt Distributors`.`salesRep` SET `repZip`='"+ jtfs1.get(4).getText()+"' WHERE `repNo`='"+ salesNo+"';");
			}
		
		for (int i = 0; i < jtfs1.size(); i++){
			jtfs1.get(i).setText("");
		}
		rows = new Vector<>();
		cols  = new Vector<Vector<String>>(); 
		result = new ArrayList<String>();
		String[] str = {"repNo","repName","repAddress", "repCity", "repState", "repZip","territoryNo"};
		String[] strLable = {"repName","repAddress", "repCity", "repState",
				"repZip"};
		int size = str.length;
		SqlOut so1 = new SqlOut("select * from salesRep where repNo = "+ salesNo +"; ", str, result);
		insertCols(result, cols, 0 ,size, size);
		insortVector(rows, str);
		DefaultTableModel model = new DefaultTableModel(cols, rows);
 		jt = new JTable(model);
 		jt.getTableHeader().setPreferredSize(new Dimension(jt.getColumnModel().getTotalColumnWidth(), 30));
		jsp = new JScrollPane(jt);
		this.add(jp);
		jp.setBounds(0, 400, 1000, 200);
		this.add(jsp);
		jsp.setBounds(0, 0, 1000, 400);
		this.setVisible(true);
		
	}
	public void salesButton(ActionEvent e){
		if(e.getActionCommand().equals("sEnter")){
			
		} else if (e.getActionCommand().equals("sEdit")){
			
		} else if (e.getActionCommand().equals("sDelete")){
			
		}
	}
		
	
}
	