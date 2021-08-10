package com.huaweicloud.sdk.sa.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** Resource */
public class Resource {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service")

    private String service;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider")

    private String provider;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "idc_id")

    private String idcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private Object tags;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "details")

    private Detail details;

    public Resource withId(String id) {
        this.id = id;
        return this;
    }

    /** 资源ID。
     * 
     * @return id */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Resource withName(String name) {
        this.name = name;
        return this;
    }

    /** 资源名称；最大长度255个字符。
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Resource withType(String type) {
        this.type = type;
        return this;
    }

    /** 资源类型；cloud_servers、vpcs、security_groups、public_ips、volumes、containers、websites、hws_account、iam_user、firewall、security_group_rules、elb_loadbalancers、elb_listeners、cts、obs_buckets、rds_instances、dds_instances、dcs_instances、certificates、anti_ddos_eip、dns、other。
     * 
     * @return type */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Resource withService(String service) {
        this.service = service;
        return this;
    }

    /** 资源所属服务名称。
     * 
     * @return service */
    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public Resource withProvider(String provider) {
        this.provider = provider;
        return this;
    }

    /** 资源提供商名称。
     * 
     * @return provider */
    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public Resource withRegion(String region) {
        this.region = region;
        return this;
    }

    /** 区域。
     * 
     * @return region */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Resource withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /** 资源所属账号ID。
     * 
     * @return domainId */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public Resource withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /** 资源所属项目ID。
     * 
     * @return projectId */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public Resource withIdcId(String idcId) {
        this.idcId = idcId;
        return this;
    }

    /** 线下机房ID。
     * 
     * @return idcId */
    public String getIdcId() {
        return idcId;
    }

    public void setIdcId(String idcId) {
        this.idcId = idcId;
    }

    public Resource withTags(Object tags) {
        this.tags = tags;
        return this;
    }

    /** 资源标签 1、最多50个key/values对。 2、values：最大255字符。 3、取值范围：字母数字、空格、“+”、“-”、“=”、“.”、“_”、“:”、“/”、“@”。
     * 
     * @return tags */
    public Object getTags() {
        return tags;
    }

    public void setTags(Object tags) {
        this.tags = tags;
    }

    public Resource withDetails(Detail details) {
        this.details = details;
        return this;
    }

    public Resource withDetails(Consumer<Detail> detailsSetter) {
        if (this.details == null) {
            this.details = new Detail();
            detailsSetter.accept(this.details);
        }

        return this;
    }

    /** Get details
     * 
     * @return details */
    public Detail getDetails() {
        return details;
    }

    public void setDetails(Detail details) {
        this.details = details;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Resource resource = (Resource) o;
        return Objects.equals(this.id, resource.id) && Objects.equals(this.name, resource.name)
            && Objects.equals(this.type, resource.type) && Objects.equals(this.service, resource.service)
            && Objects.equals(this.provider, resource.provider) && Objects.equals(this.region, resource.region)
            && Objects.equals(this.domainId, resource.domainId) && Objects.equals(this.projectId, resource.projectId)
            && Objects.equals(this.idcId, resource.idcId) && Objects.equals(this.tags, resource.tags)
            && Objects.equals(this.details, resource.details);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, type, service, provider, region, domainId, projectId, idcId, tags, details);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Resource {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    service: ").append(toIndentedString(service)).append("\n");
        sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    idcId: ").append(toIndentedString(idcId)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    details: ").append(toIndentedString(details)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
