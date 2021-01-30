package com.huaweicloud.sdk.dns.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.dns.v2.model.CreatePrivateZoneReq;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class CreatePrivateZoneRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private CreatePrivateZoneReq body = null;

    public CreatePrivateZoneRequest withBody(CreatePrivateZoneReq body) {
        this.body = body;
        return this;
    }

    public CreatePrivateZoneRequest withBody(Consumer<CreatePrivateZoneReq> bodySetter) {
        if(this.body == null ){
            this.body = new CreatePrivateZoneReq();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public CreatePrivateZoneReq getBody() {
        return body;
    }

    public void setBody(CreatePrivateZoneReq body) {
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
        CreatePrivateZoneRequest createPrivateZoneRequest = (CreatePrivateZoneRequest) o;
        return Objects.equals(this.body, createPrivateZoneRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePrivateZoneRequest {\n");
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

