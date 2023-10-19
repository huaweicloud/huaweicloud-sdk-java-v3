package com.huaweicloud.sdk.lakeformation.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 创建接入连接的请求信息
 */
public class AccessConnectionRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpcep_id")

    private String vpcepId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpcep_service_name")

    private String vpcepServiceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain")

    private String domain;

    public AccessConnectionRequestBody withVpcepId(String vpcepId) {
        this.vpcepId = vpcepId;
        return this;
    }

    /**
     * 虚拟私有云终端节点ID。在 接入管理-创建客户端-前往VPC创建-VPC终端节点 创建和查看。
     * @return vpcepId
     */
    public String getVpcepId() {
        return vpcepId;
    }

    public void setVpcepId(String vpcepId) {
        this.vpcepId = vpcepId;
    }

    public AccessConnectionRequestBody withVpcepServiceName(String vpcepServiceName) {
        this.vpcepServiceName = vpcepServiceName;
        return this;
    }

    /**
     * 终端节点服务名称。最大长度为64个字符。
     * @return vpcepServiceName
     */
    public String getVpcepServiceName() {
        return vpcepServiceName;
    }

    public void setVpcepServiceName(String vpcepServiceName) {
        this.vpcepServiceName = vpcepServiceName;
    }

    public AccessConnectionRequestBody withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * 接入域名，通过IP接入访问Lakeformation API时，需在请求头中添加HOST参数并传入该域名。
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
        AccessConnectionRequestBody that = (AccessConnectionRequestBody) obj;
        return Objects.equals(this.vpcepId, that.vpcepId)
            && Objects.equals(this.vpcepServiceName, that.vpcepServiceName) && Objects.equals(this.domain, that.domain);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vpcepId, vpcepServiceName, domain);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccessConnectionRequestBody {\n");
        sb.append("    vpcepId: ").append(toIndentedString(vpcepId)).append("\n");
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
