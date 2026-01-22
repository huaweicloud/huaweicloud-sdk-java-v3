package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**： 规则体 **约束限制**： 不涉及
 */
public class AddRuleAclDtoRules {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sequence")

    private OrderRuleAclDto sequence;

    /**
     * **参数解释**： IP地址的互联网协议类型，用于指定IP地址的互联网协议，由客户指定 **约束限制**： 不涉及 **取值范围**： 0表示IPv4，1表示IPv6 **默认取值**： 不涉及
     */
    public static final class AddressTypeEnum {

        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final AddressTypeEnum NUMBER_0 = new AddressTypeEnum(0);

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final AddressTypeEnum NUMBER_1 = new AddressTypeEnum(1);

        /**
         * Enum NUMBER_2 for value: 2
         */
        public static final AddressTypeEnum NUMBER_2 = new AddressTypeEnum(2);

        private static final Map<Integer, AddressTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, AddressTypeEnum> createStaticFields() {
            Map<Integer, AddressTypeEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            map.put(2, NUMBER_2);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        AddressTypeEnum(Integer value) {
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
        public static AddressTypeEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AddressTypeEnum(value));
        }

        public static AddressTypeEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AddressTypeEnum) {
                return this.value.equals(((AddressTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address_type")

    private AddressTypeEnum addressType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_type")

    private Integer actionType;

    /**
     * **参数解释**： 规则启用状态，用于区分规则是否启用 **约束限制**： 仅能使用数字0和1 **取值范围**： 0表示启用，1表示禁用 **默认取值**： 不涉及
     */
    public static final class StatusEnum {

        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final StatusEnum NUMBER_0 = new StatusEnum(0);

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final StatusEnum NUMBER_1 = new StatusEnum(1);

        private static final Map<Integer, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, StatusEnum> createStaticFields() {
            Map<Integer, StatusEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        StatusEnum(Integer value) {
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
        public static StatusEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StatusEnum(value));
        }

        public static StatusEnum valueOf(Integer value) {
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
    @JsonProperty(value = "applications")

    private List<String> applications = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "long_connect_time")

    private Long longConnectTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "long_connect_time_hour")

    private Long longConnectTimeHour;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "long_connect_time_minute")

    private Long longConnectTimeMinute;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "long_connect_time_second")

    private Long longConnectTimeSecond;

    /**
     * **参数解释**： 用于表示是否支持长连接。 **约束限制**： 不涉及 **取值范围**： 0表示不支持，1表示支持 **默认取值**： 不涉及
     */
    public static final class LongConnectEnableEnum {

        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final LongConnectEnableEnum NUMBER_0 = new LongConnectEnableEnum(0);

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final LongConnectEnableEnum NUMBER_1 = new LongConnectEnableEnum(1);

        private static final Map<Integer, LongConnectEnableEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, LongConnectEnableEnum> createStaticFields() {
            Map<Integer, LongConnectEnableEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        LongConnectEnableEnum(Integer value) {
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
        public static LongConnectEnableEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new LongConnectEnableEnum(value));
        }

        public static LongConnectEnableEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof LongConnectEnableEnum) {
                return this.value.equals(((LongConnectEnableEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "long_connect_enable")

    private LongConnectEnableEnum longConnectEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    /**
     * **参数解释**： 规则方向，用于指定规则是从云上至云下，还是云下至云上 **约束限制**： 当规则type=0（互联网规则）或者type= 2（NAT规则）时方向值必填 **取值范围**： 0表示外到内（云下到云上），1表示内到外（云上到云下）， **默认取值**： 不涉及
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
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DirectionEnum(value));
        }

        public static DirectionEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
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
    @JsonProperty(value = "source")

    private RuleAddressDtoForRequest source;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination")

    private RuleAddressDtoForRequest destination;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service")

    private RuleServiceDto service;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag")

    private TagsVO tag;

    public AddRuleAclDtoRules withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 规则名称，由用户定义，用于标识规则 **约束限制**： 字符串长度为0到255 **取值范围**： 不涉及 **默认取值**： 不涉及
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AddRuleAclDtoRules withSequence(OrderRuleAclDto sequence) {
        this.sequence = sequence;
        return this;
    }

    public AddRuleAclDtoRules withSequence(Consumer<OrderRuleAclDto> sequenceSetter) {
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

    public AddRuleAclDtoRules withAddressType(AddressTypeEnum addressType) {
        this.addressType = addressType;
        return this;
    }

    /**
     * **参数解释**： IP地址的互联网协议类型，用于指定IP地址的互联网协议，由客户指定 **约束限制**： 不涉及 **取值范围**： 0表示IPv4，1表示IPv6 **默认取值**： 不涉及
     * @return addressType
     */
    public AddressTypeEnum getAddressType() {
        return addressType;
    }

    public void setAddressType(AddressTypeEnum addressType) {
        this.addressType = addressType;
    }

    public AddRuleAclDtoRules withActionType(Integer actionType) {
        this.actionType = actionType;
        return this;
    }

    /**
     * **参数解释**： 规则动作类型，用于区分规则对流量的动作 **约束限制**： 仅能使用数字0和1 **取值范围**： 0表示允许通行（permit），1表示拒绝通行（deny） **默认取值**： 不涉及
     * @return actionType
     */
    public Integer getActionType() {
        return actionType;
    }

    public void setActionType(Integer actionType) {
        this.actionType = actionType;
    }

    public AddRuleAclDtoRules withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**： 规则启用状态，用于区分规则是否启用 **约束限制**： 仅能使用数字0和1 **取值范围**： 0表示启用，1表示禁用 **默认取值**： 不涉及
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public AddRuleAclDtoRules withApplications(List<String> applications) {
        this.applications = applications;
        return this;
    }

    public AddRuleAclDtoRules addApplicationsItem(String applicationsItem) {
        if (this.applications == null) {
            this.applications = new ArrayList<>();
        }
        this.applications.add(applicationsItem);
        return this;
    }

    public AddRuleAclDtoRules withApplications(Consumer<List<String>> applicationsSetter) {
        if (this.applications == null) {
            this.applications = new ArrayList<>();
        }
        applicationsSetter.accept(this.applications);
        return this;
    }

    /**
     * **参数解释**： 规则应用协议列表 **约束限制**： 不涉及 **取值范围**： 规则应用类型包括：“HTTP”，\"HTTPS\"，\"TLS1\"，“DNS”，“SSH”，“MYSQL”，“SMTP”，“RDP”，“RDPS”，“VNC”，“POP3”，“IMAP4”，“SMTPS”，“POP3S”，“FTPS”，“ANY”，“BGP”等。 **默认取值**： 不涉及
     * @return applications
     */
    public List<String> getApplications() {
        return applications;
    }

    public void setApplications(List<String> applications) {
        this.applications = applications;
    }

    public AddRuleAclDtoRules withLongConnectTime(Long longConnectTime) {
        this.longConnectTime = longConnectTime;
        return this;
    }

    /**
     * **参数解释**： 长连接时长（s），用于表示流量产生会话保持的最大时长。 **约束限制**： 仅能为数字 **取值范围**： 1-86400000。 **默认取值**： 不涉及
     * @return longConnectTime
     */
    public Long getLongConnectTime() {
        return longConnectTime;
    }

    public void setLongConnectTime(Long longConnectTime) {
        this.longConnectTime = longConnectTime;
    }

    public AddRuleAclDtoRules withLongConnectTimeHour(Long longConnectTimeHour) {
        this.longConnectTimeHour = longConnectTimeHour;
        return this;
    }

    /**
     * **参数解释**： 长连接时长对应小时数（h）。 **约束限制**： 仅能为数字 **取值范围**： 0-24000。 **默认取值**： 不涉及
     * @return longConnectTimeHour
     */
    public Long getLongConnectTimeHour() {
        return longConnectTimeHour;
    }

    public void setLongConnectTimeHour(Long longConnectTimeHour) {
        this.longConnectTimeHour = longConnectTimeHour;
    }

    public AddRuleAclDtoRules withLongConnectTimeMinute(Long longConnectTimeMinute) {
        this.longConnectTimeMinute = longConnectTimeMinute;
        return this;
    }

    /**
     * **参数解释**： 长连接时长对应分钟数（min）。 **约束限制**： 仅能为数字 **取值范围**： 0-60。 **默认取值**： 不涉及
     * @return longConnectTimeMinute
     */
    public Long getLongConnectTimeMinute() {
        return longConnectTimeMinute;
    }

    public void setLongConnectTimeMinute(Long longConnectTimeMinute) {
        this.longConnectTimeMinute = longConnectTimeMinute;
    }

    public AddRuleAclDtoRules withLongConnectTimeSecond(Long longConnectTimeSecond) {
        this.longConnectTimeSecond = longConnectTimeSecond;
        return this;
    }

    /**
     * **参数解释**： 长连接时长对应秒数（s）。 **约束限制**： 仅能为数字 **取值范围**： 0-60。 **默认取值**： 不涉及
     * @return longConnectTimeSecond
     */
    public Long getLongConnectTimeSecond() {
        return longConnectTimeSecond;
    }

    public void setLongConnectTimeSecond(Long longConnectTimeSecond) {
        this.longConnectTimeSecond = longConnectTimeSecond;
    }

    public AddRuleAclDtoRules withLongConnectEnable(LongConnectEnableEnum longConnectEnable) {
        this.longConnectEnable = longConnectEnable;
        return this;
    }

    /**
     * **参数解释**： 用于表示是否支持长连接。 **约束限制**： 不涉及 **取值范围**： 0表示不支持，1表示支持 **默认取值**： 不涉及
     * @return longConnectEnable
     */
    public LongConnectEnableEnum getLongConnectEnable() {
        return longConnectEnable;
    }

    public void setLongConnectEnable(LongConnectEnableEnum longConnectEnable) {
        this.longConnectEnable = longConnectEnable;
    }

    public AddRuleAclDtoRules withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**： 规则描述，用于描述规则的用途。 **约束限制**： 不涉及 **取值范围**： 长度在0-255之间 **默认取值**： 不涉及
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public AddRuleAclDtoRules withDirection(DirectionEnum direction) {
        this.direction = direction;
        return this;
    }

    /**
     * **参数解释**： 规则方向，用于指定规则是从云上至云下，还是云下至云上 **约束限制**： 当规则type=0（互联网规则）或者type= 2（NAT规则）时方向值必填 **取值范围**： 0表示外到内（云下到云上），1表示内到外（云上到云下）， **默认取值**： 不涉及
     * @return direction
     */
    public DirectionEnum getDirection() {
        return direction;
    }

    public void setDirection(DirectionEnum direction) {
        this.direction = direction;
    }

    public AddRuleAclDtoRules withSource(RuleAddressDtoForRequest source) {
        this.source = source;
        return this;
    }

    public AddRuleAclDtoRules withSource(Consumer<RuleAddressDtoForRequest> sourceSetter) {
        if (this.source == null) {
            this.source = new RuleAddressDtoForRequest();
            sourceSetter.accept(this.source);
        }

        return this;
    }

    /**
     * Get source
     * @return source
     */
    public RuleAddressDtoForRequest getSource() {
        return source;
    }

    public void setSource(RuleAddressDtoForRequest source) {
        this.source = source;
    }

    public AddRuleAclDtoRules withDestination(RuleAddressDtoForRequest destination) {
        this.destination = destination;
        return this;
    }

    public AddRuleAclDtoRules withDestination(Consumer<RuleAddressDtoForRequest> destinationSetter) {
        if (this.destination == null) {
            this.destination = new RuleAddressDtoForRequest();
            destinationSetter.accept(this.destination);
        }

        return this;
    }

    /**
     * Get destination
     * @return destination
     */
    public RuleAddressDtoForRequest getDestination() {
        return destination;
    }

    public void setDestination(RuleAddressDtoForRequest destination) {
        this.destination = destination;
    }

    public AddRuleAclDtoRules withService(RuleServiceDto service) {
        this.service = service;
        return this;
    }

    public AddRuleAclDtoRules withService(Consumer<RuleServiceDto> serviceSetter) {
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

    public AddRuleAclDtoRules withTag(TagsVO tag) {
        this.tag = tag;
        return this;
    }

    public AddRuleAclDtoRules withTag(Consumer<TagsVO> tagSetter) {
        if (this.tag == null) {
            this.tag = new TagsVO();
            tagSetter.accept(this.tag);
        }

        return this;
    }

    /**
     * Get tag
     * @return tag
     */
    public TagsVO getTag() {
        return tag;
    }

    public void setTag(TagsVO tag) {
        this.tag = tag;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AddRuleAclDtoRules that = (AddRuleAclDtoRules) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.sequence, that.sequence)
            && Objects.equals(this.addressType, that.addressType) && Objects.equals(this.actionType, that.actionType)
            && Objects.equals(this.status, that.status) && Objects.equals(this.applications, that.applications)
            && Objects.equals(this.longConnectTime, that.longConnectTime)
            && Objects.equals(this.longConnectTimeHour, that.longConnectTimeHour)
            && Objects.equals(this.longConnectTimeMinute, that.longConnectTimeMinute)
            && Objects.equals(this.longConnectTimeSecond, that.longConnectTimeSecond)
            && Objects.equals(this.longConnectEnable, that.longConnectEnable)
            && Objects.equals(this.description, that.description) && Objects.equals(this.direction, that.direction)
            && Objects.equals(this.source, that.source) && Objects.equals(this.destination, that.destination)
            && Objects.equals(this.service, that.service) && Objects.equals(this.tag, that.tag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            sequence,
            addressType,
            actionType,
            status,
            applications,
            longConnectTime,
            longConnectTimeHour,
            longConnectTimeMinute,
            longConnectTimeSecond,
            longConnectEnable,
            description,
            direction,
            source,
            destination,
            service,
            tag);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddRuleAclDtoRules {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
        sb.append("    addressType: ").append(toIndentedString(addressType)).append("\n");
        sb.append("    actionType: ").append(toIndentedString(actionType)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    applications: ").append(toIndentedString(applications)).append("\n");
        sb.append("    longConnectTime: ").append(toIndentedString(longConnectTime)).append("\n");
        sb.append("    longConnectTimeHour: ").append(toIndentedString(longConnectTimeHour)).append("\n");
        sb.append("    longConnectTimeMinute: ").append(toIndentedString(longConnectTimeMinute)).append("\n");
        sb.append("    longConnectTimeSecond: ").append(toIndentedString(longConnectTimeSecond)).append("\n");
        sb.append("    longConnectEnable: ").append(toIndentedString(longConnectEnable)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
        sb.append("    service: ").append(toIndentedString(service)).append("\n");
        sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
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
