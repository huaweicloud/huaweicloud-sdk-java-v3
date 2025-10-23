package com.huaweicloud.sdk.bcc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CbrVaultDetail
 */
public class CbrVaultDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_name")

    private String resourceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider")

    private String provider;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created")

    private String created;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_detail")

    private CbrVaultDetailResourceDetail resourceDetail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_label")

    private List<Tag> resourceLabel = null;

    public CbrVaultDetail withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 存储库ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CbrVaultDetail withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * 存储库名称
     * @return resourceName
     */
    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public CbrVaultDetail withProvider(String provider) {
        this.provider = provider;
        return this;
    }

    /**
     * 存储库提供云服务，CBR
     * @return provider
     */
    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public CbrVaultDetail withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * 地域id
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public CbrVaultDetail withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 租户id
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public CbrVaultDetail withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public CbrVaultDetail withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目id，默认为‘0’。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public CbrVaultDetail withCreated(String created) {
        this.created = created;
        return this;
    }

    /**
     * 创建时间
     * @return created
     */
    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public CbrVaultDetail withResourceDetail(CbrVaultDetailResourceDetail resourceDetail) {
        this.resourceDetail = resourceDetail;
        return this;
    }

    public CbrVaultDetail withResourceDetail(Consumer<CbrVaultDetailResourceDetail> resourceDetailSetter) {
        if (this.resourceDetail == null) {
            this.resourceDetail = new CbrVaultDetailResourceDetail();
            resourceDetailSetter.accept(this.resourceDetail);
        }

        return this;
    }

    /**
     * Get resourceDetail
     * @return resourceDetail
     */
    public CbrVaultDetailResourceDetail getResourceDetail() {
        return resourceDetail;
    }

    public void setResourceDetail(CbrVaultDetailResourceDetail resourceDetail) {
        this.resourceDetail = resourceDetail;
    }

    public CbrVaultDetail withResourceLabel(List<Tag> resourceLabel) {
        this.resourceLabel = resourceLabel;
        return this;
    }

    public CbrVaultDetail addResourceLabelItem(Tag resourceLabelItem) {
        if (this.resourceLabel == null) {
            this.resourceLabel = new ArrayList<>();
        }
        this.resourceLabel.add(resourceLabelItem);
        return this;
    }

    public CbrVaultDetail withResourceLabel(Consumer<List<Tag>> resourceLabelSetter) {
        if (this.resourceLabel == null) {
            this.resourceLabel = new ArrayList<>();
        }
        resourceLabelSetter.accept(this.resourceLabel);
        return this;
    }

    /**
     * 资源标签
     * @return resourceLabel
     */
    public List<Tag> getResourceLabel() {
        return resourceLabel;
    }

    public void setResourceLabel(List<Tag> resourceLabel) {
        this.resourceLabel = resourceLabel;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CbrVaultDetail that = (CbrVaultDetail) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.resourceName, that.resourceName)
            && Objects.equals(this.provider, that.provider) && Objects.equals(this.regionId, that.regionId)
            && Objects.equals(this.domainId, that.domainId) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.created, that.created) && Objects.equals(this.resourceDetail, that.resourceDetail)
            && Objects.equals(this.resourceLabel, that.resourceLabel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            resourceName,
            provider,
            regionId,
            domainId,
            projectId,
            enterpriseProjectId,
            created,
            resourceDetail,
            resourceLabel);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CbrVaultDetail {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
        sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    resourceDetail: ").append(toIndentedString(resourceDetail)).append("\n");
        sb.append("    resourceLabel: ").append(toIndentedString(resourceLabel)).append("\n");
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
