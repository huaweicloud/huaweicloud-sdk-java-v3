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
 * DataConnectorDetail
 */
public class DataConnectorDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connector_name")

    private String connectorName;

    /**
     * 数据连接类型。 - RDS_POSTGRES：RDS服务PostgreSQL数据库 - RDS_MYSQL：RDS服务MySQL数据库 - gaussdb-mysql：云数据库GaussDB(for MySQL)
     */
    public static final class SourceTypeEnum {

        /**
         * Enum RDS_MYSQL for value: "RDS_MYSQL"
         */
        public static final SourceTypeEnum RDS_MYSQL = new SourceTypeEnum("RDS_MYSQL");

        /**
         * Enum RDS_POSTGRES for value: "RDS_POSTGRES"
         */
        public static final SourceTypeEnum RDS_POSTGRES = new SourceTypeEnum("RDS_POSTGRES");

        /**
         * Enum GAUSSDB_MYSQL for value: "gaussdb-mysql"
         */
        public static final SourceTypeEnum GAUSSDB_MYSQL = new SourceTypeEnum("gaussdb-mysql");

        private static final Map<String, SourceTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SourceTypeEnum> createStaticFields() {
            Map<String, SourceTypeEnum> map = new HashMap<>();
            map.put("RDS_MYSQL", RDS_MYSQL);
            map.put("RDS_POSTGRES", RDS_POSTGRES);
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
    @JsonProperty(value = "source_info")

    private String sourceInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connector_id")

    private String connectorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_update_time")

    private Long lastUpdateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_by")

    private String createBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_user")

    private String createUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_id")

    private String tenantId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_update_by")

    private String lastUpdateBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used_clusters")

    private String usedClusters;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "encrypt_type")

    private Integer encryptType;

    public DataConnectorDetail withConnectorName(String connectorName) {
        this.connectorName = connectorName;
        return this;
    }

    /**
     * 数据连接名称。
     * @return connectorName
     */
    public String getConnectorName() {
        return connectorName;
    }

    public void setConnectorName(String connectorName) {
        this.connectorName = connectorName;
    }

    public DataConnectorDetail withSourceType(SourceTypeEnum sourceType) {
        this.sourceType = sourceType;
        return this;
    }

    /**
     * 数据连接类型。 - RDS_POSTGRES：RDS服务PostgreSQL数据库 - RDS_MYSQL：RDS服务MySQL数据库 - gaussdb-mysql：云数据库GaussDB(for MySQL)
     * @return sourceType
     */
    public SourceTypeEnum getSourceType() {
        return sourceType;
    }

    public void setSourceType(SourceTypeEnum sourceType) {
        this.sourceType = sourceType;
    }

    public DataConnectorDetail withSourceInfo(String sourceInfo) {
        this.sourceInfo = sourceInfo;
        return this;
    }

    /**
     * 数据源信息，为json格式，不同数据连接有不同的信息，各数据源的source_info请求内容可参见示例。
     * @return sourceInfo
     */
    public String getSourceInfo() {
        return sourceInfo;
    }

    public void setSourceInfo(String sourceInfo) {
        this.sourceInfo = sourceInfo;
    }

    public DataConnectorDetail withConnectorId(String connectorId) {
        this.connectorId = connectorId;
        return this;
    }

    /**
     * 数据连接ID
     * @return connectorId
     */
    public String getConnectorId() {
        return connectorId;
    }

    public void setConnectorId(String connectorId) {
        this.connectorId = connectorId;
    }

    public DataConnectorDetail withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * minimum: 0
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public DataConnectorDetail withLastUpdateTime(Long lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
        return this;
    }

    /**
     * 最后更新时间
     * minimum: 0
     * @return lastUpdateTime
     */
    public Long getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Long lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public DataConnectorDetail withCreateBy(String createBy) {
        this.createBy = createBy;
        return this;
    }

    /**
     * 创建时间
     * @return createBy
     */
    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public DataConnectorDetail withCreateUser(String createUser) {
        this.createUser = createUser;
        return this;
    }

    /**
     * 创建用户
     * @return createUser
     */
    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public DataConnectorDetail withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * 租户ID
     * @return tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public DataConnectorDetail withLastUpdateBy(String lastUpdateBy) {
        this.lastUpdateBy = lastUpdateBy;
        return this;
    }

    /**
     * 最后更新时间
     * @return lastUpdateBy
     */
    public String getLastUpdateBy() {
        return lastUpdateBy;
    }

    public void setLastUpdateBy(String lastUpdateBy) {
        this.lastUpdateBy = lastUpdateBy;
    }

    public DataConnectorDetail withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 数据连接状态
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public DataConnectorDetail withUsedClusters(String usedClusters) {
        this.usedClusters = usedClusters;
        return this;
    }

    /**
     * 使用集群
     * @return usedClusters
     */
    public String getUsedClusters() {
        return usedClusters;
    }

    public void setUsedClusters(String usedClusters) {
        this.usedClusters = usedClusters;
    }

    public DataConnectorDetail withEncryptType(Integer encryptType) {
        this.encryptType = encryptType;
        return this;
    }

    /**
     * 加密类型
     * @return encryptType
     */
    public Integer getEncryptType() {
        return encryptType;
    }

    public void setEncryptType(Integer encryptType) {
        this.encryptType = encryptType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DataConnectorDetail that = (DataConnectorDetail) obj;
        return Objects.equals(this.connectorName, that.connectorName)
            && Objects.equals(this.sourceType, that.sourceType) && Objects.equals(this.sourceInfo, that.sourceInfo)
            && Objects.equals(this.connectorId, that.connectorId) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.lastUpdateTime, that.lastUpdateTime) && Objects.equals(this.createBy, that.createBy)
            && Objects.equals(this.createUser, that.createUser) && Objects.equals(this.tenantId, that.tenantId)
            && Objects.equals(this.lastUpdateBy, that.lastUpdateBy) && Objects.equals(this.status, that.status)
            && Objects.equals(this.usedClusters, that.usedClusters)
            && Objects.equals(this.encryptType, that.encryptType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(connectorName,
            sourceType,
            sourceInfo,
            connectorId,
            createTime,
            lastUpdateTime,
            createBy,
            createUser,
            tenantId,
            lastUpdateBy,
            status,
            usedClusters,
            encryptType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataConnectorDetail {\n");
        sb.append("    connectorName: ").append(toIndentedString(connectorName)).append("\n");
        sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
        sb.append("    sourceInfo: ").append(toIndentedString(sourceInfo)).append("\n");
        sb.append("    connectorId: ").append(toIndentedString(connectorId)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    lastUpdateTime: ").append(toIndentedString(lastUpdateTime)).append("\n");
        sb.append("    createBy: ").append(toIndentedString(createBy)).append("\n");
        sb.append("    createUser: ").append(toIndentedString(createUser)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    lastUpdateBy: ").append(toIndentedString(lastUpdateBy)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    usedClusters: ").append(toIndentedString(usedClusters)).append("\n");
        sb.append("    encryptType: ").append(toIndentedString(encryptType)).append("\n");
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
