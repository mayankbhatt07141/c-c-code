import java.util.Scanner;

// The Boyer-Moore voting algorithm is one of the popular optimal algorithms which is used to 
// find the majority element among the given elements that have more than N/ 2 occurrences.
//  This works perfectly fine for finding the majority element which takes 2 traversals over the given elements,
//   which works in O(N) time complexity and O(1) space complexity.
public class Majority_element{
    public static void main(String[] args) {
        int array[]={1,3,3,10,3,3,5};  //it has majority of 3

        // Moore algorithm
        
        // First, choose a candidate from the given set of elements if it is the same as the candidate element, increase the 
        // votes. Otherwise, decrease the votes if votes become 0, select another new element as the new candidate
        int result=0;       //result is candidate 
        int count=1;        
       
        for(int i=1;i<7;i++){               
            if(array[result]==array[i]){
                count++;
            }
            else{
                count--;
            }
            if(count==0){
                count=1;
                result=i;
            }
        }
        // When the elements are the same as the candidate element, votes are incremented 
        // when some other element is found not equal to the candidate element. We decreased the 
        // count. This actually means that we are decreasing the priority of winning ability of the selected candidate,
        //  since we know that if the candidate is a majority it occurs more than N/2 times and the remaining elements are less than N/2. 
        //  We keep decreasing the votes since we found some different element than the candidate element. When votes become 0, this actually
        //   means that there are the same number of different elements, which should not be the case for the element to be the majority element. 
        //   So the candidate element cannot be the majority, so we choose the present element as the candidate and continue the same till all the
        //    elements get finished. The final candidate would be our majority element. We check using
        //  the 2nd traversal to see whether its count is greater than N/2. If it is true, we consider it as the majority element.
        
        count=0;
        for(int i=0;i<7;i++){
            if(array[result]==array[i]){
                count++;
            }
        }
        if(count<=7/2){
            result=-1;
        }

       int output =result!=-1?(output=array[result]):(output=-1);
       System.out.println(output);
    }
}