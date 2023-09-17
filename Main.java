/**
 * Brendan Mercado and Sean Diaz-Lo
 * June 14, 2019
 * ICS3U2-01 ISU
 * The following program titled "Monster Dungeon", is a game where the user learns about different computer parts
 * before entering the dungeon. The dungeon consists of an 18 question quiz based on what the user has learned. If
 * the user answers questions incorrectly, they will lose take damage and lose HP. Losing all your HP means game over.
 * Try and answer questions correctly to defeat the monsters and clear the dungeon.
 */

import java.util.Scanner;
import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        NumberFormat percent = NumberFormat.getPercentInstance();
        String playerName, answer = "";
        String playerChoice = "", exitGame;
        int menu, gameModeSelect, endgameMenu = 0;
        double health = 0, damage;

        System.out.println("Welcome to Monster Dungeon! Please enter your name: ");
        playerName = input.nextLine();

        do
        {

            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("\t\t-----------------------");
            System.out.println("\t\t| 1. Start Game       |");
            System.out.println("\t\t-----------------------");
            System.out.println("\t\t| 2. Instructions     |");
            System.out.println("\t\t-----------------------");
            System.out.println("\t\t| 3. About Program    |");
            System.out.println("\t\t-----------------------");
            System.out.println("\t\t| 4. Exit Program     |");
            System.out.println("\t\t-----------------------");
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

            System.out.println("\nWelcome " + playerName + ", what would you like to do?");
            menu = input.nextInt();

            if (menu == 4)
            {
                System.exit(0);
            }

            if (menu == 1)
            {
                do
                {
                    System.out.println("\nWelcome.");

                    System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                    System.out.println("\t\t------------------------");
                    System.out.println("\t\t| 1. Training          |");
                    System.out.println("\t\t------------------------");
                    System.out.println("\t\t| 2. Play Game         |");
                    System.out.println("\t\t------------------------");
                    System.out.println("\t\t| 3. Exit to main menu |");
                    System.out.println("\t\t------------------------");
                    System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

                    System.out.println("\nWhat would you like to do?");
                    gameModeSelect = input.nextInt();

                    if (gameModeSelect == 1)
                    {
                        do
                        {
                            System.out.println("\nTrain your knowledge before you enter the dungeon.\n");

                            System.out.println("\t\t\tComputer Memory\n");
                            System.out.println("Caching is a temporary storage that allows computer tasks to be done more rapidly.");
                            System.out.println("The advantage of Cache technology is that it uses a faster memory type to accelerate a slower memory type at the cost of storage area.");
                            System.out.println("There can be different levels of cache on computers ranging from level 1(L1) to level 3(L3).");
                            System.out.println("L2 cache is able to access the RAM twice as fast as main memory access, which is at 60 nanoseconds.");
                            System.out.println("L1 cache is able to access the RAM 3.5 times faster than the L2 cache.");
                            System.out.println("The difference between the different levels is that the higher the level goes, the cache gets slightly slower but has more storage space.");

                            System.out.println("\n\t\t\tHard Disk / Floppy Disk\n");
                            System.out.println("Nearly every computer or server today uses one or more hard-disk drives.");
                            System.out.println("The hard disks are built to be able to store changing information in a permanent form.");
                            System.out.println("Similarly to how cassette tapes store information by using a magnetic recording technique.");
                            System.out.println("However, A disk uses a moving arm that hovers over the disk and a spinning platter to rapidly record and read information on the disk.");
                            System.out.println("A typical computer will usually have around 10 to 40 gigabytes of storage capacity in the form of files.");

                            System.out.println("\n\t\t\tCDs\n");
                            System.out.println("Compact Discs (CDs) are used to hold data, computer software, and even music.");
                            System.out.println("Most of a CD consists of an injection-molded piece of clear polycarbonate plastic.");
                            System.out.println("Most CDs with a diameter of 12 centimeters can only store 783 megabytes (mb) of memory.");
                            System.out.println("They are only about 1.2 millimeters thick. A CD has a single spiral track of data that circles");
                            System.out.println("from the inside of the disc to the outside.");

                            System.out.println("\n\t\t\tBIOS\n");
                            System.out.println("Every computer has a basic input/output system. It is usually referred to as the BIOS.");
                            System.out.println("The BIOS makes sure all the other chips, ports, hard drives, and CPU function together.");
                            System.out.println("The BIOS is usually stored on a Flash memory chip on the motherboard.");
                            System.out.println("The most important role of the BIOS is to load the operating system.");
                            System.out.println("The BIOS is the third type of software a computer needs to operate successfully.");
                            System.out.println("The other two being the operating system and a computer’s applications.");
                            System.out.println("\nWhen you turn on your computer the BIOS does several things:\n");
                            System.out.println("\t\t1. Check the CMOS Setup for custom settings");
                            System.out.println("\t\t2. Load the interrupt handlers and device drivers");
                            System.out.println("\t\t3. Initialize registers and power management");
                            System.out.println("\t\t4. Perform the power-on self-test (POST)");
                            System.out.println("\t\t5. Display system settings");
                            System.out.println("\t\t6. Determine which devices are bootable");
                            System.out.println("\t\t7. Initiate the bootstrap sequence");

                            System.out.println("\n\t\t\tCD-Burners\n");
                            System.out.println("The technology of CD burners makes it easy for someone to make their own CDs.");
                            System.out.println("The information on the discs are 0s and 1s which are read by laser beams passing over the track.");
                            System.out.println("These 0s and 1s are represented by millions of tiny bumps and flat areas on the disc.");
                            System.out.println("On a CD-recordable disc, or CD-R, they are represented by translucent and opaque areas that were");
                            System.out.println("burned onto the dye of a reflective disc darkening it until it is opaque, stopping light from reflecting back.");
                            System.out.println("The CD player can recognize 0s and 1s with an optical sensor.");
                            System.out.println("If the laser is on a flat area, it directly reflects into the sensor, interpreting it as a 1.");
                            System.out.println("If the light is bounced away by a bump,the CD player interprets it as a 0.");

                            System.out.println("\n\t\t\tPlaystation 4\n");
                            System.out.println("The Playstation 4 (PS4) is Sony’s most recent gaming console which succeeds the Playstation 3.");
                            System.out.println("It uses a single chip custom processor, an x86-64 AMD eight core ‘Jaguar’.");
                            System.out.println("In terms of RAM, the PS4 has 8GB of GDDR5 memory (graphics double data rate type five synchronous random-access memory).");
                            System.out.println("This makes it able to play graphic intensive games at a stable speed.");
                            System.out.println("Though not hardware related, the PS4 is an amazing console because of its exclusive games.");
                            System.out.println("Spider-Man, God of War, and Persona 5 just to name a few.");

                            System.out.println("\n0 to exit to game menu.");
                            gameModeSelect = input.nextInt();

                        } while (gameModeSelect != 0);
                    }

                    if (gameModeSelect == 2)
                    {

                        do
                        {
                            System.out.println("d");

                            String answeredQuestions = ""; //Creates a list of answered questions so none will be repeated

                            System.out.println("\nAre you ready to enter the dungeon? (y/n)");
                            System.out.println("Press 0 anytime during the game to exit to the main menu."); //Works on second iteration but no prompt is shown????

                            if (health == 0)
                            {
                                health = 100;

                                if (endgameMenu == 2)
                                {
                                    endgameMenu = 0;
                                    break;
                                }

                            }


                            if (answer.equalsIgnoreCase("0"))
                            {
                                answer = "";
                                break;
                            }


                            playerChoice = input.nextLine();


                            if (playerChoice.equalsIgnoreCase("N"))
                            {
                                break;
                            }
                            else if (playerChoice.equalsIgnoreCase("Y"))
                            {
                                gameModeSelect = 0;
                                int questionNumber;

                                for (int totalQuestions = 0; totalQuestions < 18; totalQuestions++)
                                {

                                    if (!(playerChoice.equalsIgnoreCase("Y")))
                                    {
                                        health = 0;
                                        playerChoice = "";
                                        break;
                                    }

                                    /*
                                     * Questions 1-3 - Computer Memory
                                     * Questions 4-6 - Hard Disk / Floppy Disk
                                     * Questions 7-9 - CDs
                                     * Questions 10-12 - BIOS
                                     * Questions 13-15 - CD-Burners
                                     * Questions 16-18 - PS4
                                     * */

                                    int correctAnswer = 0;

                                    questionNumber = (int)((18 - 1 + 1) * Math.random() + 1); //Random questions from 1-18

                                    switch (questionNumber)
                                    {
                                        case 1:

                                            if (answeredQuestions.indexOf('A') > -1)
                                            {
                                                totalQuestions--;
                                                break;
                                            }

                                            System.out.println("\n\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                            System.out.println("\nHow does cache memory affect the speed of your computer?\n");
                                            System.out.println("a. Faster if the memory is in the cache storage, slower if it is not");
                                            System.out.println("b. Faster when a file is opened for the first time.");
                                            System.out.println("c. Slower if that file has already been opened during current session");
                                            System.out.println("d. Slows down the startup time for the file, but causes files to run faster");
                                            System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                            answer = input.nextLine();

                                            while (answer.equalsIgnoreCase("0"))
                                            {
                                                System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                                System.out.println("Are you sure you want to exit to the main menu? (y/n)");
                                                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                                exitGame = input.nextLine();

                                                if (exitGame.equalsIgnoreCase("Y"))
                                                {
                                                    menu = 0;
                                                    break;
                                                }
                                                else if (exitGame.equalsIgnoreCase("N"))
                                                {
                                                    System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                                    System.out.println("Please input your answer for the existing question: ");
                                                    System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                                    answer = input.nextLine();
                                                }
                                            }

                                            if (answer.equalsIgnoreCase("A"))
                                            {
                                                correctAnswer = 1;
                                            }
                                            else
                                            {
                                                correctAnswer = 2;
                                            }

                                            answeredQuestions += "A";
                                            break;


                                        case 2:

                                            if (answeredQuestions.indexOf('B') > -1)
                                            {
                                                totalQuestions--;
                                                break;
                                            }

                                            System.out.println("\n\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                            System.out.println("\nWhat is the difference from a L1 cache and a L3 cache?\n");
                                            System.out.println("a. L3 cache has a faster memory and more storage than a L1 cache");
                                            System.out.println("b. L1 cache has a faster memory but less storage than L3 cache");
                                            System.out.println("c. L3 cache has a slower memory and less storage than a L1 cache");
                                            System.out.println("d. L1 cache has a slower memory but more storage than L3 cache");
                                            System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                            answer = input.nextLine();

                                            while (answer.equalsIgnoreCase("0"))
                                            {
                                                System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                                System.out.println("Are you sure you want to exit to the main menu? (y/n)");
                                                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                                exitGame = input.nextLine();

                                                if (exitGame.equalsIgnoreCase("Y"))
                                                {
                                                    menu = 0;
                                                    break;
                                                }
                                                else if (exitGame.equalsIgnoreCase("N"))
                                                {
                                                    exitGame = "";
                                                    System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                                    System.out.println("Please input your answer for the existing question: ");
                                                    System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                                    answer = input.nextLine();
                                                }
                                            }

                                            if (answer.equalsIgnoreCase("B"))
                                            {
                                                correctAnswer = 1;
                                            }
                                            else
                                            {
                                                correctAnswer = 2;
                                            }

                                            answeredQuestions += "B";
                                            break;


                                        case 3:

                                            if (answeredQuestions.indexOf('C') > -1)
                                            {
                                                totalQuestions--;
                                                break;
                                            }

                                            System.out.println("\n\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                            System.out.println("\nWhat is the speed of which the main memory access can access the RAM?\n");
                                            System.out.println("a. 60 milliseconds");
                                            System.out.println("b. 60 microseconds");
                                            System.out.println("c. 60 nanoseconds");
                                            System.out.println("d. 60 seconds");
                                            System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                            answer = input.nextLine();

                                            while (answer.equalsIgnoreCase("0"))
                                            {
                                                System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                                System.out.println("Are you sure you want to exit to the main menu? (y/n)");
                                                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                                exitGame = input.nextLine();

                                                if (exitGame.equalsIgnoreCase("Y"))
                                                {
                                                    menu = 0;
                                                    break;
                                                }
                                                else if (exitGame.equalsIgnoreCase("N"))
                                                {
                                                    exitGame = "";
                                                    System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                                    System.out.println("Please input your answer for the existing question: ");
                                                    System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                                    answer = input.nextLine();
                                                }
                                            }

                                            if (answer.equalsIgnoreCase("C"))
                                            {
                                                correctAnswer = 1;
                                            }
                                            else
                                            {
                                                correctAnswer = 2;
                                            }

                                            answeredQuestions += "C";
                                            break;


                                        case 4:

                                            if (answeredQuestions.indexOf('D') > -1)
                                            {
                                                totalQuestions--;
                                                break;
                                            }

                                            System.out.println("\n\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                            System.out.println("\nHow do hard-disks record information?\n");
                                            System.out.println("a. Magnetic arm hovers over the platter");
                                            System.out.println("b. Thin plastic strip like in a cassette tape");
                                            System.out.println("c. Magnetic arm scratches information directly onto the disk");
                                            System.out.println("d. Arm is equipped with a concentrated light that burns information on the disk");
                                            System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                            answer = input.nextLine();

                                            while (answer.equalsIgnoreCase("0"))
                                            {
                                                System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                                System.out.println("Are you sure you want to exit to the main menu? (y/n)");
                                                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                                exitGame = input.nextLine();

                                                if (exitGame.equalsIgnoreCase("Y"))
                                                {
                                                    menu = 0;
                                                    break;
                                                }
                                                else if (exitGame.equalsIgnoreCase("N"))
                                                {
                                                    exitGame = "";
                                                    System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                                    System.out.println("Please input your answer for the existing question: ");
                                                    System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                                    answer = input.nextLine();
                                                }
                                            }

                                            if (answer.equalsIgnoreCase("A"))
                                            {
                                                correctAnswer = 1;
                                            }
                                            else
                                            {
                                                correctAnswer = 2;
                                            }

                                            answeredQuestions += "D";
                                            break;


                                        case 5:

                                            if (answeredQuestions.indexOf('E') > -1)
                                            {
                                                totalQuestions--;
                                                break;
                                            }

                                            System.out.println("\n\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                            System.out.println("\nHow much storage capacity can the typical hard disk save?\n");
                                            System.out.println("a. 20 to 40 gigabytes");
                                            System.out.println("b. 20 to 60 gigabytes");
                                            System.out.println("c. 10 to 60 gigabytes");
                                            System.out.println("d. 10 to 40 gigabytes");
                                            System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                            answer = input.nextLine();

                                            while (answer.equalsIgnoreCase("0"))
                                            {
                                                System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                                System.out.println("Are you sure you want to exit to the main menu? (y/n)");
                                                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                                exitGame = input.nextLine();

                                                if (exitGame.equalsIgnoreCase("Y"))
                                                {
                                                    menu = 0;
                                                    break;
                                                }
                                                else if (exitGame.equalsIgnoreCase("N"))
                                                {
                                                    exitGame = "";
                                                    System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                                    System.out.println("Please input your answer for the existing question: ");
                                                    System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                                    answer = input.nextLine();
                                                }
                                            }

                                            if (answer.equalsIgnoreCase("D"))
                                            {
                                                correctAnswer = 1;
                                            }
                                            else
                                            {
                                                correctAnswer = 2;
                                            }

                                            answeredQuestions += "E";
                                            break;


                                        case 6:

                                            if (answeredQuestions.indexOf('F') > -1)
                                            {
                                                totalQuestions--;
                                                break;
                                            }

                                            System.out.println("\n\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                            System.out.println("\nWhat can hard disks not do?\n");
                                            System.out.println("a. Save information when power is off");
                                            System.out.println("b. Automatically delete junk files.");
                                            System.out.println("c. Change information");
                                            System.out.println("d. Almost instantly access information");
                                            System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                            answer = input.nextLine();

                                            while (answer.equalsIgnoreCase("0"))
                                            {
                                                System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                                System.out.println("Are you sure you want to exit to the main menu? (y/n)");
                                                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                                exitGame = input.nextLine();

                                                if (exitGame.equalsIgnoreCase("Y"))
                                                {
                                                    menu = 0;
                                                    break;
                                                }
                                                else if (exitGame.equalsIgnoreCase("N"))
                                                {
                                                    exitGame = "";
                                                    System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                                    System.out.println("Please input your answer for the existing question: ");
                                                    System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                                    answer = input.nextLine();
                                                }
                                            }

                                            if (answer.equalsIgnoreCase("B"))
                                            {
                                                correctAnswer = 1;
                                            }
                                            else
                                            {
                                                correctAnswer = 2;
                                            }

                                            answeredQuestions += "F";
                                            break;


                                        case 7:

                                            if (answeredQuestions.indexOf('G') > -1)
                                            {
                                                totalQuestions--;
                                                break;
                                            }

                                            System.out.println("\n\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                            System.out.println("\nWhat is the memory capacity for most CDs?\n");
                                            System.out.println("a. 738 mb");
                                            System.out.println("b. 783 gb");
                                            System.out.println("c. 783 mb");
                                            System.out.println("d. 738 kb");
                                            System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                            answer = input.nextLine();

                                            while (answer.equalsIgnoreCase("0"))
                                            {
                                                System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                                System.out.println("Are you sure you want to exit to the main menu? (y/n)");
                                                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                                exitGame = input.nextLine();

                                                if (exitGame.equalsIgnoreCase("Y"))
                                                {
                                                    menu = 0;
                                                    break;
                                                }
                                                else if (exitGame.equalsIgnoreCase("N"))
                                                {
                                                    exitGame = "";
                                                    System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                                    System.out.println("Please input your answer for the existing question: ");
                                                    System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                                    answer = input.nextLine();
                                                }
                                            }

                                            if (answer.equalsIgnoreCase("C"))
                                            {
                                                correctAnswer = 1;
                                            }
                                            else
                                            {
                                                correctAnswer = 2;
                                            }

                                            answeredQuestions += "G";
                                            break;

                                        case 8:

                                            if (answeredQuestions.indexOf('H') > -1)
                                            {
                                                totalQuestions--;
                                                break;
                                            }

                                            System.out.println("\n\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                            System.out.println("\nWhat is most of a CD made of?\n");
                                            System.out.println("a. Polyplastic carbon");
                                            System.out.println("b. Polycarbonate plastic");
                                            System.out.println("c. Refined silver");
                                            System.out.println("d. Metal");
                                            System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                            answer = input.nextLine();

                                            while (answer.equalsIgnoreCase("0"))
                                            {
                                                System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                                System.out.println("Are you sure you want to exit to the main menu? (y/n)");
                                                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                                exitGame = input.nextLine();

                                                if (exitGame.equalsIgnoreCase("Y"))
                                                {
                                                    menu = 0;
                                                    break;
                                                }
                                                else if (exitGame.equalsIgnoreCase("N"))
                                                {
                                                    exitGame = "";
                                                    System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                                    System.out.println("Please input your answer for the existing question: ");
                                                    System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                                    answer = input.nextLine();
                                                }
                                            }

                                            if (answer.equalsIgnoreCase("B"))
                                            {
                                                correctAnswer = 1;
                                            }
                                            else
                                            {
                                                correctAnswer = 2;
                                            }

                                            answeredQuestions += "H";
                                            break;

                                        case 9:

                                            if (answeredQuestions.indexOf('I') > -1)
                                            {
                                                totalQuestions--;
                                                break;
                                            }

                                            System.out.println("\n\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                            System.out.println("\nHow many tracks are on a CD?\n");
                                            System.out.println("a. 1");
                                            System.out.println("b. 2");
                                            System.out.println("c. 3");
                                            System.out.println("d. 4");
                                            System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                            answer = input.nextLine();

                                            while (answer.equalsIgnoreCase("0"))
                                            {
                                                System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                                System.out.println("Are you sure you want to exit to the main menu? (y/n)");
                                                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                                exitGame = input.nextLine();

                                                if (exitGame.equalsIgnoreCase("Y"))
                                                {
                                                    menu = 0;
                                                    break;
                                                }
                                                else if (exitGame.equalsIgnoreCase("N"))
                                                {
                                                    exitGame = "";
                                                    System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                                    System.out.println("Please input your answer for the existing question: ");
                                                    System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                                    answer = input.nextLine();
                                                }
                                            }

                                            if (answer.equalsIgnoreCase("A"))
                                            {
                                                correctAnswer = 1;
                                            }
                                            else
                                            {
                                                correctAnswer = 2;
                                            }

                                            answeredQuestions += "I";
                                            break;

                                        case 10:

                                            if (answeredQuestions.indexOf('J') > -1)
                                            {
                                                totalQuestions--;
                                                break;
                                            }

                                            System.out.println("\n\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                            System.out.println("\nWhat is the missing ??? from the sequence?\n");
                                            System.out.println("\t\t1. Check the CMOS Setup for custom settings");
                                            System.out.println("\t\t2. Load the interrupt handlers and device drivers");
                                            System.out.println("\t\t3. Initialize registers and power management");
                                            System.out.println("\t\t4. ???");
                                            System.out.println("\t\t5. Display system settings");
                                            System.out.println("\t\t6. Determine which devices are bootable");
                                            System.out.println("\t\t7. Initiate the bootstrap sequence\n");
                                            System.out.println("a. Perform a cold boot");
                                            System.out.println("b. Perform the power-on self-test");
                                            System.out.println("c. Reboot the computer to check for updates");
                                            System.out.println("d. Perform the power-off self test");
                                            System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                            answer = input.nextLine();

                                            while (answer.equalsIgnoreCase("0"))
                                            {
                                                System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                                System.out.println("Are you sure you want to exit to the main menu? (y/n)");
                                                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                                exitGame = input.nextLine();

                                                if (exitGame.equalsIgnoreCase("Y"))
                                                {
                                                    menu = 0;
                                                    break;
                                                }
                                                else if (exitGame.equalsIgnoreCase("N"))
                                                {
                                                    exitGame = "";
                                                    System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                                    System.out.println("Please input your answer for the existing question: ");
                                                    System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                                    answer = input.nextLine();
                                                }
                                            }

                                            if (answer.equalsIgnoreCase("B"))
                                            {
                                                correctAnswer = 1;
                                            }
                                            else
                                            {
                                                correctAnswer = 2;
                                            }

                                            answeredQuestions += "J";
                                            break;

                                        case 11:

                                            if (answeredQuestions.indexOf('K') > -1)
                                            {
                                                totalQuestions--;
                                                break;
                                            }

                                            System.out.println("\n\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                            System.out.println("\nWhat does the BIOS not do:\n");
                                            System.out.println("a. Download more RAM");
                                            System.out.println("b. Perform the power-on self-test");
                                            System.out.println("c. Load the operating system");
                                            System.out.println("d. Make sure other computer components are working together");
                                            System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                            answer = input.nextLine();

                                            while (answer.equalsIgnoreCase("0"))
                                            {
                                                System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                                System.out.println("Are you sure you want to exit to the main menu? (y/n)");
                                                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                                exitGame = input.nextLine();

                                                if (exitGame.equalsIgnoreCase("Y"))
                                                {
                                                    menu = 0;
                                                    break;
                                                }
                                                else if (exitGame.equalsIgnoreCase("N"))
                                                {
                                                    exitGame = "";
                                                    System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                                    System.out.println("Please input your answer for the existing question: ");
                                                    System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                                    answer = input.nextLine();
                                                }
                                            }

                                            if (answer.equalsIgnoreCase("A"))
                                            {
                                                correctAnswer = 1;
                                            }
                                            else
                                            {
                                                correctAnswer = 2;
                                            }

                                            answeredQuestions += "K";
                                            break;

                                        case 12:

                                            if (answeredQuestions.indexOf('L') > -1)
                                            {
                                                totalQuestions--;
                                                break;
                                            }

                                            System.out.println("\n\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                            System.out.println("\nThe BIOS is usually stored on:\n");
                                            System.out.println("a. The CPU (Central Processing Unit)");
                                            System.out.println("b. The Video Card");
                                            System.out.println("c. Flash Memory");
                                            System.out.println("d. RAM (Random Access Memory)");
                                            System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                            answer = input.nextLine();

                                            while (answer.equalsIgnoreCase("0"))
                                            {
                                                System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                                System.out.println("Are you sure you want to exit to the main menu? (y/n)");
                                                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                                exitGame = input.nextLine();

                                                if (exitGame.equalsIgnoreCase("Y"))
                                                {
                                                    menu = 0;
                                                    break;
                                                }
                                                else if (exitGame.equalsIgnoreCase("N"))
                                                {
                                                    System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                                    System.out.println("Please input your answer for the existing question: ");
                                                    System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                                    answer = input.nextLine();
                                                }
                                            }

                                            if (answer.equalsIgnoreCase("C"))
                                            {
                                                correctAnswer = 1;
                                            }
                                            else
                                            {
                                                correctAnswer = 2;
                                            }

                                            answeredQuestions += "L";
                                            break;

                                        case 13:

                                            if (answeredQuestions.indexOf('M') > -1)
                                            {
                                                totalQuestions--;
                                                break;
                                            }

                                            System.out.println("\n\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                            System.out.println("\nHow does the CD player interpret information?\n");
                                            System.out.println("a. It has an optical sensor that checks whether the laser is reflecting back into the sensor");
                                            System.out.println("b. It detects the distance between the laser and the disc to check for bumps");
                                            System.out.println("c. The laser determines whether the information is a 0 or 1 from the material of the layer on the disc");
                                            System.out.println("d. The CD player uses a magnetic arm to interpret the information");
                                            System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                            answer = input.nextLine();

                                            while (answer.equalsIgnoreCase("0"))
                                            {
                                                System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                                System.out.println("Are you sure you want to exit to the main menu? (y/n)");
                                                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                                exitGame = input.nextLine();

                                                if (exitGame.equalsIgnoreCase("Y"))
                                                {
                                                    menu = 0;
                                                    break;
                                                }
                                                else if (exitGame.equalsIgnoreCase("N"))
                                                {
                                                    exitGame = "";
                                                    System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                                    System.out.println("Please input your answer for the existing question: ");
                                                    System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                                    answer = input.nextLine();
                                                }
                                            }

                                            if (answer.equalsIgnoreCase("A"))
                                            {
                                                correctAnswer = 1;
                                            }
                                            else
                                            {
                                                correctAnswer = 2;
                                            }

                                            answeredQuestions += "M";
                                            break;


                                        case 14:

                                            if (answeredQuestions.indexOf('N') > -1)
                                            {
                                                totalQuestions--;
                                                break;
                                            }

                                            System.out.println("\n\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                            System.out.println("\nWhat is the difference between how a CD-R and a regular CD are read?\n");
                                            System.out.println("a. Regular CD uses a white laser beam, CD-R uses a red laser beam");
                                            System.out.println("b. Regular CD uses a laser beam, CD-Rs use a magnetic arm");
                                            System.out.println("c. Regular CD uses a single optical sensor, CD-R uses a double optical sensor that are assigned to 0 or 1.");
                                            System.out.println("d. Regular CD uses bumps to reflect lasers off, CD-Rs use opaque areas to stop light from reflecting");
                                            System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                            answer = input.nextLine();

                                            while (answer.equalsIgnoreCase("0"))
                                            {
                                                System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                                System.out.println("Are you sure you want to exit to the main menu? (y/n)");
                                                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                                exitGame = input.nextLine();

                                                if (exitGame.equalsIgnoreCase("Y"))
                                                {
                                                    menu = 0;
                                                    break;
                                                }
                                                else if (exitGame.equalsIgnoreCase("N"))
                                                {
                                                    exitGame = "";
                                                    System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                                    System.out.println("Please input your answer for the existing question: ");
                                                    System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                                    answer = input.nextLine();
                                                }
                                            }

                                            if (answer.equalsIgnoreCase("D"))
                                            {
                                                correctAnswer = 1;
                                            }
                                            else
                                            {
                                                correctAnswer = 2;
                                            }

                                            answeredQuestions += "N";
                                            break;

                                        case 15:

                                            if (answeredQuestions.indexOf('O') > -1)
                                            {
                                                totalQuestions--;
                                                break;
                                            }

                                            System.out.println("\n\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                            System.out.println("\nHow do CD-Rs record information?\n");
                                            System.out.println("a. The discs have dyes that are burned with a concentrated light to become unreflective");
                                            System.out.println("b. The discs are scratched to create bumps that can be interpreted by the CD player");
                                            System.out.println("c. The discs are layered with an opaque dye that represents an unreflective area of the disc");
                                            System.out.println("d. The discs are layered with a reflective dye that represents a reflective area of the disc");
                                            System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                            answer = input.nextLine();

                                            while (answer.equalsIgnoreCase("0"))
                                            {
                                                System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                                System.out.println("Are you sure you want to exit to the main menu? (y/n)");
                                                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                                exitGame = input.nextLine();

                                                if (exitGame.equalsIgnoreCase("Y"))
                                                {
                                                    menu = 0;
                                                    break;
                                                }
                                                else if (exitGame.equalsIgnoreCase("N"))
                                                {
                                                    exitGame = "";
                                                    System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                                    System.out.println("Please input your answer for the existing question: ");
                                                    System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                                    answer = input.nextLine();
                                                }
                                            }

                                            if (answer.equalsIgnoreCase("A"))
                                            {
                                                correctAnswer = 1;
                                            }
                                            else
                                            {
                                                correctAnswer = 2;
                                            }

                                            answeredQuestions += "O";
                                            break;


                                        case 16:

                                            if (answeredQuestions.indexOf('P') > -1)
                                            {
                                                totalQuestions--;
                                                break;
                                            }

                                            System.out.println("\n\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                            System.out.println("\nWhat is the name of the processor the PS4 uses?\n");
                                            System.out.println("a. Cheetah");
                                            System.out.println("b. Jaguar");
                                            System.out.println("c. Tiger");
                                            System.out.println("d. Lion");
                                            System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                            answer = input.nextLine();

                                            while (answer.equalsIgnoreCase("0"))
                                            {
                                                System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                                System.out.println("Are you sure you want to exit to the main menu? (y/n)");
                                                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                                exitGame = input.nextLine();

                                                if (exitGame.equalsIgnoreCase("Y"))
                                                {
                                                    menu = 0;
                                                    break;
                                                }
                                                else if (exitGame.equalsIgnoreCase("N"))
                                                {
                                                    exitGame = "";
                                                    System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                                    System.out.println("Please input your answer for the existing question: ");
                                                    System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                                    answer = input.nextLine();
                                                }
                                            }

                                            if (answer.equalsIgnoreCase("B"))
                                            {
                                                correctAnswer = 1;
                                            }
                                            else
                                            {
                                                correctAnswer = 2;
                                            }

                                            answeredQuestions += "P";
                                            break;

                                        case 17:

                                            if (answeredQuestions.indexOf('Q') > -1)
                                            {
                                                totalQuestions--;
                                                break;
                                            }

                                            System.out.println("\n\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                            System.out.println("\nWhat type of RAM does the PS4 use?\n");
                                            System.out.println("a. GDDR5");
                                            System.out.println("b. GDDR4");
                                            System.out.println("c. DDR4");
                                            System.out.println("d. DDR5");
                                            System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                            answer = input.nextLine();

                                            while (answer.equalsIgnoreCase("0"))
                                            {
                                                System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                                System.out.println("Are you sure you want to exit to the main menu? (y/n)");
                                                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                                exitGame = input.nextLine();

                                                if (exitGame.equalsIgnoreCase("Y"))
                                                {
                                                    menu = 0;
                                                    break;
                                                }
                                                else if (exitGame.equalsIgnoreCase("N"))
                                                {
                                                    exitGame = "";
                                                    System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                                    System.out.println("Please input your answer for the existing question: ");
                                                    System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                                    answer = input.nextLine();
                                                }
                                            }

                                            if (answer.equalsIgnoreCase("A"))
                                            {
                                                correctAnswer = 1;
                                            }
                                            else
                                            {
                                                correctAnswer = 2;
                                            }

                                            answeredQuestions += "Q";
                                            break;

                                        case 18:

                                            if (answeredQuestions.indexOf('R') > -1)
                                            {
                                                totalQuestions--;
                                                break;
                                            }

                                            System.out.println("\n\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                            System.out.println("\nWhich game is not a Sony exclusive?\n");
                                            System.out.println("a. Persona 5");
                                            System.out.println("b. God of War");
                                            System.out.println("c. Spider-Man");
                                            System.out.println("d. Super Smash Bros. Ultimate");
                                            System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                            answer = input.nextLine();

                                            while (answer.equalsIgnoreCase("0"))
                                            {
                                                System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                                System.out.println("Are you sure you want to exit to the main menu? (y/n)");
                                                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                                exitGame = input.nextLine();

                                                if (exitGame.equalsIgnoreCase("Y"))
                                                {
                                                    menu = 0;
                                                    break;
                                                }
                                                else if (exitGame.equalsIgnoreCase("N"))
                                                {
                                                    exitGame = "";
                                                    System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                                    System.out.println("Please input your answer for the existing question: ");
                                                    System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                                    answer = input.nextLine();
                                                }
                                            }
                                            if (answer.equalsIgnoreCase("D"))
                                            {
                                                correctAnswer = 1;
                                            }
                                            else
                                            {
                                                correctAnswer = 2;
                                            }

                                            answeredQuestions += "R";
                                            break;

                                    }

                                    if (answer.equalsIgnoreCase("0"))
                                    {
                                        health = 0;
                                        break;
                                    }
                                    else if (health == 0)
                                    {
                                        break;
                                    }
                                    else if (correctAnswer == 1)
                                    {
                                        System.out.println("\n=-=-=-=-=-=-=-=");
                                        System.out.println("|\tCorrect!  |");
                                        System.out.println("=-=-=-=-=-=-=-=");
                                    }
                                    else if (correctAnswer == 2)
                                    {
                                        damage = (int) ((15 - 10 + 1) * Math.random() + 10);
                                        health -= damage;

                                        if (health < 0)
                                        {
                                            health = 0;
                                        }

                                        System.out.println("\nIncorrect. You lost " + (percent.format(damage / 100)) + " of your HP!");
                                        System.out.println("\nYou have " + (percent.format(health / 100)) + " HP remaining!");

                                        if (health == 0)
                                        {


                                            System.out.println("GAME OVER\n");

                                            do
                                            {
                                                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                                System.out.println("\t\t---------------------------");
                                                System.out.println("\t\t| 1. Play again           |");
                                                System.out.println("\t\t---------------------------");
                                                System.out.println("\t\t| 2. Return to main menu  |");
                                                System.out.println("\t\t---------------------------");
                                                System.out.println("\t\t| 3. Exit Program         |");
                                                System.out.println("\t\t---------------------------");
                                                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

                                                answer = "";
                                                endgameMenu = input.nextInt();
                                                playerChoice = "";

                                                if (endgameMenu == 1)
                                                {
                                                    gameModeSelect = 2;
                                                    break;
                                                }
                                                else if (endgameMenu == 2)
                                                {
                                                    menu = 0;
                                                    gameModeSelect = 0;
                                                    totalQuestions = 20;
                                                    playerChoice = "0";
                                                    break;
                                                }
                                                else if (endgameMenu == 3)
                                                {
                                                    System.exit(0);
                                                }

                                            } while (!(endgameMenu <= 3 && endgameMenu >= 1));

                                        }
                                    }
                                }
                            }

                        } while (!(playerChoice.equalsIgnoreCase("N")) || !(playerChoice.equalsIgnoreCase("Y")));

                    }

                    if (gameModeSelect == 3)
                    {
                        menu = 0;
                        playerChoice = "";
                    }

                } while (menu != 0 && (gameModeSelect < 1 || gameModeSelect > 3) || playerChoice.equalsIgnoreCase("N"));

            }

            //Instructions Menu
            if (menu == 2)
            {
                System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                System.out.println("\nYou wish to enter the S-Rank dungeon? Very well, I will guide you.\n");
                System.out.println("Welcome to Monster Dungeon! Enter numbers or letters to progress through the game based");
                System.out.println("on the on-screen instructions. Before venturing into the dungeon, we highly recommend");
                System.out.println("to improve your knowledge by selecting the “Training” option (Main menu → 1. Start Game → 1. Training).\n");

                System.out.println("Use your newfound knowledge to answer questions that come your way and slay the monsters that lurk.\n");
                System.out.println("The more questions you answer correctly, the higher your score.");
                System.out.println("However if you answer too many questions incorrectly, your HP will be depleted and that means game over.\n");
                System.out.println("Good luck, " + playerName + "!");

                System.out.println("\n0 to exit to main menu");
                System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                menu = input.nextInt();

                if (menu != 0)
                {
                    break;
                }
            }

            //About program Menu
            if (menu == 3)
            {
                System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                System.out.println("\nWelcome to about program.");
                System.out.println("\n0 to exit to main menu");
                System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                menu = input.nextInt();

                if (menu != 0)
                {
                    break;
                }
            }

        } while (menu <= 0 || menu >= 4);
    }
}