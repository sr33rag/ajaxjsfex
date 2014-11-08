package net.codesree.common;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import java.io.Serializable;

@ManagedBean
@SessionScoped
public class HelloBean implements Serializable {

  private String name;
  
  public String getName() { return this.name; }
  public void setName(String _name) { this.name=_name; }
  
  public String getSayWelcome() {
    if("".equals(name)||name==null)
      return "";
    else 
      return "Ajax message: Welcome "+name;    
  }

}
