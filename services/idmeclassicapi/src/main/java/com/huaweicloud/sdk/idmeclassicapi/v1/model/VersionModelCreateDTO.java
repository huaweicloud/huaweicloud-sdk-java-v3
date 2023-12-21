package com.huaweicloud.sdk.idmeclassicapi.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * VersionModelCreateDTO
 */
public class VersionModelCreateDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "branch")

    private VersionModelBranchCreateDTO branch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "checkOutTime")

    private String checkOutTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "checkOutUserName")

    private String checkOutUserName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "createTime")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator")

    private String creator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kiaguid")

    private String kiaguid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lastUpdateTime")

    private String lastUpdateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "master")

    private VersionModelMasterCreateDTO master;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modifier")

    private String modifier;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rdmExtensionType")

    private String rdmExtensionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "securityLevel")

    private String securityLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant")

    private ObjectReferenceParamDTO tenant;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workingCopy")

    private Boolean workingCopy;

    public VersionModelCreateDTO withBranch(VersionModelBranchCreateDTO branch) {
        this.branch = branch;
        return this;
    }

    public VersionModelCreateDTO withBranch(Consumer<VersionModelBranchCreateDTO> branchSetter) {
        if (this.branch == null) {
            this.branch = new VersionModelBranchCreateDTO();
            branchSetter.accept(this.branch);
        }

        return this;
    }

    /**
     * Get branch
     * @return branch
     */
    public VersionModelBranchCreateDTO getBranch() {
        return branch;
    }

    public void setBranch(VersionModelBranchCreateDTO branch) {
        this.branch = branch;
    }

    public VersionModelCreateDTO withCheckOutTime(String checkOutTime) {
        this.checkOutTime = checkOutTime;
        return this;
    }

    /**
     * 检出时间。
     * @return checkOutTime
     */
    public String getCheckOutTime() {
        return checkOutTime;
    }

    public void setCheckOutTime(String checkOutTime) {
        this.checkOutTime = checkOutTime;
    }

    public VersionModelCreateDTO withCheckOutUserName(String checkOutUserName) {
        this.checkOutUserName = checkOutUserName;
        return this;
    }

    /**
     * 检出人。
     * @return checkOutUserName
     */
    public String getCheckOutUserName() {
        return checkOutUserName;
    }

    public void setCheckOutUserName(String checkOutUserName) {
        this.checkOutUserName = checkOutUserName;
    }

    public VersionModelCreateDTO withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public VersionModelCreateDTO withCreator(String creator) {
        this.creator = creator;
        return this;
    }

    /**
     * 创建者。
     * @return creator
     */
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public VersionModelCreateDTO withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述信息。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public VersionModelCreateDTO withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 唯一标识。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public VersionModelCreateDTO withKiaguid(String kiaguid) {
        this.kiaguid = kiaguid;
        return this;
    }

    /**
     * 关键信息资产ID。
     * @return kiaguid
     */
    public String getKiaguid() {
        return kiaguid;
    }

    public void setKiaguid(String kiaguid) {
        this.kiaguid = kiaguid;
    }

    public VersionModelCreateDTO withLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
        return this;
    }

    /**
     * 最后更新时间。
     * @return lastUpdateTime
     */
    public String getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public VersionModelCreateDTO withMaster(VersionModelMasterCreateDTO master) {
        this.master = master;
        return this;
    }

    public VersionModelCreateDTO withMaster(Consumer<VersionModelMasterCreateDTO> masterSetter) {
        if (this.master == null) {
            this.master = new VersionModelMasterCreateDTO();
            masterSetter.accept(this.master);
        }

        return this;
    }

    /**
     * Get master
     * @return master
     */
    public VersionModelMasterCreateDTO getMaster() {
        return master;
    }

    public void setMaster(VersionModelMasterCreateDTO master) {
        this.master = master;
    }

    public VersionModelCreateDTO withModifier(String modifier) {
        this.modifier = modifier;
        return this;
    }

    /**
     * 修改人。
     * @return modifier
     */
    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public VersionModelCreateDTO withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 中文名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VersionModelCreateDTO withRdmExtensionType(String rdmExtensionType) {
        this.rdmExtensionType = rdmExtensionType;
        return this;
    }

    /**
     * 扩展类型。
     * @return rdmExtensionType
     */
    public String getRdmExtensionType() {
        return rdmExtensionType;
    }

    public void setRdmExtensionType(String rdmExtensionType) {
        this.rdmExtensionType = rdmExtensionType;
    }

    public VersionModelCreateDTO withSecurityLevel(String securityLevel) {
        this.securityLevel = securityLevel;
        return this;
    }

    /**
     * 安全密级。 - INTERNAL：内部公开。 - SECRET：秘密。 - CONFIDENTIAL：机密。 - TOP_SECRET：绝密。
     * @return securityLevel
     */
    public String getSecurityLevel() {
        return securityLevel;
    }

    public void setSecurityLevel(String securityLevel) {
        this.securityLevel = securityLevel;
    }

    public VersionModelCreateDTO withTenant(ObjectReferenceParamDTO tenant) {
        this.tenant = tenant;
        return this;
    }

    public VersionModelCreateDTO withTenant(Consumer<ObjectReferenceParamDTO> tenantSetter) {
        if (this.tenant == null) {
            this.tenant = new ObjectReferenceParamDTO();
            tenantSetter.accept(this.tenant);
        }

        return this;
    }

    /**
     * Get tenant
     * @return tenant
     */
    public ObjectReferenceParamDTO getTenant() {
        return tenant;
    }

    public void setTenant(ObjectReferenceParamDTO tenant) {
        this.tenant = tenant;
    }

    public VersionModelCreateDTO withWorkingCopy(Boolean workingCopy) {
        this.workingCopy = workingCopy;
        return this;
    }

    /**
     * 是否已检出。 - true：已检出。 - false：未检出。
     * @return workingCopy
     */
    public Boolean getWorkingCopy() {
        return workingCopy;
    }

    public void setWorkingCopy(Boolean workingCopy) {
        this.workingCopy = workingCopy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VersionModelCreateDTO that = (VersionModelCreateDTO) obj;
        return Objects.equals(this.branch, that.branch) && Objects.equals(this.checkOutTime, that.checkOutTime)
            && Objects.equals(this.checkOutUserName, that.checkOutUserName)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.creator, that.creator)
            && Objects.equals(this.description, that.description) && Objects.equals(this.id, that.id)
            && Objects.equals(this.kiaguid, that.kiaguid) && Objects.equals(this.lastUpdateTime, that.lastUpdateTime)
            && Objects.equals(this.master, that.master) && Objects.equals(this.modifier, that.modifier)
            && Objects.equals(this.name, that.name) && Objects.equals(this.rdmExtensionType, that.rdmExtensionType)
            && Objects.equals(this.securityLevel, that.securityLevel) && Objects.equals(this.tenant, that.tenant)
            && Objects.equals(this.workingCopy, that.workingCopy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(branch,
            checkOutTime,
            checkOutUserName,
            createTime,
            creator,
            description,
            id,
            kiaguid,
            lastUpdateTime,
            master,
            modifier,
            name,
            rdmExtensionType,
            securityLevel,
            tenant,
            workingCopy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VersionModelCreateDTO {\n");
        sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
        sb.append("    checkOutTime: ").append(toIndentedString(checkOutTime)).append("\n");
        sb.append("    checkOutUserName: ").append(toIndentedString(checkOutUserName)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    kiaguid: ").append(toIndentedString(kiaguid)).append("\n");
        sb.append("    lastUpdateTime: ").append(toIndentedString(lastUpdateTime)).append("\n");
        sb.append("    master: ").append(toIndentedString(master)).append("\n");
        sb.append("    modifier: ").append(toIndentedString(modifier)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    rdmExtensionType: ").append(toIndentedString(rdmExtensionType)).append("\n");
        sb.append("    securityLevel: ").append(toIndentedString(securityLevel)).append("\n");
        sb.append("    tenant: ").append(toIndentedString(tenant)).append("\n");
        sb.append("    workingCopy: ").append(toIndentedString(workingCopy)).append("\n");
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
