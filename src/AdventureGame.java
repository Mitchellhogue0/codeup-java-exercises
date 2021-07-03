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

        System.out.println("You walk into the room and see sunlight peaking through a broken window. The smell of mildew " +
                "fills the air. ");
        commands("");
        input = UI.nextLine();
        if (input.equals("look around")){
            System.out.println("You see old cabinets with paint peeling and missing doors. The corners of the room are" +
                    " filled with cobwebs. You see a glimmer from under the broken stove");
            commands(", look at glimmer");
            roomTwo();
        } else if (input.equals("look at glimmer")){
            System.out.println("You reach your hand under the stove and feel for the glimmer, and you pull out a key. The" +
                    " key is very ornate with the handle engraved with a Pegasus");
            commands("");
            roomTwo();
        }
    }

    public static void beginningRoomLit(){
       String input;

        System.out.println("You light a match to see your surroundings. You're in a dark, stone-walled basement with" +
                " no light in any direction, you see a door in front of you, and to your left there is a picture of " +
                "a man in a striped green shirt smiling with his dog");
        commands(", open door");
        input = UI.nextLine();
        if (input.equals("open door")) {
            System.out.println("You open the door and begin to ascend the wooden stairs in front of you");
            roomTwo();
        } else if (input.equals("look around")){
            System.out.println("You can't see much, but you think you might see a matchbox lying on the ground");
            commands(", pick up matchbox");
            beginningRoomLit();
        } else if (input.equals("check inventory")){
            System.out.printf("potions: %s\n", potion);
            beginningRoomLit();
        } else if (input.equals("heal")){
            potion = potion - 1;
            HP = maxHP;
            System.out.print("You are now at max HP, HP=" + HP);
            beginningRoomLit();
        }
    }


    public static void beginningRoom(){
        String input;

        System.out.println("You wake up on the floor, completely forgetting how you got here or where you are.");
        wait(3);
        System.out.println("The room is very dark, you can barely see a thing. It is very musty and hard to breathe, you" +
                " fear you might not be alone");
        wait(2);
        commands();
        input = UI.nextLine();
        if(input.equals("look around")){
            System.out.println("You can't see much, but you think you might see a matchbox lying on the ground");
            commands(", pick up matchbox");
            beginningRoom();
        } else if (input.equals("heal")){
            potion = potion - 1;
            HP = maxHP;
            System.out.printf("You are now at max HP, HP=%s\n", HP);
            beginningRoom();
        } else if (input.equals("pick up matchbox")){
            beginningRoomLit();
        } else if (input.equals("check inventory")){
            System.out.printf("potions: %s\n", potion);
            beginningRoom();
        } else{
            System.out.println("Please choose from the commands");
            commands();
            wait(2);
            beginningRoom();
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
        wait(3);
        System.out.println("Please tell us your name: ");
       Name = UI.nextLine();
        System.out.printf("%s, is it?\n", Name);
        wait(2);
        System.out.printf("Well, %s, this is no easy tale to tell\n", Name);
        wait(3);
        System.out.println("However, I think you got guts, follow me");
        wait(5);
        System.out.println("*CRACK*");
        wait(5);
        lvl = 1;
        atk = 1;
        def = 1;
        beginningRoom();
    }
}
