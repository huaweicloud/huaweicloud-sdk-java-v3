package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 线下机房数据中心
 */
public class OcaIpDataCenter {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "latitude")

    private Float latitude;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "longitude")

    private Float longitude;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "city_code")

    private String cityCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "country_code")

    private String countryCode;

    public OcaIpDataCenter withLatitude(Float latitude) {
        this.latitude = latitude;
        return this;
    }

    /**
     * 纬度
     * minimum: 0
     * maximum: 1E+2
     * @return latitude
     */
    public Float getLatitude() {
        return latitude;
    }

    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }

    public OcaIpDataCenter withLongitude(Float longitude) {
        this.longitude = longitude;
        return this;
    }

    /**
     * 经度
     * minimum: 0
     * maximum: 1E+2
     * @return longitude
     */
    public Float getLongitude() {
        return longitude;
    }

    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }

    public OcaIpDataCenter withCityCode(String cityCode) {
        this.cityCode = cityCode;
        return this;
    }

    /**
     * 城市编码
     * @return cityCode
     */
    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public OcaIpDataCenter withCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    /**
     * 国家编码
     * @return countryCode
     */
    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OcaIpDataCenter that = (OcaIpDataCenter) obj;
        return Objects.equals(this.latitude, that.latitude) && Objects.equals(this.longitude, that.longitude)
            && Objects.equals(this.cityCode, that.cityCode) && Objects.equals(this.countryCode, that.countryCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(latitude, longitude, cityCode, countryCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OcaIpDataCenter {\n");
        sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
        sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
        sb.append("    cityCode: ").append(toIndentedString(cityCode)).append("\n");
        sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
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
