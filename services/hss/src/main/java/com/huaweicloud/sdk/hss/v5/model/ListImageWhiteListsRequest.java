package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListImageWhiteListsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "global_image_type")

    private String globalImageType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vul_name")

    private String vulName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vul_type")

    private String vulType;

    public ListImageWhiteListsRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * **参数解释**: 企业项目ID，用于过滤不同企业项目下的资产。获取方式请参见[获取企业项目ID](hss_02_0027.xml)。 如需查询所有企业项目下的资产请传参“all_granted_eps”。 **约束限制**: 开通企业项目功能后才需要配置企业项目ID参数。 **取值范围**: 字符长度1-256位 **默认取值**: 0，表示默认企业项目（default）。 
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ListImageWhiteListsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * **参数解释**: 偏移量：指定返回记录的开始位置 **约束限制**: 不涉及 **取值范围**: 最小值0，最大值2000000 **默认取值**: 默认为0 
     * minimum: 0
     * maximum: 2000000
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListImageWhiteListsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数解释**: 每页显示个数 **约束限制**: 不涉及 **取值范围**: 取值10-200 **默认取值**: 10 
     * minimum: 10
     * maximum: 200
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListImageWhiteListsRequest withGlobalImageType(String globalImageType) {
        this.globalImageType = globalImageType;
        return this;
    }

    /**
     * **参数解释**： 镜像类型 **约束限制**: 不涉及 **取值范围**: - local：本地镜像。 - registry：仓库镜像。  **默认取值**: 不涉及 
     * @return globalImageType
     */
    public String getGlobalImageType() {
        return globalImageType;
    }

    public void setGlobalImageType(String globalImageType) {
        this.globalImageType = globalImageType;
    }

    public ListImageWhiteListsRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**： 白名单类型 **约束限制**: 不涉及 **取值范围**: - vulnerability：漏洞白名单。  **默认取值**: 不涉及 
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ListImageWhiteListsRequest withVulName(String vulName) {
        this.vulName = vulName;
        return this;
    }

    /**
     * **参数解释**： 漏洞名称（只在查询漏洞白名单时使用） **约束限制**： 不涉及 **取值范围**： 字符长度0-256位 **默认取值**： 不涉及 
     * @return vulName
     */
    public String getVulName() {
        return vulName;
    }

    public void setVulName(String vulName) {
        this.vulName = vulName;
    }

    public ListImageWhiteListsRequest withVulType(String vulType) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListImageWhiteListsRequest that = (ListImageWhiteListsRequest) obj;
        return Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.globalImageType, that.globalImageType) && Objects.equals(this.type, that.type)
            && Objects.equals(this.vulName, that.vulName) && Objects.equals(this.vulType, that.vulType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enterpriseProjectId, offset, limit, globalImageType, type, vulName, vulType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListImageWhiteListsRequest {\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    globalImageType: ").append(toIndentedString(globalImageType)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    vulName: ").append(toIndentedString(vulName)).append("\n");
        sb.append("    vulType: ").append(toIndentedString(vulType)).append("\n");
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
