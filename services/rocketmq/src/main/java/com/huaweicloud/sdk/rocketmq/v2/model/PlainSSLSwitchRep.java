package com.huaweicloud.sdk.rocketmq.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * PlainSSLSwitchRep
 */
public class PlainSSLSwitchRep {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tls_mode")

    private String tlsMode;

    public PlainSSLSwitchRep withTlsMode(String tlsMode) {
        this.tlsMode = tlsMode;
        return this;
    }

    /**
     * **参数解释**： 协议模式。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return tlsMode
     */
    public String getTlsMode() {
        return tlsMode;
    }

    public void setTlsMode(String tlsMode) {
        this.tlsMode = tlsMode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PlainSSLSwitchRep that = (PlainSSLSwitchRep) obj;
        return Objects.equals(this.tlsMode, that.tlsMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tlsMode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PlainSSLSwitchRep {\n");
        sb.append("    tlsMode: ").append(toIndentedString(tlsMode)).append("\n");
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
