package com.huaweicloud.sdk.cse.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateBussinessSceneSpecMatches
 */
public class CreateBussinessSceneSpecMatches {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apiPath")

    private Object apiPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "headers")

    private Object headers;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "method")

    private List<String> method = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "serviceName")

    private String serviceName;

    public CreateBussinessSceneSpecMatches withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 条件名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateBussinessSceneSpecMatches withApiPath(Object apiPath) {
        this.apiPath = apiPath;
        return this;
    }

    /**
     * 匹配的PATH
     * @return apiPath
     */
    public Object getApiPath() {
        return apiPath;
    }

    public void setApiPath(Object apiPath) {
        this.apiPath = apiPath;
    }

    public CreateBussinessSceneSpecMatches withHeaders(Object headers) {
        this.headers = headers;
        return this;
    }

    /**
     * 匹配的Headers
     * @return headers
     */
    public Object getHeaders() {
        return headers;
    }

    public void setHeaders(Object headers) {
        this.headers = headers;
    }

    public CreateBussinessSceneSpecMatches withMethod(List<String> method) {
        this.method = method;
        return this;
    }

    public CreateBussinessSceneSpecMatches addMethodItem(String methodItem) {
        if (this.method == null) {
            this.method = new ArrayList<>();
        }
        this.method.add(methodItem);
        return this;
    }

    public CreateBussinessSceneSpecMatches withMethod(Consumer<List<String>> methodSetter) {
        if (this.method == null) {
            this.method = new ArrayList<>();
        }
        methodSetter.accept(this.method);
        return this;
    }

    /**
     * 匹配的Method列表
     * @return method
     */
    public List<String> getMethod() {
        return method;
    }

    public void setMethod(List<String> method) {
        this.method = method;
    }

    public CreateBussinessSceneSpecMatches withServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    /**
     * 匹配的微服务名称
     * @return serviceName
     */
    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateBussinessSceneSpecMatches that = (CreateBussinessSceneSpecMatches) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.apiPath, that.apiPath)
            && Objects.equals(this.headers, that.headers) && Objects.equals(this.method, that.method)
            && Objects.equals(this.serviceName, that.serviceName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, apiPath, headers, method, serviceName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateBussinessSceneSpecMatches {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    apiPath: ").append(toIndentedString(apiPath)).append("\n");
        sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
        sb.append("    method: ").append(toIndentedString(method)).append("\n");
        sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
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
