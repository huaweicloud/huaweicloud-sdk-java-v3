package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CssIndex
 */
public class CssIndex {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "index_name")

    private String indexName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "index_guid")

    private String indexGuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "index_qualified_name")

    private String indexQualifiedName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "index_doc_count")

    private Integer indexDocCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "index_data_size")

    private Integer indexDataSize;

    public CssIndex withIndexName(String indexName) {
        this.indexName = indexName;
        return this;
    }

    /**
     * 索引名称
     * @return indexName
     */
    public String getIndexName() {
        return indexName;
    }

    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    public CssIndex withIndexGuid(String indexGuid) {
        this.indexGuid = indexGuid;
        return this;
    }

    /**
     * 索引的guid
     * @return indexGuid
     */
    public String getIndexGuid() {
        return indexGuid;
    }

    public void setIndexGuid(String indexGuid) {
        this.indexGuid = indexGuid;
    }

    public CssIndex withIndexQualifiedName(String indexQualifiedName) {
        this.indexQualifiedName = indexQualifiedName;
        return this;
    }

    /**
     * 索引的唯一标识名称
     * @return indexQualifiedName
     */
    public String getIndexQualifiedName() {
        return indexQualifiedName;
    }

    public void setIndexQualifiedName(String indexQualifiedName) {
        this.indexQualifiedName = indexQualifiedName;
    }

    public CssIndex withIndexDocCount(Integer indexDocCount) {
        this.indexDocCount = indexDocCount;
        return this;
    }

    /**
     * 索引中文档总数
     * @return indexDocCount
     */
    public Integer getIndexDocCount() {
        return indexDocCount;
    }

    public void setIndexDocCount(Integer indexDocCount) {
        this.indexDocCount = indexDocCount;
    }

    public CssIndex withIndexDataSize(Integer indexDataSize) {
        this.indexDataSize = indexDataSize;
        return this;
    }

    /**
     * 索引数据量大小
     * @return indexDataSize
     */
    public Integer getIndexDataSize() {
        return indexDataSize;
    }

    public void setIndexDataSize(Integer indexDataSize) {
        this.indexDataSize = indexDataSize;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CssIndex that = (CssIndex) obj;
        return Objects.equals(this.indexName, that.indexName) && Objects.equals(this.indexGuid, that.indexGuid)
            && Objects.equals(this.indexQualifiedName, that.indexQualifiedName)
            && Objects.equals(this.indexDocCount, that.indexDocCount)
            && Objects.equals(this.indexDataSize, that.indexDataSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(indexName, indexGuid, indexQualifiedName, indexDocCount, indexDataSize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CssIndex {\n");
        sb.append("    indexName: ").append(toIndentedString(indexName)).append("\n");
        sb.append("    indexGuid: ").append(toIndentedString(indexGuid)).append("\n");
        sb.append("    indexQualifiedName: ").append(toIndentedString(indexQualifiedName)).append("\n");
        sb.append("    indexDocCount: ").append(toIndentedString(indexDocCount)).append("\n");
        sb.append("    indexDataSize: ").append(toIndentedString(indexDataSize)).append("\n");
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
