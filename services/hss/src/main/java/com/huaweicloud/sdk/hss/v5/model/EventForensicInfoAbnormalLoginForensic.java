package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 异常登录取证信息 **取值范围**： 不涉及
 */
public class EventForensicInfoAbnormalLoginForensic {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip")

    private String ip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user")

    private String user;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "country")

    private String country;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_division")

    private String subDivision;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "city")

    private String city;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "city_id")

    private Integer cityId;

    public EventForensicInfoAbnormalLoginForensic withIp(String ip) {
        this.ip = ip;
        return this;
    }

    /**
     * **参数解释**： IP **取值范围**： 不涉及
     * @return ip
     */
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public EventForensicInfoAbnormalLoginForensic withUser(String user) {
        this.user = user;
        return this;
    }

    /**
     * **参数解释**： 用户 **取值范围**： 不涉及
     * @return user
     */
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public EventForensicInfoAbnormalLoginForensic withCountry(String country) {
        this.country = country;
        return this;
    }

    /**
     * **参数解释**： 国家 **取值范围**： 不涉及
     * @return country
     */
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public EventForensicInfoAbnormalLoginForensic withSubDivision(String subDivision) {
        this.subDivision = subDivision;
        return this;
    }

    /**
     * **参数解释**： 省份 **取值范围**： 不涉及
     * @return subDivision
     */
    public String getSubDivision() {
        return subDivision;
    }

    public void setSubDivision(String subDivision) {
        this.subDivision = subDivision;
    }

    public EventForensicInfoAbnormalLoginForensic withCity(String city) {
        this.city = city;
        return this;
    }

    /**
     * **参数解释**： 城市 **取值范围**： 不涉及
     * @return city
     */
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public EventForensicInfoAbnormalLoginForensic withCityId(Integer cityId) {
        this.cityId = cityId;
        return this;
    }

    /**
     * **参数解释**： 登录源（映射地名） **取值范围**： 不涉及
     * minimum: 1
     * maximum: 65535
     * @return cityId
     */
    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EventForensicInfoAbnormalLoginForensic that = (EventForensicInfoAbnormalLoginForensic) obj;
        return Objects.equals(this.ip, that.ip) && Objects.equals(this.user, that.user)
            && Objects.equals(this.country, that.country) && Objects.equals(this.subDivision, that.subDivision)
            && Objects.equals(this.city, that.city) && Objects.equals(this.cityId, that.cityId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ip, user, country, subDivision, city, cityId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EventForensicInfoAbnormalLoginForensic {\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    country: ").append(toIndentedString(country)).append("\n");
        sb.append("    subDivision: ").append(toIndentedString(subDivision)).append("\n");
        sb.append("    city: ").append(toIndentedString(city)).append("\n");
        sb.append("    cityId: ").append(toIndentedString(cityId)).append("\n");
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
