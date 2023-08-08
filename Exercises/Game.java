package Exercises;

public class Game {

    public enum PlayerClass {
        MARRON("Maron"),
        KYLE("Kyle"),
        PATRICK("Patrick");

        private final String className;

        PlayerClass(String className) {
            this.className = className;
        }

        public String getClassName() {
            return className;
        }
    }

    public static String getSkill(PlayerClass playerClass) {
        try {
            switch (playerClass) {
                case MARRON:
                    return "Javascript";
                case KYLE:
                    return "Java";
                case PATRICK:
                    return "Docker";
                default:
                    return "Invalid player class";
            }
        } catch (Exception e) {
            return "An error occurred";
        }
    }

    public static void main(String[] args) {
        PlayerClass selectedClass = PlayerClass.KYLE;
        String skill = getSkill(selectedClass);
        System.out.println("The skill for the " + selectedClass.getClassName() + " class is: " + skill);
    }
}

