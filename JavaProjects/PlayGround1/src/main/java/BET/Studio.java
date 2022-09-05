package BET;

public class Studio {
    public static void main(String[] args) {
        Artist artist1 = new Artist("beyonce","Universal");
        String[] beyoncesongs = {"who run the world" , "halo" , "to the left"};

        for(int x = 0; x < beyoncesongs.length; x++)
            System.out.println(beyoncesongs[x]);

        Artist artist2 = new Artist("PoloG","Interscope");
        String[] PoloGsongs = {"BlockParty,Rapstar "};

        artist1.playPlaylist();


    }
}
