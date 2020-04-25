package com.lacazuela.app.client.content;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ResizeComposite;
import com.google.gwt.user.client.ui.Widget;
import com.lacazuela.app.client.event.EventBus;
import com.lacazuela.app.client.event.StatusEvent;
import com.lacazuela.app.client.event.StatusEvent.StatusHandler;
import com.lacazuela.app.client.widget.ContentPanel;
import com.lacazuela.app.client.widget.MenuBar;
import com.lacazuela.app.client.widget.Status;

public class LaCazuelaShell extends ResizeComposite implements StatusHandler{

	interface CazuelaShellUiBinder extends UiBinder<Widget, LaCazuelaShell> {
	}
	
	private static CazuelaShellUiBinder uiBinder = GWT.create(CazuelaShellUiBinder.class);

	//private static UiBinder<Widget, LaCazuelaShell> binder = GWT.create(CazuelaShellUiBinder.class);

	@UiField
	Label logoLabel;
	
	@UiField
	MenuBar menuBar;
	
	@UiField
	ContentPanel contentPanel;
	
	@UiField
	Status status;

	public LaCazuelaShell() {
		initWidget(uiBinder.createAndBindUi(this));
		contentPanel.addTab("Home", new LogTab());
		/*if (!GWT.isProdMode()) {
			contentPanel.addTab("Home", new LogTab());
		}*/
		EventBus.get().addHandler(StatusEvent.TYPE, this);
		EventBus.get().fireEvent(new StatusEvent("message"));
		
	}
	
	@Override
	public void onStatusChange(StatusEvent event) {
		status.setText(event.getStatus());
	}
	
}
