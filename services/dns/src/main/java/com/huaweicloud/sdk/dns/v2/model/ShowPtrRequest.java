package com.huaweicloud.sdk.dns.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowPtrRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ptr_id")

    private String ptrId;

    public ShowPtrRequest withPtrId(String ptrId) {
        this.ptrId = ptrId;
        return this;
    }

    /**
     * 反向解析ID。
     * @return ptrId
     */
    public String getPtrId() {
        return ptrId;
    }

    public void setPtrId(String ptrId) {
        this.ptrId = ptrId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowPtrRequest that = (ShowPtrRequest) obj;
        return Objects.equals(this.ptrId, that.ptrId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ptrId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowPtrRequest {\n");
        sb.append("    ptrId: ").append(toIndentedString(ptrId)).append("\n");
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
