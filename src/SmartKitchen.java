public class SmartKitchen {

    private CoffeeMaker brewMaster;
    private DishWasher dishWasher;
    private Refrigerator iceBox;


    public SmartKitchen(CoffeeMaker brewMaster, DishWasher dishWasher, Refrigerator iceBox) {
        this.brewMaster = brewMaster;
        this.dishWasher = dishWasher;
        this.iceBox = iceBox;
    }

   public void addWater(){
        brewMaster.setHasWorkToDo(true);
   }

   public void pourMilk(){
        iceBox.setHasWorkToDo(true);
   }

   public void loadDishwasher(){
        dishWasher.setHasWorkToDo(true);
   }

   public void setKitchenState(boolean coffeeMakerHasWork, boolean dishWasherHasWork, boolean fridgeHasWork){
        if(coffeeMakerHasWork){
            brewMaster.setHasWorkToDo(true);
        }

        if(dishWasherHasWork){
            dishWasher.setHasWorkToDo(true);
        }

        if(fridgeHasWork){
            iceBox.setHasWorkToDo(true);
        }
   }
}
