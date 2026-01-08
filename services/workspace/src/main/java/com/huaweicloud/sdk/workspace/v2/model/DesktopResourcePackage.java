package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DesktopResourcePackage
 */
public class DesktopResourcePackage {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_service_type")

    private String cloudServiceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private String resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_spec_code")

    private String resourceSpecCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "package_type")

    private String packageType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu")

    private String cpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "architecture")

    private String architecture;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memory")

    private String memory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_ids")

    private List<String> domainIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private Map<String, String> name = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private Map<String, String> description = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_packages")

    private List<ResourcePackage> resourcePackages = null;

    public DesktopResourcePackage withCloudServiceType(String cloudServiceType) {
        this.cloudServiceType = cloudServiceType;
        return this;
    }

    /**
     * 云服务类型。
     * @return cloudServiceType
     */
    public String getCloudServiceType() {
        return cloudServiceType;
    }

    public void setCloudServiceType(String cloudServiceType) {
        this.cloudServiceType = cloudServiceType;
    }

    public DesktopResourcePackage withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * 资源类型。
     * @return resourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public DesktopResourcePackage withResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
        return this;
    }

    /**
     * 资源规格编码。
     * @return resourceSpecCode
     */
    public String getResourceSpecCode() {
        return resourceSpecCode;
    }

    public void setResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
    }

    public DesktopResourcePackage withPackageType(String packageType) {
        this.packageType = packageType;
        return this;
    }

    /**
     * 规格。
     * @return packageType
     */
    public String getPackageType() {
        return packageType;
    }

    public void setPackageType(String packageType) {
        this.packageType = packageType;
    }

    public DesktopResourcePackage withCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }

    /**
     * cpu。
     * @return cpu
     */
    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public DesktopResourcePackage withArchitecture(String architecture) {
        this.architecture = architecture;
        return this;
    }

    /**
     * 产品架构：arm、x86。
     * @return architecture
     */
    public String getArchitecture() {
        return architecture;
    }

    public void setArchitecture(String architecture) {
        this.architecture = architecture;
    }

    public DesktopResourcePackage withMemory(String memory) {
        this.memory = memory;
        return this;
    }

    /**
     * 内存。
     * @return memory
     */
    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public DesktopResourcePackage withDomainIds(List<String> domainIds) {
        this.domainIds = domainIds;
        return this;
    }

    public DesktopResourcePackage addDomainIdsItem(String domainIdsItem) {
        if (this.domainIds == null) {
            this.domainIds = new ArrayList<>();
        }
        this.domainIds.add(domainIdsItem);
        return this;
    }

    public DesktopResourcePackage withDomainIds(Consumer<List<String>> domainIdsSetter) {
        if (this.domainIds == null) {
            this.domainIds = new ArrayList<>();
        }
        domainIdsSetter.accept(this.domainIds);
        return this;
    }

    /**
     * 该产品套餐支持的专有域id（domainId）。
     * @return domainIds
     */
    public List<String> getDomainIds() {
        return domainIds;
    }

    public void setDomainIds(List<String> domainIds) {
        this.domainIds = domainIds;
    }

    public DesktopResourcePackage withName(Map<String, String> name) {
        this.name = name;
        return this;
    }

    public DesktopResourcePackage putNameItem(String key, String nameItem) {
        if (this.name == null) {
            this.name = new HashMap<>();
        }
        this.name.put(key, nameItem);
        return this;
    }

    public DesktopResourcePackage withName(Consumer<Map<String, String>> nameSetter) {
        if (this.name == null) {
            this.name = new HashMap<>();
        }
        nameSetter.accept(this.name);
        return this;
    }

    /**
     * 产品名称<语言，各语言对应的产品名>。
     * @return name
     */
    public Map<String, String> getName() {
        return name;
    }

    public void setName(Map<String, String> name) {
        this.name = name;
    }

    public DesktopResourcePackage withDescription(Map<String, String> description) {
        this.description = description;
        return this;
    }

    public DesktopResourcePackage putDescriptionItem(String key, String descriptionItem) {
        if (this.description == null) {
            this.description = new HashMap<>();
        }
        this.description.put(key, descriptionItem);
        return this;
    }

    public DesktopResourcePackage withDescription(Consumer<Map<String, String>> descriptionSetter) {
        if (this.description == null) {
            this.description = new HashMap<>();
        }
        descriptionSetter.accept(this.description);
        return this;
    }

    /**
     * 产品描述<语言，各语言对应的产品名>。
     * @return description
     */
    public Map<String, String> getDescription() {
        return description;
    }

    public void setDescription(Map<String, String> description) {
        this.description = description;
    }

    public DesktopResourcePackage withResourcePackages(List<ResourcePackage> resourcePackages) {
        this.resourcePackages = resourcePackages;
        return this;
    }

    public DesktopResourcePackage addResourcePackagesItem(ResourcePackage resourcePackagesItem) {
        if (this.resourcePackages == null) {
            this.resourcePackages = new ArrayList<>();
        }
        this.resourcePackages.add(resourcePackagesItem);
        return this;
    }

    public DesktopResourcePackage withResourcePackages(Consumer<List<ResourcePackage>> resourcePackagesSetter) {
        if (this.resourcePackages == null) {
            this.resourcePackages = new ArrayList<>();
        }
        resourcePackagesSetter.accept(this.resourcePackages);
        return this;
    }

    /**
     * 按需套餐包规格列表。
     * @return resourcePackages
     */
    public List<ResourcePackage> getResourcePackages() {
        return resourcePackages;
    }

    public void setResourcePackages(List<ResourcePackage> resourcePackages) {
        this.resourcePackages = resourcePackages;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DesktopResourcePackage that = (DesktopResourcePackage) obj;
        return Objects.equals(this.cloudServiceType, that.cloudServiceType)
            && Objects.equals(this.resourceType, that.resourceType)
            && Objects.equals(this.resourceSpecCode, that.resourceSpecCode)
            && Objects.equals(this.packageType, that.packageType) && Objects.equals(this.cpu, that.cpu)
            && Objects.equals(this.architecture, that.architecture) && Objects.equals(this.memory, that.memory)
            && Objects.equals(this.domainIds, that.domainIds) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.resourcePackages, that.resourcePackages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cloudServiceType,
            resourceType,
            resourceSpecCode,
            packageType,
            cpu,
            architecture,
            memory,
            domainIds,
            name,
            description,
            resourcePackages);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DesktopResourcePackage {\n");
        sb.append("    cloudServiceType: ").append(toIndentedString(cloudServiceType)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    resourceSpecCode: ").append(toIndentedString(resourceSpecCode)).append("\n");
        sb.append("    packageType: ").append(toIndentedString(packageType)).append("\n");
        sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
        sb.append("    architecture: ").append(toIndentedString(architecture)).append("\n");
        sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
        sb.append("    domainIds: ").append(toIndentedString(domainIds)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    resourcePackages: ").append(toIndentedString(resourcePackages)).append("\n");
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
