package com.manning.gwtia.client.create_new_widget;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;

public class CreateExample extends Composite{

	GWTiACanvas theCanvas;
	
	private String oldBackgroundColor;

	public CreateExample(){
		theCanvas = new GWTiACanvas();
		theCanvas.setPixelSize(400, 400);
		theCanvas.getElement().getStyle().setProperty("border", "1px solid black");
		initWidget(theCanvas);

		theCanvas.fillStyle("rgb(80,255,80)");
		theCanvas.fillRect(10, 20, 100, 50);

		theCanvas.addMouseOverHandler(event -> {
			oldBackgroundColor = theCanvas.getElement().getStyle().getBackgroundColor();
			theCanvas.getElement().getStyle().setBackgroundColor("lightblue");
		});

		theCanvas.addMouseOutHandler(event -> theCanvas.getElement().getStyle().setBackgroundColor(oldBackgroundColor));
		
		theCanvas.addDomHandler(event -> Window.alert("Clicked!"), ClickEvent.getType());
	}
}