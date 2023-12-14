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
 * 版本限制说明
 */
public class VersionConstraint {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "other")

    private Map<String, Object> other = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_constraint")

    private NodeConstraints nodeConstraint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "safe_mode_kerberos_exclude_components")

    private List<String> safeModeKerberosExcludeComponents = null;

    public VersionConstraint withOther(Map<String, Object> other) {
        this.other = other;
        return this;
    }

    public VersionConstraint putOtherItem(String key, Object otherItem) {
        if (this.other == null) {
            this.other = new HashMap<>();
        }
        this.other.put(key, otherItem);
        return this;
    }

    public VersionConstraint withOther(Consumer<Map<String, Object>> otherSetter) {
        if (this.other == null) {
            this.other = new HashMap<>();
        }
        otherSetter.accept(this.other);
        return this;
    }

    /**
     * 其他限制
     * @return other
     */
    public Map<String, Object> getOther() {
        return other;
    }

    public void setOther(Map<String, Object> other) {
        this.other = other;
    }

    public VersionConstraint withNodeConstraint(NodeConstraints nodeConstraint) {
        this.nodeConstraint = nodeConstraint;
        return this;
    }

    public VersionConstraint withNodeConstraint(Consumer<NodeConstraints> nodeConstraintSetter) {
        if (this.nodeConstraint == null) {
            this.nodeConstraint = new NodeConstraints();
            nodeConstraintSetter.accept(this.nodeConstraint);
        }

        return this;
    }

    /**
     * Get nodeConstraint
     * @return nodeConstraint
     */
    public NodeConstraints getNodeConstraint() {
        return nodeConstraint;
    }

    public void setNodeConstraint(NodeConstraints nodeConstraint) {
        this.nodeConstraint = nodeConstraint;
    }

    public VersionConstraint withSafeModeKerberosExcludeComponents(List<String> safeModeKerberosExcludeComponents) {
        this.safeModeKerberosExcludeComponents = safeModeKerberosExcludeComponents;
        return this;
    }

    public VersionConstraint addSafeModeKerberosExcludeComponentsItem(String safeModeKerberosExcludeComponentsItem) {
        if (this.safeModeKerberosExcludeComponents == null) {
            this.safeModeKerberosExcludeComponents = new ArrayList<>();
        }
        this.safeModeKerberosExcludeComponents.add(safeModeKerberosExcludeComponentsItem);
        return this;
    }

    public VersionConstraint withSafeModeKerberosExcludeComponents(
        Consumer<List<String>> safeModeKerberosExcludeComponentsSetter) {
        if (this.safeModeKerberosExcludeComponents == null) {
            this.safeModeKerberosExcludeComponents = new ArrayList<>();
        }
        safeModeKerberosExcludeComponentsSetter.accept(this.safeModeKerberosExcludeComponents);
        return this;
    }

    /**
     * 安全模式kerberos排除组件列表
     * @return safeModeKerberosExcludeComponents
     */
    public List<String> getSafeModeKerberosExcludeComponents() {
        return safeModeKerberosExcludeComponents;
    }

    public void setSafeModeKerberosExcludeComponents(List<String> safeModeKerberosExcludeComponents) {
        this.safeModeKerberosExcludeComponents = safeModeKerberosExcludeComponents;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VersionConstraint that = (VersionConstraint) obj;
        return Objects.equals(this.other, that.other) && Objects.equals(this.nodeConstraint, that.nodeConstraint)
            && Objects.equals(this.safeModeKerberosExcludeComponents, that.safeModeKerberosExcludeComponents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(other, nodeConstraint, safeModeKerberosExcludeComponents);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VersionConstraint {\n");
        sb.append("    other: ").append(toIndentedString(other)).append("\n");
        sb.append("    nodeConstraint: ").append(toIndentedString(nodeConstraint)).append("\n");
        sb.append("    safeModeKerberosExcludeComponents: ")
            .append(toIndentedString(safeModeKerberosExcludeComponents))
            .append("\n");
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
