package com.huaweicloud.sdk.lts.v2.model;

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

/** KeywordsAlarmRuleRespList */
public class KeywordsAlarmRuleRespList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "projectId")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keywords_alarm_rule_id")

    private String keywordsAlarmRuleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keywords_alarm_rule_name")

    private String keywordsAlarmRuleName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keywords_alarm_rule_description")

    private String keywordsAlarmRuleDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "condition_expression")

    private String conditionExpression;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keywords_requests")

    private List<KeywordsRequest> keywordsRequests = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "frequency")

    private Frequency frequency;

    /** 告警级别 */
    public static final class KeywordsAlarmLevelEnum {

        /** Enum INFO for value: "Info" */
        public static final KeywordsAlarmLevelEnum INFO = new KeywordsAlarmLevelEnum("Info");

        /** Enum MINOR for value: "Minor" */
        public static final KeywordsAlarmLevelEnum MINOR = new KeywordsAlarmLevelEnum("Minor");

        /** Enum MAJOR for value: "Major" */
        public static final KeywordsAlarmLevelEnum MAJOR = new KeywordsAlarmLevelEnum("Major");

        /** Enum CRITICAL for value: "Critical" */
        public static final KeywordsAlarmLevelEnum CRITICAL = new KeywordsAlarmLevelEnum("Critical");

        private static final Map<String, KeywordsAlarmLevelEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, KeywordsAlarmLevelEnum> createStaticFields() {
            Map<String, KeywordsAlarmLevelEnum> map = new HashMap<>();
            map.put("Info", INFO);
            map.put("Minor", MINOR);
            map.put("Major", MAJOR);
            map.put("Critical", CRITICAL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        KeywordsAlarmLevelEnum(String value) {
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
        public static KeywordsAlarmLevelEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            KeywordsAlarmLevelEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new KeywordsAlarmLevelEnum(value);
            }
            return result;
        }

        public static KeywordsAlarmLevelEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            KeywordsAlarmLevelEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof KeywordsAlarmLevelEnum) {
                return this.value.equals(((KeywordsAlarmLevelEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keywords_alarm_level")

    private KeywordsAlarmLevelEnum keywordsAlarmLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keywords_alarm_send")

    private Boolean keywordsAlarmSend;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Long updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topics")

    private List<Topics> topics = null;

    /** 邮件附加信息是否英文 */
    public static final class LanguageEnum {

        /** Enum ZH_CN for value: "zh-cn" */
        public static final LanguageEnum ZH_CN = new LanguageEnum("zh-cn");

        /** Enum EN_US for value: "en-us" */
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
            LanguageEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new LanguageEnum(value);
            }
            return result;
        }

        public static LanguageEnum valueOf(String value) {
            if (value == null) {
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

    public KeywordsAlarmRuleRespList withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /** 项目id
     * 
     * @return projectId */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public KeywordsAlarmRuleRespList withKeywordsAlarmRuleId(String keywordsAlarmRuleId) {
        this.keywordsAlarmRuleId = keywordsAlarmRuleId;
        return this;
    }

    /** 关键词告警id
     * 
     * @return keywordsAlarmRuleId */
    public String getKeywordsAlarmRuleId() {
        return keywordsAlarmRuleId;
    }

    public void setKeywordsAlarmRuleId(String keywordsAlarmRuleId) {
        this.keywordsAlarmRuleId = keywordsAlarmRuleId;
    }

    public KeywordsAlarmRuleRespList withKeywordsAlarmRuleName(String keywordsAlarmRuleName) {
        this.keywordsAlarmRuleName = keywordsAlarmRuleName;
        return this;
    }

    /** 关键词告警名称
     * 
     * @return keywordsAlarmRuleName */
    public String getKeywordsAlarmRuleName() {
        return keywordsAlarmRuleName;
    }

    public void setKeywordsAlarmRuleName(String keywordsAlarmRuleName) {
        this.keywordsAlarmRuleName = keywordsAlarmRuleName;
    }

    public KeywordsAlarmRuleRespList withKeywordsAlarmRuleDescription(String keywordsAlarmRuleDescription) {
        this.keywordsAlarmRuleDescription = keywordsAlarmRuleDescription;
        return this;
    }

    /** 关键词告警信息描述
     * 
     * @return keywordsAlarmRuleDescription */
    public String getKeywordsAlarmRuleDescription() {
        return keywordsAlarmRuleDescription;
    }

    public void setKeywordsAlarmRuleDescription(String keywordsAlarmRuleDescription) {
        this.keywordsAlarmRuleDescription = keywordsAlarmRuleDescription;
    }

    public KeywordsAlarmRuleRespList withConditionExpression(String conditionExpression) {
        this.conditionExpression = conditionExpression;
        return this;
    }

    /** 条件
     * 
     * @return conditionExpression */
    public String getConditionExpression() {
        return conditionExpression;
    }

    public void setConditionExpression(String conditionExpression) {
        this.conditionExpression = conditionExpression;
    }

    public KeywordsAlarmRuleRespList withKeywordsRequests(List<KeywordsRequest> keywordsRequests) {
        this.keywordsRequests = keywordsRequests;
        return this;
    }

    public KeywordsAlarmRuleRespList addKeywordsRequestsItem(KeywordsRequest keywordsRequestsItem) {
        if (this.keywordsRequests == null) {
            this.keywordsRequests = new ArrayList<>();
        }
        this.keywordsRequests.add(keywordsRequestsItem);
        return this;
    }

    public KeywordsAlarmRuleRespList withKeywordsRequests(Consumer<List<KeywordsRequest>> keywordsRequestsSetter) {
        if (this.keywordsRequests == null) {
            this.keywordsRequests = new ArrayList<>();
        }
        keywordsRequestsSetter.accept(this.keywordsRequests);
        return this;
    }

    /** 关键词详细信息
     * 
     * @return keywordsRequests */
    public List<KeywordsRequest> getKeywordsRequests() {
        return keywordsRequests;
    }

    public void setKeywordsRequests(List<KeywordsRequest> keywordsRequests) {
        this.keywordsRequests = keywordsRequests;
    }

    public KeywordsAlarmRuleRespList withFrequency(Frequency frequency) {
        this.frequency = frequency;
        return this;
    }

    public KeywordsAlarmRuleRespList withFrequency(Consumer<Frequency> frequencySetter) {
        if (this.frequency == null) {
            this.frequency = new Frequency();
            frequencySetter.accept(this.frequency);
        }

        return this;
    }

    /** 告警统计周期
     * 
     * @return frequency */
    public Frequency getFrequency() {
        return frequency;
    }

    public void setFrequency(Frequency frequency) {
        this.frequency = frequency;
    }

    public KeywordsAlarmRuleRespList withKeywordsAlarmLevel(KeywordsAlarmLevelEnum keywordsAlarmLevel) {
        this.keywordsAlarmLevel = keywordsAlarmLevel;
        return this;
    }

    /** 告警级别
     * 
     * @return keywordsAlarmLevel */
    public KeywordsAlarmLevelEnum getKeywordsAlarmLevel() {
        return keywordsAlarmLevel;
    }

    public void setKeywordsAlarmLevel(KeywordsAlarmLevelEnum keywordsAlarmLevel) {
        this.keywordsAlarmLevel = keywordsAlarmLevel;
    }

    public KeywordsAlarmRuleRespList withKeywordsAlarmSend(Boolean keywordsAlarmSend) {
        this.keywordsAlarmSend = keywordsAlarmSend;
        return this;
    }

    /** 是否发送
     * 
     * @return keywordsAlarmSend */
    public Boolean getKeywordsAlarmSend() {
        return keywordsAlarmSend;
    }

    public void setKeywordsAlarmSend(Boolean keywordsAlarmSend) {
        this.keywordsAlarmSend = keywordsAlarmSend;
    }

    public KeywordsAlarmRuleRespList withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /** domainId
     * 
     * @return domainId */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public KeywordsAlarmRuleRespList withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /** 创建时间(毫秒时间戳)
     * 
     * @return createTime */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public KeywordsAlarmRuleRespList withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /** 更新时间(毫秒时间戳)
     * 
     * @return updateTime */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public KeywordsAlarmRuleRespList withTopics(List<Topics> topics) {
        this.topics = topics;
        return this;
    }

    public KeywordsAlarmRuleRespList addTopicsItem(Topics topicsItem) {
        if (this.topics == null) {
            this.topics = new ArrayList<>();
        }
        this.topics.add(topicsItem);
        return this;
    }

    public KeywordsAlarmRuleRespList withTopics(Consumer<List<Topics>> topicsSetter) {
        if (this.topics == null) {
            this.topics = new ArrayList<>();
        }
        topicsSetter.accept(this.topics);
        return this;
    }

    /** 主题
     * 
     * @return topics */
    public List<Topics> getTopics() {
        return topics;
    }

    public void setTopics(List<Topics> topics) {
        this.topics = topics;
    }

    public KeywordsAlarmRuleRespList withLanguage(LanguageEnum language) {
        this.language = language;
        return this;
    }

    /** 邮件附加信息是否英文
     * 
     * @return language */
    public LanguageEnum getLanguage() {
        return language;
    }

    public void setLanguage(LanguageEnum language) {
        this.language = language;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        KeywordsAlarmRuleRespList keywordsAlarmRuleRespList = (KeywordsAlarmRuleRespList) o;
        return Objects.equals(this.projectId, keywordsAlarmRuleRespList.projectId)
            && Objects.equals(this.keywordsAlarmRuleId, keywordsAlarmRuleRespList.keywordsAlarmRuleId)
            && Objects.equals(this.keywordsAlarmRuleName, keywordsAlarmRuleRespList.keywordsAlarmRuleName)
            && Objects.equals(this.keywordsAlarmRuleDescription, keywordsAlarmRuleRespList.keywordsAlarmRuleDescription)
            && Objects.equals(this.conditionExpression, keywordsAlarmRuleRespList.conditionExpression)
            && Objects.equals(this.keywordsRequests, keywordsAlarmRuleRespList.keywordsRequests)
            && Objects.equals(this.frequency, keywordsAlarmRuleRespList.frequency)
            && Objects.equals(this.keywordsAlarmLevel, keywordsAlarmRuleRespList.keywordsAlarmLevel)
            && Objects.equals(this.keywordsAlarmSend, keywordsAlarmRuleRespList.keywordsAlarmSend)
            && Objects.equals(this.domainId, keywordsAlarmRuleRespList.domainId)
            && Objects.equals(this.createTime, keywordsAlarmRuleRespList.createTime)
            && Objects.equals(this.updateTime, keywordsAlarmRuleRespList.updateTime)
            && Objects.equals(this.topics, keywordsAlarmRuleRespList.topics)
            && Objects.equals(this.language, keywordsAlarmRuleRespList.language);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId,
            keywordsAlarmRuleId,
            keywordsAlarmRuleName,
            keywordsAlarmRuleDescription,
            conditionExpression,
            keywordsRequests,
            frequency,
            keywordsAlarmLevel,
            keywordsAlarmSend,
            domainId,
            createTime,
            updateTime,
            topics,
            language);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeywordsAlarmRuleRespList {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    keywordsAlarmRuleId: ").append(toIndentedString(keywordsAlarmRuleId)).append("\n");
        sb.append("    keywordsAlarmRuleName: ").append(toIndentedString(keywordsAlarmRuleName)).append("\n");
        sb.append("    keywordsAlarmRuleDescription: ")
            .append(toIndentedString(keywordsAlarmRuleDescription))
            .append("\n");
        sb.append("    conditionExpression: ").append(toIndentedString(conditionExpression)).append("\n");
        sb.append("    keywordsRequests: ").append(toIndentedString(keywordsRequests)).append("\n");
        sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
        sb.append("    keywordsAlarmLevel: ").append(toIndentedString(keywordsAlarmLevel)).append("\n");
        sb.append("    keywordsAlarmSend: ").append(toIndentedString(keywordsAlarmSend)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    topics: ").append(toIndentedString(topics)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
