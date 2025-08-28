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
public class ListBotMTimelineRequest {

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
    @JsonProperty(value = "domain")

    private String domain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "site")

    private String site;

    public ListBotMTimelineRequest withStartTime(Long startTime) {
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

    public ListBotMTimelineRequest withEndTime(Long endTime) {
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

    public ListBotMTimelineRequest withTenantId(String tenantId) {
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

    public ListBotMTimelineRequest withEnterpriseProjectId(String enterpriseProjectId) {
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

    public ListBotMTimelineRequest withHosts(List<String> hosts) {
        this.hosts = hosts;
        return this;
    }

    public ListBotMTimelineRequest addHostsItem(String hostsItem) {
        if (this.hosts == null) {
            this.hosts = new ArrayList<>();
        }
        this.hosts.add(hostsItem);
        return this;
    }

    public ListBotMTimelineRequest withHosts(Consumer<List<String>> hostsSetter) {
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

    public ListBotMTimelineRequest withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * **参数解释：** 域名 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return domain
     */
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public ListBotMTimelineRequest withRegion(String region) {
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

    public ListBotMTimelineRequest withSite(String site) {
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
        ListBotMTimelineRequest that = (ListBotMTimelineRequest) obj;
        return Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.tenantId, that.tenantId)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.hosts, that.hosts) && Objects.equals(this.domain, that.domain)
            && Objects.equals(this.region, that.region) && Objects.equals(this.site, that.site);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startTime, endTime, tenantId, enterpriseProjectId, hosts, domain, region, site);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListBotMTimelineRequest {\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    hosts: ").append(toIndentedString(hosts)).append("\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
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
