interface Readable{
    void read();
}
class Book{
    int id;
    String name;
    String author;
    
    public Book(int id,String name,String author){
        this.id=id;
        this.name=name;
        this.author=author;
    }
    void showDetails(){
        System.out.println("ID: "+id);
        System.out.println("Name: "+name);
        System.out.println("Author: "+author);
    }
}
class EBook extends Book implements Readable{
    double filesize;
    
    public EBook(int id,String name,String author,double filesize){
        super(id,name,author);
        this.filesize=filesize;
    }
        @Override
  public void showDetails(){
        super.showDetails();
         System.out.println("File Size: "+ filesize);
    }
      @Override
  public  void read(){
          System.out.println("Reading the ebook...");
        
    }
    
}


public class tryy{
    public static void main(String [] args){
       
        EBook ebook = new EBook(101,"Java Basics","James",5.4);

        ebook.showDetails();
        ebook.read();

        System.out.println("Hashcode: " + ebook.hashCode());

    }
}