package LR_8;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList <User> myList = new ArrayList<User>();
        myList.add(1, new User());

        myList.add(2,new Student());

        List<Student> myNewList = new List<Student>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Student> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] ts) {
                return null;
            }

            @Override
            public boolean add(Student student) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> collection) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Student> collection) {
                return false;
            }

            @Override
            public boolean addAll(int i, Collection<? extends Student> collection) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> collection) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> collection) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public boolean equals(Object o) {
                return false;
            }

            @Override
            public int hashCode() {
                return 0;
            }

            @Override
            public Student get(int i) {
                return null;
            }

            @Override
            public Student set(int i, Student student) {
                return null;
            }

            @Override
            public void add(int i, Student student) {

            }

            @Override
            public Student remove(int i) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<Student> listIterator() {
                return null;
            }

            @Override
            public ListIterator<Student> listIterator(int i) {
                return null;
            }

            @Override
            public List<Student> subList(int i, int i1) {
                return null;
            }
        };

    }
}
