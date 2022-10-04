package com.ms.instagram.pages;

import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Main")
@Route(value = "")
public class MainPage extends AppLayout {
    public MainPage() {
        createHeader();
//        createDrawer();
    }

    private void createHeader() {
        System.out.println("Hello world");
        H1 logo = new H1("Instagram");
        logo.addClassNames("text-l", "m-m");
    }
}
