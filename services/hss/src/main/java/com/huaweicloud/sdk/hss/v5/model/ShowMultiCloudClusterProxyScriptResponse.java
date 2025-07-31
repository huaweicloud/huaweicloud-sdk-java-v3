package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowMultiCloudClusterProxyScriptResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "install_script")

    private String installScript;

    public ShowMultiCloudClusterProxyScriptResponse withInstallScript(String installScript) {
        this.installScript = installScript;
        return this;
    }

    /**
     * 代理安装脚本
     * @return installScript
     */
    public String getInstallScript() {
        return installScript;
    }

    public void setInstallScript(String installScript) {
        this.installScript = installScript;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowMultiCloudClusterProxyScriptResponse that = (ShowMultiCloudClusterProxyScriptResponse) obj;
        return Objects.equals(this.installScript, that.installScript);
    }

    @Override
    public int hashCode() {
        return Objects.hash(installScript);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowMultiCloudClusterProxyScriptResponse {\n");
        sb.append("    installScript: ").append(toIndentedString(installScript)).append("\n");
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
