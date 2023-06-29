package com.huaweicloud.sdk.eds.v1.model;

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
 * AuditLogBody
 */
public class AuditLogBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audit_log_id")

    private String auditLogId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_name")

    private String resourceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "customer_user_id")

    private String customerUserId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "customer_user_name")

    private String customerUserName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "customer_connector_id")

    private String customerConnectorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "customer_connector_name")

    private String customerConnectorName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "happend_time")

    private String happendTime;

    /**
     * 限制使用的操作
     */
    public static final class ActionEnum {

        /**
         * Enum VIEW for value: "VIEW"
         */
        public static final ActionEnum VIEW = new ActionEnum("VIEW");

        /**
         * Enum PROCESS for value: "PROCESS"
         */
        public static final ActionEnum PROCESS = new ActionEnum("PROCESS");

        /**
         * Enum MODIFY for value: "MODIFY"
         */
        public static final ActionEnum MODIFY = new ActionEnum("MODIFY");

        /**
         * Enum NOTIFY for value: "NOTIFY"
         */
        public static final ActionEnum NOTIFY = new ActionEnum("NOTIFY");

        /**
         * Enum VERIFY for value: "VERIFY"
         */
        public static final ActionEnum VERIFY = new ActionEnum("VERIFY");

        /**
         * Enum DELETE for value: "DELETE"
         */
        public static final ActionEnum DELETE = new ActionEnum("DELETE");

        /**
         * Enum FORWARD for value: "FORWARD"
         */
        public static final ActionEnum FORWARD = new ActionEnum("FORWARD");

        /**
         * Enum DOWNLOAD for value: "DOWNLOAD"
         */
        public static final ActionEnum DOWNLOAD = new ActionEnum("DOWNLOAD");

        /**
         * Enum APPROVE for value: "APPROVE"
         */
        public static final ActionEnum APPROVE = new ActionEnum("APPROVE");

        /**
         * Enum TERMINATE for value: "TERMINATE"
         */
        public static final ActionEnum TERMINATE = new ActionEnum("TERMINATE");

        /**
         * Enum NONE for value: "NONE"
         */
        public static final ActionEnum NONE = new ActionEnum("NONE");

        private static final Map<String, ActionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ActionEnum> createStaticFields() {
            Map<String, ActionEnum> map = new HashMap<>();
            map.put("VIEW", VIEW);
            map.put("PROCESS", PROCESS);
            map.put("MODIFY", MODIFY);
            map.put("NOTIFY", NOTIFY);
            map.put("VERIFY", VERIFY);
            map.put("DELETE", DELETE);
            map.put("FORWARD", FORWARD);
            map.put("DOWNLOAD", DOWNLOAD);
            map.put("APPROVE", APPROVE);
            map.put("TERMINATE", TERMINATE);
            map.put("NONE", NONE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ActionEnum(String value) {
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
        public static ActionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ActionEnum(value));
        }

        public static ActionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ActionEnum) {
                return this.value.equals(((ActionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private ActionEnum action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private Map<String, String> description = null;

    public AuditLogBody withAuditLogId(String auditLogId) {
        this.auditLogId = auditLogId;
        return this;
    }

    /**
     * 日志 ID
     * @return auditLogId
     */
    public String getAuditLogId() {
        return auditLogId;
    }

    public void setAuditLogId(String auditLogId) {
        this.auditLogId = auditLogId;
    }

    public AuditLogBody withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 资源 ID
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public AuditLogBody withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * 资源名称
     * @return resourceName
     */
    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public AuditLogBody withCustomerUserId(String customerUserId) {
        this.customerUserId = customerUserId;
        return this;
    }

    /**
     * 消费连接器用户ID
     * @return customerUserId
     */
    public String getCustomerUserId() {
        return customerUserId;
    }

    public void setCustomerUserId(String customerUserId) {
        this.customerUserId = customerUserId;
    }

    public AuditLogBody withCustomerUserName(String customerUserName) {
        this.customerUserName = customerUserName;
        return this;
    }

    /**
     * 消费连接器用户名称
     * @return customerUserName
     */
    public String getCustomerUserName() {
        return customerUserName;
    }

    public void setCustomerUserName(String customerUserName) {
        this.customerUserName = customerUserName;
    }

    public AuditLogBody withCustomerConnectorId(String customerConnectorId) {
        this.customerConnectorId = customerConnectorId;
        return this;
    }

    /**
     * 消费连接器ID
     * @return customerConnectorId
     */
    public String getCustomerConnectorId() {
        return customerConnectorId;
    }

    public void setCustomerConnectorId(String customerConnectorId) {
        this.customerConnectorId = customerConnectorId;
    }

    public AuditLogBody withCustomerConnectorName(String customerConnectorName) {
        this.customerConnectorName = customerConnectorName;
        return this;
    }

    /**
     * 消费连接器名称
     * @return customerConnectorName
     */
    public String getCustomerConnectorName() {
        return customerConnectorName;
    }

    public void setCustomerConnectorName(String customerConnectorName) {
        this.customerConnectorName = customerConnectorName;
    }

    public AuditLogBody withHappendTime(String happendTime) {
        this.happendTime = happendTime;
        return this;
    }

    /**
     * 发生时间
     * @return happendTime
     */
    public String getHappendTime() {
        return happendTime;
    }

    public void setHappendTime(String happendTime) {
        this.happendTime = happendTime;
    }

    public AuditLogBody withAction(ActionEnum action) {
        this.action = action;
        return this;
    }

    /**
     * 限制使用的操作
     * @return action
     */
    public ActionEnum getAction() {
        return action;
    }

    public void setAction(ActionEnum action) {
        this.action = action;
    }

    public AuditLogBody withDescription(Map<String, String> description) {
        this.description = description;
        return this;
    }

    public AuditLogBody putDescriptionItem(String key, String descriptionItem) {
        if (this.description == null) {
            this.description = new HashMap<>();
        }
        this.description.put(key, descriptionItem);
        return this;
    }

    public AuditLogBody withDescription(Consumer<Map<String, String>> descriptionSetter) {
        if (this.description == null) {
            this.description = new HashMap<>();
        }
        descriptionSetter.accept(this.description);
        return this;
    }

    /**
     * 扩展属性
     * @return description
     */
    public Map<String, String> getDescription() {
        return description;
    }

    public void setDescription(Map<String, String> description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AuditLogBody that = (AuditLogBody) obj;
        return Objects.equals(this.auditLogId, that.auditLogId) && Objects.equals(this.resourceId, that.resourceId)
            && Objects.equals(this.resourceName, that.resourceName)
            && Objects.equals(this.customerUserId, that.customerUserId)
            && Objects.equals(this.customerUserName, that.customerUserName)
            && Objects.equals(this.customerConnectorId, that.customerConnectorId)
            && Objects.equals(this.customerConnectorName, that.customerConnectorName)
            && Objects.equals(this.happendTime, that.happendTime) && Objects.equals(this.action, that.action)
            && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(auditLogId,
            resourceId,
            resourceName,
            customerUserId,
            customerUserName,
            customerConnectorId,
            customerConnectorName,
            happendTime,
            action,
            description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AuditLogBody {\n");
        sb.append("    auditLogId: ").append(toIndentedString(auditLogId)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
        sb.append("    customerUserId: ").append(toIndentedString(customerUserId)).append("\n");
        sb.append("    customerUserName: ").append(toIndentedString(customerUserName)).append("\n");
        sb.append("    customerConnectorId: ").append(toIndentedString(customerConnectorId)).append("\n");
        sb.append("    customerConnectorName: ").append(toIndentedString(customerConnectorName)).append("\n");
        sb.append("    happendTime: ").append(toIndentedString(happendTime)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
