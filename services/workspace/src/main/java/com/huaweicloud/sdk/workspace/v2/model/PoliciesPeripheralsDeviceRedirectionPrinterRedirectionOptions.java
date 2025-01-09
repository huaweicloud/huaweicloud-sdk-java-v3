package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 打印机设备重定向控制的选项。
 */
public class PoliciesPeripheralsDeviceRedirectionPrinterRedirectionOptions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mobile_printer_enable")

    private Boolean mobilePrinterEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "print_data_compression_mode")

    private Boolean printDataCompressionMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sync_client_default_printer_enable")

    private Boolean syncClientDefaultPrinterEnable;

    /**
     * 通用打印机驱动。取值为：Default：linux客户端选择Universal Printing PS，windows客户端选择HDP XPSDrv Driver。HDP XPSDrv Driver。Universal Printing PCL 5。Universal Printing PCL 6。Universal Printing PS。
     */
    public static final class UniversalPrinterDriverEnum {

        /**
         * Enum DEFAULT for value: "Default"
         */
        public static final UniversalPrinterDriverEnum DEFAULT = new UniversalPrinterDriverEnum("Default");

        /**
         * Enum HDP_XPSDRV_DRIVER for value: "HDP XPSDrv Driver"
         */
        public static final UniversalPrinterDriverEnum HDP_XPSDRV_DRIVER =
            new UniversalPrinterDriverEnum("HDP XPSDrv Driver");

        /**
         * Enum UNIVERSAL_PRINTING_PCL_5 for value: "Universal Printing PCL 5"
         */
        public static final UniversalPrinterDriverEnum UNIVERSAL_PRINTING_PCL_5 =
            new UniversalPrinterDriverEnum("Universal Printing PCL 5");

        /**
         * Enum UNIVERSAL_PRINTING_PCL_6 for value: "Universal Printing PCL 6"
         */
        public static final UniversalPrinterDriverEnum UNIVERSAL_PRINTING_PCL_6 =
            new UniversalPrinterDriverEnum("Universal Printing PCL 6");

        /**
         * Enum UNIVERSAL_PRINTING_PS for value: "Universal Printing PS"
         */
        public static final UniversalPrinterDriverEnum UNIVERSAL_PRINTING_PS =
            new UniversalPrinterDriverEnum("Universal Printing PS");

        private static final Map<String, UniversalPrinterDriverEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, UniversalPrinterDriverEnum> createStaticFields() {
            Map<String, UniversalPrinterDriverEnum> map = new HashMap<>();
            map.put("Default", DEFAULT);
            map.put("HDP XPSDrv Driver", HDP_XPSDRV_DRIVER);
            map.put("Universal Printing PCL 5", UNIVERSAL_PRINTING_PCL_5);
            map.put("Universal Printing PCL 6", UNIVERSAL_PRINTING_PCL_6);
            map.put("Universal Printing PS", UNIVERSAL_PRINTING_PS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        UniversalPrinterDriverEnum(String value) {
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
        public static UniversalPrinterDriverEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElse(new UniversalPrinterDriverEnum(value));
        }

        public static UniversalPrinterDriverEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof UniversalPrinterDriverEnum) {
                return this.value.equals(((UniversalPrinterDriverEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "universal_printer_driver")

    private UniversalPrinterDriverEnum universalPrinterDriver;

    public PoliciesPeripheralsDeviceRedirectionPrinterRedirectionOptions withMobilePrinterEnable(
        Boolean mobilePrinterEnable) {
        this.mobilePrinterEnable = mobilePrinterEnable;
        return this;
    }

    /**
     * 移动客户端打印机重定向。取值为： false：表示关闭。 true：表示开启。
     * @return mobilePrinterEnable
     */
    public Boolean getMobilePrinterEnable() {
        return mobilePrinterEnable;
    }

    public void setMobilePrinterEnable(Boolean mobilePrinterEnable) {
        this.mobilePrinterEnable = mobilePrinterEnable;
    }

    public PoliciesPeripheralsDeviceRedirectionPrinterRedirectionOptions withPrintDataCompressionMode(
        Boolean printDataCompressionMode) {
        this.printDataCompressionMode = printDataCompressionMode;
        return this;
    }

    /**
     * 是否开启打印数据压缩模式。取值为： false：表示关闭。 true：表示开启。
     * @return printDataCompressionMode
     */
    public Boolean getPrintDataCompressionMode() {
        return printDataCompressionMode;
    }

    public void setPrintDataCompressionMode(Boolean printDataCompressionMode) {
        this.printDataCompressionMode = printDataCompressionMode;
    }

    public PoliciesPeripheralsDeviceRedirectionPrinterRedirectionOptions withSyncClientDefaultPrinterEnable(
        Boolean syncClientDefaultPrinterEnable) {
        this.syncClientDefaultPrinterEnable = syncClientDefaultPrinterEnable;
        return this;
    }

    /**
     * 是否开启同步客户端默认打印机。取值为： false：表示关闭。 true：表示开启。
     * @return syncClientDefaultPrinterEnable
     */
    public Boolean getSyncClientDefaultPrinterEnable() {
        return syncClientDefaultPrinterEnable;
    }

    public void setSyncClientDefaultPrinterEnable(Boolean syncClientDefaultPrinterEnable) {
        this.syncClientDefaultPrinterEnable = syncClientDefaultPrinterEnable;
    }

    public PoliciesPeripheralsDeviceRedirectionPrinterRedirectionOptions withUniversalPrinterDriver(
        UniversalPrinterDriverEnum universalPrinterDriver) {
        this.universalPrinterDriver = universalPrinterDriver;
        return this;
    }

    /**
     * 通用打印机驱动。取值为：Default：linux客户端选择Universal Printing PS，windows客户端选择HDP XPSDrv Driver。HDP XPSDrv Driver。Universal Printing PCL 5。Universal Printing PCL 6。Universal Printing PS。
     * @return universalPrinterDriver
     */
    public UniversalPrinterDriverEnum getUniversalPrinterDriver() {
        return universalPrinterDriver;
    }

    public void setUniversalPrinterDriver(UniversalPrinterDriverEnum universalPrinterDriver) {
        this.universalPrinterDriver = universalPrinterDriver;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PoliciesPeripheralsDeviceRedirectionPrinterRedirectionOptions that =
            (PoliciesPeripheralsDeviceRedirectionPrinterRedirectionOptions) obj;
        return Objects.equals(this.mobilePrinterEnable, that.mobilePrinterEnable)
            && Objects.equals(this.printDataCompressionMode, that.printDataCompressionMode)
            && Objects.equals(this.syncClientDefaultPrinterEnable, that.syncClientDefaultPrinterEnable)
            && Objects.equals(this.universalPrinterDriver, that.universalPrinterDriver);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mobilePrinterEnable,
            printDataCompressionMode,
            syncClientDefaultPrinterEnable,
            universalPrinterDriver);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PoliciesPeripheralsDeviceRedirectionPrinterRedirectionOptions {\n");
        sb.append("    mobilePrinterEnable: ").append(toIndentedString(mobilePrinterEnable)).append("\n");
        sb.append("    printDataCompressionMode: ").append(toIndentedString(printDataCompressionMode)).append("\n");
        sb.append("    syncClientDefaultPrinterEnable: ")
            .append(toIndentedString(syncClientDefaultPrinterEnable))
            .append("\n");
        sb.append("    universalPrinterDriver: ").append(toIndentedString(universalPrinterDriver)).append("\n");
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
