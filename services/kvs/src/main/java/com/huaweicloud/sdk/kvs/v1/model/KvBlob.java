package com.huaweicloud.sdk.kvs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.bson.Document;
import org.bson.codecs.pojo.annotations.BsonProperty;
import org.bson.types.Binary;

import java.util.Objects;

/**
 * KvBlob
 */
public class KvBlob {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "PrimaryKey")
    @BsonProperty(value = "PrimaryKey")

    private Document primaryKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Xblob")
    @BsonProperty(value = "Xblob")

    private Binary xblob;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Xattr")
    @BsonProperty(value = "Xattr")

    private Binary xattr;

    public KvBlob withPrimaryKey(Document primaryKey) {
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

    public KvBlob withXblob(Binary xblob) {
        this.xblob = xblob;
        return this;
    }

    /**
     * Get xblob
     * @return xblob
     */
    public Binary getXblob() {
        return xblob;
    }

    public void setXblob(Binary xblob) {
        this.xblob = xblob;
    }

    public KvBlob withXattr(Binary xattr) {
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
        KvBlob that = (KvBlob) obj;
        return Objects.equals(this.primaryKey, that.primaryKey) && Objects.equals(this.xblob, that.xblob)
            && Objects.equals(this.xattr, that.xattr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(primaryKey, xblob, xattr);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KvBlob {\n");
        sb.append("    primaryKey: ").append(toIndentedString(primaryKey)).append("\n");
        sb.append("    xblob: ").append(toIndentedString(xblob)).append("\n");
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
