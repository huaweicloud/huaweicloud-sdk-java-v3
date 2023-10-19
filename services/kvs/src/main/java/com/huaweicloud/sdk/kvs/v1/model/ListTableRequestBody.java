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
    @JsonProperty(value = "CursorName")
    @BsonProperty(value = "CursorName")

    private String cursorName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "LimitNum")
    @BsonProperty(value = "LimitNum")

    private Integer limitNum;

    public ListTableRequestBody withCursorName(String cursorName) {
        this.cursorName = cursorName;
        return this;
    }

    /**
     * Get cursorName
     * @return cursorName
     */
    public String getCursorName() {
        return cursorName;
    }

    public void setCursorName(String cursorName) {
        this.cursorName = cursorName;
    }

    public ListTableRequestBody withLimitNum(Integer limitNum) {
        this.limitNum = limitNum;
        return this;
    }

    /**
     * Get limitNum
     * @return limitNum
     */
    public Integer getLimitNum() {
        return limitNum;
    }

    public void setLimitNum(Integer limitNum) {
        this.limitNum = limitNum;
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
        return Objects.equals(this.cursorName, that.cursorName) && Objects.equals(this.limitNum, that.limitNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cursorName, limitNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTableRequestBody {\n");
        sb.append("    cursorName: ").append(toIndentedString(cursorName)).append("\n");
        sb.append("    limitNum: ").append(toIndentedString(limitNum)).append("\n");
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
