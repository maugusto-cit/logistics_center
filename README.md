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

#### Passos para execução:
`git clone https://github.com/joseslneto/logistics_center.git`

#### Variáveis de ambiente:
Incluir em `/etc/environment`

* `database_url` = `postgresql://localhost:5432/logistics_center`
* `database_platform` = `POSTGRES`
* `database_username` = `cit`
* `database_password` = `cit`
* `host_api_doc` = `http://localhost:8080`

#### Documentação:
###### JAVADOC
[JAVADOC - Logistics Center](https://joseslneto.github.io/logistics_center/)
###### API DOC
Após subir a aplicação acessar o link `http://localhost:8080/jsondoc-ui.html#` e incluir na URL
`http://localhost:8080/jsondoc`