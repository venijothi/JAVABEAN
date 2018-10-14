# JAVABEAN
package oxygen.com;
public class Javabean {
private int id;
private String name;
public int rollno;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getRollno() {
	return rollno;
}
}
public class Jb {
public static void main(String[] args) {
Javabean j=new Javabean();
j.setId(101);
System.out.println(j.getId());
j.setName("abc");
System.out.println(j.getName());
	}
  }
OUTPUT:
101
abc
