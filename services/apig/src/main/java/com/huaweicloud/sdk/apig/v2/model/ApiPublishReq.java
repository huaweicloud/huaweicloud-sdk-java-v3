package com.huaweicloud.sdk.apig.v2.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ApiPublishReq
 */
public class ApiPublishReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="action")
    
    private String action;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="env_id")
    
    private String envId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="api_id")
    
    private String apiId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="remark")
    
    private String remark;

    public ApiPublishReq withAction(String action) {
        this.action = action;
        return this;
    }

    


    /**
     * 需要进行的操作。支持发布online，下线offline
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public ApiPublishReq withEnvId(String envId) {
        this.envId = envId;
        return this;
    }

    


    /**
     * 环境的编号，即：API需要发布到哪个环境
     * @return envId
     */
    public String getEnvId() {
        return envId;
    }

    public void setEnvId(String envId) {
        this.envId = envId;
    }

    public ApiPublishReq withApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }

    


    /**
     * API的编号，即：需要进行发布或下线的API的编号
     * @return apiId
     */
    public String getApiId() {
        return apiId;
    }

    public void setApiId(String apiId) {
        this.apiId = apiId;
    }

    public ApiPublishReq withRemark(String remark) {
        this.remark = remark;
        return this;
    }

    


    /**
     * 对发布动作的简述。字符长度不超过255 > 中文字符必须为UTF-8或者unicode编码。
     * @return remark
     */
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApiPublishReq apiPublishReq = (ApiPublishReq) o;
        return Objects.equals(this.action, apiPublishReq.action) &&
            Objects.equals(this.envId, apiPublishReq.envId) &&
            Objects.equals(this.apiId, apiPublishReq.apiId) &&
            Objects.equals(this.remark, apiPublishReq.remark);
    }
    @Override
    public int hashCode() {
        return Objects.hash(action, envId, apiId, remark);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiPublishReq {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    envId: ").append(toIndentedString(envId)).append("\n");
        sb.append("    apiId: ").append(toIndentedString(apiId)).append("\n");
        sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
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

