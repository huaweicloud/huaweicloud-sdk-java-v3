package com.huaweicloud.sdk.roma.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ThrottleBindingApiResp
 */
public class ThrottleBindingApiResp  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="auth_type")
    
    private String authType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="group_name")
    
    private String groupName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="publish_id")
    
    private String publishId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="throttle_apply_id")
    
    private String throttleApplyId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="apply_time")
    
    private OffsetDateTime applyTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="remark")
    
    private String remark;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="run_env_id")
    
    private String runEnvId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    private Integer type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="throttle_name")
    
    private String throttleName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="req_uri")
    
    private String reqUri;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="run_env_name")
    
    private String runEnvName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="group_id")
    
    private String groupId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;

    public ThrottleBindingApiResp withAuthType(String authType) {
        this.authType = authType;
        return this;
    }

    


    /**
     * API的认证方式
     * @return authType
     */
    public String getAuthType() {
        return authType;
    }

    public void setAuthType(String authType) {
        this.authType = authType;
    }

    

    public ThrottleBindingApiResp withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    


    /**
     * API所属分组的名称
     * @return groupName
     */
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    

    public ThrottleBindingApiResp withPublishId(String publishId) {
        this.publishId = publishId;
        return this;
    }

    


    /**
     * API的发布记录编号
     * @return publishId
     */
    public String getPublishId() {
        return publishId;
    }

    public void setPublishId(String publishId) {
        this.publishId = publishId;
    }

    

    public ThrottleBindingApiResp withThrottleApplyId(String throttleApplyId) {
        this.throttleApplyId = throttleApplyId;
        return this;
    }

    


    /**
     * 与流控策略的绑定关系编号
     * @return throttleApplyId
     */
    public String getThrottleApplyId() {
        return throttleApplyId;
    }

    public void setThrottleApplyId(String throttleApplyId) {
        this.throttleApplyId = throttleApplyId;
    }

    

    public ThrottleBindingApiResp withApplyTime(OffsetDateTime applyTime) {
        this.applyTime = applyTime;
        return this;
    }

    


    /**
     * 已绑定的流控策略的绑定时间
     * @return applyTime
     */
    public OffsetDateTime getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(OffsetDateTime applyTime) {
        this.applyTime = applyTime;
    }

    

    public ThrottleBindingApiResp withRemark(String remark) {
        this.remark = remark;
        return this;
    }

    


    /**
     * API描述
     * @return remark
     */
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    

    public ThrottleBindingApiResp withRunEnvId(String runEnvId) {
        this.runEnvId = runEnvId;
        return this;
    }

    


    /**
     * 发布的环境id
     * @return runEnvId
     */
    public String getRunEnvId() {
        return runEnvId;
    }

    public void setRunEnvId(String runEnvId) {
        this.runEnvId = runEnvId;
    }

    

    public ThrottleBindingApiResp withType(Integer type) {
        this.type = type;
        return this;
    }

    


    /**
     * API类型
     * @return type
     */
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    

    public ThrottleBindingApiResp withThrottleName(String throttleName) {
        this.throttleName = throttleName;
        return this;
    }

    


    /**
     * 绑定的流控策略名称
     * @return throttleName
     */
    public String getThrottleName() {
        return throttleName;
    }

    public void setThrottleName(String throttleName) {
        this.throttleName = throttleName;
    }

    

    public ThrottleBindingApiResp withReqUri(String reqUri) {
        this.reqUri = reqUri;
        return this;
    }

    


    /**
     * API的访问地址
     * @return reqUri
     */
    public String getReqUri() {
        return reqUri;
    }

    public void setReqUri(String reqUri) {
        this.reqUri = reqUri;
    }

    

    public ThrottleBindingApiResp withRunEnvName(String runEnvName) {
        this.runEnvName = runEnvName;
        return this;
    }

    


    /**
     * 发布的环境名
     * @return runEnvName
     */
    public String getRunEnvName() {
        return runEnvName;
    }

    public void setRunEnvName(String runEnvName) {
        this.runEnvName = runEnvName;
    }

    

    public ThrottleBindingApiResp withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    


    /**
     * API所属分组的编号
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    

    public ThrottleBindingApiResp withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * API名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public ThrottleBindingApiResp withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * API编号
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ThrottleBindingApiResp throttleBindingApiResp = (ThrottleBindingApiResp) o;
        return Objects.equals(this.authType, throttleBindingApiResp.authType) &&
            Objects.equals(this.groupName, throttleBindingApiResp.groupName) &&
            Objects.equals(this.publishId, throttleBindingApiResp.publishId) &&
            Objects.equals(this.throttleApplyId, throttleBindingApiResp.throttleApplyId) &&
            Objects.equals(this.applyTime, throttleBindingApiResp.applyTime) &&
            Objects.equals(this.remark, throttleBindingApiResp.remark) &&
            Objects.equals(this.runEnvId, throttleBindingApiResp.runEnvId) &&
            Objects.equals(this.type, throttleBindingApiResp.type) &&
            Objects.equals(this.throttleName, throttleBindingApiResp.throttleName) &&
            Objects.equals(this.reqUri, throttleBindingApiResp.reqUri) &&
            Objects.equals(this.runEnvName, throttleBindingApiResp.runEnvName) &&
            Objects.equals(this.groupId, throttleBindingApiResp.groupId) &&
            Objects.equals(this.name, throttleBindingApiResp.name) &&
            Objects.equals(this.id, throttleBindingApiResp.id);
    }
    @Override
    public int hashCode() {
        return Objects.hash(authType, groupName, publishId, throttleApplyId, applyTime, remark, runEnvId, type, throttleName, reqUri, runEnvName, groupId, name, id);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ThrottleBindingApiResp {\n");
        sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    publishId: ").append(toIndentedString(publishId)).append("\n");
        sb.append("    throttleApplyId: ").append(toIndentedString(throttleApplyId)).append("\n");
        sb.append("    applyTime: ").append(toIndentedString(applyTime)).append("\n");
        sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
        sb.append("    runEnvId: ").append(toIndentedString(runEnvId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    throttleName: ").append(toIndentedString(throttleName)).append("\n");
        sb.append("    reqUri: ").append(toIndentedString(reqUri)).append("\n");
        sb.append("    runEnvName: ").append(toIndentedString(runEnvName)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

