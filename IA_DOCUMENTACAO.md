# Documentação do uso da IA na Questão 2 (Command + Backup)

## Prompts utilizados

1. "Crie uma implementação em Java para a Questão 2 da Lista Avaliativa II utilizando o padrão Command, com capacidade de salvar e carregar comandos de um arquivo."
2. "Adicione uma classe RemoteControl que execute os comandos e recupere-os após uma falha."

## O que a IA gerou

- Estrutura básica dos comandos (LightOn, LightOff, etc.)
- Implementação do padrão Command com a classe `CommandStore` para armazenamento de comandos em arquivo.
- Implementação da classe `RemoteControl` para controle de dispositivos e recuperação de comandos.
- Simulação de falha e recuperação de comandos através do arquivo `backup.txt`.

## Ajustes manuais feitos

- A IA forneceu a estrutura base de comandos e armazenamento, mas precisei:
    - Ajustar o código de **execução** para garantir que a recuperação funcione corretamente.
    - Modificar o método `store()` para garantir que os comandos sejam salvos corretamente no arquivo de texto.
    - Adicionar mais **comandos concretos** como `LightOnCommand` e `TVOffCommand`, ajustando a lógica de execução.

## Porque os ajustes foram necessários

Os ajustes melhoraram a clareza do código, a precisão na gravação e recuperação dos comandos e garantiram que o padrão Command fosse corretamente implementado com backup.

Essas melhorias tornaram o código mais robusto e alinhado com os requisitos da atividade.
