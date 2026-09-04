//Solution as follows
#include <stdio.h>
#include <string.h>

int main() {
    int t;
    scanf("%d", &t);
    while (t--) {
        char S[100], A[100], B[100];
        scanf("%s", S);

        // loop through every character of S and add to A
        for (int i = 0; i < strlen(S); i++) {
            A[i] = S[i];
        }
        A[strlen(S)] = '\0';

        // loop through every character of S and add to B
        for (int i = strlen(S) - 1, j = 0; i >= 0; i--, j++) {
            B[j] = S[i];
        }
        B[strlen(S)] = '\0';

        // print A and B
        for (int i = 0; i < strlen(A); i++) {
            printf("%c", A[i]);
        }
        printf("\n");
        for (int i = 0; i < strlen(B); i++) {
            printf("%c", B[i]);
        }
        printf("\n");
    }
    return 0;
}
