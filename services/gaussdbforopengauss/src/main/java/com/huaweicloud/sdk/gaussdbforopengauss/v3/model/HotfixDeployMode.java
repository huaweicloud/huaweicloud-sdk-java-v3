package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * HotfixDeployMode
 */
public class HotfixDeployMode {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_upgrade")

    private Boolean defaultUpgrade;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Long updateTime;

    /**
     * **参数解释**： 可升级该补丁的实例部署形态。 **取值范围**： - distributed：包括独立部署，基础版混合部署。 - centralization_standard：包括主备版。
     */
    public static final class ModeEnum {

        /**
         * Enum CENTRALIZATION_STANDARD for value: "centralization_standard"
         */
        public static final ModeEnum CENTRALIZATION_STANDARD = new ModeEnum("centralization_standard");

        /**
         * Enum DISTRIBUTED for value: "distributed"
         */
        public static final ModeEnum DISTRIBUTED = new ModeEnum("distributed");

        private static final Map<String, ModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ModeEnum> createStaticFields() {
            Map<String, ModeEnum> map = new HashMap<>();
            map.put("centralization_standard", CENTRALIZATION_STANDARD);
            map.put("distributed", DISTRIBUTED);
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

    public HotfixDeployMode withDefaultUpgrade(Boolean defaultUpgrade) {
        this.defaultUpgrade = defaultUpgrade;
        return this;
    }

    /**
     * **参数解释**： 补丁默认升级策略。 **取值范围**： - true：无需选择，默认升级该版本。 - false：用户可选，选择后升级该版本。
     * @return defaultUpgrade
     */
    public Boolean getDefaultUpgrade() {
        return defaultUpgrade;
    }

    public void setDefaultUpgrade(Boolean defaultUpgrade) {
        this.defaultUpgrade = defaultUpgrade;
    }

    public HotfixDeployMode withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * **参数解释**： 热补丁升级策略的修改时间，UNIX时间戳格式，单位是毫秒。 **取值范围**： 不涉及。
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public HotfixDeployMode withMode(ModeEnum mode) {
        this.mode = mode;
        return this;
    }

    /**
     * **参数解释**： 可升级该补丁的实例部署形态。 **取值范围**： - distributed：包括独立部署，基础版混合部署。 - centralization_standard：包括主备版。
     * @return mode
     */
    public ModeEnum getMode() {
        return mode;
    }

    public void setMode(ModeEnum mode) {
        this.mode = mode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HotfixDeployMode that = (HotfixDeployMode) obj;
        return Objects.equals(this.defaultUpgrade, that.defaultUpgrade)
            && Objects.equals(this.updateTime, that.updateTime) && Objects.equals(this.mode, that.mode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(defaultUpgrade, updateTime, mode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HotfixDeployMode {\n");
        sb.append("    defaultUpgrade: ").append(toIndentedString(defaultUpgrade)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
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
