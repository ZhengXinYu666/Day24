package Pattern2;

public class DogFactory implements Factory {
    public Animal createAnimal(){
        return new Dog();
    }
}
