package com.huaweicloud.sdk.dwr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * BuildProgress
 */
public class BuildProgress {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "index_name")

    private String indexName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "field_name")

    private String fieldName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "build_progress")

    private Float buildProgress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "indexed_rows")

    private Integer indexedRows;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_rows")

    private Integer totalRows;

    public BuildProgress withIndexName(String indexName) {
        this.indexName = indexName;
        return this;
    }

    /**
     * **参数解释：** 索引名称。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值:** 不涉及。
     * @return indexName
     */
    public String getIndexName() {
        return indexName;
    }

    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    public BuildProgress withFieldName(String fieldName) {
        this.fieldName = fieldName;
        return this;
    }

    /**
     * **参数解释：** 索引对应的字段名称。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值:** 不涉及。
     * @return fieldName
     */
    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public BuildProgress withBuildProgress(Float buildProgress) {
        this.buildProgress = buildProgress;
        return this;
    }

    /**
     * **参数解释：** 构建索引的进度。 **约束限制：** 不涉及。 **取值范围：** `[0,1]` **默认取值:** 不涉及。
     * @return buildProgress
     */
    public Float getBuildProgress() {
        return buildProgress;
    }

    public void setBuildProgress(Float buildProgress) {
        this.buildProgress = buildProgress;
    }

    public BuildProgress withIndexedRows(Integer indexedRows) {
        this.indexedRows = indexedRows;
        return this;
    }

    /**
     * **参数解释：** 已完成索引的entity数量。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值:** 不涉及。
     * @return indexedRows
     */
    public Integer getIndexedRows() {
        return indexedRows;
    }

    public void setIndexedRows(Integer indexedRows) {
        this.indexedRows = indexedRows;
    }

    public BuildProgress withTotalRows(Integer totalRows) {
        this.totalRows = totalRows;
        return this;
    }

    /**
     * **参数解释：** 需要索引的entity的总数量。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值:** 不涉及。
     * @return totalRows
     */
    public Integer getTotalRows() {
        return totalRows;
    }

    public void setTotalRows(Integer totalRows) {
        this.totalRows = totalRows;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BuildProgress that = (BuildProgress) obj;
        return Objects.equals(this.indexName, that.indexName) && Objects.equals(this.fieldName, that.fieldName)
            && Objects.equals(this.buildProgress, that.buildProgress)
            && Objects.equals(this.indexedRows, that.indexedRows) && Objects.equals(this.totalRows, that.totalRows);
    }

    @Override
    public int hashCode() {
        return Objects.hash(indexName, fieldName, buildProgress, indexedRows, totalRows);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BuildProgress {\n");
        sb.append("    indexName: ").append(toIndentedString(indexName)).append("\n");
        sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
        sb.append("    buildProgress: ").append(toIndentedString(buildProgress)).append("\n");
        sb.append("    indexedRows: ").append(toIndentedString(indexedRows)).append("\n");
        sb.append("    totalRows: ").append(toIndentedString(totalRows)).append("\n");
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
