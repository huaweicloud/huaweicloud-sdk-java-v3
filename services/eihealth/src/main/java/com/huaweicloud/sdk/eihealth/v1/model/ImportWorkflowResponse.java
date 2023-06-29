package com.huaweicloud.sdk.eihealth.v1.model;

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
public class ImportWorkflowResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "import_workflow_status")

    private String importWorkflowStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "import_app_results")

    private List<ImportAppRsp> importAppResults = null;

    public ImportWorkflowResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 流程ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ImportWorkflowResponse withImportWorkflowStatus(String importWorkflowStatus) {
        this.importWorkflowStatus = importWorkflowStatus;
        return this;
    }

    /**
     * 导入流程结果状态, 包括以下状态：IMPORT_SUCCESS,IMPORT_FAIL
     * @return importWorkflowStatus
     */
    public String getImportWorkflowStatus() {
        return importWorkflowStatus;
    }

    public void setImportWorkflowStatus(String importWorkflowStatus) {
        this.importWorkflowStatus = importWorkflowStatus;
    }

    public ImportWorkflowResponse withImportAppResults(List<ImportAppRsp> importAppResults) {
        this.importAppResults = importAppResults;
        return this;
    }

    public ImportWorkflowResponse addImportAppResultsItem(ImportAppRsp importAppResultsItem) {
        if (this.importAppResults == null) {
            this.importAppResults = new ArrayList<>();
        }
        this.importAppResults.add(importAppResultsItem);
        return this;
    }

    public ImportWorkflowResponse withImportAppResults(Consumer<List<ImportAppRsp>> importAppResultsSetter) {
        if (this.importAppResults == null) {
            this.importAppResults = new ArrayList<>();
        }
        importAppResultsSetter.accept(this.importAppResults);
        return this;
    }

    /**
     * 导入应用详情
     * @return importAppResults
     */
    public List<ImportAppRsp> getImportAppResults() {
        return importAppResults;
    }

    public void setImportAppResults(List<ImportAppRsp> importAppResults) {
        this.importAppResults = importAppResults;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImportWorkflowResponse that = (ImportWorkflowResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.importWorkflowStatus, that.importWorkflowStatus)
            && Objects.equals(this.importAppResults, that.importAppResults);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, importWorkflowStatus, importAppResults);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImportWorkflowResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    importWorkflowStatus: ").append(toIndentedString(importWorkflowStatus)).append("\n");
        sb.append("    importAppResults: ").append(toIndentedString(importAppResults)).append("\n");
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
