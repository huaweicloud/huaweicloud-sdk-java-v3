package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * ServerStartRequest
 */
public class ServerStartRequest {

    /**
     * **参数解释**：服务器架构信息。 **约束限制**：不涉及 **取值范围**： - -ARM - X86 **默认取值**：不涉及
     */
    public static final class ArchEnum {

        /**
         * Enum ARM for value: "ARM"
         */
        public static final ArchEnum ARM = new ArchEnum("ARM");

        /**
         * Enum X86 for value: "X86"
         */
        public static final ArchEnum X86 = new ArchEnum("X86");

        private static final Map<String, ArchEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ArchEnum> createStaticFields() {
            Map<String, ArchEnum> map = new HashMap<>();
            map.put("ARM", ARM);
            map.put("X86", X86);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ArchEnum(String value) {
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
        public static ArchEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ArchEnum(value));
        }

        public static ArchEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ArchEnum) {
                return this.value.equals(((ArchEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "arch")

    private ArchEnum arch;

    /**
     * **参数解释**：服务器规格计费模式。 **约束限制**：不涉及。 **取值范围**： - [COMMON：同时支持包周期和按需](tag:hws,hws_hk) - POST_PAID：按需 - [PRE_PAID：包周期](tag:hws,hws_hk) **默认取值**：不涉及
     */
    public static final class ChargingModeEnum {

        /**
         * Enum COMMON for value: "COMMON"
         */
        public static final ChargingModeEnum COMMON = new ChargingModeEnum("COMMON");

        /**
         * Enum POST_PAID for value: "POST_PAID"
         */
        public static final ChargingModeEnum POST_PAID = new ChargingModeEnum("POST_PAID");

        /**
         * Enum PRE_PAID for value: "PRE_PAID"
         */
        public static final ChargingModeEnum PRE_PAID = new ChargingModeEnum("PRE_PAID");

        private static final Map<String, ChargingModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ChargingModeEnum> createStaticFields() {
            Map<String, ChargingModeEnum> map = new HashMap<>();
            map.put("COMMON", COMMON);
            map.put("POST_PAID", POST_PAID);
            map.put("PRE_PAID", PRE_PAID);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ChargingModeEnum(String value) {
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
        public static ChargingModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ChargingModeEnum(value));
        }

        public static ChargingModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ChargingModeEnum) {
                return this.value.equals(((ChargingModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charging_mode")

    private ChargingModeEnum chargingMode;

    /**
     * **参数解释**：服务器类型。 **约束限制**：不涉及。 **取值范围**： - BMS：裸金属服务 - ECS：弹性云服务 - HPS：超节点服务 **默认取值**：不涉及
     */
    public static final class ServerTypeEnum {

        /**
         * Enum BMS for value: "BMS"
         */
        public static final ServerTypeEnum BMS = new ServerTypeEnum("BMS");

        /**
         * Enum ECS for value: "ECS"
         */
        public static final ServerTypeEnum ECS = new ServerTypeEnum("ECS");

        /**
         * Enum HPS for value: "HPS"
         */
        public static final ServerTypeEnum HPS = new ServerTypeEnum("HPS");

        private static final Map<String, ServerTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ServerTypeEnum> createStaticFields() {
            Map<String, ServerTypeEnum> map = new HashMap<>();
            map.put("BMS", BMS);
            map.put("ECS", ECS);
            map.put("HPS", HPS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ServerTypeEnum(String value) {
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
        public static ServerTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ServerTypeEnum(value));
        }

        public static ServerTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ServerTypeEnum) {
                return this.value.equals(((ServerTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_type")

    private ServerTypeEnum serverType;

    public ServerStartRequest withArch(ArchEnum arch) {
        this.arch = arch;
        return this;
    }

    /**
     * **参数解释**：服务器架构信息。 **约束限制**：不涉及 **取值范围**： - -ARM - X86 **默认取值**：不涉及
     * @return arch
     */
    public ArchEnum getArch() {
        return arch;
    }

    public void setArch(ArchEnum arch) {
        this.arch = arch;
    }

    public ServerStartRequest withChargingMode(ChargingModeEnum chargingMode) {
        this.chargingMode = chargingMode;
        return this;
    }

    /**
     * **参数解释**：服务器规格计费模式。 **约束限制**：不涉及。 **取值范围**： - [COMMON：同时支持包周期和按需](tag:hws,hws_hk) - POST_PAID：按需 - [PRE_PAID：包周期](tag:hws,hws_hk) **默认取值**：不涉及
     * @return chargingMode
     */
    public ChargingModeEnum getChargingMode() {
        return chargingMode;
    }

    public void setChargingMode(ChargingModeEnum chargingMode) {
        this.chargingMode = chargingMode;
    }

    public ServerStartRequest withServerType(ServerTypeEnum serverType) {
        this.serverType = serverType;
        return this;
    }

    /**
     * **参数解释**：服务器类型。 **约束限制**：不涉及。 **取值范围**： - BMS：裸金属服务 - ECS：弹性云服务 - HPS：超节点服务 **默认取值**：不涉及
     * @return serverType
     */
    public ServerTypeEnum getServerType() {
        return serverType;
    }

    public void setServerType(ServerTypeEnum serverType) {
        this.serverType = serverType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ServerStartRequest that = (ServerStartRequest) obj;
        return Objects.equals(this.arch, that.arch) && Objects.equals(this.chargingMode, that.chargingMode)
            && Objects.equals(this.serverType, that.serverType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(arch, chargingMode, serverType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServerStartRequest {\n");
        sb.append("    arch: ").append(toIndentedString(arch)).append("\n");
        sb.append("    chargingMode: ").append(toIndentedString(chargingMode)).append("\n");
        sb.append("    serverType: ").append(toIndentedString(serverType)).append("\n");
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
