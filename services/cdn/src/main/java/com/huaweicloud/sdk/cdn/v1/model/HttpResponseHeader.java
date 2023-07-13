package com.huaweicloud.sdk.cdn.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * http响应头设置
 */
public class HttpResponseHeader {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private String action;

    public HttpResponseHeader withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 设置HTTP响应头参数。取值：\"Content-Disposition\", \"Content-Language\", \"Access-Control-Allow-Origin\",\"Access-Control-Allow-Methods\", \"Access-Control-Max-Age\", \"Access-Control-Expose-Headers\"或自定义头部。格式要求：长度1~100，以字母开头，可以使用字母、数字和短横杠。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HttpResponseHeader withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * 设置HTTP响应头参数的值。自定义HTTP响应头参数长度范围1~256，支持字母、数字和特定字符（.-_*#!&+|^~'\"/:;,=@?<>）。
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public HttpResponseHeader withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * 设置http响应头操作类型，取值“set/delete”。set代表设置，delete代表删除。
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HttpResponseHeader that = (HttpResponseHeader) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.value, that.value)
            && Objects.equals(this.action, that.action);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, value, action);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HttpResponseHeader {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
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
