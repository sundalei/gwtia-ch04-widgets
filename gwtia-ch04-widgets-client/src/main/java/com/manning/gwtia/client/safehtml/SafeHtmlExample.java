package com.manning.gwtia.client.safehtml;

import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.StackLayoutPanel;

/**
 * This example shows how to create a widget directly from the DOM.
 */
public class SafeHtmlExample extends Composite{

	StackLayoutPanel container = new StackLayoutPanel(Unit.PX);
	
	/**
	 * Creates the Widget.
	 */
	public SafeHtmlExample(){

		container.add(new InnerHTMLExample(), "Testing innerHtml()", 30);
		container.add(new SetTextExample(), "Testing widget setText()", 30);
		container.add(new SafeHtmlBuilderExample(), "Testing SafeHtmlBuilder", 30);
		container.add(new SafeHtmlUtilsExample(), "Testing SafeHtmlUtils", 30);
		container.add(new SafeHtmlSanitizerExample(), "Testing SafeHtmlSanatizer", 30);
		container.add(new SafeHtmlTemplateExample(), "Testing SafeHtml Templates", 30);

		initWidget(container);
		this.setSize("100%", "100%");
		container.forceLayout();

		
	}
}