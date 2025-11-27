package com.huaweicloud.sdk.ucs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteProxyUnitedWorkloadRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clustergroupid")

    private String clustergroupid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kind")

    private String kind;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    private String namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    public DeleteProxyUnitedWorkloadRequest withClustergroupid(String clustergroupid) {
        this.clustergroupid = clustergroupid;
        return this;
    }

    /**
     * 容器舰队id
     * @return clustergroupid
     */
    public String getClustergroupid() {
        return clustergroupid;
    }

    public void setClustergroupid(String clustergroupid) {
        this.clustergroupid = clustergroupid;
    }

    public DeleteProxyUnitedWorkloadRequest withKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * 工作负载的类型
     * @return kind
     */
    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public DeleteProxyUnitedWorkloadRequest withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * 命名空间
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public DeleteProxyUnitedWorkloadRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 工作负载的名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteProxyUnitedWorkloadRequest that = (DeleteProxyUnitedWorkloadRequest) obj;
        return Objects.equals(this.clustergroupid, that.clustergroupid) && Objects.equals(this.kind, that.kind)
            && Objects.equals(this.namespace, that.namespace) && Objects.equals(this.name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clustergroupid, kind, namespace, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteProxyUnitedWorkloadRequest {\n");
        sb.append("    clustergroupid: ").append(toIndentedString(clustergroupid)).append("\n");
        sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
