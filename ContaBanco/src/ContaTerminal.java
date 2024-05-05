  import java.util.Scanner;
    import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
      
        /* 
        - TODO: Conhecer e importar a classe Scanner
        - Exibir mensagens para o nosso usuário
        - Obter pela scanner os valores digitados no terminal
        - Exibir a mensagem conta criada 
        */
       
       
        Scanner ler = new Scanner(System.in).useLocale(Locale.US);


        // Opções de operações que o cliente deseja realizar - Algumas apaenas se houver cadastro do mesmo 
        System.out.println(" Bem Vindo Ao JavaBank - Qualidade e Versatilidade no seu atendimendo!\n Qual operação deseja fazer hoje? \n 1 - Abrir conta \n 2 - Acessar conta \n 3 - Solução de problemas \n 4 - Concluir" );   
        int operacao = ler.nextInt();
        
            // Opção de realizaer cadastro usando condicional 
            if (operacao == 1) {

            // Recebendo os dodos dos clientes nas seguintes variavéis 
              System.out.println("Seja bem vindo ao nosso Banco, Vamos abrir sua conta? \n Abaixo, insira seus dados para fazer seu cadastro: ");
              System.out.println("Digite seu nome: ");
              String nomeCliente = ler.next();
              System.out.print("Digite seu SOBRENOME");
              String sobrenomeCliente = ler.next();

              System.out.println("Certo, " + nomeCliente + " " + sobrenomeCliente + "Agora insira seu cpf");
              String cpfCliente = ler.next();
              System.out.println(cpfCliente);  
              int lerCpf = cpfCliente.length();
            

              // Apenas verificando se o CPF inserido possui 11 digitos, mas não validando o mesmo

               if ( lerCpf == 11) {
                    System.out.println(" Seu CPF : " + lerCpf + "");
                    
                } else {
                     System.out.println(" O seu CPF precisa possuir 11 digitos: ");
                }

                System.out.println("Informe seu número de telefone:\n BR(55+) ");
                String numeroTelefone = ler.next();
                System.out.println(numeroTelefone);

                System.out.println("Iforme seu endereço: ");
                String enderecoCliente = ler.next();

                System.out.println("Informe o CEP de seu estado: ");
                String cepestadoCliente = ler.next();
                int checarcepCliente = cepestadoCliente.length();
                System.out.println(checarcepCliente);

                if ( checarcepCliente == 8) {                    
                    System.out.println("Você está pronto?");
                    System.out.println("Estamos gerando os dados de sua conta, por favor1, aguarde ... ");

                    
                } else {
                    System.out.println("Digite um CEP VALIDO");
                    
                }

                
            } else {
                System.out.println("Informe o nome de usuario: ");
                String nome = ler.next(); 
            }
        

        }
           

    
        
    
    }         
        

 


