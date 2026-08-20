package com.huaweicloud.sdk.aidatalakejobserver.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowSparkOperatorStateResponse extends SdkResponse {

    /**
     * **参数解释**：操作状态，用于标识异步操作的当前执行状态。 **取值范围**：   - RUNNING：运行中。   - FAILED：失败。   - SUCCESS：成功。
     */
    public static final class StatusEnum {

        /**
         * Enum RUNNING for value: "RUNNING"
         */
        public static final StatusEnum RUNNING = new StatusEnum("RUNNING");

        /**
         * Enum FAILED for value: "FAILED"
         */
        public static final StatusEnum FAILED = new StatusEnum("FAILED");

        /**
         * Enum SUCCESS for value: "SUCCESS"
         */
        public static final StatusEnum SUCCESS = new StatusEnum("SUCCESS");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("RUNNING", RUNNING);
            map.put("FAILED", FAILED);
            map.put("SUCCESS", SUCCESS);
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
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StatusEnum(value));
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
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
    @JsonProperty(value = "operator_info")

    private Object operatorInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Long endTime;

    public ShowSparkOperatorStateResponse withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**：操作状态，用于标识异步操作的当前执行状态。 **取值范围**：   - RUNNING：运行中。   - FAILED：失败。   - SUCCESS：成功。
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ShowSparkOperatorStateResponse withOperatorInfo(Object operatorInfo) {
        this.operatorInfo = operatorInfo;
        return this;
    }

    public ShowSparkOperatorStateResponse withOperatorInfo(Consumer<Object> operatorInfoSetter) {
        if (this.operatorInfo == null) {
            this.operatorInfo = new Object();
            operatorInfoSetter.accept(this.operatorInfo);
        }

        return this;
    }

    /**
     * **参数解释**：操作详情描述。
     * @return operatorInfo
     */
    public Object getOperatorInfo() {
        return operatorInfo;
    }

    public void setOperatorInfo(Object operatorInfo) {
        this.operatorInfo = operatorInfo;
    }

    public ShowSparkOperatorStateResponse withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * **参数解释**：操作描述信息，包含操作状态描述或失败时的错误信息。 **取值范围**：长度为0~1024个字符。
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ShowSparkOperatorStateResponse withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * **参数解释**：操作创建时间，用于记录操作提交的时间。 **取值范围**：Unix时间戳，单位为毫秒，取值范围为0~9223372036854775807。
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public ShowSparkOperatorStateResponse withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * **参数解释**：操作结束时间，用于记录操作完成的时间。 **取值范围**：Unix时间戳，单位为毫秒，取值范围为0~9223372036854775807。
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowSparkOperatorStateResponse that = (ShowSparkOperatorStateResponse) obj;
        return Objects.equals(this.status, that.status) && Objects.equals(this.operatorInfo, that.operatorInfo)
            && Objects.equals(this.message, that.message) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.endTime, that.endTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, operatorInfo, message, createTime, endTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSparkOperatorStateResponse {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    operatorInfo: ").append(toIndentedString(operatorInfo)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
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
