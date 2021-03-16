package com.huaweicloud.sdk.roma.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.roma.v2.model.AppAclCreate;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class UpdateAppAclRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_id")
    
    private String instanceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_id")
    
    private String appId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private AppAclCreate body;

    public UpdateAppAclRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    


    /**
     * Get instanceId
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    

    public UpdateAppAclRequest withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    


    /**
     * Get appId
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    

    public UpdateAppAclRequest withBody(AppAclCreate body) {
        this.body = body;
        return this;
    }

    public UpdateAppAclRequest withBody(Consumer<AppAclCreate> bodySetter) {
        if(this.body == null ){
            this.body = new AppAclCreate();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public AppAclCreate getBody() {
        return body;
    }

    public void setBody(AppAclCreate body) {
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
        UpdateAppAclRequest updateAppAclRequest = (UpdateAppAclRequest) o;
        return Objects.equals(this.instanceId, updateAppAclRequest.instanceId) &&
            Objects.equals(this.appId, updateAppAclRequest.appId) &&
            Objects.equals(this.body, updateAppAclRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(instanceId, appId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateAppAclRequest {\n");
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

