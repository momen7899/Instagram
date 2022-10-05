package com.ms.instagram.pages;

import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.applayout.DrawerToggle;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouterLink;

@PageTitle("Instagram")
@Route(value = "")
public class MainPage extends AppLayout {
    public MainPage() {
        createHeader();
        createDrawer();
    }

    private void createHeader() {
        DrawerToggle toggle = new DrawerToggle();

        H1 title = new H1("Instagram");
        title.getStyle()
                .set("font-size", "var(--lumo-font-size-l)")
                .set("margin", "0");


        addToNavbar(toggle, title);

        setPrimarySection(Section.DRAWER);
    }

    private void createDrawer() {
        addToDrawer(new VerticalLayout(
                new RouterLink("Main", PostListPage.class),
                new RouterLink("Create Post", CreatePostPage.class),
                new RouterLink("Profile", ProfilePage.class)
        ));
    }
}
