import java.util.Comparator;
import java.util.PriorityQueue;
public class pq{
    public static class Student implements Comparable<Student> {
         String name;
         int rank;

        public Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2) {
            return this.rank - s2.rank; // Compare by rank
        }
    }
    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>();
        // PriorityQueue<Student> pq2 = new PriorityQueue<>(Comparator.reverseOrder()); for descending order
        pq.add(new Student("A", 3));
        pq.add(new Student("B", 5));
        pq.add(new Student("C", 2));
        pq.add(new Student("D", 6));
        while(!pq.isEmpty()) {
            System.out.println(pq.peek().name + "->" + pq.peek().rank);
            pq.remove();
        }
    }
}