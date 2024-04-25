package com.huaweicloud.sdk.dataartsstudio.v1.model;

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
public class ListSecuritySensitiveDataOverviewsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace")

    private String workspace;

    /**
     * 数据源类型,HIVE数据源,DWS数据源,DLI数据源
     */
    public static final class DatasourceEnum {

        /**
         * Enum HIVE for value: "HIVE"
         */
        public static final DatasourceEnum HIVE = new DatasourceEnum("HIVE");

        /**
         * Enum DWS for value: "DWS"
         */
        public static final DatasourceEnum DWS = new DatasourceEnum("DWS");

        /**
         * Enum DLI for value: "DLI"
         */
        public static final DatasourceEnum DLI = new DatasourceEnum("DLI");

        private static final Map<String, DatasourceEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DatasourceEnum> createStaticFields() {
            Map<String, DatasourceEnum> map = new HashMap<>();
            map.put("HIVE", HIVE);
            map.put("DWS", DWS);
            map.put("DLI", DLI);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DatasourceEnum(String value) {
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
        public static DatasourceEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DatasourceEnum(value));
        }

        public static DatasourceEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DatasourceEnum) {
                return this.value.equals(((DatasourceEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datasource")

    private DatasourceEnum datasource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_name")

    private String clusterName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_name")

    private String databaseName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schema_name")

    private String schemaName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_name")

    private String tableName;

    public ListSecuritySensitiveDataOverviewsRequest withWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }

    /**
     * DataArts Studio工作空间ID
     * @return workspace
     */
    public String getWorkspace() {
        return workspace;
    }

    public void setWorkspace(String workspace) {
        this.workspace = workspace;
    }

    public ListSecuritySensitiveDataOverviewsRequest withDatasource(DatasourceEnum datasource) {
        this.datasource = datasource;
        return this;
    }

    /**
     * 数据源类型,HIVE数据源,DWS数据源,DLI数据源
     * @return datasource
     */
    public DatasourceEnum getDatasource() {
        return datasource;
    }

    public void setDatasource(DatasourceEnum datasource) {
        this.datasource = datasource;
    }

    public ListSecuritySensitiveDataOverviewsRequest withClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }

    /**
     * 集群名称
     * @return clusterName
     */
    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public ListSecuritySensitiveDataOverviewsRequest withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * 数据库名称
     * @return databaseName
     */
    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public ListSecuritySensitiveDataOverviewsRequest withSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }

    /**
     * schema名称
     * @return schemaName
     */
    public String getSchemaName() {
        return schemaName;
    }

    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }

    public ListSecuritySensitiveDataOverviewsRequest withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * 表名称
     * @return tableName
     */
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSecuritySensitiveDataOverviewsRequest that = (ListSecuritySensitiveDataOverviewsRequest) obj;
        return Objects.equals(this.workspace, that.workspace) && Objects.equals(this.datasource, that.datasource)
            && Objects.equals(this.clusterName, that.clusterName)
            && Objects.equals(this.databaseName, that.databaseName) && Objects.equals(this.schemaName, that.schemaName)
            && Objects.equals(this.tableName, that.tableName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workspace, datasource, clusterName, databaseName, schemaName, tableName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSecuritySensitiveDataOverviewsRequest {\n");
        sb.append("    workspace: ").append(toIndentedString(workspace)).append("\n");
        sb.append("    datasource: ").append(toIndentedString(datasource)).append("\n");
        sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
        sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
        sb.append("    schemaName: ").append(toIndentedString(schemaName)).append("\n");
        sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
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
