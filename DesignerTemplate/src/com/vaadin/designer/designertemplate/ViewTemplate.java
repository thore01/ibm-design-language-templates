package com.vaadin.designer.designertemplate;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.annotations.DesignRoot;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.NativeButton;
import com.vaadin.ui.Panel;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.declarative.Design;

/** 
 * !! DO NOT EDIT THIS FILE !!
 * 
 * This class is generated by Vaadin Designer and will be overwritten.
 * 
 * Please make a subclass with logic and additional interfaces as needed,
 * e.g class LoginView extends LoginDesign implements View { … }
 */
@DesignRoot
@AutoGenerated
@SuppressWarnings("serial")
public class ViewTemplate extends VerticalLayout {
    protected CssLayout header_bar;
    protected NativeButton user_menu;
    protected Label user_name_label;
    protected TextField search_field;
    protected HorizontalLayout main_area;
    protected CssLayout side_bar;
    protected NativeButton menuButton1;
    protected NativeButton menuButton2;
    protected NativeButton menuButton4;
    protected Panel scroll_panel;
    protected CssLayout content_layout;
    protected Label billing_header_label;
    protected CssLayout main_content_wrapper;
    protected FormLayout billing_form;
    protected Label email_header_label;
    protected TextField email_field;
    protected Label address_label;
    protected HorizontalLayout name_wrapper;
    protected TextField firstname_field;
    protected TextField lastname_field;
    protected TextField address_field;
    protected TextField company_field;
    protected TextField city_field;
    protected HorizontalLayout name_wrapper2;
    protected TextField state_field;
    protected TextField zip_field;
    protected TextField country_field;
    protected TextField phone_field;
    protected FormLayout order_summary_layout;
    protected Label order_heading;
    protected CssLayout order_item;
    protected Label order_label;
    protected NativeButton cancel_order_button;
    protected Label tax_sum;
    protected Label total_sum;

    public ViewTemplate() {
        Design.read(this);
    }
}
