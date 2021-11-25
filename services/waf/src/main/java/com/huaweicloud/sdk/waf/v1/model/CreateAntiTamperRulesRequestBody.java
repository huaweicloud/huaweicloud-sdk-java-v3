package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** CreateAntiTamperRulesRequestBody */
public class CreateAntiTamperRulesRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hostname")

    private String hostname;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public CreateAntiTamperRulesRequestBody withHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }

    /** 防护网站，查询云模式防护域名列表（ListHost）接口获取防护域名，响应体中的的hostname字段
     * 
     * @return hostname */
    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public CreateAntiTamperRulesRequestBody withUrl(String url) {
        this.url = url;
        return this;
    }

    /** 防篡改规则防护的url，需要填写标准的url格式，例如/admin/xxx或者/admin/_*,以\"*\"号结尾代表路径前缀
     * 
     * @return url */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public CreateAntiTamperRulesRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /** 规则描述
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
        CreateAntiTamperRulesRequestBody createAntiTamperRulesRequestBody = (CreateAntiTamperRulesRequestBody) o;
        return Objects.equals(this.hostname, createAntiTamperRulesRequestBody.hostname)
            && Objects.equals(this.url, createAntiTamperRulesRequestBody.url)
            && Objects.equals(this.description, createAntiTamperRulesRequestBody.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hostname, url, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAntiTamperRulesRequestBody {\n");
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
