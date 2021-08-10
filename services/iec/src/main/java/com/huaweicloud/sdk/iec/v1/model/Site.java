package com.huaweicloud.sdk.iec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** 边缘站点对象类型 */
public class Site {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "city")

    private String city;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "i18n_city")

    private String i18nCity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "province")

    private String province;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "i18n_province")

    private String i18nProvince;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "area")

    private String area;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "i18n_area")

    private String i18nArea;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "country")

    private String country;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "i18n_country")

    private String i18nCountry;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pools")

    private List<IpPool> pools = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "city_short_name")

    private String cityShortName;

    public Site withId(String id) {
        this.id = id;
        return this;
    }

    /** 边缘站点ID。
     * 
     * @return id */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Site withName(String name) {
        this.name = name;
        return this;
    }

    /** 边缘站点名称。
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Site withCity(String city) {
        this.city = city;
        return this;
    }

    /** 站点所在城市。
     * 
     * @return city */
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Site withI18nCity(String i18nCity) {
        this.i18nCity = i18nCity;
        return this;
    }

    /** 城市的国际化名称。
     * 
     * @return i18nCity */
    public String getI18nCity() {
        return i18nCity;
    }

    public void setI18nCity(String i18nCity) {
        this.i18nCity = i18nCity;
    }

    public Site withProvince(String province) {
        this.province = province;
        return this;
    }

    /** 站点所在省份。
     * 
     * @return province */
    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public Site withI18nProvince(String i18nProvince) {
        this.i18nProvince = i18nProvince;
        return this;
    }

    /** 省份的国际化名称。
     * 
     * @return i18nProvince */
    public String getI18nProvince() {
        return i18nProvince;
    }

    public void setI18nProvince(String i18nProvince) {
        this.i18nProvince = i18nProvince;
    }

    public Site withArea(String area) {
        this.area = area;
        return this;
    }

    /** 所在大区。
     * 
     * @return area */
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Site withI18nArea(String i18nArea) {
        this.i18nArea = i18nArea;
        return this;
    }

    /** 大区的国际化名称。
     * 
     * @return i18nArea */
    public String getI18nArea() {
        return i18nArea;
    }

    public void setI18nArea(String i18nArea) {
        this.i18nArea = i18nArea;
    }

    public Site withCountry(String country) {
        this.country = country;
        return this;
    }

    /** 站点所在的国家。
     * 
     * @return country */
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Site withI18nCountry(String i18nCountry) {
        this.i18nCountry = i18nCountry;
        return this;
    }

    /** 国家的国际化名称。
     * 
     * @return i18nCountry */
    public String getI18nCountry() {
        return i18nCountry;
    }

    public void setI18nCountry(String i18nCountry) {
        this.i18nCountry = i18nCountry;
    }

    public Site withStatus(String status) {
        this.status = status;
        return this;
    }

    /** 站点当前的状态。 取值范围： - Normal(正常商用) - Obt(公测) - Gray(灰度) - Offline(下线) - Promotion(推荐，也是商用) - sellout(售罄)
     * 
     * @return status */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Site withPools(List<IpPool> pools) {
        this.pools = pools;
        return this;
    }

    public Site addPoolsItem(IpPool poolsItem) {
        if (this.pools == null) {
            this.pools = new ArrayList<>();
        }
        this.pools.add(poolsItem);
        return this;
    }

    public Site withPools(Consumer<List<IpPool>> poolsSetter) {
        if (this.pools == null) {
            this.pools = new ArrayList<>();
        }
        poolsSetter.accept(this.pools);
        return this;
    }

    /** 站点IP线路列表。
     * 
     * @return pools */
    public List<IpPool> getPools() {
        return pools;
    }

    public void setPools(List<IpPool> pools) {
        this.pools = pools;
    }

    public Site withCityShortName(String cityShortName) {
        this.cityShortName = cityShortName;
        return this;
    }

    /** 城市名称缩写。
     * 
     * @return cityShortName */
    public String getCityShortName() {
        return cityShortName;
    }

    public void setCityShortName(String cityShortName) {
        this.cityShortName = cityShortName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Site site = (Site) o;
        return Objects.equals(this.id, site.id) && Objects.equals(this.name, site.name)
            && Objects.equals(this.city, site.city) && Objects.equals(this.i18nCity, site.i18nCity)
            && Objects.equals(this.province, site.province) && Objects.equals(this.i18nProvince, site.i18nProvince)
            && Objects.equals(this.area, site.area) && Objects.equals(this.i18nArea, site.i18nArea)
            && Objects.equals(this.country, site.country) && Objects.equals(this.i18nCountry, site.i18nCountry)
            && Objects.equals(this.status, site.status) && Objects.equals(this.pools, site.pools)
            && Objects.equals(this.cityShortName, site.cityShortName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            city,
            i18nCity,
            province,
            i18nProvince,
            area,
            i18nArea,
            country,
            i18nCountry,
            status,
            pools,
            cityShortName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Site {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    city: ").append(toIndentedString(city)).append("\n");
        sb.append("    i18nCity: ").append(toIndentedString(i18nCity)).append("\n");
        sb.append("    province: ").append(toIndentedString(province)).append("\n");
        sb.append("    i18nProvince: ").append(toIndentedString(i18nProvince)).append("\n");
        sb.append("    area: ").append(toIndentedString(area)).append("\n");
        sb.append("    i18nArea: ").append(toIndentedString(i18nArea)).append("\n");
        sb.append("    country: ").append(toIndentedString(country)).append("\n");
        sb.append("    i18nCountry: ").append(toIndentedString(i18nCountry)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    pools: ").append(toIndentedString(pools)).append("\n");
        sb.append("    cityShortName: ").append(toIndentedString(cityShortName)).append("\n");
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
