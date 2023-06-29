package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 查询到的云会议室列表。
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
    @JsonProperty(value = "maxAudienceParties")

    private Integer maxAudienceParties;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "member")

    private IdMarkDTO member;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device")

    private IdMarkDTO device;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expireDate")

    private Long expireDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "commercialMaxAudienceParties")

    private Integer commercialMaxAudienceParties;

    public QueryOrgVmrResultDTO withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 云会议室的ID。 > 对应[[创建会议](https://support.huaweicloud.com/api-meeting/meeting_21_0014.html)](tag:hws)[[创建会议](https://support.huaweicloud.com/intl/zh-cn/api-meeting/meeting_21_0014.html)](tag:hk)接口中的vmrID。 
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
     * 云会议室的固定会议ID。 > 对应[[创建会议](https://support.huaweicloud.com/api-meeting/meeting_21_0014.html)](tag:hws)[[创建会议](https://support.huaweicloud.com/intl/zh-cn/api-meeting/meeting_21_0014.html)](tag:hk)接口中的vmrConferenceID。 
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

    public QueryOrgVmrResultDTO withMaxAudienceParties(Integer maxAudienceParties) {
        this.maxAudienceParties = maxAudienceParties;
        return this;
    }

    /**
     * 最大观众与会方数（仅网络研讨会有效）。
     * @return maxAudienceParties
     */
    public Integer getMaxAudienceParties() {
        return maxAudienceParties;
    }

    public void setMaxAudienceParties(Integer maxAudienceParties) {
        this.maxAudienceParties = maxAudienceParties;
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

    public QueryOrgVmrResultDTO withExpireDate(Long expireDate) {
        this.expireDate = expireDate;
        return this;
    }

    /**
     * 到期时间的时间戳，单位毫秒。
     * @return expireDate
     */
    public Long getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Long expireDate) {
        this.expireDate = expireDate;
    }

    public QueryOrgVmrResultDTO withCommercialMaxAudienceParties(Integer commercialMaxAudienceParties) {
        this.commercialMaxAudienceParties = commercialMaxAudienceParties;
        return this;
    }

    /**
     * 按次资源转商后，商用规格最大观众与会方数（仅网络研讨会有效）。
     * @return commercialMaxAudienceParties
     */
    public Integer getCommercialMaxAudienceParties() {
        return commercialMaxAudienceParties;
    }

    public void setCommercialMaxAudienceParties(Integer commercialMaxAudienceParties) {
        this.commercialMaxAudienceParties = commercialMaxAudienceParties;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        QueryOrgVmrResultDTO that = (QueryOrgVmrResultDTO) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.vmrId, that.vmrId)
            && Objects.equals(this.vmrName, that.vmrName) && Objects.equals(this.vmrPkgName, that.vmrPkgName)
            && Objects.equals(this.vmrPkgParties, that.vmrPkgParties)
            && Objects.equals(this.maxAudienceParties, that.maxAudienceParties)
            && Objects.equals(this.member, that.member) && Objects.equals(this.device, that.device)
            && Objects.equals(this.status, that.status) && Objects.equals(this.expireDate, that.expireDate)
            && Objects.equals(this.commercialMaxAudienceParties, that.commercialMaxAudienceParties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            vmrId,
            vmrName,
            vmrPkgName,
            vmrPkgParties,
            maxAudienceParties,
            member,
            device,
            status,
            expireDate,
            commercialMaxAudienceParties);
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
        sb.append("    maxAudienceParties: ").append(toIndentedString(maxAudienceParties)).append("\n");
        sb.append("    member: ").append(toIndentedString(member)).append("\n");
        sb.append("    device: ").append(toIndentedString(device)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    expireDate: ").append(toIndentedString(expireDate)).append("\n");
        sb.append("    commercialMaxAudienceParties: ")
            .append(toIndentedString(commercialMaxAudienceParties))
            .append("\n");
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
