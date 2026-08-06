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
public class ListTaskTableReferenceDetailRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace")

    private String workspace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Project-Id")

    private String xProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_name")

    private String tableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_type")

    private String dbType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_base_name")

    private String dataBaseName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_name")

    private String clusterName;

    /**
     * 输入输出类型： - 0: 读表 - 1: 写表
     */
    public static final class IoTypeEnum {

        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final IoTypeEnum NUMBER_0 = new IoTypeEnum(0);

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final IoTypeEnum NUMBER_1 = new IoTypeEnum(1);

        private static final Map<Integer, IoTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, IoTypeEnum> createStaticFields() {
            Map<Integer, IoTypeEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        IoTypeEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static IoTypeEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new IoTypeEnum(value));
        }

        public static IoTypeEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof IoTypeEnum) {
                return this.value.equals(((IoTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "io_type")

    private IoTypeEnum ioType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_name")

    private String workspaceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner")

    private String owner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_user")

    private String executeUser;

    public ListTaskTableReferenceDetailRequest withWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }

    /**
     * 工作空间ID，获取方法请参见[实例ID和工作空间ID](dataartsstudio_02_0350.xml)。
     * @return workspace
     */
    public String getWorkspace() {
        return workspace;
    }

    public void setWorkspace(String workspace) {
        this.workspace = workspace;
    }

    public ListTaskTableReferenceDetailRequest withXProjectId(String xProjectId) {
        this.xProjectId = xProjectId;
        return this;
    }

    /**
     * 项目ID，获取方法请参见[项目ID和账号ID](projectid_accountid.xml)。  多project场景采用AK/SK认证的接口请求，则该字段必选。
     * @return xProjectId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Project-Id")
    public String getXProjectId() {
        return xProjectId;
    }

    public void setXProjectId(String xProjectId) {
        this.xProjectId = xProjectId;
    }

    public ListTaskTableReferenceDetailRequest withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * 表名。
     * @return tableName
     */
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public ListTaskTableReferenceDetailRequest withDbType(String dbType) {
        this.dbType = dbType;
        return this;
    }

    /**
     * 数据库类型，仅支持DLI，HIVE，SPARK。
     * @return dbType
     */
    public String getDbType() {
        return dbType;
    }

    public void setDbType(String dbType) {
        this.dbType = dbType;
    }

    public ListTaskTableReferenceDetailRequest withDataBaseName(String dataBaseName) {
        this.dataBaseName = dataBaseName;
        return this;
    }

    /**
     * 数据库名称。
     * @return dataBaseName
     */
    public String getDataBaseName() {
        return dataBaseName;
    }

    public void setDataBaseName(String dataBaseName) {
        this.dataBaseName = dataBaseName;
    }

    public ListTaskTableReferenceDetailRequest withClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }

    /**
     * 集群名称。
     * @return clusterName
     */
    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public ListTaskTableReferenceDetailRequest withIoType(IoTypeEnum ioType) {
        this.ioType = ioType;
        return this;
    }

    /**
     * 输入输出类型： - 0: 读表 - 1: 写表
     * @return ioType
     */
    public IoTypeEnum getIoType() {
        return ioType;
    }

    public void setIoType(IoTypeEnum ioType) {
        this.ioType = ioType;
    }

    public ListTaskTableReferenceDetailRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 分页的起始页，取值范围大于等于0。默认值: 0。
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListTaskTableReferenceDetailRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 分页返回结果，指定每页最大记录数。默认值: 20。
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListTaskTableReferenceDetailRequest withWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }

    /**
     * 工作空间名称。
     * @return workspaceName
     */
    public String getWorkspaceName() {
        return workspaceName;
    }

    public void setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
    }

    public ListTaskTableReferenceDetailRequest withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * 作业责任人。
     * @return owner
     */
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public ListTaskTableReferenceDetailRequest withExecuteUser(String executeUser) {
        this.executeUser = executeUser;
        return this;
    }

    /**
     * 作业执行用户。
     * @return executeUser
     */
    public String getExecuteUser() {
        return executeUser;
    }

    public void setExecuteUser(String executeUser) {
        this.executeUser = executeUser;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListTaskTableReferenceDetailRequest that = (ListTaskTableReferenceDetailRequest) obj;
        return Objects.equals(this.workspace, that.workspace) && Objects.equals(this.xProjectId, that.xProjectId)
            && Objects.equals(this.tableName, that.tableName) && Objects.equals(this.dbType, that.dbType)
            && Objects.equals(this.dataBaseName, that.dataBaseName)
            && Objects.equals(this.clusterName, that.clusterName) && Objects.equals(this.ioType, that.ioType)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.workspaceName, that.workspaceName) && Objects.equals(this.owner, that.owner)
            && Objects.equals(this.executeUser, that.executeUser);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workspace,
            xProjectId,
            tableName,
            dbType,
            dataBaseName,
            clusterName,
            ioType,
            offset,
            limit,
            workspaceName,
            owner,
            executeUser);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTaskTableReferenceDetailRequest {\n");
        sb.append("    workspace: ").append(toIndentedString(workspace)).append("\n");
        sb.append("    xProjectId: ").append(toIndentedString(xProjectId)).append("\n");
        sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
        sb.append("    dbType: ").append(toIndentedString(dbType)).append("\n");
        sb.append("    dataBaseName: ").append(toIndentedString(dataBaseName)).append("\n");
        sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
        sb.append("    ioType: ").append(toIndentedString(ioType)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    workspaceName: ").append(toIndentedString(workspaceName)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    executeUser: ").append(toIndentedString(executeUser)).append("\n");
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
