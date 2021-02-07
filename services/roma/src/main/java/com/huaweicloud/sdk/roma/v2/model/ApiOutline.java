package com.huaweicloud.sdk.roma.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ApiOutline
 */
public class ApiOutline  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="auth_type")
    
    private String authType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="run_env_name")
    
    private String runEnvName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="group_name")
    
    private String groupName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="publish_id")
    
    private String publishId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="group_id")
    
    private String groupId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="remark")
    
    private String remark;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="run_env_id")
    
    private String runEnvId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="req_uri")
    
    private String reqUri;

    public ApiOutline withAuthType(String authType) {
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

    public ApiOutline withRunEnvName(String runEnvName) {
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

    public ApiOutline withGroupName(String groupName) {
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

    public ApiOutline withPublishId(String publishId) {
        this.publishId = publishId;
        return this;
    }

    


    /**
     * 发布记录的编号
     * @return publishId
     */
    public String getPublishId() {
        return publishId;
    }

    public void setPublishId(String publishId) {
        this.publishId = publishId;
    }

    public ApiOutline withGroupId(String groupId) {
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

    public ApiOutline withName(String name) {
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

    public ApiOutline withRemark(String remark) {
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

    public ApiOutline withRunEnvId(String runEnvId) {
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

    public ApiOutline withId(String id) {
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

    public ApiOutline withReqUri(String reqUri) {
        this.reqUri = reqUri;
        return this;
    }

    


    /**
     * API的请求地址
     * @return reqUri
     */
    public String getReqUri() {
        return reqUri;
    }

    public void setReqUri(String reqUri) {
        this.reqUri = reqUri;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApiOutline apiOutline = (ApiOutline) o;
        return Objects.equals(this.authType, apiOutline.authType) &&
            Objects.equals(this.runEnvName, apiOutline.runEnvName) &&
            Objects.equals(this.groupName, apiOutline.groupName) &&
            Objects.equals(this.publishId, apiOutline.publishId) &&
            Objects.equals(this.groupId, apiOutline.groupId) &&
            Objects.equals(this.name, apiOutline.name) &&
            Objects.equals(this.remark, apiOutline.remark) &&
            Objects.equals(this.runEnvId, apiOutline.runEnvId) &&
            Objects.equals(this.id, apiOutline.id) &&
            Objects.equals(this.reqUri, apiOutline.reqUri);
    }
    @Override
    public int hashCode() {
        return Objects.hash(authType, runEnvName, groupName, publishId, groupId, name, remark, runEnvId, id, reqUri);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiOutline {\n");
        sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
        sb.append("    runEnvName: ").append(toIndentedString(runEnvName)).append("\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    publishId: ").append(toIndentedString(publishId)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
        sb.append("    runEnvId: ").append(toIndentedString(runEnvId)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    reqUri: ").append(toIndentedString(reqUri)).append("\n");
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

