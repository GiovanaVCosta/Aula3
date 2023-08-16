package br.senai.sp.jandira.game.model;

public class Output {

    public void Print(player player) {
        System.out.println("-------------------------");
        System.out.println("O nomedp PLayer é:  " + player.name);
        System.out.println(" A Skin escolhida foi: "  + player.skin);
    }
        public void Print(Enemy enemy){

        System.out.println("-------------------------");
        System.out.println("O nome do Enemy é:  " + enemy.name);
        System.out.println(" A skin escolhida foi: " + enemy.skin);
    }
}
