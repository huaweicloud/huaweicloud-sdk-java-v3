package com.huaweicloud.sdk.roma.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * SignBindingApiResp
 */
public class SignBindingApiResp  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="publish_id")
    
    private String publishId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="api_id")
    
    private String apiId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sign_secret")
    
    private String signSecret;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="group_name")
    
    private String groupName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sign_id")
    
    private String signId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sign_key")
    
    private String signKey;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="binding_time")
    
    private OffsetDateTime bindingTime = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="env_id")
    
    private String envId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="env_name")
    
    private String envName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sign_name")
    
    private String signName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="api_type")
    
    private Integer apiType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="api_name")
    
    private String apiName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="api_remark")
    
    private String apiRemark;

    public SignBindingApiResp withPublishId(String publishId) {
        this.publishId = publishId;
        return this;
    }

    


    /**
     * API的发布编号
     * @return publishId
     */
    public String getPublishId() {
        return publishId;
    }

    public void setPublishId(String publishId) {
        this.publishId = publishId;
    }

    public SignBindingApiResp withApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }

    


    /**
     * API编号
     * @return apiId
     */
    public String getApiId() {
        return apiId;
    }

    public void setApiId(String apiId) {
        this.apiId = apiId;
    }

    public SignBindingApiResp withSignSecret(String signSecret) {
        this.signSecret = signSecret;
        return this;
    }

    


    /**
     * 签名密钥的密钥
     * @return signSecret
     */
    public String getSignSecret() {
        return signSecret;
    }

    public void setSignSecret(String signSecret) {
        this.signSecret = signSecret;
    }

    public SignBindingApiResp withGroupName(String groupName) {
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

    public SignBindingApiResp withSignId(String signId) {
        this.signId = signId;
        return this;
    }

    


    /**
     * 签名密钥的编号
     * @return signId
     */
    public String getSignId() {
        return signId;
    }

    public void setSignId(String signId) {
        this.signId = signId;
    }

    public SignBindingApiResp withSignKey(String signKey) {
        this.signKey = signKey;
        return this;
    }

    


    /**
     * 签名密钥的key
     * @return signKey
     */
    public String getSignKey() {
        return signKey;
    }

    public void setSignKey(String signKey) {
        this.signKey = signKey;
    }

    public SignBindingApiResp withBindingTime(OffsetDateTime bindingTime) {
        this.bindingTime = bindingTime;
        return this;
    }

    


    /**
     * 绑定时间
     * @return bindingTime
     */
    public OffsetDateTime getBindingTime() {
        return bindingTime;
    }

    public void setBindingTime(OffsetDateTime bindingTime) {
        this.bindingTime = bindingTime;
    }

    public SignBindingApiResp withEnvId(String envId) {
        this.envId = envId;
        return this;
    }

    


    /**
     * API所属环境的编号
     * @return envId
     */
    public String getEnvId() {
        return envId;
    }

    public void setEnvId(String envId) {
        this.envId = envId;
    }

    public SignBindingApiResp withEnvName(String envName) {
        this.envName = envName;
        return this;
    }

    


    /**
     * API所属环境的名称
     * @return envName
     */
    public String getEnvName() {
        return envName;
    }

    public void setEnvName(String envName) {
        this.envName = envName;
    }

    public SignBindingApiResp withSignName(String signName) {
        this.signName = signName;
        return this;
    }

    


    /**
     * 签名密钥的名称
     * @return signName
     */
    public String getSignName() {
        return signName;
    }

    public void setSignName(String signName) {
        this.signName = signName;
    }

    public SignBindingApiResp withApiType(Integer apiType) {
        this.apiType = apiType;
        return this;
    }

    


    /**
     * API类型
     * @return apiType
     */
    public Integer getApiType() {
        return apiType;
    }

    public void setApiType(Integer apiType) {
        this.apiType = apiType;
    }

    public SignBindingApiResp withApiName(String apiName) {
        this.apiName = apiName;
        return this;
    }

    


    /**
     * API名称
     * @return apiName
     */
    public String getApiName() {
        return apiName;
    }

    public void setApiName(String apiName) {
        this.apiName = apiName;
    }

    public SignBindingApiResp withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 绑定关系的ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SignBindingApiResp withApiRemark(String apiRemark) {
        this.apiRemark = apiRemark;
        return this;
    }

    


    /**
     * API描述
     * @return apiRemark
     */
    public String getApiRemark() {
        return apiRemark;
    }

    public void setApiRemark(String apiRemark) {
        this.apiRemark = apiRemark;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SignBindingApiResp signBindingApiResp = (SignBindingApiResp) o;
        return Objects.equals(this.publishId, signBindingApiResp.publishId) &&
            Objects.equals(this.apiId, signBindingApiResp.apiId) &&
            Objects.equals(this.signSecret, signBindingApiResp.signSecret) &&
            Objects.equals(this.groupName, signBindingApiResp.groupName) &&
            Objects.equals(this.signId, signBindingApiResp.signId) &&
            Objects.equals(this.signKey, signBindingApiResp.signKey) &&
            Objects.equals(this.bindingTime, signBindingApiResp.bindingTime) &&
            Objects.equals(this.envId, signBindingApiResp.envId) &&
            Objects.equals(this.envName, signBindingApiResp.envName) &&
            Objects.equals(this.signName, signBindingApiResp.signName) &&
            Objects.equals(this.apiType, signBindingApiResp.apiType) &&
            Objects.equals(this.apiName, signBindingApiResp.apiName) &&
            Objects.equals(this.id, signBindingApiResp.id) &&
            Objects.equals(this.apiRemark, signBindingApiResp.apiRemark);
    }
    @Override
    public int hashCode() {
        return Objects.hash(publishId, apiId, signSecret, groupName, signId, signKey, bindingTime, envId, envName, signName, apiType, apiName, id, apiRemark);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SignBindingApiResp {\n");
        sb.append("    publishId: ").append(toIndentedString(publishId)).append("\n");
        sb.append("    apiId: ").append(toIndentedString(apiId)).append("\n");
        sb.append("    signSecret: ").append(toIndentedString(signSecret)).append("\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    signId: ").append(toIndentedString(signId)).append("\n");
        sb.append("    signKey: ").append(toIndentedString(signKey)).append("\n");
        sb.append("    bindingTime: ").append(toIndentedString(bindingTime)).append("\n");
        sb.append("    envId: ").append(toIndentedString(envId)).append("\n");
        sb.append("    envName: ").append(toIndentedString(envName)).append("\n");
        sb.append("    signName: ").append(toIndentedString(signName)).append("\n");
        sb.append("    apiType: ").append(toIndentedString(apiType)).append("\n");
        sb.append("    apiName: ").append(toIndentedString(apiName)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    apiRemark: ").append(toIndentedString(apiRemark)).append("\n");
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

