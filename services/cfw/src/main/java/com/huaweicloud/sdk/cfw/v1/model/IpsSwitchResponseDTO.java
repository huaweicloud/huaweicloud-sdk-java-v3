package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ips特性状态返回查询
 */
public class IpsSwitchResponseDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_id")

    private String objectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "basic_defense_status")

    private Integer basicDefenseStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "virtual_patches_stauts")

    private Integer virtualPatchesStauts;

    public IpsSwitchResponseDTO withObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }

    /**
     * object_id
     * @return objectId
     */
    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public IpsSwitchResponseDTO withBasicDefenseStatus(Integer basicDefenseStatus) {
        this.basicDefenseStatus = basicDefenseStatus;
        return this;
    }

    /**
     * 基础防御状态
     * @return basicDefenseStatus
     */
    public Integer getBasicDefenseStatus() {
        return basicDefenseStatus;
    }

    public void setBasicDefenseStatus(Integer basicDefenseStatus) {
        this.basicDefenseStatus = basicDefenseStatus;
    }

    public IpsSwitchResponseDTO withVirtualPatchesStauts(Integer virtualPatchesStauts) {
        this.virtualPatchesStauts = virtualPatchesStauts;
        return this;
    }

    /**
     * 虚拟补丁状态
     * @return virtualPatchesStauts
     */
    public Integer getVirtualPatchesStauts() {
        return virtualPatchesStauts;
    }

    public void setVirtualPatchesStauts(Integer virtualPatchesStauts) {
        this.virtualPatchesStauts = virtualPatchesStauts;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IpsSwitchResponseDTO ipsSwitchResponseDTO = (IpsSwitchResponseDTO) o;
        return Objects.equals(this.objectId, ipsSwitchResponseDTO.objectId)
            && Objects.equals(this.basicDefenseStatus, ipsSwitchResponseDTO.basicDefenseStatus)
            && Objects.equals(this.virtualPatchesStauts, ipsSwitchResponseDTO.virtualPatchesStauts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(objectId, basicDefenseStatus, virtualPatchesStauts);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IpsSwitchResponseDTO {\n");
        sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
        sb.append("    basicDefenseStatus: ").append(toIndentedString(basicDefenseStatus)).append("\n");
        sb.append("    virtualPatchesStauts: ").append(toIndentedString(virtualPatchesStauts)).append("\n");
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
