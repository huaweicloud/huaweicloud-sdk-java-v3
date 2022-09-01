package com.huaweicloud.sdk.swr.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListNamespacesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    @JacksonXmlProperty(localName = "namespace")

    private String namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filter")

    @JacksonXmlProperty(localName = "filter")

    private String filter;

    public ListNamespacesRequest withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * 组织名称。小写字母开头，后面跟小写字母、数字、小数点、下划线或中划线（其中下划线最多允许连续两个，小数点、下划线、中划线不能直接相连），小写字母或数字结尾，1-64个字符。
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public ListNamespacesRequest withFilter(String filter) {
        this.filter = filter;
        return this;
    }

    /**
     * 应填写namespace::{namespace}|mode::{mode}。其中{namespace}是组织名称，{mode}如果不设置，查看有权限的组织列表；设置为visible，查看可见的组织列表（部分组织：仓库有权限，组织没有权限）。
     * @return filter
     */
    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListNamespacesRequest listNamespacesRequest = (ListNamespacesRequest) o;
        return Objects.equals(this.namespace, listNamespacesRequest.namespace)
            && Objects.equals(this.filter, listNamespacesRequest.filter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(namespace, filter);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListNamespacesRequest {\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
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
