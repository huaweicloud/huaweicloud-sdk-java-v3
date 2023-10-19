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
    @JsonProperty(value = "PrimaryKey")
    @BsonProperty(value = "PrimaryKey")

    private Document primaryKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "TotalBytes")
    @BsonProperty(value = "TotalBytes")

    private Integer totalBytes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Offset")
    @BsonProperty(value = "Offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Len")
    @BsonProperty(value = "Len")

    private Integer len;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Blobdata")
    @BsonProperty(value = "Blobdata")

    private Binary blobdata;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Xattr")
    @BsonProperty(value = "Xattr")

    private Binary xattr;

    public KvBlobData withPrimaryKey(Document primaryKey) {
        this.primaryKey = primaryKey;
        return this;
    }

    /**
     * Get primaryKey
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
     * Get totalBytes
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
     * Get offset
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
     * Get len
     * @return len
     */
    public Integer getLen() {
        return len;
    }

    public void setLen(Integer len) {
        this.len = len;
    }

    public KvBlobData withBlobdata(Binary blobdata) {
        this.blobdata = blobdata;
        return this;
    }

    /**
     * Get blobdata
     * @return blobdata
     */
    public Binary getBlobdata() {
        return blobdata;
    }

    public void setBlobdata(Binary blobdata) {
        this.blobdata = blobdata;
    }

    public KvBlobData withXattr(Binary xattr) {
        this.xattr = xattr;
        return this;
    }

    /**
     * Get xattr
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
            && Objects.equals(this.blobdata, that.blobdata) && Objects.equals(this.xattr, that.xattr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(primaryKey, totalBytes, offset, len, blobdata, xattr);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KvBlobData {\n");
        sb.append("    primaryKey: ").append(toIndentedString(primaryKey)).append("\n");
        sb.append("    totalBytes: ").append(toIndentedString(totalBytes)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    len: ").append(toIndentedString(len)).append("\n");
        sb.append("    blobdata: ").append(toIndentedString(blobdata)).append("\n");
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
