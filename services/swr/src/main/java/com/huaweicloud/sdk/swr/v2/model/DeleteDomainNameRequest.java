package com.huaweicloud.sdk.swr.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteDomainNameRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domainname_id")

    private String domainnameId;

    public DeleteDomainNameRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 企业仓库实例ID
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public DeleteDomainNameRequest withDomainnameId(String domainnameId) {
        this.domainnameId = domainnameId;
        return this;
    }

    /**
     * 域名ID
     * @return domainnameId
     */
    public String getDomainnameId() {
        return domainnameId;
    }

    public void setDomainnameId(String domainnameId) {
        this.domainnameId = domainnameId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteDomainNameRequest that = (DeleteDomainNameRequest) obj;
        return Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.domainnameId, that.domainnameId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, domainnameId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteDomainNameRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    domainnameId: ").append(toIndentedString(domainnameId)).append("\n");
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
