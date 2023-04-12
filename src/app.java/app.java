public class app {

    public static void main(String[] args) {
      System.out.println("Enter a polynomial function : ");
      Scanner input = new Scanner(System.in);
      String polynomial = input.next();
      int lengthofstring = polynomial.length();
  
    }
  
    public static String[] split(String function) {
  
      String[] splitted_function = new String[0/* number of + oerators */];
  
      return splitted_function;
  
    }
  
    // metod 1 : split exprission
    public static int numberOfPluses(String function){
  
      int i = 0 ;
      while(i < function.length()){
  
        if(function.charAt(i)== '-'){
          String subfunction = function.substring(i);
          function = 
  
        }
        
        
        
        
        
        i++;
        }
             
  
  
    
    
    
    
      return i ; 
  
  
    }
    // method 2 : detect negative
  
    // method 3 : identify variable
    // method 4 : identify number
    // method 5 : iden operator
  
  }
  