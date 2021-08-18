package ooptask;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        patient patient = new patient("Meisam", 23, null);
        righteye righteye = new righteye("Right Eye", 23, "Normal", true, "Blue");
        lefteye lefteye = new lefteye("Left Eye", 23, "Short Sighted", true, "Blue");
        heart heart = new heart("Heart", 23, "Normal", 65);
        stomach stomach = new stomach("Stomach", 23, "PUD", true);
        skin skin = new skin("Skin", 23, "Burned");

        boolean shouldFinish = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Patient Name: " + patient.getName());
        System.out.println("Patient Age: " + patient.getAge());
        System.out.println("");
        while (!shouldFinish) {
            System.out.println("Choose an Organ:");
            System.out.println("\t1. Left Eye");
            System.out.println("\t2. Right Eye");
            System.out.println("\t3. Heart");
            System.out.println("\t4. Stomach");
            System.out.println("\t5. Skin");
            System.out.println("\t6. Quit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Name: " + lefteye.getName());
                    System.out.println("Medical Condition: " + lefteye.getMedicalCondition());
                    System.out.println("Color: " + lefteye.getColor());
                    if (lefteye.isOpened()) {
                        System.out.println("\t\t1. Close the Eye");
                        if (scanner.nextInt() == 1) {
                            lefteye.setOpened(false);
                            System.out.println("Left Eye is closed");
                        }else {continue;} break;
                    }if (!lefteye.isOpened()){
                        System.out.println("\t\t1 Open the Eye");
                        if (scanner.nextInt() == 1) {
                            lefteye.setOpened(true);
                            System.out.println("Left Eye is Opened");
                            break;
                        }else {continue;}
                    }else {continue;}



                case 2:
                    System.out.println("Name: " + righteye.getName());
                    System.out.println("Medical Condition: " + righteye.getMedicalCondition());
                    System.out.println("Color: " + righteye.getColor());
                    if (righteye.isOpened()) {
                        System.out.println("\t\t1. Close the Eye");
                        if (scanner.nextInt() == 1) {
                            righteye.setOpened(false);
                            System.out.println("Right Eye is closed");
                        }else {continue;} break;
                    }if (!righteye.isOpened()){
                    System.out.println("\t\t1 Open the Eye");
                    if (scanner.nextInt() == 1) {
                        righteye.setOpened(true);
                        System.out.println("Right Eye is Opened");
                        break;
                    }else {continue;}
                }else {continue;}


                case 3:
                    System.out.println("Name: " + heart.getName());
                    System.out.println("Medical Condition: " + heart.getMedicalCondition());
                    System.out.println("Heart Beat: " + heart.getHeartBeat());
                    System.out.println("\t\t1. Change Heart Beat");
                    if (scanner.nextInt() == 1) {
                        System.out.println("Enter new Heart Beat:");
                        int newHeartBeat = scanner.nextInt();
                        heart.setHeartBeat(newHeartBeat);
                        System.out.println("Heart Beat changed to " + heart.getHeartBeat());

                        break;
                    }else {continue;}

                case 4:
                    System.out.println("Name: " + stomach.getName());
                    System.out.println("Medical Condition: " + stomach.getMedicalCondition());
                    if (stomach.isFed()) {
                        System.out.println("\t\t1. Digest");
                        if (scanner.nextInt() == 1) {
                            stomach.setFed(false);
                            System.out.println("Starting Digestion....");
                            break;
                        }else {continue;}
                    }if (!stomach.isFed()){
                        System.out.println("\t\t1. Feed patient");
                        if (scanner.nextInt() == 1) {
                            stomach.setFed(true);
                            System.out.println("Patient is fed successfully.");
                            System.out.println("\t\t1. Digest");
                            if (scanner.nextInt() == 1) {
                                stomach.setFed(false);
                                System.out.println("Digestion started...");
                                break;
                            }else {continue;}
                        }else {continue;}
                    }


                case 5:
                    System.out.println("Name: " + skin.getName());
                    System.out.println("Medical Condition: " + skin.getMedicalCondition());
                    continue;
                default:
                    shouldFinish = true;
            }
            }

        }
    }

