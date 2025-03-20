package com.huaweicloud.sdk.scm.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * FaiureResource
 */
public class FaiureResource {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource")

    private String resource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failure_info")

    private String failureInfo;

    public FaiureResource withResource(String resource) {
        this.resource = resource;
        return this;
    }

    /**
     * 部署失败的资源信息，部署WAF与ELB时，此字段为资源ID，部署CDN时，本字段为加速域名。
     * @return resource
     */
    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public FaiureResource withFailureInfo(String failureInfo) {
        this.failureInfo = failureInfo;
        return this;
    }

    /**
     * 失败原因，一般为目标服务返回的错误码信息。
     * @return failureInfo
     */
    public String getFailureInfo() {
        return failureInfo;
    }

    public void setFailureInfo(String failureInfo) {
        this.failureInfo = failureInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FaiureResource that = (FaiureResource) obj;
        return Objects.equals(this.resource, that.resource) && Objects.equals(this.failureInfo, that.failureInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resource, failureInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FaiureResource {\n");
        sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
        sb.append("    failureInfo: ").append(toIndentedString(failureInfo)).append("\n");
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
