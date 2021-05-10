package com.huaweicloud.sdk.iec.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ListInstancesRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="offset")
    
    private Integer offset;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private String status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="area")
    
    private String area;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="province")
    
    private String province;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="city")
    
    private String city;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="edgecloud_id")
    
    private String edgecloudId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="site_id")
    
    private String siteId;

    public ListInstancesRequest withOffset(Integer offset) {
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

    

    public ListInstancesRequest withLimit(Integer limit) {
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

    

    public ListInstancesRequest withStatus(String status) {
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

    

    public ListInstancesRequest withName(String name) {
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

    

    public ListInstancesRequest withArea(String area) {
        this.area = area;
        return this;
    }

    


    /**
     * Get area
     * @return area
     */
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    

    public ListInstancesRequest withProvince(String province) {
        this.province = province;
        return this;
    }

    


    /**
     * Get province
     * @return province
     */
    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    

    public ListInstancesRequest withCity(String city) {
        this.city = city;
        return this;
    }

    


    /**
     * Get city
     * @return city
     */
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    

    public ListInstancesRequest withEdgecloudId(String edgecloudId) {
        this.edgecloudId = edgecloudId;
        return this;
    }

    


    /**
     * Get edgecloudId
     * @return edgecloudId
     */
    public String getEdgecloudId() {
        return edgecloudId;
    }

    public void setEdgecloudId(String edgecloudId) {
        this.edgecloudId = edgecloudId;
    }

    

    public ListInstancesRequest withSiteId(String siteId) {
        this.siteId = siteId;
        return this;
    }

    


    /**
     * Get siteId
     * @return siteId
     */
    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListInstancesRequest listInstancesRequest = (ListInstancesRequest) o;
        return Objects.equals(this.offset, listInstancesRequest.offset) &&
            Objects.equals(this.limit, listInstancesRequest.limit) &&
            Objects.equals(this.status, listInstancesRequest.status) &&
            Objects.equals(this.name, listInstancesRequest.name) &&
            Objects.equals(this.area, listInstancesRequest.area) &&
            Objects.equals(this.province, listInstancesRequest.province) &&
            Objects.equals(this.city, listInstancesRequest.city) &&
            Objects.equals(this.edgecloudId, listInstancesRequest.edgecloudId) &&
            Objects.equals(this.siteId, listInstancesRequest.siteId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(offset, limit, status, name, area, province, city, edgecloudId, siteId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInstancesRequest {\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    area: ").append(toIndentedString(area)).append("\n");
        sb.append("    province: ").append(toIndentedString(province)).append("\n");
        sb.append("    city: ").append(toIndentedString(city)).append("\n");
        sb.append("    edgecloudId: ").append(toIndentedString(edgecloudId)).append("\n");
        sb.append("    siteId: ").append(toIndentedString(siteId)).append("\n");
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

