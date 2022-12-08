package org.acme;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/halloWorld")
public class Endpoint {

  @GET
  public String hello() {

    return "Hello, World!";
  }
}