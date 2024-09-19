# Projeto ContaBanco

Este projeto em Java simula a criação de uma conta bancária, permitindo que o usuário insira dados como número da conta, agência, nome do cliente e saldo, e exibe uma mensagem de confirmação personalizada.

## Descrição

O programa captura as informações da conta diretamente via terminal, utilizando a classe `Scanner`. Após coletar os dados, uma mensagem formatada é exibida, confirmando a criação da conta com os detalhes fornecidos pelo usuário.

### Informações capturadas:
- Número da conta
- Agência
- Nome do cliente
- Saldo da conta

### Exemplo de mensagem exibida:

```
Olá MARIO ANDRADE, obrigado por criar uma conta em nosso banco, sua agência é 067-8, conta 1021 e seu saldo 237.48 já está disponível para saque.
```

## Como usar

1. **Clonar o repositório**:
   ```bash
   git clone https://github.com/usuario/projeto-conta-banco.git
   ```
   
2. **Navegar até o diretório do projeto**:
   ```bash
   cd projeto-conta-banco
   ```

3. **Compilar o código**:
   ```bash
   javac ContaTerminal.java
   ```

4. **Executar o programa**:
   ```bash
   java ContaTerminal
   ```

5. **Inserir os dados solicitados no terminal**:
   - Número da conta (inteiro)
   - Agência (texto)
   - Nome do cliente (texto)
   - Saldo (decimal)

## Melhorias Futuras

Algumas sugestões de possíveis melhorias para expandir a funcionalidade do projeto:

1. **Validação de dados**: Implementar validação para garantir que o número da conta seja positivo, o saldo seja um valor válido e que os campos de texto não estejam vazios.
   
2. **Formato monetário**: Exibir o saldo no formato de moeda local, como `R$ 237,48`.

3. **Persistência de dados**: Adicionar uma funcionalidade para salvar os dados da conta em um arquivo ou banco de dados, para que possam ser acessados posteriormente.

4. **Interface gráfica**: Expandir o projeto para incluir uma interface gráfica (GUI) com Java Swing ou JavaFX, tornando o programa mais amigável ao usuário.

5. **Suporte a múltiplas contas**: Permitir que o usuário crie e gerencie múltiplas contas bancárias no mesmo programa.

6. **Opções adicionais**: Implementar funcionalidades de depósito, saque e transferência entre contas.

## Requisitos

- **Java 8** ou superior
- **Terminal ou IDE** para executar o código Java

## Licença

Este projeto é de livre uso e distribuição.
```

### Estrutura do `README.md`:

- **Descrição**: Introduz o projeto e suas funcionalidades básicas.
- **Como usar**: Explica como clonar, compilar e rodar o projeto.
- **Melhorias Futuras**: Sugere melhorias possíveis para o projeto, como validação de dados e adição de novas funcionalidades.
- **Requisitos**: Indica a versão mínima do Java necessária para rodar o projeto.
- **Licença**: Indica que o projeto é de livre uso.
