package com.callumr.mw.views.explanation;

import com.callumr.mw.views.MainLayout;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Explanation")
@Route(value = "explanation", layout = MainLayout.class)
@Uses(Icon.class)
public class ExplanationView extends Composite<VerticalLayout> {

    public ExplanationView() {
        Paragraph textLarge = new Paragraph();
        Paragraph textLarge2 = new Paragraph();
        Paragraph textLarge3 = new Paragraph();
        Paragraph textLarge4 = new Paragraph();
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        textLarge.setText(
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.");
        textLarge.setWidth("100%");
        textLarge.getStyle().set("font-size", "var(--lumo-font-size-xl)");
        textLarge2.setText(
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.");
        textLarge2.setWidth("100%");
        textLarge2.getStyle().set("font-size", "var(--lumo-font-size-xl)");
        textLarge3.setText(
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.");
        textLarge3.setWidth("100%");
        textLarge3.getStyle().set("font-size", "var(--lumo-font-size-xl)");
        textLarge4.setText(
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.");
        textLarge4.setWidth("100%");
        textLarge4.getStyle().set("font-size", "var(--lumo-font-size-xl)");
        getContent().add(textLarge);
        getContent().add(textLarge2);
        getContent().add(textLarge3);
        getContent().add(textLarge4);
    }
}
