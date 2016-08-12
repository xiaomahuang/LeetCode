/**
 * Created by majun on 16/8/9.
 */
public class ComputeArea {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int width = 0;
        int height = 0;
        if (A >= G || C <= E || B >= H || D <= F) {
            width = 0;
            height = 0;
        } else {
            if (E < A && G > C) {
                width = C - A;
            } else if (C > G && E > A) {
                width = G - E;
            } else {
                width = (C - E) > (G - A) ? (G - A) : (C - E);
            }
            if (B > F && H > D) {
                height = D - B;
            } else if (D > H && F > B) {
                height = H - F;
            } else {
                height = (D - F) > (H - B) ? (H - B) : (D - F);
            }
        }

        int total = (D - B) * (C - A) + (H - F) * (G - E);
        return total - height * width;
    }
}
