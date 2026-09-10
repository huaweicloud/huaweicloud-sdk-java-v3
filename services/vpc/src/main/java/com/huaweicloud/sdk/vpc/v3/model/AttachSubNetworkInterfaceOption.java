package com.huaweicloud.sdk.vpc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AttachSubNetworkInterfaceOption
 */
public class AttachSubNetworkInterfaceOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_id")

    private String parentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_groups")

    private List<String> securityGroups = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_enabled")

    private Boolean securityEnabled;

    public AttachSubNetworkInterfaceOption withParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }

    /**
     * **参数解释**： 辅助弹性网卡所挂载的弹性网卡的ID。 **取值范围**： 带“-”的标准UUID格式。
     * @return parentId
     */
    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public AttachSubNetworkInterfaceOption withSecurityGroups(List<String> securityGroups) {
        this.securityGroups = securityGroups;
        return this;
    }

    public AttachSubNetworkInterfaceOption addSecurityGroupsItem(String securityGroupsItem) {
        if (this.securityGroups == null) {
            this.securityGroups = new ArrayList<>();
        }
        this.securityGroups.add(securityGroupsItem);
        return this;
    }

    public AttachSubNetworkInterfaceOption withSecurityGroups(Consumer<List<String>> securityGroupsSetter) {
        if (this.securityGroups == null) {
            this.securityGroups = new ArrayList<>();
        }
        securityGroupsSetter.accept(this.securityGroups);
        return this;
    }

    /**
     * **参数解释**： 辅助弹性网卡关联的安全组的ID列表。例如：\"security_groups\": [\"a0608cbf-d047-4f54-8b28-cd7b59853fff\"]。 **取值范围**： 如果请求时不指定此参数，辅助弹性网卡创建后会自动关联默认安全组。
     * @return securityGroups
     */
    public List<String> getSecurityGroups() {
        return securityGroups;
    }

    public void setSecurityGroups(List<String> securityGroups) {
        this.securityGroups = securityGroups;
    }

    public AttachSubNetworkInterfaceOption withSecurityEnabled(Boolean securityEnabled) {
        this.securityEnabled = securityEnabled;
        return this;
    }

    /**
     * **参数解释**： 辅助弹性网卡安全使能标记，如果不使能则安全组不生效。 **取值范围**： 不涉及。
     * @return securityEnabled
     */
    public Boolean getSecurityEnabled() {
        return securityEnabled;
    }

    public void setSecurityEnabled(Boolean securityEnabled) {
        this.securityEnabled = securityEnabled;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AttachSubNetworkInterfaceOption that = (AttachSubNetworkInterfaceOption) obj;
        return Objects.equals(this.parentId, that.parentId) && Objects.equals(this.securityGroups, that.securityGroups)
            && Objects.equals(this.securityEnabled, that.securityEnabled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(parentId, securityGroups, securityEnabled);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AttachSubNetworkInterfaceOption {\n");
        sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
        sb.append("    securityGroups: ").append(toIndentedString(securityGroups)).append("\n");
        sb.append("    securityEnabled: ").append(toIndentedString(securityEnabled)).append("\n");
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
