package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class ListenerNode {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol")

    private String protocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol_port")

    private Integer protocolPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port_ranges")

    private List<PortRange> portRanges = null;

    public ListenerNode withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**：监听器id。  **取值范围**：不涉及
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ListenerNode withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**：监听器名称。  **取值范围**：不涉及
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListenerNode withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * **参数解释**：监听器协议。  **取值范围**：不涉及
     * @return protocol
     */
    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public ListenerNode withProtocolPort(Integer protocolPort) {
        this.protocolPort = protocolPort;
        return this;
    }

    /**
     * **参数解释**：监听器监听端口。  **取值范围**：不涉及
     * @return protocolPort
     */
    public Integer getProtocolPort() {
        return protocolPort;
    }

    public void setProtocolPort(Integer protocolPort) {
        this.protocolPort = protocolPort;
    }

    public ListenerNode withPortRanges(List<PortRange> portRanges) {
        this.portRanges = portRanges;
        return this;
    }

    public ListenerNode addPortRangesItem(PortRange portRangesItem) {
        if (this.portRanges == null) {
            this.portRanges = new ArrayList<>();
        }
        this.portRanges.add(portRangesItem);
        return this;
    }

    public ListenerNode withPortRanges(Consumer<List<PortRange>> portRangesSetter) {
        if (this.portRanges == null) {
            this.portRanges = new ArrayList<>();
        }
        portRangesSetter.accept(this.portRanges);
        return this;
    }

    /**
     * **参数解释**：全端口监听，指定端口监听范围（闭区间)，最多指定10个端口组，每个组范围不可有重叠部分 >仅当protocol_port为0时可以传入。
     * @return portRanges
     */
    public List<PortRange> getPortRanges() {
        return portRanges;
    }

    public void setPortRanges(List<PortRange> portRanges) {
        this.portRanges = portRanges;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListenerNode that = (ListenerNode) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.protocol, that.protocol) && Objects.equals(this.protocolPort, that.protocolPort)
            && Objects.equals(this.portRanges, that.portRanges);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, protocol, protocolPort, portRanges);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListenerNode {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    protocolPort: ").append(toIndentedString(protocolPort)).append("\n");
        sb.append("    portRanges: ").append(toIndentedString(portRanges)).append("\n");
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
