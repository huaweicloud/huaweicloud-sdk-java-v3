package com.huaweicloud.sdk.functiongraph.v2.model;

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
 * 触发器结构体
 */
public class Trigger {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trigger_name")

    private String triggerName;

    /**
     * 触发器类型 FLOWTIMER：定时触发器 SMN：SMN触发器 APIG：APIG触发器(共享版) APIG_DE：APIG触发器(专享版) OBS：OBS触发器
     */
    public static final class TriggerTypeEnum {

        /**
         * Enum FLOWTIMER for value: "FLOWTIMER"
         */
        public static final TriggerTypeEnum FLOWTIMER = new TriggerTypeEnum("FLOWTIMER");

        /**
         * Enum SMN for value: "SMN"
         */
        public static final TriggerTypeEnum SMN = new TriggerTypeEnum("SMN");

        /**
         * Enum APIG for value: "APIG"
         */
        public static final TriggerTypeEnum APIG = new TriggerTypeEnum("APIG");

        /**
         * Enum APIG_DE for value: "APIG_DE"
         */
        public static final TriggerTypeEnum APIG_DE = new TriggerTypeEnum("APIG_DE");

        /**
         * Enum OBS for value: "OBS"
         */
        public static final TriggerTypeEnum OBS = new TriggerTypeEnum("OBS");

        private static final Map<String, TriggerTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TriggerTypeEnum> createStaticFields() {
            Map<String, TriggerTypeEnum> map = new HashMap<>();
            map.put("FLOWTIMER", FLOWTIMER);
            map.put("SMN", SMN);
            map.put("APIG", APIG);
            map.put("APIG_DE", APIG_DE);
            map.put("OBS", OBS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TriggerTypeEnum(String value) {
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
        public static TriggerTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            TriggerTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TriggerTypeEnum(value);
            }
            return result;
        }

        public static TriggerTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            TriggerTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TriggerTypeEnum) {
                return this.value.equals(((TriggerTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trigger_type")

    private TriggerTypeEnum triggerType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    private Boolean enabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trigger_config")

    private OBSTriggerConfig triggerConfig;

    public Trigger withTriggerName(String triggerName) {
        this.triggerName = triggerName;
        return this;
    }

    /**
     * 触发器名称
     * @return triggerName
     */
    public String getTriggerName() {
        return triggerName;
    }

    public void setTriggerName(String triggerName) {
        this.triggerName = triggerName;
    }

    public Trigger withTriggerType(TriggerTypeEnum triggerType) {
        this.triggerType = triggerType;
        return this;
    }

    /**
     * 触发器类型 FLOWTIMER：定时触发器 SMN：SMN触发器 APIG：APIG触发器(共享版) APIG_DE：APIG触发器(专享版) OBS：OBS触发器
     * @return triggerType
     */
    public TriggerTypeEnum getTriggerType() {
        return triggerType;
    }

    public void setTriggerType(TriggerTypeEnum triggerType) {
        this.triggerType = triggerType;
    }

    public Trigger withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * 是否启用触发器
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Trigger withTriggerConfig(OBSTriggerConfig triggerConfig) {
        this.triggerConfig = triggerConfig;
        return this;
    }

    public Trigger withTriggerConfig(Consumer<OBSTriggerConfig> triggerConfigSetter) {
        if (this.triggerConfig == null) {
            this.triggerConfig = new OBSTriggerConfig();
            triggerConfigSetter.accept(this.triggerConfig);
        }

        return this;
    }

    /**
     * Get triggerConfig
     * @return triggerConfig
     */
    public OBSTriggerConfig getTriggerConfig() {
        return triggerConfig;
    }

    public void setTriggerConfig(OBSTriggerConfig triggerConfig) {
        this.triggerConfig = triggerConfig;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Trigger trigger = (Trigger) o;
        return Objects.equals(this.triggerName, trigger.triggerName)
            && Objects.equals(this.triggerType, trigger.triggerType) && Objects.equals(this.enabled, trigger.enabled)
            && Objects.equals(this.triggerConfig, trigger.triggerConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(triggerName, triggerType, enabled, triggerConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Trigger {\n");
        sb.append("    triggerName: ").append(toIndentedString(triggerName)).append("\n");
        sb.append("    triggerType: ").append(toIndentedString(triggerType)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    triggerConfig: ").append(toIndentedString(triggerConfig)).append("\n");
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
