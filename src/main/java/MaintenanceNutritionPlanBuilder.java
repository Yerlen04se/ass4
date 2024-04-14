import java.util.List;

public class MaintenanceNutritionPlanBuilder extends NutritionPlanBuilder {
    @Override
    public NutritionPlan build() {
        // Customize the nutrition plan for maintenance
        setCaloricIntake(2200);
        setMacronutrientRatios(45, 30, 25);
        setMealPlans(List.of("Balanced Breakfast", "Moderate Lunch", "Healthy Dinner"));
        setFitnessGoal("Maintenance");
        setDietaryRestrictions(List.of("none")); // No dietary restrictions for maintenance
        return super.build();
    }
}