package com.huaweicloud.sdk.tics.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * TicsLeagueAuditLog
 */
public class TicsLeagueAuditLog {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_user_domain_id")

    private String createUserDomainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_user_project_id")

    private String createUserProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator_alias_name")

    private String creatorAliasName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_end_time")

    private OffsetDateTime eventEndTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_info")

    private String eventInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_start_time")

    private OffsetDateTime eventStartTime;

    /**
     * 事件状态，NEW.新建,SUBMITING.提交中,ACCEPTED.已接收,DEPLOYING.部署中,RUNNING.运行中,SUCCEEDED.成功,FAILED.失败,TERMINATED.中止,TERMINATING.中止中,PENDING.等待中
     */
    public static final class EventStatusEnum {

        /**
         * Enum ACCEPTED for value: "ACCEPTED"
         */
        public static final EventStatusEnum ACCEPTED = new EventStatusEnum("ACCEPTED");

        /**
         * Enum DEPLOYING for value: "DEPLOYING"
         */
        public static final EventStatusEnum DEPLOYING = new EventStatusEnum("DEPLOYING");

        /**
         * Enum FAILED for value: "FAILED"
         */
        public static final EventStatusEnum FAILED = new EventStatusEnum("FAILED");

        /**
         * Enum NEW for value: "NEW"
         */
        public static final EventStatusEnum NEW = new EventStatusEnum("NEW");

        /**
         * Enum PENDING for value: "PENDING"
         */
        public static final EventStatusEnum PENDING = new EventStatusEnum("PENDING");

        /**
         * Enum RUNNING for value: "RUNNING"
         */
        public static final EventStatusEnum RUNNING = new EventStatusEnum("RUNNING");

        /**
         * Enum SUBMITING for value: "SUBMITING"
         */
        public static final EventStatusEnum SUBMITING = new EventStatusEnum("SUBMITING");

        /**
         * Enum SUCCEEDED for value: "SUCCEEDED"
         */
        public static final EventStatusEnum SUCCEEDED = new EventStatusEnum("SUCCEEDED");

        /**
         * Enum TERMINATED for value: "TERMINATED"
         */
        public static final EventStatusEnum TERMINATED = new EventStatusEnum("TERMINATED");

        /**
         * Enum TERMINATING for value: "TERMINATING"
         */
        public static final EventStatusEnum TERMINATING = new EventStatusEnum("TERMINATING");

        private static final Map<String, EventStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, EventStatusEnum> createStaticFields() {
            Map<String, EventStatusEnum> map = new HashMap<>();
            map.put("ACCEPTED", ACCEPTED);
            map.put("DEPLOYING", DEPLOYING);
            map.put("FAILED", FAILED);
            map.put("NEW", NEW);
            map.put("PENDING", PENDING);
            map.put("RUNNING", RUNNING);
            map.put("SUBMITING", SUBMITING);
            map.put("SUCCEEDED", SUCCEEDED);
            map.put("TERMINATED", TERMINATED);
            map.put("TERMINATING", TERMINATING);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        EventStatusEnum(String value) {
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
        public static EventStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new EventStatusEnum(value));
        }

        public static EventStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof EventStatusEnum) {
                return this.value.equals(((EventStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_status")

    private EventStatusEnum eventStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Long id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "league_id")

    private String leagueId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sponsor_agent_name")

    private String sponsorAgentName;

    public TicsLeagueAuditLog withCreateUserDomainId(String createUserDomainId) {
        this.createUserDomainId = createUserDomainId;
        return this;
    }

    /**
     * 创建者账户id
     * @return createUserDomainId
     */
    public String getCreateUserDomainId() {
        return createUserDomainId;
    }

    public void setCreateUserDomainId(String createUserDomainId) {
        this.createUserDomainId = createUserDomainId;
    }

    public TicsLeagueAuditLog withCreateUserProjectId(String createUserProjectId) {
        this.createUserProjectId = createUserProjectId;
        return this;
    }

    /**
     * 创建者项目id
     * @return createUserProjectId
     */
    public String getCreateUserProjectId() {
        return createUserProjectId;
    }

    public void setCreateUserProjectId(String createUserProjectId) {
        this.createUserProjectId = createUserProjectId;
    }

    public TicsLeagueAuditLog withCreatorAliasName(String creatorAliasName) {
        this.creatorAliasName = creatorAliasName;
        return this;
    }

    /**
     * 创建者别名
     * @return creatorAliasName
     */
    public String getCreatorAliasName() {
        return creatorAliasName;
    }

    public void setCreatorAliasName(String creatorAliasName) {
        this.creatorAliasName = creatorAliasName;
    }

    public TicsLeagueAuditLog withEventEndTime(OffsetDateTime eventEndTime) {
        this.eventEndTime = eventEndTime;
        return this;
    }

    /**
     * 事件结束时间
     * @return eventEndTime
     */
    public OffsetDateTime getEventEndTime() {
        return eventEndTime;
    }

    public void setEventEndTime(OffsetDateTime eventEndTime) {
        this.eventEndTime = eventEndTime;
    }

    public TicsLeagueAuditLog withEventInfo(String eventInfo) {
        this.eventInfo = eventInfo;
        return this;
    }

    /**
     * 事件信息
     * @return eventInfo
     */
    public String getEventInfo() {
        return eventInfo;
    }

    public void setEventInfo(String eventInfo) {
        this.eventInfo = eventInfo;
    }

    public TicsLeagueAuditLog withEventStartTime(OffsetDateTime eventStartTime) {
        this.eventStartTime = eventStartTime;
        return this;
    }

    /**
     * 事件开始时间
     * @return eventStartTime
     */
    public OffsetDateTime getEventStartTime() {
        return eventStartTime;
    }

    public void setEventStartTime(OffsetDateTime eventStartTime) {
        this.eventStartTime = eventStartTime;
    }

    public TicsLeagueAuditLog withEventStatus(EventStatusEnum eventStatus) {
        this.eventStatus = eventStatus;
        return this;
    }

    /**
     * 事件状态，NEW.新建,SUBMITING.提交中,ACCEPTED.已接收,DEPLOYING.部署中,RUNNING.运行中,SUCCEEDED.成功,FAILED.失败,TERMINATED.中止,TERMINATING.中止中,PENDING.等待中
     * @return eventStatus
     */
    public EventStatusEnum getEventStatus() {
        return eventStatus;
    }

    public void setEventStatus(EventStatusEnum eventStatus) {
        this.eventStatus = eventStatus;
    }

    public TicsLeagueAuditLog withId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * 日志记录id
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TicsLeagueAuditLog withLeagueId(String leagueId) {
        this.leagueId = leagueId;
        return this;
    }

    /**
     * 联盟id
     * @return leagueId
     */
    public String getLeagueId() {
        return leagueId;
    }

    public void setLeagueId(String leagueId) {
        this.leagueId = leagueId;
    }

    public TicsLeagueAuditLog withSponsorAgentName(String sponsorAgentName) {
        this.sponsorAgentName = sponsorAgentName;
        return this;
    }

    /**
     * 作业发起节点名称
     * @return sponsorAgentName
     */
    public String getSponsorAgentName() {
        return sponsorAgentName;
    }

    public void setSponsorAgentName(String sponsorAgentName) {
        this.sponsorAgentName = sponsorAgentName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TicsLeagueAuditLog that = (TicsLeagueAuditLog) obj;
        return Objects.equals(this.createUserDomainId, that.createUserDomainId)
            && Objects.equals(this.createUserProjectId, that.createUserProjectId)
            && Objects.equals(this.creatorAliasName, that.creatorAliasName)
            && Objects.equals(this.eventEndTime, that.eventEndTime) && Objects.equals(this.eventInfo, that.eventInfo)
            && Objects.equals(this.eventStartTime, that.eventStartTime)
            && Objects.equals(this.eventStatus, that.eventStatus) && Objects.equals(this.id, that.id)
            && Objects.equals(this.leagueId, that.leagueId)
            && Objects.equals(this.sponsorAgentName, that.sponsorAgentName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createUserDomainId,
            createUserProjectId,
            creatorAliasName,
            eventEndTime,
            eventInfo,
            eventStartTime,
            eventStatus,
            id,
            leagueId,
            sponsorAgentName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TicsLeagueAuditLog {\n");
        sb.append("    createUserDomainId: ").append(toIndentedString(createUserDomainId)).append("\n");
        sb.append("    createUserProjectId: ").append(toIndentedString(createUserProjectId)).append("\n");
        sb.append("    creatorAliasName: ").append(toIndentedString(creatorAliasName)).append("\n");
        sb.append("    eventEndTime: ").append(toIndentedString(eventEndTime)).append("\n");
        sb.append("    eventInfo: ").append(toIndentedString(eventInfo)).append("\n");
        sb.append("    eventStartTime: ").append(toIndentedString(eventStartTime)).append("\n");
        sb.append("    eventStatus: ").append(toIndentedString(eventStatus)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    leagueId: ").append(toIndentedString(leagueId)).append("\n");
        sb.append("    sponsorAgentName: ").append(toIndentedString(sponsorAgentName)).append("\n");
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
