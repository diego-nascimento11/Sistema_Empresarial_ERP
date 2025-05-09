package application;

import model.entities.Client;
import model.entities.ItemOrder;
import model.entities.OrderProcessing;

import java.util.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        List<Client> clients = new ArrayList<>();

        int n = 0;
        boolean inSalesMenu = true;

        do {

            System.out.println("===========================================================================");
            System.out.println("|                     Sistema de Gestão Empresarial                       |");
            System.out.println("===========================================================================");
            System.out.println("1. Entrar no módulo de Vendas (realizar ou consultar pedidos).");
            System.out.println("2. Acessar Controle de Estoque (entrada, relatórios e controle de produtos).");
            System.out.println("3. Gerenciar Recursos Humanos (cadastro, registro, cálculo).");
            System.out.println("4. Acessar Financeiro (controle, fluxo e relatório).");
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

                switch (n) {
                    case 1:
                        // Módulo de vendas
                        for (int i = 0; i < 10; i++) {
                            System.out.println();
                        }
                        while (inSalesMenu) {
                        System.out.println("============================");
                        System.out.println("|   Operações Comerciais   |");
                        System.out.println("============================");
                        System.out.println("1. Realizar pedido.");
                        System.out.println("2. Consultar pedidos.");
                        System.out.println("0. Voltar.");
                        System.out.println("============================");
                        System.out.print("Escolha uma opção: ");
                        Integer choice = Integer.parseInt(sc.nextLine());
                        if (choice < 0 || choice > 2) {
                            System.out.println();
                            System.out.print("| O número de pedidos deve ser maior que 0. ");
                            break;
                        }
                            switch (choice) {
                                case 1:
                                    System.out.println("====================");
                                    System.out.println("| Cadastrar pedido |");
                                    System.out.println("=====================");
                                    System.out.print("Quantos pedidos serão realizados: ");

                                    Integer qtdOrder = Integer.parseInt(sc.nextLine());

                                    if (qtdOrder <= 0) {
                                        System.out.println("| O número de pedidos deve ser maior que 0.");
                                    }

                                    for (int i = 1; i <= qtdOrder; i++) {
                                        System.out.println("Digite os dados do Cliente #" + i + "º Pedido:");
                                        System.out.print("Nome: ");
                                        String name = sc.nextLine();
                                        System.out.print("CPF: ");
                                        String cpf = sc.nextLine();
                                        System.out.print("Email: ");
                                        String email = sc.nextLine();

                                        System.out.println("Digite os itens do #" + i + "º Pedido:");
                                        System.out.print("Preço p/unidade: ");
                                        Double unitPrice = sc.nextDouble();
                                        System.out.print("Quantia: ");
                                        Integer quantityItem = sc.nextInt();
                                        sc.nextLine();
                                        System.out.print("Status do pedido: ");
                                        String orderProcessing = sc.nextLine();

                                        clients.add(new ItemOrder(name, cpf, email, new Date(), unitPrice, quantityItem, OrderProcessing.valueOf(orderProcessing)));
                                    }

                                    System.out.println("| Todos os pedidos foram cadastrados com sucesso.");
                                    break;

                                case 2:

                                    if (clients.isEmpty()) {
                                        System.out.println();
                                        System.out.println("| Nenhum pedido cadastrado.");
                                        System.out.println();
                                        Thread.sleep(3000);
                                    } else {

                                        for (int i = 0; i < 10; i++) {
                                            System.out.println();
                                        }

                                        System.out.println("=======================");
                                        System.out.println("| Pedidos cadastrados |");
                                        System.out.println("=======================");

                                        int count = 1;

                                        for (Client c : clients) {
                                            System.out.println("Pedido #" + count++);
                                            System.out.println(c.toString());
                                        }

                                        do {

                                            System.out.println();
                                            System.out.println("==============================");
                                            System.out.print("\nDigite 0 para retornar ao menu.\nDigite o número do pedido que deseja editar os dados: ");

                                            n = Integer.parseInt(sc.nextLine());

                                            if (n <= 0) {
                                                System.out.println();
                                                System.out.print("| O número inserido deve ser maior que 0. ");
                                            } else {
                                                // TO-DOO editar dados do cliente
                                            }

                                        } while (n != 0);




                                    }
                                    break;
                                case 0:
                                    inSalesMenu = false;
                                    break;
                            }

                        }
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
            } catch (NumberFormatException e) {
                System.out.println();
                System.out.println("| A opção digitada não é reconhecida como um número.");
                System.out.println();
            }



        } while (n != 0);


        sc.close();
    }
}
