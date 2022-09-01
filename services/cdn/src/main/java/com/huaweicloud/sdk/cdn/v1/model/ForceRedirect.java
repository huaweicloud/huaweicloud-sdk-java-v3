package com.huaweicloud.sdk.cdn.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * ForceRedirect
 */
public class ForceRedirect {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "switch")

    @JacksonXmlProperty(localName = "switch")

    private Integer _switch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "redirect_type")

    @JacksonXmlProperty(localName = "redirect_type")

    private String redirectType;

    public ForceRedirect withSwitch(Integer _switch) {
        this._switch = _switch;
        return this;
    }

    /**
     * 强制跳转开关。1打开。0关闭。
     * @return _switch
     */
    public Integer getSwitch() {
        return _switch;
    }

    public void setSwitch(Integer _switch) {
        this._switch = _switch;
    }

    public ForceRedirect withRedirectType(String redirectType) {
        this.redirectType = redirectType;
        return this;
    }

    /**
     * 强制跳转类型。http：强制跳转HTTP。https：强制跳转HTTPS。
     * @return redirectType
     */
    public String getRedirectType() {
        return redirectType;
    }

    public void setRedirectType(String redirectType) {
        this.redirectType = redirectType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ForceRedirect forceRedirect = (ForceRedirect) o;
        return Objects.equals(this._switch, forceRedirect._switch)
            && Objects.equals(this.redirectType, forceRedirect.redirectType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(_switch, redirectType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ForceRedirect {\n");
        sb.append("    _switch: ").append(toIndentedString(_switch)).append("\n");
        sb.append("    redirectType: ").append(toIndentedString(redirectType)).append("\n");
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
