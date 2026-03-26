package com.huaweicloud.sdk.dwr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * IndexDesc
 */
public class IndexDesc {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "index_name")

    private String indexName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "field_name")

    private String fieldName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "index_params")

    private Map<String, Object> indexParams = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "index_state")

    private String indexState;

    public IndexDesc withIndexName(String indexName) {
        this.indexName = indexName;
        return this;
    }

    /**
     * **参数解释：** 描述的索引名称。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return indexName
     */
    public String getIndexName() {
        return indexName;
    }

    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    public IndexDesc withFieldName(String fieldName) {
        this.fieldName = fieldName;
        return this;
    }

    /**
     * **参数解释：** 索引对应的字段名称。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return fieldName
     */
    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public IndexDesc withIndexParams(Map<String, Object> indexParams) {
        this.indexParams = indexParams;
        return this;
    }

    public IndexDesc putIndexParamsItem(String key, Object indexParamsItem) {
        if (this.indexParams == null) {
            this.indexParams = new HashMap<>();
        }
        this.indexParams.put(key, indexParamsItem);
        return this;
    }

    public IndexDesc withIndexParams(Consumer<Map<String, Object>> indexParamsSetter) {
        if (this.indexParams == null) {
            this.indexParams = new HashMap<>();
        }
        indexParamsSetter.accept(this.indexParams);
        return this;
    }

    /**
     * **参数解释：** 索引的参数信息。详情请查阅CreateIndex接口中 index_param结构中params字段的描述。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值:** 不涉及。
     * @return indexParams
     */
    public Map<String, Object> getIndexParams() {
        return indexParams;
    }

    public void setIndexParams(Map<String, Object> indexParams) {
        this.indexParams = indexParams;
    }

    public IndexDesc withIndexState(String indexState) {
        this.indexState = indexState;
        return this;
    }

    /**
     * **参数解释：** 索引状态。 **约束限制：** 不涉及。 **取值范围：** -\"InProgress\"：索引正在构建中或还未开始构建。 -\"Finished\"：索引构建完成。 -\"Failed\"：索引构建失败。 **默认取值:** 不涉及。
     * @return indexState
     */
    public String getIndexState() {
        return indexState;
    }

    public void setIndexState(String indexState) {
        this.indexState = indexState;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IndexDesc that = (IndexDesc) obj;
        return Objects.equals(this.indexName, that.indexName) && Objects.equals(this.fieldName, that.fieldName)
            && Objects.equals(this.indexParams, that.indexParams) && Objects.equals(this.indexState, that.indexState);
    }

    @Override
    public int hashCode() {
        return Objects.hash(indexName, fieldName, indexParams, indexState);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IndexDesc {\n");
        sb.append("    indexName: ").append(toIndentedString(indexName)).append("\n");
        sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
        sb.append("    indexParams: ").append(toIndentedString(indexParams)).append("\n");
        sb.append("    indexState: ").append(toIndentedString(indexState)).append("\n");
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
