/************************************************/
/* Aluno: Victor da Silva Neves RA: 99999-99    */
/* UC: Estrutura de Dados                       */
/* Prof. Eliane                                 */
/************************************************/

#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include "tesdiv.h"

void imprimirObjetivoLab();

int informarDividendo();

int informarDivisor();

int main() {
    char resp;
    imprimirObjetivoLab();
    do {
        int dividendo = informarDividendo();
        int divisor = informarDivisor();
        int divisivel = testarDivisibilidade(dividendo, divisor);
        if (divisivel == 0)
            printf("%d nao eh divisivel por %d.\n\n", dividendo, divisor);
        else
            printf("%d eh divisivel por %d.\n\n", dividendo, divisor);
        printf("Deseja realizar novo teste (s/n)? ");
        resp = getche();
        printf("\n");
        if ((resp != 's' && resp != 'S') && (resp != 'n' && resp != 'N'))
            printf("Opcao Invalida! ");
    } while (resp != 'n' && resp != 'N');
    return 0;
}

void imprimirObjetivoLab() {
    printf("Programa TESTE DE DIVISIBILIDADE\n\n");
    printf("O programa tem por objetivo informar se um determinado numero eh ou nao divisivel por outro.\n\n");
    printf("Teste valido para os seguintes divisores: 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 15 e 25.\n\n");
}

int informarDividendo() {
    int rtr = 0;
    printf("Dividendo:");
    scanf("%d", &rtr);
    return rtr;
}

int informarDivisor() {
    int rtr = 0;
    do {
        printf("Divisor:");
        scanf("%d", &rtr);
        if ((rtr < 2 || rtr > 12) && rtr != 15 && rtr != 25) {
            printf("Divisor invalido! Favor informar outro valor.\n");
        }
    } while ((rtr < 2 || rtr > 12) && rtr != 15 && rtr != 25);
    return rtr;
}