package com.callumr.mw.views.information;

import com.callumr.mw.views.MainLayout;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import java.util.ArrayList;
import java.util.List;

@PageTitle("Information")
@Route(value = "information", layout = MainLayout.class)
@Uses(Icon.class)
public class InformationView extends Composite<VerticalLayout> {

    public InformationView() {
        ComboBox comboBox = new ComboBox();
        H1 h1 = new H1();
        H1 h12 = new H1();
        H1 h13 = new H1();
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        comboBox.setLabel("Select Core Node");
        comboBox.setWidth("100%");
        setComboBoxSampleData(comboBox);
        h1.setText("Heading");
        h1.setWidth("max-content");
        h12.setText("Heading");
        h12.setWidth("max-content");
        h13.setText("Heading");
        h13.setWidth("max-content");
        getContent().add(comboBox);
        getContent().add(h1);
        getContent().add(h12);
        getContent().add(h13);
    }

    record SampleItem(String value, String label, Boolean disabled) {
    }

    private void setComboBoxSampleData(ComboBox comboBox) {
        List<SampleItem> sampleItems = new ArrayList<>();
        sampleItems.add(new SampleItem("first", "First", null));
        sampleItems.add(new SampleItem("second", "Second", null));
        sampleItems.add(new SampleItem("third", "Third", Boolean.TRUE));
        sampleItems.add(new SampleItem("fourth", "Fourth", null));
        comboBox.setItems(sampleItems);
        comboBox.setItemLabelGenerator(item -> ((SampleItem) item).label());
    }
}
