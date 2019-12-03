public class Song
{
    //Instance variables
    private String Title;
    private String Artist;
    private boolean hasLyrics;
    private int length; //in secs
    private double fileSize; //in mB
    private static int count = 0; //


    //Constructors, at least 2
    //overloaded constructors have early binding
    public Song()
    {
        Title = null;
        Artist = null;
        hasLyrics = false;
        length = 0;
        fileSize = 0.0;
        count++;

    }//end zero arg or default constructor

    public Song (String newTitle, String newArtist, boolean hasNewLyrics)
    {
        Title = newTitle;
        Artist = newArtist;
        hasLyrics = hasNewLyrics;
        length = 0;
        fileSize = 0.0;
        count++;
    }//end three argument constructor


    public Song(String title, String artist, boolean hasLyrics, int length, double fileSize)
    {
        this.Title = title;
        this.Artist = artist;
        this.hasLyrics = hasLyrics;
        this.length = checkLength(length);
        this.fileSize = fileSize;
        count++;

    }//end multi-arg constructor

    //getters
    public static int getCount()
    {
        return count;
    }//end getCount

    public String getTitle()
    {
        return Title;
    }

    public String getArtist()
    {
        return Artist;
    }

    public boolean getHasLyrics()
    {
        return hasLyrics;
    }

    public int getLength()
    {
        return length;
    }

    public double getFileSize()
    {
        return fileSize;
    }

    //setters
    public void setTitle(String newTitle)
    {
        Title = newTitle;
    }

    public void setArtist(String newArtist)
    {
        Artist = newArtist;
    }

    public void setHasLyrics(boolean hasNewLyrics)
    {
        hasLyrics = hasNewLyrics;
    }

    //pre condition: object existing
    //post condition:

    public void setLength (int newLength)
    {
        length = checkLength(newLength);
    }

    public void setFileSize (double newFileSize)
    {
        fileSize = newFileSize;
    }

    //brain methods
/*
    public int compareTo(Object someSong)
    {
        if (this.length < someSong.getLength())
        {
            return -1;
        }
        else if (this.length ==someSong.length())
        {
            return 0;
        }
        else
        {
            return 1;
        }
    }//end compareTo implemented interface Comparable

 */
    public String toMinSec()
    {
        int mins = length / 60;
        int seconds = length % 60;
       return mins + " mins " + seconds + " sec ";
    }//end brain method

    //helper method , helps other methods by validating entry, method decomposition

    private int checkLength(int newLength)
    {
        int tempLength = newLength;
        if (tempLength < 0)
        {
            tempLength = 0;
        }//end if
        else if (tempLength > 1200)
        {
            tempLength = 1200;
        }//end elseIf
        return tempLength;
    }//end length validation




    //toString a must have for every great object class

    public String toString()
    {
        String output = "";
        output += "Title: -" + Title;
        output += "\nArtist: " + Artist;
        output += "\nLength (in seconds): " + length;
        output += "\nFile Size (in mB): " + fileSize;

        return output;
    }//end toString

    //setter




}//end class Song
