package com.huaweicloud.sdk.apig.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.apig.v2.model.AppSecretReq;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ResettingAppSecretV2Request  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_id")
    
    private String instanceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_id")
    
    private String appId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private AppSecretReq body;

    public ResettingAppSecretV2Request withInstanceId(String instanceId) {
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

    

    public ResettingAppSecretV2Request withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    


    /**
     * APP的编号，可通过查询APP列表获取
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    

    public ResettingAppSecretV2Request withBody(AppSecretReq body) {
        this.body = body;
        return this;
    }

    public ResettingAppSecretV2Request withBody(Consumer<AppSecretReq> bodySetter) {
        if(this.body == null ){
            this.body = new AppSecretReq();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public AppSecretReq getBody() {
        return body;
    }

    public void setBody(AppSecretReq body) {
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
        ResettingAppSecretV2Request resettingAppSecretV2Request = (ResettingAppSecretV2Request) o;
        return Objects.equals(this.instanceId, resettingAppSecretV2Request.instanceId) &&
            Objects.equals(this.appId, resettingAppSecretV2Request.appId) &&
            Objects.equals(this.body, resettingAppSecretV2Request.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(instanceId, appId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResettingAppSecretV2Request {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
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

