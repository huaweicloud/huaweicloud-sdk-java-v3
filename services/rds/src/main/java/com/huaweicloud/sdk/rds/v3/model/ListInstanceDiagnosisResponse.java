package com.huaweicloud.sdk.rds.v3.model;

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
public class ListInstanceDiagnosisResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "diagnosis")

    private List<DiagnosisItemResult> diagnosis = null;

    public ListInstanceDiagnosisResponse withDiagnosis(List<DiagnosisItemResult> diagnosis) {
        this.diagnosis = diagnosis;
        return this;
    }

    public ListInstanceDiagnosisResponse addDiagnosisItem(DiagnosisItemResult diagnosisItem) {
        if (this.diagnosis == null) {
            this.diagnosis = new ArrayList<>();
        }
        this.diagnosis.add(diagnosisItem);
        return this;
    }

    public ListInstanceDiagnosisResponse withDiagnosis(Consumer<List<DiagnosisItemResult>> diagnosisSetter) {
        if (this.diagnosis == null) {
            this.diagnosis = new ArrayList<>();
        }
        diagnosisSetter.accept(this.diagnosis);
        return this;
    }

    /**
     * diagnosis info
     * @return diagnosis
     */
    public List<DiagnosisItemResult> getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(List<DiagnosisItemResult> diagnosis) {
        this.diagnosis = diagnosis;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListInstanceDiagnosisResponse that = (ListInstanceDiagnosisResponse) obj;
        return Objects.equals(this.diagnosis, that.diagnosis);
    }

    @Override
    public int hashCode() {
        return Objects.hash(diagnosis);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInstanceDiagnosisResponse {\n");
        sb.append("    diagnosis: ").append(toIndentedString(diagnosis)).append("\n");
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
