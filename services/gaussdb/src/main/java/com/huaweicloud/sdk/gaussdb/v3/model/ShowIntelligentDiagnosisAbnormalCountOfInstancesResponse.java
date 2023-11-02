package com.huaweicloud.sdk.gaussdb.v3.model;

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
public class ShowIntelligentDiagnosisAbnormalCountOfInstancesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "diagnosis_info")

    private List<DiagnosisInfo> diagnosisInfo = null;

    public ShowIntelligentDiagnosisAbnormalCountOfInstancesResponse withDiagnosisInfo(
        List<DiagnosisInfo> diagnosisInfo) {
        this.diagnosisInfo = diagnosisInfo;
        return this;
    }

    public ShowIntelligentDiagnosisAbnormalCountOfInstancesResponse addDiagnosisInfoItem(
        DiagnosisInfo diagnosisInfoItem) {
        if (this.diagnosisInfo == null) {
            this.diagnosisInfo = new ArrayList<>();
        }
        this.diagnosisInfo.add(diagnosisInfoItem);
        return this;
    }

    public ShowIntelligentDiagnosisAbnormalCountOfInstancesResponse withDiagnosisInfo(
        Consumer<List<DiagnosisInfo>> diagnosisInfoSetter) {
        if (this.diagnosisInfo == null) {
            this.diagnosisInfo = new ArrayList<>();
        }
        diagnosisInfoSetter.accept(this.diagnosisInfo);
        return this;
    }

    /**
     * 诊断信息列表。
     * @return diagnosisInfo
     */
    public List<DiagnosisInfo> getDiagnosisInfo() {
        return diagnosisInfo;
    }

    public void setDiagnosisInfo(List<DiagnosisInfo> diagnosisInfo) {
        this.diagnosisInfo = diagnosisInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowIntelligentDiagnosisAbnormalCountOfInstancesResponse that =
            (ShowIntelligentDiagnosisAbnormalCountOfInstancesResponse) obj;
        return Objects.equals(this.diagnosisInfo, that.diagnosisInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(diagnosisInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowIntelligentDiagnosisAbnormalCountOfInstancesResponse {\n");
        sb.append("    diagnosisInfo: ").append(toIndentedString(diagnosisInfo)).append("\n");
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
