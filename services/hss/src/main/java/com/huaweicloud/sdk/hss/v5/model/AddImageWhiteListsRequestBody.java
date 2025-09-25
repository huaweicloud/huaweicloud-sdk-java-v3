package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AddImageWhiteListsRequestBody
 */
public class AddImageWhiteListsRequestBody {

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
    @JsonProperty(value = "query_info")

    private AddImageWhiteListsRequestBodyQueryInfo queryInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_info")

    private List<AddImageWhiteListsRequestBodyImageInfo> imageInfo = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public AddImageWhiteListsRequestBody withVulType(String vulType) {
        this.vulType = vulType;
        return this;
    }

    /**
     * **参数解释**： 漏洞类型（只在查询漏洞白名单时使用） **约束限制**: 不涉及 **取值范围**: - linux_vul：linux漏洞。 - app_vul：应用漏洞。  **默认取值**: 不涉及 
     * @return vulType
     */
    public String getVulType() {
        return vulType;
    }

    public void setVulType(String vulType) {
        this.vulType = vulType;
    }

    public AddImageWhiteListsRequestBody withVulIds(List<String> vulIds) {
        this.vulIds = vulIds;
        return this;
    }

    public AddImageWhiteListsRequestBody addVulIdsItem(String vulIdsItem) {
        if (this.vulIds == null) {
            this.vulIds = new ArrayList<>();
        }
        this.vulIds.add(vulIdsItem);
        return this;
    }

    public AddImageWhiteListsRequestBody withVulIds(Consumer<List<String>> vulIdsSetter) {
        if (this.vulIds == null) {
            this.vulIds = new ArrayList<>();
        }
        vulIdsSetter.accept(this.vulIds);
        return this;
    }

    /**
     * 漏洞id列表（只在新增漏洞白名单时使用）
     * @return vulIds
     */
    public List<String> getVulIds() {
        return vulIds;
    }

    public void setVulIds(List<String> vulIds) {
        this.vulIds = vulIds;
    }

    public AddImageWhiteListsRequestBody withRuleType(String ruleType) {
        this.ruleType = ruleType;
        return this;
    }

    /**
     * **参数解释**： 白名单规则类型 **约束限制**: 不涉及 **取值范围**: - all_images：白名单应用于全部镜像。 - specific_image_types：白名单应用于指定镜像类型(仅用于指定仓库镜像类型)。 - specific_images：白名单应用于指定镜像。  **默认取值**: 不涉及 
     * @return ruleType
     */
    public String getRuleType() {
        return ruleType;
    }

    public void setRuleType(String ruleType) {
        this.ruleType = ruleType;
    }

    public AddImageWhiteListsRequestBody withQueryInfo(AddImageWhiteListsRequestBodyQueryInfo queryInfo) {
        this.queryInfo = queryInfo;
        return this;
    }

    public AddImageWhiteListsRequestBody withQueryInfo(
        Consumer<AddImageWhiteListsRequestBodyQueryInfo> queryInfoSetter) {
        if (this.queryInfo == null) {
            this.queryInfo = new AddImageWhiteListsRequestBodyQueryInfo();
            queryInfoSetter.accept(this.queryInfo);
        }

        return this;
    }

    /**
     * Get queryInfo
     * @return queryInfo
     */
    public AddImageWhiteListsRequestBodyQueryInfo getQueryInfo() {
        return queryInfo;
    }

    public void setQueryInfo(AddImageWhiteListsRequestBodyQueryInfo queryInfo) {
        this.queryInfo = queryInfo;
    }

    public AddImageWhiteListsRequestBody withImageInfo(List<AddImageWhiteListsRequestBodyImageInfo> imageInfo) {
        this.imageInfo = imageInfo;
        return this;
    }

    public AddImageWhiteListsRequestBody addImageInfoItem(AddImageWhiteListsRequestBodyImageInfo imageInfoItem) {
        if (this.imageInfo == null) {
            this.imageInfo = new ArrayList<>();
        }
        this.imageInfo.add(imageInfoItem);
        return this;
    }

    public AddImageWhiteListsRequestBody withImageInfo(
        Consumer<List<AddImageWhiteListsRequestBodyImageInfo>> imageInfoSetter) {
        if (this.imageInfo == null) {
            this.imageInfo = new ArrayList<>();
        }
        imageInfoSetter.accept(this.imageInfo);
        return this;
    }

    /**
     * 指定具体镜像
     * @return imageInfo
     */
    public List<AddImageWhiteListsRequestBodyImageInfo> getImageInfo() {
        return imageInfo;
    }

    public void setImageInfo(List<AddImageWhiteListsRequestBodyImageInfo> imageInfo) {
        this.imageInfo = imageInfo;
    }

    public AddImageWhiteListsRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 白名单的描述信息
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
        AddImageWhiteListsRequestBody that = (AddImageWhiteListsRequestBody) obj;
        return Objects.equals(this.vulType, that.vulType) && Objects.equals(this.vulIds, that.vulIds)
            && Objects.equals(this.ruleType, that.ruleType) && Objects.equals(this.queryInfo, that.queryInfo)
            && Objects.equals(this.imageInfo, that.imageInfo) && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vulType, vulIds, ruleType, queryInfo, imageInfo, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddImageWhiteListsRequestBody {\n");
        sb.append("    vulType: ").append(toIndentedString(vulType)).append("\n");
        sb.append("    vulIds: ").append(toIndentedString(vulIds)).append("\n");
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
