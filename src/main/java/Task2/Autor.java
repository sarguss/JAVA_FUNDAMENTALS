package Task2;

public class Autor {
    Book[] list;
    String autorName;
    static Autor[] autorList = new Autor[0];
    //constructor
    public Autor(String autorName){
        this.autorName= autorName;
        list = new Book[0];
        setAutorToAutorList(autorName, this);

    }
    //method set
    private void setAutorToAutorList(String autorName, Autor autor){
        Autor[] newArray = new Autor[autorList.length+1];
        System.arraycopy(autorList,0,newArray,0,autorList.length);
        newArray[autorList.length] = autor;
        autorList = newArray;
    }

    public void setBook(Book book){
        Book[] newArray = new Book[list.length+1];
        System.arraycopy(list,0,newArray,0,list.length);
        newArray[list.length] = book;
        list = newArray;
    }

    public String getName(){
       return autorName;
    }

    public static String getNames(Autor[] b){
        String str="";
        for (Autor x : b){
            str = str.concat(x.getName());
            str = str.concat(", ");
        }
        str = str.substring(0,str.length()-2);
        return str;
    }
    public Book[] getListOfbook(){
        return list;
    }
    public static Autor getAutorByname(String name)throws NoSuchAutor {
        Autor autor=null;
        for (Autor x : autorList) {
            if (x.getName() == name) {
                autor=x;
                break;
            }}

        if (autor==null) throw new NoSuchAutor("No such autor:", name);

        return autor;
    }
    public static boolean isAutorByName(String name) {
        boolean bool = false;
        for (Autor x : autorList) {
            if (x.getName() == name) {
                bool=true;
                break;
            }}

        return bool;
    }

    //method toString
    public String toString(){
        String str = "";
        str = str.concat("Autor: "+autorName);
        str = str.concat("\n");
        if (list.length==0) {
            str = str.concat("No books yet...");
            return str;
        }
        str = str.concat("Books: ");
        str = str.concat("\n");
        for (int i=0; i<list.length; i++){
            str = str.concat(list[i].getName());
            str = str.concat(", ");
            str = str.concat(String.valueOf(list[i].getYear()));
            str = str.concat("\n");
        }
        return str;
    }
}
