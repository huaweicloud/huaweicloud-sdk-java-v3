package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 容灾实例切换的RPO和RTO指标
 */
public class NoSQLDrRpoAndRto {

    /**
     * 场景，枚举值   FAILOVER 强制切换;    SWITCHOVER 主备倒换
     */
    public static final class SceneEnum {

        /**
         * Enum FAILOVER for value: "FAILOVER"
         */
        public static final SceneEnum FAILOVER = new SceneEnum("FAILOVER");

        /**
         * Enum SWITCHOVER for value: "SWITCHOVER"
         */
        public static final SceneEnum SWITCHOVER = new SceneEnum("SWITCHOVER");

        private static final Map<String, SceneEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SceneEnum> createStaticFields() {
            Map<String, SceneEnum> map = new HashMap<>();
            map.put("FAILOVER", FAILOVER);
            map.put("SWITCHOVER", SWITCHOVER);
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
            SceneEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new SceneEnum(value);
            }
            return result;
        }

        public static SceneEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            SceneEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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
    @JsonProperty(value = "rpo")

    private Long rpo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rto")

    private Long rto;

    public NoSQLDrRpoAndRto withScene(SceneEnum scene) {
        this.scene = scene;
        return this;
    }

    /**
     * 场景，枚举值   FAILOVER 强制切换;    SWITCHOVER 主备倒换
     * @return scene
     */
    public SceneEnum getScene() {
        return scene;
    }

    public void setScene(SceneEnum scene) {
        this.scene = scene;
    }

    public NoSQLDrRpoAndRto withRpo(Long rpo) {
        this.rpo = rpo;
        return this;
    }

    /**
     * 倒换或切换丢失数据时长，单位：秒（s）
     * @return rpo
     */
    public Long getRpo() {
        return rpo;
    }

    public void setRpo(Long rpo) {
        this.rpo = rpo;
    }

    public NoSQLDrRpoAndRto withRto(Long rto) {
        this.rto = rto;
        return this;
    }

    /**
     * 倒换或切换恢复时长，单位：秒（s）
     * @return rto
     */
    public Long getRto() {
        return rto;
    }

    public void setRto(Long rto) {
        this.rto = rto;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NoSQLDrRpoAndRto noSQLDrRpoAndRto = (NoSQLDrRpoAndRto) o;
        return Objects.equals(this.scene, noSQLDrRpoAndRto.scene) && Objects.equals(this.rpo, noSQLDrRpoAndRto.rpo)
            && Objects.equals(this.rto, noSQLDrRpoAndRto.rto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scene, rpo, rto);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NoSQLDrRpoAndRto {\n");
        sb.append("    scene: ").append(toIndentedString(scene)).append("\n");
        sb.append("    rpo: ").append(toIndentedString(rpo)).append("\n");
        sb.append("    rto: ").append(toIndentedString(rto)).append("\n");
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
