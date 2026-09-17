package com.huaweicloud.sdk.iotedge.v3.model;

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
public class ListClusterNamespacesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespaces")

    private List<QueryNamespaceResp> namespaces = null;

    public ListClusterNamespacesResponse withNamespaces(List<QueryNamespaceResp> namespaces) {
        this.namespaces = namespaces;
        return this;
    }

    public ListClusterNamespacesResponse addNamespacesItem(QueryNamespaceResp namespacesItem) {
        if (this.namespaces == null) {
            this.namespaces = new ArrayList<>();
        }
        this.namespaces.add(namespacesItem);
        return this;
    }

    public ListClusterNamespacesResponse withNamespaces(Consumer<List<QueryNamespaceResp>> namespacesSetter) {
        if (this.namespaces == null) {
            this.namespaces = new ArrayList<>();
        }
        namespacesSetter.accept(this.namespaces);
        return this;
    }

    /**
     * 集群命名空间列表
     * @return namespaces
     */
    public List<QueryNamespaceResp> getNamespaces() {
        return namespaces;
    }

    public void setNamespaces(List<QueryNamespaceResp> namespaces) {
        this.namespaces = namespaces;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListClusterNamespacesResponse that = (ListClusterNamespacesResponse) obj;
        return Objects.equals(this.namespaces, that.namespaces);
    }

    @Override
    public int hashCode() {
        return Objects.hash(namespaces);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListClusterNamespacesResponse {\n");
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
