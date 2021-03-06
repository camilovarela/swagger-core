package com.wordnik.swagger.models.properties;

import com.wordnik.swagger.models.Xml;

public class ArrayProperty extends AbstractProperty implements Property {
  public static final String TYPE = "array";
  protected Boolean uniqueItems;
  protected Property items;

  public ArrayProperty() {
    super.type = TYPE;
  }

  public ArrayProperty(Property items) {
    super.type = TYPE;
    setItems(items);
  }

  public ArrayProperty xml(Xml xml) {
    this.setXml(xml);
    return this;
  }

  public ArrayProperty uniqueItems() {
    this.setUniqueItems(true);
    return this;
  }

  public ArrayProperty description(String description) {
    this.setDescription(description);
    return this;
  }

  public ArrayProperty items(Property items) {
    setItems(items);
    return this;
  }

  public Property getItems() {
    return items;
  }

  public void setItems(Property items) {
    this.items = items;
  }

  public Boolean getUniqueItems() {
    return uniqueItems;
  }

  public void setUniqueItems(Boolean uniqueItems) {
    this.uniqueItems = uniqueItems ? true : null;
  }

  public static boolean isType(String type) {
    return TYPE.equals(type);
  }

  @Override
  public int hashCode() {
  	final int prime = 31;
  	int result = 1;
  	result = prime * result + ((items == null) ? 0 : items.hashCode());
  	result = prime * result
  			+ ((uniqueItems == null) ? 0 : uniqueItems.hashCode());
  	return result;
  }

  @Override
  public boolean equals(Object obj) {
  	if (this == obj)
  		return true;
  	if (obj == null)
  		return false;
  	if (getClass() != obj.getClass())
  		return false;
  	ArrayProperty other = (ArrayProperty) obj;
  	if (items == null) {
  		if (other.items != null)
  			return false;
  	} else if (!items.equals(other.items))
  		return false;
  	if (uniqueItems == null) {
  		if (other.uniqueItems != null)
  			return false;
  	} else if (!uniqueItems.equals(other.uniqueItems))
  		return false;
  	return true;
  }
}