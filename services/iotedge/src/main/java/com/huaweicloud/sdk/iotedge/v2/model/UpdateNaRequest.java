package com.huaweicloud.sdk.iotedge.v2.model;






import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iotedge.v2.model.UpdateNaRequestDTO;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class UpdateNaRequest  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="na_id")
    

    private String naId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    

    private UpdateNaRequestDTO body;

    public UpdateNaRequest withNaId(String naId) {
        this.naId = naId;
        return this;
    }

    


    /**
     * 北向数据接收端点ID
     * @return naId
     */
    public String getNaId() {
        return naId;
    }

    public void setNaId(String naId) {
        this.naId = naId;
    }

    

    public UpdateNaRequest withBody(UpdateNaRequestDTO body) {
        this.body = body;
        return this;
    }

    public UpdateNaRequest withBody(Consumer<UpdateNaRequestDTO> bodySetter) {
        if(this.body == null ){
            this.body = new UpdateNaRequestDTO();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public UpdateNaRequestDTO getBody() {
        return body;
    }

    public void setBody(UpdateNaRequestDTO body) {
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
        UpdateNaRequest updateNaRequest = (UpdateNaRequest) o;
        return Objects.equals(this.naId, updateNaRequest.naId) &&
            Objects.equals(this.body, updateNaRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(naId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateNaRequest {\n");
        sb.append("    naId: ").append(toIndentedString(naId)).append("\n");
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

