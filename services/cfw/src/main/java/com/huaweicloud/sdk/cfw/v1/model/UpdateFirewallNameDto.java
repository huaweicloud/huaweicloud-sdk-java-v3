package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * UpdateFirewallNameDto
 */
public class UpdateFirewallNameDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fw_instance_name")

    private String fwInstanceName;

    public UpdateFirewallNameDto withFwInstanceName(String fwInstanceName) {
        this.fwInstanceName = fwInstanceName;
        return this;
    }

    /**
     * **参数解释**： 防火墙名称 **约束限制**： 防火墙名称为中英文，包含数字，下划线，中划线，长度为1-48 **取值范围**： 不涉及 **默认取值**： 不涉及
     * @return fwInstanceName
     */
    public String getFwInstanceName() {
        return fwInstanceName;
    }

    public void setFwInstanceName(String fwInstanceName) {
        this.fwInstanceName = fwInstanceName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateFirewallNameDto that = (UpdateFirewallNameDto) obj;
        return Objects.equals(this.fwInstanceName, that.fwInstanceName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fwInstanceName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateFirewallNameDto {\n");
        sb.append("    fwInstanceName: ").append(toIndentedString(fwInstanceName)).append("\n");
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
