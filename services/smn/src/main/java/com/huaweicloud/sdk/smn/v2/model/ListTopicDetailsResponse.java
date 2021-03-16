package com.huaweicloud.sdk.smn.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListTopicDetailsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="update_time")
    
    private String updateTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="push_policy")
    
    private Integer pushPolicy;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="create_time")
    
    private String createTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="topic_urn")
    
    private String topicUrn;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="display_name")
    
    private String displayName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="request_id")
    
    private String requestId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enterprise_project_id")
    
    private String enterpriseProjectId;

    public ListTopicDetailsResponse withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    


    /**
     * 更新时间。时间格式为UTC时间，YYYY-MM-DDTHH:MM:SSZ。
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    

    public ListTopicDetailsResponse withPushPolicy(Integer pushPolicy) {
        this.pushPolicy = pushPolicy;
        return this;
    }

    


    /**
     * 消息推送的策略。0表示发送失败，保留到失败队列，1表示直接丢弃发送失败的消息。
     * @return pushPolicy
     */
    public Integer getPushPolicy() {
        return pushPolicy;
    }

    public void setPushPolicy(Integer pushPolicy) {
        this.pushPolicy = pushPolicy;
    }

    

    public ListTopicDetailsResponse withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    


    /**
     * 创建时间。时间格式为UTC时间，YYYY-MM-DDTHH:MM:SSZ。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    

    public ListTopicDetailsResponse withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 创建Topic的名字。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public ListTopicDetailsResponse withTopicUrn(String topicUrn) {
        this.topicUrn = topicUrn;
        return this;
    }

    


    /**
     * Topic的唯一的资源标识。可以通过[查看主题列表获](https://support.huaweicloud.com/api-smn/smn_api_51004.html)取该标识。
     * @return topicUrn
     */
    public String getTopicUrn() {
        return topicUrn;
    }

    public void setTopicUrn(String topicUrn) {
        this.topicUrn = topicUrn;
    }

    

    public ListTopicDetailsResponse withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    


    /**
     * Topic的显示名，推送邮件消息时，作为邮件发件人显示。
     * @return displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    

    public ListTopicDetailsResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    


    /**
     * 请求的唯一标识ID。
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    

    public ListTopicDetailsResponse withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    


    /**
     * 企业项目ID。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListTopicDetailsResponse listTopicDetailsResponse = (ListTopicDetailsResponse) o;
        return Objects.equals(this.updateTime, listTopicDetailsResponse.updateTime) &&
            Objects.equals(this.pushPolicy, listTopicDetailsResponse.pushPolicy) &&
            Objects.equals(this.createTime, listTopicDetailsResponse.createTime) &&
            Objects.equals(this.name, listTopicDetailsResponse.name) &&
            Objects.equals(this.topicUrn, listTopicDetailsResponse.topicUrn) &&
            Objects.equals(this.displayName, listTopicDetailsResponse.displayName) &&
            Objects.equals(this.requestId, listTopicDetailsResponse.requestId) &&
            Objects.equals(this.enterpriseProjectId, listTopicDetailsResponse.enterpriseProjectId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(updateTime, pushPolicy, createTime, name, topicUrn, displayName, requestId, enterpriseProjectId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTopicDetailsResponse {\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    pushPolicy: ").append(toIndentedString(pushPolicy)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    topicUrn: ").append(toIndentedString(topicUrn)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
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

