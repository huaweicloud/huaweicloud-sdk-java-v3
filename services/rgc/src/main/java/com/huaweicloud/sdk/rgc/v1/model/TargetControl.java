package com.huaweicloud.sdk.rgc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 治理策略概要。
 */
public class TargetControl {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "manage_account_id")

    private String manageAccountId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "control_identifier")

    private String controlIdentifier;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "control_objective")

    private String controlObjective;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "behavior")

    private String behavior;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner")

    private String owner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "regional_preference")

    private String regionalPreference;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "guidance")

    private String guidance;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service")

    private String service;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "implementation")

    private String implementation;

    public TargetControl withManageAccountId(String manageAccountId) {
        this.manageAccountId = manageAccountId;
        return this;
    }

    /**
     * 管理账号ID。
     * @return manageAccountId
     */
    public String getManageAccountId() {
        return manageAccountId;
    }

    public void setManageAccountId(String manageAccountId) {
        this.manageAccountId = manageAccountId;
    }

    public TargetControl withControlIdentifier(String controlIdentifier) {
        this.controlIdentifier = controlIdentifier;
        return this;
    }

    /**
     * 控制策略标识。
     * @return controlIdentifier
     */
    public String getControlIdentifier() {
        return controlIdentifier;
    }

    public void setControlIdentifier(String controlIdentifier) {
        this.controlIdentifier = controlIdentifier;
    }

    public TargetControl withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * 控制策略启用状态。
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public TargetControl withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 控制策略当前版本号。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public TargetControl withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 控制策略名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TargetControl withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 控制策略描述信息。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TargetControl withControlObjective(String controlObjective) {
        this.controlObjective = controlObjective;
        return this;
    }

    /**
     * 控制策略目标。
     * @return controlObjective
     */
    public String getControlObjective() {
        return controlObjective;
    }

    public void setControlObjective(String controlObjective) {
        this.controlObjective = controlObjective;
    }

    public TargetControl withBehavior(String behavior) {
        this.behavior = behavior;
        return this;
    }

    /**
     * 控制策略类型。包括主动性控制策略Proactive、检测性控制策略Detective、预防性控制策略Preventive。
     * @return behavior
     */
    public String getBehavior() {
        return behavior;
    }

    public void setBehavior(String behavior) {
        this.behavior = behavior;
    }

    public TargetControl withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * 账号的创建来源，包括CUSTOM和RGC。
     * @return owner
     */
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public TargetControl withRegionalPreference(String regionalPreference) {
        this.regionalPreference = regionalPreference;
        return this;
    }

    /**
     * regional/global。
     * @return regionalPreference
     */
    public String getRegionalPreference() {
        return regionalPreference;
    }

    public void setRegionalPreference(String regionalPreference) {
        this.regionalPreference = regionalPreference;
    }

    public TargetControl withGuidance(String guidance) {
        this.guidance = guidance;
        return this;
    }

    /**
     * 控制策略必须性。
     * @return guidance
     */
    public String getGuidance() {
        return guidance;
    }

    public void setGuidance(String guidance) {
        this.guidance = guidance;
    }

    public TargetControl withService(String service) {
        this.service = service;
        return this;
    }

    /**
     * 控制策略所属服务。
     * @return service
     */
    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public TargetControl withImplementation(String implementation) {
        this.implementation = implementation;
        return this;
    }

    /**
     * 业务控制策略（SCP），配置规则。
     * @return implementation
     */
    public String getImplementation() {
        return implementation;
    }

    public void setImplementation(String implementation) {
        this.implementation = implementation;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TargetControl that = (TargetControl) obj;
        return Objects.equals(this.manageAccountId, that.manageAccountId)
            && Objects.equals(this.controlIdentifier, that.controlIdentifier) && Objects.equals(this.state, that.state)
            && Objects.equals(this.version, that.version) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.controlObjective, that.controlObjective)
            && Objects.equals(this.behavior, that.behavior) && Objects.equals(this.owner, that.owner)
            && Objects.equals(this.regionalPreference, that.regionalPreference)
            && Objects.equals(this.guidance, that.guidance) && Objects.equals(this.service, that.service)
            && Objects.equals(this.implementation, that.implementation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manageAccountId,
            controlIdentifier,
            state,
            version,
            name,
            description,
            controlObjective,
            behavior,
            owner,
            regionalPreference,
            guidance,
            service,
            implementation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TargetControl {\n");
        sb.append("    manageAccountId: ").append(toIndentedString(manageAccountId)).append("\n");
        sb.append("    controlIdentifier: ").append(toIndentedString(controlIdentifier)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    controlObjective: ").append(toIndentedString(controlObjective)).append("\n");
        sb.append("    behavior: ").append(toIndentedString(behavior)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    regionalPreference: ").append(toIndentedString(regionalPreference)).append("\n");
        sb.append("    guidance: ").append(toIndentedString(guidance)).append("\n");
        sb.append("    service: ").append(toIndentedString(service)).append("\n");
        sb.append("    implementation: ").append(toIndentedString(implementation)).append("\n");
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
