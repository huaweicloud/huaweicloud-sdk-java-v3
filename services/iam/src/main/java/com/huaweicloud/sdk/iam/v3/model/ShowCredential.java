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
public class ShowCredential  {



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
    @JsonProperty(value="last_use_time")
    
    private String lastUseTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;

    public ShowCredential withUserId(String userId) {
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

    public ShowCredential withAccess(String access) {
        this.access = access;
        return this;
    }

    


    /**
     * 查询的AK。
     * @return access
     */
    public String getAccess() {
        return access;
    }

    public void setAccess(String access) {
        this.access = access;
    }

    public ShowCredential withStatus(String status) {
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

    public ShowCredential withCreateTime(String createTime) {
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

    public ShowCredential withLastUseTime(String lastUseTime) {
        this.lastUseTime = lastUseTime;
        return this;
    }

    


    /**
     * 访问密钥的上次使用时间。
     * @return lastUseTime
     */
    public String getLastUseTime() {
        return lastUseTime;
    }

    public void setLastUseTime(String lastUseTime) {
        this.lastUseTime = lastUseTime;
    }

    public ShowCredential withDescription(String description) {
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
        ShowCredential showCredential = (ShowCredential) o;
        return Objects.equals(this.userId, showCredential.userId) &&
            Objects.equals(this.access, showCredential.access) &&
            Objects.equals(this.status, showCredential.status) &&
            Objects.equals(this.createTime, showCredential.createTime) &&
            Objects.equals(this.lastUseTime, showCredential.lastUseTime) &&
            Objects.equals(this.description, showCredential.description);
    }
    @Override
    public int hashCode() {
        return Objects.hash(userId, access, status, createTime, lastUseTime, description);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowCredential {\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    access: ").append(toIndentedString(access)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    lastUseTime: ").append(toIndentedString(lastUseTime)).append("\n");
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

