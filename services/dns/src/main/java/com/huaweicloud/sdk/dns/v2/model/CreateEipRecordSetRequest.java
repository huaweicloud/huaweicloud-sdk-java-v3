package com.huaweicloud.sdk.dns.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.dns.v2.model.CreatePtrReq;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class CreateEipRecordSetRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="region")
    
    private String region;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="floatingip_id")
    
    private String floatingipId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private CreatePtrReq body = null;

    public CreateEipRecordSetRequest withRegion(String region) {
        this.region = region;
        return this;
    }

    


    /**
     * Get region
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public CreateEipRecordSetRequest withFloatingipId(String floatingipId) {
        this.floatingipId = floatingipId;
        return this;
    }

    


    /**
     * Get floatingipId
     * @return floatingipId
     */
    public String getFloatingipId() {
        return floatingipId;
    }

    public void setFloatingipId(String floatingipId) {
        this.floatingipId = floatingipId;
    }

    public CreateEipRecordSetRequest withBody(CreatePtrReq body) {
        this.body = body;
        return this;
    }

    public CreateEipRecordSetRequest withBody(Consumer<CreatePtrReq> bodySetter) {
        if(this.body == null ){
            this.body = new CreatePtrReq();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public CreatePtrReq getBody() {
        return body;
    }

    public void setBody(CreatePtrReq body) {
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
        CreateEipRecordSetRequest createEipRecordSetRequest = (CreateEipRecordSetRequest) o;
        return Objects.equals(this.region, createEipRecordSetRequest.region) &&
            Objects.equals(this.floatingipId, createEipRecordSetRequest.floatingipId) &&
            Objects.equals(this.body, createEipRecordSetRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(region, floatingipId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateEipRecordSetRequest {\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    floatingipId: ").append(toIndentedString(floatingipId)).append("\n");
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

