package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * TotalBandwidthControlOptions
 */
public class TotalBandwidthControlOptions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_bandwidth_control_value")

    private Integer totalBandwidthControlValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_bandwidth_percentage_enable")

    private Boolean displayBandwidthPercentageEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_bandwidth_percentage_options")

    private DisplayBandwidthPercentageOptions displayBandwidthPercentageOptions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "multimedia_bandwidth_percentage_enable")

    private Boolean multimediaBandwidthPercentageEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "multimedia_bandwidth_percentage_options")

    private MultimediaBandwidthPercentageOptions multimediaBandwidthPercentageOptions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "usb_bandwidth_percentage_enable")

    private Boolean usbBandwidthPercentageEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "usb_bandwidth_percentage_options")

    private UsbBandwidthPercentageOptions usbBandwidthPercentageOptions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pcsc_bandwidth_percentage_enable")

    private Boolean pcscBandwidthPercentageEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pcsc_bandwidth_percentage_options")

    private PcscBandwidthPercentageOptions pcscBandwidthPercentageOptions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "twain_bandwidth_percentage_enable")

    private Boolean twainBandwidthPercentageEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "twain_bandwidth_percentage_options")

    private TwainBandwidthPercentageOptions twainBandwidthPercentageOptions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "printer_bandwidth_percentage_enable")

    private Boolean printerBandwidthPercentageEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "printer_bandwidth_percentage_options")

    private PrinterBandwidthPercentageOptions printerBandwidthPercentageOptions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "com_bandwidth_percentage_enable")

    private Boolean comBandwidthPercentageEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "com_bandwidth_percentage_options")

    private ComBandwidthPercentageOptions comBandwidthPercentageOptions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_redirection_bandwidth_percentage_enable")

    private Boolean fileRedirectionBandwidthPercentageEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_redirection_bandwidth_percentage_options")

    private FileRedirectionBandwidthPercentageOptions fileRedirectionBandwidthPercentageOptions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clipboard_bandwidth_percentage_enable")

    private Boolean clipboardBandwidthPercentageEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clipboard_bandwidth_percentage_options")

    private ClipboardBandwidthPercentageOptions clipboardBandwidthPercentageOptions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secure_channel_bandwidth_percentage_enable")

    private Boolean secureChannelBandwidthPercentageEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secure_channel_bandwidth_percentage_options")

    private SecureChannelBandwidthPercentageOptions secureChannelBandwidthPercentageOptions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "camera_bandwidth_percentage_enable")

    private Boolean cameraBandwidthPercentageEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "camera_bandwidth_percentage_options")

    private CameraBandwidthPercentageOptions cameraBandwidthPercentageOptions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "virtual_channel_bandwidth_percentage_enable")

    private Boolean virtualChannelBandwidthPercentageEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "virtual_channel_bandwidth_percentage_options")

    private VirtualChannelBandwidthPercentageOptions virtualChannelBandwidthPercentageOptions;

    public TotalBandwidthControlOptions withTotalBandwidthControlValue(Integer totalBandwidthControlValue) {
        this.totalBandwidthControlValue = totalBandwidthControlValue;
        return this;
    }

    /**
     * 总带宽控制量（Kbps）。取值范围为[10000-1000000]。默认：30000。
     * minimum: 10000
     * maximum: 1000000
     * @return totalBandwidthControlValue
     */
    public Integer getTotalBandwidthControlValue() {
        return totalBandwidthControlValue;
    }

    public void setTotalBandwidthControlValue(Integer totalBandwidthControlValue) {
        this.totalBandwidthControlValue = totalBandwidthControlValue;
    }

    public TotalBandwidthControlOptions withDisplayBandwidthPercentageEnable(Boolean displayBandwidthPercentageEnable) {
        this.displayBandwidthPercentageEnable = displayBandwidthPercentageEnable;
        return this;
    }

    /**
     * 显示带宽百分比控制。取值为：false：表示关闭。true：表示开启。
     * @return displayBandwidthPercentageEnable
     */
    public Boolean getDisplayBandwidthPercentageEnable() {
        return displayBandwidthPercentageEnable;
    }

    public void setDisplayBandwidthPercentageEnable(Boolean displayBandwidthPercentageEnable) {
        this.displayBandwidthPercentageEnable = displayBandwidthPercentageEnable;
    }

    public TotalBandwidthControlOptions withDisplayBandwidthPercentageOptions(
        DisplayBandwidthPercentageOptions displayBandwidthPercentageOptions) {
        this.displayBandwidthPercentageOptions = displayBandwidthPercentageOptions;
        return this;
    }

    public TotalBandwidthControlOptions withDisplayBandwidthPercentageOptions(
        Consumer<DisplayBandwidthPercentageOptions> displayBandwidthPercentageOptionsSetter) {
        if (this.displayBandwidthPercentageOptions == null) {
            this.displayBandwidthPercentageOptions = new DisplayBandwidthPercentageOptions();
            displayBandwidthPercentageOptionsSetter.accept(this.displayBandwidthPercentageOptions);
        }

        return this;
    }

    /**
     * Get displayBandwidthPercentageOptions
     * @return displayBandwidthPercentageOptions
     */
    public DisplayBandwidthPercentageOptions getDisplayBandwidthPercentageOptions() {
        return displayBandwidthPercentageOptions;
    }

    public void setDisplayBandwidthPercentageOptions(
        DisplayBandwidthPercentageOptions displayBandwidthPercentageOptions) {
        this.displayBandwidthPercentageOptions = displayBandwidthPercentageOptions;
    }

    public TotalBandwidthControlOptions withMultimediaBandwidthPercentageEnable(
        Boolean multimediaBandwidthPercentageEnable) {
        this.multimediaBandwidthPercentageEnable = multimediaBandwidthPercentageEnable;
        return this;
    }

    /**
     * 多媒体带宽百分比控制。取值为：false：表示关闭。true：表示开启。
     * @return multimediaBandwidthPercentageEnable
     */
    public Boolean getMultimediaBandwidthPercentageEnable() {
        return multimediaBandwidthPercentageEnable;
    }

    public void setMultimediaBandwidthPercentageEnable(Boolean multimediaBandwidthPercentageEnable) {
        this.multimediaBandwidthPercentageEnable = multimediaBandwidthPercentageEnable;
    }

    public TotalBandwidthControlOptions withMultimediaBandwidthPercentageOptions(
        MultimediaBandwidthPercentageOptions multimediaBandwidthPercentageOptions) {
        this.multimediaBandwidthPercentageOptions = multimediaBandwidthPercentageOptions;
        return this;
    }

    public TotalBandwidthControlOptions withMultimediaBandwidthPercentageOptions(
        Consumer<MultimediaBandwidthPercentageOptions> multimediaBandwidthPercentageOptionsSetter) {
        if (this.multimediaBandwidthPercentageOptions == null) {
            this.multimediaBandwidthPercentageOptions = new MultimediaBandwidthPercentageOptions();
            multimediaBandwidthPercentageOptionsSetter.accept(this.multimediaBandwidthPercentageOptions);
        }

        return this;
    }

    /**
     * Get multimediaBandwidthPercentageOptions
     * @return multimediaBandwidthPercentageOptions
     */
    public MultimediaBandwidthPercentageOptions getMultimediaBandwidthPercentageOptions() {
        return multimediaBandwidthPercentageOptions;
    }

    public void setMultimediaBandwidthPercentageOptions(
        MultimediaBandwidthPercentageOptions multimediaBandwidthPercentageOptions) {
        this.multimediaBandwidthPercentageOptions = multimediaBandwidthPercentageOptions;
    }

    public TotalBandwidthControlOptions withUsbBandwidthPercentageEnable(Boolean usbBandwidthPercentageEnable) {
        this.usbBandwidthPercentageEnable = usbBandwidthPercentageEnable;
        return this;
    }

    /**
     * USB带宽百分比控制。取值为：false：表示关闭。true：表示开启。
     * @return usbBandwidthPercentageEnable
     */
    public Boolean getUsbBandwidthPercentageEnable() {
        return usbBandwidthPercentageEnable;
    }

    public void setUsbBandwidthPercentageEnable(Boolean usbBandwidthPercentageEnable) {
        this.usbBandwidthPercentageEnable = usbBandwidthPercentageEnable;
    }

    public TotalBandwidthControlOptions withUsbBandwidthPercentageOptions(
        UsbBandwidthPercentageOptions usbBandwidthPercentageOptions) {
        this.usbBandwidthPercentageOptions = usbBandwidthPercentageOptions;
        return this;
    }

    public TotalBandwidthControlOptions withUsbBandwidthPercentageOptions(
        Consumer<UsbBandwidthPercentageOptions> usbBandwidthPercentageOptionsSetter) {
        if (this.usbBandwidthPercentageOptions == null) {
            this.usbBandwidthPercentageOptions = new UsbBandwidthPercentageOptions();
            usbBandwidthPercentageOptionsSetter.accept(this.usbBandwidthPercentageOptions);
        }

        return this;
    }

    /**
     * Get usbBandwidthPercentageOptions
     * @return usbBandwidthPercentageOptions
     */
    public UsbBandwidthPercentageOptions getUsbBandwidthPercentageOptions() {
        return usbBandwidthPercentageOptions;
    }

    public void setUsbBandwidthPercentageOptions(UsbBandwidthPercentageOptions usbBandwidthPercentageOptions) {
        this.usbBandwidthPercentageOptions = usbBandwidthPercentageOptions;
    }

    public TotalBandwidthControlOptions withPcscBandwidthPercentageEnable(Boolean pcscBandwidthPercentageEnable) {
        this.pcscBandwidthPercentageEnable = pcscBandwidthPercentageEnable;
        return this;
    }

    /**
     * PCSC带宽百分比控制。取值为：false：表示关闭。true：表示开启。
     * @return pcscBandwidthPercentageEnable
     */
    public Boolean getPcscBandwidthPercentageEnable() {
        return pcscBandwidthPercentageEnable;
    }

    public void setPcscBandwidthPercentageEnable(Boolean pcscBandwidthPercentageEnable) {
        this.pcscBandwidthPercentageEnable = pcscBandwidthPercentageEnable;
    }

    public TotalBandwidthControlOptions withPcscBandwidthPercentageOptions(
        PcscBandwidthPercentageOptions pcscBandwidthPercentageOptions) {
        this.pcscBandwidthPercentageOptions = pcscBandwidthPercentageOptions;
        return this;
    }

    public TotalBandwidthControlOptions withPcscBandwidthPercentageOptions(
        Consumer<PcscBandwidthPercentageOptions> pcscBandwidthPercentageOptionsSetter) {
        if (this.pcscBandwidthPercentageOptions == null) {
            this.pcscBandwidthPercentageOptions = new PcscBandwidthPercentageOptions();
            pcscBandwidthPercentageOptionsSetter.accept(this.pcscBandwidthPercentageOptions);
        }

        return this;
    }

    /**
     * Get pcscBandwidthPercentageOptions
     * @return pcscBandwidthPercentageOptions
     */
    public PcscBandwidthPercentageOptions getPcscBandwidthPercentageOptions() {
        return pcscBandwidthPercentageOptions;
    }

    public void setPcscBandwidthPercentageOptions(PcscBandwidthPercentageOptions pcscBandwidthPercentageOptions) {
        this.pcscBandwidthPercentageOptions = pcscBandwidthPercentageOptions;
    }

    public TotalBandwidthControlOptions withTwainBandwidthPercentageEnable(Boolean twainBandwidthPercentageEnable) {
        this.twainBandwidthPercentageEnable = twainBandwidthPercentageEnable;
        return this;
    }

    /**
     * TWAIN带宽百分比控制。取值为：false：表示关闭。true：表示开启。
     * @return twainBandwidthPercentageEnable
     */
    public Boolean getTwainBandwidthPercentageEnable() {
        return twainBandwidthPercentageEnable;
    }

    public void setTwainBandwidthPercentageEnable(Boolean twainBandwidthPercentageEnable) {
        this.twainBandwidthPercentageEnable = twainBandwidthPercentageEnable;
    }

    public TotalBandwidthControlOptions withTwainBandwidthPercentageOptions(
        TwainBandwidthPercentageOptions twainBandwidthPercentageOptions) {
        this.twainBandwidthPercentageOptions = twainBandwidthPercentageOptions;
        return this;
    }

    public TotalBandwidthControlOptions withTwainBandwidthPercentageOptions(
        Consumer<TwainBandwidthPercentageOptions> twainBandwidthPercentageOptionsSetter) {
        if (this.twainBandwidthPercentageOptions == null) {
            this.twainBandwidthPercentageOptions = new TwainBandwidthPercentageOptions();
            twainBandwidthPercentageOptionsSetter.accept(this.twainBandwidthPercentageOptions);
        }

        return this;
    }

    /**
     * Get twainBandwidthPercentageOptions
     * @return twainBandwidthPercentageOptions
     */
    public TwainBandwidthPercentageOptions getTwainBandwidthPercentageOptions() {
        return twainBandwidthPercentageOptions;
    }

    public void setTwainBandwidthPercentageOptions(TwainBandwidthPercentageOptions twainBandwidthPercentageOptions) {
        this.twainBandwidthPercentageOptions = twainBandwidthPercentageOptions;
    }

    public TotalBandwidthControlOptions withPrinterBandwidthPercentageEnable(Boolean printerBandwidthPercentageEnable) {
        this.printerBandwidthPercentageEnable = printerBandwidthPercentageEnable;
        return this;
    }

    /**
     * 打印机带宽百分比控制。取值为：false：表示关闭。true：表示开启。
     * @return printerBandwidthPercentageEnable
     */
    public Boolean getPrinterBandwidthPercentageEnable() {
        return printerBandwidthPercentageEnable;
    }

    public void setPrinterBandwidthPercentageEnable(Boolean printerBandwidthPercentageEnable) {
        this.printerBandwidthPercentageEnable = printerBandwidthPercentageEnable;
    }

    public TotalBandwidthControlOptions withPrinterBandwidthPercentageOptions(
        PrinterBandwidthPercentageOptions printerBandwidthPercentageOptions) {
        this.printerBandwidthPercentageOptions = printerBandwidthPercentageOptions;
        return this;
    }

    public TotalBandwidthControlOptions withPrinterBandwidthPercentageOptions(
        Consumer<PrinterBandwidthPercentageOptions> printerBandwidthPercentageOptionsSetter) {
        if (this.printerBandwidthPercentageOptions == null) {
            this.printerBandwidthPercentageOptions = new PrinterBandwidthPercentageOptions();
            printerBandwidthPercentageOptionsSetter.accept(this.printerBandwidthPercentageOptions);
        }

        return this;
    }

    /**
     * Get printerBandwidthPercentageOptions
     * @return printerBandwidthPercentageOptions
     */
    public PrinterBandwidthPercentageOptions getPrinterBandwidthPercentageOptions() {
        return printerBandwidthPercentageOptions;
    }

    public void setPrinterBandwidthPercentageOptions(
        PrinterBandwidthPercentageOptions printerBandwidthPercentageOptions) {
        this.printerBandwidthPercentageOptions = printerBandwidthPercentageOptions;
    }

    public TotalBandwidthControlOptions withComBandwidthPercentageEnable(Boolean comBandwidthPercentageEnable) {
        this.comBandwidthPercentageEnable = comBandwidthPercentageEnable;
        return this;
    }

    /**
     * 串口带宽百分比控制。取值为：false：表示关闭。true：表示开启。
     * @return comBandwidthPercentageEnable
     */
    public Boolean getComBandwidthPercentageEnable() {
        return comBandwidthPercentageEnable;
    }

    public void setComBandwidthPercentageEnable(Boolean comBandwidthPercentageEnable) {
        this.comBandwidthPercentageEnable = comBandwidthPercentageEnable;
    }

    public TotalBandwidthControlOptions withComBandwidthPercentageOptions(
        ComBandwidthPercentageOptions comBandwidthPercentageOptions) {
        this.comBandwidthPercentageOptions = comBandwidthPercentageOptions;
        return this;
    }

    public TotalBandwidthControlOptions withComBandwidthPercentageOptions(
        Consumer<ComBandwidthPercentageOptions> comBandwidthPercentageOptionsSetter) {
        if (this.comBandwidthPercentageOptions == null) {
            this.comBandwidthPercentageOptions = new ComBandwidthPercentageOptions();
            comBandwidthPercentageOptionsSetter.accept(this.comBandwidthPercentageOptions);
        }

        return this;
    }

    /**
     * Get comBandwidthPercentageOptions
     * @return comBandwidthPercentageOptions
     */
    public ComBandwidthPercentageOptions getComBandwidthPercentageOptions() {
        return comBandwidthPercentageOptions;
    }

    public void setComBandwidthPercentageOptions(ComBandwidthPercentageOptions comBandwidthPercentageOptions) {
        this.comBandwidthPercentageOptions = comBandwidthPercentageOptions;
    }

    public TotalBandwidthControlOptions withFileRedirectionBandwidthPercentageEnable(
        Boolean fileRedirectionBandwidthPercentageEnable) {
        this.fileRedirectionBandwidthPercentageEnable = fileRedirectionBandwidthPercentageEnable;
        return this;
    }

    /**
     * 文件重定向带宽百分比控制。取值为：false：表示关闭。true：表示开启。
     * @return fileRedirectionBandwidthPercentageEnable
     */
    public Boolean getFileRedirectionBandwidthPercentageEnable() {
        return fileRedirectionBandwidthPercentageEnable;
    }

    public void setFileRedirectionBandwidthPercentageEnable(Boolean fileRedirectionBandwidthPercentageEnable) {
        this.fileRedirectionBandwidthPercentageEnable = fileRedirectionBandwidthPercentageEnable;
    }

    public TotalBandwidthControlOptions withFileRedirectionBandwidthPercentageOptions(
        FileRedirectionBandwidthPercentageOptions fileRedirectionBandwidthPercentageOptions) {
        this.fileRedirectionBandwidthPercentageOptions = fileRedirectionBandwidthPercentageOptions;
        return this;
    }

    public TotalBandwidthControlOptions withFileRedirectionBandwidthPercentageOptions(
        Consumer<FileRedirectionBandwidthPercentageOptions> fileRedirectionBandwidthPercentageOptionsSetter) {
        if (this.fileRedirectionBandwidthPercentageOptions == null) {
            this.fileRedirectionBandwidthPercentageOptions = new FileRedirectionBandwidthPercentageOptions();
            fileRedirectionBandwidthPercentageOptionsSetter.accept(this.fileRedirectionBandwidthPercentageOptions);
        }

        return this;
    }

    /**
     * Get fileRedirectionBandwidthPercentageOptions
     * @return fileRedirectionBandwidthPercentageOptions
     */
    public FileRedirectionBandwidthPercentageOptions getFileRedirectionBandwidthPercentageOptions() {
        return fileRedirectionBandwidthPercentageOptions;
    }

    public void setFileRedirectionBandwidthPercentageOptions(
        FileRedirectionBandwidthPercentageOptions fileRedirectionBandwidthPercentageOptions) {
        this.fileRedirectionBandwidthPercentageOptions = fileRedirectionBandwidthPercentageOptions;
    }

    public TotalBandwidthControlOptions withClipboardBandwidthPercentageEnable(
        Boolean clipboardBandwidthPercentageEnable) {
        this.clipboardBandwidthPercentageEnable = clipboardBandwidthPercentageEnable;
        return this;
    }

    /**
     * 剪切板带宽百分比控制。取值为：false：表示关闭。true：表示开启。
     * @return clipboardBandwidthPercentageEnable
     */
    public Boolean getClipboardBandwidthPercentageEnable() {
        return clipboardBandwidthPercentageEnable;
    }

    public void setClipboardBandwidthPercentageEnable(Boolean clipboardBandwidthPercentageEnable) {
        this.clipboardBandwidthPercentageEnable = clipboardBandwidthPercentageEnable;
    }

    public TotalBandwidthControlOptions withClipboardBandwidthPercentageOptions(
        ClipboardBandwidthPercentageOptions clipboardBandwidthPercentageOptions) {
        this.clipboardBandwidthPercentageOptions = clipboardBandwidthPercentageOptions;
        return this;
    }

    public TotalBandwidthControlOptions withClipboardBandwidthPercentageOptions(
        Consumer<ClipboardBandwidthPercentageOptions> clipboardBandwidthPercentageOptionsSetter) {
        if (this.clipboardBandwidthPercentageOptions == null) {
            this.clipboardBandwidthPercentageOptions = new ClipboardBandwidthPercentageOptions();
            clipboardBandwidthPercentageOptionsSetter.accept(this.clipboardBandwidthPercentageOptions);
        }

        return this;
    }

    /**
     * Get clipboardBandwidthPercentageOptions
     * @return clipboardBandwidthPercentageOptions
     */
    public ClipboardBandwidthPercentageOptions getClipboardBandwidthPercentageOptions() {
        return clipboardBandwidthPercentageOptions;
    }

    public void setClipboardBandwidthPercentageOptions(
        ClipboardBandwidthPercentageOptions clipboardBandwidthPercentageOptions) {
        this.clipboardBandwidthPercentageOptions = clipboardBandwidthPercentageOptions;
    }

    public TotalBandwidthControlOptions withSecureChannelBandwidthPercentageEnable(
        Boolean secureChannelBandwidthPercentageEnable) {
        this.secureChannelBandwidthPercentageEnable = secureChannelBandwidthPercentageEnable;
        return this;
    }

    /**
     * 安全通道带宽百分比控制。取值为：false：表示关闭。true：表示开启。
     * @return secureChannelBandwidthPercentageEnable
     */
    public Boolean getSecureChannelBandwidthPercentageEnable() {
        return secureChannelBandwidthPercentageEnable;
    }

    public void setSecureChannelBandwidthPercentageEnable(Boolean secureChannelBandwidthPercentageEnable) {
        this.secureChannelBandwidthPercentageEnable = secureChannelBandwidthPercentageEnable;
    }

    public TotalBandwidthControlOptions withSecureChannelBandwidthPercentageOptions(
        SecureChannelBandwidthPercentageOptions secureChannelBandwidthPercentageOptions) {
        this.secureChannelBandwidthPercentageOptions = secureChannelBandwidthPercentageOptions;
        return this;
    }

    public TotalBandwidthControlOptions withSecureChannelBandwidthPercentageOptions(
        Consumer<SecureChannelBandwidthPercentageOptions> secureChannelBandwidthPercentageOptionsSetter) {
        if (this.secureChannelBandwidthPercentageOptions == null) {
            this.secureChannelBandwidthPercentageOptions = new SecureChannelBandwidthPercentageOptions();
            secureChannelBandwidthPercentageOptionsSetter.accept(this.secureChannelBandwidthPercentageOptions);
        }

        return this;
    }

    /**
     * Get secureChannelBandwidthPercentageOptions
     * @return secureChannelBandwidthPercentageOptions
     */
    public SecureChannelBandwidthPercentageOptions getSecureChannelBandwidthPercentageOptions() {
        return secureChannelBandwidthPercentageOptions;
    }

    public void setSecureChannelBandwidthPercentageOptions(
        SecureChannelBandwidthPercentageOptions secureChannelBandwidthPercentageOptions) {
        this.secureChannelBandwidthPercentageOptions = secureChannelBandwidthPercentageOptions;
    }

    public TotalBandwidthControlOptions withCameraBandwidthPercentageEnable(Boolean cameraBandwidthPercentageEnable) {
        this.cameraBandwidthPercentageEnable = cameraBandwidthPercentageEnable;
        return this;
    }

    /**
     * 摄像头带宽百分比控制。取值为：false：表示关闭。true：表示开启。
     * @return cameraBandwidthPercentageEnable
     */
    public Boolean getCameraBandwidthPercentageEnable() {
        return cameraBandwidthPercentageEnable;
    }

    public void setCameraBandwidthPercentageEnable(Boolean cameraBandwidthPercentageEnable) {
        this.cameraBandwidthPercentageEnable = cameraBandwidthPercentageEnable;
    }

    public TotalBandwidthControlOptions withCameraBandwidthPercentageOptions(
        CameraBandwidthPercentageOptions cameraBandwidthPercentageOptions) {
        this.cameraBandwidthPercentageOptions = cameraBandwidthPercentageOptions;
        return this;
    }

    public TotalBandwidthControlOptions withCameraBandwidthPercentageOptions(
        Consumer<CameraBandwidthPercentageOptions> cameraBandwidthPercentageOptionsSetter) {
        if (this.cameraBandwidthPercentageOptions == null) {
            this.cameraBandwidthPercentageOptions = new CameraBandwidthPercentageOptions();
            cameraBandwidthPercentageOptionsSetter.accept(this.cameraBandwidthPercentageOptions);
        }

        return this;
    }

    /**
     * Get cameraBandwidthPercentageOptions
     * @return cameraBandwidthPercentageOptions
     */
    public CameraBandwidthPercentageOptions getCameraBandwidthPercentageOptions() {
        return cameraBandwidthPercentageOptions;
    }

    public void setCameraBandwidthPercentageOptions(CameraBandwidthPercentageOptions cameraBandwidthPercentageOptions) {
        this.cameraBandwidthPercentageOptions = cameraBandwidthPercentageOptions;
    }

    public TotalBandwidthControlOptions withVirtualChannelBandwidthPercentageEnable(
        Boolean virtualChannelBandwidthPercentageEnable) {
        this.virtualChannelBandwidthPercentageEnable = virtualChannelBandwidthPercentageEnable;
        return this;
    }

    /**
     * 虚拟通道带宽百分比控制。取值为：false：表示关闭。true：表示开启。
     * @return virtualChannelBandwidthPercentageEnable
     */
    public Boolean getVirtualChannelBandwidthPercentageEnable() {
        return virtualChannelBandwidthPercentageEnable;
    }

    public void setVirtualChannelBandwidthPercentageEnable(Boolean virtualChannelBandwidthPercentageEnable) {
        this.virtualChannelBandwidthPercentageEnable = virtualChannelBandwidthPercentageEnable;
    }

    public TotalBandwidthControlOptions withVirtualChannelBandwidthPercentageOptions(
        VirtualChannelBandwidthPercentageOptions virtualChannelBandwidthPercentageOptions) {
        this.virtualChannelBandwidthPercentageOptions = virtualChannelBandwidthPercentageOptions;
        return this;
    }

    public TotalBandwidthControlOptions withVirtualChannelBandwidthPercentageOptions(
        Consumer<VirtualChannelBandwidthPercentageOptions> virtualChannelBandwidthPercentageOptionsSetter) {
        if (this.virtualChannelBandwidthPercentageOptions == null) {
            this.virtualChannelBandwidthPercentageOptions = new VirtualChannelBandwidthPercentageOptions();
            virtualChannelBandwidthPercentageOptionsSetter.accept(this.virtualChannelBandwidthPercentageOptions);
        }

        return this;
    }

    /**
     * Get virtualChannelBandwidthPercentageOptions
     * @return virtualChannelBandwidthPercentageOptions
     */
    public VirtualChannelBandwidthPercentageOptions getVirtualChannelBandwidthPercentageOptions() {
        return virtualChannelBandwidthPercentageOptions;
    }

    public void setVirtualChannelBandwidthPercentageOptions(
        VirtualChannelBandwidthPercentageOptions virtualChannelBandwidthPercentageOptions) {
        this.virtualChannelBandwidthPercentageOptions = virtualChannelBandwidthPercentageOptions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TotalBandwidthControlOptions that = (TotalBandwidthControlOptions) obj;
        return Objects.equals(this.totalBandwidthControlValue, that.totalBandwidthControlValue)
            && Objects.equals(this.displayBandwidthPercentageEnable, that.displayBandwidthPercentageEnable)
            && Objects.equals(this.displayBandwidthPercentageOptions, that.displayBandwidthPercentageOptions)
            && Objects.equals(this.multimediaBandwidthPercentageEnable, that.multimediaBandwidthPercentageEnable)
            && Objects.equals(this.multimediaBandwidthPercentageOptions, that.multimediaBandwidthPercentageOptions)
            && Objects.equals(this.usbBandwidthPercentageEnable, that.usbBandwidthPercentageEnable)
            && Objects.equals(this.usbBandwidthPercentageOptions, that.usbBandwidthPercentageOptions)
            && Objects.equals(this.pcscBandwidthPercentageEnable, that.pcscBandwidthPercentageEnable)
            && Objects.equals(this.pcscBandwidthPercentageOptions, that.pcscBandwidthPercentageOptions)
            && Objects.equals(this.twainBandwidthPercentageEnable, that.twainBandwidthPercentageEnable)
            && Objects.equals(this.twainBandwidthPercentageOptions, that.twainBandwidthPercentageOptions)
            && Objects.equals(this.printerBandwidthPercentageEnable, that.printerBandwidthPercentageEnable)
            && Objects.equals(this.printerBandwidthPercentageOptions, that.printerBandwidthPercentageOptions)
            && Objects.equals(this.comBandwidthPercentageEnable, that.comBandwidthPercentageEnable)
            && Objects.equals(this.comBandwidthPercentageOptions, that.comBandwidthPercentageOptions)
            && Objects.equals(this.fileRedirectionBandwidthPercentageEnable,
                that.fileRedirectionBandwidthPercentageEnable)
            && Objects.equals(this.fileRedirectionBandwidthPercentageOptions,
                that.fileRedirectionBandwidthPercentageOptions)
            && Objects.equals(this.clipboardBandwidthPercentageEnable, that.clipboardBandwidthPercentageEnable)
            && Objects.equals(this.clipboardBandwidthPercentageOptions, that.clipboardBandwidthPercentageOptions)
            && Objects.equals(this.secureChannelBandwidthPercentageEnable, that.secureChannelBandwidthPercentageEnable)
            && Objects.equals(this.secureChannelBandwidthPercentageOptions,
                that.secureChannelBandwidthPercentageOptions)
            && Objects.equals(this.cameraBandwidthPercentageEnable, that.cameraBandwidthPercentageEnable)
            && Objects.equals(this.cameraBandwidthPercentageOptions, that.cameraBandwidthPercentageOptions)
            && Objects.equals(this.virtualChannelBandwidthPercentageEnable,
                that.virtualChannelBandwidthPercentageEnable)
            && Objects.equals(this.virtualChannelBandwidthPercentageOptions,
                that.virtualChannelBandwidthPercentageOptions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalBandwidthControlValue,
            displayBandwidthPercentageEnable,
            displayBandwidthPercentageOptions,
            multimediaBandwidthPercentageEnable,
            multimediaBandwidthPercentageOptions,
            usbBandwidthPercentageEnable,
            usbBandwidthPercentageOptions,
            pcscBandwidthPercentageEnable,
            pcscBandwidthPercentageOptions,
            twainBandwidthPercentageEnable,
            twainBandwidthPercentageOptions,
            printerBandwidthPercentageEnable,
            printerBandwidthPercentageOptions,
            comBandwidthPercentageEnable,
            comBandwidthPercentageOptions,
            fileRedirectionBandwidthPercentageEnable,
            fileRedirectionBandwidthPercentageOptions,
            clipboardBandwidthPercentageEnable,
            clipboardBandwidthPercentageOptions,
            secureChannelBandwidthPercentageEnable,
            secureChannelBandwidthPercentageOptions,
            cameraBandwidthPercentageEnable,
            cameraBandwidthPercentageOptions,
            virtualChannelBandwidthPercentageEnable,
            virtualChannelBandwidthPercentageOptions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TotalBandwidthControlOptions {\n");
        sb.append("    totalBandwidthControlValue: ").append(toIndentedString(totalBandwidthControlValue)).append("\n");
        sb.append("    displayBandwidthPercentageEnable: ")
            .append(toIndentedString(displayBandwidthPercentageEnable))
            .append("\n");
        sb.append("    displayBandwidthPercentageOptions: ")
            .append(toIndentedString(displayBandwidthPercentageOptions))
            .append("\n");
        sb.append("    multimediaBandwidthPercentageEnable: ")
            .append(toIndentedString(multimediaBandwidthPercentageEnable))
            .append("\n");
        sb.append("    multimediaBandwidthPercentageOptions: ")
            .append(toIndentedString(multimediaBandwidthPercentageOptions))
            .append("\n");
        sb.append("    usbBandwidthPercentageEnable: ")
            .append(toIndentedString(usbBandwidthPercentageEnable))
            .append("\n");
        sb.append("    usbBandwidthPercentageOptions: ")
            .append(toIndentedString(usbBandwidthPercentageOptions))
            .append("\n");
        sb.append("    pcscBandwidthPercentageEnable: ")
            .append(toIndentedString(pcscBandwidthPercentageEnable))
            .append("\n");
        sb.append("    pcscBandwidthPercentageOptions: ")
            .append(toIndentedString(pcscBandwidthPercentageOptions))
            .append("\n");
        sb.append("    twainBandwidthPercentageEnable: ")
            .append(toIndentedString(twainBandwidthPercentageEnable))
            .append("\n");
        sb.append("    twainBandwidthPercentageOptions: ")
            .append(toIndentedString(twainBandwidthPercentageOptions))
            .append("\n");
        sb.append("    printerBandwidthPercentageEnable: ")
            .append(toIndentedString(printerBandwidthPercentageEnable))
            .append("\n");
        sb.append("    printerBandwidthPercentageOptions: ")
            .append(toIndentedString(printerBandwidthPercentageOptions))
            .append("\n");
        sb.append("    comBandwidthPercentageEnable: ")
            .append(toIndentedString(comBandwidthPercentageEnable))
            .append("\n");
        sb.append("    comBandwidthPercentageOptions: ")
            .append(toIndentedString(comBandwidthPercentageOptions))
            .append("\n");
        sb.append("    fileRedirectionBandwidthPercentageEnable: ")
            .append(toIndentedString(fileRedirectionBandwidthPercentageEnable))
            .append("\n");
        sb.append("    fileRedirectionBandwidthPercentageOptions: ")
            .append(toIndentedString(fileRedirectionBandwidthPercentageOptions))
            .append("\n");
        sb.append("    clipboardBandwidthPercentageEnable: ")
            .append(toIndentedString(clipboardBandwidthPercentageEnable))
            .append("\n");
        sb.append("    clipboardBandwidthPercentageOptions: ")
            .append(toIndentedString(clipboardBandwidthPercentageOptions))
            .append("\n");
        sb.append("    secureChannelBandwidthPercentageEnable: ")
            .append(toIndentedString(secureChannelBandwidthPercentageEnable))
            .append("\n");
        sb.append("    secureChannelBandwidthPercentageOptions: ")
            .append(toIndentedString(secureChannelBandwidthPercentageOptions))
            .append("\n");
        sb.append("    cameraBandwidthPercentageEnable: ")
            .append(toIndentedString(cameraBandwidthPercentageEnable))
            .append("\n");
        sb.append("    cameraBandwidthPercentageOptions: ")
            .append(toIndentedString(cameraBandwidthPercentageOptions))
            .append("\n");
        sb.append("    virtualChannelBandwidthPercentageEnable: ")
            .append(toIndentedString(virtualChannelBandwidthPercentageEnable))
            .append("\n");
        sb.append("    virtualChannelBandwidthPercentageOptions: ")
            .append(toIndentedString(virtualChannelBandwidthPercentageOptions))
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
