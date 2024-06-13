package com.huaweicloud.sdk.kvs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.bson.codecs.pojo.annotations.BsonProperty;

import java.util.Objects;

/**
 * KvOptions
 */
public class KvOptions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "return_hint")
    @BsonProperty(value = "return_hint")

    private Boolean returnHint;

    public KvOptions withReturnHint(Boolean returnHint) {
        this.returnHint = returnHint;
        return this;
    }

    /**
     * - true:返回操作执行前的内容，默认true。 - false:返回操作执行后的内容。
     * @return returnHint
     */
    public Boolean getReturnHint() {
        return returnHint;
    }

    public void setReturnHint(Boolean returnHint) {
        this.returnHint = returnHint;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        KvOptions that = (KvOptions) obj;
        return Objects.equals(this.returnHint, that.returnHint);
    }

    @Override
    public int hashCode() {
        return Objects.hash(returnHint);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KvOptions {\n");
        sb.append("    returnHint: ").append(toIndentedString(returnHint)).append("\n");
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
