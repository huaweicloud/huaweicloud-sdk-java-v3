package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * SystemProperty
 */
public class SystemProperty {

    /**
     * 操作。 - ADD： 增加 - DELETE： 删除
     */
    public static final class ActionEnum {

        /**
         * Enum ADD for value: "ADD"
         */
        public static final ActionEnum ADD = new ActionEnum("ADD");

        /**
         * Enum DELETE for value: "DELETE"
         */
        public static final ActionEnum DELETE = new ActionEnum("DELETE");

        private static final Map<String, ActionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ActionEnum> createStaticFields() {
            Map<String, ActionEnum> map = new HashMap<>();
            map.put("ADD", ADD);
            map.put("DELETE", DELETE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ActionEnum(String value) {
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
        public static ActionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ActionEnum(value));
        }

        public static ActionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ActionEnum) {
                return this.value.equals(((ActionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private ActionEnum action;

    /**
     * 系统属性。 * STYLE_ID * DH_ID * PLATFORM_AVAILABLE * RENDER_ENGINE： 引擎类型。value可选UE或MetaEngine。 * BACKGROUND_IMG: 视频制作的2D背景图片。value设置成Yes * BACKGROUND_SCENE: 视频制作的2D背景场景。value可选Horizontal（横屏）或者Vertical（竖屏）
     */
    public static final class KeyEnum {

        /**
         * Enum STYLE_ID for value: "STYLE_ID"
         */
        public static final KeyEnum STYLE_ID = new KeyEnum("STYLE_ID");

        /**
         * Enum DH_ID for value: "DH_ID"
         */
        public static final KeyEnum DH_ID = new KeyEnum("DH_ID");

        /**
         * Enum PLATFORM_AVAILABLE for value: "PLATFORM_AVAILABLE"
         */
        public static final KeyEnum PLATFORM_AVAILABLE = new KeyEnum("PLATFORM_AVAILABLE");

        /**
         * Enum RENDER_ENGINE for value: "RENDER_ENGINE"
         */
        public static final KeyEnum RENDER_ENGINE = new KeyEnum("RENDER_ENGINE");

        /**
         * Enum BACKGROUND_IMG for value: "BACKGROUND_IMG"
         */
        public static final KeyEnum BACKGROUND_IMG = new KeyEnum("BACKGROUND_IMG");

        /**
         * Enum BACKGROUND_SCENE for value: "BACKGROUND_SCENE"
         */
        public static final KeyEnum BACKGROUND_SCENE = new KeyEnum("BACKGROUND_SCENE");

        private static final Map<String, KeyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, KeyEnum> createStaticFields() {
            Map<String, KeyEnum> map = new HashMap<>();
            map.put("STYLE_ID", STYLE_ID);
            map.put("DH_ID", DH_ID);
            map.put("PLATFORM_AVAILABLE", PLATFORM_AVAILABLE);
            map.put("RENDER_ENGINE", RENDER_ENGINE);
            map.put("BACKGROUND_IMG", BACKGROUND_IMG);
            map.put("BACKGROUND_SCENE", BACKGROUND_SCENE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        KeyEnum(String value) {
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
        public static KeyEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new KeyEnum(value));
        }

        public static KeyEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof KeyEnum) {
                return this.value.equals(((KeyEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private KeyEnum key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    public SystemProperty withAction(ActionEnum action) {
        this.action = action;
        return this;
    }

    /**
     * 操作。 - ADD： 增加 - DELETE： 删除
     * @return action
     */
    public ActionEnum getAction() {
        return action;
    }

    public void setAction(ActionEnum action) {
        this.action = action;
    }

    public SystemProperty withKey(KeyEnum key) {
        this.key = key;
        return this;
    }

    /**
     * 系统属性。 * STYLE_ID * DH_ID * PLATFORM_AVAILABLE * RENDER_ENGINE： 引擎类型。value可选UE或MetaEngine。 * BACKGROUND_IMG: 视频制作的2D背景图片。value设置成Yes * BACKGROUND_SCENE: 视频制作的2D背景场景。value可选Horizontal（横屏）或者Vertical（竖屏）
     * @return key
     */
    public KeyEnum getKey() {
        return key;
    }

    public void setKey(KeyEnum key) {
        this.key = key;
    }

    public SystemProperty withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * 属性值。
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SystemProperty that = (SystemProperty) obj;
        return Objects.equals(this.action, that.action) && Objects.equals(this.key, that.key)
            && Objects.equals(this.value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, key, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SystemProperty {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
