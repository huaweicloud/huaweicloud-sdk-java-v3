package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Ignore
 */
public class Ignore {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "method")

    @JacksonXmlProperty(localName = "method")

    private String method;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    @JacksonXmlProperty(localName = "path")

    private String path;

    public Ignore withMethod(String method) {
        this.method = method;
        return this;
    }

    /**
     * API请求方法
     * @return method
     */
    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public Ignore withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * API请求路径
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Ignore ignore = (Ignore) o;
        return Objects.equals(this.method, ignore.method) && Objects.equals(this.path, ignore.path);
    }

    @Override
    public int hashCode() {
        return Objects.hash(method, path);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Ignore {\n");
        sb.append("    method: ").append(toIndentedString(method)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
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
