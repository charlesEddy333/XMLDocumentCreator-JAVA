
public class XMLDocumentCreator {

   private String name;

   private int number;

   private boolean isCurrent;

   public String read(){
       System.out.println("Document read");
       return "Document read again";
   }

   public static void write(){
       System.out.println("Document written");
   }

    public static void main(String[] args) {
       XMLDocumentCreator obj= new XMLDocumentCreator();
       obj.read();
    }
}

