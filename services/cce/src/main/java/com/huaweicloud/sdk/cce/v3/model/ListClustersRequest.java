package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Request Object
 */
public class ListClustersRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detail")

    private String detail;

    /**
     * 集群状态，取值如下 - Available：可用，表示集群处于正常状态。 - Unavailable：不可用，表示集群异常，需手动删除。 - ScalingUp：扩容中，表示集群正处于扩容过程中。 - ScalingDown：缩容中，表示集群正处于缩容过程中。 - Creating：创建中，表示集群正处于创建过程中。 - Deleting：删除中，表示集群正处于删除过程中。 - Upgrading：升级中，表示集群正处于升级过程中。 - Resizing：规格变更中，表示集群正处于变更规格中。 - RollingBack：回滚中，表示集群正处于回滚过程中。 - RollbackFailed：回滚异常，表示集群回滚异常。 - Hibernating：休眠中，表示集群正处于休眠过程中。 - Hibernation：已休眠，表示集群正处于休眠状态。 - Awaking：唤醒中，表示集群正处于从休眠状态唤醒的过程中。 - Empty：集群无任何资源（已废弃）
     */
    public static final class StatusEnum {

        /**
         * Enum AVAILABLE for value: "Available"
         */
        public static final StatusEnum AVAILABLE = new StatusEnum("Available");

        /**
         * Enum UNAVAILABLE for value: "Unavailable"
         */
        public static final StatusEnum UNAVAILABLE = new StatusEnum("Unavailable");

        /**
         * Enum SCALINGUP for value: "ScalingUp"
         */
        public static final StatusEnum SCALINGUP = new StatusEnum("ScalingUp");

        /**
         * Enum SCALINGDOWN for value: "ScalingDown"
         */
        public static final StatusEnum SCALINGDOWN = new StatusEnum("ScalingDown");

        /**
         * Enum CREATING for value: "Creating"
         */
        public static final StatusEnum CREATING = new StatusEnum("Creating");

        /**
         * Enum DELETING for value: "Deleting"
         */
        public static final StatusEnum DELETING = new StatusEnum("Deleting");

        /**
         * Enum UPGRADING for value: "Upgrading"
         */
        public static final StatusEnum UPGRADING = new StatusEnum("Upgrading");

        /**
         * Enum RESIZING for value: "Resizing"
         */
        public static final StatusEnum RESIZING = new StatusEnum("Resizing");

        /**
         * Enum ROLLINGBACK for value: "RollingBack"
         */
        public static final StatusEnum ROLLINGBACK = new StatusEnum("RollingBack");

        /**
         * Enum ROLLBACKFAILED for value: "RollbackFailed"
         */
        public static final StatusEnum ROLLBACKFAILED = new StatusEnum("RollbackFailed");

        /**
         * Enum HIBERNATING for value: "Hibernating"
         */
        public static final StatusEnum HIBERNATING = new StatusEnum("Hibernating");

        /**
         * Enum HIBERNATION for value: "Hibernation"
         */
        public static final StatusEnum HIBERNATION = new StatusEnum("Hibernation");

        /**
         * Enum AWAKING for value: "Awaking"
         */
        public static final StatusEnum AWAKING = new StatusEnum("Awaking");

        /**
         * Enum EMPTY for value: "Empty"
         */
        public static final StatusEnum EMPTY = new StatusEnum("Empty");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("Available", AVAILABLE);
            map.put("Unavailable", UNAVAILABLE);
            map.put("ScalingUp", SCALINGUP);
            map.put("ScalingDown", SCALINGDOWN);
            map.put("Creating", CREATING);
            map.put("Deleting", DELETING);
            map.put("Upgrading", UPGRADING);
            map.put("Resizing", RESIZING);
            map.put("RollingBack", ROLLINGBACK);
            map.put("RollbackFailed", ROLLBACKFAILED);
            map.put("Hibernating", HIBERNATING);
            map.put("Hibernation", HIBERNATION);
            map.put("Awaking", AWAKING);
            map.put("Empty", EMPTY);
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

    /**
     * 集群类型： - VirtualMachine：CCE集群 - ARM64：鲲鹏集群
     */
    public static final class TypeEnum {

        /**
         * Enum VIRTUALMACHINE for value: "VirtualMachine"
         */
        public static final TypeEnum VIRTUALMACHINE = new TypeEnum("VirtualMachine");

        /**
         * Enum ARM64 for value: "ARM64"
         */
        public static final TypeEnum ARM64 = new TypeEnum("ARM64");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("VirtualMachine", VIRTUALMACHINE);
            map.put("ARM64", ARM64);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TypeEnum(value));
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    public ListClustersRequest withDetail(String detail) {
        this.detail = detail;
        return this;
    }

    /**
     * 查询集群详细信息。  若设置为true，获取集群下节点总数(totalNodesNumber)、正常节点数(activeNodesNumber)、CPU总量(totalNodesCPU)、内存总量(totalNodesMemory)、已安装插件列表(installedAddonInstances)，已安装插件列表中包含名称(addonTemplateName)、版本号(version)、插件的状态信息(status)，放入到annotation中。 
     * @return detail
     */
    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public ListClustersRequest withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 集群状态，取值如下 - Available：可用，表示集群处于正常状态。 - Unavailable：不可用，表示集群异常，需手动删除。 - ScalingUp：扩容中，表示集群正处于扩容过程中。 - ScalingDown：缩容中，表示集群正处于缩容过程中。 - Creating：创建中，表示集群正处于创建过程中。 - Deleting：删除中，表示集群正处于删除过程中。 - Upgrading：升级中，表示集群正处于升级过程中。 - Resizing：规格变更中，表示集群正处于变更规格中。 - RollingBack：回滚中，表示集群正处于回滚过程中。 - RollbackFailed：回滚异常，表示集群回滚异常。 - Hibernating：休眠中，表示集群正处于休眠过程中。 - Hibernation：已休眠，表示集群正处于休眠状态。 - Awaking：唤醒中，表示集群正处于从休眠状态唤醒的过程中。 - Empty：集群无任何资源（已废弃）
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ListClustersRequest withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 集群类型： - VirtualMachine：CCE集群 - ARM64：鲲鹏集群
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public ListClustersRequest withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 集群版本过滤
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListClustersRequest that = (ListClustersRequest) obj;
        return Objects.equals(this.detail, that.detail) && Objects.equals(this.status, that.status)
            && Objects.equals(this.type, that.type) && Objects.equals(this.version, that.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(detail, status, type, version);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListClustersRequest {\n");
        sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
