package com.huaweicloud.sdk.identitycenterstore.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * The full name of the user.
 */
public class NameDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "family_name")

    private String familyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "formatted")

    private String formatted;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "given_name")

    private String givenName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "honorific_prefix")

    private String honorificPrefix;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "honorific_suffix")

    private String honorificSuffix;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "middle_name")

    private String middleName;

    public NameDto withFamilyName(String familyName) {
        this.familyName = familyName;
        return this;
    }

    /**
     * 用户的姓氏
     * @return familyName
     */
    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public NameDto withFormatted(String formatted) {
        this.formatted = formatted;
        return this;
    }

    /**
     * 包含要显示的名称的格式化版本的字符串
     * @return formatted
     */
    public String getFormatted() {
        return formatted;
    }

    public void setFormatted(String formatted) {
        this.formatted = formatted;
    }

    public NameDto withGivenName(String givenName) {
        this.givenName = givenName;
        return this;
    }

    /**
     * 用户的名字
     * @return givenName
     */
    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public NameDto withHonorificPrefix(String honorificPrefix) {
        this.honorificPrefix = honorificPrefix;
        return this;
    }

    /**
     * 用户的尊称前缀
     * @return honorificPrefix
     */
    public String getHonorificPrefix() {
        return honorificPrefix;
    }

    public void setHonorificPrefix(String honorificPrefix) {
        this.honorificPrefix = honorificPrefix;
    }

    public NameDto withHonorificSuffix(String honorificSuffix) {
        this.honorificSuffix = honorificSuffix;
        return this;
    }

    /**
     * 用户的尊称后缀
     * @return honorificSuffix
     */
    public String getHonorificSuffix() {
        return honorificSuffix;
    }

    public void setHonorificSuffix(String honorificSuffix) {
        this.honorificSuffix = honorificSuffix;
    }

    public NameDto withMiddleName(String middleName) {
        this.middleName = middleName;
        return this;
    }

    /**
     * 用户的中间名
     * @return middleName
     */
    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NameDto that = (NameDto) obj;
        return Objects.equals(this.familyName, that.familyName) && Objects.equals(this.formatted, that.formatted)
            && Objects.equals(this.givenName, that.givenName)
            && Objects.equals(this.honorificPrefix, that.honorificPrefix)
            && Objects.equals(this.honorificSuffix, that.honorificSuffix)
            && Objects.equals(this.middleName, that.middleName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(familyName, formatted, givenName, honorificPrefix, honorificSuffix, middleName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NameDto {\n");
        sb.append("    familyName: ").append(toIndentedString(familyName)).append("\n");
        sb.append("    formatted: ").append(toIndentedString(formatted)).append("\n");
        sb.append("    givenName: ").append(toIndentedString(givenName)).append("\n");
        sb.append("    honorificPrefix: ").append(toIndentedString(honorificPrefix)).append("\n");
        sb.append("    honorificSuffix: ").append(toIndentedString(honorificSuffix)).append("\n");
        sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
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
