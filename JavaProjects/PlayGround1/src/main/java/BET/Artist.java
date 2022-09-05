package BET;

public class Artist {

    //name,labels,song
    public String ArtistName;
    public String label;
    public String[] songs;

    //constructor
    public Artist(String ArtistName, String label,String[] songs){
        this.ArtistName = ArtistName;
        this.label = label;
        this.songs = songs;
    }

    public Artist(String beyonce, String universal) {

    }

    //print artist name and label

    public void printArtistinfo(){
        System.out.println(this.ArtistName + "" +this.label);


    }
    public void playPlaylist(){

        for(int x = 0; x < songs.length; x++)
            System.out.println(songs[x]);



    }


    //sing - a method
}
