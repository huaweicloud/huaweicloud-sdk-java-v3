package com.huaweicloud.sdk.drs.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.drs.v3.model.BatchSpecialTestConnectionReq;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class BatchValidateClustersConnectionsRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Language")
    
    private String xLanguage;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private BatchSpecialTestConnectionReq body = null;

    public BatchValidateClustersConnectionsRequest withXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
        return this;
    }

    


    /**
     * Get xLanguage
     * @return xLanguage
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Language")
    public String getXLanguage() {
        return xLanguage;
    }

    public void setXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
    }

    public BatchValidateClustersConnectionsRequest withBody(BatchSpecialTestConnectionReq body) {
        this.body = body;
        return this;
    }

    public BatchValidateClustersConnectionsRequest withBody(Consumer<BatchSpecialTestConnectionReq> bodySetter) {
        if(this.body == null ){
            this.body = new BatchSpecialTestConnectionReq();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public BatchSpecialTestConnectionReq getBody() {
        return body;
    }

    public void setBody(BatchSpecialTestConnectionReq body) {
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
        BatchValidateClustersConnectionsRequest batchValidateClustersConnectionsRequest = (BatchValidateClustersConnectionsRequest) o;
        return Objects.equals(this.xLanguage, batchValidateClustersConnectionsRequest.xLanguage) &&
            Objects.equals(this.body, batchValidateClustersConnectionsRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(xLanguage, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchValidateClustersConnectionsRequest {\n");
        sb.append("    xLanguage: ").append(toIndentedString(xLanguage)).append("\n");
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

