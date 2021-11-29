class HelloWorld {
   public static void main(String[] args) {
      int hours;
      if(args.length == 0) {
         // hours par defaut
         hours = 8;
      }
      else {
         try{
            hours = Integer.parseInt(args[0]) ;
         }
         catch(Exception e){
            System.out.println("Erreur de conversion : "+ e.getMessage());
            hours = 8;
         }
      }
      
      if( 6 < hours && hours  < 20) {
         System.out.println("Hello World");
      } 
      else {
         System.out.println("Goodnight World");
      }
   }
}