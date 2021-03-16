package com.huaweicloud.sdk.iam.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class UpdateCredentialResult  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="user_id")
    
    private String userId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="access")
    
    private String access;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private String status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="create_time")
    
    private String createTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;

    public UpdateCredentialResult withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    


    /**
     * IAM用户ID。
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    

    public UpdateCredentialResult withAccess(String access) {
        this.access = access;
        return this;
    }

    


    /**
     * 修改的AK。
     * @return access
     */
    public String getAccess() {
        return access;
    }

    public void setAccess(String access) {
        this.access = access;
    }

    

    public UpdateCredentialResult withStatus(String status) {
        this.status = status;
        return this;
    }

    


    /**
     * 访问密钥状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    

    public UpdateCredentialResult withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    


    /**
     * 访问密钥创建时间。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    

    public UpdateCredentialResult withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 访问密钥描述信息。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateCredentialResult updateCredentialResult = (UpdateCredentialResult) o;
        return Objects.equals(this.userId, updateCredentialResult.userId) &&
            Objects.equals(this.access, updateCredentialResult.access) &&
            Objects.equals(this.status, updateCredentialResult.status) &&
            Objects.equals(this.createTime, updateCredentialResult.createTime) &&
            Objects.equals(this.description, updateCredentialResult.description);
    }
    @Override
    public int hashCode() {
        return Objects.hash(userId, access, status, createTime, description);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateCredentialResult {\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    access: ").append(toIndentedString(access)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

