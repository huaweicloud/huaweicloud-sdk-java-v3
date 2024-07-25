package com.huaweicloud.sdk.idmeclassicapi.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * VersionModelQueryViewDTO
 */
public class VersionModelQueryViewDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "branch")

    private VersionObjectBranchQueryViewDTO branch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "checkOutTime")

    private String checkOutTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "checkOutUserName")

    private String checkOutUserName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "className")

    private String className;

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
    @JsonProperty(value = "iteration")

    private Integer iteration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lastUpdateTime")

    private String lastUpdateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "latest")

    private Boolean latest;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "latestIteration")

    private Boolean latestIteration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "latestVersion")

    private Boolean latestVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "master")

    private MasterObjectQueryViewDTO master;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modifier")

    private String modifier;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "preVersionId")

    private String preVersionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rdmExtensionType")

    private String rdmExtensionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant")

    private TenantQueryViewDTO tenant;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "versionCode")

    private Integer versionCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workingCopy")

    private Boolean workingCopy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workingState")

    private WorkingState workingState;

    public VersionModelQueryViewDTO withBranch(VersionObjectBranchQueryViewDTO branch) {
        this.branch = branch;
        return this;
    }

    public VersionModelQueryViewDTO withBranch(Consumer<VersionObjectBranchQueryViewDTO> branchSetter) {
        if (this.branch == null) {
            this.branch = new VersionObjectBranchQueryViewDTO();
            branchSetter.accept(this.branch);
        }

        return this;
    }

    /**
     * Get branch
     * @return branch
     */
    public VersionObjectBranchQueryViewDTO getBranch() {
        return branch;
    }

    public void setBranch(VersionObjectBranchQueryViewDTO branch) {
        this.branch = branch;
    }

    public VersionModelQueryViewDTO withCheckOutTime(String checkOutTime) {
        this.checkOutTime = checkOutTime;
        return this;
    }

    /**
     * **参数解释：**  检出时间。  **取值范围：**  不涉及。  **默认取值：**  不涉及。 
     * @return checkOutTime
     */
    public String getCheckOutTime() {
        return checkOutTime;
    }

    public void setCheckOutTime(String checkOutTime) {
        this.checkOutTime = checkOutTime;
    }

    public VersionModelQueryViewDTO withCheckOutUserName(String checkOutUserName) {
        this.checkOutUserName = checkOutUserName;
        return this;
    }

    /**
     * **参数解释：**  检出人。  **取值范围：**  不涉及。  **默认取值：**  不涉及。 
     * @return checkOutUserName
     */
    public String getCheckOutUserName() {
        return checkOutUserName;
    }

    public void setCheckOutUserName(String checkOutUserName) {
        this.checkOutUserName = checkOutUserName;
    }

    public VersionModelQueryViewDTO withClassName(String className) {
        this.className = className;
        return this;
    }

    /**
     * **参数解释：**  类名。  **取值范围：**  不涉及。  **默认取值：**  不涉及。 
     * @return className
     */
    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public VersionModelQueryViewDTO withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * **参数解释：**  创建时间。  **取值范围：**  不涉及。  **默认取值：**  不涉及。 
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public VersionModelQueryViewDTO withCreator(String creator) {
        this.creator = creator;
        return this;
    }

    /**
     * **参数解释：**  创建者。  **取值范围：**  不涉及。  **默认取值：**  不涉及。 
     * @return creator
     */
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public VersionModelQueryViewDTO withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释：**  描述信息。  **取值范围：**  不涉及。  **默认取值：**  不涉及。 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public VersionModelQueryViewDTO withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：**  唯一标识。  **取值范围：**  -9223372036854775808到9223372036854775807的整数。  **默认取值：**  不涉及。 
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public VersionModelQueryViewDTO withIteration(Integer iteration) {
        this.iteration = iteration;
        return this;
    }

    /**
     * **参数解释：**  迭代版本。  **取值范围：**  不涉及。  **默认取值：**  不涉及。 
     * @return iteration
     */
    public Integer getIteration() {
        return iteration;
    }

    public void setIteration(Integer iteration) {
        this.iteration = iteration;
    }

    public VersionModelQueryViewDTO withLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
        return this;
    }

    /**
     * **参数解释：**  最后更新时间。  **取值范围：**  不涉及。  **默认取值：**  不涉及。 
     * @return lastUpdateTime
     */
    public String getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public VersionModelQueryViewDTO withLatest(Boolean latest) {
        this.latest = latest;
        return this;
    }

    /**
     * **参数解释：**  是否为最新版本。  **取值范围：**  - true：是最新版本。 - false：不是最新版本。  **默认取值：**  false。 
     * @return latest
     */
    public Boolean getLatest() {
        return latest;
    }

    public void setLatest(Boolean latest) {
        this.latest = latest;
    }

    public VersionModelQueryViewDTO withLatestIteration(Boolean latestIteration) {
        this.latestIteration = latestIteration;
        return this;
    }

    /**
     * **参数解释：**  是否为最新迭代版本。  **取值范围：**  - true：是最新迭代版本。 - false：不是最新迭代版本。  **默认取值：**  false。 
     * @return latestIteration
     */
    public Boolean getLatestIteration() {
        return latestIteration;
    }

    public void setLatestIteration(Boolean latestIteration) {
        this.latestIteration = latestIteration;
    }

    public VersionModelQueryViewDTO withLatestVersion(Boolean latestVersion) {
        this.latestVersion = latestVersion;
        return this;
    }

    /**
     * **参数解释：**  是否为最新修订版本。  **取值范围：**  - true：是最新修订版本。 - false：不是最新修订版本。  **默认取值：**  false。 
     * @return latestVersion
     */
    public Boolean getLatestVersion() {
        return latestVersion;
    }

    public void setLatestVersion(Boolean latestVersion) {
        this.latestVersion = latestVersion;
    }

    public VersionModelQueryViewDTO withMaster(MasterObjectQueryViewDTO master) {
        this.master = master;
        return this;
    }

    public VersionModelQueryViewDTO withMaster(Consumer<MasterObjectQueryViewDTO> masterSetter) {
        if (this.master == null) {
            this.master = new MasterObjectQueryViewDTO();
            masterSetter.accept(this.master);
        }

        return this;
    }

    /**
     * Get master
     * @return master
     */
    public MasterObjectQueryViewDTO getMaster() {
        return master;
    }

    public void setMaster(MasterObjectQueryViewDTO master) {
        this.master = master;
    }

    public VersionModelQueryViewDTO withModifier(String modifier) {
        this.modifier = modifier;
        return this;
    }

    /**
     * **参数解释：**  修改人。  **取值范围：**  不涉及。  **默认取值：**  不涉及。 
     * @return modifier
     */
    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public VersionModelQueryViewDTO withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：**  中文名称。  **取值范围：**  不涉及。  **默认取值：**  不涉及。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VersionModelQueryViewDTO withPreVersionId(String preVersionId) {
        this.preVersionId = preVersionId;
        return this;
    }

    /**
     * **参数解释：**  前序版本实例ID。  **取值范围：**  不涉及。  **默认取值：**  不涉及。 
     * @return preVersionId
     */
    public String getPreVersionId() {
        return preVersionId;
    }

    public void setPreVersionId(String preVersionId) {
        this.preVersionId = preVersionId;
    }

    public VersionModelQueryViewDTO withRdmExtensionType(String rdmExtensionType) {
        this.rdmExtensionType = rdmExtensionType;
        return this;
    }

    /**
     * **参数解释：**  扩展类型。  **取值范围：**  不涉及。  **默认取值：**  不涉及。 
     * @return rdmExtensionType
     */
    public String getRdmExtensionType() {
        return rdmExtensionType;
    }

    public void setRdmExtensionType(String rdmExtensionType) {
        this.rdmExtensionType = rdmExtensionType;
    }

    public VersionModelQueryViewDTO withTenant(TenantQueryViewDTO tenant) {
        this.tenant = tenant;
        return this;
    }

    public VersionModelQueryViewDTO withTenant(Consumer<TenantQueryViewDTO> tenantSetter) {
        if (this.tenant == null) {
            this.tenant = new TenantQueryViewDTO();
            tenantSetter.accept(this.tenant);
        }

        return this;
    }

    /**
     * Get tenant
     * @return tenant
     */
    public TenantQueryViewDTO getTenant() {
        return tenant;
    }

    public void setTenant(TenantQueryViewDTO tenant) {
        this.tenant = tenant;
    }

    public VersionModelQueryViewDTO withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * **参数解释：**  版本号。  **取值范围：**  不涉及。  **默认取值：**  不涉及。 
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public VersionModelQueryViewDTO withVersionCode(Integer versionCode) {
        this.versionCode = versionCode;
        return this;
    }

    /**
     * **参数解释：**  业务版本内码。  **取值范围：**  不涉及。  **默认取值：**  不涉及。 
     * @return versionCode
     */
    public Integer getVersionCode() {
        return versionCode;
    }

    public void setVersionCode(Integer versionCode) {
        this.versionCode = versionCode;
    }

    public VersionModelQueryViewDTO withWorkingCopy(Boolean workingCopy) {
        this.workingCopy = workingCopy;
        return this;
    }

    /**
     * **参数解释：**  是否已检出。  **取值范围：**  - true：已检出。 - false：未检出。  **默认取值：**  不涉及。 
     * @return workingCopy
     */
    public Boolean getWorkingCopy() {
        return workingCopy;
    }

    public void setWorkingCopy(Boolean workingCopy) {
        this.workingCopy = workingCopy;
    }

    public VersionModelQueryViewDTO withWorkingState(WorkingState workingState) {
        this.workingState = workingState;
        return this;
    }

    public VersionModelQueryViewDTO withWorkingState(Consumer<WorkingState> workingStateSetter) {
        if (this.workingState == null) {
            this.workingState = new WorkingState();
            workingStateSetter.accept(this.workingState);
        }

        return this;
    }

    /**
     * Get workingState
     * @return workingState
     */
    public WorkingState getWorkingState() {
        return workingState;
    }

    public void setWorkingState(WorkingState workingState) {
        this.workingState = workingState;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VersionModelQueryViewDTO that = (VersionModelQueryViewDTO) obj;
        return Objects.equals(this.branch, that.branch) && Objects.equals(this.checkOutTime, that.checkOutTime)
            && Objects.equals(this.checkOutUserName, that.checkOutUserName)
            && Objects.equals(this.className, that.className) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.creator, that.creator) && Objects.equals(this.description, that.description)
            && Objects.equals(this.id, that.id) && Objects.equals(this.iteration, that.iteration)
            && Objects.equals(this.lastUpdateTime, that.lastUpdateTime) && Objects.equals(this.latest, that.latest)
            && Objects.equals(this.latestIteration, that.latestIteration)
            && Objects.equals(this.latestVersion, that.latestVersion) && Objects.equals(this.master, that.master)
            && Objects.equals(this.modifier, that.modifier) && Objects.equals(this.name, that.name)
            && Objects.equals(this.preVersionId, that.preVersionId)
            && Objects.equals(this.rdmExtensionType, that.rdmExtensionType) && Objects.equals(this.tenant, that.tenant)
            && Objects.equals(this.version, that.version) && Objects.equals(this.versionCode, that.versionCode)
            && Objects.equals(this.workingCopy, that.workingCopy)
            && Objects.equals(this.workingState, that.workingState);
    }

    @Override
    public int hashCode() {
        return Objects.hash(branch,
            checkOutTime,
            checkOutUserName,
            className,
            createTime,
            creator,
            description,
            id,
            iteration,
            lastUpdateTime,
            latest,
            latestIteration,
            latestVersion,
            master,
            modifier,
            name,
            preVersionId,
            rdmExtensionType,
            tenant,
            version,
            versionCode,
            workingCopy,
            workingState);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VersionModelQueryViewDTO {\n");
        sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
        sb.append("    checkOutTime: ").append(toIndentedString(checkOutTime)).append("\n");
        sb.append("    checkOutUserName: ").append(toIndentedString(checkOutUserName)).append("\n");
        sb.append("    className: ").append(toIndentedString(className)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    iteration: ").append(toIndentedString(iteration)).append("\n");
        sb.append("    lastUpdateTime: ").append(toIndentedString(lastUpdateTime)).append("\n");
        sb.append("    latest: ").append(toIndentedString(latest)).append("\n");
        sb.append("    latestIteration: ").append(toIndentedString(latestIteration)).append("\n");
        sb.append("    latestVersion: ").append(toIndentedString(latestVersion)).append("\n");
        sb.append("    master: ").append(toIndentedString(master)).append("\n");
        sb.append("    modifier: ").append(toIndentedString(modifier)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    preVersionId: ").append(toIndentedString(preVersionId)).append("\n");
        sb.append("    rdmExtensionType: ").append(toIndentedString(rdmExtensionType)).append("\n");
        sb.append("    tenant: ").append(toIndentedString(tenant)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    versionCode: ").append(toIndentedString(versionCode)).append("\n");
        sb.append("    workingCopy: ").append(toIndentedString(workingCopy)).append("\n");
        sb.append("    workingState: ").append(toIndentedString(workingState)).append("\n");
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
