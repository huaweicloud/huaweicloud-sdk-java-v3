package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

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

    @JacksonXmlProperty(localName = "clusterType")

    private String clusterType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clusterVersion")

    @JacksonXmlProperty(localName = "clusterVersion")

    private List<String> clusterVersion = null;

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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SupportVersions supportVersions = (SupportVersions) o;
        return Objects.equals(this.clusterType, supportVersions.clusterType)
            && Objects.equals(this.clusterVersion, supportVersions.clusterVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterType, clusterVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SupportVersions {\n");
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
