package com.huaweicloud.sdk.ucs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * UCSJobSpec
 */
public class UCSJobSpec {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "taskList")

    private List<UCSTask> taskList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domainID")

    private String domainID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation")

    private String operation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "waitTimeOut")

    private Integer waitTimeOut;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "relatedObjects")

    private Map<String, String> relatedObjects = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extendParam")

    private Map<String, Object> extendParam = null;

    public UCSJobSpec withTaskList(List<UCSTask> taskList) {
        this.taskList = taskList;
        return this;
    }

    public UCSJobSpec addTaskListItem(UCSTask taskListItem) {
        if (this.taskList == null) {
            this.taskList = new ArrayList<>();
        }
        this.taskList.add(taskListItem);
        return this;
    }

    public UCSJobSpec withTaskList(Consumer<List<UCSTask>> taskListSetter) {
        if (this.taskList == null) {
            this.taskList = new ArrayList<>();
        }
        taskListSetter.accept(this.taskList);
        return this;
    }

    /**
     * 任务列表
     * @return taskList
     */
    public List<UCSTask> getTaskList() {
        return taskList;
    }

    public void setTaskList(List<UCSTask> taskList) {
        this.taskList = taskList;
    }

    public UCSJobSpec withDomainID(String domainID) {
        this.domainID = domainID;
        return this;
    }

    /**
     * 用户的domainID
     * @return domainID
     */
    public String getDomainID() {
        return domainID;
    }

    public void setDomainID(String domainID) {
        this.domainID = domainID;
    }

    public UCSJobSpec withOperation(String operation) {
        this.operation = operation;
        return this;
    }

    /**
     * 操作，create和retry二选一
     * @return operation
     */
    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public UCSJobSpec withWaitTimeOut(Integer waitTimeOut) {
        this.waitTimeOut = waitTimeOut;
        return this;
    }

    /**
     * Job等待时间，单位：秒
     * @return waitTimeOut
     */
    public Integer getWaitTimeOut() {
        return waitTimeOut;
    }

    public void setWaitTimeOut(Integer waitTimeOut) {
        this.waitTimeOut = waitTimeOut;
    }

    public UCSJobSpec withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Job类别
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public UCSJobSpec withRelatedObjects(Map<String, String> relatedObjects) {
        this.relatedObjects = relatedObjects;
        return this;
    }

    public UCSJobSpec putRelatedObjectsItem(String key, String relatedObjectsItem) {
        if (this.relatedObjects == null) {
            this.relatedObjects = new HashMap<>();
        }
        this.relatedObjects.put(key, relatedObjectsItem);
        return this;
    }

    public UCSJobSpec withRelatedObjects(Consumer<Map<String, String>> relatedObjectsSetter) {
        if (this.relatedObjects == null) {
            this.relatedObjects = new HashMap<>();
        }
        relatedObjectsSetter.accept(this.relatedObjects);
        return this;
    }

    /**
     * 相关目标
     * @return relatedObjects
     */
    public Map<String, String> getRelatedObjects() {
        return relatedObjects;
    }

    public void setRelatedObjects(Map<String, String> relatedObjects) {
        this.relatedObjects = relatedObjects;
    }

    public UCSJobSpec withExtendParam(Map<String, Object> extendParam) {
        this.extendParam = extendParam;
        return this;
    }

    public UCSJobSpec putExtendParamItem(String key, Object extendParamItem) {
        if (this.extendParam == null) {
            this.extendParam = new HashMap<>();
        }
        this.extendParam.put(key, extendParamItem);
        return this;
    }

    public UCSJobSpec withExtendParam(Consumer<Map<String, Object>> extendParamSetter) {
        if (this.extendParam == null) {
            this.extendParam = new HashMap<>();
        }
        extendParamSetter.accept(this.extendParam);
        return this;
    }

    /**
     * 额外参数
     * @return extendParam
     */
    public Map<String, Object> getExtendParam() {
        return extendParam;
    }

    public void setExtendParam(Map<String, Object> extendParam) {
        this.extendParam = extendParam;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UCSJobSpec that = (UCSJobSpec) obj;
        return Objects.equals(this.taskList, that.taskList) && Objects.equals(this.domainID, that.domainID)
            && Objects.equals(this.operation, that.operation) && Objects.equals(this.waitTimeOut, that.waitTimeOut)
            && Objects.equals(this.type, that.type) && Objects.equals(this.relatedObjects, that.relatedObjects)
            && Objects.equals(this.extendParam, that.extendParam);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskList, domainID, operation, waitTimeOut, type, relatedObjects, extendParam);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UCSJobSpec {\n");
        sb.append("    taskList: ").append(toIndentedString(taskList)).append("\n");
        sb.append("    domainID: ").append(toIndentedString(domainID)).append("\n");
        sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
        sb.append("    waitTimeOut: ").append(toIndentedString(waitTimeOut)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    relatedObjects: ").append(toIndentedString(relatedObjects)).append("\n");
        sb.append("    extendParam: ").append(toIndentedString(extendParam)).append("\n");
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
