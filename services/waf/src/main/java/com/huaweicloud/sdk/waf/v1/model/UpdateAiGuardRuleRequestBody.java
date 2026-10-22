package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新规则请求
 */
public class UpdateAiGuardRuleRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * 规则状态，可选：enable(启用), disable(禁用)
     */
    public static final class StatusEnum {

        /**
         * Enum ENABLE for value: "enable"
         */
        public static final StatusEnum ENABLE = new StatusEnum("enable");

        /**
         * Enum DISABLE for value: "disable"
         */
        public static final StatusEnum DISABLE = new StatusEnum("disable");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("enable", ENABLE);
            map.put("disable", DISABLE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
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
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StatusEnum(value));
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detect_opts")

    private List<DetectOpt> detectOpts = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private AiGuardRuleAction action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detect_labels")

    private DetectLabels detectLabels;

    /**
     * 不在支持语言范围的防护动作,pass: 放行, block: 拦截
     */
    public static final class NotSupportedLanguageActionEnum {

        /**
         * Enum PASS for value: "pass"
         */
        public static final NotSupportedLanguageActionEnum PASS = new NotSupportedLanguageActionEnum("pass");

        /**
         * Enum BLOCK for value: "block"
         */
        public static final NotSupportedLanguageActionEnum BLOCK = new NotSupportedLanguageActionEnum("block");

        private static final Map<String, NotSupportedLanguageActionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, NotSupportedLanguageActionEnum> createStaticFields() {
            Map<String, NotSupportedLanguageActionEnum> map = new HashMap<>();
            map.put("pass", PASS);
            map.put("block", BLOCK);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        NotSupportedLanguageActionEnum(String value) {
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
        public static NotSupportedLanguageActionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElse(new NotSupportedLanguageActionEnum(value));
        }

        public static NotSupportedLanguageActionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof NotSupportedLanguageActionEnum) {
                return this.value.equals(((NotSupportedLanguageActionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "not_supported_language_action")

    private NotSupportedLanguageActionEnum notSupportedLanguageAction;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_answers_id")

    private String customAnswersId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_answers_name")

    private String customAnswersName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "abuse_config")

    private AbuseConfig abuseConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic_config")

    private TopicConfig topicConfig;

    public UpdateAiGuardRuleRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 规则名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateAiGuardRuleRequestBody withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 规则状态，可选：enable(启用), disable(禁用)
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public UpdateAiGuardRuleRequestBody withDetectOpts(List<DetectOpt> detectOpts) {
        this.detectOpts = detectOpts;
        return this;
    }

    public UpdateAiGuardRuleRequestBody addDetectOptsItem(DetectOpt detectOptsItem) {
        if (this.detectOpts == null) {
            this.detectOpts = new ArrayList<>();
        }
        this.detectOpts.add(detectOptsItem);
        return this;
    }

    public UpdateAiGuardRuleRequestBody withDetectOpts(Consumer<List<DetectOpt>> detectOptsSetter) {
        if (this.detectOpts == null) {
            this.detectOpts = new ArrayList<>();
        }
        detectOptsSetter.accept(this.detectOpts);
        return this;
    }

    /**
     * 检测选项配置列表
     * @return detectOpts
     */
    public List<DetectOpt> getDetectOpts() {
        return detectOpts;
    }

    public void setDetectOpts(List<DetectOpt> detectOpts) {
        this.detectOpts = detectOpts;
    }

    public UpdateAiGuardRuleRequestBody withAction(AiGuardRuleAction action) {
        this.action = action;
        return this;
    }

    public UpdateAiGuardRuleRequestBody withAction(Consumer<AiGuardRuleAction> actionSetter) {
        if (this.action == null) {
            this.action = new AiGuardRuleAction();
            actionSetter.accept(this.action);
        }

        return this;
    }

    /**
     * Get action
     * @return action
     */
    public AiGuardRuleAction getAction() {
        return action;
    }

    public void setAction(AiGuardRuleAction action) {
        this.action = action;
    }

    public UpdateAiGuardRuleRequestBody withDetectLabels(DetectLabels detectLabels) {
        this.detectLabels = detectLabels;
        return this;
    }

    public UpdateAiGuardRuleRequestBody withDetectLabels(Consumer<DetectLabels> detectLabelsSetter) {
        if (this.detectLabels == null) {
            this.detectLabels = new DetectLabels();
            detectLabelsSetter.accept(this.detectLabels);
        }

        return this;
    }

    /**
     * Get detectLabels
     * @return detectLabels
     */
    public DetectLabels getDetectLabels() {
        return detectLabels;
    }

    public void setDetectLabels(DetectLabels detectLabels) {
        this.detectLabels = detectLabels;
    }

    public UpdateAiGuardRuleRequestBody withNotSupportedLanguageAction(
        NotSupportedLanguageActionEnum notSupportedLanguageAction) {
        this.notSupportedLanguageAction = notSupportedLanguageAction;
        return this;
    }

    /**
     * 不在支持语言范围的防护动作,pass: 放行, block: 拦截
     * @return notSupportedLanguageAction
     */
    public NotSupportedLanguageActionEnum getNotSupportedLanguageAction() {
        return notSupportedLanguageAction;
    }

    public void setNotSupportedLanguageAction(NotSupportedLanguageActionEnum notSupportedLanguageAction) {
        this.notSupportedLanguageAction = notSupportedLanguageAction;
    }

    public UpdateAiGuardRuleRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 规则描述，最大长度1024
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateAiGuardRuleRequestBody withCustomAnswersId(String customAnswersId) {
        this.customAnswersId = customAnswersId;
        return this;
    }

    /**
     * 自定义代答库ID（可选，当action.category=block时有效）
     * @return customAnswersId
     */
    public String getCustomAnswersId() {
        return customAnswersId;
    }

    public void setCustomAnswersId(String customAnswersId) {
        this.customAnswersId = customAnswersId;
    }

    public UpdateAiGuardRuleRequestBody withCustomAnswersName(String customAnswersName) {
        this.customAnswersName = customAnswersName;
        return this;
    }

    /**
     * 自定义代答库名称（可选，当action.category=block时有效，与custom_answers_id对应）
     * @return customAnswersName
     */
    public String getCustomAnswersName() {
        return customAnswersName;
    }

    public void setCustomAnswersName(String customAnswersName) {
        this.customAnswersName = customAnswersName;
    }

    public UpdateAiGuardRuleRequestBody withAbuseConfig(AbuseConfig abuseConfig) {
        this.abuseConfig = abuseConfig;
        return this;
    }

    public UpdateAiGuardRuleRequestBody withAbuseConfig(Consumer<AbuseConfig> abuseConfigSetter) {
        if (this.abuseConfig == null) {
            this.abuseConfig = new AbuseConfig();
            abuseConfigSetter.accept(this.abuseConfig);
        }

        return this;
    }

    /**
     * Get abuseConfig
     * @return abuseConfig
     */
    public AbuseConfig getAbuseConfig() {
        return abuseConfig;
    }

    public void setAbuseConfig(AbuseConfig abuseConfig) {
        this.abuseConfig = abuseConfig;
    }

    public UpdateAiGuardRuleRequestBody withTopicConfig(TopicConfig topicConfig) {
        this.topicConfig = topicConfig;
        return this;
    }

    public UpdateAiGuardRuleRequestBody withTopicConfig(Consumer<TopicConfig> topicConfigSetter) {
        if (this.topicConfig == null) {
            this.topicConfig = new TopicConfig();
            topicConfigSetter.accept(this.topicConfig);
        }

        return this;
    }

    /**
     * Get topicConfig
     * @return topicConfig
     */
    public TopicConfig getTopicConfig() {
        return topicConfig;
    }

    public void setTopicConfig(TopicConfig topicConfig) {
        this.topicConfig = topicConfig;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateAiGuardRuleRequestBody that = (UpdateAiGuardRuleRequestBody) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.status, that.status)
            && Objects.equals(this.detectOpts, that.detectOpts) && Objects.equals(this.action, that.action)
            && Objects.equals(this.detectLabels, that.detectLabels)
            && Objects.equals(this.notSupportedLanguageAction, that.notSupportedLanguageAction)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.customAnswersId, that.customAnswersId)
            && Objects.equals(this.customAnswersName, that.customAnswersName)
            && Objects.equals(this.abuseConfig, that.abuseConfig) && Objects.equals(this.topicConfig, that.topicConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            status,
            detectOpts,
            action,
            detectLabels,
            notSupportedLanguageAction,
            description,
            customAnswersId,
            customAnswersName,
            abuseConfig,
            topicConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateAiGuardRuleRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    detectOpts: ").append(toIndentedString(detectOpts)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    detectLabels: ").append(toIndentedString(detectLabels)).append("\n");
        sb.append("    notSupportedLanguageAction: ").append(toIndentedString(notSupportedLanguageAction)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    customAnswersId: ").append(toIndentedString(customAnswersId)).append("\n");
        sb.append("    customAnswersName: ").append(toIndentedString(customAnswersName)).append("\n");
        sb.append("    abuseConfig: ").append(toIndentedString(abuseConfig)).append("\n");
        sb.append("    topicConfig: ").append(toIndentedString(topicConfig)).append("\n");
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
