package com.huaweicloud.sdk.kvs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.bson.Document;
import org.bson.codecs.pojo.annotations.BsonProperty;
import org.bson.types.Binary;

import java.util.Objects;

/**
 * KvBlobData
 */
public class KvBlobData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "primary_key")
    @BsonProperty(value = "primary_key")

    private Document primaryKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_bytes")
    @BsonProperty(value = "total_bytes")

    private Integer totalBytes;

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "xattr")
    @BsonProperty(value = "xattr")

    private Binary xattr;

    public KvBlobData withPrimaryKey(Document primaryKey) {
        this.primaryKey = primaryKey;
        return this;
    }

    /**
     * 对kv_blob有效，返回全部or局部数据。
     * @return primaryKey
     */
    public Document getPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(Document primaryKey) {
        this.primaryKey = primaryKey;
    }

    public KvBlobData withTotalBytes(Integer totalBytes) {
        this.totalBytes = totalBytes;
        return this;
    }

    /**
     * value的总字节数。
     * @return totalBytes
     */
    public Integer getTotalBytes() {
        return totalBytes;
    }

    public void setTotalBytes(Integer totalBytes) {
        this.totalBytes = totalBytes;
    }

    public KvBlobData withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * value部分的偏移位置。
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public KvBlobData withLen(Integer len) {
        this.len = len;
        return this;
    }

    /**
     * value返回数据的实际长度 <= 请求的长度。
     * @return len
     */
    public Integer getLen() {
        return len;
    }

    public void setLen(Integer len) {
        this.len = len;
    }

    public KvBlobData withBlobData(Binary blobData) {
        this.blobData = blobData;
        return this;
    }

    /**
     * 二进制字节数组。
     * @return blobData
     */
    public Binary getBlobData() {
        return blobData;
    }

    public void setBlobData(Binary blobData) {
        this.blobData = blobData;
    }

    public KvBlobData withXattr(Binary xattr) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        KvBlobData that = (KvBlobData) obj;
        return Objects.equals(this.primaryKey, that.primaryKey) && Objects.equals(this.totalBytes, that.totalBytes)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.len, that.len)
            && Objects.equals(this.blobData, that.blobData) && Objects.equals(this.xattr, that.xattr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(primaryKey, totalBytes, offset, len, blobData, xattr);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KvBlobData {\n");
        sb.append("    primaryKey: ").append(toIndentedString(primaryKey)).append("\n");
        sb.append("    totalBytes: ").append(toIndentedString(totalBytes)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    len: ").append(toIndentedString(len)).append("\n");
        sb.append("    blobData: ").append(toIndentedString(blobData)).append("\n");
        sb.append("    xattr: ").append(toIndentedString(xattr)).append("\n");
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
