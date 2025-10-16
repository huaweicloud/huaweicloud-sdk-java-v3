package com.huaweicloud.sdk.cpcs.v1.model;

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
public class ShowStatusClusterResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_name")

    private String metricName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_list")

    private List<ShowStatusClusterItem> clusterList = null;

    public ShowStatusClusterResponse withMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

    /**
     * 资源名称
     * @return metricName
     */
    public String getMetricName() {
        return metricName;
    }

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    public ShowStatusClusterResponse withClusterList(List<ShowStatusClusterItem> clusterList) {
        this.clusterList = clusterList;
        return this;
    }

    public ShowStatusClusterResponse addClusterListItem(ShowStatusClusterItem clusterListItem) {
        if (this.clusterList == null) {
            this.clusterList = new ArrayList<>();
        }
        this.clusterList.add(clusterListItem);
        return this;
    }

    public ShowStatusClusterResponse withClusterList(Consumer<List<ShowStatusClusterItem>> clusterListSetter) {
        if (this.clusterList == null) {
            this.clusterList = new ArrayList<>();
        }
        clusterListSetter.accept(this.clusterList);
        return this;
    }

    /**
     * 集群列表
     * @return clusterList
     */
    public List<ShowStatusClusterItem> getClusterList() {
        return clusterList;
    }

    public void setClusterList(List<ShowStatusClusterItem> clusterList) {
        this.clusterList = clusterList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowStatusClusterResponse that = (ShowStatusClusterResponse) obj;
        return Objects.equals(this.metricName, that.metricName) && Objects.equals(this.clusterList, that.clusterList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(metricName, clusterList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowStatusClusterResponse {\n");
        sb.append("    metricName: ").append(toIndentedString(metricName)).append("\n");
        sb.append("    clusterList: ").append(toIndentedString(clusterList)).append("\n");
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
