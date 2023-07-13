package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 代理鉴权信息。
 */
public class ProxyTokenDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "accessToken")

    private String accessToken;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "longAccessToken")

    private String longAccessToken;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "validPeriod")

    private Long validPeriod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "middleEndUrl")

    private String middleEndUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "middleEndInnerUrl")

    private String middleEndInnerUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enableRerouting")

    private Boolean enableRerouting;

    public ProxyTokenDTO withAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }

    /**
     * 代理鉴权服务器的短token字符串。
     * @return accessToken
     */
    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public ProxyTokenDTO withLongAccessToken(String longAccessToken) {
        this.longAccessToken = longAccessToken;
        return this;
    }

    /**
     * 代理鉴权服务器的长token字符串。
     * @return longAccessToken
     */
    public String getLongAccessToken() {
        return longAccessToken;
    }

    public void setLongAccessToken(String longAccessToken) {
        this.longAccessToken = longAccessToken;
    }

    public ProxyTokenDTO withValidPeriod(Long validPeriod) {
        this.validPeriod = validPeriod;
        return this;
    }

    /**
     * Token有效时长，单位：秒。
     * @return validPeriod
     */
    public Long getValidPeriod() {
        return validPeriod;
    }

    public void setValidPeriod(Long validPeriod) {
        this.validPeriod = validPeriod;
    }

    public ProxyTokenDTO withMiddleEndUrl(String middleEndUrl) {
        this.middleEndUrl = middleEndUrl;
        return this;
    }

    /**
     * 中台地址。
     * @return middleEndUrl
     */
    public String getMiddleEndUrl() {
        return middleEndUrl;
    }

    public void setMiddleEndUrl(String middleEndUrl) {
        this.middleEndUrl = middleEndUrl;
    }

    public ProxyTokenDTO withMiddleEndInnerUrl(String middleEndInnerUrl) {
        this.middleEndInnerUrl = middleEndInnerUrl;
        return this;
    }

    /**
     * 中台内网地址。
     * @return middleEndInnerUrl
     */
    public String getMiddleEndInnerUrl() {
        return middleEndInnerUrl;
    }

    public void setMiddleEndInnerUrl(String middleEndInnerUrl) {
        this.middleEndInnerUrl = middleEndInnerUrl;
    }

    public ProxyTokenDTO withEnableRerouting(Boolean enableRerouting) {
        this.enableRerouting = enableRerouting;
        return this;
    }

    /**
     * 是否开启二次路由。
     * @return enableRerouting
     */
    public Boolean getEnableRerouting() {
        return enableRerouting;
    }

    public void setEnableRerouting(Boolean enableRerouting) {
        this.enableRerouting = enableRerouting;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProxyTokenDTO that = (ProxyTokenDTO) obj;
        return Objects.equals(this.accessToken, that.accessToken)
            && Objects.equals(this.longAccessToken, that.longAccessToken)
            && Objects.equals(this.validPeriod, that.validPeriod)
            && Objects.equals(this.middleEndUrl, that.middleEndUrl)
            && Objects.equals(this.middleEndInnerUrl, that.middleEndInnerUrl)
            && Objects.equals(this.enableRerouting, that.enableRerouting);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(accessToken, longAccessToken, validPeriod, middleEndUrl, middleEndInnerUrl, enableRerouting);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProxyTokenDTO {\n");
        sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
        sb.append("    longAccessToken: ").append(toIndentedString(longAccessToken)).append("\n");
        sb.append("    validPeriod: ").append(toIndentedString(validPeriod)).append("\n");
        sb.append("    middleEndUrl: ").append(toIndentedString(middleEndUrl)).append("\n");
        sb.append("    middleEndInnerUrl: ").append(toIndentedString(middleEndInnerUrl)).append("\n");
        sb.append("    enableRerouting: ").append(toIndentedString(enableRerouting)).append("\n");
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
