package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建资源包订单请求体。
 */
public class CreateResourcePackageOrderReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_packages")

    private List<ResourcePackage> resourcePackages = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_size")

    private Integer resourceSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extend_param")

    private OrderExtendParam extendParam;

    public CreateResourcePackageOrderReq withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID，上传则指定企业项目，不上传则表示所有企业项目。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public CreateResourcePackageOrderReq withResourcePackages(List<ResourcePackage> resourcePackages) {
        this.resourcePackages = resourcePackages;
        return this;
    }

    public CreateResourcePackageOrderReq addResourcePackagesItem(ResourcePackage resourcePackagesItem) {
        if (this.resourcePackages == null) {
            this.resourcePackages = new ArrayList<>();
        }
        this.resourcePackages.add(resourcePackagesItem);
        return this;
    }

    public CreateResourcePackageOrderReq withResourcePackages(Consumer<List<ResourcePackage>> resourcePackagesSetter) {
        if (this.resourcePackages == null) {
            this.resourcePackages = new ArrayList<>();
        }
        resourcePackagesSetter.accept(this.resourcePackages);
        return this;
    }

    /**
     * 资源包。
     * @return resourcePackages
     */
    public List<ResourcePackage> getResourcePackages() {
        return resourcePackages;
    }

    public void setResourcePackages(List<ResourcePackage> resourcePackages) {
        this.resourcePackages = resourcePackages;
    }

    public CreateResourcePackageOrderReq withResourceSize(Integer resourceSize) {
        this.resourceSize = resourceSize;
        return this;
    }

    /**
     * 购买资源包数量。
     * minimum: 0
     * maximum: 100
     * @return resourceSize
     */
    public Integer getResourceSize() {
        return resourceSize;
    }

    public void setResourceSize(Integer resourceSize) {
        this.resourceSize = resourceSize;
    }

    public CreateResourcePackageOrderReq withExtendParam(OrderExtendParam extendParam) {
        this.extendParam = extendParam;
        return this;
    }

    public CreateResourcePackageOrderReq withExtendParam(Consumer<OrderExtendParam> extendParamSetter) {
        if (this.extendParam == null) {
            this.extendParam = new OrderExtendParam();
            extendParamSetter.accept(this.extendParam);
        }

        return this;
    }

    /**
     * Get extendParam
     * @return extendParam
     */
    public OrderExtendParam getExtendParam() {
        return extendParam;
    }

    public void setExtendParam(OrderExtendParam extendParam) {
        this.extendParam = extendParam;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateResourcePackageOrderReq that = (CreateResourcePackageOrderReq) obj;
        return Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.resourcePackages, that.resourcePackages)
            && Objects.equals(this.resourceSize, that.resourceSize)
            && Objects.equals(this.extendParam, that.extendParam);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enterpriseProjectId, resourcePackages, resourceSize, extendParam);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateResourcePackageOrderReq {\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    resourcePackages: ").append(toIndentedString(resourcePackages)).append("\n");
        sb.append("    resourceSize: ").append(toIndentedString(resourceSize)).append("\n");
        sb.append("    extendParam: ").append(toIndentedString(extendParam)).append("\n");
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
