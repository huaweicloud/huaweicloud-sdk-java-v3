package com.huaweicloud.sdk.das.v3.model;

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
 * CreateInstanceConnectionReq
 */
public class CreateInstanceConnectionReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_type")

    private String engineType;

    /**
     * 网络类型。
     */
    public static final class NetworkTypeEnum {

        /**
         * Enum GAUSSDB for value: "gaussdb"
         */
        public static final NetworkTypeEnum GAUSSDB = new NetworkTypeEnum("gaussdb");

        /**
         * Enum DDS for value: "dds"
         */
        public static final NetworkTypeEnum DDS = new NetworkTypeEnum("dds");

        /**
         * Enum RDS for value: "rds"
         */
        public static final NetworkTypeEnum RDS = new NetworkTypeEnum("rds");

        /**
         * Enum ECS for value: "ecs"
         */
        public static final NetworkTypeEnum ECS = new NetworkTypeEnum("ecs");

        /**
         * Enum GEMINI for value: "gemini"
         */
        public static final NetworkTypeEnum GEMINI = new NetworkTypeEnum("gemini");

        /**
         * Enum DDM for value: "ddm"
         */
        public static final NetworkTypeEnum DDM = new NetworkTypeEnum("ddm");

        private static final Map<String, NetworkTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, NetworkTypeEnum> createStaticFields() {
            Map<String, NetworkTypeEnum> map = new HashMap<>();
            map.put("gaussdb", GAUSSDB);
            map.put("dds", DDS);
            map.put("rds", RDS);
            map.put("ecs", ECS);
            map.put("gemini", GEMINI);
            map.put("ddm", DDM);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        NetworkTypeEnum(String value) {
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
        public static NetworkTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new NetworkTypeEnum(value));
        }

        public static NetworkTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof NetworkTypeEnum) {
                return this.value.equals(((NetworkTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network_type")

    private NetworkTypeEnum networkType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "username")

    private String username;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_save_password")

    private Boolean isSavePassword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "password")

    private String password;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_ids")

    private List<String> nodeIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remarks")

    private String remarks;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private Integer port;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_name")

    private String databaseName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_record_flag")

    private Boolean sqlRecordFlag;

    public CreateInstanceConnectionReq withEngineType(String engineType) {
        this.engineType = engineType;
        return this;
    }

    /**
     * 数据库引擎类型。
     * @return engineType
     */
    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public CreateInstanceConnectionReq withNetworkType(NetworkTypeEnum networkType) {
        this.networkType = networkType;
        return this;
    }

    /**
     * 网络类型。
     * @return networkType
     */
    public NetworkTypeEnum getNetworkType() {
        return networkType;
    }

    public void setNetworkType(NetworkTypeEnum networkType) {
        this.networkType = networkType;
    }

    public CreateInstanceConnectionReq withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * 用户名。
     * @return username
     */
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public CreateInstanceConnectionReq withIsSavePassword(Boolean isSavePassword) {
        this.isSavePassword = isSavePassword;
        return this;
    }

    /**
     * 是否保存密码。
     * @return isSavePassword
     */
    public Boolean getIsSavePassword() {
        return isSavePassword;
    }

    public void setIsSavePassword(Boolean isSavePassword) {
        this.isSavePassword = isSavePassword;
    }

    public CreateInstanceConnectionReq withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * 密码。
     * @return password
     */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public CreateInstanceConnectionReq withNodeIds(List<String> nodeIds) {
        this.nodeIds = nodeIds;
        return this;
    }

    public CreateInstanceConnectionReq addNodeIdsItem(String nodeIdsItem) {
        if (this.nodeIds == null) {
            this.nodeIds = new ArrayList<>();
        }
        this.nodeIds.add(nodeIdsItem);
        return this;
    }

    public CreateInstanceConnectionReq withNodeIds(Consumer<List<String>> nodeIdsSetter) {
        if (this.nodeIds == null) {
            this.nodeIds = new ArrayList<>();
        }
        nodeIdsSetter.accept(this.nodeIds);
        return this;
    }

    /**
     * 节点编号。
     * @return nodeIds
     */
    public List<String> getNodeIds() {
        return nodeIds;
    }

    public void setNodeIds(List<String> nodeIds) {
        this.nodeIds = nodeIds;
    }

    public CreateInstanceConnectionReq withRemarks(String remarks) {
        this.remarks = remarks;
        return this;
    }

    /**
     * 备注。
     * @return remarks
     */
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public CreateInstanceConnectionReq withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * 端口。
     * @return port
     */
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public CreateInstanceConnectionReq withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * 数据库名字。
     * @return databaseName
     */
    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public CreateInstanceConnectionReq withSqlRecordFlag(Boolean sqlRecordFlag) {
        this.sqlRecordFlag = sqlRecordFlag;
        return this;
    }

    /**
     * sql记录开关。
     * @return sqlRecordFlag
     */
    public Boolean getSqlRecordFlag() {
        return sqlRecordFlag;
    }

    public void setSqlRecordFlag(Boolean sqlRecordFlag) {
        this.sqlRecordFlag = sqlRecordFlag;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateInstanceConnectionReq that = (CreateInstanceConnectionReq) obj;
        return Objects.equals(this.engineType, that.engineType) && Objects.equals(this.networkType, that.networkType)
            && Objects.equals(this.username, that.username) && Objects.equals(this.isSavePassword, that.isSavePassword)
            && Objects.equals(this.password, that.password) && Objects.equals(this.nodeIds, that.nodeIds)
            && Objects.equals(this.remarks, that.remarks) && Objects.equals(this.port, that.port)
            && Objects.equals(this.databaseName, that.databaseName)
            && Objects.equals(this.sqlRecordFlag, that.sqlRecordFlag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(engineType,
            networkType,
            username,
            isSavePassword,
            password,
            nodeIds,
            remarks,
            port,
            databaseName,
            sqlRecordFlag);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateInstanceConnectionReq {\n");
        sb.append("    engineType: ").append(toIndentedString(engineType)).append("\n");
        sb.append("    networkType: ").append(toIndentedString(networkType)).append("\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
        sb.append("    isSavePassword: ").append(toIndentedString(isSavePassword)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    nodeIds: ").append(toIndentedString(nodeIds)).append("\n");
        sb.append("    remarks: ").append(toIndentedString(remarks)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
        sb.append("    sqlRecordFlag: ").append(toIndentedString(sqlRecordFlag)).append("\n");
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
