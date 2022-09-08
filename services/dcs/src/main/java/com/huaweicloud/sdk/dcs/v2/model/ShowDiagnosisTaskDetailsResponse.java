package com.huaweicloud.sdk.dcs.v2.model;

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
public class ShowDiagnosisTaskDetailsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "abnormal_item_sum")

    private Integer abnormalItemSum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_item_sum")

    private Integer failedItemSum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "diagnosis_node_report_list")

    private List<DiagnosisNodeReport> diagnosisNodeReportList = null;

    public ShowDiagnosisTaskDetailsResponse withAbnormalItemSum(Integer abnormalItemSum) {
        this.abnormalItemSum = abnormalItemSum;
        return this;
    }

    /**
     * 诊断结果为异常的诊断项总数
     * @return abnormalItemSum
     */
    public Integer getAbnormalItemSum() {
        return abnormalItemSum;
    }

    public void setAbnormalItemSum(Integer abnormalItemSum) {
        this.abnormalItemSum = abnormalItemSum;
    }

    public ShowDiagnosisTaskDetailsResponse withFailedItemSum(Integer failedItemSum) {
        this.failedItemSum = failedItemSum;
        return this;
    }

    /**
     * 诊断失败的诊断项总数
     * @return failedItemSum
     */
    public Integer getFailedItemSum() {
        return failedItemSum;
    }

    public void setFailedItemSum(Integer failedItemSum) {
        this.failedItemSum = failedItemSum;
    }

    public ShowDiagnosisTaskDetailsResponse withDiagnosisNodeReportList(
        List<DiagnosisNodeReport> diagnosisNodeReportList) {
        this.diagnosisNodeReportList = diagnosisNodeReportList;
        return this;
    }

    public ShowDiagnosisTaskDetailsResponse addDiagnosisNodeReportListItem(
        DiagnosisNodeReport diagnosisNodeReportListItem) {
        if (this.diagnosisNodeReportList == null) {
            this.diagnosisNodeReportList = new ArrayList<>();
        }
        this.diagnosisNodeReportList.add(diagnosisNodeReportListItem);
        return this;
    }

    public ShowDiagnosisTaskDetailsResponse withDiagnosisNodeReportList(
        Consumer<List<DiagnosisNodeReport>> diagnosisNodeReportListSetter) {
        if (this.diagnosisNodeReportList == null) {
            this.diagnosisNodeReportList = new ArrayList<>();
        }
        diagnosisNodeReportListSetter.accept(this.diagnosisNodeReportList);
        return this;
    }

    /**
     * 节点诊断报告列表
     * @return diagnosisNodeReportList
     */
    public List<DiagnosisNodeReport> getDiagnosisNodeReportList() {
        return diagnosisNodeReportList;
    }

    public void setDiagnosisNodeReportList(List<DiagnosisNodeReport> diagnosisNodeReportList) {
        this.diagnosisNodeReportList = diagnosisNodeReportList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowDiagnosisTaskDetailsResponse showDiagnosisTaskDetailsResponse = (ShowDiagnosisTaskDetailsResponse) o;
        return Objects.equals(this.abnormalItemSum, showDiagnosisTaskDetailsResponse.abnormalItemSum)
            && Objects.equals(this.failedItemSum, showDiagnosisTaskDetailsResponse.failedItemSum)
            && Objects.equals(this.diagnosisNodeReportList, showDiagnosisTaskDetailsResponse.diagnosisNodeReportList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(abnormalItemSum, failedItemSum, diagnosisNodeReportList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDiagnosisTaskDetailsResponse {\n");
        sb.append("    abnormalItemSum: ").append(toIndentedString(abnormalItemSum)).append("\n");
        sb.append("    failedItemSum: ").append(toIndentedString(failedItemSum)).append("\n");
        sb.append("    diagnosisNodeReportList: ").append(toIndentedString(diagnosisNodeReportList)).append("\n");
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
