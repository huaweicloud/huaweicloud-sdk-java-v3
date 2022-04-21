package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 组织查询的vmr列表，不越权显示vmr的来宾密码，主席密码等
 */
public class QueryOrgVmrResultDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vmrId")

    private String vmrId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vmrName")

    private String vmrName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vmrPkgName")

    private String vmrPkgName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vmrPkgParties")

    private Integer vmrPkgParties;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "member")

    private IdMarkDTO member;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device")

    private IdMarkDTO device;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    public QueryOrgVmrResultDTO withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 唯一标识。 说明：对应会议管理->创建会议接口中的vmrID。 
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public QueryOrgVmrResultDTO withVmrId(String vmrId) {
        this.vmrId = vmrId;
        return this;
    }

    /**
     * 云会议室ID。 说明：对应会议管理->创建会议接口中当vmrIDType等于0（固定ID）时返回数据的conferenceID 。 
     * @return vmrId
     */
    public String getVmrId() {
        return vmrId;
    }

    public void setVmrId(String vmrId) {
        this.vmrId = vmrId;
    }

    public QueryOrgVmrResultDTO withVmrName(String vmrName) {
        this.vmrName = vmrName;
        return this;
    }

    /**
     * 云会议室名称。
     * @return vmrName
     */
    public String getVmrName() {
        return vmrName;
    }

    public void setVmrName(String vmrName) {
        this.vmrName = vmrName;
    }

    public QueryOrgVmrResultDTO withVmrPkgName(String vmrPkgName) {
        this.vmrPkgName = vmrPkgName;
        return this;
    }

    /**
     * 云会议室套餐名称。
     * @return vmrPkgName
     */
    public String getVmrPkgName() {
        return vmrPkgName;
    }

    public void setVmrPkgName(String vmrPkgName) {
        this.vmrPkgName = vmrPkgName;
    }

    public QueryOrgVmrResultDTO withVmrPkgParties(Integer vmrPkgParties) {
        this.vmrPkgParties = vmrPkgParties;
        return this;
    }

    /**
     * 云会议室套餐会议并发方数。
     * @return vmrPkgParties
     */
    public Integer getVmrPkgParties() {
        return vmrPkgParties;
    }

    public void setVmrPkgParties(Integer vmrPkgParties) {
        this.vmrPkgParties = vmrPkgParties;
    }

    public QueryOrgVmrResultDTO withMember(IdMarkDTO member) {
        this.member = member;
        return this;
    }

    public QueryOrgVmrResultDTO withMember(Consumer<IdMarkDTO> memberSetter) {
        if (this.member == null) {
            this.member = new IdMarkDTO();
            memberSetter.accept(this.member);
        }

        return this;
    }

    /**
     * Get member
     * @return member
     */
    public IdMarkDTO getMember() {
        return member;
    }

    public void setMember(IdMarkDTO member) {
        this.member = member;
    }

    public QueryOrgVmrResultDTO withDevice(IdMarkDTO device) {
        this.device = device;
        return this;
    }

    public QueryOrgVmrResultDTO withDevice(Consumer<IdMarkDTO> deviceSetter) {
        if (this.device == null) {
            this.device = new IdMarkDTO();
            deviceSetter.accept(this.device);
        }

        return this;
    }

    /**
     * Get device
     * @return device
     */
    public IdMarkDTO getDevice() {
        return device;
    }

    public void setDevice(IdMarkDTO device) {
        this.device = device;
    }

    public QueryOrgVmrResultDTO withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 云会议室状态。 * 0：正常 * 1：冻结 * 2：未分配 
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
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
        QueryOrgVmrResultDTO queryOrgVmrResultDTO = (QueryOrgVmrResultDTO) o;
        return Objects.equals(this.id, queryOrgVmrResultDTO.id)
            && Objects.equals(this.vmrId, queryOrgVmrResultDTO.vmrId)
            && Objects.equals(this.vmrName, queryOrgVmrResultDTO.vmrName)
            && Objects.equals(this.vmrPkgName, queryOrgVmrResultDTO.vmrPkgName)
            && Objects.equals(this.vmrPkgParties, queryOrgVmrResultDTO.vmrPkgParties)
            && Objects.equals(this.member, queryOrgVmrResultDTO.member)
            && Objects.equals(this.device, queryOrgVmrResultDTO.device)
            && Objects.equals(this.status, queryOrgVmrResultDTO.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, vmrId, vmrName, vmrPkgName, vmrPkgParties, member, device, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryOrgVmrResultDTO {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    vmrId: ").append(toIndentedString(vmrId)).append("\n");
        sb.append("    vmrName: ").append(toIndentedString(vmrName)).append("\n");
        sb.append("    vmrPkgName: ").append(toIndentedString(vmrPkgName)).append("\n");
        sb.append("    vmrPkgParties: ").append(toIndentedString(vmrPkgParties)).append("\n");
        sb.append("    member: ").append(toIndentedString(member)).append("\n");
        sb.append("    device: ").append(toIndentedString(device)).append("\n");
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
