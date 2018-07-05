package org.app.view;

import com.vaadin.ui.Button;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.UI;

@SuppressWarnings("serial")
public class TopMainMenu extends CustomComponent {

	public TopMainMenu() {
		HorizontalLayout layout = new HorizontalLayout();

		layout.addComponent(accountViewButton);
		layout.addComponent(helpViewButton);

		setCompositionRoot(layout);
	}

	Button accountViewButton = new Button("Accounts",
			e -> UI.getCurrent().getNavigator().navigateTo(I18n.ACCOUNT_VIEW));

	Button helpViewButton = new Button("Help", e -> {
		UI.getCurrent().getNavigator().navigateTo(I18n.HELP_VIEW);
	});

}
