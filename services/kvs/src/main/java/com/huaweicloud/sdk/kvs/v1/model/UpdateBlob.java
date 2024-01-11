package com.huaweicloud.sdk.kvs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.bson.codecs.pojo.annotations.BsonProperty;
import org.bson.types.Binary;

import java.util.Objects;

/**
 * UpdateBlob
 */
public class UpdateBlob {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "xattr")
    @BsonProperty(value = "xattr")

    private Binary xattr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")
    @BsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "len")
    @BsonProperty(value = "len")

    private Integer len;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "blob_data")
    @BsonProperty(value = "blob_data")

    private Binary blobData;

    public UpdateBlob withXattr(Binary xattr) {
        this.xattr = xattr;
        return this;
    }

    /**
     * 属性信息。
     * @return xattr
     */
    public Binary getXattr() {
        return xattr;
    }

    public void setXattr(Binary xattr) {
        this.xattr = xattr;
    }

    public UpdateBlob withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * value部分的偏移位置。 > - 超过value当前size无效 > - \"offset\"与\"len\"与\"blob_data\" 要么都带，要么都不带。
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public UpdateBlob withLen(Integer len) {
        this.len = len;
        return this;
    }

    /**
     * 更新内容长度。
     * @return len
     */
    public Integer getLen() {
        return len;
    }

    public void setLen(Integer len) {
        this.len = len;
    }

    public UpdateBlob withBlobData(Binary blobData) {
        this.blobData = blobData;
        return this;
    }

    /**
     * 二进制内容。
     * @return blobData
     */
    public Binary getBlobData() {
        return blobData;
    }

    public void setBlobData(Binary blobData) {
        this.blobData = blobData;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateBlob that = (UpdateBlob) obj;
        return Objects.equals(this.xattr, that.xattr) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.len, that.len) && Objects.equals(this.blobData, that.blobData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xattr, offset, len, blobData);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateBlob {\n");
        sb.append("    xattr: ").append(toIndentedString(xattr)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    len: ").append(toIndentedString(len)).append("\n");
        sb.append("    blobData: ").append(toIndentedString(blobData)).append("\n");
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
