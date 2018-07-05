package org.app.view;

import javax.annotation.PostConstruct;

import com.vaadin.cdi.CDIView;
import com.vaadin.cdi.UIScoped;
import com.vaadin.navigator.View;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.VerticalSplitPanel;

@SuppressWarnings("serial")
@CDIView(I18n.HELP_VIEW)
@UIScoped
public class HelpView extends VerticalLayout implements View {
	
	public HelpView() {
	}

	@PostConstruct
	void init() {
		setSizeFull();
		setWidth("800px");

		VerticalSplitPanel vsplit = new VerticalSplitPanel();

		VerticalLayout contentA = new VerticalLayout();
		contentA.addComponent(new Label("Hello Top"));
		contentA.setDefaultComponentAlignment(Alignment.TOP_CENTER);

		VerticalLayout contentB = new VerticalLayout();
		contentB.addComponent(new Label("Hello Bottom 1"));
		contentB.addComponent(new Label("Hello Bottom 2"));
		contentB.setDefaultComponentAlignment(Alignment.TOP_CENTER);

		vsplit.setFirstComponent(contentA);
		vsplit.setSecondComponent(contentB);

		vsplit.setSplitPosition(75f, Unit.PERCENTAGE);
		vsplit.setSizeFull();

		addComponent(vsplit);
		setDefaultComponentAlignment(Alignment.TOP_CENTER);
	}
}