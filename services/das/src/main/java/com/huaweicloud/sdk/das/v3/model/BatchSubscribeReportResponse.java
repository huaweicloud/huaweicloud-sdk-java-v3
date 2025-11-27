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
public class BatchSubscribeReportResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success_email_template_ids")

    private List<Integer> successEmailTemplateIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_email_template_ids")

    private List<Integer> failedEmailTemplateIds = null;

    public BatchSubscribeReportResponse withSuccessEmailTemplateIds(List<Integer> successEmailTemplateIds) {
        this.successEmailTemplateIds = successEmailTemplateIds;
        return this;
    }

    public BatchSubscribeReportResponse addSuccessEmailTemplateIdsItem(Integer successEmailTemplateIdsItem) {
        if (this.successEmailTemplateIds == null) {
            this.successEmailTemplateIds = new ArrayList<>();
        }
        this.successEmailTemplateIds.add(successEmailTemplateIdsItem);
        return this;
    }

    public BatchSubscribeReportResponse withSuccessEmailTemplateIds(
        Consumer<List<Integer>> successEmailTemplateIdsSetter) {
        if (this.successEmailTemplateIds == null) {
            this.successEmailTemplateIds = new ArrayList<>();
        }
        successEmailTemplateIdsSetter.accept(this.successEmailTemplateIds);
        return this;
    }

    /**
     * 成功的邮件模板列表
     * @return successEmailTemplateIds
     */
    public List<Integer> getSuccessEmailTemplateIds() {
        return successEmailTemplateIds;
    }

    public void setSuccessEmailTemplateIds(List<Integer> successEmailTemplateIds) {
        this.successEmailTemplateIds = successEmailTemplateIds;
    }

    public BatchSubscribeReportResponse withFailedEmailTemplateIds(List<Integer> failedEmailTemplateIds) {
        this.failedEmailTemplateIds = failedEmailTemplateIds;
        return this;
    }

    public BatchSubscribeReportResponse addFailedEmailTemplateIdsItem(Integer failedEmailTemplateIdsItem) {
        if (this.failedEmailTemplateIds == null) {
            this.failedEmailTemplateIds = new ArrayList<>();
        }
        this.failedEmailTemplateIds.add(failedEmailTemplateIdsItem);
        return this;
    }

    public BatchSubscribeReportResponse withFailedEmailTemplateIds(
        Consumer<List<Integer>> failedEmailTemplateIdsSetter) {
        if (this.failedEmailTemplateIds == null) {
            this.failedEmailTemplateIds = new ArrayList<>();
        }
        failedEmailTemplateIdsSetter.accept(this.failedEmailTemplateIds);
        return this;
    }

    /**
     * 失败的邮件模板列表
     * @return failedEmailTemplateIds
     */
    public List<Integer> getFailedEmailTemplateIds() {
        return failedEmailTemplateIds;
    }

    public void setFailedEmailTemplateIds(List<Integer> failedEmailTemplateIds) {
        this.failedEmailTemplateIds = failedEmailTemplateIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchSubscribeReportResponse that = (BatchSubscribeReportResponse) obj;
        return Objects.equals(this.successEmailTemplateIds, that.successEmailTemplateIds)
            && Objects.equals(this.failedEmailTemplateIds, that.failedEmailTemplateIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(successEmailTemplateIds, failedEmailTemplateIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchSubscribeReportResponse {\n");
        sb.append("    successEmailTemplateIds: ").append(toIndentedString(successEmailTemplateIds)).append("\n");
        sb.append("    failedEmailTemplateIds: ").append(toIndentedString(failedEmailTemplateIds)).append("\n");
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
