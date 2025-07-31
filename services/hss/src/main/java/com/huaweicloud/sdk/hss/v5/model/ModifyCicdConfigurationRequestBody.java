package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 修改CI/CD配置
 */
public class ModifyCicdConfigurationRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vulnerability_whitelist")

    private List<String> vulnerabilityWhitelist = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vulnerability_blocklist")

    private List<String> vulnerabilityBlocklist = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_whitelist")

    private List<String> imageWhitelist = null;

    public ModifyCicdConfigurationRequestBody withVulnerabilityWhitelist(List<String> vulnerabilityWhitelist) {
        this.vulnerabilityWhitelist = vulnerabilityWhitelist;
        return this;
    }

    public ModifyCicdConfigurationRequestBody addVulnerabilityWhitelistItem(String vulnerabilityWhitelistItem) {
        if (this.vulnerabilityWhitelist == null) {
            this.vulnerabilityWhitelist = new ArrayList<>();
        }
        this.vulnerabilityWhitelist.add(vulnerabilityWhitelistItem);
        return this;
    }

    public ModifyCicdConfigurationRequestBody withVulnerabilityWhitelist(
        Consumer<List<String>> vulnerabilityWhitelistSetter) {
        if (this.vulnerabilityWhitelist == null) {
            this.vulnerabilityWhitelist = new ArrayList<>();
        }
        vulnerabilityWhitelistSetter.accept(this.vulnerabilityWhitelist);
        return this;
    }

    /**
     * **参数解释** 漏洞白名单 **约束限制** 不涉及 **取值范围** 白名单数量范围0-1000  **默认取值** 不涉及
     * @return vulnerabilityWhitelist
     */
    public List<String> getVulnerabilityWhitelist() {
        return vulnerabilityWhitelist;
    }

    public void setVulnerabilityWhitelist(List<String> vulnerabilityWhitelist) {
        this.vulnerabilityWhitelist = vulnerabilityWhitelist;
    }

    public ModifyCicdConfigurationRequestBody withVulnerabilityBlocklist(List<String> vulnerabilityBlocklist) {
        this.vulnerabilityBlocklist = vulnerabilityBlocklist;
        return this;
    }

    public ModifyCicdConfigurationRequestBody addVulnerabilityBlocklistItem(String vulnerabilityBlocklistItem) {
        if (this.vulnerabilityBlocklist == null) {
            this.vulnerabilityBlocklist = new ArrayList<>();
        }
        this.vulnerabilityBlocklist.add(vulnerabilityBlocklistItem);
        return this;
    }

    public ModifyCicdConfigurationRequestBody withVulnerabilityBlocklist(
        Consumer<List<String>> vulnerabilityBlocklistSetter) {
        if (this.vulnerabilityBlocklist == null) {
            this.vulnerabilityBlocklist = new ArrayList<>();
        }
        vulnerabilityBlocklistSetter.accept(this.vulnerabilityBlocklist);
        return this;
    }

    /**
     * **参数解释** 漏洞黑名单 **约束限制** 不涉及 **取值范围** 黑名单数量范围0-1000  **默认取值** 不涉及
     * @return vulnerabilityBlocklist
     */
    public List<String> getVulnerabilityBlocklist() {
        return vulnerabilityBlocklist;
    }

    public void setVulnerabilityBlocklist(List<String> vulnerabilityBlocklist) {
        this.vulnerabilityBlocklist = vulnerabilityBlocklist;
    }

    public ModifyCicdConfigurationRequestBody withImageWhitelist(List<String> imageWhitelist) {
        this.imageWhitelist = imageWhitelist;
        return this;
    }

    public ModifyCicdConfigurationRequestBody addImageWhitelistItem(String imageWhitelistItem) {
        if (this.imageWhitelist == null) {
            this.imageWhitelist = new ArrayList<>();
        }
        this.imageWhitelist.add(imageWhitelistItem);
        return this;
    }

    public ModifyCicdConfigurationRequestBody withImageWhitelist(Consumer<List<String>> imageWhitelistSetter) {
        if (this.imageWhitelist == null) {
            this.imageWhitelist = new ArrayList<>();
        }
        imageWhitelistSetter.accept(this.imageWhitelist);
        return this;
    }

    /**
     * **参数解释** 镜像白名单 **约束限制** 不涉及 **取值范围** 白名单数量范围0-1000  **默认取值** 不涉及
     * @return imageWhitelist
     */
    public List<String> getImageWhitelist() {
        return imageWhitelist;
    }

    public void setImageWhitelist(List<String> imageWhitelist) {
        this.imageWhitelist = imageWhitelist;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ModifyCicdConfigurationRequestBody that = (ModifyCicdConfigurationRequestBody) obj;
        return Objects.equals(this.vulnerabilityWhitelist, that.vulnerabilityWhitelist)
            && Objects.equals(this.vulnerabilityBlocklist, that.vulnerabilityBlocklist)
            && Objects.equals(this.imageWhitelist, that.imageWhitelist);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vulnerabilityWhitelist, vulnerabilityBlocklist, imageWhitelist);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModifyCicdConfigurationRequestBody {\n");
        sb.append("    vulnerabilityWhitelist: ").append(toIndentedString(vulnerabilityWhitelist)).append("\n");
        sb.append("    vulnerabilityBlocklist: ").append(toIndentedString(vulnerabilityBlocklist)).append("\n");
        sb.append("    imageWhitelist: ").append(toIndentedString(imageWhitelist)).append("\n");
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
