package com.ms.instagram.pages;

import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Instagram . Profile")
@Route(value = "/profile", layout = MainPage.class)
public class ProfilePage extends AppLayout {
}
