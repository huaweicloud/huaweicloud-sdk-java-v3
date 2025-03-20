package com.huaweicloud.sdk.coc.v1.model;

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
public class ShowSlaOrderResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_title")

    private String orderTitle;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_id")

    private String orderId;

    /**
     * 触发类型(EVENT_TICKET,ALARM_TICKET,CHANGE_NOTE,TO_DO_TASKS,ISSUE_TICKET)
     */
    public static final class TriggerTypeEnum {

        /**
         * Enum EVENT_TICKET for value: "EVENT_TICKET"
         */
        public static final TriggerTypeEnum EVENT_TICKET = new TriggerTypeEnum("EVENT_TICKET");

        /**
         * Enum ALARM_TICKET for value: "ALARM_TICKET"
         */
        public static final TriggerTypeEnum ALARM_TICKET = new TriggerTypeEnum("ALARM_TICKET");

        /**
         * Enum CHANGE_NOTE for value: "CHANGE_NOTE"
         */
        public static final TriggerTypeEnum CHANGE_NOTE = new TriggerTypeEnum("CHANGE_NOTE");

        /**
         * Enum TO_DO_TASKS for value: "TO_DO_TASKS"
         */
        public static final TriggerTypeEnum TO_DO_TASKS = new TriggerTypeEnum("TO_DO_TASKS");

        /**
         * Enum ISSUE_TICKET for value: "ISSUE_TICKET"
         */
        public static final TriggerTypeEnum ISSUE_TICKET = new TriggerTypeEnum("ISSUE_TICKET");

        private static final Map<String, TriggerTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TriggerTypeEnum> createStaticFields() {
            Map<String, TriggerTypeEnum> map = new HashMap<>();
            map.put("EVENT_TICKET", EVENT_TICKET);
            map.put("ALARM_TICKET", ALARM_TICKET);
            map.put("CHANGE_NOTE", CHANGE_NOTE);
            map.put("TO_DO_TASKS", TO_DO_TASKS);
            map.put("ISSUE_TICKET", ISSUE_TICKET);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TriggerTypeEnum(String value) {
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
        public static TriggerTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TriggerTypeEnum(value));
        }

        public static TriggerTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TriggerTypeEnum) {
                return this.value.equals(((TriggerTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trigger_type")

    private TriggerTypeEnum triggerType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_level")

    private String orderLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sla_record")

    private List<SlaRecord> slaRecord = null;

    public ShowSlaOrderResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 主键
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowSlaOrderResponse withOrderTitle(String orderTitle) {
        this.orderTitle = orderTitle;
        return this;
    }

    /**
     * 工单标题
     * @return orderTitle
     */
    public String getOrderTitle() {
        return orderTitle;
    }

    public void setOrderTitle(String orderTitle) {
        this.orderTitle = orderTitle;
    }

    public ShowSlaOrderResponse withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    /**
     * 工单ID
     * @return orderId
     */
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public ShowSlaOrderResponse withTriggerType(TriggerTypeEnum triggerType) {
        this.triggerType = triggerType;
        return this;
    }

    /**
     * 触发类型(EVENT_TICKET,ALARM_TICKET,CHANGE_NOTE,TO_DO_TASKS,ISSUE_TICKET)
     * @return triggerType
     */
    public TriggerTypeEnum getTriggerType() {
        return triggerType;
    }

    public void setTriggerType(TriggerTypeEnum triggerType) {
        this.triggerType = triggerType;
    }

    public ShowSlaOrderResponse withOrderLevel(String orderLevel) {
        this.orderLevel = orderLevel;
        return this;
    }

    /**
     * 工单等级
     * @return orderLevel
     */
    public String getOrderLevel() {
        return orderLevel;
    }

    public void setOrderLevel(String orderLevel) {
        this.orderLevel = orderLevel;
    }

    public ShowSlaOrderResponse withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 工单开始时间
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public ShowSlaOrderResponse withSlaRecord(List<SlaRecord> slaRecord) {
        this.slaRecord = slaRecord;
        return this;
    }

    public ShowSlaOrderResponse addSlaRecordItem(SlaRecord slaRecordItem) {
        if (this.slaRecord == null) {
            this.slaRecord = new ArrayList<>();
        }
        this.slaRecord.add(slaRecordItem);
        return this;
    }

    public ShowSlaOrderResponse withSlaRecord(Consumer<List<SlaRecord>> slaRecordSetter) {
        if (this.slaRecord == null) {
            this.slaRecord = new ArrayList<>();
        }
        slaRecordSetter.accept(this.slaRecord);
        return this;
    }

    /**
     * SLA规则记录
     * @return slaRecord
     */
    public List<SlaRecord> getSlaRecord() {
        return slaRecord;
    }

    public void setSlaRecord(List<SlaRecord> slaRecord) {
        this.slaRecord = slaRecord;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowSlaOrderResponse that = (ShowSlaOrderResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.orderTitle, that.orderTitle)
            && Objects.equals(this.orderId, that.orderId) && Objects.equals(this.triggerType, that.triggerType)
            && Objects.equals(this.orderLevel, that.orderLevel) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.slaRecord, that.slaRecord);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, orderTitle, orderId, triggerType, orderLevel, createTime, slaRecord);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSlaOrderResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    orderTitle: ").append(toIndentedString(orderTitle)).append("\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("    triggerType: ").append(toIndentedString(triggerType)).append("\n");
        sb.append("    orderLevel: ").append(toIndentedString(orderLevel)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    slaRecord: ").append(toIndentedString(slaRecord)).append("\n");
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
