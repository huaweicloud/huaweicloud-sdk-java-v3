package com.huaweicloud.sdk.cse.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DubboMethod
 */
public class DubboMethod {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "serviceMethod")

    private String serviceMethod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "headersAttach")

    private String headersAttach;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "httpMethods")

    private List<String> httpMethods = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "httpPath")

    private String httpPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "params")

    private List<DubboMethodParam> params = null;

    public DubboMethod withServiceMethod(String serviceMethod) {
        this.serviceMethod = serviceMethod;
        return this;
    }

    /**
     * 服务方法。
     * @return serviceMethod
     */
    public String getServiceMethod() {
        return serviceMethod;
    }

    public void setServiceMethod(String serviceMethod) {
        this.serviceMethod = serviceMethod;
    }

    public DubboMethod withHeadersAttach(String headersAttach) {
        this.headersAttach = headersAttach;
        return this;
    }

    /**
     * 附加请求头。
     * @return headersAttach
     */
    public String getHeadersAttach() {
        return headersAttach;
    }

    public void setHeadersAttach(String headersAttach) {
        this.headersAttach = headersAttach;
    }

    public DubboMethod withHttpMethods(List<String> httpMethods) {
        this.httpMethods = httpMethods;
        return this;
    }

    public DubboMethod addHttpMethodsItem(String httpMethodsItem) {
        if (this.httpMethods == null) {
            this.httpMethods = new ArrayList<>();
        }
        this.httpMethods.add(httpMethodsItem);
        return this;
    }

    public DubboMethod withHttpMethods(Consumer<List<String>> httpMethodsSetter) {
        if (this.httpMethods == null) {
            this.httpMethods = new ArrayList<>();
        }
        httpMethodsSetter.accept(this.httpMethods);
        return this;
    }

    /**
     * http 方法。
     * @return httpMethods
     */
    public List<String> getHttpMethods() {
        return httpMethods;
    }

    public void setHttpMethods(List<String> httpMethods) {
        this.httpMethods = httpMethods;
    }

    public DubboMethod withHttpPath(String httpPath) {
        this.httpPath = httpPath;
        return this;
    }

    /**
     * http 路径。
     * @return httpPath
     */
    public String getHttpPath() {
        return httpPath;
    }

    public void setHttpPath(String httpPath) {
        this.httpPath = httpPath;
    }

    public DubboMethod withParams(List<DubboMethodParam> params) {
        this.params = params;
        return this;
    }

    public DubboMethod addParamsItem(DubboMethodParam paramsItem) {
        if (this.params == null) {
            this.params = new ArrayList<>();
        }
        this.params.add(paramsItem);
        return this;
    }

    public DubboMethod withParams(Consumer<List<DubboMethodParam>> paramsSetter) {
        if (this.params == null) {
            this.params = new ArrayList<>();
        }
        paramsSetter.accept(this.params);
        return this;
    }

    /**
     * dubbo 方法参数。
     * @return params
     */
    public List<DubboMethodParam> getParams() {
        return params;
    }

    public void setParams(List<DubboMethodParam> params) {
        this.params = params;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DubboMethod that = (DubboMethod) obj;
        return Objects.equals(this.serviceMethod, that.serviceMethod)
            && Objects.equals(this.headersAttach, that.headersAttach)
            && Objects.equals(this.httpMethods, that.httpMethods) && Objects.equals(this.httpPath, that.httpPath)
            && Objects.equals(this.params, that.params);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serviceMethod, headersAttach, httpMethods, httpPath, params);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DubboMethod {\n");
        sb.append("    serviceMethod: ").append(toIndentedString(serviceMethod)).append("\n");
        sb.append("    headersAttach: ").append(toIndentedString(headersAttach)).append("\n");
        sb.append("    httpMethods: ").append(toIndentedString(httpMethods)).append("\n");
        sb.append("    httpPath: ").append(toIndentedString(httpPath)).append("\n");
        sb.append("    params: ").append(toIndentedString(params)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
