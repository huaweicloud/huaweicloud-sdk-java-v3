package com.huaweicloud.sdk.scm.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ListDeployedResourcesRequestBody
 */
public class ListDeployedResourcesRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificate_ids")

    private List<String> certificateIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_names")

    private List<String> serviceNames = null;

    public ListDeployedResourcesRequestBody withCertificateIds(List<String> certificateIds) {
        this.certificateIds = certificateIds;
        return this;
    }

    public ListDeployedResourcesRequestBody addCertificateIdsItem(String certificateIdsItem) {
        if (this.certificateIds == null) {
            this.certificateIds = new ArrayList<>();
        }
        this.certificateIds.add(certificateIdsItem);
        return this;
    }

    public ListDeployedResourcesRequestBody withCertificateIds(Consumer<List<String>> certificateIdsSetter) {
        if (this.certificateIds == null) {
            this.certificateIds = new ArrayList<>();
        }
        certificateIdsSetter.accept(this.certificateIds);
        return this;
    }

    /**
     * 证书ID列表。
     * @return certificateIds
     */
    public List<String> getCertificateIds() {
        return certificateIds;
    }

    public void setCertificateIds(List<String> certificateIds) {
        this.certificateIds = certificateIds;
    }

    public ListDeployedResourcesRequestBody withServiceNames(List<String> serviceNames) {
        this.serviceNames = serviceNames;
        return this;
    }

    public ListDeployedResourcesRequestBody addServiceNamesItem(String serviceNamesItem) {
        if (this.serviceNames == null) {
            this.serviceNames = new ArrayList<>();
        }
        this.serviceNames.add(serviceNamesItem);
        return this;
    }

    public ListDeployedResourcesRequestBody withServiceNames(Consumer<List<String>> serviceNamesSetter) {
        if (this.serviceNames == null) {
            this.serviceNames = new ArrayList<>();
        }
        serviceNamesSetter.accept(this.serviceNames);
        return this;
    }

    /**
     * 服务名称列表。 - WAF：查询证书关联Web应用防火墙的资源。 - CDN：查询证书关联内容分发网络的资源。 - ELB：查询证书关联弹性负载均衡（经典型）的资源。 - ALL：查询证书以上四种服务的资源。
     * @return serviceNames
     */
    public List<String> getServiceNames() {
        return serviceNames;
    }

    public void setServiceNames(List<String> serviceNames) {
        this.serviceNames = serviceNames;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListDeployedResourcesRequestBody that = (ListDeployedResourcesRequestBody) obj;
        return Objects.equals(this.certificateIds, that.certificateIds)
            && Objects.equals(this.serviceNames, that.serviceNames);
    }

    @Override
    public int hashCode() {
        return Objects.hash(certificateIds, serviceNames);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDeployedResourcesRequestBody {\n");
        sb.append("    certificateIds: ").append(toIndentedString(certificateIds)).append("\n");
        sb.append("    serviceNames: ").append(toIndentedString(serviceNames)).append("\n");
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
