package com.huaweicloud.sdk.mrs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 角色部署元数据
 */
public class RoleDeployMeta {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "other")

    private Map<String, Object> other = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code_name")

    private String codeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "component")

    private String component;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_preference")

    private String nodePreference;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private String count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "affinity")

    private String affinity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "affinity_target")

    private String affinityTarget;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "multi_instance")

    private Integer multiInstance;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role_kind")

    private String roleKind;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "constraints")

    private List<String> constraints = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "multi_az_placement")

    private String multiAzPlacement;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "arbitration_deployment")

    private Boolean arbitrationDeployment;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_elb")

    private Boolean supportElb;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "multi_affinity_group_enable")

    private Boolean multiAffinityGroupEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "local_disks_anti_affinity")

    private Boolean localDisksAntiAffinity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "multi_instance_name_pattern")

    private String multiInstanceNamePattern;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_ip")

    private String privateIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "weight")

    private String weight;

    public RoleDeployMeta withOther(Map<String, Object> other) {
        this.other = other;
        return this;
    }

    public RoleDeployMeta putOtherItem(String key, Object otherItem) {
        if (this.other == null) {
            this.other = new HashMap<>();
        }
        this.other.put(key, otherItem);
        return this;
    }

    public RoleDeployMeta withOther(Consumer<Map<String, Object>> otherSetter) {
        if (this.other == null) {
            this.other = new HashMap<>();
        }
        otherSetter.accept(this.other);
        return this;
    }

    /**
     * 其他扩展属性
     * @return other
     */
    public Map<String, Object> getOther() {
        return other;
    }

    public void setOther(Map<String, Object> other) {
        this.other = other;
    }

    public RoleDeployMeta withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 角色名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RoleDeployMeta withCodeName(String codeName) {
        this.codeName = codeName;
        return this;
    }

    /**
     * 角色简称
     * @return codeName
     */
    public String getCodeName() {
        return codeName;
    }

    public void setCodeName(String codeName) {
        this.codeName = codeName;
    }

    public RoleDeployMeta withComponent(String component) {
        this.component = component;
        return this;
    }

    /**
     * 角色所属组件
     * @return component
     */
    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        this.component = component;
    }

    public RoleDeployMeta withNodePreference(String nodePreference) {
        this.nodePreference = nodePreference;
        return this;
    }

    /**
     * 部署倾向
     * @return nodePreference
     */
    public String getNodePreference() {
        return nodePreference;
    }

    public void setNodePreference(String nodePreference) {
        this.nodePreference = nodePreference;
    }

    public RoleDeployMeta withCount(String count) {
        this.count = count;
        return this;
    }

    /**
     * 角色数量限制
     * @return count
     */
    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public RoleDeployMeta withAffinity(String affinity) {
        this.affinity = affinity;
        return this;
    }

    /**
     * 亲和
     * @return affinity
     */
    public String getAffinity() {
        return affinity;
    }

    public void setAffinity(String affinity) {
        this.affinity = affinity;
    }

    public RoleDeployMeta withAffinityTarget(String affinityTarget) {
        this.affinityTarget = affinityTarget;
        return this;
    }

    /**
     * 亲和目标
     * @return affinityTarget
     */
    public String getAffinityTarget() {
        return affinityTarget;
    }

    public void setAffinityTarget(String affinityTarget) {
        this.affinityTarget = affinityTarget;
    }

    public RoleDeployMeta withMultiInstance(Integer multiInstance) {
        this.multiInstance = multiInstance;
        return this;
    }

    /**
     * 多实例
     * @return multiInstance
     */
    public Integer getMultiInstance() {
        return multiInstance;
    }

    public void setMultiInstance(Integer multiInstance) {
        this.multiInstance = multiInstance;
    }

    public RoleDeployMeta withRoleKind(String roleKind) {
        this.roleKind = roleKind;
        return this;
    }

    /**
     * 角色类型
     * @return roleKind
     */
    public String getRoleKind() {
        return roleKind;
    }

    public void setRoleKind(String roleKind) {
        this.roleKind = roleKind;
    }

    public RoleDeployMeta withConstraints(List<String> constraints) {
        this.constraints = constraints;
        return this;
    }

    public RoleDeployMeta addConstraintsItem(String constraintsItem) {
        if (this.constraints == null) {
            this.constraints = new ArrayList<>();
        }
        this.constraints.add(constraintsItem);
        return this;
    }

    public RoleDeployMeta withConstraints(Consumer<List<String>> constraintsSetter) {
        if (this.constraints == null) {
            this.constraints = new ArrayList<>();
        }
        constraintsSetter.accept(this.constraints);
        return this;
    }

    /**
     * 角色限制，包含当前组件角色的一些功能限制，例如：\"no_scale_in\"
     * @return constraints
     */
    public List<String> getConstraints() {
        return constraints;
    }

    public void setConstraints(List<String> constraints) {
        this.constraints = constraints;
    }

    public RoleDeployMeta withMultiAzPlacement(String multiAzPlacement) {
        this.multiAzPlacement = multiAzPlacement;
        return this;
    }

    /**
     * 多az部署
     * @return multiAzPlacement
     */
    public String getMultiAzPlacement() {
        return multiAzPlacement;
    }

    public void setMultiAzPlacement(String multiAzPlacement) {
        this.multiAzPlacement = multiAzPlacement;
    }

    public RoleDeployMeta withArbitrationDeployment(Boolean arbitrationDeployment) {
        this.arbitrationDeployment = arbitrationDeployment;
        return this;
    }

    /**
     * 仲裁部署
     * @return arbitrationDeployment
     */
    public Boolean getArbitrationDeployment() {
        return arbitrationDeployment;
    }

    public void setArbitrationDeployment(Boolean arbitrationDeployment) {
        this.arbitrationDeployment = arbitrationDeployment;
    }

    public RoleDeployMeta withSupportElb(Boolean supportElb) {
        this.supportElb = supportElb;
        return this;
    }

    /**
     * 支持ELB
     * @return supportElb
     */
    public Boolean getSupportElb() {
        return supportElb;
    }

    public void setSupportElb(Boolean supportElb) {
        this.supportElb = supportElb;
    }

    public RoleDeployMeta withMultiAffinityGroupEnable(Boolean multiAffinityGroupEnable) {
        this.multiAffinityGroupEnable = multiAffinityGroupEnable;
        return this;
    }

    /**
     * 启用多亲和组
     * @return multiAffinityGroupEnable
     */
    public Boolean getMultiAffinityGroupEnable() {
        return multiAffinityGroupEnable;
    }

    public void setMultiAffinityGroupEnable(Boolean multiAffinityGroupEnable) {
        this.multiAffinityGroupEnable = multiAffinityGroupEnable;
    }

    public RoleDeployMeta withLocalDisksAntiAffinity(Boolean localDisksAntiAffinity) {
        this.localDisksAntiAffinity = localDisksAntiAffinity;
        return this;
    }

    /**
     * 本地盘反亲和
     * @return localDisksAntiAffinity
     */
    public Boolean getLocalDisksAntiAffinity() {
        return localDisksAntiAffinity;
    }

    public void setLocalDisksAntiAffinity(Boolean localDisksAntiAffinity) {
        this.localDisksAntiAffinity = localDisksAntiAffinity;
    }

    public RoleDeployMeta withMultiInstanceNamePattern(String multiInstanceNamePattern) {
        this.multiInstanceNamePattern = multiInstanceNamePattern;
        return this;
    }

    /**
     * 多实例名称模式
     * @return multiInstanceNamePattern
     */
    public String getMultiInstanceNamePattern() {
        return multiInstanceNamePattern;
    }

    public void setMultiInstanceNamePattern(String multiInstanceNamePattern) {
        this.multiInstanceNamePattern = multiInstanceNamePattern;
    }

    public RoleDeployMeta withPrivateIp(String privateIp) {
        this.privateIp = privateIp;
        return this;
    }

    /**
     * 私有IP
     * @return privateIp
     */
    public String getPrivateIp() {
        return privateIp;
    }

    public void setPrivateIp(String privateIp) {
        this.privateIp = privateIp;
    }

    public RoleDeployMeta withWeight(String weight) {
        this.weight = weight;
        return this;
    }

    /**
     * 权重
     * @return weight
     */
    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RoleDeployMeta that = (RoleDeployMeta) obj;
        return Objects.equals(this.other, that.other) && Objects.equals(this.name, that.name)
            && Objects.equals(this.codeName, that.codeName) && Objects.equals(this.component, that.component)
            && Objects.equals(this.nodePreference, that.nodePreference) && Objects.equals(this.count, that.count)
            && Objects.equals(this.affinity, that.affinity) && Objects.equals(this.affinityTarget, that.affinityTarget)
            && Objects.equals(this.multiInstance, that.multiInstance) && Objects.equals(this.roleKind, that.roleKind)
            && Objects.equals(this.constraints, that.constraints)
            && Objects.equals(this.multiAzPlacement, that.multiAzPlacement)
            && Objects.equals(this.arbitrationDeployment, that.arbitrationDeployment)
            && Objects.equals(this.supportElb, that.supportElb)
            && Objects.equals(this.multiAffinityGroupEnable, that.multiAffinityGroupEnable)
            && Objects.equals(this.localDisksAntiAffinity, that.localDisksAntiAffinity)
            && Objects.equals(this.multiInstanceNamePattern, that.multiInstanceNamePattern)
            && Objects.equals(this.privateIp, that.privateIp) && Objects.equals(this.weight, that.weight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(other,
            name,
            codeName,
            component,
            nodePreference,
            count,
            affinity,
            affinityTarget,
            multiInstance,
            roleKind,
            constraints,
            multiAzPlacement,
            arbitrationDeployment,
            supportElb,
            multiAffinityGroupEnable,
            localDisksAntiAffinity,
            multiInstanceNamePattern,
            privateIp,
            weight);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RoleDeployMeta {\n");
        sb.append("    other: ").append(toIndentedString(other)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    codeName: ").append(toIndentedString(codeName)).append("\n");
        sb.append("    component: ").append(toIndentedString(component)).append("\n");
        sb.append("    nodePreference: ").append(toIndentedString(nodePreference)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    affinity: ").append(toIndentedString(affinity)).append("\n");
        sb.append("    affinityTarget: ").append(toIndentedString(affinityTarget)).append("\n");
        sb.append("    multiInstance: ").append(toIndentedString(multiInstance)).append("\n");
        sb.append("    roleKind: ").append(toIndentedString(roleKind)).append("\n");
        sb.append("    constraints: ").append(toIndentedString(constraints)).append("\n");
        sb.append("    multiAzPlacement: ").append(toIndentedString(multiAzPlacement)).append("\n");
        sb.append("    arbitrationDeployment: ").append(toIndentedString(arbitrationDeployment)).append("\n");
        sb.append("    supportElb: ").append(toIndentedString(supportElb)).append("\n");
        sb.append("    multiAffinityGroupEnable: ").append(toIndentedString(multiAffinityGroupEnable)).append("\n");
        sb.append("    localDisksAntiAffinity: ").append(toIndentedString(localDisksAntiAffinity)).append("\n");
        sb.append("    multiInstanceNamePattern: ").append(toIndentedString(multiInstanceNamePattern)).append("\n");
        sb.append("    privateIp: ").append(toIndentedString(privateIp)).append("\n");
        sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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
