import java.awt.Color;
import java.awt.Graphics;

public class MeuRetangulo {
	
	private int x1;
	private int y1;
	private int x2;
	private int y2;
	private boolean preenchido;
	
	private Color cor;
	
	public MeuRetangulo() {
		
		this(0, 0, 0, 0, false, Color.BLACK);
		
	}

	public MeuRetangulo(int x1, int y1, int x2, int y2, boolean preenchido, Color cor) {
		super();
		setX1(x1);
		setY1(y1);
		setX2(x2);
		setY2(y2);
		setCor(cor);
		setPreenchido(preenchido);
	}
	
	public void desenha(Graphics g) {
		
		g.setColor(getCor());
		g.drawRect(retornaXCimaEsquerda(), retornaYCimaEsquerda(), retornaLargura(), retornaAltura());
		
		if(isPreenchido() == true) {
			g.fillRect(retornaXCimaEsquerda(), retornaYCimaEsquerda(), retornaLargura(), retornaAltura());
		}
		
	}
	
	public int retornaXCimaEsquerda() {
		return x1 < x2 ? x1 : x2;
	}
	
	public int retornaYCimaEsquerda() {
		return y1 < y2 ? y1 : y2;
	}
	
	public int retornaAltura() {
		return Math.abs(x1 - x2);
	}
	
	public int retornaLargura() {
		return Math.abs(y1 - y2);
	}

	public int getX1() {
		return x1;
	}

	public void setX1(int x1) {
		this.x1 = x1 >= 0 ? x1 : 0;
	}

	public int getY1() {
		return y1;
	}

	public void setY1(int y1) {
		this.y1 = y1 >= 0 ? y1 : 0;
	}

	public int getX2() {
		return x2;
	}

	public void setX2(int x2) {
		this.x2 = x2 >= 0 ? x2 : 0;
	}

	public int getY2() {
		return y2;
	}

	public void setY2(int y2) {
		this.y2 = y2 >= 0 ? y2 : 0;
	}

	public boolean isPreenchido() {
		return preenchido;
	}

	public void setPreenchido(boolean preenchido) {
		this.preenchido = preenchido;
	}

	public Color getCor() {
		return cor;
	}

	public void setCor(Color cor) {
		this.cor = cor;
	}
	
	
	
	

}
