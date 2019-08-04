package Task2;

public class Publisher {
    Book[] list;
    String publisherName;
    static Publisher[] publisherList = new Publisher[0];

    public Publisher(String name) {
        publisherName = name;
    }

    public static void addPublisher(String name, Book book) {
        if (isPublisher(name)) {
            getPublisher(name).setBook(book);
        } else {
            Publisher[] temp = new Publisher[publisherList.length + 1];
            System.arraycopy(publisherList, 0, temp, 0, publisherList.length);
            temp[publisherList.length] = new Publisher(name);
            publisherList = temp;
            getPublisher(name).setBook(book);
        }
        book.publisher = getPublisher(name);
    }

    private void setBook(Book book) {
        if (list == null) list = new Book[0];
        Book temp[] = new Book[list.length + 1];
        System.arraycopy(list, 0, temp, 0, list.length);
        temp[list.length] = book;
        list = temp;
    }
    public Book[] getListOfbook(){
        return list;
    }
    public static boolean isPublisher(String name) {
        boolean bool = false;
        for (Publisher x : publisherList) {
            if (x.getName().equals(name)) {
                bool = true;
                break;
            }
        }
        return bool;
    }

    public String getName() {
        return publisherName;
    }

    public static Publisher getPublisher(String name) {
        Publisher publisher = null;
        for (Publisher x : publisherList) {
            if (x.getName().equals(name)) {
                publisher = x;
            }
        }
        return publisher;
    }

    public String toString(){
        String str = "";
        str = str.concat("Publisher: "+ publisherName);
        if (list.length==0) {
            str = str.concat("No books yet in from this publisher...");
            return str;
        } else{
            str = str.concat("Books: ");
            str = str.concat("\n");
            for (int i=0; i<list.length; i++){
                str = str.concat(list[i].getName());
                str = str.concat(", ");
                str = str.concat(String.valueOf(list[i].getYear()));
                str = str.concat("\n");
        }
        return str;}
    }
}