package finalProject;

import java.awt.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Vector;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

class ReportPanel extends JPanel{
	int cusNo;
	int venNo;
	int salesNo;
	JScrollPane jsp = null;
	JTable jt = null;
	int x, y, h, w;
	int bx =700, by = 150, bw = 80, bh = 50;
	Vector<String> rows = null;
	Vector<Vector<String>> cols = null;
	ArrayList<String> result = null;
	
	public void paint(Graphics g){
		super.paint(g);
	}
	
	public ReportPanel (){
		
	}
	public ReportPanel (int view){
		x = 10; y = 10; w =100; h =20;
		rows = new Vector<>();
		cols  = new Vector<Vector<String>>(); 
		result = new ArrayList<String>();
		if (view == 1){
			setReportPanel1();
		}
		else if(view == 2){
			setReportPanel2();
		}
		else if(view == 3){
			setReportPanel3();
		}
		else if(view == 4){
			setReportPanel4();
		}
		else if(view == 5){
			setReportPanel5();
		}
		else if(view == 6){
			setReportPanel6();
		}
		else if(view == 7){
			setReportPanel7();
		}
		else if(view == 8){
			setReportPanel8();
		}
		else if(view == 9){
			setReportPanel9();
		}
		else if(view == 10){
			setReportPanel10();
		}
		else if(view == 11){
			setReportPanel11();
		}
		else if(view == 12){
			setReportPanel12();
		}
		else if(view == 13){
			setReportPanel13();
		}
		else if(view == 14){
			setReportPanel14();
		}
		else if(view == 15){
			setReportPanel15();
		}
		this.add(jsp);
		jsp.setBounds(0, 0, 1000, 600);
		this.setVisible(true);
	}
	public ReportPanel(int view, int cusNo){
		this.cusNo = cusNo;
		x = 10; y = 10; w =100; h =20;
		rows = new Vector<>();
		cols  = new Vector<Vector<String>>(); 
		result = new ArrayList<String>();
		if (view == 16){
			setReportPanel16(cusNo);
		} else if (view == 17){
			setReportPanel17(cusNo);
		} else if (view == 18){
			setReportPanel18(cusNo);
		} else if(view == 19){
			this.salesNo = cusNo;
			setReportPanel19(salesNo);
		} else if(view == 20){
			this.salesNo = cusNo;
			setReportPanel20(salesNo);
		}
		
		this.add(jsp);
		jsp.setBounds(0, 0, 1000, 600);
		this.setVisible(true);
	}
	
	
	public void setReportPanel1(){
		String[] str = {"territoryNo","territoryName","repNo","repName","customerNo","customerLastName", "customerFirstName"};
		int size = str.length;
		SqlOut so1 = new SqlOut("select Territory.territoryNo, Territory.territoryName,  "
				+ "salesRep.repNo , salesRep.repName, customer.customerNo, customer.customerLastName, "
				+ "customer.customerFirstName from Territory left join(salesRep left join customer on salesRep.repNo = "
				+ "customer.repNo) on Territory.territoryNo = salesRep.territoryNo order by Territory.territoryNo;", str, result);
		insertCols(result, cols, 0 ,size, size);
		insortVector(rows, str);
		DefaultTableModel model = new DefaultTableModel(cols, rows);
 		jt = new JTable(model);
 		jt.getTableHeader().setPreferredSize(new Dimension(jt.getColumnModel().getTotalColumnWidth(), 30));
		jsp = new JScrollPane(jt);	
	}
	public void setReportPanel2(){
		String[] str = {"customerNo","customerFirstName","customerLastName","Address","CITY", "STATE", "ZIP",
				"repNo","repName","territoryName"};
		int size = str.length;
		SqlOut so1 = new SqlOut("select customer.customerNo, customer.customerFirstName, customer.customerLastName,"
				+ "Customer_ship_to.Address, Customer_ship_to.CITY,Customer_ship_to.STATE,"
				+ "Customer_ship_to.ZIP,salesRep.repNo, salesRep.repName,"
				+ "Territory.territoryName from"
				+ "(customer left join (salesRep left join Territory on Territory.territoryNo = salesRep.territoryNo) "
				+ "on salesRep.repNo = customer.repNo) left join Customer_ship_to on Customer_ship_to.customerNo = customer.customerNo;"
				, str, result);
		insertCols(result, cols, 0 ,size, size);
		insortVector(rows, str);
		DefaultTableModel model = new DefaultTableModel(cols, rows);
 		jt = new JTable(model);
 		jt.getTableHeader().setPreferredSize(new Dimension(jt.getColumnModel().getTotalColumnWidth(), 30));
		jsp = new JScrollPane(jt);	
	}
	public void setReportPanel3(){ // order
		String[] str = {"customerNo","orderNo","partNo","partDescription","numberOrdered","price", "total"};
		int size = str.length;
		SqlOut so1 = new SqlOut("select customerNo, orderNo, partNo ,partDescription, numberOrdered , price,total from `order`order by customerNo;", str, result);
		insertCols(result, cols, 0 ,size, size);
		insortVector(rows, str);
		DefaultTableModel model = new DefaultTableModel(cols, rows);
 		jt = new JTable(model);
 		jt.getTableHeader().setPreferredSize(new Dimension(jt.getColumnModel().getTotalColumnWidth(), 30));
		jsp = new JScrollPane(jt);	
	}
	public void setReportPanel4(){ //order by item
		String[] str = {"partNo","partDescription","customerNo","orderNo","numberOrdered","price", "total"};
		int size = str.length;
		SqlOut so1 = new SqlOut("select partNo ,partDescription, customerNo, orderNo,  numberOrdered , price,total from `order`order by customerNo;", str, result);
		insertCols(result, cols, 0 ,size, size);
		insortVector(rows, str);
		DefaultTableModel model = new DefaultTableModel(cols, rows);
 		jt = new JTable(model);
 		jt.getTableHeader().setPreferredSize(new Dimension(jt.getColumnModel().getTotalColumnWidth(), 30));
		jsp = new JScrollPane(jt);	
		}
	public void setReportPanel5(){
	
	}
	public void setReportPanel6(){
	
	}
	public void setReportPanel7(){
		String[] str = {"partNo","partDescription","partPrice","MTDsales","YTDsales", "unit"};
		int size = str.length;
		SqlOut so1 = new SqlOut("select part.partNo, part.partDescription, part.partPrice,partAccount.MTDsales, "
				+ "partAccount.YTDsales,part.unit from part left join partAccount on part.partNo = partAccount.partNo;"
				, str, result);
		insertCols(result, cols, 0 ,size, size);
		insortVector(rows, str);
		DefaultTableModel model = new DefaultTableModel(cols, rows);
 		jt = new JTable(model);
 		jt.getTableHeader().setPreferredSize(new Dimension(jt.getColumnModel().getTotalColumnWidth(), 30));
		jsp = new JScrollPane(jt);	
	}
	public void setReportPanel8(){
	
	}
	public void setReportPanel9(){
		String[] str = {"venderNo","venderName","venderAddress","venderCity","venderState","venderZip", "partNo","partDescription",
				"partPrice","unit"};
		int size = str.length;
		SqlOut so1 = new SqlOut("select vender.venderNo, vender.venderName,vender.venderAddress,vender.venderCity, vender.venderState,vender.venderZip,"
				+ "part.partNo,part.partDescription,part.partPrice, part.unit from vender left join part "
				+ "on vender.venderNo = part.venderNo;", str, result);
		insertCols(result, cols, 0 ,size, size);
		insortVector(rows, str);
		DefaultTableModel model = new DefaultTableModel(cols, rows);
 		jt = new JTable(model);
 		jt.getTableHeader().setPreferredSize(new Dimension(jt.getColumnModel().getTotalColumnWidth(), 30));
		jsp = new JScrollPane(jt);	
	}
	public void setReportPanel10(){
	
	}
	public void setReportPanel11(){
	
	}
	public void setReportPanel12(){
	
	}
	public void setReportPanel13(){
	
	}
	public void setReportPanel14(){
		String[] str = {"repNo","repName","repAddress","repCity","repState","repZip", "MTDsales","YTDsales","MTDcommission","YTDcommission","commissionRate"};
		int size = str.length;
		SqlOut so1 = new SqlOut("select salesRep.repNo, salesRep.repName, salesRep.repAddress,salesRep.repCity,salesRep.repState,salesRep.repZip,"
				+ "salesRepAccount.MTDsales,salesRepAccount.YTDsales,salesRepAccount.MTDcommission,salesRepAccount.YTDcommission,salesRepAccount.commissionRate"
				+ "from salesRep left join salesRepAccount on salesRep.repNo = salesRepAccount.repNo;", str, result);
		insertCols(result, cols, 0 ,size, size);
		insortVector(rows, str);
		DefaultTableModel model = new DefaultTableModel(cols, rows);
 		jt = new JTable(model);
 		jt.getTableHeader().setPreferredSize(new Dimension(jt.getColumnModel().getTotalColumnWidth(), 30));
		jsp = new JScrollPane(jt);	
	}
	public void setReportPanel15(){
	
	}
	public void setReportPanel16(int cusNo){ // customer account
		String[] str = {"customerNo","MTDsales","YTDsales","currentBalance","creditLimit"};
		int size = str.length;
		SqlOut so1 = new SqlOut("SELECT * FROM `Holt Distributors`.customerAccount where customerNo = "+ cusNo +";", str, result);
		insertCols(result, cols, 0 ,size, size);
		insortVector(rows, str);
		DefaultTableModel model = new DefaultTableModel(cols, rows);
 		jt = new JTable(model);
 		jt.getTableHeader().setPreferredSize(new Dimension(jt.getColumnModel().getTotalColumnWidth(), 30));
		jsp = new JScrollPane(jt);	
	}
	public void setReportPanel17(int cusNo){ //customer order
		String[] str = {"orderNo","customerNo","customerPoNo","statu","partNo","partDescription", "numberOrdered", "price","total"};
		int size = str.length;
		SqlOut so1 = new SqlOut("SELECT * FROM `Holt Distributors`.order where customerNo = "+ cusNo +";", str, result);
		insertCols(result, cols, 0 ,size, size);
		insortVector(rows, str);
		DefaultTableModel model = new DefaultTableModel(cols, rows);
 		jt = new JTable(model);
 		jt.getTableHeader().setPreferredSize(new Dimension(jt.getColumnModel().getTotalColumnWidth(), 30));
		jsp = new JScrollPane(jt);	
	}
	public void setReportPanel18(int venNo){  // vendor order
		String[] str = {"orderNo","customerNo","customerPoNo","statu","partNo","partDescription", "numberOrdered", "price","total"};
		int size = str.length;
		SqlOut so1 = new SqlOut("select orderNo,customerNo,customerPoNo,statu,`order`.partNo,partDescription,numberOrdered,price,total from `order` left join vendorPart on "
				+ "vendorPart.partNo = `order`.partNo where vendorPart.vendorNo = "+ venNo +";", str, result);
		insertCols(result, cols, 0 ,size, size);
		insortVector(rows, str);
		DefaultTableModel model = new DefaultTableModel(cols, rows);
 		jt = new JTable(model);
 		jt.getTableHeader().setPreferredSize(new Dimension(jt.getColumnModel().getTotalColumnWidth(), 30));
		jsp = new JScrollPane(jt);	
	}
	public void setReportPanel19(int salesNo){ // sales rep account
		String[] str = {"repNo","MTDsales","YTDsales","MTDcommission","YTDcommission","commissionRate"};
		int size = str.length;
		SqlOut so1 = new SqlOut("SELECT * FROM `Holt Distributors`.salesRepAccount where repNo = "+ salesNo +";", str, result);
		insertCols(result, cols, 0 ,size, size);
		insortVector(rows, str);
		DefaultTableModel model = new DefaultTableModel(cols, rows);
 		jt = new JTable(model);
 		jt.getTableHeader().setPreferredSize(new Dimension(jt.getColumnModel().getTotalColumnWidth(), 30));
		jsp = new JScrollPane(jt);	
	}
	public void setReportPanel20(int salesNo){
		String[] str = {"orderNo","customerNo","customerPoNo","statu","partNo","partDescription", "numberOrdered", "price","total"};
		int size = str.length;
		SqlOut so1 = new SqlOut("select orderNo,customerNo,customerPoNo,statu,"
				+ "`order`.partNo,partDescription,numberOrdered,price,total from `order` where "
				+ "customerNo in (select customerNo from customer where repNo = "+ salesNo +");", str, result);
		insertCols(result, cols, 0 ,size, size);
		insortVector(rows, str);
		DefaultTableModel model = new DefaultTableModel(cols, rows);
 		jt = new JTable(model);
 		jt.getTableHeader().setPreferredSize(new Dimension(jt.getColumnModel().getTotalColumnWidth(), 30));
		jsp = new JScrollPane(jt);	
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
			}
			else if( i > 5 && i < 10){
				int a = 0;
				for(int j = 5; j < jls.length; j++){
					jp.add(jls[j]);
					jls[j].setBounds(x + 300, y + (a * 30), w, h);
					jp.add(jtfs[start]);
					jtfs[start].setBounds(x + 410, y + (a * 30), w, h);
					a++;
					start++;
				}
			}
		}
	}
}
