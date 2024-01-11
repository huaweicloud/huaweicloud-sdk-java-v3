package com.huaweicloud.sdk.kvs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.bson.codecs.pojo.annotations.BsonProperty;

import java.util.Objects;

/**
 * ProjectionBlob
 */
public class ProjectionBlob {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "with_attr")
    @BsonProperty(value = "with_attr")

    private Boolean withAttr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")
    @BsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "len")
    @BsonProperty(value = "len")

    private Integer len;

    public ProjectionBlob withWithAttr(Boolean withAttr) {
        this.withAttr = withAttr;
        return this;
    }

    /**
     * 是否返回kv_blob的属性信息, 默认返回。
     * @return withAttr
     */
    public Boolean getWithAttr() {
        return withAttr;
    }

    public void setWithAttr(Boolean withAttr) {
        this.withAttr = withAttr;
    }

    public ProjectionBlob withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * value部分的偏移位置，超过实际size不返回，默认_0。
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ProjectionBlob withLen(Integer len) {
        this.len = len;
        return this;
    }

    /**
     * 数据长度，默认offset后全部数据。
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
        ProjectionBlob that = (ProjectionBlob) obj;
        return Objects.equals(this.withAttr, that.withAttr) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.len, that.len);
    }

    @Override
    public int hashCode() {
        return Objects.hash(withAttr, offset, len);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProjectionBlob {\n");
        sb.append("    withAttr: ").append(toIndentedString(withAttr)).append("\n");
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
