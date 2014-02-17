package book.nestedclasses;

import java.util.Iterator;

public class Building implements Iterable<Human> {
    public static final int BUILDING_COMMUNITY_SIZE = 10;

    Human[] humans = new Human[BUILDING_COMMUNITY_SIZE];
    int size = 0;

    public void addHumanToBuilding(Human human) {
        humans[size++] = human;
    }

    public Human getHuman(int index) {
        return humans[index];
    }

    public int getSize() {
        return size;
    }

    @Override
    public Iterator<Human> iterator() {
        return new HumanIterator();
    }

    private class HumanIterator implements Iterator {

        int counter = 0;

        @Override
        public boolean hasNext() {
            return counter < size;
        }

        @Override
        public Object next() {
            return humans[counter++];
        }

        @Override
        public void remove() {
        }
    }
}
