package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowSlaCustomizedTemplateResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    /**
     * 触发类型(EVENT_TICKET,ALARM_TICKET,CHANGE_NOTE,TO_DO_TASKS,ISSUE_TICKET)
     */
    public static final class TriggerTypeEnum {

        /**
         * Enum EVENT_TICKET for value: "EVENT_TICKET"
         */
        public static final TriggerTypeEnum EVENT_TICKET = new TriggerTypeEnum("EVENT_TICKET");

        /**
         * Enum ALARM_TICKET for value: "ALARM_TICKET"
         */
        public static final TriggerTypeEnum ALARM_TICKET = new TriggerTypeEnum("ALARM_TICKET");

        /**
         * Enum CHANGE_NOTE for value: "CHANGE_NOTE"
         */
        public static final TriggerTypeEnum CHANGE_NOTE = new TriggerTypeEnum("CHANGE_NOTE");

        /**
         * Enum TO_DO_TASKS for value: "TO_DO_TASKS"
         */
        public static final TriggerTypeEnum TO_DO_TASKS = new TriggerTypeEnum("TO_DO_TASKS");

        /**
         * Enum ISSUE_TICKET for value: "ISSUE_TICKET"
         */
        public static final TriggerTypeEnum ISSUE_TICKET = new TriggerTypeEnum("ISSUE_TICKET");

        private static final Map<String, TriggerTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TriggerTypeEnum> createStaticFields() {
            Map<String, TriggerTypeEnum> map = new HashMap<>();
            map.put("EVENT_TICKET", EVENT_TICKET);
            map.put("ALARM_TICKET", ALARM_TICKET);
            map.put("CHANGE_NOTE", CHANGE_NOTE);
            map.put("TO_DO_TASKS", TO_DO_TASKS);
            map.put("ISSUE_TICKET", ISSUE_TICKET);
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
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TriggerTypeEnum(value));
        }

        public static TriggerTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
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
    @JsonProperty(value = "trigger_level")

    private String triggerLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "application")

    private String application;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_template")

    private Boolean defaultTemplate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    private Boolean enabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sla_rules")

    private List<SlaRuleInfo> slaRules = null;

    /**
     * 生效类型（MON_SUN_24_HOURS一直生效、SPECIFIC_TIME阶段性生效）
     */
    public static final class EffectiveTypeEnum {

        /**
         * Enum MON_SUN_24_HOURS for value: "MON_SUN_24_HOURS"
         */
        public static final EffectiveTypeEnum MON_SUN_24_HOURS = new EffectiveTypeEnum("MON_SUN_24_HOURS");

        /**
         * Enum SPECIFIC_TIME for value: "SPECIFIC_TIME"
         */
        public static final EffectiveTypeEnum SPECIFIC_TIME = new EffectiveTypeEnum("SPECIFIC_TIME");

        private static final Map<String, EffectiveTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, EffectiveTypeEnum> createStaticFields() {
            Map<String, EffectiveTypeEnum> map = new HashMap<>();
            map.put("MON_SUN_24_HOURS", MON_SUN_24_HOURS);
            map.put("SPECIFIC_TIME", SPECIFIC_TIME);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        EffectiveTypeEnum(String value) {
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
        public static EffectiveTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new EffectiveTypeEnum(value));
        }

        public static EffectiveTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof EffectiveTypeEnum) {
                return this.value.equals(((EffectiveTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "effective_type")

    private EffectiveTypeEnum effectiveType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "effective_period")

    private String effectivePeriod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "effective_start_time")

    private String effectiveStartTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "effective_end_time")

    private String effectiveEndTime;

    public ShowSlaCustomizedTemplateResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowSlaCustomizedTemplateResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowSlaCustomizedTemplateResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShowSlaCustomizedTemplateResponse withTriggerType(TriggerTypeEnum triggerType) {
        this.triggerType = triggerType;
        return this;
    }

    /**
     * 触发类型(EVENT_TICKET,ALARM_TICKET,CHANGE_NOTE,TO_DO_TASKS,ISSUE_TICKET)
     * @return triggerType
     */
    public TriggerTypeEnum getTriggerType() {
        return triggerType;
    }

    public void setTriggerType(TriggerTypeEnum triggerType) {
        this.triggerType = triggerType;
    }

    public ShowSlaCustomizedTemplateResponse withTriggerLevel(String triggerLevel) {
        this.triggerLevel = triggerLevel;
        return this;
    }

    /**
     * 触发等级
     * @return triggerLevel
     */
    public String getTriggerLevel() {
        return triggerLevel;
    }

    public void setTriggerLevel(String triggerLevel) {
        this.triggerLevel = triggerLevel;
    }

    public ShowSlaCustomizedTemplateResponse withApplication(String application) {
        this.application = application;
        return this;
    }

    /**
     * 应用
     * @return application
     */
    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public ShowSlaCustomizedTemplateResponse withDefaultTemplate(Boolean defaultTemplate) {
        this.defaultTemplate = defaultTemplate;
        return this;
    }

    /**
     * 默认模板
     * @return defaultTemplate
     */
    public Boolean getDefaultTemplate() {
        return defaultTemplate;
    }

    public void setDefaultTemplate(Boolean defaultTemplate) {
        this.defaultTemplate = defaultTemplate;
    }

    public ShowSlaCustomizedTemplateResponse withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * 启用状态
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public ShowSlaCustomizedTemplateResponse withSlaRules(List<SlaRuleInfo> slaRules) {
        this.slaRules = slaRules;
        return this;
    }

    public ShowSlaCustomizedTemplateResponse addSlaRulesItem(SlaRuleInfo slaRulesItem) {
        if (this.slaRules == null) {
            this.slaRules = new ArrayList<>();
        }
        this.slaRules.add(slaRulesItem);
        return this;
    }

    public ShowSlaCustomizedTemplateResponse withSlaRules(Consumer<List<SlaRuleInfo>> slaRulesSetter) {
        if (this.slaRules == null) {
            this.slaRules = new ArrayList<>();
        }
        slaRulesSetter.accept(this.slaRules);
        return this;
    }

    /**
     * 规则信息
     * @return slaRules
     */
    public List<SlaRuleInfo> getSlaRules() {
        return slaRules;
    }

    public void setSlaRules(List<SlaRuleInfo> slaRules) {
        this.slaRules = slaRules;
    }

    public ShowSlaCustomizedTemplateResponse withEffectiveType(EffectiveTypeEnum effectiveType) {
        this.effectiveType = effectiveType;
        return this;
    }

    /**
     * 生效类型（MON_SUN_24_HOURS一直生效、SPECIFIC_TIME阶段性生效）
     * @return effectiveType
     */
    public EffectiveTypeEnum getEffectiveType() {
        return effectiveType;
    }

    public void setEffectiveType(EffectiveTypeEnum effectiveType) {
        this.effectiveType = effectiveType;
    }

    public ShowSlaCustomizedTemplateResponse withEffectivePeriod(String effectivePeriod) {
        this.effectivePeriod = effectivePeriod;
        return this;
    }

    /**
     * 生效周期（每天、周一、周二、周三、周四、周五、周六、周日）
     * @return effectivePeriod
     */
    public String getEffectivePeriod() {
        return effectivePeriod;
    }

    public void setEffectivePeriod(String effectivePeriod) {
        this.effectivePeriod = effectivePeriod;
    }

    public ShowSlaCustomizedTemplateResponse withEffectiveStartTime(String effectiveStartTime) {
        this.effectiveStartTime = effectiveStartTime;
        return this;
    }

    /**
     * 生效开始时间
     * @return effectiveStartTime
     */
    public String getEffectiveStartTime() {
        return effectiveStartTime;
    }

    public void setEffectiveStartTime(String effectiveStartTime) {
        this.effectiveStartTime = effectiveStartTime;
    }

    public ShowSlaCustomizedTemplateResponse withEffectiveEndTime(String effectiveEndTime) {
        this.effectiveEndTime = effectiveEndTime;
        return this;
    }

    /**
     * 生效结束时间
     * @return effectiveEndTime
     */
    public String getEffectiveEndTime() {
        return effectiveEndTime;
    }

    public void setEffectiveEndTime(String effectiveEndTime) {
        this.effectiveEndTime = effectiveEndTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowSlaCustomizedTemplateResponse that = (ShowSlaCustomizedTemplateResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.triggerType, that.triggerType)
            && Objects.equals(this.triggerLevel, that.triggerLevel)
            && Objects.equals(this.application, that.application)
            && Objects.equals(this.defaultTemplate, that.defaultTemplate) && Objects.equals(this.enabled, that.enabled)
            && Objects.equals(this.slaRules, that.slaRules) && Objects.equals(this.effectiveType, that.effectiveType)
            && Objects.equals(this.effectivePeriod, that.effectivePeriod)
            && Objects.equals(this.effectiveStartTime, that.effectiveStartTime)
            && Objects.equals(this.effectiveEndTime, that.effectiveEndTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            description,
            triggerType,
            triggerLevel,
            application,
            defaultTemplate,
            enabled,
            slaRules,
            effectiveType,
            effectivePeriod,
            effectiveStartTime,
            effectiveEndTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSlaCustomizedTemplateResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    triggerType: ").append(toIndentedString(triggerType)).append("\n");
        sb.append("    triggerLevel: ").append(toIndentedString(triggerLevel)).append("\n");
        sb.append("    application: ").append(toIndentedString(application)).append("\n");
        sb.append("    defaultTemplate: ").append(toIndentedString(defaultTemplate)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    slaRules: ").append(toIndentedString(slaRules)).append("\n");
        sb.append("    effectiveType: ").append(toIndentedString(effectiveType)).append("\n");
        sb.append("    effectivePeriod: ").append(toIndentedString(effectivePeriod)).append("\n");
        sb.append("    effectiveStartTime: ").append(toIndentedString(effectiveStartTime)).append("\n");
        sb.append("    effectiveEndTime: ").append(toIndentedString(effectiveEndTime)).append("\n");
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
