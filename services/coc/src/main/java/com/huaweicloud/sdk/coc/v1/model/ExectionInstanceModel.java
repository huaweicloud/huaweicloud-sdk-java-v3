package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 执行主机实例详情
 */
public class ExectionInstanceModel {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Long id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_instance")

    private ResourceInstance targetInstance;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gmt_created")

    private Long gmtCreated;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gmt_finished")

    private Long gmtFinished;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_costs")

    private Long executeCosts;

    /**
     * 实例执行状态
     */
    public static final class StatusEnum {

        /**
         * Enum READY for value: "READY"
         */
        public static final StatusEnum READY = new StatusEnum("READY");

        /**
         * Enum PROCESSING for value: "PROCESSING"
         */
        public static final StatusEnum PROCESSING = new StatusEnum("PROCESSING");

        /**
         * Enum ABNORMAL for value: "ABNORMAL"
         */
        public static final StatusEnum ABNORMAL = new StatusEnum("ABNORMAL");

        /**
         * Enum CANCELED for value: "CANCELED"
         */
        public static final StatusEnum CANCELED = new StatusEnum("CANCELED");

        /**
         * Enum FINISHED for value: "FINISHED"
         */
        public static final StatusEnum FINISHED = new StatusEnum("FINISHED");

        /**
         * Enum ROLLBACKED for value: "ROLLBACKED"
         */
        public static final StatusEnum ROLLBACKED = new StatusEnum("ROLLBACKED");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("READY", READY);
            map.put("PROCESSING", PROCESSING);
            map.put("ABNORMAL", ABNORMAL);
            map.put("CANCELED", CANCELED);
            map.put("FINISHED", FINISHED);
            map.put("ROLLBACKED", ROLLBACKED);
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
    @JsonProperty(value = "message")

    private String message;

    public ExectionInstanceModel withId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * 主键id
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ExectionInstanceModel withTargetInstance(ResourceInstance targetInstance) {
        this.targetInstance = targetInstance;
        return this;
    }

    public ExectionInstanceModel withTargetInstance(Consumer<ResourceInstance> targetInstanceSetter) {
        if (this.targetInstance == null) {
            this.targetInstance = new ResourceInstance();
            targetInstanceSetter.accept(this.targetInstance);
        }

        return this;
    }

    /**
     * Get targetInstance
     * @return targetInstance
     */
    public ResourceInstance getTargetInstance() {
        return targetInstance;
    }

    public void setTargetInstance(ResourceInstance targetInstance) {
        this.targetInstance = targetInstance;
    }

    public ExectionInstanceModel withGmtCreated(Long gmtCreated) {
        this.gmtCreated = gmtCreated;
        return this;
    }

    /**
     * 创建时间
     * @return gmtCreated
     */
    public Long getGmtCreated() {
        return gmtCreated;
    }

    public void setGmtCreated(Long gmtCreated) {
        this.gmtCreated = gmtCreated;
    }

    public ExectionInstanceModel withGmtFinished(Long gmtFinished) {
        this.gmtFinished = gmtFinished;
        return this;
    }

    /**
     * 完成时间
     * @return gmtFinished
     */
    public Long getGmtFinished() {
        return gmtFinished;
    }

    public void setGmtFinished(Long gmtFinished) {
        this.gmtFinished = gmtFinished;
    }

    public ExectionInstanceModel withExecuteCosts(Long executeCosts) {
        this.executeCosts = executeCosts;
        return this;
    }

    /**
     * 耗时时间，单位:秒
     * @return executeCosts
     */
    public Long getExecuteCosts() {
        return executeCosts;
    }

    public void setExecuteCosts(Long executeCosts) {
        this.executeCosts = executeCosts;
    }

    public ExectionInstanceModel withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 实例执行状态
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ExectionInstanceModel withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 实例执行日志
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExectionInstanceModel that = (ExectionInstanceModel) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.targetInstance, that.targetInstance)
            && Objects.equals(this.gmtCreated, that.gmtCreated) && Objects.equals(this.gmtFinished, that.gmtFinished)
            && Objects.equals(this.executeCosts, that.executeCosts) && Objects.equals(this.status, that.status)
            && Objects.equals(this.message, that.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, targetInstance, gmtCreated, gmtFinished, executeCosts, status, message);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExectionInstanceModel {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    targetInstance: ").append(toIndentedString(targetInstance)).append("\n");
        sb.append("    gmtCreated: ").append(toIndentedString(gmtCreated)).append("\n");
        sb.append("    gmtFinished: ").append(toIndentedString(gmtFinished)).append("\n");
        sb.append("    executeCosts: ").append(toIndentedString(executeCosts)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
