package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class GetDocumentAtomicInfoRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "atomic_unique_key")

    private String atomicUniqueKey;

    public GetDocumentAtomicInfoRequest withAtomicUniqueKey(String atomicUniqueKey) {
        this.atomicUniqueKey = atomicUniqueKey;
        return this;
    }

    /**
     * Get atomicUniqueKey
     * @return atomicUniqueKey
     */
    public String getAtomicUniqueKey() {
        return atomicUniqueKey;
    }

    public void setAtomicUniqueKey(String atomicUniqueKey) {
        this.atomicUniqueKey = atomicUniqueKey;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GetDocumentAtomicInfoRequest that = (GetDocumentAtomicInfoRequest) obj;
        return Objects.equals(this.atomicUniqueKey, that.atomicUniqueKey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(atomicUniqueKey);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetDocumentAtomicInfoRequest {\n");
        sb.append("    atomicUniqueKey: ").append(toIndentedString(atomicUniqueKey)).append("\n");
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
