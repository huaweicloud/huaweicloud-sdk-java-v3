package com.huaweicloud.sdk.cts.v3.model;

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
public class CreateNotificationResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notification_name")

    private String notificationName;

    /**
     * 操作类型，完整和自定义。
     */
    public static final class OperationTypeEnum {

        /**
         * Enum CUSTOMIZED for value: "customized"
         */
        public static final OperationTypeEnum CUSTOMIZED = new OperationTypeEnum("customized");

        /**
         * Enum COMPLETE for value: "complete"
         */
        public static final OperationTypeEnum COMPLETE = new OperationTypeEnum("complete");

        private static final Map<String, OperationTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OperationTypeEnum> createStaticFields() {
            Map<String, OperationTypeEnum> map = new HashMap<>();
            map.put("customized", CUSTOMIZED);
            map.put("complete", COMPLETE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OperationTypeEnum(String value) {
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
        public static OperationTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new OperationTypeEnum(value));
        }

        public static OperationTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OperationTypeEnum) {
                return this.value.equals(((OperationTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_type")

    private OperationTypeEnum operationType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operations")

    private List<Operations> operations = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notify_user_list")

    private List<NotificationUsers> notifyUserList = null;

    /**
     * 云服务委托名称。
     */
    public static final class AgencyNameEnum {

        /**
         * Enum CTS_ADMIN_TRUST for value: "cts_admin_trust"
         */
        public static final AgencyNameEnum CTS_ADMIN_TRUST = new AgencyNameEnum("cts_admin_trust");

        private static final Map<String, AgencyNameEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AgencyNameEnum> createStaticFields() {
            Map<String, AgencyNameEnum> map = new HashMap<>();
            map.put("cts_admin_trust", CTS_ADMIN_TRUST);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AgencyNameEnum(String value) {
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
        public static AgencyNameEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AgencyNameEnum(value));
        }

        public static AgencyNameEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AgencyNameEnum) {
                return this.value.equals(((AgencyNameEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agency_name")

    private AgencyNameEnum agencyName;

    /**
     * 通知状态，启用和停用。
     */
    public static final class StatusEnum {

        /**
         * Enum ENABLED for value: "enabled"
         */
        public static final StatusEnum ENABLED = new StatusEnum("enabled");

        /**
         * Enum DISABLED for value: "disabled"
         */
        public static final StatusEnum DISABLED = new StatusEnum("disabled");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("enabled", ENABLED);
            map.put("disabled", DISABLED);
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
    @JsonProperty(value = "topic_id")

    private String topicId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notification_id")

    private String notificationId;

    /**
     * 通知类型，消息通知，函数触发器。
     */
    public static final class NotificationTypeEnum {

        /**
         * Enum SMN for value: "smn"
         */
        public static final NotificationTypeEnum SMN = new NotificationTypeEnum("smn");

        /**
         * Enum FUN for value: "fun"
         */
        public static final NotificationTypeEnum FUN = new NotificationTypeEnum("fun");

        private static final Map<String, NotificationTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, NotificationTypeEnum> createStaticFields() {
            Map<String, NotificationTypeEnum> map = new HashMap<>();
            map.put("smn", SMN);
            map.put("fun", FUN);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        NotificationTypeEnum(String value) {
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
        public static NotificationTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new NotificationTypeEnum(value));
        }

        public static NotificationTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof NotificationTypeEnum) {
                return this.value.equals(((NotificationTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notification_type")

    private NotificationTypeEnum notificationType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filter")

    private Filter filter;

    public CreateNotificationResponse withNotificationName(String notificationName) {
        this.notificationName = notificationName;
        return this;
    }

    /**
     * 通知名称。
     * @return notificationName
     */
    public String getNotificationName() {
        return notificationName;
    }

    public void setNotificationName(String notificationName) {
        this.notificationName = notificationName;
    }

    public CreateNotificationResponse withOperationType(OperationTypeEnum operationType) {
        this.operationType = operationType;
        return this;
    }

    /**
     * 操作类型，完整和自定义。
     * @return operationType
     */
    public OperationTypeEnum getOperationType() {
        return operationType;
    }

    public void setOperationType(OperationTypeEnum operationType) {
        this.operationType = operationType;
    }

    public CreateNotificationResponse withOperations(List<Operations> operations) {
        this.operations = operations;
        return this;
    }

    public CreateNotificationResponse addOperationsItem(Operations operationsItem) {
        if (this.operations == null) {
            this.operations = new ArrayList<>();
        }
        this.operations.add(operationsItem);
        return this;
    }

    public CreateNotificationResponse withOperations(Consumer<List<Operations>> operationsSetter) {
        if (this.operations == null) {
            this.operations = new ArrayList<>();
        }
        operationsSetter.accept(this.operations);
        return this;
    }

    /**
     * 操作事件列表。
     * @return operations
     */
    public List<Operations> getOperations() {
        return operations;
    }

    public void setOperations(List<Operations> operations) {
        this.operations = operations;
    }

    public CreateNotificationResponse withNotifyUserList(List<NotificationUsers> notifyUserList) {
        this.notifyUserList = notifyUserList;
        return this;
    }

    public CreateNotificationResponse addNotifyUserListItem(NotificationUsers notifyUserListItem) {
        if (this.notifyUserList == null) {
            this.notifyUserList = new ArrayList<>();
        }
        this.notifyUserList.add(notifyUserListItem);
        return this;
    }

    public CreateNotificationResponse withNotifyUserList(Consumer<List<NotificationUsers>> notifyUserListSetter) {
        if (this.notifyUserList == null) {
            this.notifyUserList = new ArrayList<>();
        }
        notifyUserListSetter.accept(this.notifyUserList);
        return this;
    }

    /**
     * 通知用户列表，目前最多支持对10个用户组和50个用户发起的操作进行配置。
     * @return notifyUserList
     */
    public List<NotificationUsers> getNotifyUserList() {
        return notifyUserList;
    }

    public void setNotifyUserList(List<NotificationUsers> notifyUserList) {
        this.notifyUserList = notifyUserList;
    }

    public CreateNotificationResponse withAgencyName(AgencyNameEnum agencyName) {
        this.agencyName = agencyName;
        return this;
    }

    /**
     * 云服务委托名称。
     * @return agencyName
     */
    public AgencyNameEnum getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(AgencyNameEnum agencyName) {
        this.agencyName = agencyName;
    }

    public CreateNotificationResponse withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 通知状态，启用和停用。
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public CreateNotificationResponse withTopicId(String topicId) {
        this.topicId = topicId;
        return this;
    }

    /**
     * 消息通知服务(SMN)主题的唯一的资源标识，可通过查询主题列表获取该标识。
     * @return topicId
     */
    public String getTopicId() {
        return topicId;
    }

    public void setTopicId(String topicId) {
        this.topicId = topicId;
    }

    public CreateNotificationResponse withNotificationId(String notificationId) {
        this.notificationId = notificationId;
        return this;
    }

    /**
     * 通知的唯一标识ID。
     * @return notificationId
     */
    public String getNotificationId() {
        return notificationId;
    }

    public void setNotificationId(String notificationId) {
        this.notificationId = notificationId;
    }

    public CreateNotificationResponse withNotificationType(NotificationTypeEnum notificationType) {
        this.notificationType = notificationType;
        return this;
    }

    /**
     * 通知类型，消息通知，函数触发器。
     * @return notificationType
     */
    public NotificationTypeEnum getNotificationType() {
        return notificationType;
    }

    public void setNotificationType(NotificationTypeEnum notificationType) {
        this.notificationType = notificationType;
    }

    public CreateNotificationResponse withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public CreateNotificationResponse withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 通知规则创建时间。
     * minimum: 946656000000
     * maximum: 4102416000000
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public CreateNotificationResponse withFilter(Filter filter) {
        this.filter = filter;
        return this;
    }

    public CreateNotificationResponse withFilter(Consumer<Filter> filterSetter) {
        if (this.filter == null) {
            this.filter = new Filter();
            filterSetter.accept(this.filter);
        }

        return this;
    }

    /**
     * Get filter
     * @return filter
     */
    public Filter getFilter() {
        return filter;
    }

    public void setFilter(Filter filter) {
        this.filter = filter;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateNotificationResponse that = (CreateNotificationResponse) obj;
        return Objects.equals(this.notificationName, that.notificationName)
            && Objects.equals(this.operationType, that.operationType)
            && Objects.equals(this.operations, that.operations)
            && Objects.equals(this.notifyUserList, that.notifyUserList)
            && Objects.equals(this.agencyName, that.agencyName) && Objects.equals(this.status, that.status)
            && Objects.equals(this.topicId, that.topicId) && Objects.equals(this.notificationId, that.notificationId)
            && Objects.equals(this.notificationType, that.notificationType)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.filter, that.filter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(notificationName,
            operationType,
            operations,
            notifyUserList,
            agencyName,
            status,
            topicId,
            notificationId,
            notificationType,
            projectId,
            createTime,
            filter);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateNotificationResponse {\n");
        sb.append("    notificationName: ").append(toIndentedString(notificationName)).append("\n");
        sb.append("    operationType: ").append(toIndentedString(operationType)).append("\n");
        sb.append("    operations: ").append(toIndentedString(operations)).append("\n");
        sb.append("    notifyUserList: ").append(toIndentedString(notifyUserList)).append("\n");
        sb.append("    agencyName: ").append(toIndentedString(agencyName)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    topicId: ").append(toIndentedString(topicId)).append("\n");
        sb.append("    notificationId: ").append(toIndentedString(notificationId)).append("\n");
        sb.append("    notificationType: ").append(toIndentedString(notificationType)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
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
