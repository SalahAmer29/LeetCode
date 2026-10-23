import java.util.*;
import java.util.function.*;
import java.util.stream.*;


public class javalambda{
    public static void main (String[] args){
      //1  
      Runnable r = () -> System.out.println("Hello Lambda");
      r.run();
      // 2
      Function<Integer,Integer> doubler = x ->x*2;
      System.out.println(doubler.apply(10));
      // 3  
      Predicate<String> isEmpty = (s) -> s.isEmpty();
      System.out.println(isEmpty.test(""));
      System.out.println(isEmpty.negate().test(""));
      // 4
        BiFunction<Integer, Integer, Integer> largest = (a,b) -> a>b ? a:b ;
        System.out.println(largest.apply(1000, 500));
     // 5
     Supplier<Double> random = () -> Math.random();
     System.out.println(random.get());
     Consumer<String> upper = s -> System.out.println(s.toUpperCase());
     upper.accept("salah amer");
     // 6
      Calculator add = (a,b)-> a+b;  
      Calculator subtract = (a,b)-> a-b;
      Calculator multiply =(a,b)->a*b;
      Calculator divide =(a,b)->{if(b==0) {
        b+=1;
        System.out.println("Cant divide by zero");
      }return a/b;
    };
        System.out.println(add.calc(10, 5));       
        System.out.println(subtract.calc(10, 5)); 
        System.out.println(multiply.calc(10, 5)); 
        System.out.println(divide.calc(10, 5));
        System.out.println("Number 7:");
        // 7
    List<Integer> lst = List.of(1,2,3,4,5,6,7,8,9);
    lst.stream()
        .filter(n->n%2==0)
        .forEach(n -> System.out.println(n));
        System.out.println("Number 8:");
        // 8
        List<String> words = new ArrayList<>(List.of("banana", "kiwi", "apple", "fig"));
        words.sort((a,b)->a.length()-b.length());
        System.out.println(words);
        // 9 
        List<String> names = List.of("Salah", "Omar", "Li", "Ahmad", "Sam");
        List<String> result = names.stream().filter(n->n.length()>3)
        .map(n->n.toUpperCase()).collect(Collectors.toList());
        System.out.println(result);
        // 10
        List<Student> students = List.of(
          new Student("Salah",87),
          new Student("Lina", 85),
          new Student("Omar", 55),
          new Student("Ahmad", 72),
          new Student("Sara", 91)
        );
        students.stream().filter(s->s.getGrade()>60).sorted((s1,s2)->s2.getGrade()-s1.getGrade()).map(s->s.getName()).forEach(s->System.out.println(s));
    }
    

  interface Calculator{
    int calc (int a ,int b);
  }
  static class Student{
    String name;
    int grade;

    Student(String name,int grade){
    this.name=name;
    this.grade=grade;
  }
  String getName(){return name;}
  int getGrade(){return grade;}
  }
      
}