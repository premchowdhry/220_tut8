package Q1;

import static Q1.HttpRequest.Method.GET;
import static Q1.HttpRequest.Method.POST;

import Q1.HttpRequest.Method;
import java.util.Collections;
import java.util.List;

public class HttpRequestBuilder {

  private String url;
  private String body;
  private List<String> params;
  private Method method;
  private List<String> headers;

  private HttpRequestBuilder() {
  }

  public static HttpRequestBuilder makeHttpRequest() {
    return new HttpRequestBuilder();
  }

  public HttpRequest build() {
    return new HttpRequest(url, method, params, headers, body);
  }

  public HttpRequestBuilder withUrl(String url) {
    this.url = url;
    return this;
  }

  public HttpRequestBuilder withBody(String body) {
    this.body = body;
    return this;
  }

  public HttpRequestBuilder withParams(List<String> params) {
    this.params = params;
    return this;
  }

  public HttpRequestBuilder withMethod(Method method) {
    this.method = method;
    return this;
  }

  public HttpRequestBuilder withHeaders(List<String> headers) {
    this.headers = headers;
    return this;
  }

}
