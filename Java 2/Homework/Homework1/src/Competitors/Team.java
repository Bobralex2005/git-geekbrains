package Competitors;

import java.util.Arrays;

/**
 * Created by HP on 04.07.2017.
 */
/*Добавить класс Команда, который будет содержать: название команды, массив из 4-х
участников (т.е. в конструкторе можно сразу указывать всех участников)*/
public class Team {
    public String teamName;
    public Animal[] animals;

    public Team(String teamName, Animal[] animals) {
        this.teamName = teamName;
        this.animals = new Animal[animals.length];
        this.animals = animals;
    }

    //метод для вывода информации о членах команды прошедших дистанцию
    public void ifPassInfo(){
        System.out.println("Following animals passed the distance");
        for (Animal a : animals) {
            if (a.onDistance){
                a.info();
            }
        }
    }

    //метод вывода информации обо всех членах команды.
    public void teamInfo(){
        System.out.println("Team: " + teamName + " " + Arrays.toString(animals));
    }
}
