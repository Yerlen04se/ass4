import java.util.List;

public class NutritionPlanDirector {
    private NutritionPlanBuilder builder;

    public void setBuilder(NutritionPlanBuilder builder) {
        this.builder = builder;
    }

    public NutritionPlan createNutritionPlan() {
        // Example of constructing a nutrition plan
        return builder.setCaloricIntake(2000)
                .setMacronutrientRatios(300, 150, 50)
                .setMealPlans(List.of("Breakfast: Oatmeal, Lunch: Chicken Salad, Dinner: Grilled Salmon"))
                .setFitnessGoal("weight loss")
                .setDietaryRestrictions(List.of("gluten-free", "lactose-free"))
                .build();
    }

    // Example usage
    public static void main(String[] args) {
        // Example usage of the director to create a nutrition plan
        NutritionPlanDirector director = new NutritionPlanDirector();
        NutritionPlanBuilder builder = new NutritionPlanBuilder();
        director.setBuilder(builder);

        NutritionPlan plan = director.createNutritionPlan();
        System.out.println(plan);
    }
}
