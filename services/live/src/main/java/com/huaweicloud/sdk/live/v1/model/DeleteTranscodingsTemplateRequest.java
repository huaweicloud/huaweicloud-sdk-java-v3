package com.huaweicloud.sdk.live.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Request Object */
public class DeleteTranscodingsTemplateRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain")

    private String domain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_name")

    private String appName;

    public DeleteTranscodingsTemplateRequest withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /** 推流域名
     * 
     * @return domain */
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public DeleteTranscodingsTemplateRequest withAppName(String appName) {
        this.appName = appName;
        return this;
    }

    /** 应用名称
     * 
     * @return appName */
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteTranscodingsTemplateRequest deleteTranscodingsTemplateRequest = (DeleteTranscodingsTemplateRequest) o;
        return Objects.equals(this.domain, deleteTranscodingsTemplateRequest.domain)
            && Objects.equals(this.appName, deleteTranscodingsTemplateRequest.appName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domain, appName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteTranscodingsTemplateRequest {\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
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
