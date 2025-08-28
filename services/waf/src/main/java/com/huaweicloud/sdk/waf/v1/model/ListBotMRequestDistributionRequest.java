package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListBotMRequestDistributionRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Long endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_id")

    private String tenantId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hosts")

    private List<String> hosts = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domains")

    private List<String> domains = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "site")

    private String site;

    public ListBotMRequestDistributionRequest withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * **参数解释：** 开始时间 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public ListBotMRequestDistributionRequest withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * **参数解释：** 结束时间 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public ListBotMRequestDistributionRequest withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * **参数解释：** 租户Id **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public ListBotMRequestDistributionRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * **参数解释：** 企业项目Id **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ListBotMRequestDistributionRequest withHosts(List<String> hosts) {
        this.hosts = hosts;
        return this;
    }

    public ListBotMRequestDistributionRequest addHostsItem(String hostsItem) {
        if (this.hosts == null) {
            this.hosts = new ArrayList<>();
        }
        this.hosts.add(hostsItem);
        return this;
    }

    public ListBotMRequestDistributionRequest withHosts(Consumer<List<String>> hostsSetter) {
        if (this.hosts == null) {
            this.hosts = new ArrayList<>();
        }
        hostsSetter.accept(this.hosts);
        return this;
    }

    /**
     * **参数解释：** 域名 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return hosts
     */
    public List<String> getHosts() {
        return hosts;
    }

    public void setHosts(List<String> hosts) {
        this.hosts = hosts;
    }

    public ListBotMRequestDistributionRequest withDomains(List<String> domains) {
        this.domains = domains;
        return this;
    }

    public ListBotMRequestDistributionRequest addDomainsItem(String domainsItem) {
        if (this.domains == null) {
            this.domains = new ArrayList<>();
        }
        this.domains.add(domainsItem);
        return this;
    }

    public ListBotMRequestDistributionRequest withDomains(Consumer<List<String>> domainsSetter) {
        if (this.domains == null) {
            this.domains = new ArrayList<>();
        }
        domainsSetter.accept(this.domains);
        return this;
    }

    /**
     * **参数解释：** 域名,要查询域名名称列表，hosts和domains二选一，都有值的话以hosts为准 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return domains
     */
    public List<String> getDomains() {
        return domains;
    }

    public void setDomains(List<String> domains) {
        this.domains = domains;
    }

    public ListBotMRequestDistributionRequest withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * **参数解释：** 区域 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public ListBotMRequestDistributionRequest withSite(String site) {
        this.site = site;
        return this;
    }

    /**
     * **参数解释：** 站点 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return site
     */
    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListBotMRequestDistributionRequest that = (ListBotMRequestDistributionRequest) obj;
        return Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.tenantId, that.tenantId)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.hosts, that.hosts) && Objects.equals(this.domains, that.domains)
            && Objects.equals(this.region, that.region) && Objects.equals(this.site, that.site);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startTime, endTime, tenantId, enterpriseProjectId, hosts, domains, region, site);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListBotMRequestDistributionRequest {\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    hosts: ").append(toIndentedString(hosts)).append("\n");
        sb.append("    domains: ").append(toIndentedString(domains)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    site: ").append(toIndentedString(site)).append("\n");
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
