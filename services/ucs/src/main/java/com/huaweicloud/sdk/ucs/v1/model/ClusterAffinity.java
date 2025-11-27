package com.huaweicloud.sdk.ucs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ClusterAffinity
 */
public class ClusterAffinity {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clusterNames")

    private List<String> clusterNames = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exclude")

    private List<String> exclude = null;

    public ClusterAffinity withClusterNames(List<String> clusterNames) {
        this.clusterNames = clusterNames;
        return this;
    }

    public ClusterAffinity addClusterNamesItem(String clusterNamesItem) {
        if (this.clusterNames == null) {
            this.clusterNames = new ArrayList<>();
        }
        this.clusterNames.add(clusterNamesItem);
        return this;
    }

    public ClusterAffinity withClusterNames(Consumer<List<String>> clusterNamesSetter) {
        if (this.clusterNames == null) {
            this.clusterNames = new ArrayList<>();
        }
        clusterNamesSetter.accept(this.clusterNames);
        return this;
    }

    /**
     * 指定要选择的集群名称列表
     * @return clusterNames
     */
    public List<String> getClusterNames() {
        return clusterNames;
    }

    public void setClusterNames(List<String> clusterNames) {
        this.clusterNames = clusterNames;
    }

    public ClusterAffinity withExclude(List<String> exclude) {
        this.exclude = exclude;
        return this;
    }

    public ClusterAffinity addExcludeItem(String excludeItem) {
        if (this.exclude == null) {
            this.exclude = new ArrayList<>();
        }
        this.exclude.add(excludeItem);
        return this;
    }

    public ClusterAffinity withExclude(Consumer<List<String>> excludeSetter) {
        if (this.exclude == null) {
            this.exclude = new ArrayList<>();
        }
        excludeSetter.accept(this.exclude);
        return this;
    }

    /**
     * 指定要排除的集群名称列表
     * @return exclude
     */
    public List<String> getExclude() {
        return exclude;
    }

    public void setExclude(List<String> exclude) {
        this.exclude = exclude;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ClusterAffinity that = (ClusterAffinity) obj;
        return Objects.equals(this.clusterNames, that.clusterNames) && Objects.equals(this.exclude, that.exclude);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterNames, exclude);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClusterAffinity {\n");
        sb.append("    clusterNames: ").append(toIndentedString(clusterNames)).append("\n");
        sb.append("    exclude: ").append(toIndentedString(exclude)).append("\n");
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
