
import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class CollectorFromJana implements Collector<BankAccountWithOwner, Map<Person, List<String>>, List<PersonWithBankAccounts>> {

    @Override
    public Supplier<Map<Person, List<String>>> supplier() {

        return TreeMap::new;
    }

    @Override
    public BiConsumer<Map<Person, List<String>>, BankAccountWithOwner> accumulator() {
        return (map, o)-> {
            List<String> l = new LinkedList<>();
            l.add(o.getIban());
            map.put(o.getOwners(), l);
        };
    }

    @Override
    public BinaryOperator<Map<Person, List<String>>> combiner() {
        return (map01, map10) -> {
            for(Person p: map10.keySet()) {
                List<String> list01 = map01.getOrDefault(p, new LinkedList<>());
                List<String> list10 = map10.getOrDefault(p, new LinkedList<>());
                list01.addAll(list10);
                map01.put(p,list01);
            }
            return map01;
            };
    }

    @Override
    public Function<Map<Person, List<String>>, List<PersonWithBankAccounts>> finisher() {
        return null;
    }

    @Override
    public Set<Characteristics> characteristics() {
        return null;
    }
}

