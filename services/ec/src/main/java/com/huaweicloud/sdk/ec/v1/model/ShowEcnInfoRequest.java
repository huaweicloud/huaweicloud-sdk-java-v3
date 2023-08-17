package com.huaweicloud.sdk.ec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowEcnInfoRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ecn_id")

    private String ecnId;

    public ShowEcnInfoRequest withEcnId(String ecnId) {
        this.ecnId = ecnId;
        return this;
    }

    /**
     * 企业连接网络ID
     * @return ecnId
     */
    public String getEcnId() {
        return ecnId;
    }

    public void setEcnId(String ecnId) {
        this.ecnId = ecnId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowEcnInfoRequest that = (ShowEcnInfoRequest) obj;
        return Objects.equals(this.ecnId, that.ecnId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ecnId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowEcnInfoRequest {\n");
        sb.append("    ecnId: ").append(toIndentedString(ecnId)).append("\n");
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
