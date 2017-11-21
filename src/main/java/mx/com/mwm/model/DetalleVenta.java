package mx.com.mwm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="detalle_ventas")
public class DetalleVenta {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id_Detalles")
	private int idDetalles;
	
	@ManyToOne
	@JoinColumn(name="Venta_Id_Compra")
	private Ventas idVenta;
	
	@ManyToOne
	@JoinColumn(name="T_Producto_Id_Producto")
	private Productos idProducto;
	
	@Column(name="Cantidad_Producto")
	private int cantidad;
	
	public DetalleVenta() {
		// TODO Auto-generated constructor stub
	}

	public int getIdDetalles() {
		return idDetalles;
	}

	public void setIdDetalles(int idDetalles) {
		this.idDetalles = idDetalles;
	}

	public Ventas getIdVenta() {
		return idVenta;
	}

	public void setIdVenta(Ventas idVenta) {
		this.idVenta = idVenta;
	}

	public Productos getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Productos idProducto) {
		this.idProducto = idProducto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "DetalleVenta [idDetalles=" + idDetalles + ", idVenta=" + idVenta + ", idProducto=" + idProducto
				+ ", cantidad=" + cantidad + "]";
	}
	
	
	

}
