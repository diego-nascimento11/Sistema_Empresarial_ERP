package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        int n = 0;

        do {

            System.out.println("===========================================================================");
            System.out.println("|                     Sistema de Gestão Empresarial                       |");
            System.out.println("===========================================================================");
            System.out.println("1. Entrar no módulo de Vendas (realizar ou consultar pedidos).");
            System.out.println("2. Acessar Controle de Estoque (visualizar, adicionar ou remover produtos).");
            System.out.println("3. Gerenciar Recursos Humanos (cadastro e administração de funcionários).");
            System.out.println("4. Acessar Financeiro (consultar receitas, despesas e relatórios).");
            System.out.println("0. Sair");
            System.out.println("===========================================================================");
            System.out.print("Escolha uma opção para prosseguir: ");

            try {
                n = Integer.parseInt(sc.nextLine());
                if (n < 0 || n > 4) {
                    System.out.println();
                    System.out.println("| Opção inválida. Digite um número entre 0 e 4.");
                    System.out.println();
                    Thread.sleep(3000);
                    continue;
                }
                System.out.println("a");
                switch (n) {
                    case 1:
                        // Módulo de vendas
                        break;
                    case 2:
                        // Módulo de estoque
                        break;
                    case 3:
                        // Módulo de RH
                        break;
                    case 4:
                        // Módulo financeiro
                        break;
                    case 0:
                        System.out.println("Programa encerrado, tchau.");
                        System.exit(0);
                }
            } catch (Exception e) {
                System.out.println();
                System.out.println("| A opção digitada não é reconhecida como um número.");
                System.out.println();
                Thread.sleep(3000);
            }

            System.out.print("Pressione [ENTER] para retornar ao menu.");
            sc.nextLine();

        } while (n != 0);


        sc.close();
    }
}
