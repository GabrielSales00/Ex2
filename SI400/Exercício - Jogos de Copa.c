/*Gabriel Sales da Silva Matos de Araujo
Faculdade de Tecnologia da Unicamp

Exercício estraído da Maratona de Programação da SBC 2006, Fase Local

/*Enunciado: Uma Copa do Mundo de futebol de botões está sendo realizada com times de todo o mundo. 
A classificação é baseada no número de pontos ganhos pelos times, e a distribuição de pontos é feita da 
forma usual. Ou seja, quando um time ganha um jogo, ele recebe 3 pontos e o perdedor não recebe nenhum ponto; 
se o jogo termina empatado, ambos os times recebem 1 ponto. 

Entrada: A primeira linha da entrada contém dois inteiros T e N, indicando respectivamente o número 
de times participantes e o número de partidas jogadas. Cada uma das T linhas seguintes contém o nome de um time 
(uma cadeia de máximo 10 letras e dígitos, iniciando com uma letra), seguido de um espaço em branco, seguido do 
número de pontos P que o time obteve até o momento. 

Saída: Seu programa deve imprimir uma única linha, contendo um único inteiro, a quantidade de jogos que terminaram empatados até o momento. 

Exemplo de entrada:
3 3
Brasil 3
Croacia 3
Australia 3

Saída esperada:
0*/

#include <stdio.h>
#include <stdlib.h>

int main() {

    struct pais {
        char nome[10];
        int pontos;
    };
    struct pais *nat;
    int partidas, países, i, vit = 0, emp;

    scanf("%d %d", &partidas, &países);
    nat = malloc(sizeof(struct pais)*países);
    for (i = 0; i < países; i++) {
        scanf("%s %d", nat[i].nome, &nat[i].pontos);
        vit += nat[i].pontos;
    }
    
    emp = vit % 3;

    printf("%d\n", emp);

    return 0;
}
   