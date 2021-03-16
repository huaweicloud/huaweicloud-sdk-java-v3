package com.huaweicloud.sdk.meeting.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.meeting.v1.model.DeptDTO;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class AddDepartmentRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Request-Id")
    
    private String xRequestId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="Accept-Language")
    
    private String acceptLanguage;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private DeptDTO body;

    public AddDepartmentRequest withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    


    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Request-Id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    

    public AddDepartmentRequest withAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }

    


    /**
     * Get acceptLanguage
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return acceptLanguage;
    }

    public void setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
    }

    

    public AddDepartmentRequest withBody(DeptDTO body) {
        this.body = body;
        return this;
    }

    public AddDepartmentRequest withBody(Consumer<DeptDTO> bodySetter) {
        if(this.body == null ){
            this.body = new DeptDTO();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public DeptDTO getBody() {
        return body;
    }

    public void setBody(DeptDTO body) {
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
        AddDepartmentRequest addDepartmentRequest = (AddDepartmentRequest) o;
        return Objects.equals(this.xRequestId, addDepartmentRequest.xRequestId) &&
            Objects.equals(this.acceptLanguage, addDepartmentRequest.acceptLanguage) &&
            Objects.equals(this.body, addDepartmentRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(xRequestId, acceptLanguage, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddDepartmentRequest {\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
        sb.append("    acceptLanguage: ").append(toIndentedString(acceptLanguage)).append("\n");
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

