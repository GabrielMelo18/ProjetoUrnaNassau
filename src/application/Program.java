package application;

import java.util.ArrayList;
import java.util.Scanner;

import entities.Candidates;

public class Program {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int ent;
		ArrayList<Candidates> Candidate = new ArrayList<Candidates>();
		do {
			System.out.println("Cadastrar 1 ");
			System.out.println("Consultar 2");
			System.out.println("Votar     3");
			System.out.println("Finalizar 4");
			ent = in.nextInt();
			
			if(ent == 1) {
				System.out.println("Digite o numero:");
				String number = in.next();
				System.out.println("Digite o nome:");
				String name = in.next();
				System.out.println("Digite o partido");
				String party = in.next();
				Candidate.add(new Candidates(number, name, party));
			} else if (ent == 2) {
            System.out.println("Digite um numero");
            String n = in.next();
            for (int i = 0; i < Candidate.size(); i++) {
                if (Candidate.get(i).getNumber().equals(n)) {
                    System.out.println(Candidate.get(i).getName() + ", " + ((Candidates) Candidates.get(i)).getParty() + ", " + Candidate.get(i).getVotes());
                }
            }
        } else if (ent == 3) {
            System.out.println("Digite um numero de quem deseja votar");
            String n = in.next();
            int i = 0;
            for (; i < Candidate.size(); i++) {
                if (Candidate.get(i).getNumber().equals(n)) {
                    break;
                }
            }
		
		in.close();
        	}
		} while (ent !=4 );
	}
}
