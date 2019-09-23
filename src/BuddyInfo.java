

public class BuddyInfo {
 public BuddyInfo(String n, String a, int b){
  setAddress(a);
  setName(n);
  setPN(b);
 }
 private String name;
 private String address;
 private int phone;
 public String getName() {
   return name;
 }
 public void setName(String name) {
  this.name=name;
 }
 public void setAddress(String address) {
	  this.address=address;
	 }
 public void setPN(int phone) {
	  this.phone=phone;
	 }

 
 public static void main(String[] args) {
  BuddyInfo x=new BuddyInfo("Xi","tiantang",1234);
  System.out.println("Hello "+x.name);
 }
}