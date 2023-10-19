package com.huaweicloud.sdk.kvs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.bson.codecs.pojo.annotations.BsonProperty;

import java.util.Objects;

/**
 * ReturnPartialBlob
 */
public class ReturnPartialBlob {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ReturnAttr")
    @BsonProperty(value = "ReturnAttr")

    private Boolean returnAttr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Offset")
    @BsonProperty(value = "Offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Len")
    @BsonProperty(value = "Len")

    private Integer len;

    public ReturnPartialBlob withReturnAttr(Boolean returnAttr) {
        this.returnAttr = returnAttr;
        return this;
    }

    /**
     * Get returnAttr
     * @return returnAttr
     */
    public Boolean getReturnAttr() {
        return returnAttr;
    }

    public void setReturnAttr(Boolean returnAttr) {
        this.returnAttr = returnAttr;
    }

    public ReturnPartialBlob withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * Get offset
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ReturnPartialBlob withLen(Integer len) {
        this.len = len;
        return this;
    }

    /**
     * Get len
     * @return len
     */
    public Integer getLen() {
        return len;
    }

    public void setLen(Integer len) {
        this.len = len;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ReturnPartialBlob that = (ReturnPartialBlob) obj;
        return Objects.equals(this.returnAttr, that.returnAttr) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.len, that.len);
    }

    @Override
    public int hashCode() {
        return Objects.hash(returnAttr, offset, len);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReturnPartialBlob {\n");
        sb.append("    returnAttr: ").append(toIndentedString(returnAttr)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    len: ").append(toIndentedString(len)).append("\n");
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
