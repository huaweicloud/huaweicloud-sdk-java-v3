package com.huaweicloud.sdk.ddm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * database 返回参数
 */
public class GetDatabaseResponseBean {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created")

    @JacksonXmlProperty(localName = "created")

    private String created;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    @JacksonXmlProperty(localName = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated")

    @JacksonXmlProperty(localName = "updated")

    private String updated;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "databases")

    @JacksonXmlProperty(localName = "databases")

    private List<GetDatabases> databases = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shard_mode")

    @JacksonXmlProperty(localName = "shard_mode")

    private String shardMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shard_number")

    @JacksonXmlProperty(localName = "shard_number")

    private Integer shardNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shard_unit")

    @JacksonXmlProperty(localName = "shard_unit")

    private Integer shardUnit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataVips")

    @JacksonXmlProperty(localName = "dataVips")

    private List<String> dataVips = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used_rds")

    @JacksonXmlProperty(localName = "used_rds")

    private List<GetDatabaseUsedRds> usedRds = null;

    public GetDatabaseResponseBean withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 逻辑库名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GetDatabaseResponseBean withCreated(String created) {
        this.created = created;
        return this;
    }

    /**
     * 逻辑库的创建时间。
     * @return created
     */
    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public GetDatabaseResponseBean withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public GetDatabaseResponseBean withUpdated(String updated) {
        this.updated = updated;
        return this;
    }

    /**
     * DDM实例最后更新时间。
     * @return updated
     */
    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public GetDatabaseResponseBean withDatabases(List<GetDatabases> databases) {
        this.databases = databases;
        return this;
    }

    public GetDatabaseResponseBean addDatabasesItem(GetDatabases databasesItem) {
        if (this.databases == null) {
            this.databases = new ArrayList<>();
        }
        this.databases.add(databasesItem);
        return this;
    }

    public GetDatabaseResponseBean withDatabases(Consumer<List<GetDatabases>> databasesSetter) {
        if (this.databases == null) {
            this.databases = new ArrayList<>();
        }
        databasesSetter.accept(this.databases);
        return this;
    }

    /**
     * 逻辑库分片的详细信息。
     * @return databases
     */
    public List<GetDatabases> getDatabases() {
        return databases;
    }

    public void setDatabases(List<GetDatabases> databases) {
        this.databases = databases;
    }

    public GetDatabaseResponseBean withShardMode(String shardMode) {
        this.shardMode = shardMode;
        return this;
    }

    /**
     * 逻辑库的工作模式。  - cluster表示逻辑库是拆分模式。 - single表示逻辑库是非拆分模式。
     * @return shardMode
     */
    public String getShardMode() {
        return shardMode;
    }

    public void setShardMode(String shardMode) {
        this.shardMode = shardMode;
    }

    public GetDatabaseResponseBean withShardNumber(Integer shardNumber) {
        this.shardNumber = shardNumber;
        return this;
    }

    /**
     * 同一种工作模式下逻辑库分片的数量。
     * @return shardNumber
     */
    public Integer getShardNumber() {
        return shardNumber;
    }

    public void setShardNumber(Integer shardNumber) {
        this.shardNumber = shardNumber;
    }

    public GetDatabaseResponseBean withShardUnit(Integer shardUnit) {
        this.shardUnit = shardUnit;
        return this;
    }

    /**
     * 单个RDS上的逻辑库分片数。
     * @return shardUnit
     */
    public Integer getShardUnit() {
        return shardUnit;
    }

    public void setShardUnit(Integer shardUnit) {
        this.shardUnit = shardUnit;
    }

    public GetDatabaseResponseBean withDataVips(List<String> dataVips) {
        this.dataVips = dataVips;
        return this;
    }

    public GetDatabaseResponseBean addDataVipsItem(String dataVipsItem) {
        if (this.dataVips == null) {
            this.dataVips = new ArrayList<>();
        }
        this.dataVips.add(dataVipsItem);
        return this;
    }

    public GetDatabaseResponseBean withDataVips(Consumer<List<String>> dataVipsSetter) {
        if (this.dataVips == null) {
            this.dataVips = new ArrayList<>();
        }
        dataVipsSetter.accept(this.dataVips);
        return this;
    }

    /**
     * 连接逻辑库使用的IP:端口。
     * @return dataVips
     */
    public List<String> getDataVips() {
        return dataVips;
    }

    public void setDataVips(List<String> dataVips) {
        this.dataVips = dataVips;
    }

    public GetDatabaseResponseBean withUsedRds(List<GetDatabaseUsedRds> usedRds) {
        this.usedRds = usedRds;
        return this;
    }

    public GetDatabaseResponseBean addUsedRdsItem(GetDatabaseUsedRds usedRdsItem) {
        if (this.usedRds == null) {
            this.usedRds = new ArrayList<>();
        }
        this.usedRds.add(usedRdsItem);
        return this;
    }

    public GetDatabaseResponseBean withUsedRds(Consumer<List<GetDatabaseUsedRds>> usedRdsSetter) {
        if (this.usedRds == null) {
            this.usedRds = new ArrayList<>();
        }
        usedRdsSetter.accept(this.usedRds);
        return this;
    }

    /**
     * 关联RDS
     * @return usedRds
     */
    public List<GetDatabaseUsedRds> getUsedRds() {
        return usedRds;
    }

    public void setUsedRds(List<GetDatabaseUsedRds> usedRds) {
        this.usedRds = usedRds;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetDatabaseResponseBean getDatabaseResponseBean = (GetDatabaseResponseBean) o;
        return Objects.equals(this.name, getDatabaseResponseBean.name)
            && Objects.equals(this.created, getDatabaseResponseBean.created)
            && Objects.equals(this.status, getDatabaseResponseBean.status)
            && Objects.equals(this.updated, getDatabaseResponseBean.updated)
            && Objects.equals(this.databases, getDatabaseResponseBean.databases)
            && Objects.equals(this.shardMode, getDatabaseResponseBean.shardMode)
            && Objects.equals(this.shardNumber, getDatabaseResponseBean.shardNumber)
            && Objects.equals(this.shardUnit, getDatabaseResponseBean.shardUnit)
            && Objects.equals(this.dataVips, getDatabaseResponseBean.dataVips)
            && Objects.equals(this.usedRds, getDatabaseResponseBean.usedRds);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(name, created, status, updated, databases, shardMode, shardNumber, shardUnit, dataVips, usedRds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetDatabaseResponseBean {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
        sb.append("    databases: ").append(toIndentedString(databases)).append("\n");
        sb.append("    shardMode: ").append(toIndentedString(shardMode)).append("\n");
        sb.append("    shardNumber: ").append(toIndentedString(shardNumber)).append("\n");
        sb.append("    shardUnit: ").append(toIndentedString(shardUnit)).append("\n");
        sb.append("    dataVips: ").append(toIndentedString(dataVips)).append("\n");
        sb.append("    usedRds: ").append(toIndentedString(usedRds)).append("\n");
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
