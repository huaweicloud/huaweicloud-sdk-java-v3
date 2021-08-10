package com.huaweicloud.sdk.drs.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** 批量查询任务状态返回体 */
public class QueryJobStatusResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    /** 任务状态 */
    public static final class StatusEnum {

        /** Enum CREATING_ for value: "CREATING：创建中" */
        public static final StatusEnum CREATING_ = new StatusEnum("CREATING：创建中");

        /** Enum CREATE_FAILED_ for value: "CREATE_FAILED: 创建失败" */
        public static final StatusEnum CREATE_FAILED_ = new StatusEnum("CREATE_FAILED: 创建失败");

        /** Enum CONFIGURATION_ for value: "CONFIGURATION: 配置中" */
        public static final StatusEnum CONFIGURATION_ = new StatusEnum("CONFIGURATION: 配置中");

        /** Enum STARTJOBING_ for value: "STARTJOBING: 启动中" */
        public static final StatusEnum STARTJOBING_ = new StatusEnum("STARTJOBING: 启动中");

        /** Enum WAITING_FOR_START_ for value: "WAITING_FOR_START：等待启动中" */
        public static final StatusEnum WAITING_FOR_START_ = new StatusEnum("WAITING_FOR_START：等待启动中");

        /** Enum START_JOB_FAILED_ for value: "START_JOB_FAILED：任务启动失败" */
        public static final StatusEnum START_JOB_FAILED_ = new StatusEnum("START_JOB_FAILED：任务启动失败");

        /** Enum FULL_TRANSFER_STARTED_ for value: "FULL_TRANSFER_STARTED：全量迁移中，灾备场景为初始化" */
        public static final StatusEnum FULL_TRANSFER_STARTED_ = new StatusEnum("FULL_TRANSFER_STARTED：全量迁移中，灾备场景为初始化");

        /** Enum FULL_TRANSFER_FAILED_ for value: "FULL_TRANSFER_FAILED：全量迁移失败，灾备场景为初始化失败" */
        public static final StatusEnum FULL_TRANSFER_FAILED_ = new StatusEnum("FULL_TRANSFER_FAILED：全量迁移失败，灾备场景为初始化失败");

        /** Enum FULL_TRANSFER_COMPLETE_ for value: "FULL_TRANSFER_COMPLETE：全量迁移完成，灾备场景为初始化完成" */
        public static final StatusEnum FULL_TRANSFER_COMPLETE_ =
            new StatusEnum("FULL_TRANSFER_COMPLETE：全量迁移完成，灾备场景为初始化完成");

        /** Enum INCRE_TRANSFER_STARTED_ for value: "INCRE_TRANSFER_STARTED：增量迁移中，灾备场景为灾备中" */
        public static final StatusEnum INCRE_TRANSFER_STARTED_ =
            new StatusEnum("INCRE_TRANSFER_STARTED：增量迁移中，灾备场景为灾备中");

        /** Enum INCRE_TRANSFER_FAILED_ for value: "INCRE_TRANSFER_FAILED：增量迁移失败，灾备场景为灾备异常" */
        public static final StatusEnum INCRE_TRANSFER_FAILED_ =
            new StatusEnum("INCRE_TRANSFER_FAILED：增量迁移失败，灾备场景为灾备异常");

        /** Enum RELEASE_RESOURCE_STARTED_ for value: "RELEASE_RESOURCE_STARTED：结束任务中" */
        public static final StatusEnum RELEASE_RESOURCE_STARTED_ = new StatusEnum("RELEASE_RESOURCE_STARTED：结束任务中");

        /** Enum RELEASE_RESOURCE_FAILED_ for value: "RELEASE_RESOURCE_FAILED：结束任务失败" */
        public static final StatusEnum RELEASE_RESOURCE_FAILED_ = new StatusEnum("RELEASE_RESOURCE_FAILED：结束任务失败");

        /** Enum RELEASE_RESOURCE_COMPLETE_ for value: "RELEASE_RESOURCE_COMPLETE：已结束" */
        public static final StatusEnum RELEASE_RESOURCE_COMPLETE_ = new StatusEnum("RELEASE_RESOURCE_COMPLETE：已结束");

        /** Enum CHANGE_JOB_STARTED_ for value: "CHANGE_JOB_STARTED：任务变更中" */
        public static final StatusEnum CHANGE_JOB_STARTED_ = new StatusEnum("CHANGE_JOB_STARTED：任务变更中");

        /** Enum CHANGE_JOB_FAILED_ for value: "CHANGE_JOB_FAILED：任务变更失败" */
        public static final StatusEnum CHANGE_JOB_FAILED_ = new StatusEnum("CHANGE_JOB_FAILED：任务变更失败");

        /** Enum CHILD_TRANSFER_STARTING_ for value: "CHILD_TRANSFER_STARTING：子任务启动中" */
        public static final StatusEnum CHILD_TRANSFER_STARTING_ = new StatusEnum("CHILD_TRANSFER_STARTING：子任务启动中");

        /** Enum CHILD_TRANSFER_STARTED_ for value: "CHILD_TRANSFER_STARTED：子任务迁移中" */
        public static final StatusEnum CHILD_TRANSFER_STARTED_ = new StatusEnum("CHILD_TRANSFER_STARTED：子任务迁移中");

        /** Enum CHILD_TRANSFER_COMPLETE_ for value: "CHILD_TRANSFER_COMPLETE：子任务迁移完成" */
        public static final StatusEnum CHILD_TRANSFER_COMPLETE_ = new StatusEnum("CHILD_TRANSFER_COMPLETE：子任务迁移完成");

        /** Enum CHILD_TRANSFER_FAILED_ for value: "CHILD_TRANSFER_FAILED：子任务迁移失败" */
        public static final StatusEnum CHILD_TRANSFER_FAILED_ = new StatusEnum("CHILD_TRANSFER_FAILED：子任务迁移失败");

        /** Enum RELEASE_CHILD_TRANSFER_STARTED_ for value: "RELEASE_CHILD_TRANSFER_STARTED：子任务结束中" */
        public static final StatusEnum RELEASE_CHILD_TRANSFER_STARTED_ =
            new StatusEnum("RELEASE_CHILD_TRANSFER_STARTED：子任务结束中");

        /** Enum RELEASE_CHILD_TRANSFER_COMPLETE_ for value: "RELEASE_CHILD_TRANSFER_COMPLETE：子任务已结束" */
        public static final StatusEnum RELEASE_CHILD_TRANSFER_COMPLETE_ =
            new StatusEnum("RELEASE_CHILD_TRANSFER_COMPLETE：子任务已结束");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("CREATING：创建中", CREATING_);
            map.put("CREATE_FAILED: 创建失败", CREATE_FAILED_);
            map.put("CONFIGURATION: 配置中", CONFIGURATION_);
            map.put("STARTJOBING: 启动中", STARTJOBING_);
            map.put("WAITING_FOR_START：等待启动中", WAITING_FOR_START_);
            map.put("START_JOB_FAILED：任务启动失败", START_JOB_FAILED_);
            map.put("FULL_TRANSFER_STARTED：全量迁移中，灾备场景为初始化", FULL_TRANSFER_STARTED_);
            map.put("FULL_TRANSFER_FAILED：全量迁移失败，灾备场景为初始化失败", FULL_TRANSFER_FAILED_);
            map.put("FULL_TRANSFER_COMPLETE：全量迁移完成，灾备场景为初始化完成", FULL_TRANSFER_COMPLETE_);
            map.put("INCRE_TRANSFER_STARTED：增量迁移中，灾备场景为灾备中", INCRE_TRANSFER_STARTED_);
            map.put("INCRE_TRANSFER_FAILED：增量迁移失败，灾备场景为灾备异常", INCRE_TRANSFER_FAILED_);
            map.put("RELEASE_RESOURCE_STARTED：结束任务中", RELEASE_RESOURCE_STARTED_);
            map.put("RELEASE_RESOURCE_FAILED：结束任务失败", RELEASE_RESOURCE_FAILED_);
            map.put("RELEASE_RESOURCE_COMPLETE：已结束", RELEASE_RESOURCE_COMPLETE_);
            map.put("CHANGE_JOB_STARTED：任务变更中", CHANGE_JOB_STARTED_);
            map.put("CHANGE_JOB_FAILED：任务变更失败", CHANGE_JOB_FAILED_);
            map.put("CHILD_TRANSFER_STARTING：子任务启动中", CHILD_TRANSFER_STARTING_);
            map.put("CHILD_TRANSFER_STARTED：子任务迁移中", CHILD_TRANSFER_STARTED_);
            map.put("CHILD_TRANSFER_COMPLETE：子任务迁移完成", CHILD_TRANSFER_COMPLETE_);
            map.put("CHILD_TRANSFER_FAILED：子任务迁移失败", CHILD_TRANSFER_FAILED_);
            map.put("RELEASE_CHILD_TRANSFER_STARTED：子任务结束中", RELEASE_CHILD_TRANSFER_STARTED_);
            map.put("RELEASE_CHILD_TRANSFER_COMPLETE：子任务已结束", RELEASE_CHILD_TRANSFER_COMPLETE_);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StatusEnum(value);
            }
            return result;
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_code")

    private String errorCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_message")

    private String errorMessage;

    public QueryJobStatusResp withId(String id) {
        this.id = id;
        return this;
    }

    /** 任务ID
     * 
     * @return id */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public QueryJobStatusResp withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /** 任务状态
     * 
     * @return status */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public QueryJobStatusResp withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /** 错误码
     * 
     * @return errorCode */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public QueryJobStatusResp withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    /** 错误信息
     * 
     * @return errorMessage */
    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QueryJobStatusResp queryJobStatusResp = (QueryJobStatusResp) o;
        return Objects.equals(this.id, queryJobStatusResp.id) && Objects.equals(this.status, queryJobStatusResp.status)
            && Objects.equals(this.errorCode, queryJobStatusResp.errorCode)
            && Objects.equals(this.errorMessage, queryJobStatusResp.errorMessage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, status, errorCode, errorMessage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryJobStatusResp {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
