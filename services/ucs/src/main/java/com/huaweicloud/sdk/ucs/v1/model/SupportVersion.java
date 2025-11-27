package com.huaweicloud.sdk.ucs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 支持的集群类型（BareMetal，VirtualMachine，windows等）和支持的集群版本（支持正则表达式，如\&quot;.*\&quot;匹配所有集群版本 ）信息等
 */
public class SupportVersion {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private String category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clusterType")

    private String clusterType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clusterVersion")

    private List<String> clusterVersion = null;

    public SupportVersion withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * 支持的集群类型（CCE，thirdParty等）
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public SupportVersion withClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }

    /**
     * 支持的集群类型（BareMetal，VirtualMachine，windows等）
     * @return clusterType
     */
    public String getClusterType() {
        return clusterType;
    }

    public void setClusterType(String clusterType) {
        this.clusterType = clusterType;
    }

    public SupportVersion withClusterVersion(List<String> clusterVersion) {
        this.clusterVersion = clusterVersion;
        return this;
    }

    public SupportVersion addClusterVersionItem(String clusterVersionItem) {
        if (this.clusterVersion == null) {
            this.clusterVersion = new ArrayList<>();
        }
        this.clusterVersion.add(clusterVersionItem);
        return this;
    }

    public SupportVersion withClusterVersion(Consumer<List<String>> clusterVersionSetter) {
        if (this.clusterVersion == null) {
            this.clusterVersion = new ArrayList<>();
        }
        clusterVersionSetter.accept(this.clusterVersion);
        return this;
    }

    /**
     * 支持的集群版本，支持正则表达式，如\".*\"匹配所有集群版本
     * @return clusterVersion
     */
    public List<String> getClusterVersion() {
        return clusterVersion;
    }

    public void setClusterVersion(List<String> clusterVersion) {
        this.clusterVersion = clusterVersion;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SupportVersion that = (SupportVersion) obj;
        return Objects.equals(this.category, that.category) && Objects.equals(this.clusterType, that.clusterType)
            && Objects.equals(this.clusterVersion, that.clusterVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category, clusterType, clusterVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SupportVersion {\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    clusterType: ").append(toIndentedString(clusterType)).append("\n");
        sb.append("    clusterVersion: ").append(toIndentedString(clusterVersion)).append("\n");
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
