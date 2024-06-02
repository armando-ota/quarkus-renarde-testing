package org.dropchop.testing.pages;

import io.quarkiverse.renarde.Controller;
import io.quarkus.qute.CheckedTemplate;
import io.quarkus.qute.TemplateInstance;
import jakarta.ws.rs.Path;

import java.util.List;

public class Home extends Controller {

  @CheckedTemplate
  static class Templates {
    public static native TemplateInstance index(List<String> names);
  }

  @Path("/")
  public TemplateInstance index() {
    List<String> names = List.of("Component1/index","Component2/index","Component3/index");
    return Templates.index(names);
  }

}
