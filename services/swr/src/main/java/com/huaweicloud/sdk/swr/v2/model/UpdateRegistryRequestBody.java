package com.huaweicloud.sdk.swr.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateRegistryRequestBody
 */
public class UpdateRegistryRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "credential")

    private Credential credential;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dns_conf")

    private DnsConf dnsConf;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "insecure")

    private Boolean insecure;

    public UpdateRegistryRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 目标仓库名称，1-64字符组成，只能包含英文大小写、数字、汉字、中划线和下划线。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateRegistryRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 目标仓库描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateRegistryRequestBody withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 仓库类型，swr-pro(开源harbor仓库)、swr-pro-internal(SWR企业版仓库)、huawei-SWR(SWR基础版仓库)
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public UpdateRegistryRequestBody withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 企业仓库实例所属的项目ID，当type为swr-pro-internal时必填
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public UpdateRegistryRequestBody withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * 区域ID，当type为swr-pro-internal时必填
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public UpdateRegistryRequestBody withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 企业仓库实例ID，当type为swr-pro-internal时必填
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public UpdateRegistryRequestBody withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * 目标仓库的地址
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public UpdateRegistryRequestBody withCredential(Credential credential) {
        this.credential = credential;
        return this;
    }

    public UpdateRegistryRequestBody withCredential(Consumer<Credential> credentialSetter) {
        if (this.credential == null) {
            this.credential = new Credential();
            credentialSetter.accept(this.credential);
        }

        return this;
    }

    /**
     * Get credential
     * @return credential
     */
    public Credential getCredential() {
        return credential;
    }

    public void setCredential(Credential credential) {
        this.credential = credential;
    }

    public UpdateRegistryRequestBody withDnsConf(DnsConf dnsConf) {
        this.dnsConf = dnsConf;
        return this;
    }

    public UpdateRegistryRequestBody withDnsConf(Consumer<DnsConf> dnsConfSetter) {
        if (this.dnsConf == null) {
            this.dnsConf = new DnsConf();
            dnsConfSetter.accept(this.dnsConf);
        }

        return this;
    }

    /**
     * Get dnsConf
     * @return dnsConf
     */
    public DnsConf getDnsConf() {
        return dnsConf;
    }

    public void setDnsConf(DnsConf dnsConf) {
        this.dnsConf = dnsConf;
    }

    public UpdateRegistryRequestBody withInsecure(Boolean insecure) {
        this.insecure = insecure;
        return this;
    }

    /**
     * 是否验证远程证书
     * @return insecure
     */
    public Boolean getInsecure() {
        return insecure;
    }

    public void setInsecure(Boolean insecure) {
        this.insecure = insecure;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateRegistryRequestBody that = (UpdateRegistryRequestBody) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.type, that.type) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.regionId, that.regionId) && Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.url, that.url) && Objects.equals(this.credential, that.credential)
            && Objects.equals(this.dnsConf, that.dnsConf) && Objects.equals(this.insecure, that.insecure);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(name, description, type, projectId, regionId, instanceId, url, credential, dnsConf, insecure);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateRegistryRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    credential: ").append(toIndentedString(credential)).append("\n");
        sb.append("    dnsConf: ").append(toIndentedString(dnsConf)).append("\n");
        sb.append("    insecure: ").append(toIndentedString(insecure)).append("\n");
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
