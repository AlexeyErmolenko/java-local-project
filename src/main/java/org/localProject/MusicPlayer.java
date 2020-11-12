package org.localProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("musicPlayer")
public class MusicPlayer {
    @Value("${musicPlayer.name}")
    protected String name;

    @Value("${musicPlayer.volume}")
    protected int volume;

    protected Music music;

    @Autowired
    public MusicPlayer(@Qualifier("jazzMusic") Music music) {
        this.music = music;
    }

    public void playMusic() {
        System.out.println("Playing: " + this.music.getSong());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
