package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * SwitchWebTamperProtectStatusRequestBody
 */
public class SwitchWebTamperProtectStatusRequestBody {

    /**
     * 防护类型
     */
    public static final class TypeEnum {

        /**
         * Enum CONTAINER_WTP for value: "container_wtp"
         */
        public static final TypeEnum CONTAINER_WTP = new TypeEnum("container_wtp");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("container_wtp", CONTAINER_WTP);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TypeEnum(value));
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

    /**
     * 操作类型：（open 开启防护,close 关闭防护）
     */
    public static final class OperateTypeEnum {

        /**
         * Enum CLOSE for value: "close"
         */
        public static final OperateTypeEnum CLOSE = new OperateTypeEnum("close");

        /**
         * Enum OPEN for value: "open"
         */
        public static final OperateTypeEnum OPEN = new OperateTypeEnum("open");

        private static final Map<String, OperateTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OperateTypeEnum> createStaticFields() {
            Map<String, OperateTypeEnum> map = new HashMap<>();
            map.put("close", CLOSE);
            map.put("open", OPEN);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OperateTypeEnum(String value) {
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
        public static OperateTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new OperateTypeEnum(value));
        }

        public static OperateTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OperateTypeEnum) {
                return this.value.equals(((OperateTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operate_type")

    private OperateTypeEnum operateType;

    /**
     * 计费模式，开启防护时需要，容器网页防篡改固定传packet_cycle
     */
    public static final class ChargingModeEnum {

        /**
         * Enum PACKET_CYCLE for value: "packet_cycle"
         */
        public static final ChargingModeEnum PACKET_CYCLE = new ChargingModeEnum("packet_cycle");

        private static final Map<String, ChargingModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ChargingModeEnum> createStaticFields() {
            Map<String, ChargingModeEnum> map = new HashMap<>();
            map.put("packet_cycle", PACKET_CYCLE);
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protection_config_id_list")

    private List<String> protectionConfigIdList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id_list")

    private List<String> resourceIdList = null;

    public SwitchWebTamperProtectStatusRequestBody withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 防护类型
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public SwitchWebTamperProtectStatusRequestBody withOperateType(OperateTypeEnum operateType) {
        this.operateType = operateType;
        return this;
    }

    /**
     * 操作类型：（open 开启防护,close 关闭防护）
     * @return operateType
     */
    public OperateTypeEnum getOperateType() {
        return operateType;
    }

    public void setOperateType(OperateTypeEnum operateType) {
        this.operateType = operateType;
    }

    public SwitchWebTamperProtectStatusRequestBody withChargingMode(ChargingModeEnum chargingMode) {
        this.chargingMode = chargingMode;
        return this;
    }

    /**
     * 计费模式，开启防护时需要，容器网页防篡改固定传packet_cycle
     * @return chargingMode
     */
    public ChargingModeEnum getChargingMode() {
        return chargingMode;
    }

    public void setChargingMode(ChargingModeEnum chargingMode) {
        this.chargingMode = chargingMode;
    }

    public SwitchWebTamperProtectStatusRequestBody withProtectionConfigIdList(List<String> protectionConfigIdList) {
        this.protectionConfigIdList = protectionConfigIdList;
        return this;
    }

    public SwitchWebTamperProtectStatusRequestBody addProtectionConfigIdListItem(String protectionConfigIdListItem) {
        if (this.protectionConfigIdList == null) {
            this.protectionConfigIdList = new ArrayList<>();
        }
        this.protectionConfigIdList.add(protectionConfigIdListItem);
        return this;
    }

    public SwitchWebTamperProtectStatusRequestBody withProtectionConfigIdList(
        Consumer<List<String>> protectionConfigIdListSetter) {
        if (this.protectionConfigIdList == null) {
            this.protectionConfigIdList = new ArrayList<>();
        }
        protectionConfigIdListSetter.accept(this.protectionConfigIdList);
        return this;
    }

    /**
     * 操作的防护配置id列表
     * @return protectionConfigIdList
     */
    public List<String> getProtectionConfigIdList() {
        return protectionConfigIdList;
    }

    public void setProtectionConfigIdList(List<String> protectionConfigIdList) {
        this.protectionConfigIdList = protectionConfigIdList;
    }

    public SwitchWebTamperProtectStatusRequestBody withResourceIdList(List<String> resourceIdList) {
        this.resourceIdList = resourceIdList;
        return this;
    }

    public SwitchWebTamperProtectStatusRequestBody addResourceIdListItem(String resourceIdListItem) {
        if (this.resourceIdList == null) {
            this.resourceIdList = new ArrayList<>();
        }
        this.resourceIdList.add(resourceIdListItem);
        return this;
    }

    public SwitchWebTamperProtectStatusRequestBody withResourceIdList(Consumer<List<String>> resourceIdListSetter) {
        if (this.resourceIdList == null) {
            this.resourceIdList = new ArrayList<>();
        }
        resourceIdListSetter.accept(this.resourceIdList);
        return this;
    }

    /**
     * 配额id列表，开启防护时需要（若开启防护时不传该列表，则随机绑定配额）
     * @return resourceIdList
     */
    public List<String> getResourceIdList() {
        return resourceIdList;
    }

    public void setResourceIdList(List<String> resourceIdList) {
        this.resourceIdList = resourceIdList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SwitchWebTamperProtectStatusRequestBody that = (SwitchWebTamperProtectStatusRequestBody) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.operateType, that.operateType)
            && Objects.equals(this.chargingMode, that.chargingMode)
            && Objects.equals(this.protectionConfigIdList, that.protectionConfigIdList)
            && Objects.equals(this.resourceIdList, that.resourceIdList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, operateType, chargingMode, protectionConfigIdList, resourceIdList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SwitchWebTamperProtectStatusRequestBody {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    operateType: ").append(toIndentedString(operateType)).append("\n");
        sb.append("    chargingMode: ").append(toIndentedString(chargingMode)).append("\n");
        sb.append("    protectionConfigIdList: ").append(toIndentedString(protectionConfigIdList)).append("\n");
        sb.append("    resourceIdList: ").append(toIndentedString(resourceIdList)).append("\n");
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
