  import java.util.Scanner;
    import java.util.Locale;
    import java.util.Random;
    
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        /* 
        - TODO: Conhecer e importar a classe Scanner
        - Exibir mensagens para o nosso usuário
        - Obter pela scanner os valores digitados no terminal
        - Exibir a mensagem conta criada 
        */
        Scanner ler = new Scanner(System.in).useLocale(Locale.US);

        // Opções de operações que o cliente deseja realizar - 
        // ** Algumas apaenas ilustrativas **
        System.out.println(" Bem Vindo Ao JavaBank - Qualidade e Versatilidade no seu atendimendo!\n Veja as operações disponiveís para você hoje, de acordo com seu perfil: \n 1 - Abrir conta \n 2 -Solução de problemas \n 3 - Concluir" );   
        int operacao = ler.nextInt();
        
            // Operação para  realizaer cadastro usando condicional 
            if (operacao == 1) {
                
            // Recebendo os dodos dos clientes nas seguintes váriveis 
              System.out.println("Seja bem vindo ao nosso Banco, Vamos abrir sua conta? \n Abaixo, insira seus dados para fazer iniciar o cadastro: ");
              System.out.println("Digite seu NOME: ");
              String nomeCliente = ler.next();
              System.out.print("Digite seu SOBRENOME: ");
              String sobrenomeCliente = ler.next();

              // Condiçao para repetir operação, caso o usuário  digite a quantidade de digitos errada do CPF, não válida o mesmo.
            while (true) {
                
                System.out.println("Certo, " + nomeCliente + "  " + sobrenomeCliente + " Agora insira seu cpf");
                String cpfCliente = ler.next();
                // System.out.println(cpfCliente);  
                int lerCpf = cpfCliente.length();
                // Apenas verificando se o CPF inserido possui 11 digitos, mas nÃ£o validando o mesmo
                
                if ( lerCpf == 11) {
                    System.out.println(" Seu CPF : " + cpfCliente + " Vamos prosseguir...");
                    break;
                } else {
                    System.out.println(" O seu CPF precisa possuir 11 digitos: ");
                }
            }
            
                System.out.println("Informe seu número de telefone:\n BR(55+) ");
                String numeroTelefone = ler.next();
               // System.out.println(numeroTelefone);

                System.out.println("Iforme seu endereço ");
                String enderecoCliente = ler.next();

                // Condução verdadeira para caso o usuário informe o cep errado, possa digitar novamente continuando do mesmo ponto em que está. (Não valida o CEP, apenas confere se foi digitada da forma correta)
                while (true) {
                    System.out.println("Informe o CEP de seu estado: ");
                    String cepestadoCliente = ler.next();
                    int checarcep = cepestadoCliente.length();
                    int checarcepCliente = checarcep;
                    if ( checarcepCliente == 8) {                    
                       // System.out.println(checarcepCliente); 
                        System.out.println("Você está pronto?");
                        System.out.println("Estamos gerando os dados de sua conta, por favor, aguarde ... ");
                        
                        Random gerador = new Random(649800);
                        
                        for (int i = 0; i < 1 ; i ++);
                        int gererAgencia= gerador.nextInt(10000);
                        String agenciaCliente = (gererAgencia + " - 001"); // Agência + Tipo de conta/operação - nesse caso, Conta COrrente, Pessoa Fisica;

                        Random gerador2 = new Random(14301);
                        for (int i = 0; i < 1 ; i ++);
                        int gerarNumeroConta = gerador2.nextInt(10000);
                        String digitoConta =  gerarNumeroConta + "9";
                        int numercontaCliente =   Integer.parseInt(digitoConta);

                        
                        if (true);
                        Double saldoAtual = 00.00;
                        // System.out.println(saldoAtual);
                       
                        
                        System.out.println("Parabéns " + nomeCliente + " sua conta foi criada. \n Sua agência é: " + agenciaCliente + "\n E o número da sua conta: "  + numercontaCliente + "\n O seu saldo atual é de: " + saldoAtual  +"\n SEJA BEM VINDO A SUA CONTA JAVABANK! \n Comece a usar sua conta, desposite qualquer valor e faça seu dinheiro render! ");
                        break;
                    } else {
                        System.out.println("Digite um CEP VALIDO");
                    }  
                }
            } else {
                System.out.println("Informe o nome de usuario: ");
                String nome = ler.next(); 
            }
        }
    }         
