package com.huaweicloud.sdk.live.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Request Object
 */
public class ListWatermarkTemplateRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * 区分媒体直播还是云直播，默认云直播，默认查询cloud_live
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
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public ListWatermarkTemplateRequest withName(String name) {
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

    public ListWatermarkTemplateRequest withScene(SceneEnum scene) {
        this.scene = scene;
        return this;
    }

    /**
     * 区分媒体直播还是云直播，默认云直播，默认查询cloud_live
     * @return scene
     */
    public SceneEnum getScene() {
        return scene;
    }

    public void setScene(SceneEnum scene) {
        this.scene = scene;
    }

    public ListWatermarkTemplateRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量，表示从此偏移量开始查询，offset大于等于0
     * minimum: 0
     * maximum: 4096
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListWatermarkTemplateRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页记录数，取值范围[1,100]，默认值10
     * minimum: 1
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListWatermarkTemplateRequest that = (ListWatermarkTemplateRequest) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.scene, that.scene)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, scene, offset, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListWatermarkTemplateRequest {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    scene: ").append(toIndentedString(scene)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
