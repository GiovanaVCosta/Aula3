package br.senai.sp.jandira.game.model;

import java.util.Scanner;

public class Register {

    player player = new player();

    Enemy enemy = new Enemy();
    Output output = new Output();

    Scanner teclado = new Scanner(System.in);
    public void bothRegister(){
        PlayerRegister();
        EnemyRegister();
    }

    public void PlayerRegister(){

        System.out.println("----------------------------");
        System.out.println("-------CADASTRO PLAYER------");
        System.out.println("Qual seu nome?");
        player.name = teclado.nextLine();
        System.out.println("Seleciona sua Skin[ red - blue - green]");
        player.skin = teclado.nextLine();
        System.out.println("player cadastrado com sucesso");
        System.out.println("----------------------------");
    }
    public void EnemyRegister(){
        System.out.println("----------------------------");
        System.out.println("-------CADASTRO ENEMY-------");
        System.out.println("qual seu nome?");
        enemy.name= teclado.nextLine();
        System.out.println("Seleciona sua Skin[ red - blue - green]");
        enemy.skin= teclado.nextLine();
        System.out.println("-------player cadastrado com sucesso--------");
        System.out.println("----------------------------");

        Output output = new Output();


    }

    public void Decision(){
        String decision;

        System.out.println("Bem vindo!!");
        System.out.println("O que deseja cadstrar[Player/Enemy/Ambos]: ");
        decision = teclado.nextLine();

        switch (decision) {
            case "Player":
                PlayerRegister();
                break;
            case "Enemy":
                EnemyRegister();
                break;
            case "Ambos":
                bothRegister();
                break;
            default:
                System.out.println("Escolha uma opção valida");
                Decision();
        }
        }
}
