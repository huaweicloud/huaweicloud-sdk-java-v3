package com.huaweicloud.sdk.dbss.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DataResourceHead
 */
public class DataResourceHead {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alias")

    private String alias;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datastore")

    private DbDataStore datastore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_ip")

    private String dbIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_name")

    private String dbName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_port")

    private String dbPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_user_list")

    private List<DbUser> dbUserList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider")

    private String provider;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rds_id")

    private String rdsId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    public DataResourceHead withAlias(String alias) {
        this.alias = alias;
        return this;
    }

    /**
     * 数据库实例别名
     * @return alias
     */
    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public DataResourceHead withDatastore(DbDataStore datastore) {
        this.datastore = datastore;
        return this;
    }

    public DataResourceHead withDatastore(Consumer<DbDataStore> datastoreSetter) {
        if (this.datastore == null) {
            this.datastore = new DbDataStore();
            datastoreSetter.accept(this.datastore);
        }

        return this;
    }

    /**
     * Get datastore
     * @return datastore
     */
    public DbDataStore getDatastore() {
        return datastore;
    }

    public void setDatastore(DbDataStore datastore) {
        this.datastore = datastore;
    }

    public DataResourceHead withDbIp(String dbIp) {
        this.dbIp = dbIp;
        return this;
    }

    /**
     * 数据库IP
     * @return dbIp
     */
    public String getDbIp() {
        return dbIp;
    }

    public void setDbIp(String dbIp) {
        this.dbIp = dbIp;
    }

    public DataResourceHead withDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }

    /**
     * 数据库名称
     * @return dbName
     */
    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public DataResourceHead withDbPort(String dbPort) {
        this.dbPort = dbPort;
        return this;
    }

    /**
     * 数据库端口
     * @return dbPort
     */
    public String getDbPort() {
        return dbPort;
    }

    public void setDbPort(String dbPort) {
        this.dbPort = dbPort;
    }

    public DataResourceHead withDbUserList(List<DbUser> dbUserList) {
        this.dbUserList = dbUserList;
        return this;
    }

    public DataResourceHead addDbUserListItem(DbUser dbUserListItem) {
        if (this.dbUserList == null) {
            this.dbUserList = new ArrayList<>();
        }
        this.dbUserList.add(dbUserListItem);
        return this;
    }

    public DataResourceHead withDbUserList(Consumer<List<DbUser>> dbUserListSetter) {
        if (this.dbUserList == null) {
            this.dbUserList = new ArrayList<>();
        }
        dbUserListSetter.accept(this.dbUserList);
        return this;
    }

    /**
     * 数据库用户列表
     * @return dbUserList
     */
    public List<DbUser> getDbUserList() {
        return dbUserList;
    }

    public void setDbUserList(List<DbUser> dbUserList) {
        this.dbUserList = dbUserList;
    }

    public DataResourceHead withProvider(String provider) {
        this.provider = provider;
        return this;
    }

    /**
     * 云服务名称，云上数据库服务，如：rds
     * @return provider
     */
    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public DataResourceHead withRdsId(String rdsId) {
        this.rdsId = rdsId;
        return this;
    }

    /**
     * rds数据库ID
     * @return rdsId
     */
    public String getRdsId() {
        return rdsId;
    }

    public void setRdsId(String rdsId) {
        this.rdsId = rdsId;
    }

    public DataResourceHead withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 数据库状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public DataResourceHead withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 数据库类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DataResourceHead that = (DataResourceHead) obj;
        return Objects.equals(this.alias, that.alias) && Objects.equals(this.datastore, that.datastore)
            && Objects.equals(this.dbIp, that.dbIp) && Objects.equals(this.dbName, that.dbName)
            && Objects.equals(this.dbPort, that.dbPort) && Objects.equals(this.dbUserList, that.dbUserList)
            && Objects.equals(this.provider, that.provider) && Objects.equals(this.rdsId, that.rdsId)
            && Objects.equals(this.status, that.status) && Objects.equals(this.type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alias, datastore, dbIp, dbName, dbPort, dbUserList, provider, rdsId, status, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataResourceHead {\n");
        sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
        sb.append("    datastore: ").append(toIndentedString(datastore)).append("\n");
        sb.append("    dbIp: ").append(toIndentedString(dbIp)).append("\n");
        sb.append("    dbName: ").append(toIndentedString(dbName)).append("\n");
        sb.append("    dbPort: ").append(toIndentedString(dbPort)).append("\n");
        sb.append("    dbUserList: ").append(toIndentedString(dbUserList)).append("\n");
        sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
        sb.append("    rdsId: ").append(toIndentedString(rdsId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
