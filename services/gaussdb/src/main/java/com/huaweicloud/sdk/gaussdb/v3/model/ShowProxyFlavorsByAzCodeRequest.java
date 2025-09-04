package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowProxyFlavorsByAzCodeRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Language")

    private String xLanguage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "az_codes")

    private String azCodes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "proxy_engine_name")

    private String proxyEngineName;

    public ShowProxyFlavorsByAzCodeRequest withXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
        return this;
    }

    /**
     * **参数解释**：              请求语言类型。  **约束限制**：  不涉及。  **取值范围**： - en-us - zh-cn  **默认取值**：  en-us。
     * @return xLanguage
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Language")
    public String getXLanguage() {
        return xLanguage;
    }

    public void setXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
    }

    public ShowProxyFlavorsByAzCodeRequest withAzCodes(String azCodes) {
        this.azCodes = azCodes;
        return this;
    }

    /**
     * **参数解释**：  可用区。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return azCodes
     */
    public String getAzCodes() {
        return azCodes;
    }

    public void setAzCodes(String azCodes) {
        this.azCodes = azCodes;
    }

    public ShowProxyFlavorsByAzCodeRequest withProxyEngineName(String proxyEngineName) {
        this.proxyEngineName = proxyEngineName;
        return this;
    }

    /**
     * **参数解释**：  代理引擎名称。  **约束限制**：  不涉及。  **取值范围**：  taurusproxy。  **默认取值**：  不涉及。
     * @return proxyEngineName
     */
    public String getProxyEngineName() {
        return proxyEngineName;
    }

    public void setProxyEngineName(String proxyEngineName) {
        this.proxyEngineName = proxyEngineName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowProxyFlavorsByAzCodeRequest that = (ShowProxyFlavorsByAzCodeRequest) obj;
        return Objects.equals(this.xLanguage, that.xLanguage) && Objects.equals(this.azCodes, that.azCodes)
            && Objects.equals(this.proxyEngineName, that.proxyEngineName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xLanguage, azCodes, proxyEngineName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowProxyFlavorsByAzCodeRequest {\n");
        sb.append("    xLanguage: ").append(toIndentedString(xLanguage)).append("\n");
        sb.append("    azCodes: ").append(toIndentedString(azCodes)).append("\n");
        sb.append("    proxyEngineName: ").append(toIndentedString(proxyEngineName)).append("\n");
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
