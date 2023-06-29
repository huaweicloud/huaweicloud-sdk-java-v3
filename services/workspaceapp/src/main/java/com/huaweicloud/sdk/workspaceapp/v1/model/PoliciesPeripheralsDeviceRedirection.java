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

    /**
     * 图形压缩级别。取值为： - 不压缩：none。 - 低（速度最快）：low。 - 中（速度适中）：medium。 - 高（速度最慢）：high。 - 无损（无损压缩）：lossless。 - 低损（低损压缩）：low-loss。 - 中损（中损压缩）：medium-loss。 - 高损（高损压缩）：high-loss。
     */
    public static final class ImageCompressionLevelEnum {

        /**
         * Enum NONE for value: "none"
         */
        public static final ImageCompressionLevelEnum NONE = new ImageCompressionLevelEnum("none");

        /**
         * Enum LOW for value: "low"
         */
        public static final ImageCompressionLevelEnum LOW = new ImageCompressionLevelEnum("low");

        /**
         * Enum MEDIUM for value: "medium"
         */
        public static final ImageCompressionLevelEnum MEDIUM = new ImageCompressionLevelEnum("medium");

        /**
         * Enum HIGH for value: "high"
         */
        public static final ImageCompressionLevelEnum HIGH = new ImageCompressionLevelEnum("high");

        /**
         * Enum LOSSLESS for value: "lossless"
         */
        public static final ImageCompressionLevelEnum LOSSLESS = new ImageCompressionLevelEnum("lossless");

        /**
         * Enum LOW_LOSS for value: "low-loss"
         */
        public static final ImageCompressionLevelEnum LOW_LOSS = new ImageCompressionLevelEnum("low-loss");

        /**
         * Enum MEDIUM_LOSS for value: "medium-loss"
         */
        public static final ImageCompressionLevelEnum MEDIUM_LOSS = new ImageCompressionLevelEnum("medium-loss");

        /**
         * Enum HIGH_LOSS for value: "high-loss"
         */
        public static final ImageCompressionLevelEnum HIGH_LOSS = new ImageCompressionLevelEnum("high-loss");

        private static final Map<String, ImageCompressionLevelEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ImageCompressionLevelEnum> createStaticFields() {
            Map<String, ImageCompressionLevelEnum> map = new HashMap<>();
            map.put("none", NONE);
            map.put("low", LOW);
            map.put("medium", MEDIUM);
            map.put("high", HIGH);
            map.put("lossless", LOSSLESS);
            map.put("low-loss", LOW_LOSS);
            map.put("medium-loss", MEDIUM_LOSS);
            map.put("high-loss", HIGH_LOSS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ImageCompressionLevelEnum(String value) {
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
        public static ImageCompressionLevelEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ImageCompressionLevelEnum(value));
        }

        public static ImageCompressionLevelEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ImageCompressionLevelEnum) {
                return this.value.equals(((ImageCompressionLevelEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_compression_level")

    private ImageCompressionLevelEnum imageCompressionLevel;

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

    public PoliciesPeripheralsDeviceRedirection withImageCompressionLevel(
        ImageCompressionLevelEnum imageCompressionLevel) {
        this.imageCompressionLevel = imageCompressionLevel;
        return this;
    }

    /**
     * 图形压缩级别。取值为： - 不压缩：none。 - 低（速度最快）：low。 - 中（速度适中）：medium。 - 高（速度最慢）：high。 - 无损（无损压缩）：lossless。 - 低损（低损压缩）：low-loss。 - 中损（中损压缩）：medium-loss。 - 高损（高损压缩）：high-loss。
     * @return imageCompressionLevel
     */
    public ImageCompressionLevelEnum getImageCompressionLevel() {
        return imageCompressionLevel;
    }

    public void setImageCompressionLevel(ImageCompressionLevelEnum imageCompressionLevel) {
        this.imageCompressionLevel = imageCompressionLevel;
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
            && Objects.equals(this.imageCompressionLevel, that.imageCompressionLevel);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(printerRedirection, sessionPrinter, cameraRedirection, twainRedirectionEnable, imageCompressionLevel);
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
