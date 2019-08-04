package Task2;

public class Optional_Task {
    public static void main(String [] args){

        Book book1 = new Book("One book", 1989, "tree", 252, 25, true, "Nilsom", "Edam");
        Book book2 = new Book("One dhbook", 1989, "tree", 252, 25, true,"Edam");
        Book book3 = new Book("One bohok", 2089, "Fuit", 252, 25, false,"Edam");
        Book book4 = new Book("One boodk", 1989, "tree", 252, 25, true,"Edam");
        Book book5 = new Book("One bookhf", 1349, "Fuit", 252, 25, true,"NilEdamsom");
        Book book6 = new Book("One bookr", 2100, "tree", 252, 25, false,"Edam");
        Book book7 = new Book("Onedfh boork", 1989, "Fuit", 252, 25, true,"Nilsom");
        Book book8 = new Book("One borok", 1989, "tree", 252, 25, true,"Nilsom");
        Book book9 = new Book("One brfdhook", 1989, "Fuit", 252, 25, true,"Nilsom");
        Book book10 = new Book("One bookdh", 1989, "tree", 252, 25, true,"Edam");
        Book book11 = new Book("Oner book", 1939, "Fuit", 252, 25, true,"X","Nilsom", "Edam");
        Book book12 = new Book("Onre bofdhok", 1989, "tree", 252, 25, true,"X");
        Book book13 = new Book("One book", 1989, "tree", 252, 25, true,"Nilsom","Edam");
        Book book14 = new Book("Orne book", 1949, "tree", 252, 25, false,"Nilsom");
        Book book15 = new Book("One boohk", 1989, "tree", 252, 25, true,"Nilsom");

        System.out.println("nilson:");
        String name = "tree";
            for(Book x : Publisher.getPublisher(name).getListOfbook()){
                System.out.println(x.toString());
            }
        int year = 1950;
        System.out.println("after 1950:");
        for (Book x : Book.bookStorage){
            if (x.getYear()>year)
                System.out.println(x.toString());
        }

    }
}
