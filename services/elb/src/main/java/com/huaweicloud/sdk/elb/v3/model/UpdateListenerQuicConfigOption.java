package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * UpdateListenerQuicConfigOption
 */
public class UpdateListenerQuicConfigOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quic_listener_id")

    private String quicListenerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_quic_upgrade")

    private Boolean enableQuicUpgrade;

    public UpdateListenerQuicConfigOption withQuicListenerId(String quicListenerId) {
        this.quicListenerId = quicListenerId;
        return this;
    }

    /**
     * **参数解释**：监听器关联的QUIC监听器ID。  **约束限制**：指定的listener id必须已存在，且协议类型为QUIC，不能指定为null，否则与enable_quic_upgrade冲突。  **取值范围**：不涉及  **默认取值**：不涉及  [不支持QUIC。](tag:tm,hws_eu,g42,hk_g42,hcso_dt,dt)
     * @return quicListenerId
     */
    public String getQuicListenerId() {
        return quicListenerId;
    }

    public void setQuicListenerId(String quicListenerId) {
        this.quicListenerId = quicListenerId;
    }

    public UpdateListenerQuicConfigOption withEnableQuicUpgrade(Boolean enableQuicUpgrade) {
        this.enableQuicUpgrade = enableQuicUpgrade;
        return this;
    }

    /**
     * **参数解释**：QUIC升级的开启状态。 开启HTTPS监听器升级QUIC监听器能力。  **约束限制**：不涉及  **取值范围**： - true:开启QUIC升级. - false：关闭QUIC升级  **默认取值**：不涉及  [不支持QUIC。](tag:tm,hws_eu,g42,hk_g42,hcso_dt,dt)
     * @return enableQuicUpgrade
     */
    public Boolean getEnableQuicUpgrade() {
        return enableQuicUpgrade;
    }

    public void setEnableQuicUpgrade(Boolean enableQuicUpgrade) {
        this.enableQuicUpgrade = enableQuicUpgrade;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateListenerQuicConfigOption that = (UpdateListenerQuicConfigOption) obj;
        return Objects.equals(this.quicListenerId, that.quicListenerId)
            && Objects.equals(this.enableQuicUpgrade, that.enableQuicUpgrade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(quicListenerId, enableQuicUpgrade);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateListenerQuicConfigOption {\n");
        sb.append("    quicListenerId: ").append(toIndentedString(quicListenerId)).append("\n");
        sb.append("    enableQuicUpgrade: ").append(toIndentedString(enableQuicUpgrade)).append("\n");
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
