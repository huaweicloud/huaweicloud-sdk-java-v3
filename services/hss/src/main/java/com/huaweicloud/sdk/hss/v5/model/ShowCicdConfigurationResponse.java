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
public class ShowCicdConfigurationResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cicd_id")

    private String cicdId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cicd_name")

    private String cicdName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associated_images_num")

    private Integer associatedImagesNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vulnerability_whitelist")

    private List<String> vulnerabilityWhitelist = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vulnerability_blocklist")

    private List<String> vulnerabilityBlocklist = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_whitelist")

    private List<String> imageWhitelist = null;

    public ShowCicdConfigurationResponse withCicdId(String cicdId) {
        this.cicdId = cicdId;
        return this;
    }

    /**
     * **参数解释** CI/CD标识 **约束限制** 不涉及 **取值范围** 字符长度0-128位  **默认取值** 不涉及
     * @return cicdId
     */
    public String getCicdId() {
        return cicdId;
    }

    public void setCicdId(String cicdId) {
        this.cicdId = cicdId;
    }

    public ShowCicdConfigurationResponse withCicdName(String cicdName) {
        this.cicdName = cicdName;
        return this;
    }

    /**
     * **参数解释** CI/CD名称 **约束限制** 不涉及 **取值范围** 字符长度0-128位  **默认取值** 不涉及
     * @return cicdName
     */
    public String getCicdName() {
        return cicdName;
    }

    public void setCicdName(String cicdName) {
        this.cicdName = cicdName;
    }

    public ShowCicdConfigurationResponse withAssociatedImagesNum(Integer associatedImagesNum) {
        this.associatedImagesNum = associatedImagesNum;
        return this;
    }

    /**
     * **参数解释** 关联镜像扫描数量 **约束限制** 不涉及 **取值范围** 最小值0，最大值2147483647  **默认取值** 不涉及
     * minimum: 0
     * maximum: 2147483647
     * @return associatedImagesNum
     */
    public Integer getAssociatedImagesNum() {
        return associatedImagesNum;
    }

    public void setAssociatedImagesNum(Integer associatedImagesNum) {
        this.associatedImagesNum = associatedImagesNum;
    }

    public ShowCicdConfigurationResponse withVulnerabilityWhitelist(List<String> vulnerabilityWhitelist) {
        this.vulnerabilityWhitelist = vulnerabilityWhitelist;
        return this;
    }

    public ShowCicdConfigurationResponse addVulnerabilityWhitelistItem(String vulnerabilityWhitelistItem) {
        if (this.vulnerabilityWhitelist == null) {
            this.vulnerabilityWhitelist = new ArrayList<>();
        }
        this.vulnerabilityWhitelist.add(vulnerabilityWhitelistItem);
        return this;
    }

    public ShowCicdConfigurationResponse withVulnerabilityWhitelist(
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

    public ShowCicdConfigurationResponse withVulnerabilityBlocklist(List<String> vulnerabilityBlocklist) {
        this.vulnerabilityBlocklist = vulnerabilityBlocklist;
        return this;
    }

    public ShowCicdConfigurationResponse addVulnerabilityBlocklistItem(String vulnerabilityBlocklistItem) {
        if (this.vulnerabilityBlocklist == null) {
            this.vulnerabilityBlocklist = new ArrayList<>();
        }
        this.vulnerabilityBlocklist.add(vulnerabilityBlocklistItem);
        return this;
    }

    public ShowCicdConfigurationResponse withVulnerabilityBlocklist(
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

    public ShowCicdConfigurationResponse withImageWhitelist(List<String> imageWhitelist) {
        this.imageWhitelist = imageWhitelist;
        return this;
    }

    public ShowCicdConfigurationResponse addImageWhitelistItem(String imageWhitelistItem) {
        if (this.imageWhitelist == null) {
            this.imageWhitelist = new ArrayList<>();
        }
        this.imageWhitelist.add(imageWhitelistItem);
        return this;
    }

    public ShowCicdConfigurationResponse withImageWhitelist(Consumer<List<String>> imageWhitelistSetter) {
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
        ShowCicdConfigurationResponse that = (ShowCicdConfigurationResponse) obj;
        return Objects.equals(this.cicdId, that.cicdId) && Objects.equals(this.cicdName, that.cicdName)
            && Objects.equals(this.associatedImagesNum, that.associatedImagesNum)
            && Objects.equals(this.vulnerabilityWhitelist, that.vulnerabilityWhitelist)
            && Objects.equals(this.vulnerabilityBlocklist, that.vulnerabilityBlocklist)
            && Objects.equals(this.imageWhitelist, that.imageWhitelist);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cicdId,
            cicdName,
            associatedImagesNum,
            vulnerabilityWhitelist,
            vulnerabilityBlocklist,
            imageWhitelist);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowCicdConfigurationResponse {\n");
        sb.append("    cicdId: ").append(toIndentedString(cicdId)).append("\n");
        sb.append("    cicdName: ").append(toIndentedString(cicdName)).append("\n");
        sb.append("    associatedImagesNum: ").append(toIndentedString(associatedImagesNum)).append("\n");
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
