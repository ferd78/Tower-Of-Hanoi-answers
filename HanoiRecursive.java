public class HanoiRecursive {
    static void HanoiStack(int N, char FromRod, char ToRod, char AuxiliaryRod) {
        if (N == 1) {
            System.out.println("Take disk 1 from Tower " + FromRod + " to Tower " + ToRod);
            return;
        }
        HanoiStack(N - 1, FromRod, AuxiliaryRod, ToRod);
        System.out.println("Take disk " + N + " from Tower " + FromRod + " to Tower " + ToRod);
        HanoiStack(N - 1, AuxiliaryRod, ToRod, FromRod);
    }
}
