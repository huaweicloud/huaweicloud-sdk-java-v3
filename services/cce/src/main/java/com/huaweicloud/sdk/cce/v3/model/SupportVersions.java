package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 插件支持升级的集群版本
 */
public class SupportVersions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clusterType")

    private String clusterType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clusterVersion")

    private List<String> clusterVersion = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private List<String> category = null;

    public SupportVersions withClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }

    /**
     * 支持的集群类型
     * @return clusterType
     */
    public String getClusterType() {
        return clusterType;
    }

    public void setClusterType(String clusterType) {
        this.clusterType = clusterType;
    }

    public SupportVersions withClusterVersion(List<String> clusterVersion) {
        this.clusterVersion = clusterVersion;
        return this;
    }

    public SupportVersions addClusterVersionItem(String clusterVersionItem) {
        if (this.clusterVersion == null) {
            this.clusterVersion = new ArrayList<>();
        }
        this.clusterVersion.add(clusterVersionItem);
        return this;
    }

    public SupportVersions withClusterVersion(Consumer<List<String>> clusterVersionSetter) {
        if (this.clusterVersion == null) {
            this.clusterVersion = new ArrayList<>();
        }
        clusterVersionSetter.accept(this.clusterVersion);
        return this;
    }

    /**
     * 支持的集群版本（正则表达式）
     * @return clusterVersion
     */
    public List<String> getClusterVersion() {
        return clusterVersion;
    }

    public void setClusterVersion(List<String> clusterVersion) {
        this.clusterVersion = clusterVersion;
    }

    public SupportVersions withCategory(List<String> category) {
        this.category = category;
        return this;
    }

    public SupportVersions addCategoryItem(String categoryItem) {
        if (this.category == null) {
            this.category = new ArrayList<>();
        }
        this.category.add(categoryItem);
        return this;
    }

    public SupportVersions withCategory(Consumer<List<String>> categorySetter) {
        if (this.category == null) {
            this.category = new ArrayList<>();
        }
        categorySetter.accept(this.category);
        return this;
    }

    /**
     * 作用的集群类型 **取值范围：** - CCE：CCE Standard集群 - Turbo：CCE Turbo集群 - Autopilot：CCE Autopilot集群  **默认取值** 为空时默认为CCE Standard，CCE Turbo集群
     * @return category
     */
    public List<String> getCategory() {
        return category;
    }

    public void setCategory(List<String> category) {
        this.category = category;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SupportVersions that = (SupportVersions) obj;
        return Objects.equals(this.clusterType, that.clusterType)
            && Objects.equals(this.clusterVersion, that.clusterVersion) && Objects.equals(this.category, that.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterType, clusterVersion, category);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SupportVersions {\n");
        sb.append("    clusterType: ").append(toIndentedString(clusterType)).append("\n");
        sb.append("    clusterVersion: ").append(toIndentedString(clusterVersion)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
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
