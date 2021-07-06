import java.util.Random;
import java.util.Scanner;

public class AdventureGame {
    public static String Name;
    public static int HP;
    public static int maxHP;
    public static int xp;
    public static int atk;
    public static int def;
    public static int lvl;
    public static int potion;
    static Random rand = new Random();
    static Scanner UI = new Scanner(System.in);
    public static int dam = rand.nextInt(5) + 1;
    public static int heal = rand.nextInt(5) + 1;

    public static void roomTwo(){
        String input;

        input = UI.nextLine();
        switch (input) {
            case "look around":
            case "la":
                System.out.println("You see old cabinets with paint peeling and missing doors. The corners of the room are" +
                        " filled with cobwebs. You see a glimmer from under the broken stove");
                commands(", look at glimmer");
                roomTwo();
                break;
            case "look at glimmer":
                System.out.println("You reach your hand under the stove and feel for the glimmer, and you pull out a key. The" +
                        " key is very ornate with the handle engraved with a Pegasus");
                commands("");
                roomTwo();
                break;
            case "check inventory":
            case "ci":
                System.out.printf("potions: %s\n", potion);
                roomTwo();
                break;
            case "heal":
            case "h":
                potion = potion - 1;
                HP = maxHP;
                System.out.print("You are now at max HP, HP=" + HP);
                roomTwo();
                break;
        }
    }

    public static void beginningRoomLit(){
       String input;


        input = UI.nextLine();
        switch (input) {
            case "open door":
                System.out.println("You open the door and begin to ascend the wooden stairs in front of you");
                router("roomTwo");
                break;
            case "look around":
            case "la":
                System.out.println("You can't see much, but you think you might see a matchbox lying on the ground");
                commands(", pick up matchbox");
                beginningRoomLit();
                break;
            case "check inventory":
            case "ci":
                System.out.printf("potions: %s\n", potion);
                beginningRoomLit();
                break;
            case "heal":
            case "h":
                potion = potion - 1;
                HP = maxHP;
                System.out.print("You are now at max HP, HP=" + HP);
                beginningRoomLit();
                break;
        }
    }



    public static void beginningRoom(){
        String input;


        input = UI.nextLine();
        switch (input) {
            case "look around":
                System.out.println("You can't see much, but you think you might see a matchbox lying on the ground");
                commands(", pick up matchbox");
                beginningRoom();
                break;
            case "heal":
                potion = potion - 1;
                HP = maxHP;
                System.out.printf("You are now at max HP, HP=%s\n", HP);
                beginningRoom();
                break;
            case "pick up matchbox":
                router("beginningRoomLit");
                break;
            case "check inventory":
                System.out.printf("potions: %s\n", potion);
                beginningRoom();
                break;
            default:
                System.out.println("Please choose from the commands");
                commands();
                wait(2);
                beginningRoom();
                break;
        }
    }

    public static void router(String room){
        switch (room) {
            case "beginningRoom":
                System.out.println("You wake up on the floor, completely forgetting how you got here or where you are.");
                wait(3);
                System.out.println("The room is very dark, you can barely see a thing. It is very musty and hard to breathe, you" +
                        " fear you might not be alone");
                wait(2);
                commands();
                beginningRoom();
                break;
            case "beginningRoomLit":
                System.out.println("You light a match to see your surroundings. You're in a dark, stone-walled basement with" +
                        " no light in any direction, you see a door in front of you, and to your left there is a picture of " +
                        "a man in a striped green shirt smiling with his dog");
                commands(", open door");
                beginningRoomLit();
                break;
            case "roomTwo":
                System.out.println("You walk into the room and see sunlight peaking through a broken window. The smell of mildew " +
                        "fills the air. ");
                commands();
                roomTwo();
                break;
        }
    }

    public static void commands(){
        System.out.println("Commands: look around , heal , check inventory");
    }

    public static void commands(String newCommands){
        System.out.printf("Commands: look around , heal , check inventory %s\n", newCommands);
    }

    public static void wait(int numSeconds){
        try {
            Thread.sleep(numSeconds * 1000);
        } catch (InterruptedException e) {

        }
    }


    public static void main(String[] args) {
        maxHP = 25;
        potion = 2;

        System.out.println("Welcome, young adventurer");
        wait(1);
        System.out.println("Please tell us your name: ");
       Name = UI.nextLine();
        System.out.printf("%s, is it?\n", Name);
        wait(2);
        System.out.printf("Well, %s, this is no easy tale to tell\n", Name);
        wait(1);
        System.out.println("However, I think you got guts, follow me");
        wait(1);
        System.out.println("*CRACK*");
        wait(1);
        lvl = 1;
        atk = 1;
        def = 1;
        router("beginningRoom");
    }
}
