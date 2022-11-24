package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * MicroServiceInfoCCECreate
 */
public class MicroServiceInfoCCECreate {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    private String namespace;

    /**
     * 工作负载类型  - deployment：无状态负载  - statefulset：有状态负载  - daemonset：守护进程集
     */
    public static final class WorkloadTypeEnum {

        /**
         * Enum DEPLOYMENT for value: "deployment"
         */
        public static final WorkloadTypeEnum DEPLOYMENT = new WorkloadTypeEnum("deployment");

        /**
         * Enum STATEFULSET for value: "statefulset"
         */
        public static final WorkloadTypeEnum STATEFULSET = new WorkloadTypeEnum("statefulset");

        /**
         * Enum DAEMONSET for value: "daemonset"
         */
        public static final WorkloadTypeEnum DAEMONSET = new WorkloadTypeEnum("daemonset");

        private static final Map<String, WorkloadTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, WorkloadTypeEnum> createStaticFields() {
            Map<String, WorkloadTypeEnum> map = new HashMap<>();
            map.put("deployment", DEPLOYMENT);
            map.put("statefulset", STATEFULSET);
            map.put("daemonset", DAEMONSET);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        WorkloadTypeEnum(String value) {
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
        public static WorkloadTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            WorkloadTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new WorkloadTypeEnum(value);
            }
            return result;
        }

        public static WorkloadTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            WorkloadTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof WorkloadTypeEnum) {
                return this.value.equals(((WorkloadTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workload_type")

    private WorkloadTypeEnum workloadType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_name")

    private String appName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private Integer port;

    public MicroServiceInfoCCECreate withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * 云容器引擎集群编号
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public MicroServiceInfoCCECreate withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * 命名空间
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public MicroServiceInfoCCECreate withWorkloadType(WorkloadTypeEnum workloadType) {
        this.workloadType = workloadType;
        return this;
    }

    /**
     * 工作负载类型  - deployment：无状态负载  - statefulset：有状态负载  - daemonset：守护进程集
     * @return workloadType
     */
    public WorkloadTypeEnum getWorkloadType() {
        return workloadType;
    }

    public void setWorkloadType(WorkloadTypeEnum workloadType) {
        this.workloadType = workloadType;
    }

    public MicroServiceInfoCCECreate withAppName(String appName) {
        this.appName = appName;
        return this;
    }

    /**
     * APP名称
     * @return appName
     */
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public MicroServiceInfoCCECreate withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 工作负载的版本
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public MicroServiceInfoCCECreate withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * 工作负载的监听端口号
     * minimum: 1
     * maximum: 65535
     * @return port
     */
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MicroServiceInfoCCECreate microServiceInfoCCECreate = (MicroServiceInfoCCECreate) o;
        return Objects.equals(this.clusterId, microServiceInfoCCECreate.clusterId)
            && Objects.equals(this.namespace, microServiceInfoCCECreate.namespace)
            && Objects.equals(this.workloadType, microServiceInfoCCECreate.workloadType)
            && Objects.equals(this.appName, microServiceInfoCCECreate.appName)
            && Objects.equals(this.version, microServiceInfoCCECreate.version)
            && Objects.equals(this.port, microServiceInfoCCECreate.port);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterId, namespace, workloadType, appName, version, port);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MicroServiceInfoCCECreate {\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    workloadType: ").append(toIndentedString(workloadType)).append("\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
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
