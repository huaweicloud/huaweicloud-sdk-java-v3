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
public class ShowDiskSpaceDiagnosisResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "results")

    private List<DiskSpaceDiagnosisResult> results = null;

    public ShowDiskSpaceDiagnosisResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**：  诊断结果执行状态。  **约束限制**：  不涉及。  **取值范围**：  -FINISHED (已完成) -RUNNING (诊断中) -UNEXECUTED (未执行诊断)  **默认取值**：  不涉及。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowDiskSpaceDiagnosisResponse withResults(List<DiskSpaceDiagnosisResult> results) {
        this.results = results;
        return this;
    }

    public ShowDiskSpaceDiagnosisResponse addResultsItem(DiskSpaceDiagnosisResult resultsItem) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(resultsItem);
        return this;
    }

    public ShowDiskSpaceDiagnosisResponse withResults(Consumer<List<DiskSpaceDiagnosisResult>> resultsSetter) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        resultsSetter.accept(this.results);
        return this;
    }

    /**
     * **参数解释**：  各维度诊断信息。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return results
     */
    public List<DiskSpaceDiagnosisResult> getResults() {
        return results;
    }

    public void setResults(List<DiskSpaceDiagnosisResult> results) {
        this.results = results;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowDiskSpaceDiagnosisResponse that = (ShowDiskSpaceDiagnosisResponse) obj;
        return Objects.equals(this.status, that.status) && Objects.equals(this.results, that.results);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, results);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDiskSpaceDiagnosisResponse {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    results: ").append(toIndentedString(results)).append("\n");
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
