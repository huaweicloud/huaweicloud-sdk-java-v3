package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListRegistryRequest {

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
    @JsonProperty(value = "registry_name")

    private String registryName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "registry_id")

    private String registryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "registry_type")

    private String registryType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "registry_addr")

    private String registryAddr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    public ListRegistryRequest withEnterpriseProjectId(String enterpriseProjectId) {
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

    public ListRegistryRequest withOffset(Integer offset) {
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

    public ListRegistryRequest withLimit(Integer limit) {
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

    public ListRegistryRequest withRegistryName(String registryName) {
        this.registryName = registryName;
        return this;
    }

    /**
     * **参数解释**: 仓库名称 **取值范围**: 字符长度1-128位 
     * @return registryName
     */
    public String getRegistryName() {
        return registryName;
    }

    public void setRegistryName(String registryName) {
        this.registryName = registryName;
    }

    public ListRegistryRequest withRegistryId(String registryId) {
        this.registryId = registryId;
        return this;
    }

    /**
     * **参数解释**: 仓库ID **取值范围**: 字符长度1-64位 
     * @return registryId
     */
    public String getRegistryId() {
        return registryId;
    }

    public void setRegistryId(String registryId) {
        this.registryId = registryId;
    }

    public ListRegistryRequest withRegistryType(String registryType) {
        this.registryType = registryType;
        return this;
    }

    /**
     * **参数解释**: 镜像仓类型，不传默认返回所有类型。如果要查询多个类型，可以使用逗号分隔。 **取值范围**: - Harbor harbor - Jfrog jfrog - SwrPrivate swr私有 - SwrShared  swr共享 - SwrEnterprise  swr企业 - Other  其他仓库 
     * @return registryType
     */
    public String getRegistryType() {
        return registryType;
    }

    public void setRegistryType(String registryType) {
        this.registryType = registryType;
    }

    public ListRegistryRequest withRegistryAddr(String registryAddr) {
        this.registryAddr = registryAddr;
        return this;
    }

    /**
     * **参数解释**: 镜像仓地址 **取值范围**: 字符长度1-256位 
     * @return registryAddr
     */
    public String getRegistryAddr() {
        return registryAddr;
    }

    public void setRegistryAddr(String registryAddr) {
        this.registryAddr = registryAddr;
    }

    public ListRegistryRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**： 接入状态 **约束限制**： 不涉及 **取值范围**： - success：接入成功 - fail：接入异常 - accessing：接入中  **默认取值**： 不涉及 
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListRegistryRequest that = (ListRegistryRequest) obj;
        return Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.registryName, that.registryName) && Objects.equals(this.registryId, that.registryId)
            && Objects.equals(this.registryType, that.registryType)
            && Objects.equals(this.registryAddr, that.registryAddr) && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(enterpriseProjectId, offset, limit, registryName, registryId, registryType, registryAddr, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRegistryRequest {\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    registryName: ").append(toIndentedString(registryName)).append("\n");
        sb.append("    registryId: ").append(toIndentedString(registryId)).append("\n");
        sb.append("    registryType: ").append(toIndentedString(registryType)).append("\n");
        sb.append("    registryAddr: ").append(toIndentedString(registryAddr)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
