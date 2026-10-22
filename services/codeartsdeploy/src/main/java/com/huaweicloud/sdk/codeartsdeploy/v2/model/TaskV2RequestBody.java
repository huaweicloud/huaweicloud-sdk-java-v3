package com.huaweicloud.sdk.codeartsdeploy.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * TaskV2RequestBody
 */
public class TaskV2RequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deploy_system")

    private String deploySystem;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_id")

    private String templateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ansible_type")

    private Integer ansibleType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_list")

    private List<DeployV2OperationsDO> operationList = null;

    public TaskV2RequestBody withDeploySystem(String deploySystem) {
        this.deploySystem = deploySystem;
        return this;
    }

    /**
     * 部署系统，deployTemplate：部署模板
     * @return deploySystem
     */
    public String getDeploySystem() {
        return deploySystem;
    }

    public void setDeploySystem(String deploySystem) {
        this.deploySystem = deploySystem;
    }

    public TaskV2RequestBody withTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }

    /**
     * 模板id
     * @return templateId
     */
    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public TaskV2RequestBody withAnsibleType(Integer ansibleType) {
        this.ansibleType = ansibleType;
        return this;
    }

    /**
     * 是否切换新系统支持，1：是 0：否
     * @return ansibleType
     */
    public Integer getAnsibleType() {
        return ansibleType;
    }

    public void setAnsibleType(Integer ansibleType) {
        this.ansibleType = ansibleType;
    }

    public TaskV2RequestBody withOperationList(List<DeployV2OperationsDO> operationList) {
        this.operationList = operationList;
        return this;
    }

    public TaskV2RequestBody addOperationListItem(DeployV2OperationsDO operationListItem) {
        if (this.operationList == null) {
            this.operationList = new ArrayList<>();
        }
        this.operationList.add(operationListItem);
        return this;
    }

    public TaskV2RequestBody withOperationList(Consumer<List<DeployV2OperationsDO>> operationListSetter) {
        if (this.operationList == null) {
            this.operationList = new ArrayList<>();
        }
        operationListSetter.accept(this.operationList);
        return this;
    }

    /**
     * 部署编排列表信息
     * @return operationList
     */
    public List<DeployV2OperationsDO> getOperationList() {
        return operationList;
    }

    public void setOperationList(List<DeployV2OperationsDO> operationList) {
        this.operationList = operationList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TaskV2RequestBody that = (TaskV2RequestBody) obj;
        return Objects.equals(this.deploySystem, that.deploySystem) && Objects.equals(this.templateId, that.templateId)
            && Objects.equals(this.ansibleType, that.ansibleType)
            && Objects.equals(this.operationList, that.operationList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deploySystem, templateId, ansibleType, operationList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskV2RequestBody {\n");
        sb.append("    deploySystem: ").append(toIndentedString(deploySystem)).append("\n");
        sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
        sb.append("    ansibleType: ").append(toIndentedString(ansibleType)).append("\n");
        sb.append("    operationList: ").append(toIndentedString(operationList)).append("\n");
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
