# 10.11-formas-e-polimorfismo
Estudo de caso de GUIs e imagens gráficas: desenhando com polimorfismo Você deve ter observado no programa de desenho criado no estudo de caso de GUIs e imagens gráficas no Exercício 8.1 (e modificado no estudo de caso de GUIs e imagens gráficas no Exercício 9.1) que as classes shape têm muitas semelhanças. Com a herança, podemos “dividir” os recursos comuns de todas as três classes e colocá-los em uma única superclasse de forma. Então, utilizando variáveis do tipo de superclasse, podemos manipular objetos shape polimorficamente. Remover o código redundante resultará em um programa menor, mais flexível e mais fácil de manter.

Modifique as classes MyLine, MyOval e MyRectangle do estudo de caso de GUIs e elementos gráficos no Exercício 8.1 e Exercício 9.1
para criar a hierarquia de classes na Figura 10.17. Classes da hierarquia MyShape devem ser classes de formas “inteligentes” que sabem
como desenhar-se (se for fornecida com um objeto Graphics que informa onde desenhar). Depois que o programa cria um objeto a partir
dessa hierarquia, ele pode manipulá-lo polimorficamente para o restante do seu tempo de vida como um MyShape.
Na sua solução, classe MyShape na Figura 10.17 deve ser abstract. Como MyShape representa qualquer forma em geral, você não
pode implementar um método desenhar sem saber especificamente qual é a forma. Os dados que representam as coordenadas e a cor das
formas na hierarquia devem ser declarados como membros private da classe MyShape. Além dos dados comuns, a classe MyShape deve
declarar os métodos a seguir:
a) Um construtor sem argumento que configura todas as coordenadas da forma como 0 e a cor como Cor.PRETO.
b) Um construtor que inicializa as coordenadas e cores com os valores dos argumentos fornecidos.
c) Métodos set para as coordenadas e cores individuais que permitem ao programador configurar quaisquer dados para uma forma na
hierarquia de maneira independente.
d) Métodos get para as coordenadas e cores individuais que permitem ao programador recuperar quaisquer dados para uma forma na
hierarquia de maneira independente.
e) O método abstract que o método paintComponent do programa chamará para desenhar uma forma na tela.
Para assegurar um encapsulamento adequado, todos os dados na classe MyShape devem ser private. Isso exige declarar métodos set
e get adequados para manipular os dados. A classe MyLine deve fornecer um construtor sem argumentos e um construtor com argumentos
para as coordenadas e cores. As classes MyOval e MyRectangle devem fornecer um construtor sem argumentos e um construtor com argumentos para as coordenadas e as cores e determinar se a forma será preenchida. O construtor sem argumentos deve, além de configurar
os valores padrão, configurar a forma como uma forma não preenchida.
Você pode desenhar linhas, retângulos e ovais se conhecer dois pontos no espaço. As linhas exigem as coordenadas x1, y1, x2 e y2. O
método drawLine da classe Graphics ligará os dois pontos fornecidos com uma linha. Se você tiver os mesmos quatro valores de coordenadas (x1, y1, x2 e y2) para ovais e retângulos, você pode calcular os quatro argumentos necessários para desenhá-los. Cada uma requer
um valor da coordenada x superior esquerda (o menor dos dois valores da coordenada x), um valor da coordenada y superior esquerda (o
menor dos dois valores da coordenada y), uma largura (o valor absoluto da diferença entre os dois valores da coordenada x) e uma altura
(o valor absoluto da diferença entre os dois valores da coordenada y). Retângulos e ovais também devem ter um flag filled que determina
se a forma deve ser desenhada como uma forma preenchida.
Não haverá variáveis MyLine, MyOval ou MyRectangle no programa — somente variáveis MyShape que contêm referências aos
objetos MyLine, MyOval e MyRectangle. O programa deve gerar formas aleatórias e armazená-las em uma array do tipo MyShape. O
método paintComponent deve percorrer o array MyShape e desenhar cada forma chamando polimorficamente o método desenhar de
cada uma.
Permita que o usuário especifique (por um diálogo de entrada) o número de formas a gerar. O programa então irá gerar e exibir as
formas juntamente com uma barra de status que informa o usuário quantas de cada forma foram criadas.

