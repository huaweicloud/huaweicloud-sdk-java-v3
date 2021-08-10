package com.huaweicloud.sdk.iec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Request Object */
public class ListFlavorsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "area")

    private String area;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "province")

    private String province;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "city")

    private String city;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operator")

    private String operator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "site_ids")

    private String siteIds;

    public ListFlavorsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /** 页码。 当前页面数，默认为1。 取值大于等于0，取值为0时返回第1页。
     * 
     * @return offset */
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

    /** 查询返回边缘实例规格列表当前页面的数量 。 取值范围：0~1000。
     * 
     * @return limit */
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

    /** 查询条件，规格的名称。
     * 
     * @return name */
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

    /** 边缘规格所在大区。 大小写通用，皆支持。 支持多个查询，中间使用“,”分隔。
     * 
     * @return area */
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

    /** 边缘规格所在省份。 大小写通用，皆支持。 支持多个查询，中间使用“,”分隔。
     * 
     * @return province */
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

    /** 边缘规格所在城市。 大小写通用，皆支持。 支持多个查询，中间使用“,”分隔。
     * 
     * @return city */
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

    /** 边缘规格支持运营商。 大小写通用，皆支持。 支持多个查询，中间使用“,”分隔。
     * 
     * @return operator */
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

    /** 查询条件，规格的ID。
     * 
     * @return id */
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

    /** 查询条件，边缘规格站点列表，站点之间用“,”分隔。
     * 
     * @return siteIds */
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
        return Objects.equals(this.offset, listFlavorsRequest.offset)
            && Objects.equals(this.limit, listFlavorsRequest.limit)
            && Objects.equals(this.name, listFlavorsRequest.name) && Objects.equals(this.area, listFlavorsRequest.area)
            && Objects.equals(this.province, listFlavorsRequest.province)
            && Objects.equals(this.city, listFlavorsRequest.city)
            && Objects.equals(this.operator, listFlavorsRequest.operator)
            && Objects.equals(this.id, listFlavorsRequest.id)
            && Objects.equals(this.siteIds, listFlavorsRequest.siteIds);
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

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
