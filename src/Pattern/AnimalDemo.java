package Pattern;

public class AnimalDemo {
    public static void main(String[] args) {
        //具体类调用
        Dog d = new Dog();
        d.eat();

        Cat c = new Cat();
        c.eat();
        System.out.println("----------");

        //有工厂之后，工厂制造
//        Dog dd = AnimalFactory.createDog();
//        Cat cc = AnimalFactory.createCat();
//        System.out.println("----------");

        //工厂改进之后
        Animal a = AnimalFactory.createAnimal("dog");
        a.eat();

        a = AnimalFactory.createAnimal("cat");
        a.eat();


        a = AnimalFactory.createAnimal("pig");
        if(a != null){
            a.eat();
        }else{
            System.out.println("对不起，没有这个东西");
        }
    }
}
