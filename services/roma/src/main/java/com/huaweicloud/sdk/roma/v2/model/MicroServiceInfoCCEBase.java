package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * CCE云容器引擎详细信息，service_type为CCE时必填。app_name或（label_key、label_value）至少填一个，只填app_name时，相当于（label_key&#x3D;‘app’、label_value&#x3D;app_name值）
 */
public class MicroServiceInfoCCEBase {

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
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new WorkloadTypeEnum(value));
        }

        public static WorkloadTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
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
    @JsonProperty(value = "label_key")

    private String labelKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "label_value")

    private String labelValue;

    public MicroServiceInfoCCEBase withClusterId(String clusterId) {
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

    public MicroServiceInfoCCEBase withNamespace(String namespace) {
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

    public MicroServiceInfoCCEBase withWorkloadType(WorkloadTypeEnum workloadType) {
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

    public MicroServiceInfoCCEBase withAppName(String appName) {
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

    public MicroServiceInfoCCEBase withLabelKey(String labelKey) {
        this.labelKey = labelKey;
        return this;
    }

    /**
     * 标签名
     * @return labelKey
     */
    public String getLabelKey() {
        return labelKey;
    }

    public void setLabelKey(String labelKey) {
        this.labelKey = labelKey;
    }

    public MicroServiceInfoCCEBase withLabelValue(String labelValue) {
        this.labelValue = labelValue;
        return this;
    }

    /**
     * 标签值
     * @return labelValue
     */
    public String getLabelValue() {
        return labelValue;
    }

    public void setLabelValue(String labelValue) {
        this.labelValue = labelValue;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MicroServiceInfoCCEBase that = (MicroServiceInfoCCEBase) obj;
        return Objects.equals(this.clusterId, that.clusterId) && Objects.equals(this.namespace, that.namespace)
            && Objects.equals(this.workloadType, that.workloadType) && Objects.equals(this.appName, that.appName)
            && Objects.equals(this.labelKey, that.labelKey) && Objects.equals(this.labelValue, that.labelValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterId, namespace, workloadType, appName, labelKey, labelValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MicroServiceInfoCCEBase {\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    workloadType: ").append(toIndentedString(workloadType)).append("\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
        sb.append("    labelKey: ").append(toIndentedString(labelKey)).append("\n");
        sb.append("    labelValue: ").append(toIndentedString(labelValue)).append("\n");
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
