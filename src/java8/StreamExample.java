package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamExample {

    public static void main(String[] args) {

        IntStream.range(1,10).
                forEach(value -> System.out.println(value));

        List<Foo> foos = IntStream.range(1,10).
                mapToObj(value -> new Foo("foo" + value)).
                collect(Collectors.toList());

        foos.stream().
                forEach(foo -> IntStream.range(1,4).
                    mapToObj(value -> new Bar("Bar"+value)).forEach(foo.getBar()::add));

        foos.stream().forEach(foo -> System.out.println(foo.getBar().size()));





    }

    static class Foo {

        private String name;
        private List<Bar> bar = new ArrayList<>();
        public Foo(String name)
        {
            this.name = name;
        }


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<Bar> getBar() {
            return bar;
        }

        public void setBar(List<Bar> bar) {
            this.bar = bar;
        }
    }

    static class Bar {

        private String name;
        public Bar(String name)
        {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
