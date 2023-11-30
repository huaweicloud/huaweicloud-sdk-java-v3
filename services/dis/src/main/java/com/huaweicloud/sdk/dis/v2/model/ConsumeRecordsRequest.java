package com.huaweicloud.sdk.dis.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ConsumeRecordsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partition-cursor")

    private String partitionCursor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_fetch_bytes")

    private Integer maxFetchBytes;

    public ConsumeRecordsRequest withPartitionCursor(String partitionCursor) {
        this.partitionCursor = partitionCursor;
        return this;
    }

    /**
     * 数据游标，需要先通过获取数据游标的接口获取。  取值范围：1~512个字符。  说明：  数据游标有效期为5分钟。
     * @return partitionCursor
     */
    public String getPartitionCursor() {
        return partitionCursor;
    }

    public void setPartitionCursor(String partitionCursor) {
        this.partitionCursor = partitionCursor;
    }

    public ConsumeRecordsRequest withMaxFetchBytes(Integer maxFetchBytes) {
        this.maxFetchBytes = maxFetchBytes;
        return this;
    }

    /**
     * 每个请求获取记录的最大字节数。  注意：  该值如果小于分区中单条记录的大小，会导致一直无法获取到记录。
     * @return maxFetchBytes
     */
    public Integer getMaxFetchBytes() {
        return maxFetchBytes;
    }

    public void setMaxFetchBytes(Integer maxFetchBytes) {
        this.maxFetchBytes = maxFetchBytes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ConsumeRecordsRequest that = (ConsumeRecordsRequest) obj;
        return Objects.equals(this.partitionCursor, that.partitionCursor)
            && Objects.equals(this.maxFetchBytes, that.maxFetchBytes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(partitionCursor, maxFetchBytes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConsumeRecordsRequest {\n");
        sb.append("    partitionCursor: ").append(toIndentedString(partitionCursor)).append("\n");
        sb.append("    maxFetchBytes: ").append(toIndentedString(maxFetchBytes)).append("\n");
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
