package com.huaweicloud.sdk.aom.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.aom.v2.model.SmnTopics;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowActionRuleResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="rule_name")
    
    
    private String ruleName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="project_id")
    
    
    private String projectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="user_name")
    
    
    private String userName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="desc")
    
    
    private String desc;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    
    private String type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="notification_template")
    
    
    private String notificationTemplate;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="create_time")
    
    
    private Long createTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="update_time")
    
    
    private Long updateTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="time_zone")
    
    
    private String timeZone;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="smn_topics")
    
    
    private List<SmnTopics> smnTopics = null;
    
    public ShowActionRuleResponse withRuleName(String ruleName) {
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

    

    public ShowActionRuleResponse withProjectId(String projectId) {
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

    

    public ShowActionRuleResponse withUserName(String userName) {
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

    

    public ShowActionRuleResponse withDesc(String desc) {
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

    

    public ShowActionRuleResponse withType(String type) {
        this.type = type;
        return this;
    }

    


    /**
     * 规则类型。1：通知，2：用户
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    

    public ShowActionRuleResponse withNotificationTemplate(String notificationTemplate) {
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

    

    public ShowActionRuleResponse withCreateTime(Long createTime) {
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

    

    public ShowActionRuleResponse withUpdateTime(Long updateTime) {
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

    

    public ShowActionRuleResponse withTimeZone(String timeZone) {
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

    

    public ShowActionRuleResponse withSmnTopics(List<SmnTopics> smnTopics) {
        this.smnTopics = smnTopics;
        return this;
    }

    
    public ShowActionRuleResponse addSmnTopicsItem(SmnTopics smnTopicsItem) {
        if(this.smnTopics == null) {
            this.smnTopics = new ArrayList<>();
        }
        this.smnTopics.add(smnTopicsItem);
        return this;
    }

    public ShowActionRuleResponse withSmnTopics(Consumer<List<SmnTopics>> smnTopicsSetter) {
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
        ShowActionRuleResponse showActionRuleResponse = (ShowActionRuleResponse) o;
        return Objects.equals(this.ruleName, showActionRuleResponse.ruleName) &&
            Objects.equals(this.projectId, showActionRuleResponse.projectId) &&
            Objects.equals(this.userName, showActionRuleResponse.userName) &&
            Objects.equals(this.desc, showActionRuleResponse.desc) &&
            Objects.equals(this.type, showActionRuleResponse.type) &&
            Objects.equals(this.notificationTemplate, showActionRuleResponse.notificationTemplate) &&
            Objects.equals(this.createTime, showActionRuleResponse.createTime) &&
            Objects.equals(this.updateTime, showActionRuleResponse.updateTime) &&
            Objects.equals(this.timeZone, showActionRuleResponse.timeZone) &&
            Objects.equals(this.smnTopics, showActionRuleResponse.smnTopics);
    }
    @Override
    public int hashCode() {
        return Objects.hash(ruleName, projectId, userName, desc, type, notificationTemplate, createTime, updateTime, timeZone, smnTopics);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowActionRuleResponse {\n");
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

