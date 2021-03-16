package com.huaweicloud.sdk.bms.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ListBareMetalServersRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="flavor")
    
    private String flavor;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private String status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="offset")
    
    private Integer offset;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tags")
    
    private String tags;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="reservation_id")
    
    private String reservationId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="detail")
    
    private String detail;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enterprise_project_id")
    
    private String enterpriseProjectId;

    public ListBareMetalServersRequest withFlavor(String flavor) {
        this.flavor = flavor;
        return this;
    }

    


    /**
     * Get flavor
     * @return flavor
     */
    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    

    public ListBareMetalServersRequest withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * Get name
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public ListBareMetalServersRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    


    /**
     * Get status
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    

    public ListBareMetalServersRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * Get limit
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    

    public ListBareMetalServersRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    


    /**
     * Get offset
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    

    public ListBareMetalServersRequest withTags(String tags) {
        this.tags = tags;
        return this;
    }

    


    /**
     * Get tags
     * @return tags
     */
    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    

    public ListBareMetalServersRequest withReservationId(String reservationId) {
        this.reservationId = reservationId;
        return this;
    }

    


    /**
     * Get reservationId
     * @return reservationId
     */
    public String getReservationId() {
        return reservationId;
    }

    public void setReservationId(String reservationId) {
        this.reservationId = reservationId;
    }

    

    public ListBareMetalServersRequest withDetail(String detail) {
        this.detail = detail;
        return this;
    }

    


    /**
     * Get detail
     * @return detail
     */
    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    

    public ListBareMetalServersRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    


    /**
     * Get enterpriseProjectId
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListBareMetalServersRequest listBareMetalServersRequest = (ListBareMetalServersRequest) o;
        return Objects.equals(this.flavor, listBareMetalServersRequest.flavor) &&
            Objects.equals(this.name, listBareMetalServersRequest.name) &&
            Objects.equals(this.status, listBareMetalServersRequest.status) &&
            Objects.equals(this.limit, listBareMetalServersRequest.limit) &&
            Objects.equals(this.offset, listBareMetalServersRequest.offset) &&
            Objects.equals(this.tags, listBareMetalServersRequest.tags) &&
            Objects.equals(this.reservationId, listBareMetalServersRequest.reservationId) &&
            Objects.equals(this.detail, listBareMetalServersRequest.detail) &&
            Objects.equals(this.enterpriseProjectId, listBareMetalServersRequest.enterpriseProjectId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(flavor, name, status, limit, offset, tags, reservationId, detail, enterpriseProjectId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListBareMetalServersRequest {\n");
        sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    reservationId: ").append(toIndentedString(reservationId)).append("\n");
        sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
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

