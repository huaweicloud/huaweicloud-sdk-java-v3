package com.huaweicloud.sdk.dcos.v1.model;

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
 * 进出登记白名单
 */
public class AccessWhiteList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    /**
     * 原因
     */
    public static final class ReasonEnum {

        /**
         * Enum _1 for value: "1"
         */
        public static final ReasonEnum _1 = new ReasonEnum("1");

        /**
         * Enum _2 for value: "2"
         */
        public static final ReasonEnum _2 = new ReasonEnum("2");

        /**
         * Enum _3 for value: "3"
         */
        public static final ReasonEnum _3 = new ReasonEnum("3");

        /**
         * Enum _4 for value: "4"
         */
        public static final ReasonEnum _4 = new ReasonEnum("4");

        /**
         * Enum _5 for value: "5"
         */
        public static final ReasonEnum _5 = new ReasonEnum("5");

        private static final Map<String, ReasonEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ReasonEnum> createStaticFields() {
            Map<String, ReasonEnum> map = new HashMap<>();
            map.put("1", _1);
            map.put("2", _2);
            map.put("3", _3);
            map.put("4", _4);
            map.put("5", _5);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ReasonEnum(String value) {
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
        public static ReasonEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ReasonEnum(value));
        }

        public static ReasonEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ReasonEnum) {
                return this.value.equals(((ReasonEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reason")

    private ReasonEnum reason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reason_supplement")

    private String reasonSupplement;

    /**
     * 作业范围
     */
    public static final class ScopeEnum {

        /**
         * Enum ROOM for value: "room"
         */
        public static final ScopeEnum ROOM = new ScopeEnum("room");

        /**
         * Enum RACK for value: "rack"
         */
        public static final ScopeEnum RACK = new ScopeEnum("rack");

        /**
         * Enum DEVICE for value: "device"
         */
        public static final ScopeEnum DEVICE = new ScopeEnum("device");

        private static final Map<String, ScopeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ScopeEnum> createStaticFields() {
            Map<String, ScopeEnum> map = new HashMap<>();
            map.put("room", ROOM);
            map.put("rack", RACK);
            map.put("device", DEVICE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ScopeEnum(String value) {
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
        public static ScopeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ScopeEnum(value));
        }

        public static ScopeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ScopeEnum) {
                return this.value.equals(((ScopeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scope")

    private ScopeEnum scope;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "room_code")

    private String roomCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "whitelist")

    private List<ContactInformation> whitelist = null;

    public AccessWhiteList withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 开始时间
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public AccessWhiteList withEndTime(String endTime) {
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

    public AccessWhiteList withReason(ReasonEnum reason) {
        this.reason = reason;
        return this;
    }

    /**
     * 原因
     * @return reason
     */
    public ReasonEnum getReason() {
        return reason;
    }

    public void setReason(ReasonEnum reason) {
        this.reason = reason;
    }

    public AccessWhiteList withReasonSupplement(String reasonSupplement) {
        this.reasonSupplement = reasonSupplement;
        return this;
    }

    /**
     * 原因补充
     * @return reasonSupplement
     */
    public String getReasonSupplement() {
        return reasonSupplement;
    }

    public void setReasonSupplement(String reasonSupplement) {
        this.reasonSupplement = reasonSupplement;
    }

    public AccessWhiteList withScope(ScopeEnum scope) {
        this.scope = scope;
        return this;
    }

    /**
     * 作业范围
     * @return scope
     */
    public ScopeEnum getScope() {
        return scope;
    }

    public void setScope(ScopeEnum scope) {
        this.scope = scope;
    }

    public AccessWhiteList withRoomCode(String roomCode) {
        this.roomCode = roomCode;
        return this;
    }

    /**
     * 机房编码
     * @return roomCode
     */
    public String getRoomCode() {
        return roomCode;
    }

    public void setRoomCode(String roomCode) {
        this.roomCode = roomCode;
    }

    public AccessWhiteList withWhitelist(List<ContactInformation> whitelist) {
        this.whitelist = whitelist;
        return this;
    }

    public AccessWhiteList addWhitelistItem(ContactInformation whitelistItem) {
        if (this.whitelist == null) {
            this.whitelist = new ArrayList<>();
        }
        this.whitelist.add(whitelistItem);
        return this;
    }

    public AccessWhiteList withWhitelist(Consumer<List<ContactInformation>> whitelistSetter) {
        if (this.whitelist == null) {
            this.whitelist = new ArrayList<>();
        }
        whitelistSetter.accept(this.whitelist);
        return this;
    }

    /**
     * 人员名单
     * @return whitelist
     */
    public List<ContactInformation> getWhitelist() {
        return whitelist;
    }

    public void setWhitelist(List<ContactInformation> whitelist) {
        this.whitelist = whitelist;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AccessWhiteList that = (AccessWhiteList) obj;
        return Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.reason, that.reason) && Objects.equals(this.reasonSupplement, that.reasonSupplement)
            && Objects.equals(this.scope, that.scope) && Objects.equals(this.roomCode, that.roomCode)
            && Objects.equals(this.whitelist, that.whitelist);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startTime, endTime, reason, reasonSupplement, scope, roomCode, whitelist);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccessWhiteList {\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    reasonSupplement: ").append(toIndentedString(reasonSupplement)).append("\n");
        sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
        sb.append("    roomCode: ").append(toIndentedString(roomCode)).append("\n");
        sb.append("    whitelist: ").append(toIndentedString(whitelist)).append("\n");
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
