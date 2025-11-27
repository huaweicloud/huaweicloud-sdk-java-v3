package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListWebTamperProtectionDirectoryRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protection_config_id")

    private String protectionConfigId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "container_id")

    private String containerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protect_directory")

    private String protectDirectory;

    public ListWebTamperProtectionDirectoryRequest withEnterpriseProjectId(String enterpriseProjectId) {
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

    public ListWebTamperProtectionDirectoryRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**: 网页防篡改类型 **约束限制**: 不涉及。 **取值范围**: - container_wtp：容器网页防篡改 **默认取值**: 不涉及 
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ListWebTamperProtectionDirectoryRequest withProtectionConfigId(String protectionConfigId) {
        this.protectionConfigId = protectionConfigId;
        return this;
    }

    /**
     * **参数解释**: 防护配置id **约束限制**: 不涉及。 **取值范围**: 字符长度1-64位 **默认取值**: 不涉及 
     * @return protectionConfigId
     */
    public String getProtectionConfigId() {
        return protectionConfigId;
    }

    public void setProtectionConfigId(String protectionConfigId) {
        this.protectionConfigId = protectionConfigId;
    }

    public ListWebTamperProtectionDirectoryRequest withContainerId(String containerId) {
        this.containerId = containerId;
        return this;
    }

    /**
     * **参数解释**: 受影响容器id **约束限制**: 不涉及 **取值范围**: 字符长度0-256位 **默认取值**: 不涉及 
     * @return containerId
     */
    public String getContainerId() {
        return containerId;
    }

    public void setContainerId(String containerId) {
        this.containerId = containerId;
    }

    public ListWebTamperProtectionDirectoryRequest withOffset(Integer offset) {
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

    public ListWebTamperProtectionDirectoryRequest withLimit(Integer limit) {
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

    public ListWebTamperProtectionDirectoryRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**: 防护状态 **约束限制**: type为container_wtp时必传 **取值范围**: - protected：防护中 - protect_failed：防护失败 **默认取值**: 不涉及 
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ListWebTamperProtectionDirectoryRequest withProtectDirectory(String protectDirectory) {
        this.protectDirectory = protectDirectory;
        return this;
    }

    /**
     * **参数解释**: 防护目录 **约束限制**: 不涉及。 **取值范围**: 字符长度1-256位 **默认取值**: 不涉及 
     * @return protectDirectory
     */
    public String getProtectDirectory() {
        return protectDirectory;
    }

    public void setProtectDirectory(String protectDirectory) {
        this.protectDirectory = protectDirectory;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListWebTamperProtectionDirectoryRequest that = (ListWebTamperProtectionDirectoryRequest) obj;
        return Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.type, that.type) && Objects.equals(this.protectionConfigId, that.protectionConfigId)
            && Objects.equals(this.containerId, that.containerId) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.status, that.status)
            && Objects.equals(this.protectDirectory, that.protectDirectory);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(enterpriseProjectId, type, protectionConfigId, containerId, offset, limit, status, protectDirectory);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListWebTamperProtectionDirectoryRequest {\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    protectionConfigId: ").append(toIndentedString(protectionConfigId)).append("\n");
        sb.append("    containerId: ").append(toIndentedString(containerId)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    protectDirectory: ").append(toIndentedString(protectDirectory)).append("\n");
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
