package com.huaweicloud.sdk.dcc.v1.model;

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
public class ShowResourceClustersResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dedicated_cluster")

    private List<DedicatedCluster> dedicatedCluster = null;

    public ShowResourceClustersResponse withDedicatedCluster(List<DedicatedCluster> dedicatedCluster) {
        this.dedicatedCluster = dedicatedCluster;
        return this;
    }

    public ShowResourceClustersResponse addDedicatedClusterItem(DedicatedCluster dedicatedClusterItem) {
        if (this.dedicatedCluster == null) {
            this.dedicatedCluster = new ArrayList<>();
        }
        this.dedicatedCluster.add(dedicatedClusterItem);
        return this;
    }

    public ShowResourceClustersResponse withDedicatedCluster(Consumer<List<DedicatedCluster>> dedicatedClusterSetter) {
        if (this.dedicatedCluster == null) {
            this.dedicatedCluster = new ArrayList<>();
        }
        dedicatedClusterSetter.accept(this.dedicatedCluster);
        return this;
    }

    /**
     * 已开通的资源列表。
     * @return dedicatedCluster
     */
    public List<DedicatedCluster> getDedicatedCluster() {
        return dedicatedCluster;
    }

    public void setDedicatedCluster(List<DedicatedCluster> dedicatedCluster) {
        this.dedicatedCluster = dedicatedCluster;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowResourceClustersResponse that = (ShowResourceClustersResponse) obj;
        return Objects.equals(this.dedicatedCluster, that.dedicatedCluster);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dedicatedCluster);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowResourceClustersResponse {\n");
        sb.append("    dedicatedCluster: ").append(toIndentedString(dedicatedCluster)).append("\n");
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
