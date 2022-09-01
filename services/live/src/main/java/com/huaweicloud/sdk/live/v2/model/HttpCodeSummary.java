package com.huaweicloud.sdk.live.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * HttpCodeSummary
 */
public class HttpCodeSummary {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "http_codes")

    @JacksonXmlProperty(localName = "http_codes")

    private List<HttpCode> httpCodes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time")

    @JacksonXmlProperty(localName = "time")

    private String time;

    public HttpCodeSummary withHttpCodes(List<HttpCode> httpCodes) {
        this.httpCodes = httpCodes;
        return this;
    }

    public HttpCodeSummary addHttpCodesItem(HttpCode httpCodesItem) {
        if (this.httpCodes == null) {
            this.httpCodes = new ArrayList<>();
        }
        this.httpCodes.add(httpCodesItem);
        return this;
    }

    public HttpCodeSummary withHttpCodes(Consumer<List<HttpCode>> httpCodesSetter) {
        if (this.httpCodes == null) {
            this.httpCodes = new ArrayList<>();
        }
        httpCodesSetter.accept(this.httpCodes);
        return this;
    }

    /**
     * 状态码信息
     * @return httpCodes
     */
    public List<HttpCode> getHttpCodes() {
        return httpCodes;
    }

    public void setHttpCodes(List<HttpCode> httpCodes) {
        this.httpCodes = httpCodes;
    }

    public HttpCodeSummary withTime(String time) {
        this.time = time;
        return this;
    }

    /**
     * 采样时间。日期格式按照ISO8601表示法，并使用UTC时间。 格式为：YYYY-MM-DDThh:mm:ssZ 。
     * @return time
     */
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HttpCodeSummary httpCodeSummary = (HttpCodeSummary) o;
        return Objects.equals(this.httpCodes, httpCodeSummary.httpCodes)
            && Objects.equals(this.time, httpCodeSummary.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(httpCodes, time);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HttpCodeSummary {\n");
        sb.append("    httpCodes: ").append(toIndentedString(httpCodes)).append("\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
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
