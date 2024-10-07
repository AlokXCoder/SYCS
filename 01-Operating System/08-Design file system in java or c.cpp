#include <stdio.h>
#include <string.h>

#define SIZE 1
#define NUMELEM 5

int main(void) {
    FILE *fd = NULL;
    char buff[100];

    // Initialize buff with zeros
    memset(buff, 0, sizeof(buff));

    // Open the file in read-write mode
    fd = fopen("mark.txt", "rw+");
    if (NULL == fd) {
        printf("\n fopen () Error!!! \n");
        return 1;
    }
    printf("\n File opened successfully through fopen () \n");

    // Read from the file
    if (SIZE * NUMELEM != fread(buff, SIZE, NUMELEM, fd)) {
        printf(" In fread() failed \n");
        return 1;
    }
    printf("\n Some bytes successfully read through fread() \n");
    printf(" In The bytes read are [%s]\n", buff);

    // Move the file pointer 11 bytes forward
    if (0 != fseek(fd, 11, SEEK_CUR)) {
        printf("In fseek() failed \n");
        return 1;
    }
    printf(" In fseek() successful\n");

    // Write to the file
    if (SIZE * NUMELEM != fwrite(buff, SIZE, strlen(buff), fd)) {
        printf("\n fwrite() failed\n");
        return 1;
    }
    printf("\n fwrite() successful, data written to text file \n");

    // Close the file stream
    fclose(fd);
    printf("In File stream closed through fclose() \n");

    return 0;
}
