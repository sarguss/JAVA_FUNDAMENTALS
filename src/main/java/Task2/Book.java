package Task2;

public class Book {
    static Book[] bookStorage = new Book[0];
    int id;
    String name;
    Autor [] autor;
    Publisher publisher;
    int year;
    int pageAmount;
    int prise;
    boolean isHardCover;

        //public Book(String name, String ...namesAutor) {
        //    this.name = name;
        //    setBookToAutorList(namesAutor, this);
        //    setBookToStorage(this);
        //}
    public Book(String name, int year, String publisherName, int pageAmount, int prise, boolean isHardCover, String ...namesAutor) {
        this.name = name;
        this.year = year;
        this.pageAmount = pageAmount;
        this.prise = prise;
        this.isHardCover = isHardCover;
        setBookToAutorList(namesAutor, this);
        setBookToStorage(this);
        Publisher.addPublisher(publisherName, this);
        autorInitial(namesAutor, this);
    }

    public static void autorInitial(String []namesAutor, Book book){
        book.autor = new Autor[namesAutor.length];
        for (int i=0; i<namesAutor.length; i++){
            try{
                book.autor[i] = Autor.getAutorByname(namesAutor[i]);
            }   catch (NoSuchAutor e){}
        }
    }

    public void setBookToStorage(Book book){
        Book [] temp = new Book[bookStorage.length+1];
        System.arraycopy(bookStorage,0,temp,0,bookStorage.length);
        temp[bookStorage.length] = book;
        bookStorage = temp;
        book.id = bookStorage.length;
    }

    public void setBookToAutorList(String []namesAutor, Book book){
        for (String autorName : namesAutor){

            if (Autor.isAutorByName(autorName)){
                try{
                    Autor.getAutorByname(autorName).setBook(this);
                }catch (NoSuchAutor e){}
            } else {
                Autor newAutor = new Autor(autorName);
                newAutor.setBook(book);
            }
        }
    }

    public String getName(){
        return name;
    }

    public int getYear(){
        return year;
    }

    public int getID(){return id;}
    public Publisher getPublisher(){return publisher;}
    public String toString(){
        String str = "";
        String temp = String.format("%2d Name:  %12s,       Publisher: %10s,     Autor:  %15s,    %5d", id, name, publisher.getName(), Autor.getNames(autor), year);
        str = str.concat(temp);

        return str;
    }

}
