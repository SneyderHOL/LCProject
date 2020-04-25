package com.lacazuela.app.client.widget;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Widget;

public class Status extends Composite implements HasText {

	//private static StatusUiBinder uiBinder = GWT.create(StatusUiBinder.class);

	interface StatusUiBinder extends UiBinder<Widget, Status> {
	}
	
	private static UiBinder<Widget,Status> binder = GWT.create(StatusUiBinder.class);

	@UiField
	HTML html;
	
	public Status() {
		initWidget(binder.createAndBindUi(this));
	}

	public String getText() {
		return html.getText();
	}

	public void setText(String text) {
		html.setText(text);
	}

}
