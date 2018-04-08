package weekendClass;

public class House {
	    //variables 
	    int address;
	    String houseName;
	    char houseUnit;
	     
	    //Constructor 1 
	    public House() {
	    	System.out.println("Constructor1 default:: " + houseName);
	    }
	    //Constructor 2
	    public House(String houseName) {
	        this.houseName = houseName;
	        System.out.println("Constructor2 one argument:: " +houseName);
	    } 
	   
	  //Constructor 3
	    public House(String houseName, int address) {
	        this.houseName = houseName;
	        this.address = address;
	        System.out.println("Constructor3 two aruguments:: " +houseName + " "+ address);
	    } 
	     
	  //Constructor 4
	    public House(String houseName, int address, char houseUnit) {
	        this.houseName = houseName;
	        this.address = address;
	        this.houseUnit = houseUnit;
	        System.out.println("Constructor4 three arguments:: " +houseName + " "+ address +" "+houseUnit);
	    } 
	     
	     
	    //methods
	    public void setHouseName(String houseName) {
	                this.houseName = houseName;
	                System.out.println("Method public void setHouseName one argument:: "+this.houseName);
	    }
	    public void watchTV() {
	        System.out.println("Method public void watchTV():: Lets watch Game Of Thrones");
	    }
	     
	    public void bedRoom() {
	        System.out.println("Method public void bedRoom():: People will sleep in bed room.");
	    }
	     
	    public String getHouseName() {
	        System.out.println("Method public String getHouseName():: "+houseName);
	        return houseName;
	    }
	    public void displayHouseName() {
	        System.out.println("Method void displayHouseName():: House name is WhiteHosue");
	       
	    }
	    public int getNumbers(int a, int b) {
	        int total = a + b;
	        System.out.println("public int getNumbers(int , int b) two argument:: ");
	        return total;
	    }
	    public House getHouseInstance() {
	        System.out.println("public House getHouseInstance():: House name is WhiteHosue");
	        return new House();
	    }
	     
	     
	}

