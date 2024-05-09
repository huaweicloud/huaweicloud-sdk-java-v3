package com.huaweicloud.sdk.eihealth.v1.model;

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
public class ListCssClusterResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "css_clusters")

    private List<CssClusterDto> cssClusters = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    public ListCssClusterResponse withCssClusters(List<CssClusterDto> cssClusters) {
        this.cssClusters = cssClusters;
        return this;
    }

    public ListCssClusterResponse addCssClustersItem(CssClusterDto cssClustersItem) {
        if (this.cssClusters == null) {
            this.cssClusters = new ArrayList<>();
        }
        this.cssClusters.add(cssClustersItem);
        return this;
    }

    public ListCssClusterResponse withCssClusters(Consumer<List<CssClusterDto>> cssClustersSetter) {
        if (this.cssClusters == null) {
            this.cssClusters = new ArrayList<>();
        }
        cssClustersSetter.accept(this.cssClusters);
        return this;
    }

    /**
     * CSS集群列表
     * @return cssClusters
     */
    public List<CssClusterDto> getCssClusters() {
        return cssClusters;
    }

    public void setCssClusters(List<CssClusterDto> cssClusters) {
        this.cssClusters = cssClusters;
    }

    public ListCssClusterResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * css集群总数
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListCssClusterResponse that = (ListCssClusterResponse) obj;
        return Objects.equals(this.cssClusters, that.cssClusters) && Objects.equals(this.count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cssClusters, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCssClusterResponse {\n");
        sb.append("    cssClusters: ").append(toIndentedString(cssClusters)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
