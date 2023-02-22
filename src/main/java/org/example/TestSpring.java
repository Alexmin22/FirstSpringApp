package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        MusicPlayer mp = context.getBean("musicPlayer", MusicPlayer.class);

        mp.playMusic();
        System.out.println("mp.getName() = " + mp.getName());
        System.out.println(mp.getVolume());

        Cat cat = context.getBean("cat", Cat.class);
        Cat cat2 = context.getBean("cat", Cat.class);

        boolean b = cat == cat2;
        System.out.println("cat==cat2 = " + b);

        Dog dog = context.getBean("dog", Dog.class);
        Dog dog2 = context.getBean("dog", Dog.class);

        boolean b2 = dog == dog2;
        System.out.println("dog==dog2 = " + b2);

        context.close();
    }
}
