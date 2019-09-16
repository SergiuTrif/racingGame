package org.fasttrackit;

public class Game {

    private Vehicle competitor1;
    private Vehicle competitor2;
    private Track[] tracks = new Track[3];

    public void start() {
        initializeTracks();
        displayTracks();

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
