package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ImportOpsResultsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataset_id")

    private String datasetId;

    public ImportOpsResultsResponse withDatasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }

    /**
     * **参数解释：** 数据导入完成后承载结果的目标评测集ID。 **取值范围：** 符合通用唯一识别码(UUID)标准的字符串。 
     * @return datasetId
     */
    public String getDatasetId() {
        return datasetId;
    }

    public void setDatasetId(String datasetId) {
        this.datasetId = datasetId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImportOpsResultsResponse that = (ImportOpsResultsResponse) obj;
        return Objects.equals(this.datasetId, that.datasetId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(datasetId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImportOpsResultsResponse {\n");
        sb.append("    datasetId: ").append(toIndentedString(datasetId)).append("\n");
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
