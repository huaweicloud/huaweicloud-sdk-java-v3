package com.huaweicloud.sdk.swr.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListInstanceNamespacesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespaces")

    private List<Namespace> namespaces = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public ListInstanceNamespacesResponse withNamespaces(List<Namespace> namespaces) {
        this.namespaces = namespaces;
        return this;
    }

    public ListInstanceNamespacesResponse addNamespacesItem(Namespace namespacesItem) {
        if (this.namespaces == null) {
            this.namespaces = new ArrayList<>();
        }
        this.namespaces.add(namespacesItem);
        return this;
    }

    public ListInstanceNamespacesResponse withNamespaces(Consumer<List<Namespace>> namespacesSetter) {
        if (this.namespaces == null) {
            this.namespaces = new ArrayList<>();
        }
        namespacesSetter.accept(this.namespaces);
        return this;
    }

    /**
     * 命名空间列表
     * @return namespaces
     */
    public List<Namespace> getNamespaces() {
        return namespaces;
    }

    public void setNamespaces(List<Namespace> namespaces) {
        this.namespaces = namespaces;
    }

    public ListInstanceNamespacesResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 命名空间总数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListInstanceNamespacesResponse that = (ListInstanceNamespacesResponse) obj;
        return Objects.equals(this.namespaces, that.namespaces) && Objects.equals(this.total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(namespaces, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInstanceNamespacesResponse {\n");
        sb.append("    namespaces: ").append(toIndentedString(namespaces)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
