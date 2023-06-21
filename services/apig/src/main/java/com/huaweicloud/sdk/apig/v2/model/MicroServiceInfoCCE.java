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
 * CCE微服务工作负载信息
 */
public class MicroServiceInfoCCE {

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
    @JsonProperty(value = "label_key")

    private String labelKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "label_value")

    private String labelValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_name")

    private String clusterName;

    public MicroServiceInfoCCE withClusterId(String clusterId) {
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

    public MicroServiceInfoCCE withNamespace(String namespace) {
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

    public MicroServiceInfoCCE withWorkloadType(WorkloadTypeEnum workloadType) {
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

    public MicroServiceInfoCCE withAppName(String appName) {
        this.appName = appName;
        return this;
    }

    /**
     * APP名称。支持汉字，英文，数字，点，中划线，下划线，且只能以英文和汉字开头，1-64字符。 > 中文字符必须为UTF-8或者unicode编码。
     * @return appName
     */
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public MicroServiceInfoCCE withLabelKey(String labelKey) {
        this.labelKey = labelKey;
        return this;
    }

    /**
     * 服务标识名。支持汉字、英文、数字、中划线、下划线、点、斜杠、中英文格式下的小括号和冒号，且只能以英文、汉字和数字开头，1-64个字符。 > 中文字符必须为UTF-8或者unicode编码。
     * @return labelKey
     */
    public String getLabelKey() {
        return labelKey;
    }

    public void setLabelKey(String labelKey) {
        this.labelKey = labelKey;
    }

    public MicroServiceInfoCCE withLabelValue(String labelValue) {
        this.labelValue = labelValue;
        return this;
    }

    /**
     * 服务标识值。支持汉字，英文，数字，点，中划线，下划线，且只能以英文和汉字开头，1-64字符。 > 中文字符必须为UTF-8或者unicode编码。
     * @return labelValue
     */
    public String getLabelValue() {
        return labelValue;
    }

    public void setLabelValue(String labelValue) {
        this.labelValue = labelValue;
    }

    public MicroServiceInfoCCE withClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }

    /**
     * 云容器引擎集群名称
     * @return clusterName
     */
    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MicroServiceInfoCCE microServiceInfoCCE = (MicroServiceInfoCCE) o;
        return Objects.equals(this.clusterId, microServiceInfoCCE.clusterId)
            && Objects.equals(this.namespace, microServiceInfoCCE.namespace)
            && Objects.equals(this.workloadType, microServiceInfoCCE.workloadType)
            && Objects.equals(this.appName, microServiceInfoCCE.appName)
            && Objects.equals(this.labelKey, microServiceInfoCCE.labelKey)
            && Objects.equals(this.labelValue, microServiceInfoCCE.labelValue)
            && Objects.equals(this.clusterName, microServiceInfoCCE.clusterName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterId, namespace, workloadType, appName, labelKey, labelValue, clusterName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MicroServiceInfoCCE {\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    workloadType: ").append(toIndentedString(workloadType)).append("\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
        sb.append("    labelKey: ").append(toIndentedString(labelKey)).append("\n");
        sb.append("    labelValue: ").append(toIndentedString(labelValue)).append("\n");
        sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
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
