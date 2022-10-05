package com.ms.instagram.pages;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Instagram")
@Route(value = "/home", layout = MainPage.class)
public class PostListPage extends VerticalLayout {

    PostListPage() {
        setDefaultHorizontalComponentAlignment(Alignment.CENTER);
        add(new Text("Sample "));
        add(new Button("Example"));
    }
}
