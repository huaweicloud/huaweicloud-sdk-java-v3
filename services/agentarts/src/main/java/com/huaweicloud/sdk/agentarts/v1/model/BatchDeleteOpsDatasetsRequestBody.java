package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 执行批量删除评测集操作的请求体。 **约束限制：** 必须提供 dataset_ids 列表。 **取值范围：** 不涉及。 **默认取值：** 不涉及。 
 */
public class BatchDeleteOpsDatasetsRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataset_ids")

    private List<String> datasetIds = null;

    public BatchDeleteOpsDatasetsRequestBody withDatasetIds(List<String> datasetIds) {
        this.datasetIds = datasetIds;
        return this;
    }

    public BatchDeleteOpsDatasetsRequestBody addDatasetIdsItem(String datasetIdsItem) {
        if (this.datasetIds == null) {
            this.datasetIds = new ArrayList<>();
        }
        this.datasetIds.add(datasetIdsItem);
        return this;
    }

    public BatchDeleteOpsDatasetsRequestBody withDatasetIds(Consumer<List<String>> datasetIdsSetter) {
        if (this.datasetIds == null) {
            this.datasetIds = new ArrayList<>();
        }
        datasetIdsSetter.accept(this.datasetIds);
        return this;
    }

    /**
     * **参数解释：** 待删除的评测集ID集合。 **约束限制：** 数组元素数量为1-1000个；单个ID长度不超过100字符。 **取值范围：** 由有效的评测集唯一标识符组成的列表。 **默认取值：** 不涉及。 
     * @return datasetIds
     */
    public List<String> getDatasetIds() {
        return datasetIds;
    }

    public void setDatasetIds(List<String> datasetIds) {
        this.datasetIds = datasetIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchDeleteOpsDatasetsRequestBody that = (BatchDeleteOpsDatasetsRequestBody) obj;
        return Objects.equals(this.datasetIds, that.datasetIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(datasetIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteOpsDatasetsRequestBody {\n");
        sb.append("    datasetIds: ").append(toIndentedString(datasetIds)).append("\n");
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
