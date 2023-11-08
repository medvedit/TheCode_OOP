package org.medwed_sa.Lessen.Lesson_4_generics.lessen_10.Ex004.V2;

public class Program {
    public static void main(String[] args) {
        Repository<AudioContent> audioStorage = new Repository<>("audioStorage");
        audioStorage.add(new AudioContent("track_001.mp3"));
        audioStorage.add(new AudioContent("03 Дорожка 03.wma"));
        
//        for (int index = 0; index < audioStorage.count(); index++) {
//            System.out.println(audioStorage.get(index));
//        }
        for ( AudioContent o : audioStorage) {
            System.out.println(o);
        }
        System.out.println();
        
        Repository<VideoContent> videoStorage = new Repository<>("videoStorage");
        videoStorage.add(new VideoContent("Новый фильм 1.wmv"));
        videoStorage.add(new VideoContent("Новый фильм 5.3gp")); 

//        for (int index = 0; index < videoStorage.count(); index++) {
//            System.out.println(videoStorage.get(index));
//        }
        for (VideoContent o : videoStorage) {
            System.out.println(o);
        }
        System.out.println();
        
        //#region проблема решена

//         audioStorage.add(new VideoContent("jfvjdhdf7768.mp4"));
//         videoStorage.add(new AudioContent("Дорожка 005.wav"));

        //#endregion

        //#region 
        // (нет)
        
        Repository<String> stringRepository = new Repository<>("stringRepository");
        stringRepository.add("Кринж");
        stringRepository.add("Краш");
        stringRepository.add("Рофл");
        stringRepository.add("Криповый");
        stringRepository.add("Личинус");
        stringRepository.add("Шеймить");
        for (int i = 0; i < stringRepository.count(); i++) {
            System.out.println(stringRepository.get(i));
        }
        //#endregion
    }
}
