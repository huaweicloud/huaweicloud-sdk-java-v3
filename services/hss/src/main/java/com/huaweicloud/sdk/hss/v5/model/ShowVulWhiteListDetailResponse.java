package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowVulWhiteListDetailResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vul_id")

    private String vulId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vul_name")

    private String vulName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vul_type")

    private String vulType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cves")

    private List<VulWhiteListDetailResponseInfoCves> cves = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_type")

    private String ruleType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hosts")

    private List<VulWhiteListDetailResponseInfoHosts> hosts = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public ShowVulWhiteListDetailResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**: 白名单id **取值范围**: 字符长度0-256 
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowVulWhiteListDetailResponse withVulId(String vulId) {
        this.vulId = vulId;
        return this;
    }

    /**
     * **参数解释**: 漏洞id **取值范围**: 字符长度0-256 
     * @return vulId
     */
    public String getVulId() {
        return vulId;
    }

    public void setVulId(String vulId) {
        this.vulId = vulId;
    }

    public ShowVulWhiteListDetailResponse withVulName(String vulName) {
        this.vulName = vulName;
        return this;
    }

    /**
     * **参数解释**: 漏洞名称 **取值范围**: 字符长度0-256 
     * @return vulName
     */
    public String getVulName() {
        return vulName;
    }

    public void setVulName(String vulName) {
        this.vulName = vulName;
    }

    public ShowVulWhiteListDetailResponse withVulType(String vulType) {
        this.vulType = vulType;
        return this;
    }

    /**
     * **参数解释**: 漏洞类型 **取值范围**: - linux_vul：linux漏洞 - windows_vul：windows漏洞 - web_cms：Web-CMS漏洞 - app_vul：应用漏洞 
     * @return vulType
     */
    public String getVulType() {
        return vulType;
    }

    public void setVulType(String vulType) {
        this.vulType = vulType;
    }

    public ShowVulWhiteListDetailResponse withCves(List<VulWhiteListDetailResponseInfoCves> cves) {
        this.cves = cves;
        return this;
    }

    public ShowVulWhiteListDetailResponse addCvesItem(VulWhiteListDetailResponseInfoCves cvesItem) {
        if (this.cves == null) {
            this.cves = new ArrayList<>();
        }
        this.cves.add(cvesItem);
        return this;
    }

    public ShowVulWhiteListDetailResponse withCves(Consumer<List<VulWhiteListDetailResponseInfoCves>> cvesSetter) {
        if (this.cves == null) {
            this.cves = new ArrayList<>();
        }
        cvesSetter.accept(this.cves);
        return this;
    }

    /**
     * **参数解释**: 漏洞对应的cve列表 **取值范围**: 最小值0，最大值2147483647 
     * @return cves
     */
    public List<VulWhiteListDetailResponseInfoCves> getCves() {
        return cves;
    }

    public void setCves(List<VulWhiteListDetailResponseInfoCves> cves) {
        this.cves = cves;
    }

    public ShowVulWhiteListDetailResponse withRuleType(String ruleType) {
        this.ruleType = ruleType;
        return this;
    }

    /**
     * **参数解释**: 白名单规则类型 **取值范围**: - all_host：白名单应用于全部主机 - specific_host：白名单应用于指定主机 
     * @return ruleType
     */
    public String getRuleType() {
        return ruleType;
    }

    public void setRuleType(String ruleType) {
        this.ruleType = ruleType;
    }

    public ShowVulWhiteListDetailResponse withHosts(List<VulWhiteListDetailResponseInfoHosts> hosts) {
        this.hosts = hosts;
        return this;
    }

    public ShowVulWhiteListDetailResponse addHostsItem(VulWhiteListDetailResponseInfoHosts hostsItem) {
        if (this.hosts == null) {
            this.hosts = new ArrayList<>();
        }
        this.hosts.add(hostsItem);
        return this;
    }

    public ShowVulWhiteListDetailResponse withHosts(Consumer<List<VulWhiteListDetailResponseInfoHosts>> hostsSetter) {
        if (this.hosts == null) {
            this.hosts = new ArrayList<>();
        }
        hostsSetter.accept(this.hosts);
        return this;
    }

    /**
     * **参数解释**: 白名单规则为“指定主机”时，指定的主机列表 **取值范围**: 最小值0，最大值2147483647 
     * @return hosts
     */
    public List<VulWhiteListDetailResponseInfoHosts> getHosts() {
        return hosts;
    }

    public void setHosts(List<VulWhiteListDetailResponseInfoHosts> hosts) {
        this.hosts = hosts;
    }

    public ShowVulWhiteListDetailResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**: 白名单的描述信息 **取值范围**: 字符长度0-1000 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowVulWhiteListDetailResponse that = (ShowVulWhiteListDetailResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.vulId, that.vulId)
            && Objects.equals(this.vulName, that.vulName) && Objects.equals(this.vulType, that.vulType)
            && Objects.equals(this.cves, that.cves) && Objects.equals(this.ruleType, that.ruleType)
            && Objects.equals(this.hosts, that.hosts) && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, vulId, vulName, vulType, cves, ruleType, hosts, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowVulWhiteListDetailResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    vulId: ").append(toIndentedString(vulId)).append("\n");
        sb.append("    vulName: ").append(toIndentedString(vulName)).append("\n");
        sb.append("    vulType: ").append(toIndentedString(vulType)).append("\n");
        sb.append("    cves: ").append(toIndentedString(cves)).append("\n");
        sb.append("    ruleType: ").append(toIndentedString(ruleType)).append("\n");
        sb.append("    hosts: ").append(toIndentedString(hosts)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
