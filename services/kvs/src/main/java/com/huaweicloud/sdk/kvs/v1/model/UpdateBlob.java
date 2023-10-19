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
    @JsonProperty(value = "Xattr")
    @BsonProperty(value = "Xattr")

    private Binary xattr;

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

    public UpdateBlob withXattr(Binary xattr) {
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

    public UpdateBlob withOffset(Integer offset) {
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

    public UpdateBlob withLen(Integer len) {
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

    public UpdateBlob withBlobdata(Binary blobdata) {
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
            && Objects.equals(this.len, that.len) && Objects.equals(this.blobdata, that.blobdata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xattr, offset, len, blobdata);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateBlob {\n");
        sb.append("    xattr: ").append(toIndentedString(xattr)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    len: ").append(toIndentedString(len)).append("\n");
        sb.append("    blobdata: ").append(toIndentedString(blobdata)).append("\n");
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
