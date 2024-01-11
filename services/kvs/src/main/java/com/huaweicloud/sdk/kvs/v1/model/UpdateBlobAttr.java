package com.huaweicloud.sdk.kvs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.bson.codecs.pojo.annotations.BsonProperty;
import org.bson.types.Binary;

import java.util.Objects;

/**
 * UpdateBlobAttr
 */
public class UpdateBlobAttr {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "xattr")
    @BsonProperty(value = "xattr")

    private Binary xattr;

    public UpdateBlobAttr withXattr(Binary xattr) {
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
        UpdateBlobAttr that = (UpdateBlobAttr) obj;
        return Objects.equals(this.xattr, that.xattr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xattr);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateBlobAttr {\n");
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
