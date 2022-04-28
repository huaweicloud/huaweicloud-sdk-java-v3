package com.huaweicloud.sdk.functiongraph.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class StartSyncWorkflowExecutionResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execution_id")

    private String executionId;

    /**
     * 流程执行最终状态
     */
    public static final class StatusEnum {

        /**
         * Enum SUCCESS for value: "success"
         */
        public static final StatusEnum SUCCESS = new StatusEnum("success");

        /**
         * Enum FAIL for value: "fail"
         */
        public static final StatusEnum FAIL = new StatusEnum("fail");

        /**
         * Enum TIMEOUT for value: "timeout"
         */
        public static final StatusEnum TIMEOUT = new StatusEnum("timeout");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("success", SUCCESS);
            map.put("fail", FAIL);
            map.put("timeout", TIMEOUT);
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
    @JsonProperty(value = "output")

    private Object output;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "errors")

    private List<SyncExecutionNodeErrorDetail> errors = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "begin_time")

    private String beginTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    public StartSyncWorkflowExecutionResponse withExecutionId(String executionId) {
        this.executionId = executionId;
        return this;
    }

    /**
     * 错误码
     * @return executionId
     */
    public String getExecutionId() {
        return executionId;
    }

    public void setExecutionId(String executionId) {
        this.executionId = executionId;
    }

    public StartSyncWorkflowExecutionResponse withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 流程执行最终状态
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public StartSyncWorkflowExecutionResponse withOutput(Object output) {
        this.output = output;
        return this;
    }

    /**
     * 函数流的执行结果，JSON格式，仅在status为success时有值
     * @return output
     */
    public Object getOutput() {
        return output;
    }

    public void setOutput(Object output) {
        this.output = output;
    }

    public StartSyncWorkflowExecutionResponse withErrors(List<SyncExecutionNodeErrorDetail> errors) {
        this.errors = errors;
        return this;
    }

    public StartSyncWorkflowExecutionResponse addErrorsItem(SyncExecutionNodeErrorDetail errorsItem) {
        if (this.errors == null) {
            this.errors = new ArrayList<>();
        }
        this.errors.add(errorsItem);
        return this;
    }

    public StartSyncWorkflowExecutionResponse withErrors(Consumer<List<SyncExecutionNodeErrorDetail>> errorsSetter) {
        if (this.errors == null) {
            this.errors = new ArrayList<>();
        }
        errorsSetter.accept(this.errors);
        return this;
    }

    /**
     * 流程执行错误信息，仅在status为fail时有值
     * @return errors
     */
    public List<SyncExecutionNodeErrorDetail> getErrors() {
        return errors;
    }

    public void setErrors(List<SyncExecutionNodeErrorDetail> errors) {
        this.errors = errors;
    }

    public StartSyncWorkflowExecutionResponse withBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }

    /**
     * 流程实例创建时间，格式：yyyy-MM-ddTHH:mm:ssZ，UTC时间
     * @return beginTime
     */
    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public StartSyncWorkflowExecutionResponse withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 流程实例结束时间，格式：yyyy-MM-ddTHH:mm:ssZ，UTC时间
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StartSyncWorkflowExecutionResponse startSyncWorkflowExecutionResponse = (StartSyncWorkflowExecutionResponse) o;
        return Objects.equals(this.executionId, startSyncWorkflowExecutionResponse.executionId)
            && Objects.equals(this.status, startSyncWorkflowExecutionResponse.status)
            && Objects.equals(this.output, startSyncWorkflowExecutionResponse.output)
            && Objects.equals(this.errors, startSyncWorkflowExecutionResponse.errors)
            && Objects.equals(this.beginTime, startSyncWorkflowExecutionResponse.beginTime)
            && Objects.equals(this.endTime, startSyncWorkflowExecutionResponse.endTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(executionId, status, output, errors, beginTime, endTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StartSyncWorkflowExecutionResponse {\n");
        sb.append("    executionId: ").append(toIndentedString(executionId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    output: ").append(toIndentedString(output)).append("\n");
        sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
        sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
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
