import java.util.*;
public class activityselection{
    public static void main(String[] args){
        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};
        //its already sorted based on end time
        int maxAct=0;
        ArrayList<Integer> ans=new ArrayList<>();
        //1st activity->always gets finished fast coz its sorted based on end time
        maxAct=1;
        ans.add(0);
        //for remaining elements
        int lastEnd=end[0];//end time of the 1st activity
        for(int i=1;i<end.length;i++){
            if(start[i]>=lastEnd){
                //select activity
                maxAct++;
                ans.add(i);
                lastEnd=end[i];//update last end
            }
        }
        System.out.println("Maximum activity:"+maxAct);
        for(int i=0;i<ans.size();i++){
            System.out.print("A"+ans.get(i)+" ");
        }

        //sorting

        //incase end time is not sorted
    //     int activities[][] = new int[start.length][3];
    //     for(int i=0;i<start.length;i++){
    //         activities[i][0]=i;
    //         activities[i][1]=start[i];
    //         activities[i][2]=end[i];
    //     }
    //     //lambda function for sorting 2d array
    //     Arrays.sort(activities,Comparator.comparingDouble(o->o[2]));
    //     int maxAct1=0;
    //     ArrayList<Integer> ans1=new ArrayList<>();
    //     maxAct1=1;
    //     ans1.add(activities[0][0]);
    //     //for remaining elements
    //     int lastEnd1=activities[0][2];//end time of the 1st activity
    //     for(int i=1;i<end.length;i++){
    //         if(activities[i][1]>=lastEnd1){
    //             //select activity
    //             maxAct1++;
    //             ans1.add(activities[i][0]);
    //             lastEnd1=activities[i][2];//update last end
    //         }
    //     }
    //     System.out.println("\nMaximum activity:"+maxAct1);
    //     for(int i=0;i<ans1.size();i++){
    //         System.out.print("A"+ans1.get(i)+" ");
    //     }
    }
}