package com.huaweicloud.sdk.das.v3.model;

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
public class ExportTopRiskInstancesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "top_risk_info")

    private List<TopRiskInfo> topRiskInfo = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    public ExportTopRiskInstancesResponse withTopRiskInfo(List<TopRiskInfo> topRiskInfo) {
        this.topRiskInfo = topRiskInfo;
        return this;
    }

    public ExportTopRiskInstancesResponse addTopRiskInfoItem(TopRiskInfo topRiskInfoItem) {
        if (this.topRiskInfo == null) {
            this.topRiskInfo = new ArrayList<>();
        }
        this.topRiskInfo.add(topRiskInfoItem);
        return this;
    }

    public ExportTopRiskInstancesResponse withTopRiskInfo(Consumer<List<TopRiskInfo>> topRiskInfoSetter) {
        if (this.topRiskInfo == null) {
            this.topRiskInfo = new ArrayList<>();
        }
        topRiskInfoSetter.accept(this.topRiskInfo);
        return this;
    }

    /**
     * 风险实例列表。
     * @return topRiskInfo
     */
    public List<TopRiskInfo> getTopRiskInfo() {
        return topRiskInfo;
    }

    public void setTopRiskInfo(List<TopRiskInfo> topRiskInfo) {
        this.topRiskInfo = topRiskInfo;
    }

    public ExportTopRiskInstancesResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 总数。
     * minimum: 0
     * maximum: 1000
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExportTopRiskInstancesResponse that = (ExportTopRiskInstancesResponse) obj;
        return Objects.equals(this.topRiskInfo, that.topRiskInfo) && Objects.equals(this.totalCount, that.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topRiskInfo, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExportTopRiskInstancesResponse {\n");
        sb.append("    topRiskInfo: ").append(toIndentedString(topRiskInfo)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
