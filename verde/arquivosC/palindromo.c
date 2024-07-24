/*Crie um método iterativo que recebe uma string como parâmetro e retorna true se essa é um palíndromo.
Na saída padrão, para cada linha de entrada, escreva uma linha de saída com SIM/NAO indicando se a linha é um palíndromo.
Destaca-se que uma linha de entrada pode ter caracteres não letras
A entrada termina com a leitura de FIM*/

#include <stdio.h>
#include <stdbool.h>
#include <string.h>

bool palindromo(char p[100])
{
    int tam = strlen(p);
    for (int i = 0; i < tam / 2; i++)
    {

        if (p[0] != p[tam - i - 1])
        {
            i = tam / 2;
            return false;
        }
    }
    return true;
}

int main()
{

    char p[100];

    while (1)
    {

        scanf("%s", p);

        if (strcmp(p, "FIM") == 0)
        {
            break;
        }

        if (palindromo(p))
        {
            printf("SIM\n");
        }
        else
        {
            printf("NAO\n");
        }
    }

    return 0;
}
