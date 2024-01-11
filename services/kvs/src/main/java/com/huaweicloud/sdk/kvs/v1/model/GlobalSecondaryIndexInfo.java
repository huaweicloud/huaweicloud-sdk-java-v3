package com.huaweicloud.sdk.kvs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.bson.codecs.pojo.annotations.BsonProperty;

import java.util.Objects;

/**
 * GlobalSecondaryIndexInfo
 */
public class GlobalSecondaryIndexInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "index_name")
    @BsonProperty(value = "index_name")

    private String indexName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "index_status")
    @BsonProperty(value = "index_status")

    private String indexStatus;

    public GlobalSecondaryIndexInfo withIndexName(String indexName) {
        this.indexName = indexName;
        return this;
    }

    /**
     * 二级索引名称
     * @return indexName
     */
    public String getIndexName() {
        return indexName;
    }

    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    public GlobalSecondaryIndexInfo withIndexStatus(String indexStatus) {
        this.indexStatus = indexStatus;
        return this;
    }

    /**
     * 二级索引名称。 - \"creating\" - \"active\" - \"deleting\"
     * @return indexStatus
     */
    public String getIndexStatus() {
        return indexStatus;
    }

    public void setIndexStatus(String indexStatus) {
        this.indexStatus = indexStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GlobalSecondaryIndexInfo that = (GlobalSecondaryIndexInfo) obj;
        return Objects.equals(this.indexName, that.indexName) && Objects.equals(this.indexStatus, that.indexStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(indexName, indexStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GlobalSecondaryIndexInfo {\n");
        sb.append("    indexName: ").append(toIndentedString(indexName)).append("\n");
        sb.append("    indexStatus: ").append(toIndentedString(indexStatus)).append("\n");
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
