package com.huaweicloud.sdk.oroas.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowTaskRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Apig-AppCode")

    private String xApigAppCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_group")

    private String serviceGroup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_type")

    private String serviceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "input_enable")

    private Boolean inputEnable;

    public ShowTaskRequest withXApigAppCode(String xApigAppCode) {
        this.xApigAppCode = xApigAppCode;
        return this;
    }

    /**
     * 用户凭证
     * @return xApigAppCode
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Apig-AppCode")
    public String getXApigAppCode() {
        return xApigAppCode;
    }

    public void setXApigAppCode(String xApigAppCode) {
        this.xApigAppCode = xApigAppCode;
    }

    public ShowTaskRequest withServiceGroup(String serviceGroup) {
        this.serviceGroup = serviceGroup;
        return this;
    }

    /**
     * 服务类别，针对不同服务类场景，为用户提前填充对应值，用户侧不需单独赋值；当前仅支持 二维切割 2dcut ，便于后续扩展
     * @return serviceGroup
     */
    public String getServiceGroup() {
        return serviceGroup;
    }

    public void setServiceGroup(String serviceGroup) {
        this.serviceGroup = serviceGroup;
    }

    public ShowTaskRequest withServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }

    /**
     * 子服务类型，针对不同服务，为用户提前填充对应值，用户侧不需单独赋值；服装切割固定为 irregular-textile，雕刻机切割固定为 engraving-machine-cutting， 板材切割固定为 regular-plate
     * @return serviceType
     */
    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public ShowTaskRequest withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 任务id
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public ShowTaskRequest withInputEnable(Boolean inputEnable) {
        this.inputEnable = inputEnable;
        return this;
    }

    /**
     * 是否返回输入信息，默认为false； 当前暂不支持该功能，后续扩展
     * @return inputEnable
     */
    public Boolean getInputEnable() {
        return inputEnable;
    }

    public void setInputEnable(Boolean inputEnable) {
        this.inputEnable = inputEnable;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowTaskRequest that = (ShowTaskRequest) obj;
        return Objects.equals(this.xApigAppCode, that.xApigAppCode)
            && Objects.equals(this.serviceGroup, that.serviceGroup)
            && Objects.equals(this.serviceType, that.serviceType) && Objects.equals(this.taskId, that.taskId)
            && Objects.equals(this.inputEnable, that.inputEnable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xApigAppCode, serviceGroup, serviceType, taskId, inputEnable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTaskRequest {\n");
        sb.append("    xApigAppCode: ").append(toIndentedString(xApigAppCode)).append("\n");
        sb.append("    serviceGroup: ").append(toIndentedString(serviceGroup)).append("\n");
        sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    inputEnable: ").append(toIndentedString(inputEnable)).append("\n");
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
