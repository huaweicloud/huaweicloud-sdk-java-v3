package com.huaweicloud.sdk.ddm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * databases 返回参数
 */
public class GetDatabaseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shard_mode")

    private String shardMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shard_number")

    private Integer shardNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created")

    private Long created;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used_rds")

    private List<GetDatabaseUsedRds> usedRds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shard_unit")

    private Integer shardUnit;

    public GetDatabaseInfo withName(String name) {
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

    public GetDatabaseInfo withShardMode(String shardMode) {
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

    public GetDatabaseInfo withShardNumber(Integer shardNumber) {
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

    public GetDatabaseInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 逻辑库状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public GetDatabaseInfo withCreated(Long created) {
        this.created = created;
        return this;
    }

    /**
     * 逻辑库的创建时间。
     * @return created
     */
    public Long getCreated() {
        return created;
    }

    public void setCreated(Long created) {
        this.created = created;
    }

    public GetDatabaseInfo withUsedRds(List<GetDatabaseUsedRds> usedRds) {
        this.usedRds = usedRds;
        return this;
    }

    public GetDatabaseInfo addUsedRdsItem(GetDatabaseUsedRds usedRdsItem) {
        if (this.usedRds == null) {
            this.usedRds = new ArrayList<>();
        }
        this.usedRds.add(usedRdsItem);
        return this;
    }

    public GetDatabaseInfo withUsedRds(Consumer<List<GetDatabaseUsedRds>> usedRdsSetter) {
        if (this.usedRds == null) {
            this.usedRds = new ArrayList<>();
        }
        usedRdsSetter.accept(this.usedRds);
        return this;
    }

    /**
     * 逻辑库关联的RDS实例信息。
     * @return usedRds
     */
    public List<GetDatabaseUsedRds> getUsedRds() {
        return usedRds;
    }

    public void setUsedRds(List<GetDatabaseUsedRds> usedRds) {
        this.usedRds = usedRds;
    }

    public GetDatabaseInfo withShardUnit(Integer shardUnit) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GetDatabaseInfo that = (GetDatabaseInfo) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.shardMode, that.shardMode)
            && Objects.equals(this.shardNumber, that.shardNumber) && Objects.equals(this.status, that.status)
            && Objects.equals(this.created, that.created) && Objects.equals(this.usedRds, that.usedRds)
            && Objects.equals(this.shardUnit, that.shardUnit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, shardMode, shardNumber, status, created, usedRds, shardUnit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetDatabaseInfo {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    shardMode: ").append(toIndentedString(shardMode)).append("\n");
        sb.append("    shardNumber: ").append(toIndentedString(shardNumber)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    usedRds: ").append(toIndentedString(usedRds)).append("\n");
        sb.append("    shardUnit: ").append(toIndentedString(shardUnit)).append("\n");
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
