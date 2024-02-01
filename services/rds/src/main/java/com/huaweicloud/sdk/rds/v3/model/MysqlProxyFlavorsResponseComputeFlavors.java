package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * MysqlProxyFlavorsResponseComputeFlavors
 */
public class MysqlProxyFlavorsResponseComputeFlavors {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private String code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu")

    private String cpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mem")

    private String mem;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_type")

    private String dbType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "az_status")

    private Object azStatus;

    public MysqlProxyFlavorsResponseComputeFlavors withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 数据库代理规格ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public MysqlProxyFlavorsResponseComputeFlavors withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * 数据库代理规格码。
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public MysqlProxyFlavorsResponseComputeFlavors withCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }

    /**
     * CPU大小。例如：1表示1U。
     * @return cpu
     */
    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public MysqlProxyFlavorsResponseComputeFlavors withMem(String mem) {
        this.mem = mem;
        return this;
    }

    /**
     * 内存大小，单位为GB。
     * @return mem
     */
    public String getMem() {
        return mem;
    }

    public void setMem(String mem) {
        this.mem = mem;
    }

    public MysqlProxyFlavorsResponseComputeFlavors withDbType(String dbType) {
        this.dbType = dbType;
        return this;
    }

    /**
     * 数据库类型。
     * @return dbType
     */
    public String getDbType() {
        return dbType;
    }

    public void setDbType(String dbType) {
        this.dbType = dbType;
    }

    public MysqlProxyFlavorsResponseComputeFlavors withAzStatus(Object azStatus) {
        this.azStatus = azStatus;
        return this;
    }

    /**
     * 可用区信息，其中key是该规格绑定的可用区，value是该规格在对应可用区中的状态。 取值范围：     normal：正常     abandon：禁用      - 仅展示数据库主实例所在可用区规格状态。
     * @return azStatus
     */
    public Object getAzStatus() {
        return azStatus;
    }

    public void setAzStatus(Object azStatus) {
        this.azStatus = azStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MysqlProxyFlavorsResponseComputeFlavors that = (MysqlProxyFlavorsResponseComputeFlavors) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.code, that.code)
            && Objects.equals(this.cpu, that.cpu) && Objects.equals(this.mem, that.mem)
            && Objects.equals(this.dbType, that.dbType) && Objects.equals(this.azStatus, that.azStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, code, cpu, mem, dbType, azStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MysqlProxyFlavorsResponseComputeFlavors {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
        sb.append("    mem: ").append(toIndentedString(mem)).append("\n");
        sb.append("    dbType: ").append(toIndentedString(dbType)).append("\n");
        sb.append("    azStatus: ").append(toIndentedString(azStatus)).append("\n");
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
