package weekendClass;


		public class TestHouse {
		 
		    public static void main(String[] args) {
		         
		        //variable type variableName = value
		         int num1 = 10;
		         House house  = new House("GreenHouse", 101, 'B');
		         System.out.println("XYZ "+house.getHouseName());
		         house.watchTV();
		         house.bedRoom();
		         house.displayHouseName();
		         String name = house.getHouseName();
		         System.out.println("MAIN String name:: "+ name);
		          
		         House gh  = new House("kjhjkdfhvgjsdf",890);
		         //String name1= gh.getHouseName();
		         //System.out.println("MAIN String name1:: "+name1);
		         //gh.bedRoom();
		     
		    }
		 
		}
		
