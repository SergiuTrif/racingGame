package org.fasttrackit;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Game {

    private Vehicle competitor1;
    private Vehicle competitor2;
    private Track[] tracks = new Track[3];
    private List<Vehicle> competitors = new ArrayList<>();


    public void start() throws Exception {
        initializeTracks();
        displayTracks();
        initializeCompetitors();

    }

    private void initializeCompetitors() throws Exception {
        int competitorCount = getCompetitorCountFromUser();

        System.out.println("Today's competitors are:");


        for (int i = 0; i < competitorCount; i++) {

            Vehicle competitor = new Vehicle();
            competitor.setName("Competitor " + i);
            competitor.setMaxSpeed(300);
            competitor.setMileage(ThreadLocalRandom.current().nextDouble(6, 12));
            competitor.setFuelLevel(80);

            System.out.println(competitor);

            competitors.add(competitor);
        }
    }


    private int getCompetitorCountFromUser() throws Exception {
        System.out.println("Please enter number of players");
        Scanner scanner = new Scanner(System.in);
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            //e = exception

        }// catch (NullPointerException e) {
        //System.out.println("Sorry");
        finally {
            System.out.println("Finally block is always executed.");
        }
        throw new Exception ("You have entered an invalid number");
    }





    private void initializeTracks() {
        Track track1 = new Track();
        track1.setName("Monte Carlo");
        track1.setLenght(300);

        tracks[0] = track1;

        Track track2 = new Track();
        track2.setName("Monza");
        track2.setLenght(400);

        tracks[1] = track2;
    }


    private void displayTracks() {
        System.out.println("Available tracks:");

        for (int i = 0; i < tracks.length; i++) {
            if (tracks[i] != null) {
            System.out.println(tracks[i].getName() + " - Lenght: " + tracks[i].getLenght() + " km.");


          }

       }

    }

 }
