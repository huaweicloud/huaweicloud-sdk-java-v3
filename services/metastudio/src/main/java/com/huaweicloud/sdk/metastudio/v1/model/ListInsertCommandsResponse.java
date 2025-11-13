package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListInsertCommandsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "insert_commands")

    private List<InsertCommandItem> insertCommands = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")

    private String xRequestId;

    public ListInsertCommandsResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 命令总数。
     * minimum: 0
     * maximum: 2147483647
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListInsertCommandsResponse withInsertCommands(List<InsertCommandItem> insertCommands) {
        this.insertCommands = insertCommands;
        return this;
    }

    public ListInsertCommandsResponse addInsertCommandsItem(InsertCommandItem insertCommandsItem) {
        if (this.insertCommands == null) {
            this.insertCommands = new ArrayList<>();
        }
        this.insertCommands.add(insertCommandsItem);
        return this;
    }

    public ListInsertCommandsResponse withInsertCommands(Consumer<List<InsertCommandItem>> insertCommandsSetter) {
        if (this.insertCommands == null) {
            this.insertCommands = new ArrayList<>();
        }
        insertCommandsSetter.accept(this.insertCommands);
        return this;
    }

    /**
     * 插入播放命令列表。
     * @return insertCommands
     */
    public List<InsertCommandItem> getInsertCommands() {
        return insertCommands;
    }

    public void setInsertCommands(List<InsertCommandItem> insertCommands) {
        this.insertCommands = insertCommands;
    }

    public ListInsertCommandsResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListInsertCommandsResponse that = (ListInsertCommandsResponse) obj;
        return Objects.equals(this.count, that.count) && Objects.equals(this.insertCommands, that.insertCommands)
            && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, insertCommands, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInsertCommandsResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    insertCommands: ").append(toIndentedString(insertCommands)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
