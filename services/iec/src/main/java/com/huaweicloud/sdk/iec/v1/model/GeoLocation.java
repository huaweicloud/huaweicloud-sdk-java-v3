package com.huaweicloud.sdk.iec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 
 */
public class GeoLocation {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "area")

    private String area;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "city")

    private String city;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "country")

    private String country;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "i18n_area")

    private String i18nArea;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "i18n_city")

    private String i18nCity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "i18n_country")

    private String i18nCountry;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "i18n_province")

    private String i18nProvince;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "province")

    private String province;

    public GeoLocation withId(String id) {
        this.id = id;
        return this;
    }

    /** 地理位置信息ID。
     * 
     * @return id */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public GeoLocation withArea(String area) {
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

    public GeoLocation withCity(String city) {
        this.city = city;
        return this;
    }

    /** 所在城市。
     * 
     * @return city */
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public GeoLocation withCountry(String country) {
        this.country = country;
        return this;
    }

    /** 所在的国家。
     * 
     * @return country */
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public GeoLocation withI18nArea(String i18nArea) {
        this.i18nArea = i18nArea;
        return this;
    }

    /** 区域的国际化名称。
     * 
     * @return i18nArea */
    public String getI18nArea() {
        return i18nArea;
    }

    public void setI18nArea(String i18nArea) {
        this.i18nArea = i18nArea;
    }

    public GeoLocation withI18nCity(String i18nCity) {
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

    public GeoLocation withI18nCountry(String i18nCountry) {
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

    public GeoLocation withI18nProvince(String i18nProvince) {
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

    public GeoLocation withProvince(String province) {
        this.province = province;
        return this;
    }

    /** 所在省份。
     * 
     * @return province */
    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GeoLocation geoLocation = (GeoLocation) o;
        return Objects.equals(this.id, geoLocation.id) && Objects.equals(this.area, geoLocation.area)
            && Objects.equals(this.city, geoLocation.city) && Objects.equals(this.country, geoLocation.country)
            && Objects.equals(this.i18nArea, geoLocation.i18nArea)
            && Objects.equals(this.i18nCity, geoLocation.i18nCity)
            && Objects.equals(this.i18nCountry, geoLocation.i18nCountry)
            && Objects.equals(this.i18nProvince, geoLocation.i18nProvince)
            && Objects.equals(this.province, geoLocation.province);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, area, city, country, i18nArea, i18nCity, i18nCountry, i18nProvince, province);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GeoLocation {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    area: ").append(toIndentedString(area)).append("\n");
        sb.append("    city: ").append(toIndentedString(city)).append("\n");
        sb.append("    country: ").append(toIndentedString(country)).append("\n");
        sb.append("    i18nArea: ").append(toIndentedString(i18nArea)).append("\n");
        sb.append("    i18nCity: ").append(toIndentedString(i18nCity)).append("\n");
        sb.append("    i18nCountry: ").append(toIndentedString(i18nCountry)).append("\n");
        sb.append("    i18nProvince: ").append(toIndentedString(i18nProvince)).append("\n");
        sb.append("    province: ").append(toIndentedString(province)).append("\n");
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
