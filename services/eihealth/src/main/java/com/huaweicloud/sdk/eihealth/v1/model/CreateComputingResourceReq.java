package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CreateComputingResourceReq
 */
public class CreateComputingResourceReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone_id")

    private String availabilityZoneId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec_code")

    private String specCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_disk_spec_code")

    private String dataDiskSpecCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_disk_size")

    private Integer dataDiskSize;

    public CreateComputingResourceReq withAvailabilityZoneId(String availabilityZoneId) {
        this.availabilityZoneId = availabilityZoneId;
        return this;
    }

    /**
     * 可用区
     * @return availabilityZoneId
     */
    public String getAvailabilityZoneId() {
        return availabilityZoneId;
    }

    public void setAvailabilityZoneId(String availabilityZoneId) {
        this.availabilityZoneId = availabilityZoneId;
    }

    public CreateComputingResourceReq withSpecCode(String specCode) {
        this.specCode = specCode;
        return this;
    }

    /**
     * 规格编码
     * @return specCode
     */
    public String getSpecCode() {
        return specCode;
    }

    public void setSpecCode(String specCode) {
        this.specCode = specCode;
    }

    public CreateComputingResourceReq withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 购买数量
     * minimum: 1
     * maximum: 10
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public CreateComputingResourceReq withDataDiskSpecCode(String dataDiskSpecCode) {
        this.dataDiskSpecCode = dataDiskSpecCode;
        return this;
    }

    /**
     * 额外数据盘规格编码
     * @return dataDiskSpecCode
     */
    public String getDataDiskSpecCode() {
        return dataDiskSpecCode;
    }

    public void setDataDiskSpecCode(String dataDiskSpecCode) {
        this.dataDiskSpecCode = dataDiskSpecCode;
    }

    public CreateComputingResourceReq withDataDiskSize(Integer dataDiskSize) {
        this.dataDiskSize = dataDiskSize;
        return this;
    }

    /**
     * 额外数据盘大小
     * minimum: 100
     * maximum: 32768
     * @return dataDiskSize
     */
    public Integer getDataDiskSize() {
        return dataDiskSize;
    }

    public void setDataDiskSize(Integer dataDiskSize) {
        this.dataDiskSize = dataDiskSize;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateComputingResourceReq createComputingResourceReq = (CreateComputingResourceReq) o;
        return Objects.equals(this.availabilityZoneId, createComputingResourceReq.availabilityZoneId)
            && Objects.equals(this.specCode, createComputingResourceReq.specCode)
            && Objects.equals(this.count, createComputingResourceReq.count)
            && Objects.equals(this.dataDiskSpecCode, createComputingResourceReq.dataDiskSpecCode)
            && Objects.equals(this.dataDiskSize, createComputingResourceReq.dataDiskSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(availabilityZoneId, specCode, count, dataDiskSpecCode, dataDiskSize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateComputingResourceReq {\n");
        sb.append("    availabilityZoneId: ").append(toIndentedString(availabilityZoneId)).append("\n");
        sb.append("    specCode: ").append(toIndentedString(specCode)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    dataDiskSpecCode: ").append(toIndentedString(dataDiskSpecCode)).append("\n");
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
