### Primeira Aplicação Java

#### Convenção do código

 Convenção de código: conjunto de regras recomendadas para escrever código Java que é fácil de ler, entender e manter.

 São definidas pela Oracle

 - Nome de classes devem começar com letra maiúscula e usar a convenção PascalCase (Upper CamelCase)
  **MinhaClasse**

  - Nomes de métodos devem começar com letra minúscula e usar a convenão camelCase
  **meuMetodo()**

  - Nomes de constantes devem ser totalmente em letras maiúsculas, separadas por underline
 **MINHA_CONSTANTE**

 - Nomes de variáveis devem começar com letra minúscula e usar a convenção camelCase
 **minhaVariavel**

 - Todas as linhas de código devem ter no máximo 80 caracteres de largura para facilitar a leitura
 - Recomenda-se usar espaços em branco para separar operadores, palavras-chave e elementos de controle de fluxo
  **if (condicao) {**

  - Use comentários para documentar seu código, explicando o que ele faz e por que ele faz isso. Devem ser claros e concisos.
  
### Strings e Text Blocks

String = representa uma sequência de caracteres (texto).

#### Criação de Strings

String nome = "Alura";

É possível concatenar duas ou mais Strings utilizando o '+'

String saudacao = "Olá, ";
String nome = "Alura";
String mensagem = saudacao + nome + "!";

//Saída: "Olá, Alura!"

#### Comparação de Strings

O operador de comparação (==) verifica apenas se as duas variáveis *apontam para o mesmo objeto na memória*, e não para o conteúdo das strings. 

Para comparar o *conteúdo* das strings, é necessário usar o método **equals()**

String senha = "12345";
if (senha.equals("12345")) {
    System.out.println("Acesso autorizado!");
} else {
    System.out.println("Senha incorreta.");
}

#### Text Block
É uma forma de representar Strings que facilitam a escrita de textos com múltiplas linhas.

##### Sintaxe do Text Block
Basta utilizar três aspas duplas para delimitar o texto, seguidas de uma quebra de linha.

String mensagem = """
                  Olá, mundo!
                  Este é um Text Block.
                  Ele permite escrever textos com múltiplas linhas
                  sem precisar usar caracteres de escape ou quebras de linha manualmente ou concatenações.
                  """;
    