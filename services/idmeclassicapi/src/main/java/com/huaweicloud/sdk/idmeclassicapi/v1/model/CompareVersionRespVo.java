package com.huaweicloud.sdk.idmeclassicapi.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CompareVersionRespVo
 */
public class CompareVersionRespVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "basicVersion")

    private Object basicVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "correlationVersion")

    private Object correlationVersion;

    public CompareVersionRespVo withBasicVersion(Object basicVersion) {
        this.basicVersion = basicVersion;
        return this;
    }

    /**
     * **参数解释：**  基础版本对象。  **取值范围：**  不涉及。  **默认取值：**  不涉及。 
     * @return basicVersion
     */
    public Object getBasicVersion() {
        return basicVersion;
    }

    public void setBasicVersion(Object basicVersion) {
        this.basicVersion = basicVersion;
    }

    public CompareVersionRespVo withCorrelationVersion(Object correlationVersion) {
        this.correlationVersion = correlationVersion;
        return this;
    }

    /**
     * **参数解释：**  当前版本对象。  **取值范围：**  不涉及。  **默认取值：**  不涉及。 
     * @return correlationVersion
     */
    public Object getCorrelationVersion() {
        return correlationVersion;
    }

    public void setCorrelationVersion(Object correlationVersion) {
        this.correlationVersion = correlationVersion;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CompareVersionRespVo that = (CompareVersionRespVo) obj;
        return Objects.equals(this.basicVersion, that.basicVersion)
            && Objects.equals(this.correlationVersion, that.correlationVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(basicVersion, correlationVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CompareVersionRespVo {\n");
        sb.append("    basicVersion: ").append(toIndentedString(basicVersion)).append("\n");
        sb.append("    correlationVersion: ").append(toIndentedString(correlationVersion)).append("\n");
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
