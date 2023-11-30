package com.huaweicloud.sdk.dis.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowCursorResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partition_cursor")

    private String partitionCursor;

    public ShowCursorResponse withPartitionCursor(String partitionCursor) {
        this.partitionCursor = partitionCursor;
        return this;
    }

    /**
     * 数据游标。  取值范围：1~512个字符。  说明：  数据游标有效期为5分钟。
     * @return partitionCursor
     */
    public String getPartitionCursor() {
        return partitionCursor;
    }

    public void setPartitionCursor(String partitionCursor) {
        this.partitionCursor = partitionCursor;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowCursorResponse that = (ShowCursorResponse) obj;
        return Objects.equals(this.partitionCursor, that.partitionCursor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(partitionCursor);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowCursorResponse {\n");
        sb.append("    partitionCursor: ").append(toIndentedString(partitionCursor)).append("\n");
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
