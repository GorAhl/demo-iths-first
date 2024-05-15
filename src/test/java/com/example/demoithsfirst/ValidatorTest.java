package com.example.demoithsfirst;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Testar validera telefonnummer och email klassen")
public class ValidatorTest {
    Validator validator = new Validator();

    @Test
    @DisplayName("Mix max test")
    void willItFail(){
        Assertions.assertTrue(true);
    }

    @Test
    @DisplayName("Verifierar att telefonummer kan starta med 0")
    void phoneNumberStartsWithZero() {
        String phoneNumber = "012345678";
        boolean result = validator.isPhoneNumberValid(phoneNumber);
        Assertions.assertTrue(result);
    }

    @Test
    @DisplayName("Verifierar att telefonummer INTE får starta med 9")
    void phoneNumberStartsWithWrongDigit() {
        String phoneNumber = "912345678";
        boolean result = validator.isPhoneNumberValid(phoneNumber);
        Assertions.assertFalse(result);
    }

    @Test
    @DisplayName("Verifierar att inte bokstaven a är godkänt telefonummer")
    void phoneNumberWithLetter(){
        String phoneNumber = "a";
        boolean result = validator.isPhoneNumberValid(phoneNumber);
        Assertions.assertFalse(result);
    }

    @Test
    @DisplayName("Verifierar att telefonummer med elva siffror är för långt")
    void phoneNumberWithElevenDigits() {
        String phoneNumber = "01234567890";
        boolean result = validator.isPhoneNumberValid(phoneNumber);
        Assertions.assertFalse(result);
    }

    @Test
    @DisplayName("Verifierar att telefonummer med fem siffror är för kort")
    void phoneNumberWithFiveDigits() {
        String phoneNumber = "01234";
        boolean result = validator.isPhoneNumberValid(phoneNumber);
        Assertions.assertFalse(result);
    }

    @Test
    @DisplayName("Verifierar att email adress måste ha @ symbolen")
    void emailWithoutAtSymbol() {
        String email = "abc.def.hotmail.se";
        boolean result = validator.isEmailValid(email);
        Assertions.assertFalse(result);
    }

    @Test
    @DisplayName("Verifierar att email inte får vara en tom sträng")
    void emptyEmail() {
        String email = "";
        boolean result = validator.isEmailValid(email);
        Assertions.assertFalse(result);
    }



}
