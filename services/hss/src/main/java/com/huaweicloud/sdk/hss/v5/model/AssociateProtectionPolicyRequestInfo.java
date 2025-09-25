package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AssociateProtectionPolicyRequestInfo
 */
public class AssociateProtectionPolicyRequestInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_protection_policy_id")

    private String targetProtectionPolicyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_id_list")

    private List<String> hostIdList = null;

    public AssociateProtectionPolicyRequestInfo withTargetProtectionPolicyId(String targetProtectionPolicyId) {
        this.targetProtectionPolicyId = targetProtectionPolicyId;
        return this;
    }

    /**
     * 部署的目标策略组ID
     * @return targetProtectionPolicyId
     */
    public String getTargetProtectionPolicyId() {
        return targetProtectionPolicyId;
    }

    public void setTargetProtectionPolicyId(String targetProtectionPolicyId) {
        this.targetProtectionPolicyId = targetProtectionPolicyId;
    }

    public AssociateProtectionPolicyRequestInfo withHostIdList(List<String> hostIdList) {
        this.hostIdList = hostIdList;
        return this;
    }

    public AssociateProtectionPolicyRequestInfo addHostIdListItem(String hostIdListItem) {
        if (this.hostIdList == null) {
            this.hostIdList = new ArrayList<>();
        }
        this.hostIdList.add(hostIdListItem);
        return this;
    }

    public AssociateProtectionPolicyRequestInfo withHostIdList(Consumer<List<String>> hostIdListSetter) {
        if (this.hostIdList == null) {
            this.hostIdList = new ArrayList<>();
        }
        hostIdListSetter.accept(this.hostIdList);
        return this;
    }

    /**
     * **参数解释**: 服务器ID列表 **取值范围**: 不涉及 
     * @return hostIdList
     */
    public List<String> getHostIdList() {
        return hostIdList;
    }

    public void setHostIdList(List<String> hostIdList) {
        this.hostIdList = hostIdList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AssociateProtectionPolicyRequestInfo that = (AssociateProtectionPolicyRequestInfo) obj;
        return Objects.equals(this.targetProtectionPolicyId, that.targetProtectionPolicyId)
            && Objects.equals(this.hostIdList, that.hostIdList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(targetProtectionPolicyId, hostIdList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssociateProtectionPolicyRequestInfo {\n");
        sb.append("    targetProtectionPolicyId: ").append(toIndentedString(targetProtectionPolicyId)).append("\n");
        sb.append("    hostIdList: ").append(toIndentedString(hostIdList)).append("\n");
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
