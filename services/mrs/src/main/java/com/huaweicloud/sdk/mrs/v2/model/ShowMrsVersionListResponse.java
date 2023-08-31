package com.huaweicloud.sdk.mrs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowMrsVersionListResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_versions")

    private List<String> clusterVersions = null;

    public ShowMrsVersionListResponse withClusterVersions(List<String> clusterVersions) {
        this.clusterVersions = clusterVersions;
        return this;
    }

    public ShowMrsVersionListResponse addClusterVersionsItem(String clusterVersionsItem) {
        if (this.clusterVersions == null) {
            this.clusterVersions = new ArrayList<>();
        }
        this.clusterVersions.add(clusterVersionsItem);
        return this;
    }

    public ShowMrsVersionListResponse withClusterVersions(Consumer<List<String>> clusterVersionsSetter) {
        if (this.clusterVersions == null) {
            this.clusterVersions = new ArrayList<>();
        }
        clusterVersionsSetter.accept(this.clusterVersions);
        return this;
    }

    /**
     * 可用集群版本列表
     * @return clusterVersions
     */
    public List<String> getClusterVersions() {
        return clusterVersions;
    }

    public void setClusterVersions(List<String> clusterVersions) {
        this.clusterVersions = clusterVersions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowMrsVersionListResponse that = (ShowMrsVersionListResponse) obj;
        return Objects.equals(this.clusterVersions, that.clusterVersions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterVersions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowMrsVersionListResponse {\n");
        sb.append("    clusterVersions: ").append(toIndentedString(clusterVersions)).append("\n");
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
