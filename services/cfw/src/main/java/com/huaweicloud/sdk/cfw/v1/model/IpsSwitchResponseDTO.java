package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ips特性状态返回查询
 */
public class IpsSwitchResponseDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "basic_defense_status")

    private Integer basicDefenseStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "virtual_patches_status")

    private Integer virtualPatchesStatus;

    public IpsSwitchResponseDTO withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * ips开关id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public IpsSwitchResponseDTO withVirtualPatchesStatus(Integer virtualPatchesStatus) {
        this.virtualPatchesStatus = virtualPatchesStatus;
        return this;
    }

    /**
     * 虚拟补丁状态
     * @return virtualPatchesStatus
     */
    public Integer getVirtualPatchesStatus() {
        return virtualPatchesStatus;
    }

    public void setVirtualPatchesStatus(Integer virtualPatchesStatus) {
        this.virtualPatchesStatus = virtualPatchesStatus;
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
        return Objects.equals(this.id, ipsSwitchResponseDTO.id)
            && Objects.equals(this.basicDefenseStatus, ipsSwitchResponseDTO.basicDefenseStatus)
            && Objects.equals(this.virtualPatchesStatus, ipsSwitchResponseDTO.virtualPatchesStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, basicDefenseStatus, virtualPatchesStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IpsSwitchResponseDTO {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    basicDefenseStatus: ").append(toIndentedString(basicDefenseStatus)).append("\n");
        sb.append("    virtualPatchesStatus: ").append(toIndentedString(virtualPatchesStatus)).append("\n");
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
