package com.huaweicloud.sdk.lakeformation.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 接入信息
 */
public class AccessInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpcep_service_name")

    private String vpcepServiceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain")

    private String domain;

    public AccessInfo withVpcepServiceName(String vpcepServiceName) {
        this.vpcepServiceName = vpcepServiceName;
        return this;
    }

    /**
     * 服务名称
     * @return vpcepServiceName
     */
    public String getVpcepServiceName() {
        return vpcepServiceName;
    }

    public void setVpcepServiceName(String vpcepServiceName) {
        this.vpcepServiceName = vpcepServiceName;
    }

    public AccessInfo withDomain(String domain) {
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AccessInfo accessInfo = (AccessInfo) o;
        return Objects.equals(this.vpcepServiceName, accessInfo.vpcepServiceName)
            && Objects.equals(this.domain, accessInfo.domain);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vpcepServiceName, domain);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccessInfo {\n");
        sb.append("    vpcepServiceName: ").append(toIndentedString(vpcepServiceName)).append("\n");
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
