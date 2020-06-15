package com.huaweicloud.sdk.dcs.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.dcs.v2.model.BackupInstanceBody;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * Request Object
 */
public class CopyInstanceRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_id")
    
    private String instanceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private BackupInstanceBody body = null;

    public CopyInstanceRequest withInstanceId(String instanceId) {
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

    public CopyInstanceRequest withBody(BackupInstanceBody body) {
        this.body = body;
        return this;
    }

    public CopyInstanceRequest withBody(Consumer<BackupInstanceBody> bodySetter) {
        if(this.body == null ){
            this.body = new BackupInstanceBody();
        }
        bodySetter.accept(this.body);
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public BackupInstanceBody getBody() {
        return body;
    }

    public void setBody(BackupInstanceBody body) {
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
        CopyInstanceRequest copyInstanceRequest = (CopyInstanceRequest) o;
        return Objects.equals(this.instanceId, copyInstanceRequest.instanceId) &&
            Objects.equals(this.body, copyInstanceRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(instanceId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CopyInstanceRequest {\n");
            sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
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

