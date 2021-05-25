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
     * 页码。 当前页面数，默认为0。 取值大于等于0，取值为0时返回第1页
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
     * 查询返回边缘实例列表当前页面的数量。 每页默认值是25，最多返回1000台边缘实例的信息，如果数据量过大建议设置成100。
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
     * 边缘实例的状态。 取值范围：ACTIVE、BUILD、DELETED、ERROR、HARD_REBOOT、MIGRATING、PAUSED、REBOOT、REBUILD、RESIZE、REVERT_RESIZE、SHUTOFF、SHELVED、SHELVED_OFFLOADED、SOFT_DELETED、SUSPENDED、VERIFY_RESIZE。  非上面范围的status字段将返回空列表。 > 当边缘实例处于中间状态时，查询范围如下： - ACTIVE，查询范围：ACTIVE，REBOOT，HARD_REBOOT，REBUILD，MIGRATING - SHUTOFF，查询范围：SHUTOFF，RESIZE，REBUILD - ERROR，查询范围：ERROR，REBUILD - VERIFY_RESIZE，查询范围：VERIFY_RESIZE，REVERT_RESIZE
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
     * 查询条件，边缘实例名称。
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
     * 边缘实例所在大区。
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
     * 边缘实例所在省份。
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
     * 边缘实例所在城市。
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
     * 边缘业务ID。
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
     * 站点ID。
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

