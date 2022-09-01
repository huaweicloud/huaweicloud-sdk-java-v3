package com.huaweicloud.sdk.sdrs.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Request Object
 */
public class ListFailureJobsRequest {

    /**
     * 失败任务状态。createFail：表示创建失败。deleteFail：表示删除失败。attachFail：表示挂载失败。detachFail：表示卸载失败。expandFail：表示扩容失败。resizeFail：表示变更规格失败。startFail：表示开启保护失败。stopFail：表示停止保护失败。reverseFail：表示切换失败。failoverFail：表示故障切换失败。reprotectFail : 表示重保护失败。
     */
    public static final class FailureStatusEnum {

        /**
         * Enum CREATEFAIL for value: "createFail"
         */
        public static final FailureStatusEnum CREATEFAIL = new FailureStatusEnum("createFail");

        /**
         * Enum DELETEFAIL for value: "deleteFail"
         */
        public static final FailureStatusEnum DELETEFAIL = new FailureStatusEnum("deleteFail");

        /**
         * Enum ATTACHFAIL for value: "attachFail"
         */
        public static final FailureStatusEnum ATTACHFAIL = new FailureStatusEnum("attachFail");

        /**
         * Enum DETACHFAIL for value: "detachFail"
         */
        public static final FailureStatusEnum DETACHFAIL = new FailureStatusEnum("detachFail");

        /**
         * Enum EXPANDFAIL for value: "expandFail"
         */
        public static final FailureStatusEnum EXPANDFAIL = new FailureStatusEnum("expandFail");

        /**
         * Enum RESIZEFAIL for value: "resizeFail"
         */
        public static final FailureStatusEnum RESIZEFAIL = new FailureStatusEnum("resizeFail");

        /**
         * Enum STARTFAIL for value: "startFail"
         */
        public static final FailureStatusEnum STARTFAIL = new FailureStatusEnum("startFail");

        /**
         * Enum STOPFAIL for value: "stopFail"
         */
        public static final FailureStatusEnum STOPFAIL = new FailureStatusEnum("stopFail");

        /**
         * Enum REVERSEFAIL for value: "reverseFail"
         */
        public static final FailureStatusEnum REVERSEFAIL = new FailureStatusEnum("reverseFail");

        /**
         * Enum FAILOVERFAIL for value: "failoverFail"
         */
        public static final FailureStatusEnum FAILOVERFAIL = new FailureStatusEnum("failoverFail");

        /**
         * Enum REPROTECTFAIL for value: "reprotectFail"
         */
        public static final FailureStatusEnum REPROTECTFAIL = new FailureStatusEnum("reprotectFail");

        private static final Map<String, FailureStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, FailureStatusEnum> createStaticFields() {
            Map<String, FailureStatusEnum> map = new HashMap<>();
            map.put("createFail", CREATEFAIL);
            map.put("deleteFail", DELETEFAIL);
            map.put("attachFail", ATTACHFAIL);
            map.put("detachFail", DETACHFAIL);
            map.put("expandFail", EXPANDFAIL);
            map.put("resizeFail", RESIZEFAIL);
            map.put("startFail", STARTFAIL);
            map.put("stopFail", STOPFAIL);
            map.put("reverseFail", REVERSEFAIL);
            map.put("failoverFail", FAILOVERFAIL);
            map.put("reprotectFail", REPROTECTFAIL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        FailureStatusEnum(String value) {
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
        public static FailureStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            FailureStatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new FailureStatusEnum(value);
            }
            return result;
        }

        public static FailureStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            FailureStatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof FailureStatusEnum) {
                return this.value.equals(((FailureStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failure_status")

    @JacksonXmlProperty(localName = "failure_status")

    private FailureStatusEnum failureStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_name")

    @JacksonXmlProperty(localName = "resource_name")

    private String resourceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_group_id")

    @JacksonXmlProperty(localName = "server_group_id")

    private String serverGroupId;

    /**
     * 资源类型。server_groups：表示保护组。protected_instances：表示保护实例。replications：表示复制对。disaster_recovery_drills：表示容灾演练。
     */
    public static final class ResourceTypeEnum {

        /**
         * Enum SERVER_GROUPS for value: "server_groups"
         */
        public static final ResourceTypeEnum SERVER_GROUPS = new ResourceTypeEnum("server_groups");

        /**
         * Enum PROTECTED_INSTANCES for value: "protected_instances"
         */
        public static final ResourceTypeEnum PROTECTED_INSTANCES = new ResourceTypeEnum("protected_instances");

        /**
         * Enum REPLICATIONS for value: "replications"
         */
        public static final ResourceTypeEnum REPLICATIONS = new ResourceTypeEnum("replications");

        /**
         * Enum DISASTER_RECOVERY_DRILLS for value: "disaster_recovery_drills"
         */
        public static final ResourceTypeEnum DISASTER_RECOVERY_DRILLS =
            new ResourceTypeEnum("disaster_recovery_drills");

        private static final Map<String, ResourceTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ResourceTypeEnum> createStaticFields() {
            Map<String, ResourceTypeEnum> map = new HashMap<>();
            map.put("server_groups", SERVER_GROUPS);
            map.put("protected_instances", PROTECTED_INSTANCES);
            map.put("replications", REPLICATIONS);
            map.put("disaster_recovery_drills", DISASTER_RECOVERY_DRILLS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ResourceTypeEnum(String value) {
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
        public static ResourceTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ResourceTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ResourceTypeEnum(value);
            }
            return result;
        }

        public static ResourceTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ResourceTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ResourceTypeEnum) {
                return this.value.equals(((ResourceTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    @JacksonXmlProperty(localName = "resource_type")

    private ResourceTypeEnum resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    @JacksonXmlProperty(localName = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    @JacksonXmlProperty(localName = "offset")

    private Integer offset;

    public ListFailureJobsRequest withFailureStatus(FailureStatusEnum failureStatus) {
        this.failureStatus = failureStatus;
        return this;
    }

    /**
     * 失败任务状态。createFail：表示创建失败。deleteFail：表示删除失败。attachFail：表示挂载失败。detachFail：表示卸载失败。expandFail：表示扩容失败。resizeFail：表示变更规格失败。startFail：表示开启保护失败。stopFail：表示停止保护失败。reverseFail：表示切换失败。failoverFail：表示故障切换失败。reprotectFail : 表示重保护失败。
     * @return failureStatus
     */
    public FailureStatusEnum getFailureStatus() {
        return failureStatus;
    }

    public void setFailureStatus(FailureStatusEnum failureStatus) {
        this.failureStatus = failureStatus;
    }

    public ListFailureJobsRequest withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * 保护组资源名称。
     * @return resourceName
     */
    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public ListFailureJobsRequest withServerGroupId(String serverGroupId) {
        this.serverGroupId = serverGroupId;
        return this;
    }

    /**
     * 保护组ID。
     * @return serverGroupId
     */
    public String getServerGroupId() {
        return serverGroupId;
    }

    public void setServerGroupId(String serverGroupId) {
        this.serverGroupId = serverGroupId;
    }

    public ListFailureJobsRequest withResourceType(ResourceTypeEnum resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * 资源类型。server_groups：表示保护组。protected_instances：表示保护实例。replications：表示复制对。disaster_recovery_drills：表示容灾演练。
     * @return resourceType
     */
    public ResourceTypeEnum getResourceType() {
        return resourceType;
    }

    public void setResourceType(ResourceTypeEnum resourceType) {
        this.resourceType = resourceType;
    }

    public ListFailureJobsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每次请求返回结果个数限制。取值范围为[0,1000]的正整数，默认值为1000。
     * minimum: 0
     * maximum: 1000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListFailureJobsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 每次请求开始的下标，即偏移量，默认值为0。offset必须为数字，不能为负数。
     * minimum: 0
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListFailureJobsRequest listFailureJobsRequest = (ListFailureJobsRequest) o;
        return Objects.equals(this.failureStatus, listFailureJobsRequest.failureStatus)
            && Objects.equals(this.resourceName, listFailureJobsRequest.resourceName)
            && Objects.equals(this.serverGroupId, listFailureJobsRequest.serverGroupId)
            && Objects.equals(this.resourceType, listFailureJobsRequest.resourceType)
            && Objects.equals(this.limit, listFailureJobsRequest.limit)
            && Objects.equals(this.offset, listFailureJobsRequest.offset);
    }

    @Override
    public int hashCode() {
        return Objects.hash(failureStatus, resourceName, serverGroupId, resourceType, limit, offset);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFailureJobsRequest {\n");
        sb.append("    failureStatus: ").append(toIndentedString(failureStatus)).append("\n");
        sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
        sb.append("    serverGroupId: ").append(toIndentedString(serverGroupId)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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
