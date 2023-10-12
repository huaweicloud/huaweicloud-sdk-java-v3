package com.huaweicloud.sdk.ces.v3.model;

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
 * InvocationInfo
 */
public class InvocationInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "invocation_id")

    private String invocationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_name")

    private String instanceName;

    /**
     * 主机类型，ECS弹性云服务器，BMS裸金属服务器
     */
    public static final class InstanceTypeEnum {

        /**
         * Enum ECS for value: "ECS"
         */
        public static final InstanceTypeEnum ECS = new InstanceTypeEnum("ECS");

        /**
         * Enum BMS for value: "BMS"
         */
        public static final InstanceTypeEnum BMS = new InstanceTypeEnum("BMS");

        private static final Map<String, InstanceTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, InstanceTypeEnum> createStaticFields() {
            Map<String, InstanceTypeEnum> map = new HashMap<>();
            map.put("ECS", ECS);
            map.put("BMS", BMS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        InstanceTypeEnum(String value) {
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
        public static InstanceTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new InstanceTypeEnum(value));
        }

        public static InstanceTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof InstanceTypeEnum) {
                return this.value.equals(((InstanceTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_type")

    private InstanceTypeEnum instanceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "intranet_ips")

    private List<String> intranetIps = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "elastic_ips")

    private List<String> elasticIps = null;

    /**
     * 任务类型(INSTALL 安装，UPDATE 升级，ROLLBACK 回滚，RETRY 重试)
     */
    public static final class InvocationTypeEnum {

        /**
         * Enum INSTALL for value: "INSTALL"
         */
        public static final InvocationTypeEnum INSTALL = new InvocationTypeEnum("INSTALL");

        /**
         * Enum UPDATE for value: "UPDATE"
         */
        public static final InvocationTypeEnum UPDATE = new InvocationTypeEnum("UPDATE");

        /**
         * Enum ROLLBACK for value: "ROLLBACK"
         */
        public static final InvocationTypeEnum ROLLBACK = new InvocationTypeEnum("ROLLBACK");

        /**
         * Enum RETRY for value: "RETRY"
         */
        public static final InvocationTypeEnum RETRY = new InvocationTypeEnum("RETRY");

        private static final Map<String, InvocationTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, InvocationTypeEnum> createStaticFields() {
            Map<String, InvocationTypeEnum> map = new HashMap<>();
            map.put("INSTALL", INSTALL);
            map.put("UPDATE", UPDATE);
            map.put("ROLLBACK", ROLLBACK);
            map.put("RETRY", RETRY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        InvocationTypeEnum(String value) {
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
        public static InvocationTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new InvocationTypeEnum(value));
        }

        public static InvocationTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof InvocationTypeEnum) {
                return this.value.equals(((InvocationTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "invocation_type")

    private InvocationTypeEnum invocationType;

    /**
     * 任务状态，PENDING 待执行，RUNNING 运行中，TIMEOUT 超时，FAILED 失败，SUCCEEDED 成功，CANCELED 取消，ROLLBACKED已回退
     */
    public static final class InvocationStatusEnum {

        /**
         * Enum PENDING for value: "PENDING"
         */
        public static final InvocationStatusEnum PENDING = new InvocationStatusEnum("PENDING");

        /**
         * Enum RUNNING for value: "RUNNING"
         */
        public static final InvocationStatusEnum RUNNING = new InvocationStatusEnum("RUNNING");

        /**
         * Enum TIMEOUT for value: "TIMEOUT"
         */
        public static final InvocationStatusEnum TIMEOUT = new InvocationStatusEnum("TIMEOUT");

        /**
         * Enum FAILED for value: "FAILED"
         */
        public static final InvocationStatusEnum FAILED = new InvocationStatusEnum("FAILED");

        /**
         * Enum SUCCEEDED for value: "SUCCEEDED"
         */
        public static final InvocationStatusEnum SUCCEEDED = new InvocationStatusEnum("SUCCEEDED");

        /**
         * Enum CANCELED for value: "CANCELED"
         */
        public static final InvocationStatusEnum CANCELED = new InvocationStatusEnum("CANCELED");

        /**
         * Enum ROLLBACKED for value: "ROLLBACKED"
         */
        public static final InvocationStatusEnum ROLLBACKED = new InvocationStatusEnum("ROLLBACKED");

        private static final Map<String, InvocationStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, InvocationStatusEnum> createStaticFields() {
            Map<String, InvocationStatusEnum> map = new HashMap<>();
            map.put("PENDING", PENDING);
            map.put("RUNNING", RUNNING);
            map.put("TIMEOUT", TIMEOUT);
            map.put("FAILED", FAILED);
            map.put("SUCCEEDED", SUCCEEDED);
            map.put("CANCELED", CANCELED);
            map.put("ROLLBACKED", ROLLBACKED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        InvocationStatusEnum(String value) {
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
        public static InvocationStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new InvocationStatusEnum(value));
        }

        public static InvocationStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof InvocationStatusEnum) {
                return this.value.equals(((InvocationStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "invocation_status")

    private InvocationStatusEnum invocationStatus;

    /**
     * 任务对象，目前仅支持telescope
     */
    public static final class InvocationTargetEnum {

        /**
         * Enum TELESCOPE for value: "telescope"
         */
        public static final InvocationTargetEnum TELESCOPE = new InvocationTargetEnum("telescope");

        private static final Map<String, InvocationTargetEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, InvocationTargetEnum> createStaticFields() {
            Map<String, InvocationTargetEnum> map = new HashMap<>();
            map.put("telescope", TELESCOPE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        InvocationTargetEnum(String value) {
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
        public static InvocationTargetEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new InvocationTargetEnum(value));
        }

        public static InvocationTargetEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof InvocationTargetEnum) {
                return this.value.equals(((InvocationTargetEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "invocation_target")

    private InvocationTargetEnum invocationTarget;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Long updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_version")

    private String currentVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_version")

    private String targetVersion;

    public InvocationInfo withInvocationId(String invocationId) {
        this.invocationId = invocationId;
        return this;
    }

    /**
     * 任务id
     * @return invocationId
     */
    public String getInvocationId() {
        return invocationId;
    }

    public void setInvocationId(String invocationId) {
        this.invocationId = invocationId;
    }

    public InvocationInfo withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 主机id
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public InvocationInfo withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * 主机名称
     * @return instanceName
     */
    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public InvocationInfo withInstanceType(InstanceTypeEnum instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * 主机类型，ECS弹性云服务器，BMS裸金属服务器
     * @return instanceType
     */
    public InstanceTypeEnum getInstanceType() {
        return instanceType;
    }

    public void setInstanceType(InstanceTypeEnum instanceType) {
        this.instanceType = instanceType;
    }

    public InvocationInfo withIntranetIps(List<String> intranetIps) {
        this.intranetIps = intranetIps;
        return this;
    }

    public InvocationInfo addIntranetIpsItem(String intranetIpsItem) {
        if (this.intranetIps == null) {
            this.intranetIps = new ArrayList<>();
        }
        this.intranetIps.add(intranetIpsItem);
        return this;
    }

    public InvocationInfo withIntranetIps(Consumer<List<String>> intranetIpsSetter) {
        if (this.intranetIps == null) {
            this.intranetIps = new ArrayList<>();
        }
        intranetIpsSetter.accept(this.intranetIps);
        return this;
    }

    /**
     * 内网ip列表
     * @return intranetIps
     */
    public List<String> getIntranetIps() {
        return intranetIps;
    }

    public void setIntranetIps(List<String> intranetIps) {
        this.intranetIps = intranetIps;
    }

    public InvocationInfo withElasticIps(List<String> elasticIps) {
        this.elasticIps = elasticIps;
        return this;
    }

    public InvocationInfo addElasticIpsItem(String elasticIpsItem) {
        if (this.elasticIps == null) {
            this.elasticIps = new ArrayList<>();
        }
        this.elasticIps.add(elasticIpsItem);
        return this;
    }

    public InvocationInfo withElasticIps(Consumer<List<String>> elasticIpsSetter) {
        if (this.elasticIps == null) {
            this.elasticIps = new ArrayList<>();
        }
        elasticIpsSetter.accept(this.elasticIps);
        return this;
    }

    /**
     * 弹性公网ip列表
     * @return elasticIps
     */
    public List<String> getElasticIps() {
        return elasticIps;
    }

    public void setElasticIps(List<String> elasticIps) {
        this.elasticIps = elasticIps;
    }

    public InvocationInfo withInvocationType(InvocationTypeEnum invocationType) {
        this.invocationType = invocationType;
        return this;
    }

    /**
     * 任务类型(INSTALL 安装，UPDATE 升级，ROLLBACK 回滚，RETRY 重试)
     * @return invocationType
     */
    public InvocationTypeEnum getInvocationType() {
        return invocationType;
    }

    public void setInvocationType(InvocationTypeEnum invocationType) {
        this.invocationType = invocationType;
    }

    public InvocationInfo withInvocationStatus(InvocationStatusEnum invocationStatus) {
        this.invocationStatus = invocationStatus;
        return this;
    }

    /**
     * 任务状态，PENDING 待执行，RUNNING 运行中，TIMEOUT 超时，FAILED 失败，SUCCEEDED 成功，CANCELED 取消，ROLLBACKED已回退
     * @return invocationStatus
     */
    public InvocationStatusEnum getInvocationStatus() {
        return invocationStatus;
    }

    public void setInvocationStatus(InvocationStatusEnum invocationStatus) {
        this.invocationStatus = invocationStatus;
    }

    public InvocationInfo withInvocationTarget(InvocationTargetEnum invocationTarget) {
        this.invocationTarget = invocationTarget;
        return this;
    }

    /**
     * 任务对象，目前仅支持telescope
     * @return invocationTarget
     */
    public InvocationTargetEnum getInvocationTarget() {
        return invocationTarget;
    }

    public void setInvocationTarget(InvocationTargetEnum invocationTarget) {
        this.invocationTarget = invocationTarget;
    }

    public InvocationInfo withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 任务创建时间
     * minimum: 1111111111111
     * maximum: 9999999999999
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public InvocationInfo withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 任务更新时间
     * minimum: 1111111111111
     * maximum: 9999999999999
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public InvocationInfo withCurrentVersion(String currentVersion) {
        this.currentVersion = currentVersion;
        return this;
    }

    /**
     * 当前版本
     * @return currentVersion
     */
    public String getCurrentVersion() {
        return currentVersion;
    }

    public void setCurrentVersion(String currentVersion) {
        this.currentVersion = currentVersion;
    }

    public InvocationInfo withTargetVersion(String targetVersion) {
        this.targetVersion = targetVersion;
        return this;
    }

    /**
     * 目标版本
     * @return targetVersion
     */
    public String getTargetVersion() {
        return targetVersion;
    }

    public void setTargetVersion(String targetVersion) {
        this.targetVersion = targetVersion;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InvocationInfo that = (InvocationInfo) obj;
        return Objects.equals(this.invocationId, that.invocationId) && Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.instanceName, that.instanceName)
            && Objects.equals(this.instanceType, that.instanceType)
            && Objects.equals(this.intranetIps, that.intranetIps) && Objects.equals(this.elasticIps, that.elasticIps)
            && Objects.equals(this.invocationType, that.invocationType)
            && Objects.equals(this.invocationStatus, that.invocationStatus)
            && Objects.equals(this.invocationTarget, that.invocationTarget)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.currentVersion, that.currentVersion)
            && Objects.equals(this.targetVersion, that.targetVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(invocationId,
            instanceId,
            instanceName,
            instanceType,
            intranetIps,
            elasticIps,
            invocationType,
            invocationStatus,
            invocationTarget,
            createTime,
            updateTime,
            currentVersion,
            targetVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InvocationInfo {\n");
        sb.append("    invocationId: ").append(toIndentedString(invocationId)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
        sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
        sb.append("    intranetIps: ").append(toIndentedString(intranetIps)).append("\n");
        sb.append("    elasticIps: ").append(toIndentedString(elasticIps)).append("\n");
        sb.append("    invocationType: ").append(toIndentedString(invocationType)).append("\n");
        sb.append("    invocationStatus: ").append(toIndentedString(invocationStatus)).append("\n");
        sb.append("    invocationTarget: ").append(toIndentedString(invocationTarget)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    currentVersion: ").append(toIndentedString(currentVersion)).append("\n");
        sb.append("    targetVersion: ").append(toIndentedString(targetVersion)).append("\n");
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
