package com.huaweicloud.sdk.ccm.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ListCertificateAuthorityRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private String limit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="offset")
    
    private String offset;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private String status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    private String type;

    public ListCertificateAuthorityRequest withLimit(String limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * limit
     * @return limit
     */
    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    

    public ListCertificateAuthorityRequest withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * name
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public ListCertificateAuthorityRequest withOffset(String offset) {
        this.offset = offset;
        return this;
    }

    


    /**
     * offset
     * @return offset
     */
    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    

    public ListCertificateAuthorityRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    


    /**
     * status
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    

    public ListCertificateAuthorityRequest withType(String type) {
        this.type = type;
        return this;
    }

    


    /**
     * type
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListCertificateAuthorityRequest listCertificateAuthorityRequest = (ListCertificateAuthorityRequest) o;
        return Objects.equals(this.limit, listCertificateAuthorityRequest.limit) &&
            Objects.equals(this.name, listCertificateAuthorityRequest.name) &&
            Objects.equals(this.offset, listCertificateAuthorityRequest.offset) &&
            Objects.equals(this.status, listCertificateAuthorityRequest.status) &&
            Objects.equals(this.type, listCertificateAuthorityRequest.type);
    }
    @Override
    public int hashCode() {
        return Objects.hash(limit, name, offset, status, type);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCertificateAuthorityRequest {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

