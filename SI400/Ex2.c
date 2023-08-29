#include <stdio.h>

int main() {
    int i, F[3], area_total, area_ocupada, area, comprimento, altura, comprimento_ocupado;
    //Inicialização das variáveis:
    comprimento = 200;
    altura = 600
    //posições finais F
    for (i = 0; i < 3; i++) {
        scanf("%d", &F[i]);
        area_ocupada += F[i] - comprimento; 
    }
    
    //Calcula a area aberta:
    area_total = 3 * comprimento * altura;

    area = area_total - area_ocupada;
}