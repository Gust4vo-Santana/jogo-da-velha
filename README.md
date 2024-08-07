
# Jogo da Velha em Java

Este é um projeto simples de um Jogo da Velha (Tic-Tac-Toe) desenvolvido em Java, no qual a interface é feita via terminal. Desenvolvi esse projetinho para treinar programação em Java e alguns conceitos de orientação a obejtos.

## Funcionalidades

- Dois jogadores podem jogar alternadamente no terminal.
- O tabuleiro é atualizado e exibido a cada jogada.
- Verificação de vitória ou empate após cada movimento.

## Como Executar

1. Clone este repositório para sua máquina local.
   ```sh
   git clone https://github.com/Gust4vo-Santana/jogo-da-velha.git
   ```

3. Navegue até arquivo fonte do projeto.
   ```sh
   cd jogo-da-velha/src
   ```

4. Compile o código-fonte.
   ```sh
   javac -d out game/GameImpl.java
   ```

5. Execute o jogo.
   ```sh
   java -cp out game.GameImpl
   ```

## Como Jogar

- O jogo é jogado em um tabuleiro de 3x3.
- Dois jogadores se alternam para inserir suas marcas (X ou O) em uma célula vazia.
- Para inserir uma marca, o jogador deve digitar o número da linha e da coluna onde deseja colocar sua marca.
- O jogo termina quando um jogador consegue alinhar três de suas marcas horizontalmente, verticalmente ou diagonalmente, ou quando todas as células estão preenchidas sem um vencedor (empate).

## Estrutura do Projeto

- `Game.java`: Contém a implementação lógica principal do jogo.
- `Player.java`: Classe que representa os jogadores, contém o atributo de símbolo de cada jogador e a lógica para que façam jogadas.
- `View.java`: Contém a lógica da exibição do tabuleiro no terminal.
- `GameImpl.java`: Contém a função main e inicia o ciclo do jogo.
