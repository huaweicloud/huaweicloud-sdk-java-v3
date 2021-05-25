package com.huaweicloud.sdk.kafka.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.kafka.v2.model.CreateSinkTaskReq;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class CreateSinkTaskRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="connector_id")
    
    private String connectorId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private CreateSinkTaskReq body;

    public CreateSinkTaskRequest withConnectorId(String connectorId) {
        this.connectorId = connectorId;
        return this;
    }

    


    /**
     * 实例转储ID。 请参考[实例生命周期][查询实例]接口返回的数据。
     * @return connectorId
     */
    public String getConnectorId() {
        return connectorId;
    }

    public void setConnectorId(String connectorId) {
        this.connectorId = connectorId;
    }

    

    public CreateSinkTaskRequest withBody(CreateSinkTaskReq body) {
        this.body = body;
        return this;
    }

    public CreateSinkTaskRequest withBody(Consumer<CreateSinkTaskReq> bodySetter) {
        if(this.body == null ){
            this.body = new CreateSinkTaskReq();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public CreateSinkTaskReq getBody() {
        return body;
    }

    public void setBody(CreateSinkTaskReq body) {
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
        CreateSinkTaskRequest createSinkTaskRequest = (CreateSinkTaskRequest) o;
        return Objects.equals(this.connectorId, createSinkTaskRequest.connectorId) &&
            Objects.equals(this.body, createSinkTaskRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(connectorId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSinkTaskRequest {\n");
        sb.append("    connectorId: ").append(toIndentedString(connectorId)).append("\n");
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

