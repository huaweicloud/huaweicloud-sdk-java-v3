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
 * 创建模板规则请求
 */
public class CreateAiguardTemplateRuleRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_id")

    private String templateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private AiGuardRuleAction action;

    /**
     * 规则状态，非必选：enable(启用), disable(禁用)
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
    @JsonProperty(value = "supported_language_labels")

    private List<String> supportedLanguageLabels = null;

    /**
     * 其他语言检测动作，只有使用语言模板添加时生效。pass: 放行, block: 拦截
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
    @JsonProperty(value = "custom_answers_id")

    private String customAnswersId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_answers_name")

    private String customAnswersName;

    public CreateAiguardTemplateRuleRequestBody withTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }

    /**
     * 模板ID（8位字符串）
     * @return templateId
     */
    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public CreateAiguardTemplateRuleRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 规则名称，非必选，通过模板生成
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateAiguardTemplateRuleRequestBody withAction(AiGuardRuleAction action) {
        this.action = action;
        return this;
    }

    public CreateAiguardTemplateRuleRequestBody withAction(Consumer<AiGuardRuleAction> actionSetter) {
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

    public CreateAiguardTemplateRuleRequestBody withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 规则状态，非必选：enable(启用), disable(禁用)
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public CreateAiguardTemplateRuleRequestBody withSupportedLanguageLabels(List<String> supportedLanguageLabels) {
        this.supportedLanguageLabels = supportedLanguageLabels;
        return this;
    }

    public CreateAiguardTemplateRuleRequestBody addSupportedLanguageLabelsItem(String supportedLanguageLabelsItem) {
        if (this.supportedLanguageLabels == null) {
            this.supportedLanguageLabels = new ArrayList<>();
        }
        this.supportedLanguageLabels.add(supportedLanguageLabelsItem);
        return this;
    }

    public CreateAiguardTemplateRuleRequestBody withSupportedLanguageLabels(
        Consumer<List<String>> supportedLanguageLabelsSetter) {
        if (this.supportedLanguageLabels == null) {
            this.supportedLanguageLabels = new ArrayList<>();
        }
        supportedLanguageLabelsSetter.accept(this.supportedLanguageLabels);
        return this;
    }

    /**
     * 语言检测标签列表，只有使用语言模板添加时生效
     * @return supportedLanguageLabels
     */
    public List<String> getSupportedLanguageLabels() {
        return supportedLanguageLabels;
    }

    public void setSupportedLanguageLabels(List<String> supportedLanguageLabels) {
        this.supportedLanguageLabels = supportedLanguageLabels;
    }

    public CreateAiguardTemplateRuleRequestBody withNotSupportedLanguageAction(
        NotSupportedLanguageActionEnum notSupportedLanguageAction) {
        this.notSupportedLanguageAction = notSupportedLanguageAction;
        return this;
    }

    /**
     * 其他语言检测动作，只有使用语言模板添加时生效。pass: 放行, block: 拦截
     * @return notSupportedLanguageAction
     */
    public NotSupportedLanguageActionEnum getNotSupportedLanguageAction() {
        return notSupportedLanguageAction;
    }

    public void setNotSupportedLanguageAction(NotSupportedLanguageActionEnum notSupportedLanguageAction) {
        this.notSupportedLanguageAction = notSupportedLanguageAction;
    }

    public CreateAiguardTemplateRuleRequestBody withCustomAnswersId(String customAnswersId) {
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

    public CreateAiguardTemplateRuleRequestBody withCustomAnswersName(String customAnswersName) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateAiguardTemplateRuleRequestBody that = (CreateAiguardTemplateRuleRequestBody) obj;
        return Objects.equals(this.templateId, that.templateId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.action, that.action) && Objects.equals(this.status, that.status)
            && Objects.equals(this.supportedLanguageLabels, that.supportedLanguageLabels)
            && Objects.equals(this.notSupportedLanguageAction, that.notSupportedLanguageAction)
            && Objects.equals(this.customAnswersId, that.customAnswersId)
            && Objects.equals(this.customAnswersName, that.customAnswersName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(templateId,
            name,
            action,
            status,
            supportedLanguageLabels,
            notSupportedLanguageAction,
            customAnswersId,
            customAnswersName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAiguardTemplateRuleRequestBody {\n");
        sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    supportedLanguageLabels: ").append(toIndentedString(supportedLanguageLabels)).append("\n");
        sb.append("    notSupportedLanguageAction: ").append(toIndentedString(notSupportedLanguageAction)).append("\n");
        sb.append("    customAnswersId: ").append(toIndentedString(customAnswersId)).append("\n");
        sb.append("    customAnswersName: ").append(toIndentedString(customAnswersName)).append("\n");
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
