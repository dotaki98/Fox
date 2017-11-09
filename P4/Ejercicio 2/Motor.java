public class Motor//nombre de la clase
{
	private String marca;//privados
	private String modelo;
	private int potencia;

	public void setMarca(String marca)//uso de set para poder asignar
					//un valor al atributo privado marca
	{
		this.marca = marca;
	}
	public String getMarca()//uso de get para obtener el valor
				//asignado a marca
	{
		return this.marca;
	}
	public void setModelo(String modelo)//uso de set para modelo
	{
		this.modelo = modelo;
	}
	public String getModelo()//uso de get para modelo
	{
		return this.modelo;
	}
	public void setPotencia(int potencia)//uso de set para potencia
	{
		this.potencia = potencia;
	}
	public int getPotencia()//utilización de get para potencia
	{
		return this.potencia;
	}
	public Motor()//constructor vacío
	{
		this.marca = "";
		this.modelo = "";
		this.potencia=0;
	}
	public Motor(String marca, String modelo, int potencia)//constructor sobrecargado
	{
		this.marca=marca;
		this.modelo=modelo;
		this.potencia=potencia;
	}
}

