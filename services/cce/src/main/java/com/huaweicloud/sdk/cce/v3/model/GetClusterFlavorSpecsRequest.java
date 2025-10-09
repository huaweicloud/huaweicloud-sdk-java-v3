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
public class GetClusterFlavorSpecsRequest {

    /**
     * **参数解释**： 该参数用于按集群架构查询可售卖规格 **取值范围**： - VirtualMachine: CCE集群 - ARM64: 鲲鹏集群
     */
    public static final class ClusterTypeEnum {

        /**
         * Enum VIRTUALMACHINE for value: "VirtualMachine"
         */
        public static final ClusterTypeEnum VIRTUALMACHINE = new ClusterTypeEnum("VirtualMachine");

        /**
         * Enum ARM64 for value: "ARM64"
         */
        public static final ClusterTypeEnum ARM64 = new ClusterTypeEnum("ARM64");

        private static final Map<String, ClusterTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ClusterTypeEnum> createStaticFields() {
            Map<String, ClusterTypeEnum> map = new HashMap<>();
            map.put("VirtualMachine", VIRTUALMACHINE);
            map.put("ARM64", ARM64);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ClusterTypeEnum(String value) {
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
        public static ClusterTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ClusterTypeEnum(value));
        }

        public static ClusterTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ClusterTypeEnum) {
                return this.value.equals(((ClusterTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clusterType")

    private ClusterTypeEnum clusterType;

    public GetClusterFlavorSpecsRequest withClusterType(ClusterTypeEnum clusterType) {
        this.clusterType = clusterType;
        return this;
    }

    /**
     * **参数解释**： 该参数用于按集群架构查询可售卖规格 **取值范围**： - VirtualMachine: CCE集群 - ARM64: 鲲鹏集群
     * @return clusterType
     */
    public ClusterTypeEnum getClusterType() {
        return clusterType;
    }

    public void setClusterType(ClusterTypeEnum clusterType) {
        this.clusterType = clusterType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GetClusterFlavorSpecsRequest that = (GetClusterFlavorSpecsRequest) obj;
        return Objects.equals(this.clusterType, that.clusterType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetClusterFlavorSpecsRequest {\n");
        sb.append("    clusterType: ").append(toIndentedString(clusterType)).append("\n");
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
