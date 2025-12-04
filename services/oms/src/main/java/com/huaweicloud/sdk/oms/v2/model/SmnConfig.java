package com.huaweicloud.sdk.oms.v2.model;

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
 * SMN消息通知配置。
 */
public class SmnConfig {

    /**
     * 当前用户所使用的管理控制台的语言。  可以选择zh-cn或者en-us。
     */
    public static final class LanguageEnum {

        /**
         * Enum ZH_CN for value: "zh-cn"
         */
        public static final LanguageEnum ZH_CN = new LanguageEnum("zh-cn");

        /**
         * Enum EN_US for value: "en-us"
         */
        public static final LanguageEnum EN_US = new LanguageEnum("en-us");

        private static final Map<String, LanguageEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, LanguageEnum> createStaticFields() {
            Map<String, LanguageEnum> map = new HashMap<>();
            map.put("zh-cn", ZH_CN);
            map.put("en-us", EN_US);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        LanguageEnum(String value) {
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
        public static LanguageEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new LanguageEnum(value));
        }

        public static LanguageEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof LanguageEnum) {
                return this.value.equals(((LanguageEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "language")

    private LanguageEnum language;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic_urn")

    private String topicUrn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trigger_conditions")

    private List<String> triggerConditions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message_template_name")

    private String messageTemplateName;

    public SmnConfig withLanguage(LanguageEnum language) {
        this.language = language;
        return this;
    }

    /**
     * 当前用户所使用的管理控制台的语言。  可以选择zh-cn或者en-us。
     * @return language
     */
    public LanguageEnum getLanguage() {
        return language;
    }

    public void setLanguage(LanguageEnum language) {
        this.language = language;
    }

    public SmnConfig withTopicUrn(String topicUrn) {
        this.topicUrn = topicUrn;
        return this;
    }

    /**
     * 迁移任务所绑定的SMN消息主题的urn号。
     * @return topicUrn
     */
    public String getTopicUrn() {
        return topicUrn;
    }

    public void setTopicUrn(String topicUrn) {
        this.topicUrn = topicUrn;
    }

    public SmnConfig withTriggerConditions(List<String> triggerConditions) {
        this.triggerConditions = triggerConditions;
        return this;
    }

    public SmnConfig addTriggerConditionsItem(String triggerConditionsItem) {
        if (this.triggerConditions == null) {
            this.triggerConditions = new ArrayList<>();
        }
        this.triggerConditions.add(triggerConditionsItem);
        return this;
    }

    public SmnConfig withTriggerConditions(Consumer<List<String>> triggerConditionsSetter) {
        if (this.triggerConditions == null) {
            this.triggerConditions = new ArrayList<>();
        }
        triggerConditionsSetter.accept(this.triggerConditions);
        return this;
    }

    /**
     *   SMN消息的触发条件，取决于迁移任务状态。  迁移任务状态的取值范围为SUCCESS或者FAILURE。  - FAILURE表示任务失败后发送SMN消息。 - SUCCESS表示任务成功后发送SMN消息。
     * @return triggerConditions
     */
    public List<String> getTriggerConditions() {
        return triggerConditions;
    }

    public void setTriggerConditions(List<String> triggerConditions) {
        this.triggerConditions = triggerConditions;
    }

    public SmnConfig withMessageTemplateName(String messageTemplateName) {
        this.messageTemplateName = messageTemplateName;
        return this;
    }

    /**
     * 如果设置此值，则表示用模板方式发送smn信息。 模板示例: {  “Task_Status”: \"\",     \"Task_Name\" : \"\",     \"Start_Time\": \"\",     \"Total_Time_Used\": \"\",     \"Transferred_Data\": \"\",     \"Average_Speed\": \"\",     \"Source_Bucket\": \"\",     \"Destination_Bucket\": \"\",     \"List_File_Bucket\": \"\",     \"List_File_Key\": \"\",     \"Success_object_list_path\": \"\",     \"Skip_object_list_path\": \"\",     \"Failed_object_list_path\": \"\" }
     * @return messageTemplateName
     */
    public String getMessageTemplateName() {
        return messageTemplateName;
    }

    public void setMessageTemplateName(String messageTemplateName) {
        this.messageTemplateName = messageTemplateName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SmnConfig that = (SmnConfig) obj;
        return Objects.equals(this.language, that.language) && Objects.equals(this.topicUrn, that.topicUrn)
            && Objects.equals(this.triggerConditions, that.triggerConditions)
            && Objects.equals(this.messageTemplateName, that.messageTemplateName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(language, topicUrn, triggerConditions, messageTemplateName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SmnConfig {\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
        sb.append("    topicUrn: ").append(toIndentedString(topicUrn)).append("\n");
        sb.append("    triggerConditions: ").append(toIndentedString(triggerConditions)).append("\n");
        sb.append("    messageTemplateName: ").append(toIndentedString(messageTemplateName)).append("\n");
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
