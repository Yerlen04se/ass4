import java.util.List;

public class NutritionPlanBuilder {
    private int caloricIntake;
    private int carbohydrates;
    private int proteins;
    private int fats;
    private List<String> mealPlans;
    private String fitnessGoal;
    private List<String> dietaryRestrictions;

    public NutritionPlanBuilder setCaloricIntake(int caloricIntake) {
        this.caloricIntake = caloricIntake;
        return this;
    }

    public NutritionPlanBuilder setMacronutrientRatios(int carbohydrates, int proteins, int fats) {
        this.carbohydrates = carbohydrates;
        this.proteins = proteins;
        this.fats = fats;
        return this;
    }

    public NutritionPlanBuilder setMealPlans(List<String> mealPlans) {
        this.mealPlans = mealPlans;
        return this;
    }

    public NutritionPlanBuilder setFitnessGoal(String fitnessGoal) {
        this.fitnessGoal = fitnessGoal;
        return this;
    }

    public NutritionPlanBuilder setDietaryRestrictions(List<String> dietaryRestrictions) {
        this.dietaryRestrictions = dietaryRestrictions;
        return this;
    }

    public NutritionPlan build() {
        return new NutritionPlan(caloricIntake, carbohydrates, proteins, fats, mealPlans, fitnessGoal, dietaryRestrictions);
    }

    // Example usage
    public static void main(String[] args) {
        // Example usage of the builder pattern
        NutritionPlan plan = new NutritionPlanBuilder()
                .setCaloricIntake(2000)
                .setMacronutrientRatios(300, 150, 50)
                .setMealPlans(List.of("Breakfast: Oatmeal, Lunch: Chicken Salad, Dinner: Grilled Salmon"))
                .setFitnessGoal("weight loss")
                .setDietaryRestrictions(List.of("gluten-free", "lactose-free"))
                .build();

        System.out.println(plan);
    }
}
