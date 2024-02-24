public class Appliance {

    private boolean hasWorkToDo;

    public Appliance(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

}


class Refrigerator extends Appliance{

    public Refrigerator(boolean hasWorkToDo) {
        super(hasWorkToDo);
    }

    public void orderFood(){
        setHasWorkToDo(true);
    }
}

class DishWasher extends Appliance{
    public DishWasher(boolean hasWorkToDo) {
        super(hasWorkToDo);
    }

    public void doDishes(){
        setHasWorkToDo(true);
    }
}

class CoffeeMaker extends Appliance{
    public CoffeeMaker(boolean hasWorkToDo) {
        super(hasWorkToDo);
    }

    public void brewCoffee(){
        setHasWorkToDo(true);
    }
}