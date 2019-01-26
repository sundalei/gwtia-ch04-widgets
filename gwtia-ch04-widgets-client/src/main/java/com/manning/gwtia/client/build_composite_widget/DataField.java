package com.manning.gwtia.client.build_composite_widget;

import com.google.gwt.event.dom.client.*;
import com.google.gwt.event.logical.shared.HasValueChangeHandlers;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.i18n.client.HasDirection;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.InlineLabel;
import com.google.gwt.user.client.ui.TextBox;

/**
 * Widget that demonstrates how to build a GWT Composite.
 * 
 * It consists of a Label (question) and a TextBox (answer) in a
 * HorizontalPanel.
 * 
 */
public class DataField extends Composite implements HasText, HasDirection,
		HasMouseOverHandlers, HasMouseOutHandlers, HasValueChangeHandlers<String> {

	// The UI elements we will manipulate
	InlineLabel theQuestion;
	TextBox theAnswer;
	FlowPanel panel;

	protected Direction dir = Direction.DEFAULT;

	/**
	 * Construct the widget
	 */
	public DataField(String question) {
		panel = new FlowPanel();
		theQuestion = new InlineLabel(question);
		theAnswer = new TextBox();
		buildDisplay();

		initWidget(panel);

		this.getElement().getStyle().setProperty("border", "solid lightblue 2px");
	}

	private void buildDisplay() {
		panel.clear();
		theQuestion.setText(theQuestion.getText(), dir);
		theAnswer.setDirection(dir);
		if (dir.equals(Direction.RTL)) {
			panel.add(theAnswer);
			panel.add(theQuestion);
		} else {
			panel.add(theQuestion);
			panel.add(theAnswer);
		}
	}

	// Utility method to get the answer text
	public String getText() {
		String answer = "";
		if (theAnswer != null) {
			answer = theAnswer.getText();
		}
		return answer;
	}

	// Utility method to get the question text
	public String getQuestion() {
		String question = "";
		if (theQuestion != null) {
			question = theQuestion.getText();
		}
		return question;
	}

	// Utility method to set the answer text
	public void setText(String text) {
		if (theAnswer != null) {
			theAnswer.setText(text);
		}
	}

	// Utility method to set the question text
	public void setQuestion(String text) {
		if (theQuestion != null) {
			theQuestion.setText(text);
		}
	}

	public void setDirection(Direction direction) {
		this.dir = direction;
		buildDisplay();
	}

	public Direction getDirection() {
		return dir;
	}

	@Override
	public HandlerRegistration addMouseOverHandler(MouseOverHandler handler) {
		return addDomHandler(handler, MouseOverEvent.getType());
	}

	@Override
	public HandlerRegistration addMouseOutHandler(MouseOutHandler handler) {
		return addDomHandler(handler, MouseOutEvent.getType());
	}

	@Override
	public HandlerRegistration addValueChangeHandler(ValueChangeHandler<String> handler) {
		return theAnswer.addValueChangeHandler(handler);
	}
}
