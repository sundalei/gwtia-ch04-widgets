package com.manning.gwtia.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.shared.GWT;
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
    	GWT.log("page is " + page);
    	
    	if((page == null) || (page.equals(""))) {
    		//showHomePage
    		
    	}
    }
}
