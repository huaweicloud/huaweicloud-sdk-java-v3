package com.huaweicloud.sdk.geip.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteGlobalEipRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "global_eip_id")

    private String globalEipId;

    public DeleteGlobalEipRequest withGlobalEipId(String globalEipId) {
        this.globalEipId = globalEipId;
        return this;
    }

    /**
     * global_eip_id
     * @return globalEipId
     */
    public String getGlobalEipId() {
        return globalEipId;
    }

    public void setGlobalEipId(String globalEipId) {
        this.globalEipId = globalEipId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteGlobalEipRequest that = (DeleteGlobalEipRequest) obj;
        return Objects.equals(this.globalEipId, that.globalEipId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(globalEipId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteGlobalEipRequest {\n");
        sb.append("    globalEipId: ").append(toIndentedString(globalEipId)).append("\n");
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
