package org.example.validations;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonValidationTest {
    // Preparo la prueba

    PersonValidation personValidation;

    @BeforeEach
    public void initialTesting(){
        System.out.println("lskskskdjflflk");
        this.personValidation=new PersonValidation();
    }

    @Test
    public void nameValidationForLenght() {
        String nombre="juanasdll2l";
        Exception respuesta=Assertions.assertThrows(Exception.class, ()-> this.personValidation.namevalidation(nombre));
        System.out.println(respuesta.getMessage());
        Assertions.assertEquals("The name muust not contain numbers",respuesta.getMessage());
    }
    @Test
    public void nameValidationForSpecialChars() {
        String nombre="juanas";
        Exception respuesta=Assertions.assertThrows(Exception.class, ()-> this.personValidation.namevalidation(nombre));
        System.out.println(respuesta.getMessage());
        Assertions.assertEquals("the name must contain at least 10 characters",respuesta.getMessage());
    }
    @Test
    public void nameValidation(){
        String nombre="Alejandrova";
        Boolean respuesta=Assertions.assertDoesNotThrow(()-> this.personValidation.namevalidation(nombre));
        System.out.println(respuesta);
        Assertions.assertTrue(respuesta);
    }
    @Test
    public void ubicationValidationForLocation() {
        Integer location=2;
        Boolean respuesta=Assertions.assertDoesNotThrow(()-> this.personValidation.ubicationvalidation(location));
        System.out.println(respuesta);
        Assertions.assertTrue(respuesta);
    }

    @Test
    public void ubicationValidation() {
        Integer location=5;
        Exception respuesta=Assertions.assertThrows(Exception.class, ()-> this.personValidation.ubicationvalidation(location));
        System.out.println(respuesta.getMessage());
        Assertions.assertEquals("Invalid ubication",respuesta.getMessage());
    }

    @Test
    public void emailValidationForCharacters() {
        String email="alejandor";
        Exception respuesta=Assertions.assertThrows(Exception.class, ()-> this.personValidation.emailvalidation(email));
        System.out.println(respuesta.getMessage());
        Assertions.assertEquals("Email invalid",respuesta.getMessage());
    }
    @Test
    public void emailvalidation() {
        String email="Alejandrova@hsasd.com";
        Boolean respuesta=Assertions.assertDoesNotThrow(()-> this.personValidation.emailvalidation(email));
        System.out.println(respuesta);
        Assertions.assertTrue(respuesta);
    }
}