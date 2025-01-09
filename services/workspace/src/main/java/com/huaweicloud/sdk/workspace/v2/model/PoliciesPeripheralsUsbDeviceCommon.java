package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * USB和设备智能卡控制选项。
 */
public class PoliciesPeripheralsUsbDeviceCommon {

    /**
     * 是否开启PC/SC智能卡重定向。取值为： Enable：表示已启动。 Closed：表示已关闭。 Disable：表示已禁用。
     */
    public static final class PcscSmartCardEnableEnum {

        /**
         * Enum ENABLE for value: "Enable"
         */
        public static final PcscSmartCardEnableEnum ENABLE = new PcscSmartCardEnableEnum("Enable");

        /**
         * Enum CLOSED for value: "Closed"
         */
        public static final PcscSmartCardEnableEnum CLOSED = new PcscSmartCardEnableEnum("Closed");

        /**
         * Enum DISABLE for value: "Disable"
         */
        public static final PcscSmartCardEnableEnum DISABLE = new PcscSmartCardEnableEnum("Disable");

        private static final Map<String, PcscSmartCardEnableEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PcscSmartCardEnableEnum> createStaticFields() {
            Map<String, PcscSmartCardEnableEnum> map = new HashMap<>();
            map.put("Enable", ENABLE);
            map.put("Closed", CLOSED);
            map.put("Disable", DISABLE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PcscSmartCardEnableEnum(String value) {
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
        public static PcscSmartCardEnableEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PcscSmartCardEnableEnum(value));
        }

        public static PcscSmartCardEnableEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PcscSmartCardEnableEnum) {
                return this.value.equals(((PcscSmartCardEnableEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pcsc_smart_card_enable")

    private PcscSmartCardEnableEnum pcscSmartCardEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "common_options")

    private PoliciesPeripheralsUsbDeviceCommonCommonOptions commonOptions;

    public PoliciesPeripheralsUsbDeviceCommon withPcscSmartCardEnable(PcscSmartCardEnableEnum pcscSmartCardEnable) {
        this.pcscSmartCardEnable = pcscSmartCardEnable;
        return this;
    }

    /**
     * 是否开启PC/SC智能卡重定向。取值为： Enable：表示已启动。 Closed：表示已关闭。 Disable：表示已禁用。
     * @return pcscSmartCardEnable
     */
    public PcscSmartCardEnableEnum getPcscSmartCardEnable() {
        return pcscSmartCardEnable;
    }

    public void setPcscSmartCardEnable(PcscSmartCardEnableEnum pcscSmartCardEnable) {
        this.pcscSmartCardEnable = pcscSmartCardEnable;
    }

    public PoliciesPeripheralsUsbDeviceCommon withCommonOptions(
        PoliciesPeripheralsUsbDeviceCommonCommonOptions commonOptions) {
        this.commonOptions = commonOptions;
        return this;
    }

    public PoliciesPeripheralsUsbDeviceCommon withCommonOptions(
        Consumer<PoliciesPeripheralsUsbDeviceCommonCommonOptions> commonOptionsSetter) {
        if (this.commonOptions == null) {
            this.commonOptions = new PoliciesPeripheralsUsbDeviceCommonCommonOptions();
            commonOptionsSetter.accept(this.commonOptions);
        }

        return this;
    }

    /**
     * Get commonOptions
     * @return commonOptions
     */
    public PoliciesPeripheralsUsbDeviceCommonCommonOptions getCommonOptions() {
        return commonOptions;
    }

    public void setCommonOptions(PoliciesPeripheralsUsbDeviceCommonCommonOptions commonOptions) {
        this.commonOptions = commonOptions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PoliciesPeripheralsUsbDeviceCommon that = (PoliciesPeripheralsUsbDeviceCommon) obj;
        return Objects.equals(this.pcscSmartCardEnable, that.pcscSmartCardEnable)
            && Objects.equals(this.commonOptions, that.commonOptions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pcscSmartCardEnable, commonOptions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PoliciesPeripheralsUsbDeviceCommon {\n");
        sb.append("    pcscSmartCardEnable: ").append(toIndentedString(pcscSmartCardEnable)).append("\n");
        sb.append("    commonOptions: ").append(toIndentedString(commonOptions)).append("\n");
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
