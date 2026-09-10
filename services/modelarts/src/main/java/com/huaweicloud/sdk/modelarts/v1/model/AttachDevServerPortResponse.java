package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Response Object
 */
public class AttachDevServerPortResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mac_addr")

    private String macAddr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port_id")

    private String portId;

    /**
     * **参数解释**：端口状态。 **取值范围**： - ACTIVE：端口处于活动状态，可以正常进行网络通信。 - BUILD：端口正在创建或配置中。 - DOWN：端口处于非活动状态，不能进行网络通信。
     */
    public static final class PortStateEnum {

        /**
         * Enum ACTIVE for value: "ACTIVE"
         */
        public static final PortStateEnum ACTIVE = new PortStateEnum("ACTIVE");

        /**
         * Enum BUILD for value: "BUILD"
         */
        public static final PortStateEnum BUILD = new PortStateEnum("BUILD");

        /**
         * Enum DOWN for value: "DOWN"
         */
        public static final PortStateEnum DOWN = new PortStateEnum("DOWN");

        private static final Map<String, PortStateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PortStateEnum> createStaticFields() {
            Map<String, PortStateEnum> map = new HashMap<>();
            map.put("ACTIVE", ACTIVE);
            map.put("BUILD", BUILD);
            map.put("DOWN", DOWN);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PortStateEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static PortStateEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PortStateEnum(value));
        }

        public static PortStateEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PortStateEnum) {
                return this.value.equals(((PortStateEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port_state")

    private PortStateEnum portState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "virsubnet_id")

    private String virsubnetId;

    public AttachDevServerPortResponse withMacAddr(String macAddr) {
        this.macAddr = macAddr;
        return this;
    }

    /**
     * **参数解释**：端口MAC地址，由系统分配。
     * @return macAddr
     */
    public String getMacAddr() {
        return macAddr;
    }

    public void setMacAddr(String macAddr) {
        this.macAddr = macAddr;
    }

    public AttachDevServerPortResponse withPortId(String portId) {
        this.portId = portId;
        return this;
    }

    /**
     * **参数解释**：网卡ID。 **取值范围**：^[0-9a-f]{8}-[0-9a-f]{4}-[1-5][0-9a-f]{3}-[89ab][0-9a-f]{3}-[0-9a-f]{12}$。
     * @return portId
     */
    public String getPortId() {
        return portId;
    }

    public void setPortId(String portId) {
        this.portId = portId;
    }

    public AttachDevServerPortResponse withPortState(PortStateEnum portState) {
        this.portState = portState;
        return this;
    }

    /**
     * **参数解释**：端口状态。 **取值范围**： - ACTIVE：端口处于活动状态，可以正常进行网络通信。 - BUILD：端口正在创建或配置中。 - DOWN：端口处于非活动状态，不能进行网络通信。
     * @return portState
     */
    public PortStateEnum getPortState() {
        return portState;
    }

    public void setPortState(PortStateEnum portState) {
        this.portState = portState;
    }

    public AttachDevServerPortResponse withVirsubnetId(String virsubnetId) {
        this.virsubnetId = virsubnetId;
        return this;
    }

    /**
     * **参数解释**：端口所在子网ID。 **取值范围**：^[0-9a-f]{8}-[0-9a-f]{4}-[1-5][0-9a-f]{3}-[89ab][0-9a-f]{3}-[0-9a-f]{12}$。
     * @return virsubnetId
     */
    public String getVirsubnetId() {
        return virsubnetId;
    }

    public void setVirsubnetId(String virsubnetId) {
        this.virsubnetId = virsubnetId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AttachDevServerPortResponse that = (AttachDevServerPortResponse) obj;
        return Objects.equals(this.macAddr, that.macAddr) && Objects.equals(this.portId, that.portId)
            && Objects.equals(this.portState, that.portState) && Objects.equals(this.virsubnetId, that.virsubnetId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(macAddr, portId, portState, virsubnetId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AttachDevServerPortResponse {\n");
        sb.append("    macAddr: ").append(toIndentedString(macAddr)).append("\n");
        sb.append("    portId: ").append(toIndentedString(portId)).append("\n");
        sb.append("    portState: ").append(toIndentedString(portState)).append("\n");
        sb.append("    virsubnetId: ").append(toIndentedString(virsubnetId)).append("\n");
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
