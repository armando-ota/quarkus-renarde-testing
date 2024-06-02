package org.dropchop.testing.components;

import io.quarkiverse.renarde.Controller;
import io.quarkus.qute.CheckedTemplate;
import io.quarkus.qute.TemplateInstance;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

public class Component2 extends Controller {

  @CheckedTemplate
  static class Templates {
    public static native TemplateInstance index();
  }

  @GET
  public TemplateInstance index() {
    return Component2.Templates.index();
  }

}
