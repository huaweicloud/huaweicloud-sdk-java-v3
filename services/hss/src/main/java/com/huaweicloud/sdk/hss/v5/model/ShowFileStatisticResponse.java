package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowFileStatisticResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_num")

    private Integer hostNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "change_total_num")

    private Integer changeTotalNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "change_file_num")

    private Integer changeFileNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "change_registry_num")

    private Integer changeRegistryNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modify_num")

    private Integer modifyNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "add_num")

    private Integer addNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_num")

    private Integer deleteNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trust_num")

    private Integer trustNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "untrust_num")

    private Integer untrustNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unknown_num")

    private Integer unknownNum;

    public ShowFileStatisticResponse withHostNum(Integer hostNum) {
        this.hostNum = hostNum;
        return this;
    }

    /**
     * 服务器总数
     * minimum: 0
     * maximum: 2147483647
     * @return hostNum
     */
    public Integer getHostNum() {
        return hostNum;
    }

    public void setHostNum(Integer hostNum) {
        this.hostNum = hostNum;
    }

    public ShowFileStatisticResponse withChangeTotalNum(Integer changeTotalNum) {
        this.changeTotalNum = changeTotalNum;
        return this;
    }

    /**
     * 总变更数
     * minimum: 0
     * maximum: 2147483647
     * @return changeTotalNum
     */
    public Integer getChangeTotalNum() {
        return changeTotalNum;
    }

    public void setChangeTotalNum(Integer changeTotalNum) {
        this.changeTotalNum = changeTotalNum;
    }

    public ShowFileStatisticResponse withChangeFileNum(Integer changeFileNum) {
        this.changeFileNum = changeFileNum;
        return this;
    }

    /**
     * 变更文件数
     * minimum: 0
     * maximum: 2147483647
     * @return changeFileNum
     */
    public Integer getChangeFileNum() {
        return changeFileNum;
    }

    public void setChangeFileNum(Integer changeFileNum) {
        this.changeFileNum = changeFileNum;
    }

    public ShowFileStatisticResponse withChangeRegistryNum(Integer changeRegistryNum) {
        this.changeRegistryNum = changeRegistryNum;
        return this;
    }

    /**
     * 变更注册表数量
     * minimum: 0
     * maximum: 2147483647
     * @return changeRegistryNum
     */
    public Integer getChangeRegistryNum() {
        return changeRegistryNum;
    }

    public void setChangeRegistryNum(Integer changeRegistryNum) {
        this.changeRegistryNum = changeRegistryNum;
    }

    public ShowFileStatisticResponse withModifyNum(Integer modifyNum) {
        this.modifyNum = modifyNum;
        return this;
    }

    /**
     * 修改数量
     * minimum: 0
     * maximum: 2147483647
     * @return modifyNum
     */
    public Integer getModifyNum() {
        return modifyNum;
    }

    public void setModifyNum(Integer modifyNum) {
        this.modifyNum = modifyNum;
    }

    public ShowFileStatisticResponse withAddNum(Integer addNum) {
        this.addNum = addNum;
        return this;
    }

    /**
     * 新增数量
     * minimum: 0
     * maximum: 2147483647
     * @return addNum
     */
    public Integer getAddNum() {
        return addNum;
    }

    public void setAddNum(Integer addNum) {
        this.addNum = addNum;
    }

    public ShowFileStatisticResponse withDeleteNum(Integer deleteNum) {
        this.deleteNum = deleteNum;
        return this;
    }

    /**
     * 删除数量
     * minimum: 0
     * maximum: 2147483647
     * @return deleteNum
     */
    public Integer getDeleteNum() {
        return deleteNum;
    }

    public void setDeleteNum(Integer deleteNum) {
        this.deleteNum = deleteNum;
    }

    public ShowFileStatisticResponse withTrustNum(Integer trustNum) {
        this.trustNum = trustNum;
        return this;
    }

    /**
     * trust num
     * minimum: 0
     * maximum: 2147483647
     * @return trustNum
     */
    public Integer getTrustNum() {
        return trustNum;
    }

    public void setTrustNum(Integer trustNum) {
        this.trustNum = trustNum;
    }

    public ShowFileStatisticResponse withUntrustNum(Integer untrustNum) {
        this.untrustNum = untrustNum;
        return this;
    }

    /**
     * untrust num
     * minimum: 0
     * maximum: 2147483647
     * @return untrustNum
     */
    public Integer getUntrustNum() {
        return untrustNum;
    }

    public void setUntrustNum(Integer untrustNum) {
        this.untrustNum = untrustNum;
    }

    public ShowFileStatisticResponse withUnknownNum(Integer unknownNum) {
        this.unknownNum = unknownNum;
        return this;
    }

    /**
     * unknown_num
     * minimum: 0
     * maximum: 2147483647
     * @return unknownNum
     */
    public Integer getUnknownNum() {
        return unknownNum;
    }

    public void setUnknownNum(Integer unknownNum) {
        this.unknownNum = unknownNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowFileStatisticResponse that = (ShowFileStatisticResponse) obj;
        return Objects.equals(this.hostNum, that.hostNum) && Objects.equals(this.changeTotalNum, that.changeTotalNum)
            && Objects.equals(this.changeFileNum, that.changeFileNum)
            && Objects.equals(this.changeRegistryNum, that.changeRegistryNum)
            && Objects.equals(this.modifyNum, that.modifyNum) && Objects.equals(this.addNum, that.addNum)
            && Objects.equals(this.deleteNum, that.deleteNum) && Objects.equals(this.trustNum, that.trustNum)
            && Objects.equals(this.untrustNum, that.untrustNum) && Objects.equals(this.unknownNum, that.unknownNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hostNum,
            changeTotalNum,
            changeFileNum,
            changeRegistryNum,
            modifyNum,
            addNum,
            deleteNum,
            trustNum,
            untrustNum,
            unknownNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowFileStatisticResponse {\n");
        sb.append("    hostNum: ").append(toIndentedString(hostNum)).append("\n");
        sb.append("    changeTotalNum: ").append(toIndentedString(changeTotalNum)).append("\n");
        sb.append("    changeFileNum: ").append(toIndentedString(changeFileNum)).append("\n");
        sb.append("    changeRegistryNum: ").append(toIndentedString(changeRegistryNum)).append("\n");
        sb.append("    modifyNum: ").append(toIndentedString(modifyNum)).append("\n");
        sb.append("    addNum: ").append(toIndentedString(addNum)).append("\n");
        sb.append("    deleteNum: ").append(toIndentedString(deleteNum)).append("\n");
        sb.append("    trustNum: ").append(toIndentedString(trustNum)).append("\n");
        sb.append("    untrustNum: ").append(toIndentedString(untrustNum)).append("\n");
        sb.append("    unknownNum: ").append(toIndentedString(unknownNum)).append("\n");
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
