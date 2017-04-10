public class Songbase {

    Song[] songs;

    public Songbase(Song[] songs) {
            this.songs = songs;
    }
    public Song findByTitle(String title) {
        for (int i=0; i < songs.length; i++) {
            if ( title.equals(songs[i].getTitle()) ) {
                return songs[i];
            }
        }
        return null;
        // TODO returns the first ``Song`` instance stored in the array instance variable whose name matches ``title`` and ``null`` if no ``Song`` is found.
    }
    public Song findByArtist(String artist) {
        for (int i=0; i < songs.length; i++) {
            if ( artist.equals(songs[i].getArtist()) ){
                return songs[i];
            }
        }
        return null;
        //TODO returns the first ``Song`` instance stored in the array instance variable that was performed by the artist ``artist`` and ``null`` if no ``Song`` is found.
    }

}
