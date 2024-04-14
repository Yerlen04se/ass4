import java.util.List;

public class WeightLossNutritionPlanBuilder extends NutritionPlanBuilder {
    @Override
    public NutritionPlan build() {
        // Customize the nutrition plan for weight loss
        setCaloricIntake(1800);
        setMacronutrientRatios(40, 30, 30);
        setMealPlans(List.of("Healthy Breakfast", "Light Lunch", "Low-Calorie Dinner"));
        setFitnessGoal("Weight Loss");
        setDietaryRestrictions(List.of("gluten-free", "lactose-free"));
        return super.build();
    }
}
