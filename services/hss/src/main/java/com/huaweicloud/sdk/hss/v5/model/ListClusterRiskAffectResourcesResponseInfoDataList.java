package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 集群风险影响的资源信息
 */
public class ListClusterRiskAffectResourcesResponseInfoDataList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_name")

    private String resourceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

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
    @JsonProperty(value = "hit_path_list")

    private List<String> hitPathList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "first_scan_time")

    private Long firstScanTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_scan_time")

    private Long lastScanTime;

    public ListClusterRiskAffectResourcesResponseInfoDataList withResourceName(String resourceName) {
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

    public ListClusterRiskAffectResourcesResponseInfoDataList withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 资源id
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public ListClusterRiskAffectResourcesResponseInfoDataList withResourceType(String resourceType) {
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

    public ListClusterRiskAffectResourcesResponseInfoDataList withNamespace(String namespace) {
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

    public ListClusterRiskAffectResourcesResponseInfoDataList withHitRule(String hitRule) {
        this.hitRule = hitRule;
        return this;
    }

    /**
     * 资源被检测出风险的命中规则
     * @return hitRule
     */
    public String getHitRule() {
        return hitRule;
    }

    public void setHitRule(String hitRule) {
        this.hitRule = hitRule;
    }

    public ListClusterRiskAffectResourcesResponseInfoDataList withHitPathList(List<String> hitPathList) {
        this.hitPathList = hitPathList;
        return this;
    }

    public ListClusterRiskAffectResourcesResponseInfoDataList addHitPathListItem(String hitPathListItem) {
        if (this.hitPathList == null) {
            this.hitPathList = new ArrayList<>();
        }
        this.hitPathList.add(hitPathListItem);
        return this;
    }

    public ListClusterRiskAffectResourcesResponseInfoDataList withHitPathList(
        Consumer<List<String>> hitPathListSetter) {
        if (this.hitPathList == null) {
            this.hitPathList = new ArrayList<>();
        }
        hitPathListSetter.accept(this.hitPathList);
        return this;
    }

    /**
     * 资源存在风险的路径列表
     * @return hitPathList
     */
    public List<String> getHitPathList() {
        return hitPathList;
    }

    public void setHitPathList(List<String> hitPathList) {
        this.hitPathList = hitPathList;
    }

    public ListClusterRiskAffectResourcesResponseInfoDataList withFirstScanTime(Long firstScanTime) {
        this.firstScanTime = firstScanTime;
        return this;
    }

    /**
     * 首次扫描时间
     * minimum: 0
     * maximum: 9223372036854775807
     * @return firstScanTime
     */
    public Long getFirstScanTime() {
        return firstScanTime;
    }

    public void setFirstScanTime(Long firstScanTime) {
        this.firstScanTime = firstScanTime;
    }

    public ListClusterRiskAffectResourcesResponseInfoDataList withLastScanTime(Long lastScanTime) {
        this.lastScanTime = lastScanTime;
        return this;
    }

    /**
     * 最近扫描时间
     * minimum: 0
     * maximum: 9223372036854775807
     * @return lastScanTime
     */
    public Long getLastScanTime() {
        return lastScanTime;
    }

    public void setLastScanTime(Long lastScanTime) {
        this.lastScanTime = lastScanTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListClusterRiskAffectResourcesResponseInfoDataList that =
            (ListClusterRiskAffectResourcesResponseInfoDataList) obj;
        return Objects.equals(this.resourceName, that.resourceName) && Objects.equals(this.resourceId, that.resourceId)
            && Objects.equals(this.resourceType, that.resourceType) && Objects.equals(this.namespace, that.namespace)
            && Objects.equals(this.hitRule, that.hitRule) && Objects.equals(this.hitPathList, that.hitPathList)
            && Objects.equals(this.firstScanTime, that.firstScanTime)
            && Objects.equals(this.lastScanTime, that.lastScanTime);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(resourceName, resourceId, resourceType, namespace, hitRule, hitPathList, firstScanTime, lastScanTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListClusterRiskAffectResourcesResponseInfoDataList {\n");
        sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    hitRule: ").append(toIndentedString(hitRule)).append("\n");
        sb.append("    hitPathList: ").append(toIndentedString(hitPathList)).append("\n");
        sb.append("    firstScanTime: ").append(toIndentedString(firstScanTime)).append("\n");
        sb.append("    lastScanTime: ").append(toIndentedString(lastScanTime)).append("\n");
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
