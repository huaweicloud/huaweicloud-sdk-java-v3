package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Configuration的规格信息
 */
public class ClusterConfigurationsSpec {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "packages")

    private List<ClusterConfigurationsSpecPackages> packages = null;

    public ClusterConfigurationsSpec withPackages(List<ClusterConfigurationsSpecPackages> packages) {
        this.packages = packages;
        return this;
    }

    public ClusterConfigurationsSpec addPackagesItem(ClusterConfigurationsSpecPackages packagesItem) {
        if (this.packages == null) {
            this.packages = new ArrayList<>();
        }
        this.packages.add(packagesItem);
        return this;
    }

    public ClusterConfigurationsSpec withPackages(Consumer<List<ClusterConfigurationsSpecPackages>> packagesSetter) {
        if (this.packages == null) {
            this.packages = new ArrayList<>();
        }
        packagesSetter.accept(this.packages);
        return this;
    }

    /**
     * 组件配置项列表
     * @return packages
     */
    public List<ClusterConfigurationsSpecPackages> getPackages() {
        return packages;
    }

    public void setPackages(List<ClusterConfigurationsSpecPackages> packages) {
        this.packages = packages;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ClusterConfigurationsSpec that = (ClusterConfigurationsSpec) obj;
        return Objects.equals(this.packages, that.packages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(packages);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClusterConfigurationsSpec {\n");
        sb.append("    packages: ").append(toIndentedString(packages)).append("\n");
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
