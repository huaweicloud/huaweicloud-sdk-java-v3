package com.huaweicloud.sdk.roma.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.roma.v2.model.LiveDataExportReq;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ExportLiveDataApiDefinitionsV2Request  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_id")
    
    private String instanceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private LiveDataExportReq body;

    public ExportLiveDataApiDefinitionsV2Request withInstanceId(String instanceId) {
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

    

    public ExportLiveDataApiDefinitionsV2Request withBody(LiveDataExportReq body) {
        this.body = body;
        return this;
    }

    public ExportLiveDataApiDefinitionsV2Request withBody(Consumer<LiveDataExportReq> bodySetter) {
        if(this.body == null ){
            this.body = new LiveDataExportReq();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public LiveDataExportReq getBody() {
        return body;
    }

    public void setBody(LiveDataExportReq body) {
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
        ExportLiveDataApiDefinitionsV2Request exportLiveDataApiDefinitionsV2Request = (ExportLiveDataApiDefinitionsV2Request) o;
        return Objects.equals(this.instanceId, exportLiveDataApiDefinitionsV2Request.instanceId) &&
            Objects.equals(this.body, exportLiveDataApiDefinitionsV2Request.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(instanceId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExportLiveDataApiDefinitionsV2Request {\n");
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

