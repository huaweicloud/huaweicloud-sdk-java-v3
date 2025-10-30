package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AddVulWhiteListRequestBody
 */
public class AddVulWhiteListRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vul_type")

    private String vulType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vul_ids")

    private List<String> vulIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_type")

    private String ruleType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_ids")

    private List<String> hostIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "with_ignore")

    private Boolean withIgnore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public AddVulWhiteListRequestBody withVulType(String vulType) {
        this.vulType = vulType;
        return this;
    }

    /**
     * **参数解释**: 漏洞类型 **约束限制**: 不涉及 **取值范围**: - linux_vul：linux漏洞 - windows_vul：windows漏洞 - web_cms：Web-CMS漏洞 - app_vul：应用漏洞  **默认取值**: 不涉及 
     * @return vulType
     */
    public String getVulType() {
        return vulType;
    }

    public void setVulType(String vulType) {
        this.vulType = vulType;
    }

    public AddVulWhiteListRequestBody withVulIds(List<String> vulIds) {
        this.vulIds = vulIds;
        return this;
    }

    public AddVulWhiteListRequestBody addVulIdsItem(String vulIdsItem) {
        if (this.vulIds == null) {
            this.vulIds = new ArrayList<>();
        }
        this.vulIds.add(vulIdsItem);
        return this;
    }

    public AddVulWhiteListRequestBody withVulIds(Consumer<List<String>> vulIdsSetter) {
        if (this.vulIds == null) {
            this.vulIds = new ArrayList<>();
        }
        vulIdsSetter.accept(this.vulIds);
        return this;
    }

    /**
     * **参数解释**: 漏洞ID列表 **约束限制**: 不涉及 **取值范围**: 最小值1，最大值500 **默认取值**: 不涉及 
     * @return vulIds
     */
    public List<String> getVulIds() {
        return vulIds;
    }

    public void setVulIds(List<String> vulIds) {
        this.vulIds = vulIds;
    }

    public AddVulWhiteListRequestBody withRuleType(String ruleType) {
        this.ruleType = ruleType;
        return this;
    }

    /**
     * **参数解释**: 白名单规则类型 **约束限制**: 不涉及 **取值范围**: - all_host：白名单应用于全部主机 - specific_host：白名单应用于指定主机  **默认取值**: 不涉及 
     * @return ruleType
     */
    public String getRuleType() {
        return ruleType;
    }

    public void setRuleType(String ruleType) {
        this.ruleType = ruleType;
    }

    public AddVulWhiteListRequestBody withHostIds(List<String> hostIds) {
        this.hostIds = hostIds;
        return this;
    }

    public AddVulWhiteListRequestBody addHostIdsItem(String hostIdsItem) {
        if (this.hostIds == null) {
            this.hostIds = new ArrayList<>();
        }
        this.hostIds.add(hostIdsItem);
        return this;
    }

    public AddVulWhiteListRequestBody withHostIds(Consumer<List<String>> hostIdsSetter) {
        if (this.hostIds == null) {
            this.hostIds = new ArrayList<>();
        }
        hostIdsSetter.accept(this.hostIds);
        return this;
    }

    /**
     * **参数解释**: 主机ID列表，当rule_type为specific_host时，该字段必填 **约束限制**: 不涉及 **取值范围**: 最小值1，最大值2000 **默认取值**: 不涉及 
     * @return hostIds
     */
    public List<String> getHostIds() {
        return hostIds;
    }

    public void setHostIds(List<String> hostIds) {
        this.hostIds = hostIds;
    }

    public AddVulWhiteListRequestBody withWithIgnore(Boolean withIgnore) {
        this.withIgnore = withIgnore;
        return this;
    }

    /**
     * **参数解释**: 是否忽略当前已扫描出的漏洞 **约束限制**: 不涉及 **取值范围**: - true：忽略 - false：不忽略 **默认取值**: true 
     * @return withIgnore
     */
    public Boolean getWithIgnore() {
        return withIgnore;
    }

    public void setWithIgnore(Boolean withIgnore) {
        this.withIgnore = withIgnore;
    }

    public AddVulWhiteListRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**: 白名单的描述信息 **约束限制**: 不涉及 **取值范围**: 字符长度0-1000 **默认取值**: 不涉及 
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
        AddVulWhiteListRequestBody that = (AddVulWhiteListRequestBody) obj;
        return Objects.equals(this.vulType, that.vulType) && Objects.equals(this.vulIds, that.vulIds)
            && Objects.equals(this.ruleType, that.ruleType) && Objects.equals(this.hostIds, that.hostIds)
            && Objects.equals(this.withIgnore, that.withIgnore) && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vulType, vulIds, ruleType, hostIds, withIgnore, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddVulWhiteListRequestBody {\n");
        sb.append("    vulType: ").append(toIndentedString(vulType)).append("\n");
        sb.append("    vulIds: ").append(toIndentedString(vulIds)).append("\n");
        sb.append("    ruleType: ").append(toIndentedString(ruleType)).append("\n");
        sb.append("    hostIds: ").append(toIndentedString(hostIds)).append("\n");
        sb.append("    withIgnore: ").append(toIndentedString(withIgnore)).append("\n");
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
