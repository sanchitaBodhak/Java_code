package Linked_List;

public class getIntersectionNodeLT160 {
    public node getIntersectionNode(node headA, node headB) {
        node tempA = headA;
        node tempB = headB;
        int sizeA = 0, sizeB = 0 ;
        while( tempA != null){  // counting size of A
            tempA = tempA.next;
            sizeA++;
        }
        tempA = headA;   // resetting tempA
        while( tempB != null ){ // counting size of B
            tempB = tempB.next;
            sizeB++;
        }
        tempB = headB;   // resetting tempB
        if(sizeA >= sizeB){
            for( int i = 1 ; i <= (sizeA-sizeB); i++){
                tempA = tempA.next;
            }
        }
        else{   // sizeA < sizeB
            for( int i = 1 ; i <= (sizeB - sizeA); i++){
                tempB = tempB.next;
            }
        }
        while( tempA !=  tempB ){
            tempA = tempA.next;
            tempB = tempB.next;
        }
        if(tempA == null){
            return null;
        }
        else{
            return tempA ;
        }
    }

    public static void main(String[] args) {
        System.out.println("meow");
    }
}
