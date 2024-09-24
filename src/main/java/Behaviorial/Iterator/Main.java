package Behaviorial.Iterator;

interface Iterator {
    boolean hasNext();
    Object next();
}

interface Container {
    Iterator getIterator();
}

class BookCollection implements Container {
    private final String[] books = {"The Alchemist", "1984", "Moby Dick", "The Catcher in the Rye"};

    @Override
    public Iterator getIterator() {
        return new BookIterator();
    }

    private class BookIterator implements Iterator {
        int index = 0;

        @Override
        public boolean hasNext() {
            return index < books.length;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return books[index++];
            }
            return null;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        BookCollection bookCollection = new BookCollection();
        Iterator iterator = bookCollection.getIterator();

        while (iterator.hasNext()) {
            String book = (String) iterator.next();
            System.out.println("Book: " + book);
        }
    }
}
