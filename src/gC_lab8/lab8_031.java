package gC_lab8;

import java.util.Scanner;

public class lab8_031 {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);
		int prisonerIdSelection = 0;
		String[] crimeCommitted = new String[7];
		String[] homeTown = new String[7];
		String[] prisonerName = new String[7];

		prisonerName[0] = "Ronny";
		prisonerName[1] = "Buddy";
		prisonerName[2] = "Justin";
		prisonerName[3] = "Peanut";
		prisonerName[4] = "Andy";
		prisonerName[5] = "Harry";
		prisonerName[6] = "Eron";

		homeTown[0] = "Sturtevant, WI";
		homeTown[1] = "Appleton, WI";
		homeTown[2] = "Duluth, MN";
		homeTown[3] = "Moscow, RU";
		homeTown[4] = "Detroit, MI";
		homeTown[5] = "Palo Alto, CA";
		homeTown[6] = "Orlando, FL";

		crimeCommitted[0] = "Pirating movies";
		crimeCommitted[1] = "Taking the tag off a mattress";
		crimeCommitted[2] = "Forgetting to clean the bathroom";
		crimeCommitted[3] = "Chewing gum in class";
		crimeCommitted[4] = "Eating too much candy";
		crimeCommitted[5] = "Stealing a wheel of cheese";
		crimeCommitted[6] = "Sneaking into Disney World";
		System.out.println("Welcome to the Prisoner Database System (PDS)");
		System.out.println("Enter a prisoner ID number (1-7)");

		while (true) {

			try {

				prisonerIdSelection = scnr.nextInt() - 1;
				String checkInput = prisonerName[prisonerIdSelection];
				break;

			} catch (IndexOutOfBoundsException e) {
				System.err.println("Invalid prisoner ID number. Hint: we only have 7 prisoners here. Enter 1-7");

			}
		}

		System.out.println("\n");

		System.out.println("Prisoner number " + (prisonerIdSelection + 1) + " is " + prisonerName[prisonerIdSelection]
				+ ". What do you want to know about " + prisonerName[prisonerIdSelection]
				+ " (Crime Committed or Hometown)?");

		scnr.nextLine();
		String infoSelection = scnr.nextLine();
		String userContinue = "y";

		if (infoSelection.equalsIgnoreCase("Crime Committed")) {

			System.out.println(
					prisonerName[prisonerIdSelection] + " is guilty of:  " + crimeCommitted[prisonerIdSelection]
							+ ", Do you want to know more about " + prisonerName[prisonerIdSelection] + " (Y/N)?");

			userContinue = scnr.nextLine();

			if (userContinue.equalsIgnoreCase("y")) {

				System.out.println(prisonerName[prisonerIdSelection] + " is from " + homeTown[prisonerIdSelection]);

				System.out.println("Do you want to know about another Prisoner? (Y/N)");
				String anotherPrisoner = scnr.nextLine();

				while (anotherPrisoner.equalsIgnoreCase("y")) {

					System.out.println("Enter a prisoner ID number (1-7)");

					prisonerIdSelection = scnr.nextInt() - 1;
					System.out.println("\n");

					System.out.println(
							"Prisoner number " + (prisonerIdSelection + 1) + " is " + prisonerName[prisonerIdSelection]
									+ " who is guilty of " + crimeCommitted[prisonerIdSelection] + ", and is from "
									+ homeTown[prisonerIdSelection] + ".");

					System.out.println("Do you want to know about another Prisoner? (Y/N)");
					scnr.nextLine();
					anotherPrisoner = scnr.nextLine();

				}
				if (anotherPrisoner.equalsIgnoreCase("n")) {
					System.out.println("Thanks anyway!!");
				}

			} else if (userContinue.equalsIgnoreCase("n")) {
				System.out.println("Do you want to know about another Prisoner? (Y/N)");
				String anotherPrisoner = scnr.nextLine();

				while (anotherPrisoner.equalsIgnoreCase("y")) {

					System.out.println("Enter a prisoner ID number (1-7)");

					prisonerIdSelection = scnr.nextInt() - 1;
					System.out.println("\n");

					System.out.println(
							"Prisoner number " + (prisonerIdSelection + 1) + " is " + prisonerName[prisonerIdSelection]
									+ " who is guilty of " + crimeCommitted[prisonerIdSelection] + ", and is from "
									+ homeTown[prisonerIdSelection] + ".");

					System.out.println("Do you want to know about another Prisoner? (Y/N)");
					scnr.nextLine();
					anotherPrisoner = scnr.nextLine();

				}
				if (anotherPrisoner.equalsIgnoreCase("n")) {
					System.out.println("Thanks anyway!!");
				}
			}
		}

		if (infoSelection.equalsIgnoreCase("Hometown")) {

			System.out.println(prisonerName[prisonerIdSelection] + " is from " + homeTown[prisonerIdSelection] + "."
					+ " Do you want to know more? (Y/N) ");

			userContinue = scnr.nextLine();

			if (userContinue.equalsIgnoreCase("y")) {
				System.out.println(
						prisonerName[prisonerIdSelection] + " is guilty of: " + crimeCommitted[prisonerIdSelection]);

				System.out.println("Do you want to know about another Prisoner? (Y/N)");
				String anotherPrisoner = scnr.nextLine();

				while (anotherPrisoner.equalsIgnoreCase("y")) {

					System.out.println("Enter a prisoner ID number (1-7)");

					prisonerIdSelection = scnr.nextInt() - 1;
					System.out.println("\n");

					System.out.println(
							"Prisoner number " + (prisonerIdSelection + 1) + " is " + prisonerName[prisonerIdSelection]
									+ " who is guilty of " + crimeCommitted[prisonerIdSelection] + ", and is from "
									+ homeTown[prisonerIdSelection] + ".");
					System.out.println("\n");
					System.out.println("Do you want to know about another Prisoner? (Y/N)");
					scnr.nextLine();
					anotherPrisoner = scnr.nextLine();

				}
				if (anotherPrisoner.equalsIgnoreCase("n")) {
					System.out.println("Thanks anyway!!");
				}

			} else if (userContinue.equalsIgnoreCase("n")) {
				System.out.println("Do you want to know about another Prisoner? (Y/N)");
				String anotherPrisoner = scnr.nextLine();

				while (anotherPrisoner.equalsIgnoreCase("y")) {

					System.out.println("Enter a prisoner ID number (1-7)");

					prisonerIdSelection = scnr.nextInt() - 1;
					System.out.println("\n");

					System.out.println(
							"Prisoner number " + (prisonerIdSelection + 1) + " is " + prisonerName[prisonerIdSelection]
									+ " who is guilty of " + crimeCommitted[prisonerIdSelection] + ", and is from "
									+ homeTown[prisonerIdSelection] + ".");
					System.out.println("\n");
					System.out.println("Do you want to know about another Prisoner? (Y/N)");
					scnr.nextLine();
					anotherPrisoner = scnr.nextLine();

				}
				if (anotherPrisoner.equalsIgnoreCase("n")) {
					System.out.println("Thanks anyway!!");

				}

			}

		}
	}
}
