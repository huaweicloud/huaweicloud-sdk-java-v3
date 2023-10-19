package com.huaweicloud.sdk.kvs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.bson.codecs.pojo.annotations.BsonProperty;

import java.util.Objects;

/**
 * ReturnBlobAttr
 */
public class ReturnBlobAttr {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ReturnAttr")
    @BsonProperty(value = "ReturnAttr")

    private Boolean returnAttr;

    public ReturnBlobAttr withReturnAttr(Boolean returnAttr) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ReturnBlobAttr that = (ReturnBlobAttr) obj;
        return Objects.equals(this.returnAttr, that.returnAttr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(returnAttr);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReturnBlobAttr {\n");
        sb.append("    returnAttr: ").append(toIndentedString(returnAttr)).append("\n");
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
