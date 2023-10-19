package com.huaweicloud.sdk.kvs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.bson.codecs.pojo.annotations.BsonProperty;

import java.util.Objects;

/**
 * GsiIndexInfo
 */
public class GsiIndexInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "IndexName")
    @BsonProperty(value = "IndexName")

    private String indexName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "IndexStatus")
    @BsonProperty(value = "IndexStatus")

    private String indexStatus;

    public GsiIndexInfo withIndexName(String indexName) {
        this.indexName = indexName;
        return this;
    }

    /**
     * Get indexName
     * @return indexName
     */
    public String getIndexName() {
        return indexName;
    }

    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    public GsiIndexInfo withIndexStatus(String indexStatus) {
        this.indexStatus = indexStatus;
        return this;
    }

    /**
     * Get indexStatus
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
        GsiIndexInfo that = (GsiIndexInfo) obj;
        return Objects.equals(this.indexName, that.indexName) && Objects.equals(this.indexStatus, that.indexStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(indexName, indexStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GsiIndexInfo {\n");
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
