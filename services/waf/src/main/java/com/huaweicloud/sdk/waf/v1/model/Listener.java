package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释：** 监听器列表 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
 */
public class Listener {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol")

    private String protocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol_port")

    private Integer protocolPort;

    public Listener withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 监听器的名称 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Listener withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 监听器的ID **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Listener withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * **参数解释：** 监听器的监听协议 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return protocol
     */
    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public Listener withProtocolPort(Integer protocolPort) {
        this.protocolPort = protocolPort;
        return this;
    }

    /**
     * **参数解释：** 监听器的监听端口 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * minimum: 1
     * maximum: 65535
     * @return protocolPort
     */
    public Integer getProtocolPort() {
        return protocolPort;
    }

    public void setProtocolPort(Integer protocolPort) {
        this.protocolPort = protocolPort;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Listener that = (Listener) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.id, that.id)
            && Objects.equals(this.protocol, that.protocol) && Objects.equals(this.protocolPort, that.protocolPort);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, protocol, protocolPort);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Listener {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    protocolPort: ").append(toIndentedString(protocolPort)).append("\n");
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
