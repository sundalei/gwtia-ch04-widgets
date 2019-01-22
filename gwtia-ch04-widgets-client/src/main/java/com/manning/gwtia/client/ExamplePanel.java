package com.manning.gwtia.client;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class ExamplePanel extends Composite {
	
	private static ExamplePanelUiBinder uiBinder = GWT.create(ExamplePanelUiBinder.class);
	
	interface ExamplePanelUiBinder extends UiBinder<Widget, ExamplePanel> {}
}
