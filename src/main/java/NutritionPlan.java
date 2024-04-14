import java.util.List;

public class NutritionPlan {
    private int caloricIntake;
    private int carbohydrates;
    private int proteins;
    private int fats;
    private List<String> mealPlans;
    private String fitnessGoal;
    private List<String> dietaryRestrictions;

    // Private constructor to enforce the use of the builder
    NutritionPlan(int caloricIntake, int carbohydrates, int proteins, int fats,
                  List<String> mealPlans, String fitnessGoal, List<String> dietaryRestrictions) {
        this.caloricIntake = caloricIntake;
        this.carbohydrates = carbohydrates;
        this.proteins = proteins;
        this.fats = fats;
        this.mealPlans = mealPlans;
        this.fitnessGoal = fitnessGoal;
        this.dietaryRestrictions = dietaryRestrictions;
    }

    // Getter methods
    public int getCaloricIntake() {
        return caloricIntake;
    }

    public int getCarbohydrates() {
        return carbohydrates;
    }

    public int getProteins() {
        return proteins;
    }

    public int getFats() {
        return fats;
    }

    public List<String> getMealPlans() {
        return mealPlans;
    }

    public String getFitnessGoal() {
        return fitnessGoal;
    }

    public List<String> getDietaryRestrictions() {
        return dietaryRestrictions;
    }

    // Builder class
    public static class Builder {
        private int caloricIntake;
        private int carbohydrates;
        private int proteins;
        private int fats;
        private List<String> mealPlans;
        private String fitnessGoal;
        private List<String> dietaryRestrictions;

        public Builder caloricIntake(int caloricIntake) {
            this.caloricIntake = caloricIntake;
            return this;
        }

        public Builder carbohydrates(int carbohydrates) {
            this.carbohydrates = carbohydrates;
            return this;
        }

        public Builder proteins(int proteins) {
            this.proteins = proteins;
            return this;
        }

        public Builder fats(int fats) {
            this.fats = fats;
            return this;
        }

        public Builder mealPlans(List<String> mealPlans) {
            this.mealPlans = mealPlans;
            return this;
        }

        public Builder fitnessGoal(String fitnessGoal) {
            this.fitnessGoal = fitnessGoal;
            return this;
        }

        public Builder dietaryRestrictions(List<String> dietaryRestrictions) {
            this.dietaryRestrictions = dietaryRestrictions;
            return this;
        }

        public NutritionPlan build() {
            return new NutritionPlan(caloricIntake, carbohydrates, proteins, fats, mealPlans, fitnessGoal, dietaryRestrictions);
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Nutrition Plan:\n");
        builder.append("Caloric Intake: ").append(caloricIntake).append(" kcal\n");
        builder.append("Macronutrient Ratios: Carbs: ").append(carbohydrates).append("g, Proteins: ")
                .append(proteins).append("g, Fats: ").append(fats).append("g\n");
        builder.append("Fitness Goal: ").append(fitnessGoal).append("\n");
        builder.append("Dietary Restrictions: ").append(String.join(", ", dietaryRestrictions)).append("\n");
        builder.append("Meal Plans: \n");
        for (String plan : mealPlans) {
            builder.append(plan).append("\n");
        }
        return builder.toString();
    }

    // Example usage
    public static void main(String[] args) {
        // Example usage of the builder pattern
        NutritionPlan plan = new NutritionPlan.Builder()
                .caloricIntake(2000)
                .carbohydrates(300)
                .proteins(150)
                .fats(50)
                .mealPlans(List.of("Breakfast: Oatmeal, Lunch: Chicken Salad, Dinner: Grilled Salmon"))
                .fitnessGoal("weight loss")
                .dietaryRestrictions(List.of("gluten-free", "lactose-free"))
                .build();

        System.out.println(plan);
    }
}
