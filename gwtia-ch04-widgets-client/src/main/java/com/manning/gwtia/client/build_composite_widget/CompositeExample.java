package com.manning.gwtia.client.build_composite_widget;

import com.google.gwt.dom.client.Style.BorderStyle;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.i18n.client.HasDirection.Direction;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Label;

public class CompositeExample extends Composite {

	public CompositeExample() {
		FlowPanel display = new FlowPanel();

		final DataField questionLTR = new DataField("Question One ");
		final Label answerLTR = new Label("LTR Answer is: ");
		DataField questionRTL = new DataField("سؤال واحد");
		questionRTL.setDirection(Direction.RTL);
		display.add(questionLTR);
		display.add(answerLTR);
		display.add(questionRTL);

		initWidget(display);

		questionLTR.addMouseOverHandler(event -> {
			questionLTR.getElement().getStyle().setBorderStyle(BorderStyle.DOTTED);
			questionLTR.getElement().getStyle().setBorderWidth(5, Unit.PX);
		});

		questionLTR.addMouseOutHandler(event -> {
			questionLTR.getElement().getStyle().setBorderStyle(BorderStyle.HIDDEN);
		});

		questionLTR.addValueChangeHandler(event -> answerLTR.setText("LTR Answer is: " + event.getValue()));

	}
}