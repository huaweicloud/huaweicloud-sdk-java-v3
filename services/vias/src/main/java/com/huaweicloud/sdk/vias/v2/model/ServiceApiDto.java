package com.huaweicloud.sdk.vias.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ServiceApiDto
 */
public class ServiceApiDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_type")

    private String requestType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "zh")

    private String zh;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "en")

    private String en;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_url")

    private String requestUrl;

    public ServiceApiDto withRequestType(String requestType) {
        this.requestType = requestType;
        return this;
    }

    /**
     * 请求类型，get, post
     * @return requestType
     */
    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public ServiceApiDto withZh(String zh) {
        this.zh = zh;
        return this;
    }

    /**
     * 中文描述
     * @return zh
     */
    public String getZh() {
        return zh;
    }

    public void setZh(String zh) {
        this.zh = zh;
    }

    public ServiceApiDto withEn(String en) {
        this.en = en;
        return this;
    }

    /**
     * 英文描述
     * @return en
     */
    public String getEn() {
        return en;
    }

    public void setEn(String en) {
        this.en = en;
    }

    public ServiceApiDto withRequestUrl(String requestUrl) {
        this.requestUrl = requestUrl;
        return this;
    }

    /**
     * 请求url
     * @return requestUrl
     */
    public String getRequestUrl() {
        return requestUrl;
    }

    public void setRequestUrl(String requestUrl) {
        this.requestUrl = requestUrl;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ServiceApiDto that = (ServiceApiDto) obj;
        return Objects.equals(this.requestType, that.requestType) && Objects.equals(this.zh, that.zh)
            && Objects.equals(this.en, that.en) && Objects.equals(this.requestUrl, that.requestUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestType, zh, en, requestUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServiceApiDto {\n");
        sb.append("    requestType: ").append(toIndentedString(requestType)).append("\n");
        sb.append("    zh: ").append(toIndentedString(zh)).append("\n");
        sb.append("    en: ").append(toIndentedString(en)).append("\n");
        sb.append("    requestUrl: ").append(toIndentedString(requestUrl)).append("\n");
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
