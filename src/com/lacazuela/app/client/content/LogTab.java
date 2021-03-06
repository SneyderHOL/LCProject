package com.lacazuela.app.client.content;

import java.util.logging.Logger;

import com.google.gwt.core.client.GWT;
import com.google.gwt.logging.client.HasWidgetsLogHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

public class LogTab extends Composite {

	private static final Logger log = Logger.getLogger("");
	
	interface LogTabUiBinder extends UiBinder<Widget, LogTab> {
	}
	
	private static LogTabUiBinder uiBinder = GWT.create(LogTabUiBinder.class);
	
	//private static UiBinder<Widget, LogTab> binder = GWT.create(LogTabUiBinder.class);

	@UiField
	VerticalPanel logArea;
	
	public LogTab() {
		initWidget(uiBinder.createAndBindUi(this));
		log.addHandler(new HasWidgetsLogHandler(logArea));
	}

}
