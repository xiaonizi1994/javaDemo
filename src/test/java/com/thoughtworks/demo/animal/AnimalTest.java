package com.thoughtworks.demo.animal;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnimalTest {

    private final ByteArrayOutputStream outContent=new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    @BeforeEach
    void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @AfterEach
    void clearUpStreams(){
        System.setOut(null);
        System.setErr(null);
    }

    @Test
    void should_println_wolf_eat() {
        Wolf wolf=new Wolf();
        wolf.eat();
        assertEquals("wolf eat\n", outContent.toString());
    }

    @Test
    void should_println_canine_roam() {
        Animal wolf=new Wolf();
        wolf.roam();
        assertEquals("canine roam\n", outContent.toString());
    }


    @Test
    void should_println_animal_sleep() {
        Wolf wolf=new Wolf();
        wolf.sleep();
        assertEquals("sleep\n", outContent.toString());
    }

    @Test
    void should_println_wolf_make_noise() {
        Wolf wolf=new Wolf();
        PetOwner petOwner=new PetOwner();
        petOwner.giveShot(wolf);
        assertEquals("ao\n",outContent.toString());
    }

    @Test
    void should_println_animal_make_noise() {
        Animal animal=new Animal();
        PetOwner petOwner=new PetOwner();
        petOwner.giveShot(animal);
        assertEquals("noise\n",outContent.toString());
    }

    @Test
    void should_call_wolf_method_while_type_change() {
        Animal animal=new Wolf();
        ((Wolf) animal).bite();
        assertEquals("bite\n",outContent.toString());
    }

    @Test
    void should_call_pet_method_while_the_param_is_pet() {
        PetOwner petOwner=new PetOwner();
        Cat cat=new Cat();
        petOwner.giveTouch(cat);
        assertEquals("miao\n",outContent.toString());
    }

    @Test
    void name() {
        Cat cat=new Cat();
    }
}
