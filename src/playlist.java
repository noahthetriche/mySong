public class playlist
{
    //1 instance variables
    private Song[] playlist;
    private int countSong = 0;

    //constructor
    public playlist()
    {
        playlist = new Song[4];
    }//end zero arg constructor

    //brain methods
    public void addSong(Song aSong )
    {
        playlist[countSong] = aSong;
        countSong++;
    }

    private void increaseSize()
    {
        Song[] temp = new Song[playlist.length * 2];

        for(int s = 0; s < playlist.length; s++)
        {
            temp[s] = playlist[s];
        }
        playlist = temp;
    }

    //toString
    public String toString()
    {
        if (countSong == playlist.length)
        {
            increaseSize();
        }

        String output = "--------------My Playlist----------------\n";
        for(int s = 0; s < countSong; s++)
        {
            output += playlist[s].toString() + "\n";
            output += "\n-----------------\n";
        }//end for loop
        return output;
    }//end toString

}//end playlist class
