package org.medwed_sa.Lessen.Lesson_4_generics.lessen_10.Ex004.V4;


import org.medwed_sa.Lessen.Lesson_4_generics.lessen_10.Ex004.V4.Content.AudioContent;
import org.medwed_sa.Lessen.Lesson_4_generics.lessen_10.Ex004.V4.Content.VideoContent;
import org.medwed_sa.Lessen.Lesson_4_generics.lessen_10.Ex004.V4.Repository.Repository;

public class Program {
    public static void main(String[] args) {
        Repository<AudioContent> mGlinka = new Repository<>("mGlinka");
        mGlinka.add(new AudioContent("ПРОИЗВЕДЕНИЕ mGlinka 1"));
        mGlinka.add(new AudioContent("ПРОИЗВЕДЕНИЕ mGlinka 2"));
//        for (int index = 0; index < mGlinka.count(); index++) {
//            System.out.println(mGlinka.get(index));
//        }
        System.out.printf("%s<%s> хранит %d элемента: \n",
                mGlinka.getClass().getSimpleName(),
                mGlinka.getName(),
                mGlinka.count());
        for (AudioContent audio : mGlinka) {
            System.out.println(audio);
        }
        System.out.println("\n");




        Repository<AudioContent> pTchaikovsky = new Repository<>("pTchaikovsky");
        pTchaikovsky.add(new AudioContent("ПРОИЗВЕДЕНИЕ pTchaikovsky 1"));
        pTchaikovsky.add(new AudioContent("ПРОИЗВЕДЕНИЕ pTchaikovsky 2"));
//        for (int index = 0; index < pTchaikovsky.count(); index++) {
//            System.out.println(pTchaikovsky.get(index));
//        }
        System.out.printf("%s<%s> хранит %d элемента: \n",
                pTchaikovsky.getClass().getSimpleName(),
                pTchaikovsky.getName(),
                pTchaikovsky.count());
        for (AudioContent audio : pTchaikovsky) {
            System.out.println(audio);
        }
        System.out.println("\n");




         Repository<VideoContent> videoContent = new Repository<>("videoContent");
         videoContent.add(new VideoContent("ВИДЕО 1"));
         videoContent.add(new VideoContent("ВИДЕО 2"));
        System.out.printf("%s<%s> хранит %d элемента: \n",
                videoContent.getClass().getSimpleName(),
                videoContent.getName(),
                videoContent.count());
        for (VideoContent video : videoContent) {
            System.out.println(video);
        }
        System.out.println("\n");





//         pTchaikovsky.merge(videoContent);
        pTchaikovsky.merge(mGlinka);

//         for (int index = 0; index < pTchaikovsky.count(); index++) {
//             System.out.println(pTchaikovsky.get(index));
//         }
        System.out.printf("%s<%s> хранит %d элемента: \n",
                pTchaikovsky.getClass().getSimpleName(),
                pTchaikovsky.getName(),
                pTchaikovsky.count());
        for (AudioContent audio : pTchaikovsky) {
            System.out.println(audio);
        }



    }
}
