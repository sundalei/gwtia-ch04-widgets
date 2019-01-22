package com.manning.gwtia.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.ui.RootPanel;

public class Examples implements EntryPoint, ValueChangeHandler<String> {

	ExamplePanel examples = new ExamplePanel();

	@Override
	public void onModuleLoad() {
		RootPanel.get().add(examples, 0, 0);
		setUpHistoryManagement();
	}

	public void setUpHistoryManagement() {
		History.addValueChangeHandler(this);
		History.fireCurrentHistoryState();
	}

	@Override
	public void onValueChange(ValueChangeEvent<String> event) {
		String page = event.getValue().trim();
		if ((page == null) || (page.equals(""))) {
			examples.showInstructionsPanel();
		}

		else if (page.equals(HistoryTokens.CREATE)) {
			examples.showCreate();
		} else if (page.equals(HistoryTokens.EXTEND)) {
			examples.showExtend();
		} else if (page.equals(HistoryTokens.COMPOSITE)) {
			examples.showComposite();
		} else if (page.equals(HistoryTokens.LAYOUT)) {
			examples.showLayout();
		} else if (page.equals(HistoryTokens.SPLITLAYOUT)) {
			examples.showSplitLayout();
		} else if (page.equals(HistoryTokens.STACKLAYOUT)) {
			examples.showStackLayout();
		} else if (page.equals(HistoryTokens.DOCKLAYOUT)) {
			examples.showDockLayout();
		} else if (page.equals(HistoryTokens.ANIMATION)) {
			examples.showAnimationPanel();
		} else if (page.equals(HistoryTokens.SAFEHTML)) {
			examples.showSafeHtml();
		} else {
			examples.showInstructionsPanel();
		}
	}
}
