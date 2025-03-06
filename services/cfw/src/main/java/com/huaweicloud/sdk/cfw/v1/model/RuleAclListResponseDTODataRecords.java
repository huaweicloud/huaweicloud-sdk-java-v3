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
 * items
 */
public class RuleAclListResponseDTODataRecords {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_id")

    private String ruleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "applications")

    private List<String> applications = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address_type")

    private Integer addressType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

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
    @JsonProperty(value = "action_type")

    private Integer actionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "long_connect_time")

    private Long longConnectTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "long_connect_enable")

    private Integer longConnectEnable;

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
    @JsonProperty(value = "source")

    private RuleAddressDtoForResponse source;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination")

    private RuleAddressDtoForResponse destination;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service")

    private RuleServiceDtoForResponse service;

    /**
     * 规则类型，0：互联网规则，1：vpc规则，2：nat规则
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
    @JsonProperty(value = "created_date")

    private String createdDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_open_time")

    private String lastOpenTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag")

    private TagsVO tag;

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

    public RuleAclListResponseDTODataRecords withApplications(List<String> applications) {
        this.applications = applications;
        return this;
    }

    public RuleAclListResponseDTODataRecords addApplicationsItem(String applicationsItem) {
        if (this.applications == null) {
            this.applications = new ArrayList<>();
        }
        this.applications.add(applicationsItem);
        return this;
    }

    public RuleAclListResponseDTODataRecords withApplications(Consumer<List<String>> applicationsSetter) {
        if (this.applications == null) {
            this.applications = new ArrayList<>();
        }
        applicationsSetter.accept(this.applications);
        return this;
    }

    /**
     * 应用列表
     * @return applications
     */
    public List<String> getApplications() {
        return applications;
    }

    public void setApplications(List<String> applications) {
        this.applications = applications;
    }

    public RuleAclListResponseDTODataRecords withAddressType(Integer addressType) {
        this.addressType = addressType;
        return this;
    }

    /**
     * 地址类型0 ipv4，1 ipv6
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
     * 动作0：permit，1：deny
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
     * 规则下发状态 0：禁用，1：启用
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

    public RuleAclListResponseDTODataRecords withLongConnectTimeHour(Long longConnectTimeHour) {
        this.longConnectTimeHour = longConnectTimeHour;
        return this;
    }

    /**
     * 长连接时长对应小时
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
     * 长连接时长对应分钟
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

    public RuleAclListResponseDTODataRecords withSource(RuleAddressDtoForResponse source) {
        this.source = source;
        return this;
    }

    public RuleAclListResponseDTODataRecords withSource(Consumer<RuleAddressDtoForResponse> sourceSetter) {
        if (this.source == null) {
            this.source = new RuleAddressDtoForResponse();
            sourceSetter.accept(this.source);
        }

        return this;
    }

    /**
     * Get source
     * @return source
     */
    public RuleAddressDtoForResponse getSource() {
        return source;
    }

    public void setSource(RuleAddressDtoForResponse source) {
        this.source = source;
    }

    public RuleAclListResponseDTODataRecords withDestination(RuleAddressDtoForResponse destination) {
        this.destination = destination;
        return this;
    }

    public RuleAclListResponseDTODataRecords withDestination(Consumer<RuleAddressDtoForResponse> destinationSetter) {
        if (this.destination == null) {
            this.destination = new RuleAddressDtoForResponse();
            destinationSetter.accept(this.destination);
        }

        return this;
    }

    /**
     * Get destination
     * @return destination
     */
    public RuleAddressDtoForResponse getDestination() {
        return destination;
    }

    public void setDestination(RuleAddressDtoForResponse destination) {
        this.destination = destination;
    }

    public RuleAclListResponseDTODataRecords withService(RuleServiceDtoForResponse service) {
        this.service = service;
        return this;
    }

    public RuleAclListResponseDTODataRecords withService(Consumer<RuleServiceDtoForResponse> serviceSetter) {
        if (this.service == null) {
            this.service = new RuleServiceDtoForResponse();
            serviceSetter.accept(this.service);
        }

        return this;
    }

    /**
     * Get service
     * @return service
     */
    public RuleServiceDtoForResponse getService() {
        return service;
    }

    public void setService(RuleServiceDtoForResponse service) {
        this.service = service;
    }

    public RuleAclListResponseDTODataRecords withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 规则类型，0：互联网规则，1：vpc规则，2：nat规则
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public RuleAclListResponseDTODataRecords withCreatedDate(String createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    /**
     * 规则创建时间，例如：\"2024-08-12 08:40:00\"
     * @return createdDate
     */
    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public RuleAclListResponseDTODataRecords withLastOpenTime(String lastOpenTime) {
        this.lastOpenTime = lastOpenTime;
        return this;
    }

    /**
     * 规则最后开启时间，例如：\"2024-08-12 08:40:00\"
     * @return lastOpenTime
     */
    public String getLastOpenTime() {
        return lastOpenTime;
    }

    public void setLastOpenTime(String lastOpenTime) {
        this.lastOpenTime = lastOpenTime;
    }

    public RuleAclListResponseDTODataRecords withTag(TagsVO tag) {
        this.tag = tag;
        return this;
    }

    public RuleAclListResponseDTODataRecords withTag(Consumer<TagsVO> tagSetter) {
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
        RuleAclListResponseDTODataRecords that = (RuleAclListResponseDTODataRecords) obj;
        return Objects.equals(this.ruleId, that.ruleId) && Objects.equals(this.applications, that.applications)
            && Objects.equals(this.addressType, that.addressType) && Objects.equals(this.name, that.name)
            && Objects.equals(this.direction, that.direction) && Objects.equals(this.actionType, that.actionType)
            && Objects.equals(this.status, that.status) && Objects.equals(this.description, that.description)
            && Objects.equals(this.longConnectTime, that.longConnectTime)
            && Objects.equals(this.longConnectEnable, that.longConnectEnable)
            && Objects.equals(this.longConnectTimeHour, that.longConnectTimeHour)
            && Objects.equals(this.longConnectTimeMinute, that.longConnectTimeMinute)
            && Objects.equals(this.longConnectTimeSecond, that.longConnectTimeSecond)
            && Objects.equals(this.source, that.source) && Objects.equals(this.destination, that.destination)
            && Objects.equals(this.service, that.service) && Objects.equals(this.type, that.type)
            && Objects.equals(this.createdDate, that.createdDate)
            && Objects.equals(this.lastOpenTime, that.lastOpenTime) && Objects.equals(this.tag, that.tag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ruleId,
            applications,
            addressType,
            name,
            direction,
            actionType,
            status,
            description,
            longConnectTime,
            longConnectEnable,
            longConnectTimeHour,
            longConnectTimeMinute,
            longConnectTimeSecond,
            source,
            destination,
            service,
            type,
            createdDate,
            lastOpenTime,
            tag);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RuleAclListResponseDTODataRecords {\n");
        sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
        sb.append("    applications: ").append(toIndentedString(applications)).append("\n");
        sb.append("    addressType: ").append(toIndentedString(addressType)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
        sb.append("    actionType: ").append(toIndentedString(actionType)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    longConnectTime: ").append(toIndentedString(longConnectTime)).append("\n");
        sb.append("    longConnectEnable: ").append(toIndentedString(longConnectEnable)).append("\n");
        sb.append("    longConnectTimeHour: ").append(toIndentedString(longConnectTimeHour)).append("\n");
        sb.append("    longConnectTimeMinute: ").append(toIndentedString(longConnectTimeMinute)).append("\n");
        sb.append("    longConnectTimeSecond: ").append(toIndentedString(longConnectTimeSecond)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
        sb.append("    service: ").append(toIndentedString(service)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
        sb.append("    lastOpenTime: ").append(toIndentedString(lastOpenTime)).append("\n");
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
