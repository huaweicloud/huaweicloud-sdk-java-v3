package com.huaweicloud.sdk.aom.v2.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.aom.v2.model.SmnTopics;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 告警行动规则
 */
@JacksonXmlRootElement(localName = "ActionRule")
public class ActionRule  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="rule_name")
    
    @JacksonXmlProperty(localName = "rule_name")

    private String ruleName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="project_id")
    
    @JacksonXmlProperty(localName = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="user_name")
    
    @JacksonXmlProperty(localName = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="desc")
    
    @JacksonXmlProperty(localName = "desc")

    private String desc;
    /**
     * 规则类型。\"1\"：通知，\"2\"：用户
     */
    public static final class TypeEnum {

        
        /**
         * Enum _1_ for value: "\"1\""
         */
        public static final TypeEnum _1_ = new TypeEnum("\"1\"");
        
        /**
         * Enum _2_ for value: "\"2\""
         */
        public static final TypeEnum _2_ = new TypeEnum("\"2\"");
        

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("\"1\"", _1_);
            map.put("\"2\"", _2_);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TypeEnum(value);
            }
            return result;
        }

        public static TypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    @JacksonXmlProperty(localName = "type")

    private TypeEnum type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="notification_template")
    
    @JacksonXmlProperty(localName = "notification_template")

    private String notificationTemplate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="create_time")
    
    @JacksonXmlProperty(localName = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="update_time")
    
    @JacksonXmlProperty(localName = "update_time")

    private Long updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="time_zone")
    
    @JacksonXmlProperty(localName = "time_zone")

    private String timeZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="smn_topics")
    
    @JacksonXmlProperty(localName = "smn_topics")
    private List<SmnTopics> smnTopics = null;
    
    public ActionRule withRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }

    


    /**
     * 规则名称
     * @return ruleName
     */
    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    

    public ActionRule withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    


    /**
     * 项目ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    

    public ActionRule withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    


    /**
     * 子账号名称
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    

    public ActionRule withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    


    /**
     * 规则描述
     * @return desc
     */
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    

    public ActionRule withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    


    /**
     * 规则类型。\"1\"：通知，\"2\"：用户
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    

    public ActionRule withNotificationTemplate(String notificationTemplate) {
        this.notificationTemplate = notificationTemplate;
        return this;
    }

    


    /**
     * 消息模板
     * @return notificationTemplate
     */
    public String getNotificationTemplate() {
        return notificationTemplate;
    }

    public void setNotificationTemplate(String notificationTemplate) {
        this.notificationTemplate = notificationTemplate;
    }

    

    public ActionRule withCreateTime(Long createTime) {
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

    

    public ActionRule withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    


    /**
     * 修改时间
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

    

    public ActionRule withTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }

    


    /**
     * 时区
     * @return timeZone
     */
    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    

    public ActionRule withSmnTopics(List<SmnTopics> smnTopics) {
        this.smnTopics = smnTopics;
        return this;
    }

    
    public ActionRule addSmnTopicsItem(SmnTopics smnTopicsItem) {
        if(this.smnTopics == null) {
            this.smnTopics = new ArrayList<>();
        }
        this.smnTopics.add(smnTopicsItem);
        return this;
    }

    public ActionRule withSmnTopics(Consumer<List<SmnTopics>> smnTopicsSetter) {
        if(this.smnTopics == null) {
            this.smnTopics = new ArrayList<>();
        }
        smnTopicsSetter.accept(this.smnTopics);
        return this;
    }

    /**
     * SMN主题信息，不能大于5
     * @return smnTopics
     */
    public List<SmnTopics> getSmnTopics() {
        return smnTopics;
    }

    public void setSmnTopics(List<SmnTopics> smnTopics) {
        this.smnTopics = smnTopics;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ActionRule actionRule = (ActionRule) o;
        return Objects.equals(this.ruleName, actionRule.ruleName) &&
            Objects.equals(this.projectId, actionRule.projectId) &&
            Objects.equals(this.userName, actionRule.userName) &&
            Objects.equals(this.desc, actionRule.desc) &&
            Objects.equals(this.type, actionRule.type) &&
            Objects.equals(this.notificationTemplate, actionRule.notificationTemplate) &&
            Objects.equals(this.createTime, actionRule.createTime) &&
            Objects.equals(this.updateTime, actionRule.updateTime) &&
            Objects.equals(this.timeZone, actionRule.timeZone) &&
            Objects.equals(this.smnTopics, actionRule.smnTopics);
    }
    @Override
    public int hashCode() {
        return Objects.hash(ruleName, projectId, userName, desc, type, notificationTemplate, createTime, updateTime, timeZone, smnTopics);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActionRule {\n");
        sb.append("    ruleName: ").append(toIndentedString(ruleName)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    notificationTemplate: ").append(toIndentedString(notificationTemplate)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
        sb.append("    smnTopics: ").append(toIndentedString(smnTopics)).append("\n");
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

