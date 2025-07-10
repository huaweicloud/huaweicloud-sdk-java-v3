package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 设备重定向。
 */
public class PoliciesPeripheralsDeviceRedirection {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "printer_redirection")

    private PoliciesPeripheralsDeviceRedirectionPrinterRedirection printerRedirection;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "session_printer")

    private PoliciesPeripheralsDeviceRedirectionSessionPrinter sessionPrinter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "camera_redirection")

    private PoliciesPeripheralsDeviceRedirectionCameraRedirection cameraRedirection;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "twain_redirection_enable")

    private Boolean twainRedirectionEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_compression_level")

    private String imageCompressionLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hid_redirection")

    private PoliciesPeripheralsDeviceRedirectionHidRedirection hidRedirection;

    public PoliciesPeripheralsDeviceRedirection withPrinterRedirection(
        PoliciesPeripheralsDeviceRedirectionPrinterRedirection printerRedirection) {
        this.printerRedirection = printerRedirection;
        return this;
    }

    public PoliciesPeripheralsDeviceRedirection withPrinterRedirection(
        Consumer<PoliciesPeripheralsDeviceRedirectionPrinterRedirection> printerRedirectionSetter) {
        if (this.printerRedirection == null) {
            this.printerRedirection = new PoliciesPeripheralsDeviceRedirectionPrinterRedirection();
            printerRedirectionSetter.accept(this.printerRedirection);
        }

        return this;
    }

    /**
     * Get printerRedirection
     * @return printerRedirection
     */
    public PoliciesPeripheralsDeviceRedirectionPrinterRedirection getPrinterRedirection() {
        return printerRedirection;
    }

    public void setPrinterRedirection(PoliciesPeripheralsDeviceRedirectionPrinterRedirection printerRedirection) {
        this.printerRedirection = printerRedirection;
    }

    public PoliciesPeripheralsDeviceRedirection withSessionPrinter(
        PoliciesPeripheralsDeviceRedirectionSessionPrinter sessionPrinter) {
        this.sessionPrinter = sessionPrinter;
        return this;
    }

    public PoliciesPeripheralsDeviceRedirection withSessionPrinter(
        Consumer<PoliciesPeripheralsDeviceRedirectionSessionPrinter> sessionPrinterSetter) {
        if (this.sessionPrinter == null) {
            this.sessionPrinter = new PoliciesPeripheralsDeviceRedirectionSessionPrinter();
            sessionPrinterSetter.accept(this.sessionPrinter);
        }

        return this;
    }

    /**
     * Get sessionPrinter
     * @return sessionPrinter
     */
    public PoliciesPeripheralsDeviceRedirectionSessionPrinter getSessionPrinter() {
        return sessionPrinter;
    }

    public void setSessionPrinter(PoliciesPeripheralsDeviceRedirectionSessionPrinter sessionPrinter) {
        this.sessionPrinter = sessionPrinter;
    }

    public PoliciesPeripheralsDeviceRedirection withCameraRedirection(
        PoliciesPeripheralsDeviceRedirectionCameraRedirection cameraRedirection) {
        this.cameraRedirection = cameraRedirection;
        return this;
    }

    public PoliciesPeripheralsDeviceRedirection withCameraRedirection(
        Consumer<PoliciesPeripheralsDeviceRedirectionCameraRedirection> cameraRedirectionSetter) {
        if (this.cameraRedirection == null) {
            this.cameraRedirection = new PoliciesPeripheralsDeviceRedirectionCameraRedirection();
            cameraRedirectionSetter.accept(this.cameraRedirection);
        }

        return this;
    }

    /**
     * Get cameraRedirection
     * @return cameraRedirection
     */
    public PoliciesPeripheralsDeviceRedirectionCameraRedirection getCameraRedirection() {
        return cameraRedirection;
    }

    public void setCameraRedirection(PoliciesPeripheralsDeviceRedirectionCameraRedirection cameraRedirection) {
        this.cameraRedirection = cameraRedirection;
    }

    public PoliciesPeripheralsDeviceRedirection withTwainRedirectionEnable(Boolean twainRedirectionEnable) {
        this.twainRedirectionEnable = twainRedirectionEnable;
        return this;
    }

    /**
     * 是否开启TWAIN设备重定向。取值为： false：表示关闭。 true：表示开启。
     * @return twainRedirectionEnable
     */
    public Boolean getTwainRedirectionEnable() {
        return twainRedirectionEnable;
    }

    public void setTwainRedirectionEnable(Boolean twainRedirectionEnable) {
        this.twainRedirectionEnable = twainRedirectionEnable;
    }

    public PoliciesPeripheralsDeviceRedirection withImageCompressionLevel(String imageCompressionLevel) {
        this.imageCompressionLevel = imageCompressionLevel;
        return this;
    }

    /**
     * 图形压缩级别。取值为： 不压缩：none。 低（速度最快）：low。 中（速度适中）：medium。 高（速度最慢）：high。 无损（无损压缩）：lossless。 低损（低损压缩）：low-loss。 中损（中损压缩）：medium-loss。 高损（高损压缩）：high-loss。
     * @return imageCompressionLevel
     */
    public String getImageCompressionLevel() {
        return imageCompressionLevel;
    }

    public void setImageCompressionLevel(String imageCompressionLevel) {
        this.imageCompressionLevel = imageCompressionLevel;
    }

    public PoliciesPeripheralsDeviceRedirection withHidRedirection(
        PoliciesPeripheralsDeviceRedirectionHidRedirection hidRedirection) {
        this.hidRedirection = hidRedirection;
        return this;
    }

    public PoliciesPeripheralsDeviceRedirection withHidRedirection(
        Consumer<PoliciesPeripheralsDeviceRedirectionHidRedirection> hidRedirectionSetter) {
        if (this.hidRedirection == null) {
            this.hidRedirection = new PoliciesPeripheralsDeviceRedirectionHidRedirection();
            hidRedirectionSetter.accept(this.hidRedirection);
        }

        return this;
    }

    /**
     * Get hidRedirection
     * @return hidRedirection
     */
    public PoliciesPeripheralsDeviceRedirectionHidRedirection getHidRedirection() {
        return hidRedirection;
    }

    public void setHidRedirection(PoliciesPeripheralsDeviceRedirectionHidRedirection hidRedirection) {
        this.hidRedirection = hidRedirection;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PoliciesPeripheralsDeviceRedirection that = (PoliciesPeripheralsDeviceRedirection) obj;
        return Objects.equals(this.printerRedirection, that.printerRedirection)
            && Objects.equals(this.sessionPrinter, that.sessionPrinter)
            && Objects.equals(this.cameraRedirection, that.cameraRedirection)
            && Objects.equals(this.twainRedirectionEnable, that.twainRedirectionEnable)
            && Objects.equals(this.imageCompressionLevel, that.imageCompressionLevel)
            && Objects.equals(this.hidRedirection, that.hidRedirection);
    }

    @Override
    public int hashCode() {
        return Objects.hash(printerRedirection,
            sessionPrinter,
            cameraRedirection,
            twainRedirectionEnable,
            imageCompressionLevel,
            hidRedirection);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PoliciesPeripheralsDeviceRedirection {\n");
        sb.append("    printerRedirection: ").append(toIndentedString(printerRedirection)).append("\n");
        sb.append("    sessionPrinter: ").append(toIndentedString(sessionPrinter)).append("\n");
        sb.append("    cameraRedirection: ").append(toIndentedString(cameraRedirection)).append("\n");
        sb.append("    twainRedirectionEnable: ").append(toIndentedString(twainRedirectionEnable)).append("\n");
        sb.append("    imageCompressionLevel: ").append(toIndentedString(imageCompressionLevel)).append("\n");
        sb.append("    hidRedirection: ").append(toIndentedString(hidRedirection)).append("\n");
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
