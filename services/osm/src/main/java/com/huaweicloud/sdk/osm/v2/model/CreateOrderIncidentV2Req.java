package com.huaweicloud.sdk.osm.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.osm.v2.model.CreateIncidentV2Req;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * CreateOrderIncidentV2Req
 */
public class CreateOrderIncidentV2Req  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="create_case_req")
    
    private CreateIncidentV2Req createCaseReq = null;

    public CreateOrderIncidentV2Req withCreateCaseReq(CreateIncidentV2Req createCaseReq) {
        this.createCaseReq = createCaseReq;
        return this;
    }

    public CreateOrderIncidentV2Req withCreateCaseReq(Consumer<CreateIncidentV2Req> createCaseReqSetter) {
        if(this.createCaseReq == null ){
            this.createCaseReq = new CreateIncidentV2Req();
            createCaseReqSetter.accept(this.createCaseReq);
        }
        
        return this;
    }


    /**
     * Get createCaseReq
     * @return createCaseReq
     */
    public CreateIncidentV2Req getCreateCaseReq() {
        return createCaseReq;
    }

    public void setCreateCaseReq(CreateIncidentV2Req createCaseReq) {
        this.createCaseReq = createCaseReq;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateOrderIncidentV2Req createOrderIncidentV2Req = (CreateOrderIncidentV2Req) o;
        return Objects.equals(this.createCaseReq, createOrderIncidentV2Req.createCaseReq);
    }
    @Override
    public int hashCode() {
        return Objects.hash(createCaseReq);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateOrderIncidentV2Req {\n");
        sb.append("    createCaseReq: ").append(toIndentedString(createCaseReq)).append("\n");
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

