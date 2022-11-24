package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * DatabaseResourceRsp
 */
public class DatabaseResourceRsp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec")

    private DatabaseSpecDto spec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disk")

    private DatabaseDiskDto disk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charge_mode")

    private String chargeMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period_num")

    private Integer periodNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private DatabaseStatusEnum status;

    public DatabaseResourceRsp withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 实例ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public DatabaseResourceRsp withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 资源ID
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public DatabaseResourceRsp withSpec(DatabaseSpecDto spec) {
        this.spec = spec;
        return this;
    }

    public DatabaseResourceRsp withSpec(Consumer<DatabaseSpecDto> specSetter) {
        if (this.spec == null) {
            this.spec = new DatabaseSpecDto();
            specSetter.accept(this.spec);
        }

        return this;
    }

    /**
     * Get spec
     * @return spec
     */
    public DatabaseSpecDto getSpec() {
        return spec;
    }

    public void setSpec(DatabaseSpecDto spec) {
        this.spec = spec;
    }

    public DatabaseResourceRsp withDisk(DatabaseDiskDto disk) {
        this.disk = disk;
        return this;
    }

    public DatabaseResourceRsp withDisk(Consumer<DatabaseDiskDto> diskSetter) {
        if (this.disk == null) {
            this.disk = new DatabaseDiskDto();
            diskSetter.accept(this.disk);
        }

        return this;
    }

    /**
     * Get disk
     * @return disk
     */
    public DatabaseDiskDto getDisk() {
        return disk;
    }

    public void setDisk(DatabaseDiskDto disk) {
        this.disk = disk;
    }

    public DatabaseResourceRsp withChargeMode(String chargeMode) {
        this.chargeMode = chargeMode;
        return this;
    }

    /**
     * 计费模式
     * @return chargeMode
     */
    public String getChargeMode() {
        return chargeMode;
    }

    public void setChargeMode(String chargeMode) {
        this.chargeMode = chargeMode;
    }

    public DatabaseResourceRsp withPeriodNum(Integer periodNum) {
        this.periodNum = periodNum;
        return this;
    }

    /**
     * 购买周期
     * @return periodNum
     */
    public Integer getPeriodNum() {
        return periodNum;
    }

    public void setPeriodNum(Integer periodNum) {
        this.periodNum = periodNum;
    }

    public DatabaseResourceRsp withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 购买时间，UTC时间
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public DatabaseResourceRsp withStatus(DatabaseStatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     * @return status
     */
    public DatabaseStatusEnum getStatus() {
        return status;
    }

    public void setStatus(DatabaseStatusEnum status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DatabaseResourceRsp databaseResourceRsp = (DatabaseResourceRsp) o;
        return Objects.equals(this.id, databaseResourceRsp.id)
            && Objects.equals(this.resourceId, databaseResourceRsp.resourceId)
            && Objects.equals(this.spec, databaseResourceRsp.spec)
            && Objects.equals(this.disk, databaseResourceRsp.disk)
            && Objects.equals(this.chargeMode, databaseResourceRsp.chargeMode)
            && Objects.equals(this.periodNum, databaseResourceRsp.periodNum)
            && Objects.equals(this.createTime, databaseResourceRsp.createTime)
            && Objects.equals(this.status, databaseResourceRsp.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, resourceId, spec, disk, chargeMode, periodNum, createTime, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DatabaseResourceRsp {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
        sb.append("    disk: ").append(toIndentedString(disk)).append("\n");
        sb.append("    chargeMode: ").append(toIndentedString(chargeMode)).append("\n");
        sb.append("    periodNum: ").append(toIndentedString(periodNum)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
