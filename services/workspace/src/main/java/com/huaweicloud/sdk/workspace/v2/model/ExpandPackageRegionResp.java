package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 扩展技能包区域响应。
 */
public class ExpandPackageRegionResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success_count")

    private Integer successCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_count")

    private Integer failedCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_details")

    private List<RegionFailedDetail> failedDetails = null;

    public ExpandPackageRegionResp withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 请求总数。
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ExpandPackageRegionResp withSuccessCount(Integer successCount) {
        this.successCount = successCount;
        return this;
    }

    /**
     * 成功数量。
     * @return successCount
     */
    public Integer getSuccessCount() {
        return successCount;
    }

    public void setSuccessCount(Integer successCount) {
        this.successCount = successCount;
    }

    public ExpandPackageRegionResp withFailedCount(Integer failedCount) {
        this.failedCount = failedCount;
        return this;
    }

    /**
     * 失败数量。
     * @return failedCount
     */
    public Integer getFailedCount() {
        return failedCount;
    }

    public void setFailedCount(Integer failedCount) {
        this.failedCount = failedCount;
    }

    public ExpandPackageRegionResp withFailedDetails(List<RegionFailedDetail> failedDetails) {
        this.failedDetails = failedDetails;
        return this;
    }

    public ExpandPackageRegionResp addFailedDetailsItem(RegionFailedDetail failedDetailsItem) {
        if (this.failedDetails == null) {
            this.failedDetails = new ArrayList<>();
        }
        this.failedDetails.add(failedDetailsItem);
        return this;
    }

    public ExpandPackageRegionResp withFailedDetails(Consumer<List<RegionFailedDetail>> failedDetailsSetter) {
        if (this.failedDetails == null) {
            this.failedDetails = new ArrayList<>();
        }
        failedDetailsSetter.accept(this.failedDetails);
        return this;
    }

    /**
     * 失败详情列表。
     * @return failedDetails
     */
    public List<RegionFailedDetail> getFailedDetails() {
        return failedDetails;
    }

    public void setFailedDetails(List<RegionFailedDetail> failedDetails) {
        this.failedDetails = failedDetails;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExpandPackageRegionResp that = (ExpandPackageRegionResp) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.successCount, that.successCount)
            && Objects.equals(this.failedCount, that.failedCount)
            && Objects.equals(this.failedDetails, that.failedDetails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, successCount, failedCount, failedDetails);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExpandPackageRegionResp {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    successCount: ").append(toIndentedString(successCount)).append("\n");
        sb.append("    failedCount: ").append(toIndentedString(failedCount)).append("\n");
        sb.append("    failedDetails: ").append(toIndentedString(failedDetails)).append("\n");
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
