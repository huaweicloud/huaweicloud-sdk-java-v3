package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * listener对象中的quic配置信息，仅protocol为HTTPS时有效。 支持创建和修改； 支持HTTPS监听器升级QUIC监听器能力。仅HTTPS监听器支持升级到QUIC监听器 当客户开启升级之后选择关联的quic监听器，https对象要保存改quic监听器ID。 对于TCP/UDP/HTTP/QUIC监听器，若该字段非空则报错。
 */
public class CreateListenerQuicConfigOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quic_listener_id")

    @JacksonXmlProperty(localName = "quic_listener_id")

    private String quicListenerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_quic_upgrade")

    @JacksonXmlProperty(localName = "enable_quic_upgrade")

    private Boolean enableQuicUpgrade;

    public CreateListenerQuicConfigOption withQuicListenerId(String quicListenerId) {
        this.quicListenerId = quicListenerId;
        return this;
    }

    /**
     * 监听器关联的QUIC监听器ID。指定的listener id必须已存在，且协议类型为QUIC，不能指定为null，否则与enable_quic_upgrade冲突。
     * @return quicListenerId
     */
    public String getQuicListenerId() {
        return quicListenerId;
    }

    public void setQuicListenerId(String quicListenerId) {
        this.quicListenerId = quicListenerId;
    }

    public CreateListenerQuicConfigOption withEnableQuicUpgrade(Boolean enableQuicUpgrade) {
        this.enableQuicUpgrade = enableQuicUpgrade;
        return this;
    }

    /**
     * QUIC升级的开启状态。 True:开启QUIC升级； Flase：关闭QUIC升级（默认）。 开启HTTPS监听器升级QUIC监听器能力
     * @return enableQuicUpgrade
     */
    public Boolean getEnableQuicUpgrade() {
        return enableQuicUpgrade;
    }

    public void setEnableQuicUpgrade(Boolean enableQuicUpgrade) {
        this.enableQuicUpgrade = enableQuicUpgrade;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateListenerQuicConfigOption createListenerQuicConfigOption = (CreateListenerQuicConfigOption) o;
        return Objects.equals(this.quicListenerId, createListenerQuicConfigOption.quicListenerId)
            && Objects.equals(this.enableQuicUpgrade, createListenerQuicConfigOption.enableQuicUpgrade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(quicListenerId, enableQuicUpgrade);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateListenerQuicConfigOption {\n");
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
