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
 * 开通委托功能请求体。
 */
public class CreateAgenciesReq {

    /**
     * 委托场景。   - WORKSPACE：云桌面。   - CLOUD_GAME：云游戏。   - CLOUD_STORAGE：云存储。   - SCREEN_RECORD：录屏审计。
     */
    public static final class SceneEnum {

        /**
         * Enum WORKSPACE for value: "WORKSPACE"
         */
        public static final SceneEnum WORKSPACE = new SceneEnum("WORKSPACE");

        /**
         * Enum CLOUD_GAME for value: "CLOUD_GAME"
         */
        public static final SceneEnum CLOUD_GAME = new SceneEnum("CLOUD_GAME");

        /**
         * Enum CLOUD_STORAGE for value: "CLOUD_STORAGE"
         */
        public static final SceneEnum CLOUD_STORAGE = new SceneEnum("CLOUD_STORAGE");

        /**
         * Enum SCREEN_RECORD for value: "SCREEN_RECORD"
         */
        public static final SceneEnum SCREEN_RECORD = new SceneEnum("SCREEN_RECORD");

        private static final Map<String, SceneEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SceneEnum> createStaticFields() {
            Map<String, SceneEnum> map = new HashMap<>();
            map.put("WORKSPACE", WORKSPACE);
            map.put("CLOUD_GAME", CLOUD_GAME);
            map.put("CLOUD_STORAGE", CLOUD_STORAGE);
            map.put("SCREEN_RECORD", SCREEN_RECORD);
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

    /**
     * 操作类型。 - CREATE 创建 - FIX 修复
     */
    public static final class ActionEnum {

        /**
         * Enum CREATE for value: "CREATE"
         */
        public static final ActionEnum CREATE = new ActionEnum("CREATE");

        /**
         * Enum FIX for value: "FIX"
         */
        public static final ActionEnum FIX = new ActionEnum("FIX");

        private static final Map<String, ActionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ActionEnum> createStaticFields() {
            Map<String, ActionEnum> map = new HashMap<>();
            map.put("CREATE", CREATE);
            map.put("FIX", FIX);
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

    public CreateAgenciesReq withScene(SceneEnum scene) {
        this.scene = scene;
        return this;
    }

    /**
     * 委托场景。   - WORKSPACE：云桌面。   - CLOUD_GAME：云游戏。   - CLOUD_STORAGE：云存储。   - SCREEN_RECORD：录屏审计。
     * @return scene
     */
    public SceneEnum getScene() {
        return scene;
    }

    public void setScene(SceneEnum scene) {
        this.scene = scene;
    }

    public CreateAgenciesReq withAction(ActionEnum action) {
        this.action = action;
        return this;
    }

    /**
     * 操作类型。 - CREATE 创建 - FIX 修复
     * @return action
     */
    public ActionEnum getAction() {
        return action;
    }

    public void setAction(ActionEnum action) {
        this.action = action;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateAgenciesReq that = (CreateAgenciesReq) obj;
        return Objects.equals(this.scene, that.scene) && Objects.equals(this.action, that.action);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scene, action);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAgenciesReq {\n");
        sb.append("    scene: ").append(toIndentedString(scene)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
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
