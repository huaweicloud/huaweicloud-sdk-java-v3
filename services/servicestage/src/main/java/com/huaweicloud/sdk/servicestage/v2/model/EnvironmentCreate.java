package com.huaweicloud.sdk.servicestage.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * EnvironmentCreate
 */
public class EnvironmentCreate {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alias")

    private String alias;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charge_mode")

    private ChargeMode chargeMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deploy_mode")

    private String deployMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "base_resources")

    private List<Resource> baseResources = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "optional_resources")

    private List<Resource> optionalResources = null;

    public EnvironmentCreate withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 环境名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnvironmentCreate withAlias(String alias) {
        this.alias = alias;
        return this;
    }

    /**
     * 环境别名。
     * @return alias
     */
    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public EnvironmentCreate withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 环境描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public EnvironmentCreate withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public EnvironmentCreate withChargeMode(ChargeMode chargeMode) {
        this.chargeMode = chargeMode;
        return this;
    }

    /**
     * Get chargeMode
     * @return chargeMode
     */
    public ChargeMode getChargeMode() {
        return chargeMode;
    }

    public void setChargeMode(ChargeMode chargeMode) {
        this.chargeMode = chargeMode;
    }

    public EnvironmentCreate withDeployMode(String deployMode) {
        this.deployMode = deployMode;
        return this;
    }

    /**
     * Get deployMode
     * @return deployMode
     */
    public String getDeployMode() {
        return deployMode;
    }

    public void setDeployMode(String deployMode) {
        this.deployMode = deployMode;
    }

    public EnvironmentCreate withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * 虚拟私有云ID。
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public EnvironmentCreate withBaseResources(List<Resource> baseResources) {
        this.baseResources = baseResources;
        return this;
    }

    public EnvironmentCreate addBaseResourcesItem(Resource baseResourcesItem) {
        if (this.baseResources == null) {
            this.baseResources = new ArrayList<>();
        }
        this.baseResources.add(baseResourcesItem);
        return this;
    }

    public EnvironmentCreate withBaseResources(Consumer<List<Resource>> baseResourcesSetter) {
        if (this.baseResources == null) {
            this.baseResources = new ArrayList<>();
        }
        baseResourcesSetter.accept(this.baseResources);
        return this;
    }

    /**
     * 基础资源。
     * @return baseResources
     */
    public List<Resource> getBaseResources() {
        return baseResources;
    }

    public void setBaseResources(List<Resource> baseResources) {
        this.baseResources = baseResources;
    }

    public EnvironmentCreate withOptionalResources(List<Resource> optionalResources) {
        this.optionalResources = optionalResources;
        return this;
    }

    public EnvironmentCreate addOptionalResourcesItem(Resource optionalResourcesItem) {
        if (this.optionalResources == null) {
            this.optionalResources = new ArrayList<>();
        }
        this.optionalResources.add(optionalResourcesItem);
        return this;
    }

    public EnvironmentCreate withOptionalResources(Consumer<List<Resource>> optionalResourcesSetter) {
        if (this.optionalResources == null) {
            this.optionalResources = new ArrayList<>();
        }
        optionalResourcesSetter.accept(this.optionalResources);
        return this;
    }

    /**
     * 可选资源。
     * @return optionalResources
     */
    public List<Resource> getOptionalResources() {
        return optionalResources;
    }

    public void setOptionalResources(List<Resource> optionalResources) {
        this.optionalResources = optionalResources;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EnvironmentCreate that = (EnvironmentCreate) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.alias, that.alias)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.chargeMode, that.chargeMode) && Objects.equals(this.deployMode, that.deployMode)
            && Objects.equals(this.vpcId, that.vpcId) && Objects.equals(this.baseResources, that.baseResources)
            && Objects.equals(this.optionalResources, that.optionalResources);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            alias,
            description,
            enterpriseProjectId,
            chargeMode,
            deployMode,
            vpcId,
            baseResources,
            optionalResources);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EnvironmentCreate {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    chargeMode: ").append(toIndentedString(chargeMode)).append("\n");
        sb.append("    deployMode: ").append(toIndentedString(deployMode)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    baseResources: ").append(toIndentedString(baseResources)).append("\n");
        sb.append("    optionalResources: ").append(toIndentedString(optionalResources)).append("\n");
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
