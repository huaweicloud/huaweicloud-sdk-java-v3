package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowMonthlyOperationReportDetailResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_summary_info")

    private OperationSummaryInfo operationSummaryInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protect_info")

    private ProtectInfo protectInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risk_handle_info")

    private RiskHandleInfo riskHandleInfo;

    public ShowMonthlyOperationReportDetailResponse withOperationSummaryInfo(
        OperationSummaryInfo operationSummaryInfo) {
        this.operationSummaryInfo = operationSummaryInfo;
        return this;
    }

    public ShowMonthlyOperationReportDetailResponse withOperationSummaryInfo(
        Consumer<OperationSummaryInfo> operationSummaryInfoSetter) {
        if (this.operationSummaryInfo == null) {
            this.operationSummaryInfo = new OperationSummaryInfo();
            operationSummaryInfoSetter.accept(this.operationSummaryInfo);
        }

        return this;
    }

    /**
     * Get operationSummaryInfo
     * @return operationSummaryInfo
     */
    public OperationSummaryInfo getOperationSummaryInfo() {
        return operationSummaryInfo;
    }

    public void setOperationSummaryInfo(OperationSummaryInfo operationSummaryInfo) {
        this.operationSummaryInfo = operationSummaryInfo;
    }

    public ShowMonthlyOperationReportDetailResponse withProtectInfo(ProtectInfo protectInfo) {
        this.protectInfo = protectInfo;
        return this;
    }

    public ShowMonthlyOperationReportDetailResponse withProtectInfo(Consumer<ProtectInfo> protectInfoSetter) {
        if (this.protectInfo == null) {
            this.protectInfo = new ProtectInfo();
            protectInfoSetter.accept(this.protectInfo);
        }

        return this;
    }

    /**
     * Get protectInfo
     * @return protectInfo
     */
    public ProtectInfo getProtectInfo() {
        return protectInfo;
    }

    public void setProtectInfo(ProtectInfo protectInfo) {
        this.protectInfo = protectInfo;
    }

    public ShowMonthlyOperationReportDetailResponse withRiskHandleInfo(RiskHandleInfo riskHandleInfo) {
        this.riskHandleInfo = riskHandleInfo;
        return this;
    }

    public ShowMonthlyOperationReportDetailResponse withRiskHandleInfo(Consumer<RiskHandleInfo> riskHandleInfoSetter) {
        if (this.riskHandleInfo == null) {
            this.riskHandleInfo = new RiskHandleInfo();
            riskHandleInfoSetter.accept(this.riskHandleInfo);
        }

        return this;
    }

    /**
     * Get riskHandleInfo
     * @return riskHandleInfo
     */
    public RiskHandleInfo getRiskHandleInfo() {
        return riskHandleInfo;
    }

    public void setRiskHandleInfo(RiskHandleInfo riskHandleInfo) {
        this.riskHandleInfo = riskHandleInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowMonthlyOperationReportDetailResponse that = (ShowMonthlyOperationReportDetailResponse) obj;
        return Objects.equals(this.operationSummaryInfo, that.operationSummaryInfo)
            && Objects.equals(this.protectInfo, that.protectInfo)
            && Objects.equals(this.riskHandleInfo, that.riskHandleInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operationSummaryInfo, protectInfo, riskHandleInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowMonthlyOperationReportDetailResponse {\n");
        sb.append("    operationSummaryInfo: ").append(toIndentedString(operationSummaryInfo)).append("\n");
        sb.append("    protectInfo: ").append(toIndentedString(protectInfo)).append("\n");
        sb.append("    riskHandleInfo: ").append(toIndentedString(riskHandleInfo)).append("\n");
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
