package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowDecoyPortAutoBindResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_bind")

    private Boolean autoBind;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "windows_policy")

    private String windowsPolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "linux_policy")

    private String linuxPolicy;

    public ShowDecoyPortAutoBindResponse withAutoBind(Boolean autoBind) {
        this.autoBind = autoBind;
        return this;
    }

    /**
     * 是否自动绑定
     * @return autoBind
     */
    public Boolean getAutoBind() {
        return autoBind;
    }

    public void setAutoBind(Boolean autoBind) {
        this.autoBind = autoBind;
    }

    public ShowDecoyPortAutoBindResponse withWindowsPolicy(String windowsPolicy) {
        this.windowsPolicy = windowsPolicy;
        return this;
    }

    /**
     * 默认绑定的策略id
     * @return windowsPolicy
     */
    public String getWindowsPolicy() {
        return windowsPolicy;
    }

    public void setWindowsPolicy(String windowsPolicy) {
        this.windowsPolicy = windowsPolicy;
    }

    public ShowDecoyPortAutoBindResponse withLinuxPolicy(String linuxPolicy) {
        this.linuxPolicy = linuxPolicy;
        return this;
    }

    /**
     * 默认绑定的策略id
     * @return linuxPolicy
     */
    public String getLinuxPolicy() {
        return linuxPolicy;
    }

    public void setLinuxPolicy(String linuxPolicy) {
        this.linuxPolicy = linuxPolicy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowDecoyPortAutoBindResponse that = (ShowDecoyPortAutoBindResponse) obj;
        return Objects.equals(this.autoBind, that.autoBind) && Objects.equals(this.windowsPolicy, that.windowsPolicy)
            && Objects.equals(this.linuxPolicy, that.linuxPolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(autoBind, windowsPolicy, linuxPolicy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDecoyPortAutoBindResponse {\n");
        sb.append("    autoBind: ").append(toIndentedString(autoBind)).append("\n");
        sb.append("    windowsPolicy: ").append(toIndentedString(windowsPolicy)).append("\n");
        sb.append("    linuxPolicy: ").append(toIndentedString(linuxPolicy)).append("\n");
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
