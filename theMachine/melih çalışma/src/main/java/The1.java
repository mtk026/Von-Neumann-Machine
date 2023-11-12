public class The1 {
    static int R1 = 0;
    static int R2 = 0;
    static int I = 0;
    static int[] sequence = {9, 6, 12, 27, 39, 99, 3, 2, 4, 3, 11, 4, 4, 16, 10, 20, 2, 1, 9, 22, 2, 0, 1, 5, 7, 0};
    public static void main(String[] args){
        for(int i = 0; i < sequence.length; i++){
            theMachine();
        }
        for(int num : sequence) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void theMachine(){

        switch(sequence[I]){
            case 0:
                return;
            case 1:
                R1 = sequence[I + 1];
                I += 2;
                break;
            case 2:
                R2 = sequence[I + 1];
                I += 2;
                break;
            case 3:
                R1 = sequence[sequence[I + 1]];
                I += 2;
                break;
            case 4:
                R2 = sequence[sequence[I + 1]];
                I += 2;
                break;
            case 5:
                R1 = R2;
                I++;
                break;
            case 6:
                R1 = sequence[R2];
                I++;
                break;
            case 7:
                sequence[R1] = R2;
                I++;
                break;
            case 8:
                sequence[sequence[I + 1]] = R1;
                I += 2;
                break;
            case 9:
                I = sequence[I + 1];
                break;
            case 10:
                if (R1 == 0)
                    I += 2;
                else
                    I = sequence[I + 1];
                break;
            case 11:
                R1 = R1 + R2;
                I++;
                break;
            case 12:
                R1 = R1 - R2;
                I++;
                break;
            case 13:
                R1 = R1 * R2;
                I++;
                break;
            case 14:
                R1 = R1 / R2;
                I++;
                break;
            case 15:
                R1 = -R1;
                I++;
                break;
            case 16:
                if(R1 == R2){
                    R1 = 0;
                }
                else if(R1 > R2){
                    R1 = 1;
                }
                else{
                    R1 = -1;
                }
                I++;
                break;
            default:
                return;
        }
    }
}
