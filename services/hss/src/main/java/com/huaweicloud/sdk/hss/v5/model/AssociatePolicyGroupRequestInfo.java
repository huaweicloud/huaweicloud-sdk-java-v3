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
    @JsonProperty(value = "deploy_type")

    private String deployType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_id_list")

    private List<String> hostIdList = null;

    public AssociatePolicyGroupRequestInfo withTargetPolicyGroupId(String targetPolicyGroupId) {
        this.targetPolicyGroupId = targetPolicyGroupId;
        return this;
    }

    /**
     * **参数解释**: 部署的目标策略组ID **约束限制**: 需查询ListPolicyGroup接口，仅支持传其返回参数data_list中support_version等于hss.version.premium或hss.version.container.enterprise的group_id **取值范围**: 只能由英文字母、数字及“-”组成，字符长度36-64位 **默认取值**: 不涉及 
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
     * **参数解释**: 是否要对全量主机/pod实例/工作负载/集群部署策略。 **约束限制**: 不涉及 **取值范围**: - true: 自动筛选符合策略组支持版本和操作系统版本的全量主机/pod实例/工作负载/集群部署策略，不需填写host_id_list。 - false: 非全量部署，仅对指定的主机/pod实例/工作负载/集群部署策略，需要填写host_id_list。  **默认取值**: 不涉及 
     * @return operateAll
     */
    public Boolean getOperateAll() {
        return operateAll;
    }

    public void setOperateAll(Boolean operateAll) {
        this.operateAll = operateAll;
    }

    public AssociatePolicyGroupRequestInfo withDeployType(String deployType) {
        this.deployType = deployType;
        return this;
    }

    /**
     * **参数解释**: 需要部署策略组的实例类型（预留字段） **约束限制**: 不涉及 **取值范围**: - host: 主机。 - pod: pod实例。 - workload: 工作负载。 - cluster: 集群。  **默认取值**: host 
     * @return deployType
     */
    public String getDeployType() {
        return deployType;
    }

    public void setDeployType(String deployType) {
        this.deployType = deployType;
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
     * **参数解释**: 需要部署策略组的已开启旗舰版或容器版防护的主机/pod实例/负载/集群ID列表 **约束限制**: 需查询ListHostStatus接口，仅支持传其返回参数data_list中version等于hss.version.premium或hss.version.container.enterprise的host_id **取值范围**: 最少0条，最多10000条 **默认取值**: 不涉及 
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
            && Objects.equals(this.operateAll, that.operateAll) && Objects.equals(this.deployType, that.deployType)
            && Objects.equals(this.hostIdList, that.hostIdList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(targetPolicyGroupId, operateAll, deployType, hostIdList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssociatePolicyGroupRequestInfo {\n");
        sb.append("    targetPolicyGroupId: ").append(toIndentedString(targetPolicyGroupId)).append("\n");
        sb.append("    operateAll: ").append(toIndentedString(operateAll)).append("\n");
        sb.append("    deployType: ").append(toIndentedString(deployType)).append("\n");
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
