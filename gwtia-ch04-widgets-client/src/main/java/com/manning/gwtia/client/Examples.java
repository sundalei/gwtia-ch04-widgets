package com.manning.gwtia.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;

public class Examples implements EntryPoint, ValueChangeHandler<String> {

    @Override
    public void onModuleLoad() {
        RootPanel.get().add(new Label("hello"));
    }

    @Override
    public void onValueChange(ValueChangeEvent<String> event) {

    }
}
