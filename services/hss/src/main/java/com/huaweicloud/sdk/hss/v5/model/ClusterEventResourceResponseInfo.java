package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 事件资源信息
 */
public class ClusterEventResourceResponseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enforcement_action")

    private String enforcementAction;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group")

    private String group;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    private String namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kind")

    private String kind;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_name")

    private String resourceName;

    public ClusterEventResourceResponseInfo withEnforcementAction(String enforcementAction) {
        this.enforcementAction = enforcementAction;
        return this;
    }

    /**
     * 执行动作
     * @return enforcementAction
     */
    public String getEnforcementAction() {
        return enforcementAction;
    }

    public void setEnforcementAction(String enforcementAction) {
        this.enforcementAction = enforcementAction;
    }

    public ClusterEventResourceResponseInfo withGroup(String group) {
        this.group = group;
        return this;
    }

    /**
     * Group
     * @return group
     */
    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public ClusterEventResourceResponseInfo withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 信息
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ClusterEventResourceResponseInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ClusterEventResourceResponseInfo withNamespace(String namespace) {
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

    public ClusterEventResourceResponseInfo withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 版本
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ClusterEventResourceResponseInfo withKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * 资源类型
     * @return kind
     */
    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public ClusterEventResourceResponseInfo withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * 资源名称
     * @return resourceName
     */
    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ClusterEventResourceResponseInfo that = (ClusterEventResourceResponseInfo) obj;
        return Objects.equals(this.enforcementAction, that.enforcementAction) && Objects.equals(this.group, that.group)
            && Objects.equals(this.message, that.message) && Objects.equals(this.name, that.name)
            && Objects.equals(this.namespace, that.namespace) && Objects.equals(this.version, that.version)
            && Objects.equals(this.kind, that.kind) && Objects.equals(this.resourceName, that.resourceName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enforcementAction, group, message, name, namespace, version, kind, resourceName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClusterEventResourceResponseInfo {\n");
        sb.append("    enforcementAction: ").append(toIndentedString(enforcementAction)).append("\n");
        sb.append("    group: ").append(toIndentedString(group)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
        sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
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
