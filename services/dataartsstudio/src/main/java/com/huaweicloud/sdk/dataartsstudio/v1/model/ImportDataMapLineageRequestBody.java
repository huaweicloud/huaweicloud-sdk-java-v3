package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 导入血缘请求体。
 */
public class ImportDataMapLineageRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "input_source_id")

    private String inputSourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_source_id")

    private String outputSourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lineage_configs")

    private List<SubNodeLineageConfig> lineageConfigs = null;

    public ImportDataMapLineageRequestBody withInputSourceId(String inputSourceId) {
        this.inputSourceId = inputSourceId;
        return this;
    }

    /**
     * 上游血缘sourceId。
     * @return inputSourceId
     */
    public String getInputSourceId() {
        return inputSourceId;
    }

    public void setInputSourceId(String inputSourceId) {
        this.inputSourceId = inputSourceId;
    }

    public ImportDataMapLineageRequestBody withOutputSourceId(String outputSourceId) {
        this.outputSourceId = outputSourceId;
        return this;
    }

    /**
     * 下游血缘sourceId。
     * @return outputSourceId
     */
    public String getOutputSourceId() {
        return outputSourceId;
    }

    public void setOutputSourceId(String outputSourceId) {
        this.outputSourceId = outputSourceId;
    }

    public ImportDataMapLineageRequestBody withLineageConfigs(List<SubNodeLineageConfig> lineageConfigs) {
        this.lineageConfigs = lineageConfigs;
        return this;
    }

    public ImportDataMapLineageRequestBody addLineageConfigsItem(SubNodeLineageConfig lineageConfigsItem) {
        if (this.lineageConfigs == null) {
            this.lineageConfigs = new ArrayList<>();
        }
        this.lineageConfigs.add(lineageConfigsItem);
        return this;
    }

    public ImportDataMapLineageRequestBody withLineageConfigs(
        Consumer<List<SubNodeLineageConfig>> lineageConfigsSetter) {
        if (this.lineageConfigs == null) {
            this.lineageConfigs = new ArrayList<>();
        }
        lineageConfigsSetter.accept(this.lineageConfigs);
        return this;
    }

    /**
     * 血缘信息。
     * @return lineageConfigs
     */
    public List<SubNodeLineageConfig> getLineageConfigs() {
        return lineageConfigs;
    }

    public void setLineageConfigs(List<SubNodeLineageConfig> lineageConfigs) {
        this.lineageConfigs = lineageConfigs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImportDataMapLineageRequestBody that = (ImportDataMapLineageRequestBody) obj;
        return Objects.equals(this.inputSourceId, that.inputSourceId)
            && Objects.equals(this.outputSourceId, that.outputSourceId)
            && Objects.equals(this.lineageConfigs, that.lineageConfigs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(inputSourceId, outputSourceId, lineageConfigs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImportDataMapLineageRequestBody {\n");
        sb.append("    inputSourceId: ").append(toIndentedString(inputSourceId)).append("\n");
        sb.append("    outputSourceId: ").append(toIndentedString(outputSourceId)).append("\n");
        sb.append("    lineageConfigs: ").append(toIndentedString(lineageConfigs)).append("\n");
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
