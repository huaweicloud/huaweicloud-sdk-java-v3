package com.huaweicloud.sdk.swr.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListNamespacesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespaces")

    @JacksonXmlProperty(localName = "namespaces")

    private List<ShowNamespace> namespaces = null;

    public ListNamespacesResponse withNamespaces(List<ShowNamespace> namespaces) {
        this.namespaces = namespaces;
        return this;
    }

    public ListNamespacesResponse addNamespacesItem(ShowNamespace namespacesItem) {
        if (this.namespaces == null) {
            this.namespaces = new ArrayList<>();
        }
        this.namespaces.add(namespacesItem);
        return this;
    }

    public ListNamespacesResponse withNamespaces(Consumer<List<ShowNamespace>> namespacesSetter) {
        if (this.namespaces == null) {
            this.namespaces = new ArrayList<>();
        }
        namespacesSetter.accept(this.namespaces);
        return this;
    }

    /**
     * 组织列表
     * @return namespaces
     */
    public List<ShowNamespace> getNamespaces() {
        return namespaces;
    }

    public void setNamespaces(List<ShowNamespace> namespaces) {
        this.namespaces = namespaces;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListNamespacesResponse listNamespacesResponse = (ListNamespacesResponse) o;
        return Objects.equals(this.namespaces, listNamespacesResponse.namespaces);
    }

    @Override
    public int hashCode() {
        return Objects.hash(namespaces);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListNamespacesResponse {\n");
        sb.append("    namespaces: ").append(toIndentedString(namespaces)).append("\n");
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
