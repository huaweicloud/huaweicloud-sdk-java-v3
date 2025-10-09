package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteReleaseRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    private String namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "show_resources")

    private String showResources;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    public DeleteReleaseRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 模板实例名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DeleteReleaseRequest withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * 模板实例所在的命名空间
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public DeleteReleaseRequest withShowResources(String showResources) {
        this.showResources = showResources;
        return this;
    }

    /**
     * **参数解释：** 是否展示模板实例的资源信息。 **约束限制：** 不涉及 **取值范围：** 指定为“true”时展示模板实例的资源信息，不指定该参数时默认不展示。 **默认取值：** 无
     * @return showResources
     */
    public String getShowResources() {
        return showResources;
    }

    public void setShowResources(String showResources) {
        this.showResources = showResources;
    }

    public DeleteReleaseRequest withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * 集群ID，获取方式请参见[如何获取接口URI中参数](cce_02_0271.xml)。
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteReleaseRequest that = (DeleteReleaseRequest) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.namespace, that.namespace)
            && Objects.equals(this.showResources, that.showResources) && Objects.equals(this.clusterId, that.clusterId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, namespace, showResources, clusterId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteReleaseRequest {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    showResources: ").append(toIndentedString(showResources)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
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
