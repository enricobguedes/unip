JAVA HANDBOOK - QUICK REFERENCE PT/BR

// versão 1.0
// ultima atualização 09/08/21, hora 16:39


Sintaxe básica

	- Objeto
		>	Estado/Atributos
		>	Instância de uma classe

	- Atributos/Variáveis
		>	Definem as variáveis que serão usadas
		>	Pertinentes a um (ou mais) objeto(s)
		>	Tipos de variáveis:
			=	Locais
					- Definidadas dentro de um método,
					construtor (destruída após uso).
			=	Instanciadas (não estática)
					- Definidas com a classe instânciada
			=	Classe (estática)
					- atributos static

	- Modificadores de acesso para atributos/metodos
		>	Acessíveis: default, public, protected, private
		>	Não acessíveis: final, abstract, strictfp

	- Métodos
		>	"Funções"
		>	Manipular dados
		>	"Executar ações"
		*	Escritos em camelCase

	- Construtores
		>	TODAS as classes tem um construtor
		>	Usando palavra new para invocar novo objeto
		>	Exemplo:
			public Cachorro (String nome) {				//Construtor
			system.out.println("O nome é: " + nome);	// 
			}
			public static void main (String []args) {	//Criando
			Cachorro meuAuau = new Cachorro("Rubi"); 	// objeto
			}

	- Acessando variáveis e métodos
		>	ObjetoRecemCriado = Construtor()
			ObjetoRecemCriado.nomeVariavel
			ObjetoRecemCriado.meuMetodo()

	- Classe
		>	Template/planta de um objeto
		>	Descreve o comportamento de um objeto
		*	Devem ser escritos com a primeira letra maiúscula

	- Herança						   |	Interface 
		>	Super classe = classe pai  |		>	Ponto de contato entre pai e filha
		>	Sub classe = classe filha  |		>	Define quais metodos classe filha
		*	Usando extends  		   |			deve usar

	- Override
		> 	Construtores não podem ser @Override
		> 	A subclasse não pode ser privada/final
		> 	Pode-se usar super para invocar o método da 
			superclasse na subclasse
