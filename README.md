# Logistics Center

[DESAFIO](CHALLENGE.md)

O projeto desenvolvido, precisa sanar com uma lógica o funcionamento correto de um centro de logística, 
auxiliando o motorista em um passo-a-passo no abastecimento correto do caminhão.

#### Concepção do sistema:
* Criação do repositório GIT;
* Criação do micro serviço utilizando Sprint Boot 1.5.4 (LATEST RELEASE);
* Criação de entidades e seus relacionamentos para inserção no banco de dados;
* Configuração do **datasouce** utilizando **YAML** por variável de ambiente;
* Criação das variáveis de ambiente;
* Implementação dos métodos na classe de controle;
* Planejamento e aplicação da lógica para o centro de logística (Solução da Torre de Hanoi);
* JavaDOCS criado nos métodos/classes necessários(as);
* Documentação da API -> JSONDocs (v.1.2.17);

#### Necessário:
* Java 8+;
* Postgres instalado (foi desenvolvido com postgres como database);
* Banco de dados `logistics_center` criado;

#### Passos para execução:
`git clone https://github.com/joseslneto/logistics_center.git`

* goto : `cd logistics-center`
* build : `mvn install`
* run : `mvn spring-boot:run`

#### Variáveis de ambiente:
Executar direto no terminal (ou incluir no .bashrc para não perder config. ao sair do terminal):

* `export database_url="postgresql://localhost:5432/logistics_center"`
* `export database_platform="POSTGRES"`
* `export database_username="cit"`
* `export database_password="cit"`

#### Documentação:
###### JAVADOC
[JAVADOC - Logistics Center](https://joseslneto.github.io/logistics_center/)
###### API DOC
Após subir a aplicação acessar o link `http://localhost:8080/jsondoc-ui.html#` e incluir na URL
`http://localhost:8080/jsondoc`