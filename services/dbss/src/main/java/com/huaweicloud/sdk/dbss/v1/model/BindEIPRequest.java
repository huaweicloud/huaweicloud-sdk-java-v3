package com.huaweicloud.sdk.dbss.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * BindEIPRequest
 */
public class BindEIPRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eip")

    private String eip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eip_id")

    private String eipId;

    public BindEIPRequest withEip(String eip) {
        this.eip = eip;
        return this;
    }

    /**
     * EIP信息
     * @return eip
     */
    public String getEip() {
        return eip;
    }

    public void setEip(String eip) {
        this.eip = eip;
    }

    public BindEIPRequest withEipId(String eipId) {
        this.eipId = eipId;
        return this;
    }

    /**
     * EIP ID
     * @return eipId
     */
    public String getEipId() {
        return eipId;
    }

    public void setEipId(String eipId) {
        this.eipId = eipId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BindEIPRequest that = (BindEIPRequest) obj;
        return Objects.equals(this.eip, that.eip) && Objects.equals(this.eipId, that.eipId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eip, eipId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BindEIPRequest {\n");
        sb.append("    eip: ").append(toIndentedString(eip)).append("\n");
        sb.append("    eipId: ").append(toIndentedString(eipId)).append("\n");
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
