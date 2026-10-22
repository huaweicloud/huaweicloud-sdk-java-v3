package com.huaweicloud.sdk.waf.v1.model;

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
public class CreateAiGuardRuleResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * 检测类别。text: 文本检测, image: 图片检测，为null时代表文字
     */
    public static final class DetectTypeEnum {

        /**
         * Enum TEXT for value: "text"
         */
        public static final DetectTypeEnum TEXT = new DetectTypeEnum("text");

        /**
         * Enum IMAGE for value: "image"
         */
        public static final DetectTypeEnum IMAGE = new DetectTypeEnum("image");

        private static final Map<String, DetectTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DetectTypeEnum> createStaticFields() {
            Map<String, DetectTypeEnum> map = new HashMap<>();
            map.put("text", TEXT);
            map.put("image", IMAGE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DetectTypeEnum(String value) {
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
        public static DetectTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DetectTypeEnum(value));
        }

        public static DetectTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DetectTypeEnum) {
                return this.value.equals(((DetectTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detect_type")

    private DetectTypeEnum detectType;

    /**
     * 检测目标，detect_type=image时有效。ocr代表图片中提取的文本，content代表图片语义
     */
    public static final class DetectTargetEnum {

        /**
         * Enum OCR for value: "ocr"
         */
        public static final DetectTargetEnum OCR = new DetectTargetEnum("ocr");

        /**
         * Enum CONTENT for value: "content"
         */
        public static final DetectTargetEnum CONTENT = new DetectTargetEnum("content");

        private static final Map<String, DetectTargetEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DetectTargetEnum> createStaticFields() {
            Map<String, DetectTargetEnum> map = new HashMap<>();
            map.put("ocr", OCR);
            map.put("content", CONTENT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DetectTargetEnum(String value) {
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
        public static DetectTargetEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DetectTargetEnum(value));
        }

        public static DetectTargetEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DetectTargetEnum) {
                return this.value.equals(((DetectTargetEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detect_target")

    private DetectTargetEnum detectTarget;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_id")

    private String policyId;

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Long updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detect_labels_info")

    private DetectLabelsInfo detectLabelsInfo;

    /**
     * 不支持语言的检测防护动作。pass: 放行, block: 拦截
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

    /**
     * 规则来源，system代表系统，custom代表用户创建
     */
    public static final class SourceEnum {

        /**
         * Enum SYSTEM for value: "system"
         */
        public static final SourceEnum SYSTEM = new SourceEnum("system");

        /**
         * Enum CUSTOM for value: "custom"
         */
        public static final SourceEnum CUSTOM = new SourceEnum("custom");

        private static final Map<String, SourceEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SourceEnum> createStaticFields() {
            Map<String, SourceEnum> map = new HashMap<>();
            map.put("system", SYSTEM);
            map.put("custom", CUSTOM);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SourceEnum(String value) {
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
        public static SourceEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SourceEnum(value));
        }

        public static SourceEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SourceEnum) {
                return this.value.equals(((SourceEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source")

    private SourceEnum source;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_id")

    private String sourceId;

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

    public CreateAiGuardRuleResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 规则ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CreateAiGuardRuleResponse withName(String name) {
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

    public CreateAiGuardRuleResponse withDetectType(DetectTypeEnum detectType) {
        this.detectType = detectType;
        return this;
    }

    /**
     * 检测类别。text: 文本检测, image: 图片检测，为null时代表文字
     * @return detectType
     */
    public DetectTypeEnum getDetectType() {
        return detectType;
    }

    public void setDetectType(DetectTypeEnum detectType) {
        this.detectType = detectType;
    }

    public CreateAiGuardRuleResponse withDetectTarget(DetectTargetEnum detectTarget) {
        this.detectTarget = detectTarget;
        return this;
    }

    /**
     * 检测目标，detect_type=image时有效。ocr代表图片中提取的文本，content代表图片语义
     * @return detectTarget
     */
    public DetectTargetEnum getDetectTarget() {
        return detectTarget;
    }

    public void setDetectTarget(DetectTargetEnum detectTarget) {
        this.detectTarget = detectTarget;
    }

    public CreateAiGuardRuleResponse withPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    /**
     * 策略ID
     * @return policyId
     */
    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public CreateAiGuardRuleResponse withStatus(StatusEnum status) {
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

    public CreateAiGuardRuleResponse withDetectOpts(List<DetectOpt> detectOpts) {
        this.detectOpts = detectOpts;
        return this;
    }

    public CreateAiGuardRuleResponse addDetectOptsItem(DetectOpt detectOptsItem) {
        if (this.detectOpts == null) {
            this.detectOpts = new ArrayList<>();
        }
        this.detectOpts.add(detectOptsItem);
        return this;
    }

    public CreateAiGuardRuleResponse withDetectOpts(Consumer<List<DetectOpt>> detectOptsSetter) {
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

    public CreateAiGuardRuleResponse withAction(AiGuardRuleAction action) {
        this.action = action;
        return this;
    }

    public CreateAiGuardRuleResponse withAction(Consumer<AiGuardRuleAction> actionSetter) {
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

    public CreateAiGuardRuleResponse withDetectLabels(DetectLabels detectLabels) {
        this.detectLabels = detectLabels;
        return this;
    }

    public CreateAiGuardRuleResponse withDetectLabels(Consumer<DetectLabels> detectLabelsSetter) {
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

    public CreateAiGuardRuleResponse withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * minimum: 0
     * maximum: 9999999999999
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public CreateAiGuardRuleResponse withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间
     * minimum: 0
     * maximum: 9999999999999
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public CreateAiGuardRuleResponse withDetectLabelsInfo(DetectLabelsInfo detectLabelsInfo) {
        this.detectLabelsInfo = detectLabelsInfo;
        return this;
    }

    public CreateAiGuardRuleResponse withDetectLabelsInfo(Consumer<DetectLabelsInfo> detectLabelsInfoSetter) {
        if (this.detectLabelsInfo == null) {
            this.detectLabelsInfo = new DetectLabelsInfo();
            detectLabelsInfoSetter.accept(this.detectLabelsInfo);
        }

        return this;
    }

    /**
     * Get detectLabelsInfo
     * @return detectLabelsInfo
     */
    public DetectLabelsInfo getDetectLabelsInfo() {
        return detectLabelsInfo;
    }

    public void setDetectLabelsInfo(DetectLabelsInfo detectLabelsInfo) {
        this.detectLabelsInfo = detectLabelsInfo;
    }

    public CreateAiGuardRuleResponse withNotSupportedLanguageAction(
        NotSupportedLanguageActionEnum notSupportedLanguageAction) {
        this.notSupportedLanguageAction = notSupportedLanguageAction;
        return this;
    }

    /**
     * 不支持语言的检测防护动作。pass: 放行, block: 拦截
     * @return notSupportedLanguageAction
     */
    public NotSupportedLanguageActionEnum getNotSupportedLanguageAction() {
        return notSupportedLanguageAction;
    }

    public void setNotSupportedLanguageAction(NotSupportedLanguageActionEnum notSupportedLanguageAction) {
        this.notSupportedLanguageAction = notSupportedLanguageAction;
    }

    public CreateAiGuardRuleResponse withSource(SourceEnum source) {
        this.source = source;
        return this;
    }

    /**
     * 规则来源，system代表系统，custom代表用户创建
     * @return source
     */
    public SourceEnum getSource() {
        return source;
    }

    public void setSource(SourceEnum source) {
        this.source = source;
    }

    public CreateAiGuardRuleResponse withSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }

    /**
     * 当source=system时，source_id为默认模板规则的Id
     * @return sourceId
     */
    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public CreateAiGuardRuleResponse withDescription(String description) {
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

    public CreateAiGuardRuleResponse withCustomAnswersId(String customAnswersId) {
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

    public CreateAiGuardRuleResponse withCustomAnswersName(String customAnswersName) {
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

    public CreateAiGuardRuleResponse withAbuseConfig(AbuseConfig abuseConfig) {
        this.abuseConfig = abuseConfig;
        return this;
    }

    public CreateAiGuardRuleResponse withAbuseConfig(Consumer<AbuseConfig> abuseConfigSetter) {
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

    public CreateAiGuardRuleResponse withTopicConfig(TopicConfig topicConfig) {
        this.topicConfig = topicConfig;
        return this;
    }

    public CreateAiGuardRuleResponse withTopicConfig(Consumer<TopicConfig> topicConfigSetter) {
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
        CreateAiGuardRuleResponse that = (CreateAiGuardRuleResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.detectType, that.detectType) && Objects.equals(this.detectTarget, that.detectTarget)
            && Objects.equals(this.policyId, that.policyId) && Objects.equals(this.status, that.status)
            && Objects.equals(this.detectOpts, that.detectOpts) && Objects.equals(this.action, that.action)
            && Objects.equals(this.detectLabels, that.detectLabels) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.detectLabelsInfo, that.detectLabelsInfo)
            && Objects.equals(this.notSupportedLanguageAction, that.notSupportedLanguageAction)
            && Objects.equals(this.source, that.source) && Objects.equals(this.sourceId, that.sourceId)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.customAnswersId, that.customAnswersId)
            && Objects.equals(this.customAnswersName, that.customAnswersName)
            && Objects.equals(this.abuseConfig, that.abuseConfig) && Objects.equals(this.topicConfig, that.topicConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            detectType,
            detectTarget,
            policyId,
            status,
            detectOpts,
            action,
            detectLabels,
            createTime,
            updateTime,
            detectLabelsInfo,
            notSupportedLanguageAction,
            source,
            sourceId,
            description,
            customAnswersId,
            customAnswersName,
            abuseConfig,
            topicConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAiGuardRuleResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    detectType: ").append(toIndentedString(detectType)).append("\n");
        sb.append("    detectTarget: ").append(toIndentedString(detectTarget)).append("\n");
        sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    detectOpts: ").append(toIndentedString(detectOpts)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    detectLabels: ").append(toIndentedString(detectLabels)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    detectLabelsInfo: ").append(toIndentedString(detectLabelsInfo)).append("\n");
        sb.append("    notSupportedLanguageAction: ").append(toIndentedString(notSupportedLanguageAction)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
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
