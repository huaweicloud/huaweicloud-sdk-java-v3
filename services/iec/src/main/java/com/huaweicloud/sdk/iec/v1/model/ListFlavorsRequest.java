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
public class ListFlavorsRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="offset")
    
    private Integer offset;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit;


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
    @JsonProperty(value="operator")
    
    private String operator;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="site_ids")
    
    private String siteIds;

    public ListFlavorsRequest withOffset(Integer offset) {
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

    

    public ListFlavorsRequest withLimit(Integer limit) {
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

    

    public ListFlavorsRequest withName(String name) {
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

    

    public ListFlavorsRequest withArea(String area) {
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

    

    public ListFlavorsRequest withProvince(String province) {
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

    

    public ListFlavorsRequest withCity(String city) {
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

    

    public ListFlavorsRequest withOperator(String operator) {
        this.operator = operator;
        return this;
    }

    


    /**
     * Get operator
     * @return operator
     */
    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    

    public ListFlavorsRequest withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * Get id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public ListFlavorsRequest withSiteIds(String siteIds) {
        this.siteIds = siteIds;
        return this;
    }

    


    /**
     * Get siteIds
     * @return siteIds
     */
    public String getSiteIds() {
        return siteIds;
    }

    public void setSiteIds(String siteIds) {
        this.siteIds = siteIds;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListFlavorsRequest listFlavorsRequest = (ListFlavorsRequest) o;
        return Objects.equals(this.offset, listFlavorsRequest.offset) &&
            Objects.equals(this.limit, listFlavorsRequest.limit) &&
            Objects.equals(this.name, listFlavorsRequest.name) &&
            Objects.equals(this.area, listFlavorsRequest.area) &&
            Objects.equals(this.province, listFlavorsRequest.province) &&
            Objects.equals(this.city, listFlavorsRequest.city) &&
            Objects.equals(this.operator, listFlavorsRequest.operator) &&
            Objects.equals(this.id, listFlavorsRequest.id) &&
            Objects.equals(this.siteIds, listFlavorsRequest.siteIds);
    }
    @Override
    public int hashCode() {
        return Objects.hash(offset, limit, name, area, province, city, operator, id, siteIds);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFlavorsRequest {\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    area: ").append(toIndentedString(area)).append("\n");
        sb.append("    province: ").append(toIndentedString(province)).append("\n");
        sb.append("    city: ").append(toIndentedString(city)).append("\n");
        sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    siteIds: ").append(toIndentedString(siteIds)).append("\n");
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

