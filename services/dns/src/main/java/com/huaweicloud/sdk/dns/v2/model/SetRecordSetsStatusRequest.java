package com.huaweicloud.sdk.dns.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.dns.v2.model.SetRecordSetsStatusReq;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class SetRecordSetsStatusRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="recordset_id")
    
    private String recordsetId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private SetRecordSetsStatusReq body;

    public SetRecordSetsStatusRequest withRecordsetId(String recordsetId) {
        this.recordsetId = recordsetId;
        return this;
    }

    


    /**
     * Get recordsetId
     * @return recordsetId
     */
    public String getRecordsetId() {
        return recordsetId;
    }

    public void setRecordsetId(String recordsetId) {
        this.recordsetId = recordsetId;
    }

    

    public SetRecordSetsStatusRequest withBody(SetRecordSetsStatusReq body) {
        this.body = body;
        return this;
    }

    public SetRecordSetsStatusRequest withBody(Consumer<SetRecordSetsStatusReq> bodySetter) {
        if(this.body == null ){
            this.body = new SetRecordSetsStatusReq();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public SetRecordSetsStatusReq getBody() {
        return body;
    }

    public void setBody(SetRecordSetsStatusReq body) {
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
        SetRecordSetsStatusRequest setRecordSetsStatusRequest = (SetRecordSetsStatusRequest) o;
        return Objects.equals(this.recordsetId, setRecordSetsStatusRequest.recordsetId) &&
            Objects.equals(this.body, setRecordSetsStatusRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(recordsetId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetRecordSetsStatusRequest {\n");
        sb.append("    recordsetId: ").append(toIndentedString(recordsetId)).append("\n");
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

