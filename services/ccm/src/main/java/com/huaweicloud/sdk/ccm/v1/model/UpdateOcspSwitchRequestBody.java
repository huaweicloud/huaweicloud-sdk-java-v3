package com.huaweicloud.sdk.ccm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * UpdateOcspSwitchRequestBody
 */
public class UpdateOcspSwitchRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ocsp_switch")

    private Boolean ocspSwitch;

    public UpdateOcspSwitchRequestBody withOcspSwitch(Boolean ocspSwitch) {
        this.ocspSwitch = ocspSwitch;
        return this;
    }

    /**
     * 启用或禁用OCSP。
     * @return ocspSwitch
     */
    public Boolean getOcspSwitch() {
        return ocspSwitch;
    }

    public void setOcspSwitch(Boolean ocspSwitch) {
        this.ocspSwitch = ocspSwitch;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateOcspSwitchRequestBody that = (UpdateOcspSwitchRequestBody) obj;
        return Objects.equals(this.ocspSwitch, that.ocspSwitch);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ocspSwitch);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateOcspSwitchRequestBody {\n");
        sb.append("    ocspSwitch: ").append(toIndentedString(ocspSwitch)).append("\n");
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
