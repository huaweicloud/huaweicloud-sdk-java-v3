package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
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
public class UpdateKeywordsAlarmRuleResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keywords_alarm_rule_id")

    @JacksonXmlProperty(localName = "keywords_alarm_rule_id")

    private String keywordsAlarmRuleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keywords_alarm_rule_name")

    @JacksonXmlProperty(localName = "keywords_alarm_rule_name")

    private String keywordsAlarmRuleName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keywords_alarm_rule_description")

    @JacksonXmlProperty(localName = "keywords_alarm_rule_description")

    private String keywordsAlarmRuleDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keywords_requests")

    @JacksonXmlProperty(localName = "keywords_requests")

    private List<KeywordsRequest> keywordsRequests = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "frequency")

    @JacksonXmlProperty(localName = "frequency")

    private Frequency frequency;

    /**
     * 告警级别
     */
    public static final class KeywordsAlarmLevelEnum {

        /**
         * Enum INFO for value: "Info"
         */
        public static final KeywordsAlarmLevelEnum INFO = new KeywordsAlarmLevelEnum("Info");

        /**
         * Enum MINOR for value: "Minor"
         */
        public static final KeywordsAlarmLevelEnum MINOR = new KeywordsAlarmLevelEnum("Minor");

        /**
         * Enum MAJOR for value: "Major"
         */
        public static final KeywordsAlarmLevelEnum MAJOR = new KeywordsAlarmLevelEnum("Major");

        /**
         * Enum CRITICAL for value: "Critical"
         */
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

    @JacksonXmlProperty(localName = "keywords_alarm_level")

    private KeywordsAlarmLevelEnum keywordsAlarmLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keywords_alarm_send")

    @JacksonXmlProperty(localName = "keywords_alarm_send")

    private Boolean keywordsAlarmSend;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    @JacksonXmlProperty(localName = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    @JacksonXmlProperty(localName = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    @JacksonXmlProperty(localName = "update_time")

    private Long updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "language")

    @JacksonXmlProperty(localName = "language")

    private String language;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "projectId")

    @JacksonXmlProperty(localName = "projectId")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topics")

    @JacksonXmlProperty(localName = "topics")

    private List<Topics> topics = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "condition_expression")

    @JacksonXmlProperty(localName = "condition_expression")

    private String conditionExpression;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "indexId")

    @JacksonXmlProperty(localName = "indexId")

    private String indexId;

    public UpdateKeywordsAlarmRuleResponse withKeywordsAlarmRuleId(String keywordsAlarmRuleId) {
        this.keywordsAlarmRuleId = keywordsAlarmRuleId;
        return this;
    }

    /**
     * 关键词告警id
     * @return keywordsAlarmRuleId
     */
    public String getKeywordsAlarmRuleId() {
        return keywordsAlarmRuleId;
    }

    public void setKeywordsAlarmRuleId(String keywordsAlarmRuleId) {
        this.keywordsAlarmRuleId = keywordsAlarmRuleId;
    }

    public UpdateKeywordsAlarmRuleResponse withKeywordsAlarmRuleName(String keywordsAlarmRuleName) {
        this.keywordsAlarmRuleName = keywordsAlarmRuleName;
        return this;
    }

    /**
     * 关键词告警名称
     * @return keywordsAlarmRuleName
     */
    public String getKeywordsAlarmRuleName() {
        return keywordsAlarmRuleName;
    }

    public void setKeywordsAlarmRuleName(String keywordsAlarmRuleName) {
        this.keywordsAlarmRuleName = keywordsAlarmRuleName;
    }

    public UpdateKeywordsAlarmRuleResponse withKeywordsAlarmRuleDescription(String keywordsAlarmRuleDescription) {
        this.keywordsAlarmRuleDescription = keywordsAlarmRuleDescription;
        return this;
    }

    /**
     * 关键词告警信息描述
     * @return keywordsAlarmRuleDescription
     */
    public String getKeywordsAlarmRuleDescription() {
        return keywordsAlarmRuleDescription;
    }

    public void setKeywordsAlarmRuleDescription(String keywordsAlarmRuleDescription) {
        this.keywordsAlarmRuleDescription = keywordsAlarmRuleDescription;
    }

    public UpdateKeywordsAlarmRuleResponse withKeywordsRequests(List<KeywordsRequest> keywordsRequests) {
        this.keywordsRequests = keywordsRequests;
        return this;
    }

    public UpdateKeywordsAlarmRuleResponse addKeywordsRequestsItem(KeywordsRequest keywordsRequestsItem) {
        if (this.keywordsRequests == null) {
            this.keywordsRequests = new ArrayList<>();
        }
        this.keywordsRequests.add(keywordsRequestsItem);
        return this;
    }

    public UpdateKeywordsAlarmRuleResponse withKeywordsRequests(
        Consumer<List<KeywordsRequest>> keywordsRequestsSetter) {
        if (this.keywordsRequests == null) {
            this.keywordsRequests = new ArrayList<>();
        }
        keywordsRequestsSetter.accept(this.keywordsRequests);
        return this;
    }

    /**
     * 关键词详细信息
     * @return keywordsRequests
     */
    public List<KeywordsRequest> getKeywordsRequests() {
        return keywordsRequests;
    }

    public void setKeywordsRequests(List<KeywordsRequest> keywordsRequests) {
        this.keywordsRequests = keywordsRequests;
    }

    public UpdateKeywordsAlarmRuleResponse withFrequency(Frequency frequency) {
        this.frequency = frequency;
        return this;
    }

    public UpdateKeywordsAlarmRuleResponse withFrequency(Consumer<Frequency> frequencySetter) {
        if (this.frequency == null) {
            this.frequency = new Frequency();
            frequencySetter.accept(this.frequency);
        }

        return this;
    }

    /**
     * Get frequency
     * @return frequency
     */
    public Frequency getFrequency() {
        return frequency;
    }

    public void setFrequency(Frequency frequency) {
        this.frequency = frequency;
    }

    public UpdateKeywordsAlarmRuleResponse withKeywordsAlarmLevel(KeywordsAlarmLevelEnum keywordsAlarmLevel) {
        this.keywordsAlarmLevel = keywordsAlarmLevel;
        return this;
    }

    /**
     * 告警级别
     * @return keywordsAlarmLevel
     */
    public KeywordsAlarmLevelEnum getKeywordsAlarmLevel() {
        return keywordsAlarmLevel;
    }

    public void setKeywordsAlarmLevel(KeywordsAlarmLevelEnum keywordsAlarmLevel) {
        this.keywordsAlarmLevel = keywordsAlarmLevel;
    }

    public UpdateKeywordsAlarmRuleResponse withKeywordsAlarmSend(Boolean keywordsAlarmSend) {
        this.keywordsAlarmSend = keywordsAlarmSend;
        return this;
    }

    /**
     * 是否发送
     * @return keywordsAlarmSend
     */
    public Boolean getKeywordsAlarmSend() {
        return keywordsAlarmSend;
    }

    public void setKeywordsAlarmSend(Boolean keywordsAlarmSend) {
        this.keywordsAlarmSend = keywordsAlarmSend;
    }

    public UpdateKeywordsAlarmRuleResponse withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * domainId
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public UpdateKeywordsAlarmRuleResponse withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间(毫秒时间戳)
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public UpdateKeywordsAlarmRuleResponse withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间(毫秒时间戳)
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public UpdateKeywordsAlarmRuleResponse withLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * 语言
     * @return language
     */
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public UpdateKeywordsAlarmRuleResponse withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目id
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public UpdateKeywordsAlarmRuleResponse withTopics(List<Topics> topics) {
        this.topics = topics;
        return this;
    }

    public UpdateKeywordsAlarmRuleResponse addTopicsItem(Topics topicsItem) {
        if (this.topics == null) {
            this.topics = new ArrayList<>();
        }
        this.topics.add(topicsItem);
        return this;
    }

    public UpdateKeywordsAlarmRuleResponse withTopics(Consumer<List<Topics>> topicsSetter) {
        if (this.topics == null) {
            this.topics = new ArrayList<>();
        }
        topicsSetter.accept(this.topics);
        return this;
    }

    /**
     * 主题信息
     * @return topics
     */
    public List<Topics> getTopics() {
        return topics;
    }

    public void setTopics(List<Topics> topics) {
        this.topics = topics;
    }

    public UpdateKeywordsAlarmRuleResponse withConditionExpression(String conditionExpression) {
        this.conditionExpression = conditionExpression;
        return this;
    }

    /**
     * 暂无
     * @return conditionExpression
     */
    public String getConditionExpression() {
        return conditionExpression;
    }

    public void setConditionExpression(String conditionExpression) {
        this.conditionExpression = conditionExpression;
    }

    public UpdateKeywordsAlarmRuleResponse withIndexId(String indexId) {
        this.indexId = indexId;
        return this;
    }

    /**
     * 暂无
     * @return indexId
     */
    public String getIndexId() {
        return indexId;
    }

    public void setIndexId(String indexId) {
        this.indexId = indexId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateKeywordsAlarmRuleResponse updateKeywordsAlarmRuleResponse = (UpdateKeywordsAlarmRuleResponse) o;
        return Objects.equals(this.keywordsAlarmRuleId, updateKeywordsAlarmRuleResponse.keywordsAlarmRuleId)
            && Objects.equals(this.keywordsAlarmRuleName, updateKeywordsAlarmRuleResponse.keywordsAlarmRuleName)
            && Objects.equals(this.keywordsAlarmRuleDescription,
                updateKeywordsAlarmRuleResponse.keywordsAlarmRuleDescription)
            && Objects.equals(this.keywordsRequests, updateKeywordsAlarmRuleResponse.keywordsRequests)
            && Objects.equals(this.frequency, updateKeywordsAlarmRuleResponse.frequency)
            && Objects.equals(this.keywordsAlarmLevel, updateKeywordsAlarmRuleResponse.keywordsAlarmLevel)
            && Objects.equals(this.keywordsAlarmSend, updateKeywordsAlarmRuleResponse.keywordsAlarmSend)
            && Objects.equals(this.domainId, updateKeywordsAlarmRuleResponse.domainId)
            && Objects.equals(this.createTime, updateKeywordsAlarmRuleResponse.createTime)
            && Objects.equals(this.updateTime, updateKeywordsAlarmRuleResponse.updateTime)
            && Objects.equals(this.language, updateKeywordsAlarmRuleResponse.language)
            && Objects.equals(this.projectId, updateKeywordsAlarmRuleResponse.projectId)
            && Objects.equals(this.topics, updateKeywordsAlarmRuleResponse.topics)
            && Objects.equals(this.conditionExpression, updateKeywordsAlarmRuleResponse.conditionExpression)
            && Objects.equals(this.indexId, updateKeywordsAlarmRuleResponse.indexId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keywordsAlarmRuleId,
            keywordsAlarmRuleName,
            keywordsAlarmRuleDescription,
            keywordsRequests,
            frequency,
            keywordsAlarmLevel,
            keywordsAlarmSend,
            domainId,
            createTime,
            updateTime,
            language,
            projectId,
            topics,
            conditionExpression,
            indexId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateKeywordsAlarmRuleResponse {\n");
        sb.append("    keywordsAlarmRuleId: ").append(toIndentedString(keywordsAlarmRuleId)).append("\n");
        sb.append("    keywordsAlarmRuleName: ").append(toIndentedString(keywordsAlarmRuleName)).append("\n");
        sb.append("    keywordsAlarmRuleDescription: ")
            .append(toIndentedString(keywordsAlarmRuleDescription))
            .append("\n");
        sb.append("    keywordsRequests: ").append(toIndentedString(keywordsRequests)).append("\n");
        sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
        sb.append("    keywordsAlarmLevel: ").append(toIndentedString(keywordsAlarmLevel)).append("\n");
        sb.append("    keywordsAlarmSend: ").append(toIndentedString(keywordsAlarmSend)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    topics: ").append(toIndentedString(topics)).append("\n");
        sb.append("    conditionExpression: ").append(toIndentedString(conditionExpression)).append("\n");
        sb.append("    indexId: ").append(toIndentedString(indexId)).append("\n");
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
