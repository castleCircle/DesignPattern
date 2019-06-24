package Adapter;

public class AdapterMain {
	public static void main(String[] args) {
		AudioPlayer a = new AudioPlayer();
		a.play("mp3", "mp3");
		a.play("mp4", "mp4");
		a.play("vlc", "vlc");
	}
}
