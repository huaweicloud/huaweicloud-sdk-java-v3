package com.huaweicloud.sdk.ecs.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * Request Object
 */
public class ListServersDetailsRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="offset")
    
    private Integer offset = 1;


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
    
    private Integer limit = 25;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="not-tags")
    
    private String notTags;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="reservation_id")
    
    private String reservationId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enterprise_project_id")
    
    private String enterpriseProjectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tags")
    
    private String tags;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ip")
    
    private String ip;

    public ListServersDetailsRequest withOffset(Integer offset) {
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

    public ListServersDetailsRequest withFlavor(String flavor) {
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

    public ListServersDetailsRequest withName(String name) {
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

    public ListServersDetailsRequest withStatus(String status) {
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

    public ListServersDetailsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * Get limit
     * minimum: 1
     * maximum: 1000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListServersDetailsRequest withNotTags(String notTags) {
        this.notTags = notTags;
        return this;
    }

    


    /**
     * Get notTags
     * @return notTags
     */
    public String getNotTags() {
        return notTags;
    }

    public void setNotTags(String notTags) {
        this.notTags = notTags;
    }

    public ListServersDetailsRequest withReservationId(String reservationId) {
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

    public ListServersDetailsRequest withEnterpriseProjectId(String enterpriseProjectId) {
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

    public ListServersDetailsRequest withTags(String tags) {
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

    public ListServersDetailsRequest withIp(String ip) {
        this.ip = ip;
        return this;
    }

    


    /**
     * Get ip
     * @return ip
     */
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListServersDetailsRequest listServersDetailsRequest = (ListServersDetailsRequest) o;
        return Objects.equals(this.offset, listServersDetailsRequest.offset) &&
            Objects.equals(this.flavor, listServersDetailsRequest.flavor) &&
            Objects.equals(this.name, listServersDetailsRequest.name) &&
            Objects.equals(this.status, listServersDetailsRequest.status) &&
            Objects.equals(this.limit, listServersDetailsRequest.limit) &&
            Objects.equals(this.notTags, listServersDetailsRequest.notTags) &&
            Objects.equals(this.reservationId, listServersDetailsRequest.reservationId) &&
            Objects.equals(this.enterpriseProjectId, listServersDetailsRequest.enterpriseProjectId) &&
            Objects.equals(this.tags, listServersDetailsRequest.tags) &&
            Objects.equals(this.ip, listServersDetailsRequest.ip);
    }
    @Override
    public int hashCode() {
        return Objects.hash(offset, flavor, name, status, limit, notTags, reservationId, enterpriseProjectId, tags, ip);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListServersDetailsRequest {\n");
            sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
            sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    status: ").append(toIndentedString(status)).append("\n");
            sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
            sb.append("    notTags: ").append(toIndentedString(notTags)).append("\n");
            sb.append("    reservationId: ").append(toIndentedString(reservationId)).append("\n");
            sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
            sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
            sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
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

