package com.huaweicloud.sdk.apig.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class CancelingAuthorizationV2Request  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_id")
    
    private String instanceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_auth_id")
    
    private String appAuthId;

    public CancelingAuthorizationV2Request withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    


    /**
     * 实例编号
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    

    public CancelingAuthorizationV2Request withAppAuthId(String appAuthId) {
        this.appAuthId = appAuthId;
        return this;
    }

    


    /**
     * 授权关系的ID
     * @return appAuthId
     */
    public String getAppAuthId() {
        return appAuthId;
    }

    public void setAppAuthId(String appAuthId) {
        this.appAuthId = appAuthId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CancelingAuthorizationV2Request cancelingAuthorizationV2Request = (CancelingAuthorizationV2Request) o;
        return Objects.equals(this.instanceId, cancelingAuthorizationV2Request.instanceId) &&
            Objects.equals(this.appAuthId, cancelingAuthorizationV2Request.appAuthId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(instanceId, appAuthId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CancelingAuthorizationV2Request {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    appAuthId: ").append(toIndentedString(appAuthId)).append("\n");
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

