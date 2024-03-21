package com.huaweicloud.sdk.live.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteOttChannelInfoRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Access-Control-Allow-Internal")

    private String accessControlAllowInternal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Access-Control-Allow-External")

    private String accessControlAllowExternal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain")

    private String domain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_name")

    private String appName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    public DeleteOttChannelInfoRequest withAccessControlAllowInternal(String accessControlAllowInternal) {
        this.accessControlAllowInternal = accessControlAllowInternal;
        return this;
    }

    /**
     * 服务鉴权Token，服务开启鉴权，必须携带Access-Control-Allow-Internal访问服务。
     * @return accessControlAllowInternal
     */
    public String getAccessControlAllowInternal() {
        return accessControlAllowInternal;
    }

    public void setAccessControlAllowInternal(String accessControlAllowInternal) {
        this.accessControlAllowInternal = accessControlAllowInternal;
    }

    public DeleteOttChannelInfoRequest withAccessControlAllowExternal(String accessControlAllowExternal) {
        this.accessControlAllowExternal = accessControlAllowExternal;
        return this;
    }

    /**
     * 服务鉴权Token，服务开启鉴权，必须携带Access-Control-Allow-External访问服务。
     * @return accessControlAllowExternal
     */
    public String getAccessControlAllowExternal() {
        return accessControlAllowExternal;
    }

    public void setAccessControlAllowExternal(String accessControlAllowExternal) {
        this.accessControlAllowExternal = accessControlAllowExternal;
    }

    public DeleteOttChannelInfoRequest withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * 推流域名
     * @return domain
     */
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public DeleteOttChannelInfoRequest withAppName(String appName) {
        this.appName = appName;
        return this;
    }

    /**
     * 组名或应用名
     * @return appName
     */
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public DeleteOttChannelInfoRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 频道ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteOttChannelInfoRequest that = (DeleteOttChannelInfoRequest) obj;
        return Objects.equals(this.accessControlAllowInternal, that.accessControlAllowInternal)
            && Objects.equals(this.accessControlAllowExternal, that.accessControlAllowExternal)
            && Objects.equals(this.domain, that.domain) && Objects.equals(this.appName, that.appName)
            && Objects.equals(this.id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessControlAllowInternal, accessControlAllowExternal, domain, appName, id);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteOttChannelInfoRequest {\n");
        sb.append("    accessControlAllowInternal: ").append(toIndentedString(accessControlAllowInternal)).append("\n");
        sb.append("    accessControlAllowExternal: ").append(toIndentedString(accessControlAllowExternal)).append("\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
