package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class BatchCreateOpsDatasetItemsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataset_id")

    private String datasetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_version_id")

    private String sourceVersionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "overwrite")

    private Boolean overwrite;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private BatchCreateOpsDatasetItemsRequestBody body;

    public BatchCreateOpsDatasetItemsRequest withDatasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }

    /**
     * **参数解释：** 评测集的唯一标识符（ID） **约束限制：** 由英文、数字、“-”、“_”组成，长度为1到64个字符。 **取值范围：** 由英文、数字、连字符(-)、下划线(_)组成的1-64位字符串。 **默认取值：** 无。 
     * @return datasetId
     */
    public String getDatasetId() {
        return datasetId;
    }

    public void setDatasetId(String datasetId) {
        this.datasetId = datasetId;
    }

    public BatchCreateOpsDatasetItemsRequest withSourceVersionId(String sourceVersionId) {
        this.sourceVersionId = sourceVersionId;
        return this;
    }

    /**
     * **参数解释：** 源版本ID。在执行版本还原或基于特定版本批量添加数据的场景下，指定作为数据来源的历史版本标识。 **约束限制：** 长度为0到100个字符。 **取值范围：** 有效的版本ID字符串。 **默认取值：** 不涉及。
     * @return sourceVersionId
     */
    public String getSourceVersionId() {
        return sourceVersionId;
    }

    public void setSourceVersionId(String sourceVersionId) {
        this.sourceVersionId = sourceVersionId;
    }

    public BatchCreateOpsDatasetItemsRequest withOverwrite(Boolean overwrite) {
        this.overwrite = overwrite;
        return this;
    }

    /**
     * **参数解释：** 覆盖模式开关。用于控制在批量添加新条目之前，是否清空目标评测集（通常为草稿版）中的现有数据。 **约束限制：** 不涉及。 **取值范围：** - `true`: 覆盖模式，先清空后添加。 - `false`: 追加模式，在现有数据基础上新增。 **默认取值：** false。
     * @return overwrite
     */
    public Boolean getOverwrite() {
        return overwrite;
    }

    public void setOverwrite(Boolean overwrite) {
        this.overwrite = overwrite;
    }

    public BatchCreateOpsDatasetItemsRequest withBody(BatchCreateOpsDatasetItemsRequestBody body) {
        this.body = body;
        return this;
    }

    public BatchCreateOpsDatasetItemsRequest withBody(Consumer<BatchCreateOpsDatasetItemsRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new BatchCreateOpsDatasetItemsRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public BatchCreateOpsDatasetItemsRequestBody getBody() {
        return body;
    }

    public void setBody(BatchCreateOpsDatasetItemsRequestBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchCreateOpsDatasetItemsRequest that = (BatchCreateOpsDatasetItemsRequest) obj;
        return Objects.equals(this.datasetId, that.datasetId)
            && Objects.equals(this.sourceVersionId, that.sourceVersionId)
            && Objects.equals(this.overwrite, that.overwrite) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(datasetId, sourceVersionId, overwrite, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchCreateOpsDatasetItemsRequest {\n");
        sb.append("    datasetId: ").append(toIndentedString(datasetId)).append("\n");
        sb.append("    sourceVersionId: ").append(toIndentedString(sourceVersionId)).append("\n");
        sb.append("    overwrite: ").append(toIndentedString(overwrite)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
