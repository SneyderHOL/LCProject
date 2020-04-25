package com.lacazuela.app.client.widget;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.ResizeComposite;
import com.google.gwt.user.client.ui.Widget;

public class MenuBar extends ResizeComposite {

	interface MenuBarUiBinder extends UiBinder<Widget, MenuBar> {
	}

	private static MenuBarUiBinder uiBinder = GWT.create(MenuBarUiBinder.class);
	
	//private static UiBinder<Widget, MenuBar> binder = GWT.create(MenuBarUiBinder.class);
	
	public MenuBar() {
		initWidget(uiBinder.createAndBindUi(this));
	}

}
