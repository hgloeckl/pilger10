package org.app.view;

import javax.annotation.PostConstruct;

import com.vaadin.cdi.CDIView;
import com.vaadin.navigator.View;
import com.vaadin.ui.Label;
import com.vaadin.ui.Panel;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.VerticalSplitPanel;

@SuppressWarnings("serial")
@CDIView(I18n.ACCOUNT_VIEW)
public class AccountView extends VerticalLayout implements View {

	@PostConstruct
	void init() {
		setSizeFull();
		setWidth("800px");

		Panel panel = new Panel("Account: Split Panels inside this Panel");
		panel.setSizeFull();

		VerticalSplitPanel vsplit = new VerticalSplitPanel();
		vsplit.setSplitPosition(75f, Unit.PERCENTAGE);
		vsplit.setSizeFull();

		VerticalLayout contentA = new VerticalLayout();
		contentA.addComponent(new Label("Hello Top"));

		VerticalLayout contentB = new VerticalLayout();
		contentB.addComponent(new Label("Hello Bottom 1"));
		contentB.addComponent(new Label("Hello Bottom 2"));

		vsplit.setFirstComponent(contentA);
		vsplit.setSecondComponent(contentB);

		panel.setContent(vsplit);
		panel.setSizeFull();

		addComponent(panel);

	}
}
