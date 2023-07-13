package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AssociatePolicyGroupRequestInfo
 */
public class AssociatePolicyGroupRequestInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_policy_group_id")

    private String targetPolicyGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operate_all")

    private Boolean operateAll;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_id_list")

    private List<String> hostIdList = null;

    public AssociatePolicyGroupRequestInfo withTargetPolicyGroupId(String targetPolicyGroupId) {
        this.targetPolicyGroupId = targetPolicyGroupId;
        return this;
    }

    /**
     * 部署的目标策略组ID
     * @return targetPolicyGroupId
     */
    public String getTargetPolicyGroupId() {
        return targetPolicyGroupId;
    }

    public void setTargetPolicyGroupId(String targetPolicyGroupId) {
        this.targetPolicyGroupId = targetPolicyGroupId;
    }

    public AssociatePolicyGroupRequestInfo withOperateAll(Boolean operateAll) {
        this.operateAll = operateAll;
        return this;
    }

    /**
     * 是否要对全量主机部署策略，如果为true的话，不需填写host_id_list，如果为false的话，需要填写host_id_list
     * @return operateAll
     */
    public Boolean getOperateAll() {
        return operateAll;
    }

    public void setOperateAll(Boolean operateAll) {
        this.operateAll = operateAll;
    }

    public AssociatePolicyGroupRequestInfo withHostIdList(List<String> hostIdList) {
        this.hostIdList = hostIdList;
        return this;
    }

    public AssociatePolicyGroupRequestInfo addHostIdListItem(String hostIdListItem) {
        if (this.hostIdList == null) {
            this.hostIdList = new ArrayList<>();
        }
        this.hostIdList.add(hostIdListItem);
        return this;
    }

    public AssociatePolicyGroupRequestInfo withHostIdList(Consumer<List<String>> hostIdListSetter) {
        if (this.hostIdList == null) {
            this.hostIdList = new ArrayList<>();
        }
        hostIdListSetter.accept(this.hostIdList);
        return this;
    }

    /**
     * 服务器ID列表
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
        AssociatePolicyGroupRequestInfo that = (AssociatePolicyGroupRequestInfo) obj;
        return Objects.equals(this.targetPolicyGroupId, that.targetPolicyGroupId)
            && Objects.equals(this.operateAll, that.operateAll) && Objects.equals(this.hostIdList, that.hostIdList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(targetPolicyGroupId, operateAll, hostIdList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssociatePolicyGroupRequestInfo {\n");
        sb.append("    targetPolicyGroupId: ").append(toIndentedString(targetPolicyGroupId)).append("\n");
        sb.append("    operateAll: ").append(toIndentedString(operateAll)).append("\n");
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
