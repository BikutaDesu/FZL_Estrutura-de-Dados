#include <math.h>

int testarDivisibilidade(int dividendo, int divisor);

int divisibilidade2(int num);

int divisibilidade3(int num);

int divisibilidade4(int num);

int divisibilidade5(int num);

int divisibilidade6(int num);

int divisibilidade7(int num);

int divisibilidade8(int num);

int divisibilidade9(int num);

int divisibilidade10(int num);

int divisibilidade11(int num);

int divisibilidade12(int num);

int divisibilidade15(int num);

int divisibilidade25(int num);

int somatoriaAlgarismos(int num);

int somatoriaOrdem(int num);

int testarDivisibilidade(int dividendo, int divisor) {
    int rtr = 0;
    switch (divisor) {
        case 2:
            rtr = divisibilidade2(dividendo);
            break;
        case 3:
            rtr = divisibilidade3(dividendo);
            break;
        case 4:
            rtr = divisibilidade4(dividendo);
            break;
        case 5:
            rtr = divisibilidade5(dividendo);
            break;
        case 6:
            rtr = divisibilidade6(dividendo);
            break;
        case 7:
            rtr = divisibilidade7(dividendo);
            break;
        case 8:
            rtr = divisibilidade8(dividendo);
            break;
        case 9:
            rtr = divisibilidade9(dividendo);
            break;
        case 10:
            rtr = divisibilidade10(dividendo);
            break;
        case 11:
            rtr = divisibilidade11(dividendo);
            break;
        case 12:
            rtr = divisibilidade12(dividendo);
            break;
        case 15:
            rtr = divisibilidade15(dividendo);
            break;
        case 25:
            rtr = divisibilidade25(dividendo);
            break;
    }
    return rtr;
}

int divisibilidade2(int num) {
    int rtr;
    int novoNum = num % 10;
    if (novoNum == 0 || novoNum == 2 || novoNum == 4 || novoNum == 6 || novoNum == 8)
        rtr = 1;
    else
        rtr = 0;
    return rtr;
}

int divisibilidade3(int num) {
    int rtr = 0;
    int soma;
    int novoNum = num;
    do {
        soma = somatoriaAlgarismos(novoNum);
        novoNum = soma;
    } while (novoNum > 10);
    if (soma == 3 || soma == 6 || soma == 9) rtr = 1;
    return rtr;
}

int divisibilidade4(int num) {
    int rtr = 0;
    if (divisibilidade2(num) == 1) {
        num = num / 2;
        if (divisibilidade2(num) == 1) rtr = 1;
    }
    return rtr;
}

int divisibilidade5(int num) {
    int rtr = 0;
    int ultimoAlgarismo;
    ultimoAlgarismo = num % 10;
    if (ultimoAlgarismo == 0 || ultimoAlgarismo == 5) rtr = 1;
    return rtr;
}

int divisibilidade6(int num) {
    int rtr = 0;
    if (divisibilidade2(num) == 1 && divisibilidade3(num) == 1) rtr = 1;
    return rtr;
}

int divisibilidade7(int num) {
    int rtr = 0;
    int novoNum = num;
    int r = 0;
    int ultimoAlgarismo;
    do {
        ultimoAlgarismo = novoNum % 10;
        ultimoAlgarismo = ultimoAlgarismo * 2;
        novoNum = novoNum / 10;
        r = novoNum - ultimoAlgarismo;
        novoNum = r;
    } while (r > 70);
    r = abs(r);
    if (r == 0 || r == 7 || r == 14 || r == 21 || r == 28 || r == 35 || r == 42 || r == 49 || r == 54 || r == 63 ||
        r == 70)
        rtr = 1;
    return rtr;
}

int divisibilidade8(int num) {
    int rtr = 0;
    if (divisibilidade2(num) == 1) {
        num = num / 2;
        if (divisibilidade2(num) == 1) {
            num = num / 2;
            if (divisibilidade2(num) == 1) rtr = 1;
        }
    }
    return rtr;
}

int divisibilidade9(int num) {
    int rtr = 0;
    if (divisibilidade3(num) == 1) {
        num = num / 2;
        if (divisibilidade3(num) == 1) rtr = 1;
    }
    return rtr;
}

int divisibilidade10(int num) {
    int rtr = 0;
    int ultimoAlgarismo;
    ultimoAlgarismo = num % 10;
    if (ultimoAlgarismo == 0) rtr = 1;
    return rtr;
}

int divisibilidade11(int num) {
    int rtr = 0;
    int novoNum = num;
    do {
        novoNum = somatoriaOrdem(novoNum);
    } while (novoNum > 9);
    if (novoNum == 0) rtr = 1;
    return rtr;
}

int divisibilidade12(int num) {
    int rtr = 0;
    if (divisibilidade3(num) == 1 && divisibilidade4(num) == 1) rtr = 1;
    return rtr;
}

int divisibilidade15(int num) {
    int rtr = 0;
    if (divisibilidade3(num) == 1 && divisibilidade5(num) == 1) rtr = 1;
    return rtr;
}

int divisibilidade25(int num) {
    int rtr = 0;
    if (num >= 25) {
        int ultimoAlgarismo = num % 10;
        num = num / 10;
        int penultimoAlgarismo = num % 10;
        int r = penultimoAlgarismo * 10 + ultimoAlgarismo;
        if (r == 0 || r == 25 || r == 50 || r == 75) rtr = 1;
    }
    return rtr;
}

int somatoriaAlgarismos(int num) {
    int soma = 0;
    do {
        soma = soma + (num % 10);
        num = num / 10;
    } while (num > 0);
    return soma;
}

int somatoriaOrdem(int num) {
    int ordem = 0;
    int novoNum = num;
    int ultimoAlgarismo;
    int somaI = 0;
    int somaP = 0;
    int r;

    do {
        ordem++;
        ultimoAlgarismo = novoNum % 10;
        if (ordem % 2 == 0) somaP = somaP + ultimoAlgarismo;
        else somaI = somaI + ultimoAlgarismo;
        novoNum = novoNum / 10;
    } while (novoNum > 0);
    r = somaI - somaP;
    r = abs(r);
    return r;
}