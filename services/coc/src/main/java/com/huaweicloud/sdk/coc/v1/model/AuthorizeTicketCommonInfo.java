package com.huaweicloud.sdk.coc.v1.model;

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
 * AuthorizeTicketCommonInfo
 */
public class AuthorizeTicketCommonInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ticket_id")

    private String ticketId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_id")

    private String targetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scope_id")

    private String scopeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private String title;

    /**
     * 授权单类型，取值：CHANGE/INCIDENT/WAR_ROOM/ALARM
     */
    public static final class TicketTypeEnum {

        /**
         * Enum CHANGE for value: "CHANGE"
         */
        public static final TicketTypeEnum CHANGE = new TicketTypeEnum("CHANGE");

        /**
         * Enum INCIDENT for value: "INCIDENT"
         */
        public static final TicketTypeEnum INCIDENT = new TicketTypeEnum("INCIDENT");

        /**
         * Enum WAR_ROOM for value: "WAR_ROOM"
         */
        public static final TicketTypeEnum WAR_ROOM = new TicketTypeEnum("WAR_ROOM");

        /**
         * Enum ALARM for value: "ALARM"
         */
        public static final TicketTypeEnum ALARM = new TicketTypeEnum("ALARM");

        private static final Map<String, TicketTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TicketTypeEnum> createStaticFields() {
            Map<String, TicketTypeEnum> map = new HashMap<>();
            map.put("CHANGE", CHANGE);
            map.put("INCIDENT", INCIDENT);
            map.put("WAR_ROOM", WAR_ROOM);
            map.put("ALARM", ALARM);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TicketTypeEnum(String value) {
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
        public static TicketTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TicketTypeEnum(value));
        }

        public static TicketTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TicketTypeEnum) {
                return this.value.equals(((TicketTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ticket_type")

    private TicketTypeEnum ticketType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner")

    private List<String> owner = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "level")

    private String level;

    /**
     * 状态，取值：open/close
     */
    public static final class StatusEnum {

        /**
         * Enum OPEN for value: "open"
         */
        public static final StatusEnum OPEN = new StatusEnum("open");

        /**
         * Enum CLOSE for value: "close"
         */
        public static final StatusEnum CLOSE = new StatusEnum("close");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("open", OPEN);
            map.put("close", CLOSE);
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
    @JsonProperty(value = "begin_time")

    private String beginTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    public AuthorizeTicketCommonInfo withTicketId(String ticketId) {
        this.ticketId = ticketId;
        return this;
    }

    /**
     * 关联单号
     * @return ticketId
     */
    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public AuthorizeTicketCommonInfo withTargetId(String targetId) {
        this.targetId = targetId;
        return this;
    }

    /**
     * 目标 ID，一般为应用id
     * @return targetId
     */
    public String getTargetId() {
        return targetId;
    }

    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }

    public AuthorizeTicketCommonInfo withScopeId(String scopeId) {
        this.scopeId = scopeId;
        return this;
    }

    /**
     * scope ID，一般为region id
     * @return scopeId
     */
    public String getScopeId() {
        return scopeId;
    }

    public void setScopeId(String scopeId) {
        this.scopeId = scopeId;
    }

    public AuthorizeTicketCommonInfo withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * 工单名称
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public AuthorizeTicketCommonInfo withTicketType(TicketTypeEnum ticketType) {
        this.ticketType = ticketType;
        return this;
    }

    /**
     * 授权单类型，取值：CHANGE/INCIDENT/WAR_ROOM/ALARM
     * @return ticketType
     */
    public TicketTypeEnum getTicketType() {
        return ticketType;
    }

    public void setTicketType(TicketTypeEnum ticketType) {
        this.ticketType = ticketType;
    }

    public AuthorizeTicketCommonInfo withOwner(List<String> owner) {
        this.owner = owner;
        return this;
    }

    public AuthorizeTicketCommonInfo addOwnerItem(String ownerItem) {
        if (this.owner == null) {
            this.owner = new ArrayList<>();
        }
        this.owner.add(ownerItem);
        return this;
    }

    public AuthorizeTicketCommonInfo withOwner(Consumer<List<String>> ownerSetter) {
        if (this.owner == null) {
            this.owner = new ArrayList<>();
        }
        ownerSetter.accept(this.owner);
        return this;
    }

    /**
     * 当前责任人
     * @return owner
     */
    public List<String> getOwner() {
        return owner;
    }

    public void setOwner(List<String> owner) {
        this.owner = owner;
    }

    public AuthorizeTicketCommonInfo withLevel(String level) {
        this.level = level;
        return this;
    }

    /**
     * 级别
     * @return level
     */
    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public AuthorizeTicketCommonInfo withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 状态，取值：open/close
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public AuthorizeTicketCommonInfo withBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }

    /**
     * 起始时间
     * @return beginTime
     */
    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public AuthorizeTicketCommonInfo withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 结束时间
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
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
        AuthorizeTicketCommonInfo that = (AuthorizeTicketCommonInfo) obj;
        return Objects.equals(this.ticketId, that.ticketId) && Objects.equals(this.targetId, that.targetId)
            && Objects.equals(this.scopeId, that.scopeId) && Objects.equals(this.title, that.title)
            && Objects.equals(this.ticketType, that.ticketType) && Objects.equals(this.owner, that.owner)
            && Objects.equals(this.level, that.level) && Objects.equals(this.status, that.status)
            && Objects.equals(this.beginTime, that.beginTime) && Objects.equals(this.endTime, that.endTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ticketId, targetId, scopeId, title, ticketType, owner, level, status, beginTime, endTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AuthorizeTicketCommonInfo {\n");
        sb.append("    ticketId: ").append(toIndentedString(ticketId)).append("\n");
        sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
        sb.append("    scopeId: ").append(toIndentedString(scopeId)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    ticketType: ").append(toIndentedString(ticketType)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
