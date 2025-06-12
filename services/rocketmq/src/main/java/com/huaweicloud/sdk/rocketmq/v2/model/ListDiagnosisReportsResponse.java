package com.huaweicloud.sdk.rocketmq.v2.model;

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
public class ListDiagnosisReportsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "diagnosis_report_list")

    private List<DiagnosisReportResp> diagnosisReportList = null;

    public ListDiagnosisReportsResponse withDiagnosisReportList(List<DiagnosisReportResp> diagnosisReportList) {
        this.diagnosisReportList = diagnosisReportList;
        return this;
    }

    public ListDiagnosisReportsResponse addDiagnosisReportListItem(DiagnosisReportResp diagnosisReportListItem) {
        if (this.diagnosisReportList == null) {
            this.diagnosisReportList = new ArrayList<>();
        }
        this.diagnosisReportList.add(diagnosisReportListItem);
        return this;
    }

    public ListDiagnosisReportsResponse withDiagnosisReportList(
        Consumer<List<DiagnosisReportResp>> diagnosisReportListSetter) {
        if (this.diagnosisReportList == null) {
            this.diagnosisReportList = new ArrayList<>();
        }
        diagnosisReportListSetter.accept(this.diagnosisReportList);
        return this;
    }

    /**
     * **参数解释**： 诊断报告列表。 **取值范围**： 不涉及。
     * @return diagnosisReportList
     */
    public List<DiagnosisReportResp> getDiagnosisReportList() {
        return diagnosisReportList;
    }

    public void setDiagnosisReportList(List<DiagnosisReportResp> diagnosisReportList) {
        this.diagnosisReportList = diagnosisReportList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListDiagnosisReportsResponse that = (ListDiagnosisReportsResponse) obj;
        return Objects.equals(this.diagnosisReportList, that.diagnosisReportList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(diagnosisReportList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDiagnosisReportsResponse {\n");
        sb.append("    diagnosisReportList: ").append(toIndentedString(diagnosisReportList)).append("\n");
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
