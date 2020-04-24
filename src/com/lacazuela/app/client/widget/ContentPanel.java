package com.lacazuela.app.client.widget;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.ResizeComposite;
import com.google.gwt.user.client.ui.TabLayoutPanel;
import com.google.gwt.user.client.ui.Widget;

public class ContentPanel extends ResizeComposite {

	//private static ContentPanelUiBinder uiBinder = GWT.create(ContentPanelUiBinder.class);

	interface ContentPanelUiBinder extends UiBinder<Widget, ContentPanel> {
	}
	
	private static UiBinder<Widget, ContentPanel> binder = GWT.create(ContentPanelUiBinder.class);

	@UiField
	TabLayoutPanel tab;
	
	public ContentPanel() {
		initWidget(binder.createAndBindUi(this));
	}

	public void addTab(String text, Composite content) {
		tab.add(content, text);
		tab.selectTab(tab.getWidgetCount() - 1);
	}
}
