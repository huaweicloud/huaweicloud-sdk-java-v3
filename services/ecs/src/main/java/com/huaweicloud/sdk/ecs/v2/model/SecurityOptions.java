package com.huaweicloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SecurityOptions
 */
public class SecurityOptions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secure_boot_enabled")

    private Boolean secureBootEnabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tpm_enabled")

    private Boolean tpmEnabled;

    public SecurityOptions withSecureBootEnabled(Boolean secureBootEnabled) {
        this.secureBootEnabled = secureBootEnabled;
        return this;
    }

    /**
     * 是否支持安全启动 true:支持安全启动 false:不支持安全启动 默认值：false
     * @return secureBootEnabled
     */
    public Boolean getSecureBootEnabled() {
        return secureBootEnabled;
    }

    public void setSecureBootEnabled(Boolean secureBootEnabled) {
        this.secureBootEnabled = secureBootEnabled;
    }

    public SecurityOptions withTpmEnabled(Boolean tpmEnabled) {
        this.tpmEnabled = tpmEnabled;
        return this;
    }

    /**
     * 是否支持vtpm启动 true:支持vtpm启动 false:不支持vtpm启动 默认值：false
     * @return tpmEnabled
     */
    public Boolean getTpmEnabled() {
        return tpmEnabled;
    }

    public void setTpmEnabled(Boolean tpmEnabled) {
        this.tpmEnabled = tpmEnabled;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SecurityOptions that = (SecurityOptions) obj;
        return Objects.equals(this.secureBootEnabled, that.secureBootEnabled)
            && Objects.equals(this.tpmEnabled, that.tpmEnabled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(secureBootEnabled, tpmEnabled);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SecurityOptions {\n");
        sb.append("    secureBootEnabled: ").append(toIndentedString(secureBootEnabled)).append("\n");
        sb.append("    tpmEnabled: ").append(toIndentedString(tpmEnabled)).append("\n");
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
