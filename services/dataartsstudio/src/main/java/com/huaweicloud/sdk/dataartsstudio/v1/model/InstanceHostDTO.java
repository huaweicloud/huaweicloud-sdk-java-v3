package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * InstanceHostDTO
 */
public class InstanceHostDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_name")

    private String instanceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "intranet_host")

    private String intranetHost;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "external_host")

    private String externalHost;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domains")

    private List<String> domains = null;

    public InstanceHostDTO withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 集群id
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public InstanceHostDTO withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * 集群名
     * @return instanceName
     */
    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public InstanceHostDTO withIntranetHost(String intranetHost) {
        this.intranetHost = intranetHost;
        return this;
    }

    /**
     * 内网地址
     * @return intranetHost
     */
    public String getIntranetHost() {
        return intranetHost;
    }

    public void setIntranetHost(String intranetHost) {
        this.intranetHost = intranetHost;
    }

    public InstanceHostDTO withExternalHost(String externalHost) {
        this.externalHost = externalHost;
        return this;
    }

    /**
     * 外网地址
     * @return externalHost
     */
    public String getExternalHost() {
        return externalHost;
    }

    public void setExternalHost(String externalHost) {
        this.externalHost = externalHost;
    }

    public InstanceHostDTO withDomains(List<String> domains) {
        this.domains = domains;
        return this;
    }

    public InstanceHostDTO addDomainsItem(String domainsItem) {
        if (this.domains == null) {
            this.domains = new ArrayList<>();
        }
        this.domains.add(domainsItem);
        return this;
    }

    public InstanceHostDTO withDomains(Consumer<List<String>> domainsSetter) {
        if (this.domains == null) {
            this.domains = new ArrayList<>();
        }
        domainsSetter.accept(this.domains);
        return this;
    }

    /**
     * 网关域名
     * @return domains
     */
    public List<String> getDomains() {
        return domains;
    }

    public void setDomains(List<String> domains) {
        this.domains = domains;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InstanceHostDTO instanceHostDTO = (InstanceHostDTO) o;
        return Objects.equals(this.instanceId, instanceHostDTO.instanceId)
            && Objects.equals(this.instanceName, instanceHostDTO.instanceName)
            && Objects.equals(this.intranetHost, instanceHostDTO.intranetHost)
            && Objects.equals(this.externalHost, instanceHostDTO.externalHost)
            && Objects.equals(this.domains, instanceHostDTO.domains);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, instanceName, intranetHost, externalHost, domains);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstanceHostDTO {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
        sb.append("    intranetHost: ").append(toIndentedString(intranetHost)).append("\n");
        sb.append("    externalHost: ").append(toIndentedString(externalHost)).append("\n");
        sb.append("    domains: ").append(toIndentedString(domains)).append("\n");
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
