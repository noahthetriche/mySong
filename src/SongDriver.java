public class SongDriver {
    public static void main(String[] args) {
        //create a song or more
        Song someSong = new Song();
        Song fireworks = new Song("Fireworks", "Katy Perry", true, 234, 6.94);
        Song deadLochs = new Song("DeadLochs", "Blue Face", true, 150, 3.57);
        Song overture = new Song("1812 Overture", "Petyr Ilych Tchaicovsky", false, 1080, 11.11);



        playlist myPlaylist = new playlist();
        myPlaylist.addSong(fireworks);
        myPlaylist.addSong(overture);
        myPlaylist.addSong(deadLochs);
        myPlaylist.addSong(someSong);
        System.out.println(myPlaylist.toString());

        /*
        if (deadLochs == deadLochs2)
        {
            System.out.println("They're the same ");
        }
        else
        {
            System.out.println("They're NOT the same");
        }

        if (deadLochs == deadLochs3)
        {
            System.out.println("They're the same ");
        }
        else
        {
            System.out.println("They're NOT the same");
        }

        System.out.println("There are " + Song.getCount() + " songs in this list.");

         */
        /*
        Song tides = new Song();

        Song ladyworld = new Song();

        fireworks.Title = " Happy Song";
        System.out.println(fireworks);

         */

        /*
        //test getters
        System.out.println(fireworks.getTitle());
        System.out.println(deadLochs.getArtist());
        System.out.println(overture.getHasLyrics());
        System.out.println(overture.getLength());
        System.out.println(fireworks.getFileSize());

        System.out.println("In minutes: " + overture.toMinSec());

         */
/*
        deadLochs.setLength();
        System.out.println(deadLochs);

 */
    }
}

        /*
        //testing setters
        System.out.println(tides);
        tides.setTitle("Cosmic Tides");

        tides.setArtist("TWRP");

        tides.setHasLyrics(true);

        tides.setLength(252);





        /*
        //print it out


         
        System.out.println(fireworks);
        System.out.println();
        System.out.println(deadLochs);
        System.out.println();
        System.out.println(overture)



        //test
    }//end main method
}//end class SongDriver
}
         */
