import javax.print.DocFlavor;

public class Durant_JF_7_4_5 {
    public static void main(String[] args){
        StringInstrument guitar = new StringInstrument(true, 1000, 100, 10);

        System.out.println(">>>>>>>>>> Music Shop SALE <<<<<<<<<<");
        System.out.println("Number of Strings: " + guitar.getNumStrings() );
        System.out.println("Stock            : " + guitar.getNumInStock() );
        System.out.println("Sale             : " + guitar.getOnSale() );
        System.out.println("Price            : " + guitar.getPrice());
        System.out.println("Employee Price   : " + guitar.employeeDiscount() );
        System.out.println();

        StringInstrument bass = new StringInstrument(false, 1000, 100, 10);

        System.out.println(">>>>>>>>>> Music Shop <<<<<<<<<<");
        System.out.println("Number of Strings: " + bass.getNumStrings() );
        System.out.println("Sale             : " + bass.getOnSale() );
        System.out.println("Price            : " + bass.getPrice() );
        System.out.println("Employee Price   : " + bass.employeeDiscount() );



    }
}
//parent class
class Instrument {
    private boolean onSale;
    private double price;
    private int numInStock;

    //constructor
    public Instrument(boolean onSale, double price, int numInStock){
        this.onSale = onSale;
        this.price = price;
        this.numInStock = numInStock; }

    //getters
    public double getPrice(){
        if(onSale){ return price*.85; } // -15%
        return price; }
    public boolean getOnSale(){ return onSale; }
    public int getNumInStock(){ return numInStock; }

    //setters
    public void setOnSale(boolean onSale){ this.onSale = onSale; }
    public void setNumInStock(int numInStock){ this.numInStock = numInStock; }
    public void setPrice(double price){ this.price = price; }

    public double employeeDiscount(){
        return price * 0.75; } // -25%
}

//sub_Class
class StringInstrument extends Instrument {
    private int numStrings;

    public StringInstrument(boolean onSale, double price, int numInStock, int numStrings){
        super(onSale, price, numInStock);
        this.numStrings = numStrings; }
    //getters and setters
    public int getNumStrings(){ return numStrings; }
    public void setNumStrings(int numStrings) {this.numStrings = numStrings; }

}

//references for work
//https://stackoverflow.com/questions/26172704/java-how-to-include-2-classes-in-the-same-file