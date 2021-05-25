package com.huaweicloud.sdk.kafka.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.kafka.v2.model.ResetUserPasswrodReq;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ResetUserPasswrodRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_id")
    
    private String instanceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="user_name")
    
    private String userName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private ResetUserPasswrodReq body;

    public ResetUserPasswrodRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    


    /**
     * 实例ID。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    

    public ResetUserPasswrodRequest withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    


    /**
     * 用户名称。
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    

    public ResetUserPasswrodRequest withBody(ResetUserPasswrodReq body) {
        this.body = body;
        return this;
    }

    public ResetUserPasswrodRequest withBody(Consumer<ResetUserPasswrodReq> bodySetter) {
        if(this.body == null ){
            this.body = new ResetUserPasswrodReq();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public ResetUserPasswrodReq getBody() {
        return body;
    }

    public void setBody(ResetUserPasswrodReq body) {
        this.body = body;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResetUserPasswrodRequest resetUserPasswrodRequest = (ResetUserPasswrodRequest) o;
        return Objects.equals(this.instanceId, resetUserPasswrodRequest.instanceId) &&
            Objects.equals(this.userName, resetUserPasswrodRequest.userName) &&
            Objects.equals(this.body, resetUserPasswrodRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(instanceId, userName, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResetUserPasswrodRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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

