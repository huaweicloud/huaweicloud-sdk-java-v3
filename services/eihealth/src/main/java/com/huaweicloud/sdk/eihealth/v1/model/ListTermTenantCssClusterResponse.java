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
public class ListTermTenantCssClusterResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "css_clusters")

    private List<TermTenantCssClusterDto> cssClusters = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    public ListTermTenantCssClusterResponse withCssClusters(List<TermTenantCssClusterDto> cssClusters) {
        this.cssClusters = cssClusters;
        return this;
    }

    public ListTermTenantCssClusterResponse addCssClustersItem(TermTenantCssClusterDto cssClustersItem) {
        if (this.cssClusters == null) {
            this.cssClusters = new ArrayList<>();
        }
        this.cssClusters.add(cssClustersItem);
        return this;
    }

    public ListTermTenantCssClusterResponse withCssClusters(Consumer<List<TermTenantCssClusterDto>> cssClustersSetter) {
        if (this.cssClusters == null) {
            this.cssClusters = new ArrayList<>();
        }
        cssClustersSetter.accept(this.cssClusters);
        return this;
    }

    /**
     * 最终租户CSS集群列表
     * @return cssClusters
     */
    public List<TermTenantCssClusterDto> getCssClusters() {
        return cssClusters;
    }

    public void setCssClusters(List<TermTenantCssClusterDto> cssClusters) {
        this.cssClusters = cssClusters;
    }

    public ListTermTenantCssClusterResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 最终租户css集群总数
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
        ListTermTenantCssClusterResponse that = (ListTermTenantCssClusterResponse) obj;
        return Objects.equals(this.cssClusters, that.cssClusters) && Objects.equals(this.count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cssClusters, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTermTenantCssClusterResponse {\n");
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
