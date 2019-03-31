package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ForEachExample {

    public static void main(String[] args) {

        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);

        intList.forEach(new Consumer<Integer>() {

            @Override
            public void accept(Integer integer) {

                System.out.println("Anonymous consumer " + integer);
                System.out.println("ObjectId " + this);

            }
        });

        ListConsumer myConsumer = new ListConsumer();
        intList.forEach(myConsumer);




    }

    public static class ListConsumer implements Consumer<Integer>{


        @Override
        public void accept(Integer integer) {

            System.out.println("State consumer " + integer);
            System.out.println("ObjectId " + this);

        }
    }
}
