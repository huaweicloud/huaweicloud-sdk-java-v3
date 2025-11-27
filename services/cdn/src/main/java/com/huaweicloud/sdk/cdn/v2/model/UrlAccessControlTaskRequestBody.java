package com.huaweicloud.sdk.cdn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 需要解禁或封禁的URL信息
 */
public class UrlAccessControlTaskRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_control_urls")

    private AccessControlUrls accessControlUrls;

    public UrlAccessControlTaskRequestBody withAccessControlUrls(AccessControlUrls accessControlUrls) {
        this.accessControlUrls = accessControlUrls;
        return this;
    }

    public UrlAccessControlTaskRequestBody withAccessControlUrls(Consumer<AccessControlUrls> accessControlUrlsSetter) {
        if (this.accessControlUrls == null) {
            this.accessControlUrls = new AccessControlUrls();
            accessControlUrlsSetter.accept(this.accessControlUrls);
        }

        return this;
    }

    /**
     * Get accessControlUrls
     * @return accessControlUrls
     */
    public AccessControlUrls getAccessControlUrls() {
        return accessControlUrls;
    }

    public void setAccessControlUrls(AccessControlUrls accessControlUrls) {
        this.accessControlUrls = accessControlUrls;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UrlAccessControlTaskRequestBody that = (UrlAccessControlTaskRequestBody) obj;
        return Objects.equals(this.accessControlUrls, that.accessControlUrls);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessControlUrls);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UrlAccessControlTaskRequestBody {\n");
        sb.append("    accessControlUrls: ").append(toIndentedString(accessControlUrls)).append("\n");
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
