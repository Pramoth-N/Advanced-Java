/*
 * 
 * Given the locations and heights of buildings as buildings[i] = [lefti, righti, heighti], compute and return the skyline formed by these buildings. The skyline should be represented as key points sorted by x-coordinate in the form [[x1, y1], [x2, y2], ...], with the last point having y-coordinate 0 marking the skyline's end.

A skyline is formed by the outer contour of the union of buildings when viewed from a distance. Each building is represented by three integers: lefti, the x-coordinate of the left edge; righti, the x-coordinate of the right edge; and heighti, the height of the building. The buildings are rectilinear, meaning they are aligned along the x and y axes.

Input Format:
The first line contains an integer n, the number of buildings.
The next n lines each contain three integers: lefti, righti, and heighti, representing the left x-coordinate, right x-coordinate, and height of each building.
Output Format:
Print each key point x, y of the skyline on a new line.
If the input is negative or invalid, print "Invalid input".
Constraints:
1 ≤ n ≤ 10000
1 ≤ lefti < righti ≤ 10^9
1 ≤ heighti ≤ 10^9

INPUT
5
1 3 4
2 4 5
4 6 3
7 9 5
7 9 4

OUTPUT
1 4
2 5
4 5
6 0
7 5
9 0

 * 
 */


 import java.util.*;

 public class Skyline {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         
         int n = sc.nextInt();
         if (n <= 0) {
             System.out.println("Invalid input");
             return;
         }
         
         int[][] buildings = new int[n][3];
         for (int i = 0; i < n; i++) {
             for(int j=0;j<3;j++){
                 // buildings[i][j] = sc.nextInt();
                 if((buildings[i][j] = sc.nextInt()) < 0){
                     System.out.println("Invalid input");
                     return ;
                 }
             }
         }
         
         List<int[]> skyline = getSkyline(buildings);
         
         for (int[] point : skyline) {
             System.out.println(point[0] + " " + point[1]);
         }
     }
     
     public static List<int[]> getSkyline(int[][] buildings) {
         List<int[]> result = new ArrayList<>();
         List<int[]> height = new ArrayList<>();
         
         for (int[] b : buildings) {
             height.add(new int[] {b[0], -b[2]});
             height.add(new int[] {b[1], b[2]});
         }
         
         Collections.sort(height, (a, b) -> {
             if (a[0] != b[0]) {
                 return a[0] - b[0];
             }
             return a[1] - b[1];
         });
         
         PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
         pq.offer(0);
         
         int prevHeight = 0;
         
         for (int[] h : height) {
             if (h[1] < 0) {
                 pq.offer(-h[1]);
             } else {
                 pq.remove(h[1]);
             }
             
             int currHeight = pq.peek();
             if (currHeight != prevHeight) {
                 result.add(new int[] {h[0], currHeight});
                 prevHeight = currHeight;
             }
         }
         
         return result;
     }
 }
 