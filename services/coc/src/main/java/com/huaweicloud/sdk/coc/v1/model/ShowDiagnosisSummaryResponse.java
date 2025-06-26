package com.huaweicloud.sdk.coc.v1.model;

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
public class ShowDiagnosisSummaryResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_code")

    private String errorCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_msg")

    private String errorMsg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_summary")

    private List<DiagnosisSummaryItem> instanceSummary = null;

    public ShowDiagnosisSummaryResponse withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * error_code
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public ShowDiagnosisSummaryResponse withErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    /**
     * error_msg
     * @return errorMsg
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public ShowDiagnosisSummaryResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 工单状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowDiagnosisSummaryResponse withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * region
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public ShowDiagnosisSummaryResponse withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 开始时间
     * minimum: 0
     * maximum: 9000000000000000
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public ShowDiagnosisSummaryResponse withInstanceSummary(List<DiagnosisSummaryItem> instanceSummary) {
        this.instanceSummary = instanceSummary;
        return this;
    }

    public ShowDiagnosisSummaryResponse addInstanceSummaryItem(DiagnosisSummaryItem instanceSummaryItem) {
        if (this.instanceSummary == null) {
            this.instanceSummary = new ArrayList<>();
        }
        this.instanceSummary.add(instanceSummaryItem);
        return this;
    }

    public ShowDiagnosisSummaryResponse withInstanceSummary(
        Consumer<List<DiagnosisSummaryItem>> instanceSummarySetter) {
        if (this.instanceSummary == null) {
            this.instanceSummary = new ArrayList<>();
        }
        instanceSummarySetter.accept(this.instanceSummary);
        return this;
    }

    /**
     * 被诊断实例的概览信息列表
     * @return instanceSummary
     */
    public List<DiagnosisSummaryItem> getInstanceSummary() {
        return instanceSummary;
    }

    public void setInstanceSummary(List<DiagnosisSummaryItem> instanceSummary) {
        this.instanceSummary = instanceSummary;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowDiagnosisSummaryResponse that = (ShowDiagnosisSummaryResponse) obj;
        return Objects.equals(this.errorCode, that.errorCode) && Objects.equals(this.errorMsg, that.errorMsg)
            && Objects.equals(this.status, that.status) && Objects.equals(this.region, that.region)
            && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.instanceSummary, that.instanceSummary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(errorCode, errorMsg, status, region, startTime, instanceSummary);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDiagnosisSummaryResponse {\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    instanceSummary: ").append(toIndentedString(instanceSummary)).append("\n");
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
