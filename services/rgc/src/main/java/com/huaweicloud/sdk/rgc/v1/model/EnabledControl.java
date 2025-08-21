package com.huaweicloud.sdk.rgc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 开启控制策略信息。
 */
public class EnabledControl {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "manage_account_id")

    private String manageAccountId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "control_identifier")

    private String controlIdentifier;

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

    public EnabledControl withManageAccountId(String manageAccountId) {
        this.manageAccountId = manageAccountId;
        return this;
    }

    /**
     * 管理员账号ID。
     * @return manageAccountId
     */
    public String getManageAccountId() {
        return manageAccountId;
    }

    public void setManageAccountId(String manageAccountId) {
        this.manageAccountId = manageAccountId;
    }

    public EnabledControl withControlIdentifier(String controlIdentifier) {
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

    public EnabledControl withName(String name) {
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

    public EnabledControl withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 控制策略描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public EnabledControl withControlObjective(String controlObjective) {
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

    public EnabledControl withBehavior(String behavior) {
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

    public EnabledControl withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * 控制策略来源。
     * @return owner
     */
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public EnabledControl withRegionalPreference(String regionalPreference) {
        this.regionalPreference = regionalPreference;
        return this;
    }

    /**
     * 区域选项，取值有两种分别是：区域的regional和全局的global。
     * @return regionalPreference
     */
    public String getRegionalPreference() {
        return regionalPreference;
    }

    public void setRegionalPreference(String regionalPreference) {
        this.regionalPreference = regionalPreference;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EnabledControl that = (EnabledControl) obj;
        return Objects.equals(this.manageAccountId, that.manageAccountId)
            && Objects.equals(this.controlIdentifier, that.controlIdentifier) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.controlObjective, that.controlObjective)
            && Objects.equals(this.behavior, that.behavior) && Objects.equals(this.owner, that.owner)
            && Objects.equals(this.regionalPreference, that.regionalPreference);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manageAccountId,
            controlIdentifier,
            name,
            description,
            controlObjective,
            behavior,
            owner,
            regionalPreference);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EnabledControl {\n");
        sb.append("    manageAccountId: ").append(toIndentedString(manageAccountId)).append("\n");
        sb.append("    controlIdentifier: ").append(toIndentedString(controlIdentifier)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    controlObjective: ").append(toIndentedString(controlObjective)).append("\n");
        sb.append("    behavior: ").append(toIndentedString(behavior)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    regionalPreference: ").append(toIndentedString(regionalPreference)).append("\n");
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
