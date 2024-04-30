package com.huaweicloud.sdk.kvs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.bson.codecs.pojo.annotations.BsonProperty;

import java.util.Objects;

/**
 * ListTableRequestBody
 */
public class ListTableRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cursor_name")
    @BsonProperty(value = "cursor_name")

    private String cursorName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")
    @BsonProperty(value = "limit")

    private Integer limit;

    public ListTableRequestBody withCursorName(String cursorName) {
        this.cursorName = cursorName;
        return this;
    }

    /**
     * 上次返回游标位置，本次响应包含该table，空表示遍历完。 - 长度：[3, 63] - 取值字符限制：[a-z0-9_-]+ > 如果为空，表示后面无更多。
     * @return cursorName
     */
    public String getCursorName() {
        return cursorName;
    }

    public void setCursorName(String cursorName) {
        this.cursorName = cursorName;
    }

    public ListTableRequestBody withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 响应返回的表个数。 - 长度：最大100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListTableRequestBody that = (ListTableRequestBody) obj;
        return Objects.equals(this.cursorName, that.cursorName) && Objects.equals(this.limit, that.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cursorName, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTableRequestBody {\n");
        sb.append("    cursorName: ").append(toIndentedString(cursorName)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
