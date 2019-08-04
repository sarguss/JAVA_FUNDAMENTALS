package Task2;

public class NoSuchAutor extends Exception {
    private String autor;
    public String getAutor(){return autor;}
    public NoSuchAutor(String message, String autor){
        super(message);
        this.autor = autor;
    }
}
