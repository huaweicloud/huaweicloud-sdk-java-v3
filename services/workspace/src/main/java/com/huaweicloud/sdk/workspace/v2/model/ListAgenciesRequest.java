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
 * Request Object
 */
public class ListAgenciesRequest {

    /**
     * 委托场景。 - WORKSPACE：云桌面。 - CLOUD_GAME：云游戏。 - CLOUD_STORAGE 云存储。 - SCREEN_RECORD：录屏审计。
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

    public ListAgenciesRequest withScene(SceneEnum scene) {
        this.scene = scene;
        return this;
    }

    /**
     * 委托场景。 - WORKSPACE：云桌面。 - CLOUD_GAME：云游戏。 - CLOUD_STORAGE 云存储。 - SCREEN_RECORD：录屏审计。
     * @return scene
     */
    public SceneEnum getScene() {
        return scene;
    }

    public void setScene(SceneEnum scene) {
        this.scene = scene;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAgenciesRequest that = (ListAgenciesRequest) obj;
        return Objects.equals(this.scene, that.scene);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scene);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAgenciesRequest {\n");
        sb.append("    scene: ").append(toIndentedString(scene)).append("\n");
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
