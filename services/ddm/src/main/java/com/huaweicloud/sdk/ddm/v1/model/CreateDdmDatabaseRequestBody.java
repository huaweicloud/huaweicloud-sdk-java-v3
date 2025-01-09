package com.huaweicloud.sdk.ddm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * databases参数说明
 */
public class CreateDdmDatabaseRequestBody {

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
    @JsonProperty(value = "dn_instances")

    private List<DatabaseDnInstances> dnInstances = null;

    public CreateDdmDatabaseRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 逻辑库名称，需要满足以下条件：  - 长度为2-48个字符。 - 必须以小写字母开头。 - 可以包含小写字母、数字、下划线，不能包含大写字母和其它特殊字符。 - 禁用关键字：  \"information_schema\"、\"mysql\"、\"performance_schema\"、\"sys\"。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateDdmDatabaseRequestBody withShardMode(String shardMode) {
        this.shardMode = shardMode;
        return this;
    }

    /**
     * 逻辑库的拆分模式。 - cluster表示逻辑库是拆分模式。 - single表示逻辑库是非拆分模式。
     * @return shardMode
     */
    public String getShardMode() {
        return shardMode;
    }

    public void setShardMode(String shardMode) {
        this.shardMode = shardMode;
    }

    public CreateDdmDatabaseRequestBody withShardNumber(Integer shardNumber) {
        this.shardNumber = shardNumber;
        return this;
    }

    /**
     * 同一种工作模式下逻辑库分片的数量。 - shard_unit不为空， shard_unit与关联DN数量的乘积 - shard_unit为空，大于关联的DN数量，小于等于关联DN数量*64。
     * @return shardNumber
     */
    public Integer getShardNumber() {
        return shardNumber;
    }

    public void setShardNumber(Integer shardNumber) {
        this.shardNumber = shardNumber;
    }

    public CreateDdmDatabaseRequestBody withDnInstances(List<DatabaseDnInstances> dnInstances) {
        this.dnInstances = dnInstances;
        return this;
    }

    public CreateDdmDatabaseRequestBody addDnInstancesItem(DatabaseDnInstances dnInstancesItem) {
        if (this.dnInstances == null) {
            this.dnInstances = new ArrayList<>();
        }
        this.dnInstances.add(dnInstancesItem);
        return this;
    }

    public CreateDdmDatabaseRequestBody withDnInstances(Consumer<List<DatabaseDnInstances>> dnInstancesSetter) {
        if (this.dnInstances == null) {
            this.dnInstances = new ArrayList<>();
        }
        dnInstancesSetter.accept(this.dnInstances);
        return this;
    }

    /**
     * 逻辑库关联的DN信息,最大个数为256。
     * @return dnInstances
     */
    public List<DatabaseDnInstances> getDnInstances() {
        return dnInstances;
    }

    public void setDnInstances(List<DatabaseDnInstances> dnInstances) {
        this.dnInstances = dnInstances;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateDdmDatabaseRequestBody that = (CreateDdmDatabaseRequestBody) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.shardMode, that.shardMode)
            && Objects.equals(this.shardNumber, that.shardNumber) && Objects.equals(this.dnInstances, that.dnInstances);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, shardMode, shardNumber, dnInstances);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateDdmDatabaseRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    shardMode: ").append(toIndentedString(shardMode)).append("\n");
        sb.append("    shardNumber: ").append(toIndentedString(shardNumber)).append("\n");
        sb.append("    dnInstances: ").append(toIndentedString(dnInstances)).append("\n");
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
