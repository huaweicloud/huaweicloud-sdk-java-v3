package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 文件风险路径信息
 */
public class ListIacFileRiskPathsResponseInfoDataList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_name")

    private String resourceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private String resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    private String namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hit_rule")

    private String hitRule;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hit_path")

    private String hitPath;

    public ListIacFileRiskPathsResponseInfoDataList withResourceName(String resourceName) {
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

    public ListIacFileRiskPathsResponseInfoDataList withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * 资源类型
     * @return resourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public ListIacFileRiskPathsResponseInfoDataList withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * 资源所属的命名空间
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public ListIacFileRiskPathsResponseInfoDataList withHitRule(String hitRule) {
        this.hitRule = hitRule;
        return this;
    }

    /**
     * 风险命中的规则
     * @return hitRule
     */
    public String getHitRule() {
        return hitRule;
    }

    public void setHitRule(String hitRule) {
        this.hitRule = hitRule;
    }

    public ListIacFileRiskPathsResponseInfoDataList withHitPath(String hitPath) {
        this.hitPath = hitPath;
        return this;
    }

    /**
     * 存在风险的路径
     * @return hitPath
     */
    public String getHitPath() {
        return hitPath;
    }

    public void setHitPath(String hitPath) {
        this.hitPath = hitPath;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListIacFileRiskPathsResponseInfoDataList that = (ListIacFileRiskPathsResponseInfoDataList) obj;
        return Objects.equals(this.resourceName, that.resourceName)
            && Objects.equals(this.resourceType, that.resourceType) && Objects.equals(this.namespace, that.namespace)
            && Objects.equals(this.hitRule, that.hitRule) && Objects.equals(this.hitPath, that.hitPath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceName, resourceType, namespace, hitRule, hitPath);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListIacFileRiskPathsResponseInfoDataList {\n");
        sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    hitRule: ").append(toIndentedString(hitRule)).append("\n");
        sb.append("    hitPath: ").append(toIndentedString(hitPath)).append("\n");
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
