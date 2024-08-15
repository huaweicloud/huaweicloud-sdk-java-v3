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
 * 作业脚本工单列表
 */
public class JobScriptOrderListModel {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_id")

    private Long orderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_name")

    private String orderName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_uuid")

    private String executeUuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gmt_created")

    private Long gmtCreated;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gmt_finished")

    private Long gmtFinished;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_costs")

    private Long executeCosts;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator")

    private String creator;

    /**
     * 工单状态
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
         * Enum PAUSED for value: "PAUSED"
         */
        public static final StatusEnum PAUSED = new StatusEnum("PAUSED");

        /**
         * Enum CANCELED for value: "CANCELED"
         */
        public static final StatusEnum CANCELED = new StatusEnum("CANCELED");

        /**
         * Enum FINISHED for value: "FINISHED"
         */
        public static final StatusEnum FINISHED = new StatusEnum("FINISHED");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("READY", READY);
            map.put("PROCESSING", PROCESSING);
            map.put("ABNORMAL", ABNORMAL);
            map.put("PAUSED", PAUSED);
            map.put("CANCELED", CANCELED);
            map.put("FINISHED", FINISHED);
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
    @JsonProperty(value = "properties")

    private JobScriptOrderListProp properties;

    public JobScriptOrderListModel withOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }

    /**
     * 主键id，对应job_order_do的主键
     * minimum: 1
     * maximum: 9223372036854775807
     * @return orderId
     */
    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public JobScriptOrderListModel withOrderName(String orderName) {
        this.orderName = orderName;
        return this;
    }

    /**
     * 工单名称
     * @return orderName
     */
    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public JobScriptOrderListModel withExecuteUuid(String executeUuid) {
        this.executeUuid = executeUuid;
        return this;
    }

    /**
     * 列表跳转到详情时，用这个uuid，对应execute_data_do的execute_uuid
     * @return executeUuid
     */
    public String getExecuteUuid() {
        return executeUuid;
    }

    public void setExecuteUuid(String executeUuid) {
        this.executeUuid = executeUuid;
    }

    public JobScriptOrderListModel withGmtCreated(Long gmtCreated) {
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

    public JobScriptOrderListModel withGmtFinished(Long gmtFinished) {
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

    public JobScriptOrderListModel withExecuteCosts(Long executeCosts) {
        this.executeCosts = executeCosts;
        return this;
    }

    /**
     * 执行耗时，单位：秒
     * @return executeCosts
     */
    public Long getExecuteCosts() {
        return executeCosts;
    }

    public void setExecuteCosts(Long executeCosts) {
        this.executeCosts = executeCosts;
    }

    public JobScriptOrderListModel withCreator(String creator) {
        this.creator = creator;
        return this;
    }

    /**
     * 创建人
     * @return creator
     */
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public JobScriptOrderListModel withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 工单状态
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public JobScriptOrderListModel withProperties(JobScriptOrderListProp properties) {
        this.properties = properties;
        return this;
    }

    public JobScriptOrderListModel withProperties(Consumer<JobScriptOrderListProp> propertiesSetter) {
        if (this.properties == null) {
            this.properties = new JobScriptOrderListProp();
            propertiesSetter.accept(this.properties);
        }

        return this;
    }

    /**
     * Get properties
     * @return properties
     */
    public JobScriptOrderListProp getProperties() {
        return properties;
    }

    public void setProperties(JobScriptOrderListProp properties) {
        this.properties = properties;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        JobScriptOrderListModel that = (JobScriptOrderListModel) obj;
        return Objects.equals(this.orderId, that.orderId) && Objects.equals(this.orderName, that.orderName)
            && Objects.equals(this.executeUuid, that.executeUuid) && Objects.equals(this.gmtCreated, that.gmtCreated)
            && Objects.equals(this.gmtFinished, that.gmtFinished)
            && Objects.equals(this.executeCosts, that.executeCosts) && Objects.equals(this.creator, that.creator)
            && Objects.equals(this.status, that.status) && Objects.equals(this.properties, that.properties);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(orderId, orderName, executeUuid, gmtCreated, gmtFinished, executeCosts, creator, status, properties);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobScriptOrderListModel {\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("    orderName: ").append(toIndentedString(orderName)).append("\n");
        sb.append("    executeUuid: ").append(toIndentedString(executeUuid)).append("\n");
        sb.append("    gmtCreated: ").append(toIndentedString(gmtCreated)).append("\n");
        sb.append("    gmtFinished: ").append(toIndentedString(gmtFinished)).append("\n");
        sb.append("    executeCosts: ").append(toIndentedString(executeCosts)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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
