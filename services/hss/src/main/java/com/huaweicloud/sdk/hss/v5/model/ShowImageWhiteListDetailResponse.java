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
public class ShowImageWhiteListDetailResponse extends SdkResponse {

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

    private List<ImageWhiteListDetailResponseInfoCves> cves = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_type")

    private String ruleType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_info")

    private ImageWhiteListDetailResponseInfoQueryInfo queryInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_info")

    private List<ImageWhiteListDetailResponseInfoImageInfo> imageInfo = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public ShowImageWhiteListDetailResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**： 白名单ID **取值范围**： 字符长度0-64位 
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowImageWhiteListDetailResponse withVulId(String vulId) {
        this.vulId = vulId;
        return this;
    }

    /**
     * **参数解释**： 漏洞ID（只在查询漏洞白名单时返回） **取值范围**： 字符长度0-256位 
     * @return vulId
     */
    public String getVulId() {
        return vulId;
    }

    public void setVulId(String vulId) {
        this.vulId = vulId;
    }

    public ShowImageWhiteListDetailResponse withVulName(String vulName) {
        this.vulName = vulName;
        return this;
    }

    /**
     * **参数解释**： 漏洞名称（只在查询漏洞白名单时返回） **取值范围**： 字符长度0-256位 
     * @return vulName
     */
    public String getVulName() {
        return vulName;
    }

    public void setVulName(String vulName) {
        this.vulName = vulName;
    }

    public ShowImageWhiteListDetailResponse withVulType(String vulType) {
        this.vulType = vulType;
        return this;
    }

    /**
     * **参数解释**： 漏洞类型（只在查询漏洞白名单时返回） **取值范围**: - linux_vul：linux漏洞。 - app_vul：应用漏洞。 
     * @return vulType
     */
    public String getVulType() {
        return vulType;
    }

    public void setVulType(String vulType) {
        this.vulType = vulType;
    }

    public ShowImageWhiteListDetailResponse withCves(List<ImageWhiteListDetailResponseInfoCves> cves) {
        this.cves = cves;
        return this;
    }

    public ShowImageWhiteListDetailResponse addCvesItem(ImageWhiteListDetailResponseInfoCves cvesItem) {
        if (this.cves == null) {
            this.cves = new ArrayList<>();
        }
        this.cves.add(cvesItem);
        return this;
    }

    public ShowImageWhiteListDetailResponse withCves(Consumer<List<ImageWhiteListDetailResponseInfoCves>> cvesSetter) {
        if (this.cves == null) {
            this.cves = new ArrayList<>();
        }
        cvesSetter.accept(this.cves);
        return this;
    }

    /**
     * **参数解释**: 漏洞对应的CVE列表（只在查询漏洞白名单时返回） **取值范围**: 最小值0，最大值1000 
     * @return cves
     */
    public List<ImageWhiteListDetailResponseInfoCves> getCves() {
        return cves;
    }

    public void setCves(List<ImageWhiteListDetailResponseInfoCves> cves) {
        this.cves = cves;
    }

    public ShowImageWhiteListDetailResponse withRuleType(String ruleType) {
        this.ruleType = ruleType;
        return this;
    }

    /**
     * 白名单规则类型，包含如下：   -all_images : 白名单应用于全部镜像   -specific_image_types : 白名单应用于指定镜像类型(仅用于指定仓库镜像类型)   -specific_images : 白名单应用于指定镜像
     * @return ruleType
     */
    public String getRuleType() {
        return ruleType;
    }

    public void setRuleType(String ruleType) {
        this.ruleType = ruleType;
    }

    public ShowImageWhiteListDetailResponse withQueryInfo(ImageWhiteListDetailResponseInfoQueryInfo queryInfo) {
        this.queryInfo = queryInfo;
        return this;
    }

    public ShowImageWhiteListDetailResponse withQueryInfo(
        Consumer<ImageWhiteListDetailResponseInfoQueryInfo> queryInfoSetter) {
        if (this.queryInfo == null) {
            this.queryInfo = new ImageWhiteListDetailResponseInfoQueryInfo();
            queryInfoSetter.accept(this.queryInfo);
        }

        return this;
    }

    /**
     * Get queryInfo
     * @return queryInfo
     */
    public ImageWhiteListDetailResponseInfoQueryInfo getQueryInfo() {
        return queryInfo;
    }

    public void setQueryInfo(ImageWhiteListDetailResponseInfoQueryInfo queryInfo) {
        this.queryInfo = queryInfo;
    }

    public ShowImageWhiteListDetailResponse withImageInfo(List<ImageWhiteListDetailResponseInfoImageInfo> imageInfo) {
        this.imageInfo = imageInfo;
        return this;
    }

    public ShowImageWhiteListDetailResponse addImageInfoItem(ImageWhiteListDetailResponseInfoImageInfo imageInfoItem) {
        if (this.imageInfo == null) {
            this.imageInfo = new ArrayList<>();
        }
        this.imageInfo.add(imageInfoItem);
        return this;
    }

    public ShowImageWhiteListDetailResponse withImageInfo(
        Consumer<List<ImageWhiteListDetailResponseInfoImageInfo>> imageInfoSetter) {
        if (this.imageInfo == null) {
            this.imageInfo = new ArrayList<>();
        }
        imageInfoSetter.accept(this.imageInfo);
        return this;
    }

    /**
     * 白名单规则为“specific_images”时，指定的镜像列表。只在查询镜像白名单详情时返回数据。
     * @return imageInfo
     */
    public List<ImageWhiteListDetailResponseInfoImageInfo> getImageInfo() {
        return imageInfo;
    }

    public void setImageInfo(List<ImageWhiteListDetailResponseInfoImageInfo> imageInfo) {
        this.imageInfo = imageInfo;
    }

    public ShowImageWhiteListDetailResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**： 白名单的描述信息 **取值范围**： 字符长度0-1024位 
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
        ShowImageWhiteListDetailResponse that = (ShowImageWhiteListDetailResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.vulId, that.vulId)
            && Objects.equals(this.vulName, that.vulName) && Objects.equals(this.vulType, that.vulType)
            && Objects.equals(this.cves, that.cves) && Objects.equals(this.ruleType, that.ruleType)
            && Objects.equals(this.queryInfo, that.queryInfo) && Objects.equals(this.imageInfo, that.imageInfo)
            && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, vulId, vulName, vulType, cves, ruleType, queryInfo, imageInfo, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowImageWhiteListDetailResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    vulId: ").append(toIndentedString(vulId)).append("\n");
        sb.append("    vulName: ").append(toIndentedString(vulName)).append("\n");
        sb.append("    vulType: ").append(toIndentedString(vulType)).append("\n");
        sb.append("    cves: ").append(toIndentedString(cves)).append("\n");
        sb.append("    ruleType: ").append(toIndentedString(ruleType)).append("\n");
        sb.append("    queryInfo: ").append(toIndentedString(queryInfo)).append("\n");
        sb.append("    imageInfo: ").append(toIndentedString(imageInfo)).append("\n");
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
