package Poo;

public class Prisma extends Geometry{
	private double Altura;
	private double AreaLateral;
	private double AreaBase;
	private double AreaTotal;
	private double Volumen;
	
	public Prisma (double radio) {
		super ();
		this.Altura = Altura;
		this.AreaBase = AreaBase;
		this.AreaLateral = AreaLateral;
		this.AreaTotal = AreaTotal;
		this.Volumen = Volumen;
	}

	public double getAltura() {
		return this.Altura;
	}

	public void setAltura(double altura) {
		this.Altura = altura;
	}

	public double getAreaLateral() {
		return this.AreaLateral;
	}

	public void setAreaLateral(double areaLateral) {
		this.AreaLateral = areaLateral;
	}

	public double getAreaBase() {
		return this.AreaBase;
	}

	public void setAreaBase(double areaBase) {
		this.AreaBase = areaBase;
	}

	public double getAreaTotal() {
		return this.AreaTotal;
	}

	public void setAreaTotal(double areaTotal) {
		this.AreaTotal = areaTotal;
	}

	public double getVolumen() {
		return this.Volumen;
	}

	public void setVolumen(double volumen) {
		this.Volumen = volumen;
	}
	
	}

	


