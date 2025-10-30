package com.huaweicloud.sdk.live.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateWatermarkTemplateResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private Integer type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "picture_url")

    private String pictureUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "width")

    private BigDecimal width;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "height")

    private BigDecimal height;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "location")

    private WatermarkLocation location;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "text")

    private WordWaterMarkInfo text;

    /**
     * 业务属性，cloud_live：云直播，默认值；media_live：媒体直播，不支持修改
     */
    public static final class SceneEnum {

        /**
         * Enum CLOUD_LIVE for value: "cloud_live"
         */
        public static final SceneEnum CLOUD_LIVE = new SceneEnum("cloud_live");

        /**
         * Enum MEDIA_LIVE for value: "media_live"
         */
        public static final SceneEnum MEDIA_LIVE = new SceneEnum("media_live");

        private static final Map<String, SceneEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SceneEnum> createStaticFields() {
            Map<String, SceneEnum> map = new HashMap<>();
            map.put("cloud_live", CLOUD_LIVE);
            map.put("media_live", MEDIA_LIVE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SceneEnum(String value) {
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
        public static SceneEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SceneEnum(value));
        }

        public static SceneEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SceneEnum) {
                return this.value.equals(((SceneEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scene")

    private SceneEnum scene;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")

    private String xRequestId;

    public CreateWatermarkTemplateResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 水印模板名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateWatermarkTemplateResponse withType(Integer type) {
        this.type = type;
        return this;
    }

    /**
     * 水印类型，0图片，1文字,2图文共存
     * minimum: 0
     * maximum: 1
     * @return type
     */
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public CreateWatermarkTemplateResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 模板注释
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateWatermarkTemplateResponse withPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
        return this;
    }

    /**
     * 图片下载路径 校验规则：图片URL长度大于0，最大长度2048，能够正常按URL格式解析，必须是 http 或 https 协议。（OTT 场景限制只支持https） 图片格式: .png/.jpg/.PNG/.JPG结尾
     * @return pictureUrl
     */
    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public CreateWatermarkTemplateResponse withWidth(BigDecimal width) {
        this.width = width;
        return this;
    }

    /**
     * 1）整数型代表水印图片宽的像素值，范围0或[8，4096]，单位px。 2）小数型代表相对输出视频分辨率宽的比率，范围[0,1) 建议宽高只设置一项，另外一项会自适应缩放，避免变形。宽高全部设置为0表示水印图片原始宽高 百分比限制最多保留小数点后4位，width和height 只支持同时为像素或是百分比，不支持一个像素，一个百分比
     * minimum: 0
     * maximum: 4096
     * @return width
     */
    public BigDecimal getWidth() {
        return width;
    }

    public void setWidth(BigDecimal width) {
        this.width = width;
    }

    public CreateWatermarkTemplateResponse withHeight(BigDecimal height) {
        this.height = height;
        return this;
    }

    /**
     * 水印图片高，值有两种形式： 1）整数型代表水印图片高的像素值，范围0或[8，4096]，单位px。 2）小数型代表相对输出视频分辨率高的比率，范围[0，1) 建议宽高只设置一项，另外一项会自适应缩放，避免变形。宽高全部设置为0表示水印图片原始宽高 百分比限制最多保留小数点后4位，width和height 只支持同时为像素或是百分比，不支持一个像素，一个百分比
     * minimum: 0
     * maximum: 4096
     * @return height
     */
    public BigDecimal getHeight() {
        return height;
    }

    public void setHeight(BigDecimal height) {
        this.height = height;
    }

    public CreateWatermarkTemplateResponse withLocation(WatermarkLocation location) {
        this.location = location;
        return this;
    }

    public CreateWatermarkTemplateResponse withLocation(Consumer<WatermarkLocation> locationSetter) {
        if (this.location == null) {
            this.location = new WatermarkLocation();
            locationSetter.accept(this.location);
        }

        return this;
    }

    /**
     * Get location
     * @return location
     */
    public WatermarkLocation getLocation() {
        return location;
    }

    public void setLocation(WatermarkLocation location) {
        this.location = location;
    }

    public CreateWatermarkTemplateResponse withText(WordWaterMarkInfo text) {
        this.text = text;
        return this;
    }

    public CreateWatermarkTemplateResponse withText(Consumer<WordWaterMarkInfo> textSetter) {
        if (this.text == null) {
            this.text = new WordWaterMarkInfo();
            textSetter.accept(this.text);
        }

        return this;
    }

    /**
     * Get text
     * @return text
     */
    public WordWaterMarkInfo getText() {
        return text;
    }

    public void setText(WordWaterMarkInfo text) {
        this.text = text;
    }

    public CreateWatermarkTemplateResponse withScene(SceneEnum scene) {
        this.scene = scene;
        return this;
    }

    /**
     * 业务属性，cloud_live：云直播，默认值；media_live：媒体直播，不支持修改
     * @return scene
     */
    public SceneEnum getScene() {
        return scene;
    }

    public void setScene(SceneEnum scene) {
        this.scene = scene;
    }

    public CreateWatermarkTemplateResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateWatermarkTemplateResponse that = (CreateWatermarkTemplateResponse) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.type, that.type)
            && Objects.equals(this.description, that.description) && Objects.equals(this.pictureUrl, that.pictureUrl)
            && Objects.equals(this.width, that.width) && Objects.equals(this.height, that.height)
            && Objects.equals(this.location, that.location) && Objects.equals(this.text, that.text)
            && Objects.equals(this.scene, that.scene) && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, description, pictureUrl, width, height, location, text, scene, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateWatermarkTemplateResponse {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    pictureUrl: ").append(toIndentedString(pictureUrl)).append("\n");
        sb.append("    width: ").append(toIndentedString(width)).append("\n");
        sb.append("    height: ").append(toIndentedString(height)).append("\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
        sb.append("    text: ").append(toIndentedString(text)).append("\n");
        sb.append("    scene: ").append(toIndentedString(scene)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
