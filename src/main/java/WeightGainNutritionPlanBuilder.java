import java.util.List;

public class WeightGainNutritionPlanBuilder extends NutritionPlanBuilder {
    @Override
    public NutritionPlan build() {
        // Customize the nutrition plan for weight gain
        setCaloricIntake(2500);
        setMacronutrientRatios(50, 25, 25);
        setMealPlans(List.of("High-Calorie Breakfast", "Protein-Rich Lunch", "Heavy Dinner"));
        setFitnessGoal("Weight Gain");
        setDietaryRestrictions(List.of("none")); // No dietary restrictions for weight gain
        return super.build();
    }
}