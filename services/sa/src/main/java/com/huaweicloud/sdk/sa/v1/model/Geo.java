package com.huaweicloud.sdk.sa.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * Geo
 */
public class Geo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "latitude")

    @JacksonXmlProperty(localName = "latitude")

    private BigDecimal latitude;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "longitude")

    @JacksonXmlProperty(localName = "longitude")

    private BigDecimal longitude;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "city_code")

    @JacksonXmlProperty(localName = "city_code")

    private String cityCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "country_code")

    @JacksonXmlProperty(localName = "country_code")

    private String countryCode;

    public Geo withLatitude(BigDecimal latitude) {
        this.latitude = latitude;
        return this;
    }

    /**
     * 纬度。
     * minimum: -9E+1
     * maximum: 9E+1
     * @return latitude
     */
    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    public Geo withLongitude(BigDecimal longitude) {
        this.longitude = longitude;
        return this;
    }

    /**
     * 经度。
     * minimum: -1.8E+2
     * maximum: 1.8E+2
     * @return longitude
     */
    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    public Geo withCityCode(String cityCode) {
        this.cityCode = cityCode;
        return this;
    }

    /**
     * 城市编码。
     * @return cityCode
     */
    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public Geo withCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    /**
     * 国家简码ISO 3166-1 alpha-2，例如：CN、US、DE、IT、SG。
     * @return countryCode
     */
    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Geo geo = (Geo) o;
        return Objects.equals(this.latitude, geo.latitude) && Objects.equals(this.longitude, geo.longitude)
            && Objects.equals(this.cityCode, geo.cityCode) && Objects.equals(this.countryCode, geo.countryCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(latitude, longitude, cityCode, countryCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Geo {\n");
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
