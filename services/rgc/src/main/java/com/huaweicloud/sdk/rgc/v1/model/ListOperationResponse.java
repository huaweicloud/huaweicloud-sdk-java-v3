package com.huaweicloud.sdk.rgc.v1.model;

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
public class ListOperationResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_id")

    private String operationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "percentage_complete")

    private Integer percentageComplete;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "percentage_details")

    private List<OrganizationalPercentageDetail> percentageDetails = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    public ListOperationResponse withOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }

    /**
     * 操作ID。
     * @return operationId
     */
    public String getOperationId() {
        return operationId;
    }

    public void setOperationId(String operationId) {
        this.operationId = operationId;
    }

    public ListOperationResponse withPercentageComplete(Integer percentageComplete) {
        this.percentageComplete = percentageComplete;
        return this;
    }

    /**
     * 完成进度百分比。
     * @return percentageComplete
     */
    public Integer getPercentageComplete() {
        return percentageComplete;
    }

    public void setPercentageComplete(Integer percentageComplete) {
        this.percentageComplete = percentageComplete;
    }

    public ListOperationResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ListOperationResponse withPercentageDetails(List<OrganizationalPercentageDetail> percentageDetails) {
        this.percentageDetails = percentageDetails;
        return this;
    }

    public ListOperationResponse addPercentageDetailsItem(OrganizationalPercentageDetail percentageDetailsItem) {
        if (this.percentageDetails == null) {
            this.percentageDetails = new ArrayList<>();
        }
        this.percentageDetails.add(percentageDetailsItem);
        return this;
    }

    public ListOperationResponse withPercentageDetails(
        Consumer<List<OrganizationalPercentageDetail>> percentageDetailsSetter) {
        if (this.percentageDetails == null) {
            this.percentageDetails = new ArrayList<>();
        }
        percentageDetailsSetter.accept(this.percentageDetails);
        return this;
    }

    /**
     * 创建账号、注册OU、纳管账号的详细进度信息。
     * @return percentageDetails
     */
    public List<OrganizationalPercentageDetail> getPercentageDetails() {
        return percentageDetails;
    }

    public void setPercentageDetails(List<OrganizationalPercentageDetail> percentageDetails) {
        this.percentageDetails = percentageDetails;
    }

    public ListOperationResponse withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 创建账号、注册OU、纳管账号的错误信息描述。
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListOperationResponse that = (ListOperationResponse) obj;
        return Objects.equals(this.operationId, that.operationId)
            && Objects.equals(this.percentageComplete, that.percentageComplete)
            && Objects.equals(this.status, that.status)
            && Objects.equals(this.percentageDetails, that.percentageDetails)
            && Objects.equals(this.message, that.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operationId, percentageComplete, status, percentageDetails, message);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListOperationResponse {\n");
        sb.append("    operationId: ").append(toIndentedString(operationId)).append("\n");
        sb.append("    percentageComplete: ").append(toIndentedString(percentageComplete)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    percentageDetails: ").append(toIndentedString(percentageDetails)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
