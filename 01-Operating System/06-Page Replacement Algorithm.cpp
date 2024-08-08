#include <stdio.h>

int main() {
    int reference_string[10], page_faults = 0, m, n, s, pages, frames;

    printf("Enter Total Number of Pages: \t");
    scanf("%d", &pages);

    printf("Enter values of Reference String: \n");
    for (m = 0; m < pages; m++) {
        printf("Value No. [%d]: \t", m + 1);
        scanf("%d", &reference_string[m]);
    }

    printf("\nEnter Total Number of Frames:\t");
    scanf("%d", &frames);

    int temp[frames];
    for (m = 0; m < frames; m++) {
        temp[m] = -1;
    }

    for (m = 0; m < pages; m++) {
        s = 0;
        for (n = 0; n < frames; n++) {
            if (reference_string[m] == temp[n]) {
                s++;
            }
        }
        if (s == 0) {
            page_faults++;
            if (page_faults <= frames) {
                temp[page_faults - 1] = reference_string[m];
            } else {
                temp[(page_faults - 1) % frames] = reference_string[m];
            }
        }
    }

    printf("\nFinal Frame Values: \n");
    for (n = 0; n < frames; n++) {
        printf("%d\t", temp[n]);
    }

    printf("\nTotal Page Faults: \t%d \n", page_faults);
    return 0;
}
