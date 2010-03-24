/*
 * Copyright 2010 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.google.gwt.sample.expenses.client;

import com.google.gwt.app.client.ListBoxPlacePickerView;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.DivElement;
import com.google.gwt.sample.expenses.client.place.EntityListPlace;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;

/**
 * The outermost UI for the scaffold app.
 */
public class ExpensesScaffoldShell extends Composite {
  interface Binder extends UiBinder<Widget, ExpensesScaffoldShell> {
  }
  private static final Binder BINDER = GWT.create(Binder.class);
  
  @UiField SimplePanel body;
  @UiField ListBoxPlacePickerView<EntityListPlace> placesBox;
  @UiField DivElement error;
  
  public ExpensesScaffoldShell() {
    initWidget(BINDER.createAndBindUi(this));
  }

  /**
   * @return the body
   */
  public SimplePanel getBody() {
    return body;
  }
  
  /**
   * @return the banner
   */
  public ListBoxPlacePickerView<EntityListPlace> getPlacesBox() {
    return placesBox;
  }

  /**
   * @param string
   */
  public void setError(String string) {
    error.setInnerText(string);
  }
}
