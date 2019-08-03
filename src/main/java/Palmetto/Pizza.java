package Palmetto;

public class Pizza {
    String name;
    int [] ingridients = new int[8];
    boolean isCazone;
    int amount;
    int clientNumber;
    int orderNumber;
    boolean pizzaCost;
    public Pizza (String name, String clientName, int pizzaNumberInOrder, int orderNumber, int clientNumber, boolean isCazone){
        if (name.length()<21&&
            name.length()>3) this.name = name;
        else this.name = clientName + "_"+String.valueOf(pizzaNumberInOrder);
        this.clientNumber = clientNumber;
        this.orderNumber = orderNumber;
        this.isCazone = isCazone;
    }

    public void pizzaInfoOutput(){
        System.out.println("["+orderNumber+" : "+clientNumber+" : "+name+" : "+amount+"]") ;
    }
    public void addIngredient(int ingredientNumber){
        boolean hasPlace = false;
        for (int i=0; i<8; i++ ){
            hasPlace = (ingridients[i]==0) ? true : false;
        }
        if (!hasPlace) {
            System.out.println("Pizza is already complete");
            return;
        }
        if (ingridients[ingredientNumber]==1) {
            System.out.println("Add something else");
        } else ingridients[ingredientNumber]=1;
    }
    public float getSum(){
        float sum = (isCazone) ? 1.5f : 1f;
        if (ingridients[0]==1) sum+= 1;
        if (ingridients[1]==1) sum+= 1;
        if (ingridients[2]==1) sum+= 1.5;
        if (ingridients[3]==1) sum+= 1.2;
        if (ingridients[4]==1) sum+= 0.3;
        if (ingridients[5]==1) sum+= 0.7;
        if (ingridients[6]==1) sum+= 0.6;
        if (ingridients[7]==1) sum+= 0.5;


        return sum;
    }
}
