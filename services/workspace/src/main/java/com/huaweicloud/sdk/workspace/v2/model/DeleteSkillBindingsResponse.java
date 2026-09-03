package com.huaweicloud.sdk.workspace.v2.model;

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
public class DeleteSkillBindingsResponse extends SdkResponse {

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

    private List<BindingFailedDetail> failedDetails = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")

    private String xRequestId;

    public DeleteSkillBindingsResponse withTotal(Integer total) {
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

    public DeleteSkillBindingsResponse withSuccessCount(Integer successCount) {
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

    public DeleteSkillBindingsResponse withFailedCount(Integer failedCount) {
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

    public DeleteSkillBindingsResponse withFailedDetails(List<BindingFailedDetail> failedDetails) {
        this.failedDetails = failedDetails;
        return this;
    }

    public DeleteSkillBindingsResponse addFailedDetailsItem(BindingFailedDetail failedDetailsItem) {
        if (this.failedDetails == null) {
            this.failedDetails = new ArrayList<>();
        }
        this.failedDetails.add(failedDetailsItem);
        return this;
    }

    public DeleteSkillBindingsResponse withFailedDetails(Consumer<List<BindingFailedDetail>> failedDetailsSetter) {
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
    public List<BindingFailedDetail> getFailedDetails() {
        return failedDetails;
    }

    public void setFailedDetails(List<BindingFailedDetail> failedDetails) {
        this.failedDetails = failedDetails;
    }

    public DeleteSkillBindingsResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteSkillBindingsResponse that = (DeleteSkillBindingsResponse) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.successCount, that.successCount)
            && Objects.equals(this.failedCount, that.failedCount)
            && Objects.equals(this.failedDetails, that.failedDetails)
            && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, successCount, failedCount, failedDetails, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteSkillBindingsResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    successCount: ").append(toIndentedString(successCount)).append("\n");
        sb.append("    failedCount: ").append(toIndentedString(failedCount)).append("\n");
        sb.append("    failedDetails: ").append(toIndentedString(failedDetails)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
