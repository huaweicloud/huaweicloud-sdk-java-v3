package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ModCorpDTO
 */
public class ModCorpDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "basicInfo")

    private ModCorpBasicDTO basicInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "adminInfo")

    private ModAdminDTO adminInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "groupId")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "propertyInfo")

    private List<OrgPropertyDTO> propertyInfo = null;

    public ModCorpDTO withBasicInfo(ModCorpBasicDTO basicInfo) {
        this.basicInfo = basicInfo;
        return this;
    }

    public ModCorpDTO withBasicInfo(Consumer<ModCorpBasicDTO> basicInfoSetter) {
        if (this.basicInfo == null) {
            this.basicInfo = new ModCorpBasicDTO();
            basicInfoSetter.accept(this.basicInfo);
        }

        return this;
    }

    /**
     * Get basicInfo
     * @return basicInfo
     */
    public ModCorpBasicDTO getBasicInfo() {
        return basicInfo;
    }

    public void setBasicInfo(ModCorpBasicDTO basicInfo) {
        this.basicInfo = basicInfo;
    }

    public ModCorpDTO withAdminInfo(ModAdminDTO adminInfo) {
        this.adminInfo = adminInfo;
        return this;
    }

    public ModCorpDTO withAdminInfo(Consumer<ModAdminDTO> adminInfoSetter) {
        if (this.adminInfo == null) {
            this.adminInfo = new ModAdminDTO();
            adminInfoSetter.accept(this.adminInfo);
        }

        return this;
    }

    /**
     * Get adminInfo
     * @return adminInfo
     */
    public ModAdminDTO getAdminInfo() {
        return adminInfo;
    }

    public void setAdminInfo(ModAdminDTO adminInfo) {
        this.adminInfo = adminInfo;
    }

    public ModCorpDTO withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * 媒体接入（包括SBC和MCU）分组id, 可通过企业资源管理下的SP管理员查询资源信息接口获取。
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public ModCorpDTO withPropertyInfo(List<OrgPropertyDTO> propertyInfo) {
        this.propertyInfo = propertyInfo;
        return this;
    }

    public ModCorpDTO addPropertyInfoItem(OrgPropertyDTO propertyInfoItem) {
        if (this.propertyInfo == null) {
            this.propertyInfo = new ArrayList<>();
        }
        this.propertyInfo.add(propertyInfoItem);
        return this;
    }

    public ModCorpDTO withPropertyInfo(Consumer<List<OrgPropertyDTO>> propertyInfoSetter) {
        if (this.propertyInfo == null) {
            this.propertyInfo = new ArrayList<>();
        }
        propertyInfoSetter.accept(this.propertyInfo);
        return this;
    }

    /**
     * 可配置项信息。
     * @return propertyInfo
     */
    public List<OrgPropertyDTO> getPropertyInfo() {
        return propertyInfo;
    }

    public void setPropertyInfo(List<OrgPropertyDTO> propertyInfo) {
        this.propertyInfo = propertyInfo;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ModCorpDTO modCorpDTO = (ModCorpDTO) o;
        return Objects.equals(this.basicInfo, modCorpDTO.basicInfo)
            && Objects.equals(this.adminInfo, modCorpDTO.adminInfo) && Objects.equals(this.groupId, modCorpDTO.groupId)
            && Objects.equals(this.propertyInfo, modCorpDTO.propertyInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(basicInfo, adminInfo, groupId, propertyInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModCorpDTO {\n");
        sb.append("    basicInfo: ").append(toIndentedString(basicInfo)).append("\n");
        sb.append("    adminInfo: ").append(toIndentedString(adminInfo)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    propertyInfo: ").append(toIndentedString(propertyInfo)).append("\n");
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
