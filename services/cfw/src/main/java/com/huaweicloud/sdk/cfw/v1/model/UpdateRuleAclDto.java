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
 * UpdateRuleAclDto
 */
public class UpdateRuleAclDto {

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

        private static final Map<Integer, AddressTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, AddressTypeEnum> createStaticFields() {
            Map<Integer, AddressTypeEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
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
    @JsonProperty(value = "name")

    private String name;

    /**
     * **参数解释**： 规则方向，用于指定规则是从云上至云下，还是云下至云上 **约束限制**： 当规则type=0（互联网规则）或者type= 2（nat规则）时方向值必填 **取值范围**： 0表示外到内（云下到云上），1表示内到外（云上到云下）， **默认取值**： 不涉及
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

    /**
     * **参数解释**： 规则动作类型，用于区分规则对流量的动作 **约束限制**： 仅能使用数字0和1 **取值范围**： 0表示允许通行（permit），1表示拒绝通行（deny） **默认取值**： 不涉及
     */
    public static final class ActionTypeEnum {

        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final ActionTypeEnum NUMBER_0 = new ActionTypeEnum(0);

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final ActionTypeEnum NUMBER_1 = new ActionTypeEnum(1);

        private static final Map<Integer, ActionTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, ActionTypeEnum> createStaticFields() {
            Map<Integer, ActionTypeEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        ActionTypeEnum(Integer value) {
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
        public static ActionTypeEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ActionTypeEnum(value));
        }

        public static ActionTypeEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ActionTypeEnum) {
                return this.value.equals(((ActionTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_type")

    private ActionTypeEnum actionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "applications")

    private List<String> applications = null;

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
    @JsonProperty(value = "source")

    private RuleAddressDto source;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination")

    private RuleAddressDto destination;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service")

    private RuleServiceDto service;

    /**
     * **参数解释**： 规则类型，用于区分不同防护对象设置规则类型。 **约束限制**： 不涉及 **取值范围**：  0：互联网边界规则，源（source）和目的（destination）地址需要为公网IP或域名； 1：VPC间规则，源（source）和目的（destination）地址需要为私有ip； 2：NAT规则，源（source）地址需要为私网IP，目的地址为公网IP或域名。 **默认取值**： 不涉及
     */
    public static final class TypeEnum {

        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final TypeEnum NUMBER_0 = new TypeEnum(0);

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final TypeEnum NUMBER_1 = new TypeEnum(1);

        /**
         * Enum NUMBER_2 for value: 2
         */
        public static final TypeEnum NUMBER_2 = new TypeEnum(2);

        private static final Map<Integer, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, TypeEnum> createStaticFields() {
            Map<Integer, TypeEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            map.put(2, NUMBER_2);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        TypeEnum(Integer value) {
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
        public static TypeEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TypeEnum(value));
        }

        public static TypeEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag")

    private TagsVO tag;

    public UpdateRuleAclDto withAddressType(AddressTypeEnum addressType) {
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

    public UpdateRuleAclDto withName(String name) {
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

    public UpdateRuleAclDto withDirection(DirectionEnum direction) {
        this.direction = direction;
        return this;
    }

    /**
     * **参数解释**： 规则方向，用于指定规则是从云上至云下，还是云下至云上 **约束限制**： 当规则type=0（互联网规则）或者type= 2（nat规则）时方向值必填 **取值范围**： 0表示外到内（云下到云上），1表示内到外（云上到云下）， **默认取值**： 不涉及
     * @return direction
     */
    public DirectionEnum getDirection() {
        return direction;
    }

    public void setDirection(DirectionEnum direction) {
        this.direction = direction;
    }

    public UpdateRuleAclDto withActionType(ActionTypeEnum actionType) {
        this.actionType = actionType;
        return this;
    }

    /**
     * **参数解释**： 规则动作类型，用于区分规则对流量的动作 **约束限制**： 仅能使用数字0和1 **取值范围**： 0表示允许通行（permit），1表示拒绝通行（deny） **默认取值**： 不涉及
     * @return actionType
     */
    public ActionTypeEnum getActionType() {
        return actionType;
    }

    public void setActionType(ActionTypeEnum actionType) {
        this.actionType = actionType;
    }

    public UpdateRuleAclDto withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**： 规则启用状态，用于区分规则是否启用 **约束限制**： 仅能使用数字0和1 **取值范围**： 0表示启用，1表示禁用 **默认取值**： 不涉及
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public UpdateRuleAclDto withApplications(List<String> applications) {
        this.applications = applications;
        return this;
    }

    public UpdateRuleAclDto addApplicationsItem(String applicationsItem) {
        if (this.applications == null) {
            this.applications = new ArrayList<>();
        }
        this.applications.add(applicationsItem);
        return this;
    }

    public UpdateRuleAclDto withApplications(Consumer<List<String>> applicationsSetter) {
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

    public UpdateRuleAclDto withDescription(String description) {
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

    public UpdateRuleAclDto withLongConnectTimeHour(Long longConnectTimeHour) {
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

    public UpdateRuleAclDto withLongConnectTimeMinute(Long longConnectTimeMinute) {
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

    public UpdateRuleAclDto withLongConnectTimeSecond(Long longConnectTimeSecond) {
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

    public UpdateRuleAclDto withLongConnectTime(Long longConnectTime) {
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

    public UpdateRuleAclDto withLongConnectEnable(LongConnectEnableEnum longConnectEnable) {
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

    public UpdateRuleAclDto withSource(RuleAddressDto source) {
        this.source = source;
        return this;
    }

    public UpdateRuleAclDto withSource(Consumer<RuleAddressDto> sourceSetter) {
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

    public UpdateRuleAclDto withDestination(RuleAddressDto destination) {
        this.destination = destination;
        return this;
    }

    public UpdateRuleAclDto withDestination(Consumer<RuleAddressDto> destinationSetter) {
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

    public UpdateRuleAclDto withService(RuleServiceDto service) {
        this.service = service;
        return this;
    }

    public UpdateRuleAclDto withService(Consumer<RuleServiceDto> serviceSetter) {
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

    public UpdateRuleAclDto withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**： 规则类型，用于区分不同防护对象设置规则类型。 **约束限制**： 不涉及 **取值范围**：  0：互联网边界规则，源（source）和目的（destination）地址需要为公网IP或域名； 1：VPC间规则，源（source）和目的（destination）地址需要为私有ip； 2：NAT规则，源（source）地址需要为私网IP，目的地址为公网IP或域名。 **默认取值**： 不涉及
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public UpdateRuleAclDto withTag(TagsVO tag) {
        this.tag = tag;
        return this;
    }

    public UpdateRuleAclDto withTag(Consumer<TagsVO> tagSetter) {
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
        UpdateRuleAclDto that = (UpdateRuleAclDto) obj;
        return Objects.equals(this.addressType, that.addressType) && Objects.equals(this.name, that.name)
            && Objects.equals(this.direction, that.direction) && Objects.equals(this.actionType, that.actionType)
            && Objects.equals(this.status, that.status) && Objects.equals(this.applications, that.applications)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.longConnectTimeHour, that.longConnectTimeHour)
            && Objects.equals(this.longConnectTimeMinute, that.longConnectTimeMinute)
            && Objects.equals(this.longConnectTimeSecond, that.longConnectTimeSecond)
            && Objects.equals(this.longConnectTime, that.longConnectTime)
            && Objects.equals(this.longConnectEnable, that.longConnectEnable)
            && Objects.equals(this.source, that.source) && Objects.equals(this.destination, that.destination)
            && Objects.equals(this.service, that.service) && Objects.equals(this.type, that.type)
            && Objects.equals(this.tag, that.tag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(addressType,
            name,
            direction,
            actionType,
            status,
            applications,
            description,
            longConnectTimeHour,
            longConnectTimeMinute,
            longConnectTimeSecond,
            longConnectTime,
            longConnectEnable,
            source,
            destination,
            service,
            type,
            tag);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateRuleAclDto {\n");
        sb.append("    addressType: ").append(toIndentedString(addressType)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
        sb.append("    actionType: ").append(toIndentedString(actionType)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    applications: ").append(toIndentedString(applications)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    longConnectTimeHour: ").append(toIndentedString(longConnectTimeHour)).append("\n");
        sb.append("    longConnectTimeMinute: ").append(toIndentedString(longConnectTimeMinute)).append("\n");
        sb.append("    longConnectTimeSecond: ").append(toIndentedString(longConnectTimeSecond)).append("\n");
        sb.append("    longConnectTime: ").append(toIndentedString(longConnectTime)).append("\n");
        sb.append("    longConnectEnable: ").append(toIndentedString(longConnectEnable)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
        sb.append("    service: ").append(toIndentedString(service)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
