package com.lacazuela.app.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ImageResource;

public interface LaCazuelaResources extends ClientBundle {
	
	public static final LaCazuelaResources INSTANCE = GWT.create(LaCazuelaResources.class);
	
	@Source("images/addbalance.png")
	ImageResource addbalance();
	
	@Source("images/addbebida.png")
	ImageResource addbebida();
	
	@Source("images/addcaja.png")
	ImageResource addcaja();
	
	@Source("images/addcategoria.png")
	ImageResource addcategoria();
	
	@Source("images/addcocina.png")
	ImageResource addcocina();
	
	@Source("images/addfactura.png")
	ImageResource addfactura();
	
	@Source("images/addmesa.png")
	ImageResource addmesa();
	
	@Source("images/addnota.png")
	ImageResource addnota();
	
	@Source("images/addpedido.png")
	ImageResource addpedido();
	
	@Source("images/addplato.png")
	ImageResource addplato();
	
	@Source("images/addproducto.png")
	ImageResource addproducto();
	
	@Source("images/addproveedor.png")
	ImageResource addproveedor();
	
	@Source("images/addsuministro.png")
	ImageResource addsuministro();
	
	@Source("images/addtipoproducto.png")
	ImageResource addtipoproducto();
	
	@Source("images/addusuario.png")
	ImageResource addusuario();
	
	@Source("images/caja.png")
	ImageResource caja();
	
	@Source("images/categoria.png")
	ImageResource categoria();
	
	@Source("images/cocina1.png")
	ImageResource cocina1();
	
	@Source("images/cocina.png")
	ImageResource cocina();
	
	@Source("images/inicio.png")
	ImageResource inicio();
	
	@Source("images/inventario.png")
	ImageResource inventario();
	
	@Source("images/mesa1.png")
	ImageResource mesa1();
	
	@Source("images/mesaocu1.png")
	ImageResource mesaocu1();
	
	@Source("images/mesaocu.png")
	ImageResource mesaocu();
	
	@Source("images/mesa.png")
	ImageResource mesa();
	
	@Source("images/mesasin1.png")
	ImageResource mesasin1();
	
	@Source("images/mesasin.png")
	ImageResource mesasin();
	
	@Source("images/noimage.png")
	ImageResource noimage();
	
	@Source("images/pedido1.png")
	ImageResource pedido1();
	
	@Source("images/pedido.png")
	ImageResource pedido();
	
	@Source("images/plato1.png")
	ImageResource plato1();
	
	@Source("images/plato.png")
	ImageResource plato();
	
	@Source("images/producto1.png")
	ImageResource producto1();
	
	@Source("images/producto.png")
	ImageResource producto();
	
	@Source("images/proveedor.png")
	ImageResource proveedor();
	
	@Source("images/restaurante.png")
	ImageResource restaurante();
	
	@Source("images/suministro.png")
	ImageResource suministro();
	
	@Source("images/usuario1.png")
	ImageResource usuario1();
	
	@Source("images/usuario.png")
	ImageResource usuario();
	
	@Source("images/vermesas1.png")
	ImageResource vermesas1();
	
	@Source("images/vermesas.png")
	ImageResource vermesas();
	
}
