import java.util.ArrayList;
public class PizzaRestaurant implements Contract{
    public String name;
    public ArrayList<String> ingredients;
    public int pizzadough;  // initial length of all pizza dough in restaurant


    /**
     * Constructor
     * @param name name of pizza restaurant
     * @param pizzadough size of pizza dough
     */
    public PizzaRestaurant(String name, int pizzadough){
        this.name = name;
        this.pizzadough = pizzadough;
        this.ingredients = new ArrayList<String>();

    }


    /**
     * Takes an item off of a pizza and removes it from the ingredients
     * @param item item to be taken off of the pizza 
     */
    public void grab(String item){
        if (ingredients.contains(item)){
            ingredients.remove(item);
     }
            System.out.println("Employee has grabbed " + item + " and taken it off of the pizza");
        
    }

    /**
     * Drops an ingredient onto a pizza
     * @param item to be dropped onto pizza
     * @return item that is dropped onto pizza
     */
    public String drop(String item){
        if (ingredients.contains(item) == false){
            ingredients.add(item);
        }
            System.out.println("Employee has dropped " + item + " onto the pizza");
            return item;

        

    }

    /**
     * Prints out a message that tells the user that the employee is examining the item to see whether or not it has gone bad
     */
    public void examine(String item){
        System.out.println("Employee is examining " + item + " to see if it has gone bad and will remove it from ingredients if it has");

        

    }

    /**
     * Removes item from ingredients when the employee has used all of the item
     * @item item used in making pizza
     */
    public void use(String item){
        if (ingredients.contains(item)){
            ingredients.remove(item);
         System.out.println("Employee has used " + item );


    }
    }

    /**
     * Prints out message on where employee is goining and returns true if the employee is allowed to be doing the thing they are walking towards
     * @param direction direction in which employee is walking
     * @return boolean based on whether employee is allowed to be doing the thing they are walking towards
     */
    public boolean walk(String direction){
        if (direction == "Prep Station"){
            System.out.println("Employee is headed in the right direction to make the pizza");
            return true;
        } 
        if (direction == "Stove"){
            System.out.println("Employee is headed in the right direction to cook");
            return true;
        } 
        if (direction == "Dishwasher"){
            System.out.println("Employee is headed in the right direction to wash dishes");
            return true;
        } 
        if (direction == "Bathroom"){
            System.out.println("Employee is headed in the right direction to go to the bathroom");
            return true;
        } 
        else{
            System.out.println("Employee is headed in the wrong direction");
            return false;
        }


    }

    /**
     * Takes two inputs that represent the current length of the pizza dough and the length that the pizza dough is to be thrown and stretched to and returns true based on whether or not the length the dough is to be strecthed to is greater than the current length
     * @param x current length of pizza dough
     * @param y length that pizza dough is to be stretched to
     * @return boolean for whether or not the pizza dough can be stretched to that length if it is not already at that length
     */
    public boolean fly(int x, int y){
        if (y>x){
            System.out.println("Employee is stretching throwing dough in air and stretching it from " + x + " inches to " + y + " inches" );
            return true;
        } else{
            System.out.println("Employee cannot throw and stretch dough from " + x + " inches to " + y + " inches so numbers need to be adjusted");
            return false;
        }
        

    }

    /**
     * Shrinks the pizzadough to half of its size 
     * @return pizzadough size
     */
    public Number shrink(){
        this.pizzadough /= 2;
        System.out.println("Employee has pounded the pizza dough and it is now " + this.pizzadough + " inches");
        return this.pizzadough;

    }

    /**
     * Grows the pizza dough in the oven and increases its crust to double its original size
     * @return size of pizza dough after growing
     */
    public Number grow(){
        this.pizzadough *= 3;
        System.out.println("Pizza is in the oven and the crust has grown to " + this.pizzadough + " inches");
        return this.pizzadough;
    }

    /**
     * Prints out a message explaining that employee is resting from pizza making 
     */
    public void rest(){
        System.out.println("The employee is on their break and will resume pizza making in 30 minutes");

    }

    
    /**
     * Undos the pounding of the pizza dough and makes dough back into a ball
     */
    public void undo(){
        this.pizzadough *= 2;

        
        

    }


    /**
     * Main method 
     * @param args command line arguments passed into method
     */
    public static void main(String[] args) {
        PizzaRestaurant antonios = new PizzaRestaurant("Antonios", 4);
        
}
}
