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
     * ips开关id，此处为互联网边界防护对象id，可通过调用[查询防火墙实例接口](ListFirewallDetail.xml)获得，通过返回值中的data.records.protect_objects.object_id（.表示各对象之间层级的区分）获得
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
     * 基础防御状态，0表示关闭，1表示开启
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
     * 虚拟补丁状态，0表示关闭，1表示开启
     * @return virtualPatchesStatus
     */
    public Integer getVirtualPatchesStatus() {
        return virtualPatchesStatus;
    }

    public void setVirtualPatchesStatus(Integer virtualPatchesStatus) {
        this.virtualPatchesStatus = virtualPatchesStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IpsSwitchResponseDTO that = (IpsSwitchResponseDTO) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.basicDefenseStatus, that.basicDefenseStatus)
            && Objects.equals(this.virtualPatchesStatus, that.virtualPatchesStatus);
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
