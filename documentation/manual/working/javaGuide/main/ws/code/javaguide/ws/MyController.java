/*
 * Copyright (C) Lightbend Inc. <https://www.lightbend.com>
 */

package javaguide.ws;

// #ws-streams-controller
import javax.inject.Inject;

import akka.stream.Materializer;
import akka.stream.javadsl.*;
import akka.util.ByteString;

import play.mvc.*;
import play.libs.ws.*;

import scala.jdk.javaapi.FutureConverters;

public class MyController extends Controller {

  @Inject WSClient ws;
  @Inject Materializer materializer;

  // ...
}
// #ws-streams-controller
