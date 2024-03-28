package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SlDomainAccessSetting
 */
public class SlDomainAccessSetting {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sl_domain_access_enabled")

    private Boolean slDomainAccessEnabled;

    public SlDomainAccessSetting withSlDomainAccessEnabled(Boolean slDomainAccessEnabled) {
        this.slDomainAccessEnabled = slDomainAccessEnabled;
        return this;
    }

    /**
     * 设置调试域名是否可以访问，true为可以访问，false为禁止访问
     * @return slDomainAccessEnabled
     */
    public Boolean getSlDomainAccessEnabled() {
        return slDomainAccessEnabled;
    }

    public void setSlDomainAccessEnabled(Boolean slDomainAccessEnabled) {
        this.slDomainAccessEnabled = slDomainAccessEnabled;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SlDomainAccessSetting that = (SlDomainAccessSetting) obj;
        return Objects.equals(this.slDomainAccessEnabled, that.slDomainAccessEnabled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(slDomainAccessEnabled);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SlDomainAccessSetting {\n");
        sb.append("    slDomainAccessEnabled: ").append(toIndentedString(slDomainAccessEnabled)).append("\n");
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
