package com.huaweicloud.sdk.ucs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 由API Server自动维护的字段所有权记录，用于Server-Side Apply的冲突检测与字段级并发管理。
 */
public class ManagedFieldsEntry {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "manager")

    private String manager;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation")

    private String operation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apiVersion")

    private String apiVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time")

    private String time;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fieldsType")

    private String fieldsType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fieldsV1")

    private Object fieldsV1;

    public ManagedFieldsEntry withManager(String manager) {
        this.manager = manager;
        return this;
    }

    /**
     * 管理者的名称
     * @return manager
     */
    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public ManagedFieldsEntry withOperation(String operation) {
        this.operation = operation;
        return this;
    }

    /**
     * 记录导致此条目创建的操作类型，只能是 Apply 或 Update 两种操作类型
     * @return operation
     */
    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public ManagedFieldsEntry withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /**
     * 该管理者定义字段时所依据的资源 API 版本
     * @return apiVersion
     */
    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public ManagedFieldsEntry withTime(String time) {
        this.time = time;
        return this;
    }

    /**
     * 此管理条目被创建或最后一次更新的时间戳
     * @return time
     */
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public ManagedFieldsEntry withFieldsType(String fieldsType) {
        this.fieldsType = fieldsType;
        return this;
    }

    /**
     * 固定为 \"FieldsV1\"，标记字段结构格式
     * @return fieldsType
     */
    public String getFieldsType() {
        return fieldsType;
    }

    public void setFieldsType(String fieldsType) {
        this.fieldsType = fieldsType;
    }

    public ManagedFieldsEntry withFieldsV1(Object fieldsV1) {
        this.fieldsV1 = fieldsV1;
        return this;
    }

    /**
     * 用于存储实际被管理的字段信息
     * @return fieldsV1
     */
    public Object getFieldsV1() {
        return fieldsV1;
    }

    public void setFieldsV1(Object fieldsV1) {
        this.fieldsV1 = fieldsV1;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ManagedFieldsEntry that = (ManagedFieldsEntry) obj;
        return Objects.equals(this.manager, that.manager) && Objects.equals(this.operation, that.operation)
            && Objects.equals(this.apiVersion, that.apiVersion) && Objects.equals(this.time, that.time)
            && Objects.equals(this.fieldsType, that.fieldsType) && Objects.equals(this.fieldsV1, that.fieldsV1);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manager, operation, apiVersion, time, fieldsType, fieldsV1);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ManagedFieldsEntry {\n");
        sb.append("    manager: ").append(toIndentedString(manager)).append("\n");
        sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
        sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
        sb.append("    fieldsType: ").append(toIndentedString(fieldsType)).append("\n");
        sb.append("    fieldsV1: ").append(toIndentedString(fieldsV1)).append("\n");
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
