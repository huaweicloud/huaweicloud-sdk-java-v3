package com.huaweicloud.sdk.cbh.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * 堡垒机规格信息。
 */
public class CbsGetSpecInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_spec_code")

    private String resourceSpecCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ecs_system_data_size")

    private Integer ecsSystemDataSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu")

    private Integer cpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ram")

    private Integer ram;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset")

    private Integer asset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection")

    private Integer connection;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_disk_size")

    private BigDecimal dataDiskSize;

    public CbsGetSpecInfo withResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
        return this;
    }

    /**
     * 云堡垒机规格名称。
     * @return resourceSpecCode
     */
    public String getResourceSpecCode() {
        return resourceSpecCode;
    }

    public void setResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
    }

    public CbsGetSpecInfo withEcsSystemDataSize(Integer ecsSystemDataSize) {
        this.ecsSystemDataSize = ecsSystemDataSize;
        return this;
    }

    /**
     * 云堡垒机系统盘磁盘大小，单位GB。
     * minimum: 0
     * maximum: 9223372036854775807
     * @return ecsSystemDataSize
     */
    public Integer getEcsSystemDataSize() {
        return ecsSystemDataSize;
    }

    public void setEcsSystemDataSize(Integer ecsSystemDataSize) {
        this.ecsSystemDataSize = ecsSystemDataSize;
    }

    public CbsGetSpecInfo withCpu(Integer cpu) {
        this.cpu = cpu;
        return this;
    }

    /**
     * 云堡垒机CPU核心数。
     * minimum: 0
     * maximum: 9223372036854775807
     * @return cpu
     */
    public Integer getCpu() {
        return cpu;
    }

    public void setCpu(Integer cpu) {
        this.cpu = cpu;
    }

    public CbsGetSpecInfo withRam(Integer ram) {
        this.ram = ram;
        return this;
    }

    /**
     * 云堡垒机内存大小，单位GB。
     * minimum: 0
     * maximum: 9223372036854775807
     * @return ram
     */
    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public CbsGetSpecInfo withAsset(Integer asset) {
        this.asset = asset;
        return this;
    }

    /**
     * 云堡垒机资产数量。
     * minimum: 0
     * maximum: 9223372036854775807
     * @return asset
     */
    public Integer getAsset() {
        return asset;
    }

    public void setAsset(Integer asset) {
        this.asset = asset;
    }

    public CbsGetSpecInfo withConnection(Integer connection) {
        this.connection = connection;
        return this;
    }

    /**
     * 云堡垒机最大连接数。
     * minimum: 0
     * maximum: 9223372036854775807
     * @return connection
     */
    public Integer getConnection() {
        return connection;
    }

    public void setConnection(Integer connection) {
        this.connection = connection;
    }

    public CbsGetSpecInfo withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 云堡垒机规格类型。 - basic：标准版 - enhance：专业版
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public CbsGetSpecInfo withDataDiskSize(BigDecimal dataDiskSize) {
        this.dataDiskSize = dataDiskSize;
        return this;
    }

    /**
     * 云堡垒机数据盘大小，单位TB。
     * minimum: 0
     * maximum: 9223372036854775807
     * @return dataDiskSize
     */
    public BigDecimal getDataDiskSize() {
        return dataDiskSize;
    }

    public void setDataDiskSize(BigDecimal dataDiskSize) {
        this.dataDiskSize = dataDiskSize;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CbsGetSpecInfo that = (CbsGetSpecInfo) obj;
        return Objects.equals(this.resourceSpecCode, that.resourceSpecCode)
            && Objects.equals(this.ecsSystemDataSize, that.ecsSystemDataSize) && Objects.equals(this.cpu, that.cpu)
            && Objects.equals(this.ram, that.ram) && Objects.equals(this.asset, that.asset)
            && Objects.equals(this.connection, that.connection) && Objects.equals(this.type, that.type)
            && Objects.equals(this.dataDiskSize, that.dataDiskSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceSpecCode, ecsSystemDataSize, cpu, ram, asset, connection, type, dataDiskSize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CbsGetSpecInfo {\n");
        sb.append("    resourceSpecCode: ").append(toIndentedString(resourceSpecCode)).append("\n");
        sb.append("    ecsSystemDataSize: ").append(toIndentedString(ecsSystemDataSize)).append("\n");
        sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
        sb.append("    ram: ").append(toIndentedString(ram)).append("\n");
        sb.append("    asset: ").append(toIndentedString(asset)).append("\n");
        sb.append("    connection: ").append(toIndentedString(connection)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    dataDiskSize: ").append(toIndentedString(dataDiskSize)).append("\n");
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
