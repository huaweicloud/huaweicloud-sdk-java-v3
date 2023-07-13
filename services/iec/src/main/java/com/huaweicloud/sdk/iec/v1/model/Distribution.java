package com.huaweicloud.sdk.iec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 实例分布对象
 */
public class Distribution {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "area")

    private String area;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "city")

    private String city;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operator")

    private String operator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "province")

    private String province;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "site_id")

    private String siteId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pool_id")

    private String poolId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stack_count")

    private Integer stackCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "city_short_name")

    private String cityShortName;

    public Distribution withArea(String area) {
        this.area = area;
        return this;
    }

    /**
     * 所在大区名称。
     * @return area
     */
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Distribution withCity(String city) {
        this.city = city;
        return this;
    }

    /**
     * 所在城市名称。
     * @return city
     */
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Distribution withOperator(String operator) {
        this.operator = operator;
        return this;
    }

    /**
     * 所属运营商名称。
     * @return operator
     */
    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public Distribution withProvince(String province) {
        this.province = province;
        return this;
    }

    /**
     * 所属省份名称。
     * @return province
     */
    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public Distribution withSiteId(String siteId) {
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

    public Distribution withPoolId(String poolId) {
        this.poolId = poolId;
        return this;
    }

    /**
     * 线路ID。多线路场景下，将在该线路下创建弹性公网IP。
     * @return poolId
     */
    public String getPoolId() {
        return poolId;
    }

    public void setPoolId(String poolId) {
        this.poolId = poolId;
    }

    public Distribution withStackCount(Integer stackCount) {
        this.stackCount = stackCount;
        return this;
    }

    /**
     * 资源组配置模板数目
     * @return stackCount
     */
    public Integer getStackCount() {
        return stackCount;
    }

    public void setStackCount(Integer stackCount) {
        this.stackCount = stackCount;
    }

    public Distribution withCityShortName(String cityShortName) {
        this.cityShortName = cityShortName;
        return this;
    }

    /**
     * 城市简称。
     * @return cityShortName
     */
    public String getCityShortName() {
        return cityShortName;
    }

    public void setCityShortName(String cityShortName) {
        this.cityShortName = cityShortName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Distribution that = (Distribution) obj;
        return Objects.equals(this.area, that.area) && Objects.equals(this.city, that.city)
            && Objects.equals(this.operator, that.operator) && Objects.equals(this.province, that.province)
            && Objects.equals(this.siteId, that.siteId) && Objects.equals(this.poolId, that.poolId)
            && Objects.equals(this.stackCount, that.stackCount)
            && Objects.equals(this.cityShortName, that.cityShortName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(area, city, operator, province, siteId, poolId, stackCount, cityShortName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Distribution {\n");
        sb.append("    area: ").append(toIndentedString(area)).append("\n");
        sb.append("    city: ").append(toIndentedString(city)).append("\n");
        sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
        sb.append("    province: ").append(toIndentedString(province)).append("\n");
        sb.append("    siteId: ").append(toIndentedString(siteId)).append("\n");
        sb.append("    poolId: ").append(toIndentedString(poolId)).append("\n");
        sb.append("    stackCount: ").append(toIndentedString(stackCount)).append("\n");
        sb.append("    cityShortName: ").append(toIndentedString(cityShortName)).append("\n");
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
