package com.huaweicloud.sdk.lakeformation.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 申请接入服务的请求信息
 */
public class AccessRequestInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpcep_id")

    private String vpcepId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain")

    private String domain;

    public AccessRequestInfo withVpcepId(String vpcepId) {
        this.vpcepId = vpcepId;
        return this;
    }

    /**
     * 服务创建的id
     * @return vpcepId
     */
    public String getVpcepId() {
        return vpcepId;
    }

    public void setVpcepId(String vpcepId) {
        this.vpcepId = vpcepId;
    }

    public AccessRequestInfo withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * 分组独立域名
     * @return domain
     */
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AccessRequestInfo that = (AccessRequestInfo) obj;
        return Objects.equals(this.vpcepId, that.vpcepId) && Objects.equals(this.domain, that.domain);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vpcepId, domain);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccessRequestInfo {\n");
        sb.append("    vpcepId: ").append(toIndentedString(vpcepId)).append("\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
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
