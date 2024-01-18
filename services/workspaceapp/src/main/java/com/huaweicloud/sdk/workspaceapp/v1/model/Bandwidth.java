package com.huaweicloud.sdk.workspaceapp.v1.model;

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
 * Bandwidth
 */
public class Bandwidth {

    /**
     * 智能显示传输。取值为：DISABLE：表示关闭。ENABLE：表示开启。DIAGNOSTIC：诊断模式。
     */
    public static final class IntelligentDataTransportFlagEnum {

        /**
         * Enum DISABLE for value: "DISABLE"
         */
        public static final IntelligentDataTransportFlagEnum DISABLE = new IntelligentDataTransportFlagEnum("DISABLE");

        /**
         * Enum ENABLE for value: "ENABLE"
         */
        public static final IntelligentDataTransportFlagEnum ENABLE = new IntelligentDataTransportFlagEnum("ENABLE");

        /**
         * Enum DIAGNOSTIC for value: "DIAGNOSTIC"
         */
        public static final IntelligentDataTransportFlagEnum DIAGNOSTIC =
            new IntelligentDataTransportFlagEnum("DIAGNOSTIC");

        private static final Map<String, IntelligentDataTransportFlagEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, IntelligentDataTransportFlagEnum> createStaticFields() {
            Map<String, IntelligentDataTransportFlagEnum> map = new HashMap<>();
            map.put("DISABLE", DISABLE);
            map.put("ENABLE", ENABLE);
            map.put("DIAGNOSTIC", DIAGNOSTIC);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        IntelligentDataTransportFlagEnum(String value) {
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
        public static IntelligentDataTransportFlagEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElse(new IntelligentDataTransportFlagEnum(value));
        }

        public static IntelligentDataTransportFlagEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof IntelligentDataTransportFlagEnum) {
                return this.value.equals(((IntelligentDataTransportFlagEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "intelligent_data_transport_flag")

    private IntelligentDataTransportFlagEnum intelligentDataTransportFlag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_bandwidth_control_enable")

    private Boolean totalBandwidthControlEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "options")

    private TotalBandwidthControlOptions options;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_bandwidth_control_enable")

    private Boolean displayBandwidthControlEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_bandwidth_control_options")

    private DisplayBandwidthControlOptions displayBandwidthControlOptions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "multimedia_bandwidth_control_enable")

    private Boolean multimediaBandwidthControlEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "multimedia_bandwidth_control_options")

    private MultimediaBandwidthControlOptions multimediaBandwidthControlOptions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "usb_bandwidth_control_enable")

    private Boolean usbBandwidthControlEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "usb_bandwidth_control_options")

    private UsbBandwidthControlOptions usbBandwidthControlOptions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pcsc_bandwidth_control_enable")

    private Boolean pcscBandwidthControlEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pcsc_bandwidth_control_options")

    private PcscBandwidthControlOptions pcscBandwidthControlOptions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "twain_bandwidth_control_enable")

    private Boolean twainBandwidthControlEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "twain_bandwidth_control_options")

    private TwainBandwidthControlOptions twainBandwidthControlOptions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "printer_bandwidth_control_enable")

    private Boolean printerBandwidthControlEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "printer_bandwidth_control_options")

    private PrinterBandwidthControlOptions printerBandwidthControlOptions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "com_bandwidth_control_enable")

    private Boolean comBandwidthControlEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "com_bandwidth_control_options")

    private ComBandwidthControlOptions comBandwidthControlOptions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_redirection_bandwidth_control_enable")

    private Boolean fileRedirectionBandwidthControlEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_redirection_bandwidth_control_options")

    private FileRedirectionBandwidthControlOptions fileRedirectionBandwidthControlOptions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clipboard_bandwidth_control_enable")

    private Boolean clipboardBandwidthControlEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clipboard_bandwidth_control_options")

    private ClipboardBandwidthControlOptions clipboardBandwidthControlOptions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secure_channel_bandwidth_control_enable")

    private Boolean secureChannelBandwidthControlEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secure_channel_bandwidth_control_options")

    private SecureChannelBandwidthControlOptions secureChannelBandwidthControlOptions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "camera_bandwidth_control_enable")

    private Boolean cameraBandwidthControlEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "camera_bandwidth_control_options")

    private CameraBandwidthControlOptions cameraBandwidthControlOptions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "virtual_channel_bandwidth_control_enable")

    private Boolean virtualChannelBandwidthControlEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "virtual_channel_bandwidth_control_options")

    private VirtualChannelBandwidthControlOptions virtualChannelBandwidthControlOptions;

    public Bandwidth withIntelligentDataTransportFlag(IntelligentDataTransportFlagEnum intelligentDataTransportFlag) {
        this.intelligentDataTransportFlag = intelligentDataTransportFlag;
        return this;
    }

    /**
     * 智能显示传输。取值为：DISABLE：表示关闭。ENABLE：表示开启。DIAGNOSTIC：诊断模式。
     * @return intelligentDataTransportFlag
     */
    public IntelligentDataTransportFlagEnum getIntelligentDataTransportFlag() {
        return intelligentDataTransportFlag;
    }

    public void setIntelligentDataTransportFlag(IntelligentDataTransportFlagEnum intelligentDataTransportFlag) {
        this.intelligentDataTransportFlag = intelligentDataTransportFlag;
    }

    public Bandwidth withTotalBandwidthControlEnable(Boolean totalBandwidthControlEnable) {
        this.totalBandwidthControlEnable = totalBandwidthControlEnable;
        return this;
    }

    /**
     * 是否开启总带宽控制。取值为：false：表示关闭。true：表示开启。
     * @return totalBandwidthControlEnable
     */
    public Boolean getTotalBandwidthControlEnable() {
        return totalBandwidthControlEnable;
    }

    public void setTotalBandwidthControlEnable(Boolean totalBandwidthControlEnable) {
        this.totalBandwidthControlEnable = totalBandwidthControlEnable;
    }

    public Bandwidth withOptions(TotalBandwidthControlOptions options) {
        this.options = options;
        return this;
    }

    public Bandwidth withOptions(Consumer<TotalBandwidthControlOptions> optionsSetter) {
        if (this.options == null) {
            this.options = new TotalBandwidthControlOptions();
            optionsSetter.accept(this.options);
        }

        return this;
    }

    /**
     * Get options
     * @return options
     */
    public TotalBandwidthControlOptions getOptions() {
        return options;
    }

    public void setOptions(TotalBandwidthControlOptions options) {
        this.options = options;
    }

    public Bandwidth withDisplayBandwidthControlEnable(Boolean displayBandwidthControlEnable) {
        this.displayBandwidthControlEnable = displayBandwidthControlEnable;
        return this;
    }

    /**
     * 是否开启显示带宽控制。取值为：false：表示关闭。true：表示开启。
     * @return displayBandwidthControlEnable
     */
    public Boolean getDisplayBandwidthControlEnable() {
        return displayBandwidthControlEnable;
    }

    public void setDisplayBandwidthControlEnable(Boolean displayBandwidthControlEnable) {
        this.displayBandwidthControlEnable = displayBandwidthControlEnable;
    }

    public Bandwidth withDisplayBandwidthControlOptions(DisplayBandwidthControlOptions displayBandwidthControlOptions) {
        this.displayBandwidthControlOptions = displayBandwidthControlOptions;
        return this;
    }

    public Bandwidth withDisplayBandwidthControlOptions(
        Consumer<DisplayBandwidthControlOptions> displayBandwidthControlOptionsSetter) {
        if (this.displayBandwidthControlOptions == null) {
            this.displayBandwidthControlOptions = new DisplayBandwidthControlOptions();
            displayBandwidthControlOptionsSetter.accept(this.displayBandwidthControlOptions);
        }

        return this;
    }

    /**
     * Get displayBandwidthControlOptions
     * @return displayBandwidthControlOptions
     */
    public DisplayBandwidthControlOptions getDisplayBandwidthControlOptions() {
        return displayBandwidthControlOptions;
    }

    public void setDisplayBandwidthControlOptions(DisplayBandwidthControlOptions displayBandwidthControlOptions) {
        this.displayBandwidthControlOptions = displayBandwidthControlOptions;
    }

    public Bandwidth withMultimediaBandwidthControlEnable(Boolean multimediaBandwidthControlEnable) {
        this.multimediaBandwidthControlEnable = multimediaBandwidthControlEnable;
        return this;
    }

    /**
     * 是否开启多媒体带宽控制。取值为：false：表示关闭。true：表示开启。
     * @return multimediaBandwidthControlEnable
     */
    public Boolean getMultimediaBandwidthControlEnable() {
        return multimediaBandwidthControlEnable;
    }

    public void setMultimediaBandwidthControlEnable(Boolean multimediaBandwidthControlEnable) {
        this.multimediaBandwidthControlEnable = multimediaBandwidthControlEnable;
    }

    public Bandwidth withMultimediaBandwidthControlOptions(
        MultimediaBandwidthControlOptions multimediaBandwidthControlOptions) {
        this.multimediaBandwidthControlOptions = multimediaBandwidthControlOptions;
        return this;
    }

    public Bandwidth withMultimediaBandwidthControlOptions(
        Consumer<MultimediaBandwidthControlOptions> multimediaBandwidthControlOptionsSetter) {
        if (this.multimediaBandwidthControlOptions == null) {
            this.multimediaBandwidthControlOptions = new MultimediaBandwidthControlOptions();
            multimediaBandwidthControlOptionsSetter.accept(this.multimediaBandwidthControlOptions);
        }

        return this;
    }

    /**
     * Get multimediaBandwidthControlOptions
     * @return multimediaBandwidthControlOptions
     */
    public MultimediaBandwidthControlOptions getMultimediaBandwidthControlOptions() {
        return multimediaBandwidthControlOptions;
    }

    public void setMultimediaBandwidthControlOptions(
        MultimediaBandwidthControlOptions multimediaBandwidthControlOptions) {
        this.multimediaBandwidthControlOptions = multimediaBandwidthControlOptions;
    }

    public Bandwidth withUsbBandwidthControlEnable(Boolean usbBandwidthControlEnable) {
        this.usbBandwidthControlEnable = usbBandwidthControlEnable;
        return this;
    }

    /**
     * 是否开启USB带宽控制。取值为：false：表示关闭。true：表示开启。
     * @return usbBandwidthControlEnable
     */
    public Boolean getUsbBandwidthControlEnable() {
        return usbBandwidthControlEnable;
    }

    public void setUsbBandwidthControlEnable(Boolean usbBandwidthControlEnable) {
        this.usbBandwidthControlEnable = usbBandwidthControlEnable;
    }

    public Bandwidth withUsbBandwidthControlOptions(UsbBandwidthControlOptions usbBandwidthControlOptions) {
        this.usbBandwidthControlOptions = usbBandwidthControlOptions;
        return this;
    }

    public Bandwidth withUsbBandwidthControlOptions(
        Consumer<UsbBandwidthControlOptions> usbBandwidthControlOptionsSetter) {
        if (this.usbBandwidthControlOptions == null) {
            this.usbBandwidthControlOptions = new UsbBandwidthControlOptions();
            usbBandwidthControlOptionsSetter.accept(this.usbBandwidthControlOptions);
        }

        return this;
    }

    /**
     * Get usbBandwidthControlOptions
     * @return usbBandwidthControlOptions
     */
    public UsbBandwidthControlOptions getUsbBandwidthControlOptions() {
        return usbBandwidthControlOptions;
    }

    public void setUsbBandwidthControlOptions(UsbBandwidthControlOptions usbBandwidthControlOptions) {
        this.usbBandwidthControlOptions = usbBandwidthControlOptions;
    }

    public Bandwidth withPcscBandwidthControlEnable(Boolean pcscBandwidthControlEnable) {
        this.pcscBandwidthControlEnable = pcscBandwidthControlEnable;
        return this;
    }

    /**
     * 是否开启PCSC控制。取值为：false：表示关闭。true：表示开启。
     * @return pcscBandwidthControlEnable
     */
    public Boolean getPcscBandwidthControlEnable() {
        return pcscBandwidthControlEnable;
    }

    public void setPcscBandwidthControlEnable(Boolean pcscBandwidthControlEnable) {
        this.pcscBandwidthControlEnable = pcscBandwidthControlEnable;
    }

    public Bandwidth withPcscBandwidthControlOptions(PcscBandwidthControlOptions pcscBandwidthControlOptions) {
        this.pcscBandwidthControlOptions = pcscBandwidthControlOptions;
        return this;
    }

    public Bandwidth withPcscBandwidthControlOptions(
        Consumer<PcscBandwidthControlOptions> pcscBandwidthControlOptionsSetter) {
        if (this.pcscBandwidthControlOptions == null) {
            this.pcscBandwidthControlOptions = new PcscBandwidthControlOptions();
            pcscBandwidthControlOptionsSetter.accept(this.pcscBandwidthControlOptions);
        }

        return this;
    }

    /**
     * Get pcscBandwidthControlOptions
     * @return pcscBandwidthControlOptions
     */
    public PcscBandwidthControlOptions getPcscBandwidthControlOptions() {
        return pcscBandwidthControlOptions;
    }

    public void setPcscBandwidthControlOptions(PcscBandwidthControlOptions pcscBandwidthControlOptions) {
        this.pcscBandwidthControlOptions = pcscBandwidthControlOptions;
    }

    public Bandwidth withTwainBandwidthControlEnable(Boolean twainBandwidthControlEnable) {
        this.twainBandwidthControlEnable = twainBandwidthControlEnable;
        return this;
    }

    /**
     * 是否开启TWAIN带宽控制。取值为：false：表示关闭。true：表示开启。
     * @return twainBandwidthControlEnable
     */
    public Boolean getTwainBandwidthControlEnable() {
        return twainBandwidthControlEnable;
    }

    public void setTwainBandwidthControlEnable(Boolean twainBandwidthControlEnable) {
        this.twainBandwidthControlEnable = twainBandwidthControlEnable;
    }

    public Bandwidth withTwainBandwidthControlOptions(TwainBandwidthControlOptions twainBandwidthControlOptions) {
        this.twainBandwidthControlOptions = twainBandwidthControlOptions;
        return this;
    }

    public Bandwidth withTwainBandwidthControlOptions(
        Consumer<TwainBandwidthControlOptions> twainBandwidthControlOptionsSetter) {
        if (this.twainBandwidthControlOptions == null) {
            this.twainBandwidthControlOptions = new TwainBandwidthControlOptions();
            twainBandwidthControlOptionsSetter.accept(this.twainBandwidthControlOptions);
        }

        return this;
    }

    /**
     * Get twainBandwidthControlOptions
     * @return twainBandwidthControlOptions
     */
    public TwainBandwidthControlOptions getTwainBandwidthControlOptions() {
        return twainBandwidthControlOptions;
    }

    public void setTwainBandwidthControlOptions(TwainBandwidthControlOptions twainBandwidthControlOptions) {
        this.twainBandwidthControlOptions = twainBandwidthControlOptions;
    }

    public Bandwidth withPrinterBandwidthControlEnable(Boolean printerBandwidthControlEnable) {
        this.printerBandwidthControlEnable = printerBandwidthControlEnable;
        return this;
    }

    /**
     * 是否开启打印机带宽控制。取值为：false：表示关闭。true：表示开启。
     * @return printerBandwidthControlEnable
     */
    public Boolean getPrinterBandwidthControlEnable() {
        return printerBandwidthControlEnable;
    }

    public void setPrinterBandwidthControlEnable(Boolean printerBandwidthControlEnable) {
        this.printerBandwidthControlEnable = printerBandwidthControlEnable;
    }

    public Bandwidth withPrinterBandwidthControlOptions(PrinterBandwidthControlOptions printerBandwidthControlOptions) {
        this.printerBandwidthControlOptions = printerBandwidthControlOptions;
        return this;
    }

    public Bandwidth withPrinterBandwidthControlOptions(
        Consumer<PrinterBandwidthControlOptions> printerBandwidthControlOptionsSetter) {
        if (this.printerBandwidthControlOptions == null) {
            this.printerBandwidthControlOptions = new PrinterBandwidthControlOptions();
            printerBandwidthControlOptionsSetter.accept(this.printerBandwidthControlOptions);
        }

        return this;
    }

    /**
     * Get printerBandwidthControlOptions
     * @return printerBandwidthControlOptions
     */
    public PrinterBandwidthControlOptions getPrinterBandwidthControlOptions() {
        return printerBandwidthControlOptions;
    }

    public void setPrinterBandwidthControlOptions(PrinterBandwidthControlOptions printerBandwidthControlOptions) {
        this.printerBandwidthControlOptions = printerBandwidthControlOptions;
    }

    public Bandwidth withComBandwidthControlEnable(Boolean comBandwidthControlEnable) {
        this.comBandwidthControlEnable = comBandwidthControlEnable;
        return this;
    }

    /**
     * 是否开启串口带宽控制。取值为：false：表示关闭。true：表示开启。
     * @return comBandwidthControlEnable
     */
    public Boolean getComBandwidthControlEnable() {
        return comBandwidthControlEnable;
    }

    public void setComBandwidthControlEnable(Boolean comBandwidthControlEnable) {
        this.comBandwidthControlEnable = comBandwidthControlEnable;
    }

    public Bandwidth withComBandwidthControlOptions(ComBandwidthControlOptions comBandwidthControlOptions) {
        this.comBandwidthControlOptions = comBandwidthControlOptions;
        return this;
    }

    public Bandwidth withComBandwidthControlOptions(
        Consumer<ComBandwidthControlOptions> comBandwidthControlOptionsSetter) {
        if (this.comBandwidthControlOptions == null) {
            this.comBandwidthControlOptions = new ComBandwidthControlOptions();
            comBandwidthControlOptionsSetter.accept(this.comBandwidthControlOptions);
        }

        return this;
    }

    /**
     * Get comBandwidthControlOptions
     * @return comBandwidthControlOptions
     */
    public ComBandwidthControlOptions getComBandwidthControlOptions() {
        return comBandwidthControlOptions;
    }

    public void setComBandwidthControlOptions(ComBandwidthControlOptions comBandwidthControlOptions) {
        this.comBandwidthControlOptions = comBandwidthControlOptions;
    }

    public Bandwidth withFileRedirectionBandwidthControlEnable(Boolean fileRedirectionBandwidthControlEnable) {
        this.fileRedirectionBandwidthControlEnable = fileRedirectionBandwidthControlEnable;
        return this;
    }

    /**
     * 是否开启文件重定向带宽控制。取值为：false：表示关闭。true：表示开启
     * @return fileRedirectionBandwidthControlEnable
     */
    public Boolean getFileRedirectionBandwidthControlEnable() {
        return fileRedirectionBandwidthControlEnable;
    }

    public void setFileRedirectionBandwidthControlEnable(Boolean fileRedirectionBandwidthControlEnable) {
        this.fileRedirectionBandwidthControlEnable = fileRedirectionBandwidthControlEnable;
    }

    public Bandwidth withFileRedirectionBandwidthControlOptions(
        FileRedirectionBandwidthControlOptions fileRedirectionBandwidthControlOptions) {
        this.fileRedirectionBandwidthControlOptions = fileRedirectionBandwidthControlOptions;
        return this;
    }

    public Bandwidth withFileRedirectionBandwidthControlOptions(
        Consumer<FileRedirectionBandwidthControlOptions> fileRedirectionBandwidthControlOptionsSetter) {
        if (this.fileRedirectionBandwidthControlOptions == null) {
            this.fileRedirectionBandwidthControlOptions = new FileRedirectionBandwidthControlOptions();
            fileRedirectionBandwidthControlOptionsSetter.accept(this.fileRedirectionBandwidthControlOptions);
        }

        return this;
    }

    /**
     * Get fileRedirectionBandwidthControlOptions
     * @return fileRedirectionBandwidthControlOptions
     */
    public FileRedirectionBandwidthControlOptions getFileRedirectionBandwidthControlOptions() {
        return fileRedirectionBandwidthControlOptions;
    }

    public void setFileRedirectionBandwidthControlOptions(
        FileRedirectionBandwidthControlOptions fileRedirectionBandwidthControlOptions) {
        this.fileRedirectionBandwidthControlOptions = fileRedirectionBandwidthControlOptions;
    }

    public Bandwidth withClipboardBandwidthControlEnable(Boolean clipboardBandwidthControlEnable) {
        this.clipboardBandwidthControlEnable = clipboardBandwidthControlEnable;
        return this;
    }

    /**
     * 是否开启剪切板带宽控制。取值为：false：表示关闭。true：表示开启。
     * @return clipboardBandwidthControlEnable
     */
    public Boolean getClipboardBandwidthControlEnable() {
        return clipboardBandwidthControlEnable;
    }

    public void setClipboardBandwidthControlEnable(Boolean clipboardBandwidthControlEnable) {
        this.clipboardBandwidthControlEnable = clipboardBandwidthControlEnable;
    }

    public Bandwidth withClipboardBandwidthControlOptions(
        ClipboardBandwidthControlOptions clipboardBandwidthControlOptions) {
        this.clipboardBandwidthControlOptions = clipboardBandwidthControlOptions;
        return this;
    }

    public Bandwidth withClipboardBandwidthControlOptions(
        Consumer<ClipboardBandwidthControlOptions> clipboardBandwidthControlOptionsSetter) {
        if (this.clipboardBandwidthControlOptions == null) {
            this.clipboardBandwidthControlOptions = new ClipboardBandwidthControlOptions();
            clipboardBandwidthControlOptionsSetter.accept(this.clipboardBandwidthControlOptions);
        }

        return this;
    }

    /**
     * Get clipboardBandwidthControlOptions
     * @return clipboardBandwidthControlOptions
     */
    public ClipboardBandwidthControlOptions getClipboardBandwidthControlOptions() {
        return clipboardBandwidthControlOptions;
    }

    public void setClipboardBandwidthControlOptions(ClipboardBandwidthControlOptions clipboardBandwidthControlOptions) {
        this.clipboardBandwidthControlOptions = clipboardBandwidthControlOptions;
    }

    public Bandwidth withSecureChannelBandwidthControlEnable(Boolean secureChannelBandwidthControlEnable) {
        this.secureChannelBandwidthControlEnable = secureChannelBandwidthControlEnable;
        return this;
    }

    /**
     * 是否开启安全通道带宽控制。取值为：false：表示关闭。true：表示开启。
     * @return secureChannelBandwidthControlEnable
     */
    public Boolean getSecureChannelBandwidthControlEnable() {
        return secureChannelBandwidthControlEnable;
    }

    public void setSecureChannelBandwidthControlEnable(Boolean secureChannelBandwidthControlEnable) {
        this.secureChannelBandwidthControlEnable = secureChannelBandwidthControlEnable;
    }

    public Bandwidth withSecureChannelBandwidthControlOptions(
        SecureChannelBandwidthControlOptions secureChannelBandwidthControlOptions) {
        this.secureChannelBandwidthControlOptions = secureChannelBandwidthControlOptions;
        return this;
    }

    public Bandwidth withSecureChannelBandwidthControlOptions(
        Consumer<SecureChannelBandwidthControlOptions> secureChannelBandwidthControlOptionsSetter) {
        if (this.secureChannelBandwidthControlOptions == null) {
            this.secureChannelBandwidthControlOptions = new SecureChannelBandwidthControlOptions();
            secureChannelBandwidthControlOptionsSetter.accept(this.secureChannelBandwidthControlOptions);
        }

        return this;
    }

    /**
     * Get secureChannelBandwidthControlOptions
     * @return secureChannelBandwidthControlOptions
     */
    public SecureChannelBandwidthControlOptions getSecureChannelBandwidthControlOptions() {
        return secureChannelBandwidthControlOptions;
    }

    public void setSecureChannelBandwidthControlOptions(
        SecureChannelBandwidthControlOptions secureChannelBandwidthControlOptions) {
        this.secureChannelBandwidthControlOptions = secureChannelBandwidthControlOptions;
    }

    public Bandwidth withCameraBandwidthControlEnable(Boolean cameraBandwidthControlEnable) {
        this.cameraBandwidthControlEnable = cameraBandwidthControlEnable;
        return this;
    }

    /**
     * 是否开启摄像头带宽控制。取值为：false：表示关闭。true：表示开启。
     * @return cameraBandwidthControlEnable
     */
    public Boolean getCameraBandwidthControlEnable() {
        return cameraBandwidthControlEnable;
    }

    public void setCameraBandwidthControlEnable(Boolean cameraBandwidthControlEnable) {
        this.cameraBandwidthControlEnable = cameraBandwidthControlEnable;
    }

    public Bandwidth withCameraBandwidthControlOptions(CameraBandwidthControlOptions cameraBandwidthControlOptions) {
        this.cameraBandwidthControlOptions = cameraBandwidthControlOptions;
        return this;
    }

    public Bandwidth withCameraBandwidthControlOptions(
        Consumer<CameraBandwidthControlOptions> cameraBandwidthControlOptionsSetter) {
        if (this.cameraBandwidthControlOptions == null) {
            this.cameraBandwidthControlOptions = new CameraBandwidthControlOptions();
            cameraBandwidthControlOptionsSetter.accept(this.cameraBandwidthControlOptions);
        }

        return this;
    }

    /**
     * Get cameraBandwidthControlOptions
     * @return cameraBandwidthControlOptions
     */
    public CameraBandwidthControlOptions getCameraBandwidthControlOptions() {
        return cameraBandwidthControlOptions;
    }

    public void setCameraBandwidthControlOptions(CameraBandwidthControlOptions cameraBandwidthControlOptions) {
        this.cameraBandwidthControlOptions = cameraBandwidthControlOptions;
    }

    public Bandwidth withVirtualChannelBandwidthControlEnable(Boolean virtualChannelBandwidthControlEnable) {
        this.virtualChannelBandwidthControlEnable = virtualChannelBandwidthControlEnable;
        return this;
    }

    /**
     * 是否开启虚拟通道带宽控制。取值为：false：表示关闭。true：表示开启。
     * @return virtualChannelBandwidthControlEnable
     */
    public Boolean getVirtualChannelBandwidthControlEnable() {
        return virtualChannelBandwidthControlEnable;
    }

    public void setVirtualChannelBandwidthControlEnable(Boolean virtualChannelBandwidthControlEnable) {
        this.virtualChannelBandwidthControlEnable = virtualChannelBandwidthControlEnable;
    }

    public Bandwidth withVirtualChannelBandwidthControlOptions(
        VirtualChannelBandwidthControlOptions virtualChannelBandwidthControlOptions) {
        this.virtualChannelBandwidthControlOptions = virtualChannelBandwidthControlOptions;
        return this;
    }

    public Bandwidth withVirtualChannelBandwidthControlOptions(
        Consumer<VirtualChannelBandwidthControlOptions> virtualChannelBandwidthControlOptionsSetter) {
        if (this.virtualChannelBandwidthControlOptions == null) {
            this.virtualChannelBandwidthControlOptions = new VirtualChannelBandwidthControlOptions();
            virtualChannelBandwidthControlOptionsSetter.accept(this.virtualChannelBandwidthControlOptions);
        }

        return this;
    }

    /**
     * Get virtualChannelBandwidthControlOptions
     * @return virtualChannelBandwidthControlOptions
     */
    public VirtualChannelBandwidthControlOptions getVirtualChannelBandwidthControlOptions() {
        return virtualChannelBandwidthControlOptions;
    }

    public void setVirtualChannelBandwidthControlOptions(
        VirtualChannelBandwidthControlOptions virtualChannelBandwidthControlOptions) {
        this.virtualChannelBandwidthControlOptions = virtualChannelBandwidthControlOptions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Bandwidth that = (Bandwidth) obj;
        return Objects.equals(this.intelligentDataTransportFlag, that.intelligentDataTransportFlag)
            && Objects.equals(this.totalBandwidthControlEnable, that.totalBandwidthControlEnable)
            && Objects.equals(this.options, that.options)
            && Objects.equals(this.displayBandwidthControlEnable, that.displayBandwidthControlEnable)
            && Objects.equals(this.displayBandwidthControlOptions, that.displayBandwidthControlOptions)
            && Objects.equals(this.multimediaBandwidthControlEnable, that.multimediaBandwidthControlEnable)
            && Objects.equals(this.multimediaBandwidthControlOptions, that.multimediaBandwidthControlOptions)
            && Objects.equals(this.usbBandwidthControlEnable, that.usbBandwidthControlEnable)
            && Objects.equals(this.usbBandwidthControlOptions, that.usbBandwidthControlOptions)
            && Objects.equals(this.pcscBandwidthControlEnable, that.pcscBandwidthControlEnable)
            && Objects.equals(this.pcscBandwidthControlOptions, that.pcscBandwidthControlOptions)
            && Objects.equals(this.twainBandwidthControlEnable, that.twainBandwidthControlEnable)
            && Objects.equals(this.twainBandwidthControlOptions, that.twainBandwidthControlOptions)
            && Objects.equals(this.printerBandwidthControlEnable, that.printerBandwidthControlEnable)
            && Objects.equals(this.printerBandwidthControlOptions, that.printerBandwidthControlOptions)
            && Objects.equals(this.comBandwidthControlEnable, that.comBandwidthControlEnable)
            && Objects.equals(this.comBandwidthControlOptions, that.comBandwidthControlOptions)
            && Objects.equals(this.fileRedirectionBandwidthControlEnable, that.fileRedirectionBandwidthControlEnable)
            && Objects.equals(this.fileRedirectionBandwidthControlOptions, that.fileRedirectionBandwidthControlOptions)
            && Objects.equals(this.clipboardBandwidthControlEnable, that.clipboardBandwidthControlEnable)
            && Objects.equals(this.clipboardBandwidthControlOptions, that.clipboardBandwidthControlOptions)
            && Objects.equals(this.secureChannelBandwidthControlEnable, that.secureChannelBandwidthControlEnable)
            && Objects.equals(this.secureChannelBandwidthControlOptions, that.secureChannelBandwidthControlOptions)
            && Objects.equals(this.cameraBandwidthControlEnable, that.cameraBandwidthControlEnable)
            && Objects.equals(this.cameraBandwidthControlOptions, that.cameraBandwidthControlOptions)
            && Objects.equals(this.virtualChannelBandwidthControlEnable, that.virtualChannelBandwidthControlEnable)
            && Objects.equals(this.virtualChannelBandwidthControlOptions, that.virtualChannelBandwidthControlOptions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(intelligentDataTransportFlag,
            totalBandwidthControlEnable,
            options,
            displayBandwidthControlEnable,
            displayBandwidthControlOptions,
            multimediaBandwidthControlEnable,
            multimediaBandwidthControlOptions,
            usbBandwidthControlEnable,
            usbBandwidthControlOptions,
            pcscBandwidthControlEnable,
            pcscBandwidthControlOptions,
            twainBandwidthControlEnable,
            twainBandwidthControlOptions,
            printerBandwidthControlEnable,
            printerBandwidthControlOptions,
            comBandwidthControlEnable,
            comBandwidthControlOptions,
            fileRedirectionBandwidthControlEnable,
            fileRedirectionBandwidthControlOptions,
            clipboardBandwidthControlEnable,
            clipboardBandwidthControlOptions,
            secureChannelBandwidthControlEnable,
            secureChannelBandwidthControlOptions,
            cameraBandwidthControlEnable,
            cameraBandwidthControlOptions,
            virtualChannelBandwidthControlEnable,
            virtualChannelBandwidthControlOptions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Bandwidth {\n");
        sb.append("    intelligentDataTransportFlag: ")
            .append(toIndentedString(intelligentDataTransportFlag))
            .append("\n");
        sb.append("    totalBandwidthControlEnable: ")
            .append(toIndentedString(totalBandwidthControlEnable))
            .append("\n");
        sb.append("    options: ").append(toIndentedString(options)).append("\n");
        sb.append("    displayBandwidthControlEnable: ")
            .append(toIndentedString(displayBandwidthControlEnable))
            .append("\n");
        sb.append("    displayBandwidthControlOptions: ")
            .append(toIndentedString(displayBandwidthControlOptions))
            .append("\n");
        sb.append("    multimediaBandwidthControlEnable: ")
            .append(toIndentedString(multimediaBandwidthControlEnable))
            .append("\n");
        sb.append("    multimediaBandwidthControlOptions: ")
            .append(toIndentedString(multimediaBandwidthControlOptions))
            .append("\n");
        sb.append("    usbBandwidthControlEnable: ").append(toIndentedString(usbBandwidthControlEnable)).append("\n");
        sb.append("    usbBandwidthControlOptions: ").append(toIndentedString(usbBandwidthControlOptions)).append("\n");
        sb.append("    pcscBandwidthControlEnable: ").append(toIndentedString(pcscBandwidthControlEnable)).append("\n");
        sb.append("    pcscBandwidthControlOptions: ")
            .append(toIndentedString(pcscBandwidthControlOptions))
            .append("\n");
        sb.append("    twainBandwidthControlEnable: ")
            .append(toIndentedString(twainBandwidthControlEnable))
            .append("\n");
        sb.append("    twainBandwidthControlOptions: ")
            .append(toIndentedString(twainBandwidthControlOptions))
            .append("\n");
        sb.append("    printerBandwidthControlEnable: ")
            .append(toIndentedString(printerBandwidthControlEnable))
            .append("\n");
        sb.append("    printerBandwidthControlOptions: ")
            .append(toIndentedString(printerBandwidthControlOptions))
            .append("\n");
        sb.append("    comBandwidthControlEnable: ").append(toIndentedString(comBandwidthControlEnable)).append("\n");
        sb.append("    comBandwidthControlOptions: ").append(toIndentedString(comBandwidthControlOptions)).append("\n");
        sb.append("    fileRedirectionBandwidthControlEnable: ")
            .append(toIndentedString(fileRedirectionBandwidthControlEnable))
            .append("\n");
        sb.append("    fileRedirectionBandwidthControlOptions: ")
            .append(toIndentedString(fileRedirectionBandwidthControlOptions))
            .append("\n");
        sb.append("    clipboardBandwidthControlEnable: ")
            .append(toIndentedString(clipboardBandwidthControlEnable))
            .append("\n");
        sb.append("    clipboardBandwidthControlOptions: ")
            .append(toIndentedString(clipboardBandwidthControlOptions))
            .append("\n");
        sb.append("    secureChannelBandwidthControlEnable: ")
            .append(toIndentedString(secureChannelBandwidthControlEnable))
            .append("\n");
        sb.append("    secureChannelBandwidthControlOptions: ")
            .append(toIndentedString(secureChannelBandwidthControlOptions))
            .append("\n");
        sb.append("    cameraBandwidthControlEnable: ")
            .append(toIndentedString(cameraBandwidthControlEnable))
            .append("\n");
        sb.append("    cameraBandwidthControlOptions: ")
            .append(toIndentedString(cameraBandwidthControlOptions))
            .append("\n");
        sb.append("    virtualChannelBandwidthControlEnable: ")
            .append(toIndentedString(virtualChannelBandwidthControlEnable))
            .append("\n");
        sb.append("    virtualChannelBandwidthControlOptions: ")
            .append(toIndentedString(virtualChannelBandwidthControlOptions))
            .append("\n");
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
