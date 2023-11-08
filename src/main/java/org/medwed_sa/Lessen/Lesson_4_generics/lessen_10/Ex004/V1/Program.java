package org.medwed_sa.Lessen.Lesson_4_generics.lessen_10.Ex004.V1;

public class Program {
    public static void main(String[] args) {
        Repository audioStorage = new Repository("audioStorage");
        audioStorage.add(new AudioContent("track_001.mp3"));
        audioStorage.add(new AudioContent("03 Дорожка 03.wma"));

        for (Content s : audioStorage) {
            System.out.println(s);
        }
        System.out.println();

        for (int index = 0; index < audioStorage.count(); index++) {
            System.out.println(audioStorage.get(index));
        }

        Repository videoStorage = new Repository("videoStorage");
        videoStorage.add(new VideoContent("Новый фильм 1.wmv"));
        videoStorage.add(new VideoContent("Новый фильм 5.3gp")); 

        for (int index = 0; index < videoStorage.count(); index++) {
            System.out.println(videoStorage.get(index));
        }
        System.out.println();

        //#region проблема
        audioStorage.add(new VideoContent("Трек7768.mp4"));
        videoStorage.add(new AudioContent("Клип005.wav"));
        //#endregion


        System.out.println(videoStorage.getContentInfo());
    }
}
