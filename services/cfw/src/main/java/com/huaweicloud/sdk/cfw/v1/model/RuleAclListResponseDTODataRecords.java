package com.huaweicloud.sdk.cfw.v1.model;

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
 * items
 */
public class RuleAclListResponseDTODataRecords {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_id")

    private String ruleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address_type")

    private Integer addressType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sequence")

    private OrderRuleAclDto sequence;

    /**
     * 规则方向0：外到内1：内到外
     */
    public static final class DirectionEnum {

        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final DirectionEnum NUMBER_0 = new DirectionEnum(0);

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final DirectionEnum NUMBER_1 = new DirectionEnum(1);

        private static final Map<Integer, DirectionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, DirectionEnum> createStaticFields() {
            Map<Integer, DirectionEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        DirectionEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static DirectionEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            DirectionEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new DirectionEnum(value);
            }
            return result;
        }

        public static DirectionEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            DirectionEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DirectionEnum) {
                return this.value.equals(((DirectionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "direction")

    private DirectionEnum direction;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_type")

    private Integer actionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "long_connect_time_hour")

    private Long longConnectTimeHour;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "long_connect_time_minute")

    private Long longConnectTimeMinute;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "long_connect_time_second")

    private Long longConnectTimeSecond;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "long_connect_time")

    private Long longConnectTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "long_connect_enable")

    private Integer longConnectEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source")

    private RuleAddressDto source;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination")

    private RuleAddressDto destination;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service")

    private RuleServiceDto service;

    public RuleAclListResponseDTODataRecords withRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }

    /**
     * 规则id
     * @return ruleId
     */
    public String getRuleId() {
        return ruleId;
    }

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    public RuleAclListResponseDTODataRecords withAddressType(Integer addressType) {
        this.addressType = addressType;
        return this;
    }

    /**
     * 地址类型0 ipv4,1 ipv6
     * @return addressType
     */
    public Integer getAddressType() {
        return addressType;
    }

    public void setAddressType(Integer addressType) {
        this.addressType = addressType;
    }

    public RuleAclListResponseDTODataRecords withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 规则名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RuleAclListResponseDTODataRecords withSequence(OrderRuleAclDto sequence) {
        this.sequence = sequence;
        return this;
    }

    public RuleAclListResponseDTODataRecords withSequence(Consumer<OrderRuleAclDto> sequenceSetter) {
        if (this.sequence == null) {
            this.sequence = new OrderRuleAclDto();
            sequenceSetter.accept(this.sequence);
        }

        return this;
    }

    /**
     * Get sequence
     * @return sequence
     */
    public OrderRuleAclDto getSequence() {
        return sequence;
    }

    public void setSequence(OrderRuleAclDto sequence) {
        this.sequence = sequence;
    }

    public RuleAclListResponseDTODataRecords withDirection(DirectionEnum direction) {
        this.direction = direction;
        return this;
    }

    /**
     * 规则方向0：外到内1：内到外
     * @return direction
     */
    public DirectionEnum getDirection() {
        return direction;
    }

    public void setDirection(DirectionEnum direction) {
        this.direction = direction;
    }

    public RuleAclListResponseDTODataRecords withActionType(Integer actionType) {
        this.actionType = actionType;
        return this;
    }

    /**
     * 动作0：permit,1：deny
     * @return actionType
     */
    public Integer getActionType() {
        return actionType;
    }

    public void setActionType(Integer actionType) {
        this.actionType = actionType;
    }

    public RuleAclListResponseDTODataRecords withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 规则下发状态 0：禁用,1：启用
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public RuleAclListResponseDTODataRecords withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public RuleAclListResponseDTODataRecords withLongConnectTimeHour(Long longConnectTimeHour) {
        this.longConnectTimeHour = longConnectTimeHour;
        return this;
    }

    /**
     * 长连接时长小时
     * @return longConnectTimeHour
     */
    public Long getLongConnectTimeHour() {
        return longConnectTimeHour;
    }

    public void setLongConnectTimeHour(Long longConnectTimeHour) {
        this.longConnectTimeHour = longConnectTimeHour;
    }

    public RuleAclListResponseDTODataRecords withLongConnectTimeMinute(Long longConnectTimeMinute) {
        this.longConnectTimeMinute = longConnectTimeMinute;
        return this;
    }

    /**
     * 长连接时长分钟
     * @return longConnectTimeMinute
     */
    public Long getLongConnectTimeMinute() {
        return longConnectTimeMinute;
    }

    public void setLongConnectTimeMinute(Long longConnectTimeMinute) {
        this.longConnectTimeMinute = longConnectTimeMinute;
    }

    public RuleAclListResponseDTODataRecords withLongConnectTimeSecond(Long longConnectTimeSecond) {
        this.longConnectTimeSecond = longConnectTimeSecond;
        return this;
    }

    /**
     * 长连接时长秒
     * @return longConnectTimeSecond
     */
    public Long getLongConnectTimeSecond() {
        return longConnectTimeSecond;
    }

    public void setLongConnectTimeSecond(Long longConnectTimeSecond) {
        this.longConnectTimeSecond = longConnectTimeSecond;
    }

    public RuleAclListResponseDTODataRecords withLongConnectTime(Long longConnectTime) {
        this.longConnectTime = longConnectTime;
        return this;
    }

    /**
     * 长连接时长
     * @return longConnectTime
     */
    public Long getLongConnectTime() {
        return longConnectTime;
    }

    public void setLongConnectTime(Long longConnectTime) {
        this.longConnectTime = longConnectTime;
    }

    public RuleAclListResponseDTODataRecords withLongConnectEnable(Integer longConnectEnable) {
        this.longConnectEnable = longConnectEnable;
        return this;
    }

    /**
     * 长连接支持
     * @return longConnectEnable
     */
    public Integer getLongConnectEnable() {
        return longConnectEnable;
    }

    public void setLongConnectEnable(Integer longConnectEnable) {
        this.longConnectEnable = longConnectEnable;
    }

    public RuleAclListResponseDTODataRecords withSource(RuleAddressDto source) {
        this.source = source;
        return this;
    }

    public RuleAclListResponseDTODataRecords withSource(Consumer<RuleAddressDto> sourceSetter) {
        if (this.source == null) {
            this.source = new RuleAddressDto();
            sourceSetter.accept(this.source);
        }

        return this;
    }

    /**
     * Get source
     * @return source
     */
    public RuleAddressDto getSource() {
        return source;
    }

    public void setSource(RuleAddressDto source) {
        this.source = source;
    }

    public RuleAclListResponseDTODataRecords withDestination(RuleAddressDto destination) {
        this.destination = destination;
        return this;
    }

    public RuleAclListResponseDTODataRecords withDestination(Consumer<RuleAddressDto> destinationSetter) {
        if (this.destination == null) {
            this.destination = new RuleAddressDto();
            destinationSetter.accept(this.destination);
        }

        return this;
    }

    /**
     * Get destination
     * @return destination
     */
    public RuleAddressDto getDestination() {
        return destination;
    }

    public void setDestination(RuleAddressDto destination) {
        this.destination = destination;
    }

    public RuleAclListResponseDTODataRecords withService(RuleServiceDto service) {
        this.service = service;
        return this;
    }

    public RuleAclListResponseDTODataRecords withService(Consumer<RuleServiceDto> serviceSetter) {
        if (this.service == null) {
            this.service = new RuleServiceDto();
            serviceSetter.accept(this.service);
        }

        return this;
    }

    /**
     * Get service
     * @return service
     */
    public RuleServiceDto getService() {
        return service;
    }

    public void setService(RuleServiceDto service) {
        this.service = service;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RuleAclListResponseDTODataRecords ruleAclListResponseDTODataRecords = (RuleAclListResponseDTODataRecords) o;
        return Objects.equals(this.ruleId, ruleAclListResponseDTODataRecords.ruleId)
            && Objects.equals(this.addressType, ruleAclListResponseDTODataRecords.addressType)
            && Objects.equals(this.name, ruleAclListResponseDTODataRecords.name)
            && Objects.equals(this.sequence, ruleAclListResponseDTODataRecords.sequence)
            && Objects.equals(this.direction, ruleAclListResponseDTODataRecords.direction)
            && Objects.equals(this.actionType, ruleAclListResponseDTODataRecords.actionType)
            && Objects.equals(this.status, ruleAclListResponseDTODataRecords.status)
            && Objects.equals(this.description, ruleAclListResponseDTODataRecords.description)
            && Objects.equals(this.longConnectTimeHour, ruleAclListResponseDTODataRecords.longConnectTimeHour)
            && Objects.equals(this.longConnectTimeMinute, ruleAclListResponseDTODataRecords.longConnectTimeMinute)
            && Objects.equals(this.longConnectTimeSecond, ruleAclListResponseDTODataRecords.longConnectTimeSecond)
            && Objects.equals(this.longConnectTime, ruleAclListResponseDTODataRecords.longConnectTime)
            && Objects.equals(this.longConnectEnable, ruleAclListResponseDTODataRecords.longConnectEnable)
            && Objects.equals(this.source, ruleAclListResponseDTODataRecords.source)
            && Objects.equals(this.destination, ruleAclListResponseDTODataRecords.destination)
            && Objects.equals(this.service, ruleAclListResponseDTODataRecords.service);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ruleId,
            addressType,
            name,
            sequence,
            direction,
            actionType,
            status,
            description,
            longConnectTimeHour,
            longConnectTimeMinute,
            longConnectTimeSecond,
            longConnectTime,
            longConnectEnable,
            source,
            destination,
            service);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RuleAclListResponseDTODataRecords {\n");
        sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
        sb.append("    addressType: ").append(toIndentedString(addressType)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
        sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
        sb.append("    actionType: ").append(toIndentedString(actionType)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    longConnectTimeHour: ").append(toIndentedString(longConnectTimeHour)).append("\n");
        sb.append("    longConnectTimeMinute: ").append(toIndentedString(longConnectTimeMinute)).append("\n");
        sb.append("    longConnectTimeSecond: ").append(toIndentedString(longConnectTimeSecond)).append("\n");
        sb.append("    longConnectTime: ").append(toIndentedString(longConnectTime)).append("\n");
        sb.append("    longConnectEnable: ").append(toIndentedString(longConnectEnable)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
        sb.append("    service: ").append(toIndentedString(service)).append("\n");
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
