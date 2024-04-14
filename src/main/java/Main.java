public class Main {
    public static void main(String[] args) {
        // Create a director
        NutritionPlanDirector director = new NutritionPlanDirector();

        // Create a WeightLossNutritionPlanBuilder
        WeightLossNutritionPlanBuilder weightLossBuilder = new WeightLossNutritionPlanBuilder();

        // Set the builder for the director
        director.setBuilder(weightLossBuilder);

        // Construct a nutrition plan for weight loss
        NutritionPlan weightLossPlan = director.createNutritionPlan();
        System.out.println("Weight Loss Nutrition Plan:");
        System.out.println(weightLossPlan);
        System.out.println();

        // Create a WeightGainNutritionPlanBuilder
        WeightGainNutritionPlanBuilder weightGainBuilder = new WeightGainNutritionPlanBuilder();

        // Set the builder for the director
        director.setBuilder(weightGainBuilder);

        // Construct a nutrition plan for weight gain
        NutritionPlan weightGainPlan = director.createNutritionPlan();
        System.out.println("Weight Gain Nutrition Plan:");
        System.out.println(weightGainPlan);
        System.out.println();

        // Create a MaintenanceNutritionPlanBuilder
        MaintenanceNutritionPlanBuilder maintenanceBuilder = new MaintenanceNutritionPlanBuilder();

        // Set the builder for the director
        director.setBuilder(maintenanceBuilder);

        // Construct a nutrition plan for maintenance
        NutritionPlan maintenancePlan = director.createNutritionPlan();
        System.out.println("Maintenance Nutrition Plan:");
        System.out.println(maintenancePlan);
    }
}
