package VirtualPet;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**  
* Patrick Foy - pjfoy  
* CIS171 - 20390
* Mar 9, 2025  
*/
class VirtualPetTest {

    @Test
    public void testFeedPet() {
        VirtualPet pet = new VirtualPet("TestPet", "Dog", 50.0);
        pet.feedPet();
        assertTrue(pet.getWeight() > 50.0);
    }

    @Test
    public void testPlayWithPet() {
        VirtualPet pet = new VirtualPet("TestPet", "Cat", 40.0);
        pet.playWithPet();
        assertTrue(pet.getWeight() < 40.0);
    }

    @Test
    public void testCleanPet() {
        VirtualPet pet = new VirtualPet("TestPet", "Rabbit", 30.0);
        pet.cleanPet();
        assertFalse(pet.isSick());
        assertFalse(pet.isExhausted());
    }

    @Test
    public void testUseBathroom() {
        VirtualPet pet = new VirtualPet("TestPet", "Hamster", 20.0);
        pet.useBathroom();
        assertEquals(1, pet.getBathroomLevel());
    }

    @Test
    public void testSleepPet() {
        VirtualPet pet = new VirtualPet("TestPet", "Bird", 10.0);
        pet.feedPet();
        pet.playWithPet();
        pet.sleepPet();
        assertTrue(pet.isSleeping());
        assertFalse(pet.isExhausted());
        assertFalse(pet.isSick());
    }
    
    @Test
    public void testSickPet() {
        VirtualPet pet = new VirtualPet("TestPet", "Cat", 12.0);
        pet.feedPet();
        pet.feedPet();
        pet.feedPet();
        assertTrue(pet.isSick());
    }
    
    @Test
    public void testExhaustPet() {
        VirtualPet pet = new VirtualPet("TestPet", "Dog", 10.0);
        pet.playWithPet();
        pet.playWithPet();
        pet.playWithPet();
        assertTrue(pet.isExhausted());
    }
}
