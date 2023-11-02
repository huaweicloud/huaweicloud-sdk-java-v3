package com.huaweicloud.sdk.dcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * UpdateClientIpTransparentTransmissionRequestBody
 */
public class UpdateClientIpTransparentTransmissionRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transparent_client_ip_enable")

    private Boolean transparentClientIpEnable;

    public UpdateClientIpTransparentTransmissionRequestBody withTransparentClientIpEnable(
        Boolean transparentClientIpEnable) {
        this.transparentClientIpEnable = transparentClientIpEnable;
        return this;
    }

    /**
     * 开启或关闭客户ip透传标志
     * @return transparentClientIpEnable
     */
    public Boolean getTransparentClientIpEnable() {
        return transparentClientIpEnable;
    }

    public void setTransparentClientIpEnable(Boolean transparentClientIpEnable) {
        this.transparentClientIpEnable = transparentClientIpEnable;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateClientIpTransparentTransmissionRequestBody that = (UpdateClientIpTransparentTransmissionRequestBody) obj;
        return Objects.equals(this.transparentClientIpEnable, that.transparentClientIpEnable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transparentClientIpEnable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateClientIpTransparentTransmissionRequestBody {\n");
        sb.append("    transparentClientIpEnable: ").append(toIndentedString(transparentClientIpEnable)).append("\n");
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
