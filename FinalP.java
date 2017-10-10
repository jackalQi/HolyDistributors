package finalProject;

import java.util.*;

import javax.swing.*;;

public class FinalP extends JFrame{
	HashMap<String, String> adminLogin;
	HashMap<String, String> adminName;
	HashMap<String, String> customerLogin;
	HashMap<String, String> customerName;
	HashMap<String, String> salesLogin;
	HashMap<String, String> salesName;
	HashMap<String, String> vendorLogin;
	HashMap<String, String> vendorName;
	StartPanel sp;
	public static void main(String[] args){
		FinalP p = new FinalP();
	}
	public FinalP(){
		adminLogin = new HashMap<>();
		adminName = new HashMap<>();
		customerLogin = new HashMap<>();
		customerName = new HashMap<>();
		salesLogin = new HashMap<>();
		salesName = new HashMap<>();
		vendorLogin = new HashMap<>();
		vendorName = new HashMap<>();
		
		setCustomer(customerLogin, customerName);
		setSales(salesLogin, salesName);
		setVendor(vendorLogin, vendorName);
		setAdmin(adminLogin, adminName);
		sp = new StartPanel(adminLogin,adminName,salesLogin,salesName,vendorLogin,vendorName,customerLogin,customerName);
		this.add(sp);
		this.setSize(1000, 800);
		this.setLocation(100, 50);
		this.setVisible(true);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void setAdmin(HashMap<String, String> adminLogin, HashMap<String, String> adminName){
		adminLogin.put("admin", "admin");
		adminName.put("admin", "Qi");
	}
	public void setVendor(HashMap<String, String> adminLogin, HashMap<String, String> adminName){
		//vendor login
				ArrayList<String> resultV = new ArrayList<>();
				String[] strV = {"venderNo"};
				SqlOut so2 = new SqlOut("select venderNo from vender;"
						, strV, resultV);
				for (int i = 0; i < resultV.size(); i++){
					adminLogin.put(resultV.get(i), resultV.get(i));
				}
				//vendor
				ArrayList<String> nameV = new ArrayList<>();
				String[] strV2 = {"venderName"};
				SqlOut so4 = new SqlOut("select venderName from vender;"
						, strV2, nameV);
				for (int i = 0; i < resultV.size(); i++){
					adminName.put(resultV.get(i), nameV.get(i));
				}
	}
	public void setCustomer(HashMap<String, String> adminLogin, HashMap<String, String> adminName){
		//customer login
				ArrayList<String> result = new ArrayList<>();
				String[] str = {"customerNo"};
				SqlOut so1 = new SqlOut("select customerNo from customer;"
						, str, result);
				for (int i = 0; i < result.size(); i++){
					adminLogin.put(result.get(i), result.get(i));
				}
		
		// customer
				ArrayList<String> name = new ArrayList<>();
				String[] str2 = {"customerFullName"};
				SqlOut so2 = new SqlOut("select customerFullName from customer;"
						, str2, name);
				for (int i = 0; i < result.size(); i++){
					adminName.put(result.get(i), name.get(i));
				}
	}
	public void setSales(HashMap<String, String> adminLogin, HashMap<String, String> adminName){
		// sales login
		ArrayList<String> resultR = new ArrayList<>();
		String[] strR = {"repNo"};
		SqlOut so3 = new SqlOut("select repNo from salesRep;"
				, strR, resultR);
		for (int i = 0; i < resultR.size(); i++){
			adminLogin.put(resultR.get(i), resultR.get(i));
		}
		// sales
		ArrayList<String> nameR = new ArrayList<>();
		String[] strR2 = {"repName"};
		SqlOut so5 = new SqlOut("select repName from salesRep;"
				, strR2, nameR);
		for (int i = 0; i < resultR.size(); i++){
			adminName.put(resultR.get(i), nameR.get(i));
		}
	}
}
