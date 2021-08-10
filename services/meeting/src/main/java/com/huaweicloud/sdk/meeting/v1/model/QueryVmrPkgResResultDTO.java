package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** 查询Vmr套餐包分配数量结果 */
public class QueryVmrPkgResResultDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vmrPkgId")

    private String vmrPkgId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vmrName")

    private String vmrName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vmrPkgParties")

    private Integer vmrPkgParties;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vmrPkgCount")

    private Integer vmrPkgCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vmrPkgUsedCount")

    private Integer vmrPkgUsedCount;

    public QueryVmrPkgResResultDTO withVmrPkgId(String vmrPkgId) {
        this.vmrPkgId = vmrPkgId;
        return this;
    }

    /** 云会议室套餐包id。
     * 
     * @return vmrPkgId */
    public String getVmrPkgId() {
        return vmrPkgId;
    }

    public void setVmrPkgId(String vmrPkgId) {
        this.vmrPkgId = vmrPkgId;
    }

    public QueryVmrPkgResResultDTO withVmrName(String vmrName) {
        this.vmrName = vmrName;
        return this;
    }

    /** 云会议室套餐包名称。
     * 
     * @return vmrName */
    public String getVmrName() {
        return vmrName;
    }

    public void setVmrName(String vmrName) {
        this.vmrName = vmrName;
    }

    public QueryVmrPkgResResultDTO withVmrPkgParties(Integer vmrPkgParties) {
        this.vmrPkgParties = vmrPkgParties;
        return this;
    }

    /** 云会议室套餐方数。
     * 
     * @return vmrPkgParties */
    public Integer getVmrPkgParties() {
        return vmrPkgParties;
    }

    public void setVmrPkgParties(Integer vmrPkgParties) {
        this.vmrPkgParties = vmrPkgParties;
    }

    public QueryVmrPkgResResultDTO withVmrPkgCount(Integer vmrPkgCount) {
        this.vmrPkgCount = vmrPkgCount;
        return this;
    }

    /** 该云会议室套餐分配的总数。
     * 
     * @return vmrPkgCount */
    public Integer getVmrPkgCount() {
        return vmrPkgCount;
    }

    public void setVmrPkgCount(Integer vmrPkgCount) {
        this.vmrPkgCount = vmrPkgCount;
    }

    public QueryVmrPkgResResultDTO withVmrPkgUsedCount(Integer vmrPkgUsedCount) {
        this.vmrPkgUsedCount = vmrPkgUsedCount;
        return this;
    }

    /** 该套餐对应的云会议室已分配数量。
     * 
     * @return vmrPkgUsedCount */
    public Integer getVmrPkgUsedCount() {
        return vmrPkgUsedCount;
    }

    public void setVmrPkgUsedCount(Integer vmrPkgUsedCount) {
        this.vmrPkgUsedCount = vmrPkgUsedCount;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QueryVmrPkgResResultDTO queryVmrPkgResResultDTO = (QueryVmrPkgResResultDTO) o;
        return Objects.equals(this.vmrPkgId, queryVmrPkgResResultDTO.vmrPkgId)
            && Objects.equals(this.vmrName, queryVmrPkgResResultDTO.vmrName)
            && Objects.equals(this.vmrPkgParties, queryVmrPkgResResultDTO.vmrPkgParties)
            && Objects.equals(this.vmrPkgCount, queryVmrPkgResResultDTO.vmrPkgCount)
            && Objects.equals(this.vmrPkgUsedCount, queryVmrPkgResResultDTO.vmrPkgUsedCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vmrPkgId, vmrName, vmrPkgParties, vmrPkgCount, vmrPkgUsedCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryVmrPkgResResultDTO {\n");
        sb.append("    vmrPkgId: ").append(toIndentedString(vmrPkgId)).append("\n");
        sb.append("    vmrName: ").append(toIndentedString(vmrName)).append("\n");
        sb.append("    vmrPkgParties: ").append(toIndentedString(vmrPkgParties)).append("\n");
        sb.append("    vmrPkgCount: ").append(toIndentedString(vmrPkgCount)).append("\n");
        sb.append("    vmrPkgUsedCount: ").append(toIndentedString(vmrPkgUsedCount)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
