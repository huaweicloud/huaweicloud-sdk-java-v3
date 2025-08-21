package com.huaweicloud.sdk.dcos.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 客户电话号码
 */
public class UserPhone {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "country_code")

    private String countryCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phone")

    private String phone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_option")

    private Boolean defaultOption;

    public UserPhone withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 唯一标识
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UserPhone withCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    /**
     * 国家码
     * @return countryCode
     */
    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public UserPhone withPhone(String phone) {
        this.phone = phone;
        return this;
    }

    /**
     * 电话号码
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public UserPhone withDefaultOption(Boolean defaultOption) {
        this.defaultOption = defaultOption;
        return this;
    }

    /**
     * 是否默认
     * @return defaultOption
     */
    public Boolean getDefaultOption() {
        return defaultOption;
    }

    public void setDefaultOption(Boolean defaultOption) {
        this.defaultOption = defaultOption;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UserPhone that = (UserPhone) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.countryCode, that.countryCode)
            && Objects.equals(this.phone, that.phone) && Objects.equals(this.defaultOption, that.defaultOption);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, countryCode, phone, defaultOption);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserPhone {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
        sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
        sb.append("    defaultOption: ").append(toIndentedString(defaultOption)).append("\n");
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
