package com.huaweicloud.sdk.oms.v2.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * SMN消息通知配置。
 */
public class SmnConfig  {

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
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static LanguageEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            LanguageEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new LanguageEnum(value);
            }
            return result;
        }

        public static LanguageEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            LanguageEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof LanguageEnum) {
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
    @JsonProperty(value="language")
    
    private LanguageEnum language = LanguageEnum.EN_US;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="topic_urn")
    
    private String topicUrn;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="trigger_conditions")
    
    private List<String> triggerConditions = new ArrayList<>();
    
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
        this.triggerConditions.add(triggerConditionsItem);
        return this;
    }

    public SmnConfig withTriggerConditions(Consumer<List<String>> triggerConditionsSetter) {
        if(this.triggerConditions == null ){
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
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SmnConfig smnConfig = (SmnConfig) o;
        return Objects.equals(this.language, smnConfig.language) &&
            Objects.equals(this.topicUrn, smnConfig.topicUrn) &&
            Objects.equals(this.triggerConditions, smnConfig.triggerConditions);
    }
    @Override
    public int hashCode() {
        return Objects.hash(language, topicUrn, triggerConditions);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SmnConfig {\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
        sb.append("    topicUrn: ").append(toIndentedString(topicUrn)).append("\n");
        sb.append("    triggerConditions: ").append(toIndentedString(triggerConditions)).append("\n");
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

