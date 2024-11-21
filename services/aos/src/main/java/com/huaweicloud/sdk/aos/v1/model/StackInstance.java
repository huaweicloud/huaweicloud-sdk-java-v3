package com.huaweicloud.sdk.aos.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * StackInstance
 */
public class StackInstance {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stack_set_id")

    private String stackSetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stack_set_name")

    private String stackSetName;

    /**
     * 资源栈实例的状态  * `WAIT_IN_PROGRESS` - 资源栈实例等待操作中 * `CANCEL_COMPLETE` - 资源栈实例操作取消完成 * `OPERATION_IN_PROGRESS` - 资源栈实例操作中 * `OPERATION_FAILED` - 资源栈实例操作失败 * `INOPERABLE` - 资源栈实例不可操作 * `OPERATION_COMPLETE` - 资源栈实例操作完成
     */
    public static final class StatusEnum {

        /**
         * Enum WAIT_IN_PROGRESS for value: "WAIT_IN_PROGRESS"
         */
        public static final StatusEnum WAIT_IN_PROGRESS = new StatusEnum("WAIT_IN_PROGRESS");

        /**
         * Enum CANCEL_COMPLETE for value: "CANCEL_COMPLETE"
         */
        public static final StatusEnum CANCEL_COMPLETE = new StatusEnum("CANCEL_COMPLETE");

        /**
         * Enum OPERATION_IN_PROGRESS for value: "OPERATION_IN_PROGRESS"
         */
        public static final StatusEnum OPERATION_IN_PROGRESS = new StatusEnum("OPERATION_IN_PROGRESS");

        /**
         * Enum OPERATION_FAILED for value: "OPERATION_FAILED"
         */
        public static final StatusEnum OPERATION_FAILED = new StatusEnum("OPERATION_FAILED");

        /**
         * Enum INOPERABLE for value: "INOPERABLE"
         */
        public static final StatusEnum INOPERABLE = new StatusEnum("INOPERABLE");

        /**
         * Enum OPERATION_COMPLETE for value: "OPERATION_COMPLETE"
         */
        public static final StatusEnum OPERATION_COMPLETE = new StatusEnum("OPERATION_COMPLETE");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("WAIT_IN_PROGRESS", WAIT_IN_PROGRESS);
            map.put("CANCEL_COMPLETE", CANCEL_COMPLETE);
            map.put("OPERATION_IN_PROGRESS", OPERATION_IN_PROGRESS);
            map.put("OPERATION_FAILED", OPERATION_FAILED);
            map.put("INOPERABLE", INOPERABLE);
            map.put("OPERATION_COMPLETE", OPERATION_COMPLETE);
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
    @JsonProperty(value = "status_message")

    private String statusMessage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stack_id")

    private String stackId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stack_name")

    private String stackName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stack_domain_id")

    private String stackDomainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "latest_stack_set_operation_id")

    private String latestStackSetOperationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    public StackInstance withStackSetId(String stackSetId) {
        this.stackSetId = stackSetId;
        return this;
    }

    /**
     * 资源栈集（stack_set）的唯一ID。  此ID由资源编排服务在生成资源栈集的时候生成，为UUID。  由于资源栈集名仅仅在同一时间下唯一，即用户允许先生成一个叫HelloWorld的资源栈集，删除，再重新创建一个同名资源栈集。  对于团队并行开发，用户可能希望确保，当前我操作的资源栈集就是我以为的那个，而不是被其他队友删除后创建的同名资源栈集。因此，使用ID就可以做到强匹配。  资源编排服务保证每次创建的资源栈集所对应的ID都不相同，更新不会影响ID。如果给予的stack_set_id和当前资源栈集的ID不一致，则返回400
     * @return stackSetId
     */
    public String getStackSetId() {
        return stackSetId;
    }

    public void setStackSetId(String stackSetId) {
        this.stackSetId = stackSetId;
    }

    public StackInstance withStackSetName(String stackSetName) {
        this.stackSetName = stackSetName;
        return this;
    }

    /**
     * 资源栈集（stack_set）的名字。此名字在domain_id+region下应唯一，可以使用中文、大小写英文、数字、下划线、中划线。首字符需为中文或者英文，区分大小写。
     * @return stackSetName
     */
    public String getStackSetName() {
        return stackSetName;
    }

    public void setStackSetName(String stackSetName) {
        this.stackSetName = stackSetName;
    }

    public StackInstance withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 资源栈实例的状态  * `WAIT_IN_PROGRESS` - 资源栈实例等待操作中 * `CANCEL_COMPLETE` - 资源栈实例操作取消完成 * `OPERATION_IN_PROGRESS` - 资源栈实例操作中 * `OPERATION_FAILED` - 资源栈实例操作失败 * `INOPERABLE` - 资源栈实例不可操作 * `OPERATION_COMPLETE` - 资源栈实例操作完成
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public StackInstance withStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
        return this;
    }

    /**
     * 在资源栈实例状态为`INOPERABLE`或`OPERATION_FAILED`时，会显示简要的错误信息总结以供debug
     * @return statusMessage
     */
    public String getStatusMessage() {
        return statusMessage;
    }

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    public StackInstance withStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }

    /**
     * 资源栈（stack）的唯一ID。  此ID由资源编排服务在生成资源栈的时候生成，为UUID。  由于资源栈名仅仅在同一时间下唯一，即用户允许先生成一个叫HelloWorld的资源栈，删除，再重新创建一个同名资源栈。  对于团队并行开发，用户可能希望确保，当前我操作的资源栈就是我认为的那个，而不是其他队友删除后创建的同名资源栈。因此，使用ID就可以做到强匹配。  资源编排服务保证每次创建的资源栈所对应的ID都不相同，更新不会影响ID。如果给予的stack_id和当前资源栈的ID不一致，则返回400
     * @return stackId
     */
    public String getStackId() {
        return stackId;
    }

    public void setStackId(String stackId) {
        this.stackId = stackId;
    }

    public StackInstance withStackName(String stackName) {
        this.stackName = stackName;
        return this;
    }

    /**
     * 资源栈的名称。此名字在domain_id+区域+project_id下应唯一，可以使用中文、大小写英文、数字、下划线、中划线。首字符需为中文或者英文，区分大小写。
     * @return stackName
     */
    public String getStackName() {
        return stackName;
    }

    public void setStackName(String stackName) {
        this.stackName = stackName;
    }

    public StackInstance withStackDomainId(String stackDomainId) {
        this.stackDomainId = stackDomainId;
        return this;
    }

    /**
     * 资源栈实例所关联的资源栈所在的租户ID
     * @return stackDomainId
     */
    public String getStackDomainId() {
        return stackDomainId;
    }

    public void setStackDomainId(String stackDomainId) {
        this.stackDomainId = stackDomainId;
    }

    public StackInstance withLatestStackSetOperationId(String latestStackSetOperationId) {
        this.latestStackSetOperationId = latestStackSetOperationId;
        return this;
    }

    /**
     * 最新一次部署该资源栈实例的资源栈集操作ID。  此ID由资源编排服务在生成资源栈集操作的时候生成，为UUID。
     * @return latestStackSetOperationId
     */
    public String getLatestStackSetOperationId() {
        return latestStackSetOperationId;
    }

    public void setLatestStackSetOperationId(String latestStackSetOperationId) {
        this.latestStackSetOperationId = latestStackSetOperationId;
    }

    public StackInstance withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 资源栈实例所关联的资源栈所在的区域
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public StackInstance withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 资源栈实例的创建时间，格式为YYYY-MM-DDTHH:mm:ss.SSSZ，精确到毫秒，UTC时区，即，如1970-01-01T00:00:00.000Z。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public StackInstance withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 资源栈实例的更新时间，格式为YYYY-MM-DDTHH:mm:ss.SSSZ，精确到毫秒，UTC时区，即，如1970-01-01T00:00:00.000Z。
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StackInstance that = (StackInstance) obj;
        return Objects.equals(this.stackSetId, that.stackSetId) && Objects.equals(this.stackSetName, that.stackSetName)
            && Objects.equals(this.status, that.status) && Objects.equals(this.statusMessage, that.statusMessage)
            && Objects.equals(this.stackId, that.stackId) && Objects.equals(this.stackName, that.stackName)
            && Objects.equals(this.stackDomainId, that.stackDomainId)
            && Objects.equals(this.latestStackSetOperationId, that.latestStackSetOperationId)
            && Objects.equals(this.region, that.region) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stackSetId,
            stackSetName,
            status,
            statusMessage,
            stackId,
            stackName,
            stackDomainId,
            latestStackSetOperationId,
            region,
            createTime,
            updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StackInstance {\n");
        sb.append("    stackSetId: ").append(toIndentedString(stackSetId)).append("\n");
        sb.append("    stackSetName: ").append(toIndentedString(stackSetName)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    statusMessage: ").append(toIndentedString(statusMessage)).append("\n");
        sb.append("    stackId: ").append(toIndentedString(stackId)).append("\n");
        sb.append("    stackName: ").append(toIndentedString(stackName)).append("\n");
        sb.append("    stackDomainId: ").append(toIndentedString(stackDomainId)).append("\n");
        sb.append("    latestStackSetOperationId: ").append(toIndentedString(latestStackSetOperationId)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
