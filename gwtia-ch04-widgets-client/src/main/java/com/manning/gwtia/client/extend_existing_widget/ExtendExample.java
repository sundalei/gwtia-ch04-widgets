package com.manning.gwtia.client.extend_existing_widget;

import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;

/**
 * This example shows how to create a widget directly from the DOM.
 */
public class ExtendExample extends Composite{

	/**
	 * A new ReportSizeLabel object - this is defined in ReportSizeLabel.java 
	 * and is an extension of the InlineLabel from GWT whose onLoad method is 
	 * overloaded to display a message to the user of the width and height.
	 */
	ReportSizeLabel theLabel;

	/**
	 * Creates the Widget.
	 * Sets up history handling, the GUI components, and button handling.
	 */
	public ExtendExample(){
		theLabel = new ReportSizeLabel("What's my size?");
		initWidget(theLabel);

		theLabel.addClickHandler(event -> Window.alert("You clicked me!"));
	}
}