package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 图片元数据
 */
public class ImageAssetMeta {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "codec")

    private String codec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "width")

    private Integer width;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "height")

    private Integer height;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private BigDecimal size;

    /**
     * Horizontal=横向；Vertical=纵向
     */
    public static final class ModeEnum {

        /**
         * Enum HORIZONTAL for value: "Horizontal"
         */
        public static final ModeEnum HORIZONTAL = new ModeEnum("Horizontal");

        /**
         * Enum VERTICAL for value: "Vertical"
         */
        public static final ModeEnum VERTICAL = new ModeEnum("Vertical");

        private static final Map<String, ModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ModeEnum> createStaticFields() {
            Map<String, ModeEnum> map = new HashMap<>();
            map.put("Horizontal", HORIZONTAL);
            map.put("Vertical", VERTICAL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ModeEnum(String value) {
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
        public static ModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ModeEnum(value));
        }

        public static ModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ModeEnum) {
                return this.value.equals(((ModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mode")

    private ModeEnum mode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_info")

    private ErrorResponse errorInfo;

    public ImageAssetMeta withCodec(String codec) {
        this.codec = codec;
        return this;
    }

    /**
     * 图片编码格式，自动提取。
     * @return codec
     */
    public String getCodec() {
        return codec;
    }

    public void setCodec(String codec) {
        this.codec = codec;
    }

    public ImageAssetMeta withWidth(Integer width) {
        this.width = width;
        return this;
    }

    /**
     * 图片宽度，自动提取
     * minimum: 0
     * maximum: 8196
     * @return width
     */
    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public ImageAssetMeta withHeight(Integer height) {
        this.height = height;
        return this;
    }

    /**
     * 图片高度，自动提取
     * minimum: 0
     * maximum: 8196
     * @return height
     */
    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public ImageAssetMeta withSize(BigDecimal size) {
        this.size = size;
        return this;
    }

    /**
     * 大小
     * minimum: 0
     * maximum: 9223372036854775807
     * @return size
     */
    public BigDecimal getSize() {
        return size;
    }

    public void setSize(BigDecimal size) {
        this.size = size;
    }

    public ImageAssetMeta withMode(ModeEnum mode) {
        this.mode = mode;
        return this;
    }

    /**
     * Horizontal=横向；Vertical=纵向
     * @return mode
     */
    public ModeEnum getMode() {
        return mode;
    }

    public void setMode(ModeEnum mode) {
        this.mode = mode;
    }

    public ImageAssetMeta withErrorInfo(ErrorResponse errorInfo) {
        this.errorInfo = errorInfo;
        return this;
    }

    public ImageAssetMeta withErrorInfo(Consumer<ErrorResponse> errorInfoSetter) {
        if (this.errorInfo == null) {
            this.errorInfo = new ErrorResponse();
            errorInfoSetter.accept(this.errorInfo);
        }

        return this;
    }

    /**
     * Get errorInfo
     * @return errorInfo
     */
    public ErrorResponse getErrorInfo() {
        return errorInfo;
    }

    public void setErrorInfo(ErrorResponse errorInfo) {
        this.errorInfo = errorInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImageAssetMeta that = (ImageAssetMeta) obj;
        return Objects.equals(this.codec, that.codec) && Objects.equals(this.width, that.width)
            && Objects.equals(this.height, that.height) && Objects.equals(this.size, that.size)
            && Objects.equals(this.mode, that.mode) && Objects.equals(this.errorInfo, that.errorInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codec, width, height, size, mode, errorInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageAssetMeta {\n");
        sb.append("    codec: ").append(toIndentedString(codec)).append("\n");
        sb.append("    width: ").append(toIndentedString(width)).append("\n");
        sb.append("    height: ").append(toIndentedString(height)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    errorInfo: ").append(toIndentedString(errorInfo)).append("\n");
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
