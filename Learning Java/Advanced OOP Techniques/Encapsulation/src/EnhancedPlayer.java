public class EnhancedPlayer {

    private String fullName;
    private int healthPercentage;
    private String weapon;

    public EnhancedPlayer(String fullName, int healthPercentage, String weapon) {
        this.fullName = fullName;
        if (healthPercentage < 0) {
            this.healthPercentage = 1;
        } else {
            this.healthPercentage = Math.min(healthPercentage, 100);
        }
        this.weapon = weapon;
    }

    public EnhancedPlayer(String fullName) {
        this(fullName, 100, "Sword");
    }

    public void loseHealth(int damage) {

        healthPercentage = healthPercentage - damage;
        if (healthPercentage <= 0) {
            System.out.println("Player knocked out");
        }
    }

    public int healthRemaining() {
        return healthPercentage;
    }

    public void restoreHealth(int extraHealth) {

        healthPercentage = healthPercentage + extraHealth;

        if (healthPercentage > 100) {
            System.out.println("Player health is full");
            healthPercentage = 100;
        }
    }
}
