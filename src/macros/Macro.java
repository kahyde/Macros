package macros;

/**
 * @author kelseyhyde
 */
class Macro {
    private int calories;
    private double fat;
    private double carbs;
    private double protein;
    
    Macro (){
        calories = 0;
    }
    
    Macro (int calories){
        this.calories = calories;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }
    
    public void setMacros( int fat, int carbs, int protein){
        this.fat = (calories * fat) / 100;
        this.carbs = (calories * carbs) / 100;
        this.protein = (calories * protein) / 100;
    }
    
    public String printMacros(){
        return "Your macro breakdown is: " + calories + " calories, " + fat + " fat, " + protein + " protein.";
    }
}
