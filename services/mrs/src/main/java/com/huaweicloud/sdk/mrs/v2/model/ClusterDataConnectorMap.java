package com.huaweicloud.sdk.mrs.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * ClusterDataConnectorMap
 */
public class ClusterDataConnectorMap {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "map_id")

    private Integer mapId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connector_id")

    private String connectorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "component_name")

    private String componentName;

    /**
     * 组件角色类型。 - hive_metastore：Hive Metastore角色 - hive_data：Hive角色 - hbase_data：Hbase角色 - ranger_data：Ranger角色
     */
    public static final class RoleTypeEnum {

        /**
         * Enum LOCAL_DB for value: "LOCAL_DB"
         */
        public static final RoleTypeEnum LOCAL_DB = new RoleTypeEnum("LOCAL_DB");

        /**
         * Enum RDS_POSTGRES for value: "RDS_POSTGRES"
         */
        public static final RoleTypeEnum RDS_POSTGRES = new RoleTypeEnum("RDS_POSTGRES");

        /**
         * Enum RDS_MYSQL for value: "RDS_MYSQL"
         */
        public static final RoleTypeEnum RDS_MYSQL = new RoleTypeEnum("RDS_MYSQL");

        /**
         * Enum GAUSSDB_MYSQL for value: "gaussdb-mysql"
         */
        public static final RoleTypeEnum GAUSSDB_MYSQL = new RoleTypeEnum("gaussdb-mysql");

        private static final Map<String, RoleTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RoleTypeEnum> createStaticFields() {
            Map<String, RoleTypeEnum> map = new HashMap<>();
            map.put("LOCAL_DB", LOCAL_DB);
            map.put("RDS_POSTGRES", RDS_POSTGRES);
            map.put("RDS_MYSQL", RDS_MYSQL);
            map.put("gaussdb-mysql", GAUSSDB_MYSQL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RoleTypeEnum(String value) {
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
        public static RoleTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new RoleTypeEnum(value));
        }

        public static RoleTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof RoleTypeEnum) {
                return this.value.equals(((RoleTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role_type")

    private RoleTypeEnum roleType;

    /**
     * 数据连接类型。 - LOCAL_DB：本地元数据 - RDS_POSTGRES：RDS服务PostgreSQL数据库 - RDS_MYSQL：RDS服务MySQL数据库 - gaussdb-mysql：云数据库GaussDB(for MySQL)
     */
    public static final class SourceTypeEnum {

        /**
         * Enum LOCAL_DB for value: "LOCAL_DB"
         */
        public static final SourceTypeEnum LOCAL_DB = new SourceTypeEnum("LOCAL_DB");

        /**
         * Enum RDS_POSTGRES for value: "RDS_POSTGRES"
         */
        public static final SourceTypeEnum RDS_POSTGRES = new SourceTypeEnum("RDS_POSTGRES");

        /**
         * Enum RDS_MYSQL for value: "RDS_MYSQL"
         */
        public static final SourceTypeEnum RDS_MYSQL = new SourceTypeEnum("RDS_MYSQL");

        /**
         * Enum GAUSSDB_MYSQL for value: "gaussdb-mysql"
         */
        public static final SourceTypeEnum GAUSSDB_MYSQL = new SourceTypeEnum("gaussdb-mysql");

        private static final Map<String, SourceTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SourceTypeEnum> createStaticFields() {
            Map<String, SourceTypeEnum> map = new HashMap<>();
            map.put("LOCAL_DB", LOCAL_DB);
            map.put("RDS_POSTGRES", RDS_POSTGRES);
            map.put("RDS_MYSQL", RDS_MYSQL);
            map.put("gaussdb-mysql", GAUSSDB_MYSQL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SourceTypeEnum(String value) {
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
        public static SourceTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SourceTypeEnum(value));
        }

        public static SourceTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SourceTypeEnum) {
                return this.value.equals(((SourceTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_type")

    private SourceTypeEnum sourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    public ClusterDataConnectorMap withMapId(Integer mapId) {
        this.mapId = mapId;
        return this;
    }

    /**
     * 数据连接关联ID值
     * @return mapId
     */
    public Integer getMapId() {
        return mapId;
    }

    public void setMapId(Integer mapId) {
        this.mapId = mapId;
    }

    public ClusterDataConnectorMap withConnectorId(String connectorId) {
        this.connectorId = connectorId;
        return this;
    }

    /**
     * 数据连接ID值
     * @return connectorId
     */
    public String getConnectorId() {
        return connectorId;
    }

    public void setConnectorId(String connectorId) {
        this.connectorId = connectorId;
    }

    public ClusterDataConnectorMap withComponentName(String componentName) {
        this.componentName = componentName;
        return this;
    }

    /**
     * 组件名
     * @return componentName
     */
    public String getComponentName() {
        return componentName;
    }

    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }

    public ClusterDataConnectorMap withRoleType(RoleTypeEnum roleType) {
        this.roleType = roleType;
        return this;
    }

    /**
     * 组件角色类型。 - hive_metastore：Hive Metastore角色 - hive_data：Hive角色 - hbase_data：Hbase角色 - ranger_data：Ranger角色
     * @return roleType
     */
    public RoleTypeEnum getRoleType() {
        return roleType;
    }

    public void setRoleType(RoleTypeEnum roleType) {
        this.roleType = roleType;
    }

    public ClusterDataConnectorMap withSourceType(SourceTypeEnum sourceType) {
        this.sourceType = sourceType;
        return this;
    }

    /**
     * 数据连接类型。 - LOCAL_DB：本地元数据 - RDS_POSTGRES：RDS服务PostgreSQL数据库 - RDS_MYSQL：RDS服务MySQL数据库 - gaussdb-mysql：云数据库GaussDB(for MySQL)
     * @return sourceType
     */
    public SourceTypeEnum getSourceType() {
        return sourceType;
    }

    public void setSourceType(SourceTypeEnum sourceType) {
        this.sourceType = sourceType;
    }

    public ClusterDataConnectorMap withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * 关联集群id
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public ClusterDataConnectorMap withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 数据连接状态。 - 0：代表正常状态 - 1：代表使用中
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ClusterDataConnectorMap that = (ClusterDataConnectorMap) obj;
        return Objects.equals(this.mapId, that.mapId) && Objects.equals(this.connectorId, that.connectorId)
            && Objects.equals(this.componentName, that.componentName) && Objects.equals(this.roleType, that.roleType)
            && Objects.equals(this.sourceType, that.sourceType) && Objects.equals(this.clusterId, that.clusterId)
            && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mapId, connectorId, componentName, roleType, sourceType, clusterId, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClusterDataConnectorMap {\n");
        sb.append("    mapId: ").append(toIndentedString(mapId)).append("\n");
        sb.append("    connectorId: ").append(toIndentedString(connectorId)).append("\n");
        sb.append("    componentName: ").append(toIndentedString(componentName)).append("\n");
        sb.append("    roleType: ").append(toIndentedString(roleType)).append("\n");
        sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
