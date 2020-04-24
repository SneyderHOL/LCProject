package com.lacazuela.app.client.content;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ResizeComposite;
import com.google.gwt.user.client.ui.Widget;
import com.lacazuela.app.client.widget.ContentPanel;
import com.lacazuela.app.client.widget.MenuBar;

public class LaCazuelaShell extends ResizeComposite {

	//private static CazuelaShellUiBinder uiBinder = GWT.create(CazuelaShellUiBinder.class);

	interface CazuelaShellUiBinder extends UiBinder<Widget, LaCazuelaShell> {
	}
	
	private static UiBinder<Widget, LaCazuelaShell> binder = GWT.create(CazuelaShellUiBinder.class);

	@UiField
	Label logoLabel;
	
	@UiField
	MenuBar menuBar;
	
	@UiField
	ContentPanel contentPanel;

	public LaCazuelaShell() {
		initWidget(binder.createAndBindUi(this));
		if (!GWT.isProdMode()) {
			contentPanel.addTab("Home", new LogTab());
		}
	}
	
}
