import java.awt.Color;
import java.awt.Graphics;
import java.security.SecureRandom;

import javax.swing.JPanel;

public class DesenhoPanel extends JPanel{
	
	private SecureRandom aleatorio = new SecureRandom();
	private MinhaLinha[] linhas;
	private MeuRetangulo[] retangulos;
	private MinhaCircunferencia[] circunferencias;
	
	public DesenhoPanel() {
		
		setBackground(Color.WHITE);
		
		linhas = new MinhaLinha[1 + aleatorio.nextInt(6)];
		retangulos = new MeuRetangulo[1 + aleatorio.nextInt(6)];
		circunferencias = new MinhaCircunferencia[1 + aleatorio.nextInt(6)];
		
		for(int contador = 0; contador < linhas.length; contador++) {
			
			int x1 = aleatorio.nextInt(300);
			int y1 = aleatorio.nextInt(300);
			int x2 = aleatorio.nextInt(300);
			int y2 = aleatorio.nextInt(300);
			
			Color cor = new Color(aleatorio.nextInt(256), aleatorio.nextInt(256), aleatorio.nextInt(256));
			
			linhas[contador] = new MinhaLinha(x1, y1, x2, y2, cor);
			
		}
		
		for(int contador = 0; contador < retangulos.length; contador++) {
			
			int x1 = aleatorio.nextInt(300);
			int y1 = aleatorio.nextInt(300);
			int x2 = aleatorio.nextInt(300);
			int y2 = aleatorio.nextInt(300);
			
			Color cor = new Color(aleatorio.nextInt(256), aleatorio.nextInt(256), aleatorio.nextInt(256));
			
			boolean preenchido = aleatorio.nextBoolean();
			
			retangulos[contador] = new MeuRetangulo(x1, y1, x2, y2, preenchido, cor);
			
		}
		
		for(int contador = 0; contador < circunferencias.length; contador++) {
			
			int x1 = aleatorio.nextInt(300);
			int y1 = aleatorio.nextInt(300);
			int x2 = aleatorio.nextInt(300);
			int y2 = aleatorio.nextInt(300);
			
			Color cor = new Color(aleatorio.nextInt(256), aleatorio.nextInt(256), aleatorio.nextInt(256));
			
			boolean preenchido = aleatorio.nextBoolean();
			
			circunferencias[contador] = new MinhaCircunferencia(x1, y1, x2, y2, preenchido, cor);
			
		}
		
		
	}
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		for(MinhaLinha linha : linhas) {
			
			linha.desenha(g);
			
		}
		
		for(MeuRetangulo  ret : retangulos) {
			
			ret.desenha(g);
			
		}
		
		for(MinhaCircunferencia circ : circunferencias) {
			
			circ.desenha(g);
			
		}
		
	}

	public SecureRandom getAleatorio() {
		return aleatorio;
	}

	public void setAleatorio(SecureRandom aleatorio) {
		this.aleatorio = aleatorio;
	}

	public MinhaLinha[] getLinhas() {
		return linhas;
	}

	public void setLinhas(MinhaLinha[] linhas) {
		this.linhas = linhas;
	}

	public MeuRetangulo[] getRetangulos() {
		return retangulos;
	}

	public void setRetangulos(MeuRetangulo[] retangulos) {
		this.retangulos = retangulos;
	}

	public MinhaCircunferencia[] getCircunferencias() {
		return circunferencias;
	}

	public void setCircunferencias(MinhaCircunferencia[] circunferencias) {
		this.circunferencias = circunferencias;
	}
	
	public String retornaStatus() {
		
		return String.format("Linhas: %d, Circunferências: %d, Retângulos: %d", getLinhas().length, getCircunferencias().length, getRetangulos().length);
		
	}
	
}
