package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** AntiTamperRuleResponseBody */
public class AntiTamperRuleResponseBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hostname")

    private String hostname;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public AntiTamperRuleResponseBody withId(String id) {
        this.id = id;
        return this;
    }

    /** 规则id
     * 
     * @return id */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AntiTamperRuleResponseBody withHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }

    /** 防篡改的域名
     * 
     * @return hostname */
    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public AntiTamperRuleResponseBody withUrl(String url) {
        this.url = url;
        return this;
    }

    /** 防篡改的url
     * 
     * @return url */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public AntiTamperRuleResponseBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /** 创建规则的时间戳
     * 
     * @return description */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AntiTamperRuleResponseBody antiTamperRuleResponseBody = (AntiTamperRuleResponseBody) o;
        return Objects.equals(this.id, antiTamperRuleResponseBody.id)
            && Objects.equals(this.hostname, antiTamperRuleResponseBody.hostname)
            && Objects.equals(this.url, antiTamperRuleResponseBody.url)
            && Objects.equals(this.description, antiTamperRuleResponseBody.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, hostname, url, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AntiTamperRuleResponseBody {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
