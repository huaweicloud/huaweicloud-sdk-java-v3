package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AddCorpDTO
 */
public class AddCorpDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "basicInfo")

    @JacksonXmlProperty(localName = "basicInfo")

    private CorpBasicDTO basicInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "adminInfo")

    @JacksonXmlProperty(localName = "adminInfo")

    private AdminDTO adminInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resInfo")

    @JacksonXmlProperty(localName = "resInfo")

    private AddCorpResDTO resInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "groupId")

    @JacksonXmlProperty(localName = "groupId")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "propertyInfo")

    @JacksonXmlProperty(localName = "propertyInfo")

    private List<OrgPropertyDTO> propertyInfo = null;

    public AddCorpDTO withBasicInfo(CorpBasicDTO basicInfo) {
        this.basicInfo = basicInfo;
        return this;
    }

    public AddCorpDTO withBasicInfo(Consumer<CorpBasicDTO> basicInfoSetter) {
        if (this.basicInfo == null) {
            this.basicInfo = new CorpBasicDTO();
            basicInfoSetter.accept(this.basicInfo);
        }

        return this;
    }

    /**
     * Get basicInfo
     * @return basicInfo
     */
    public CorpBasicDTO getBasicInfo() {
        return basicInfo;
    }

    public void setBasicInfo(CorpBasicDTO basicInfo) {
        this.basicInfo = basicInfo;
    }

    public AddCorpDTO withAdminInfo(AdminDTO adminInfo) {
        this.adminInfo = adminInfo;
        return this;
    }

    public AddCorpDTO withAdminInfo(Consumer<AdminDTO> adminInfoSetter) {
        if (this.adminInfo == null) {
            this.adminInfo = new AdminDTO();
            adminInfoSetter.accept(this.adminInfo);
        }

        return this;
    }

    /**
     * Get adminInfo
     * @return adminInfo
     */
    public AdminDTO getAdminInfo() {
        return adminInfo;
    }

    public void setAdminInfo(AdminDTO adminInfo) {
        this.adminInfo = adminInfo;
    }

    public AddCorpDTO withResInfo(AddCorpResDTO resInfo) {
        this.resInfo = resInfo;
        return this;
    }

    public AddCorpDTO withResInfo(Consumer<AddCorpResDTO> resInfoSetter) {
        if (this.resInfo == null) {
            this.resInfo = new AddCorpResDTO();
            resInfoSetter.accept(this.resInfo);
        }

        return this;
    }

    /**
     * Get resInfo
     * @return resInfo
     */
    public AddCorpResDTO getResInfo() {
        return resInfo;
    }

    public void setResInfo(AddCorpResDTO resInfo) {
        this.resInfo = resInfo;
    }

    public AddCorpDTO withGroupId(String groupId) {
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

    public AddCorpDTO withPropertyInfo(List<OrgPropertyDTO> propertyInfo) {
        this.propertyInfo = propertyInfo;
        return this;
    }

    public AddCorpDTO addPropertyInfoItem(OrgPropertyDTO propertyInfoItem) {
        if (this.propertyInfo == null) {
            this.propertyInfo = new ArrayList<>();
        }
        this.propertyInfo.add(propertyInfoItem);
        return this;
    }

    public AddCorpDTO withPropertyInfo(Consumer<List<OrgPropertyDTO>> propertyInfoSetter) {
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
        AddCorpDTO addCorpDTO = (AddCorpDTO) o;
        return Objects.equals(this.basicInfo, addCorpDTO.basicInfo)
            && Objects.equals(this.adminInfo, addCorpDTO.adminInfo) && Objects.equals(this.resInfo, addCorpDTO.resInfo)
            && Objects.equals(this.groupId, addCorpDTO.groupId)
            && Objects.equals(this.propertyInfo, addCorpDTO.propertyInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(basicInfo, adminInfo, resInfo, groupId, propertyInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddCorpDTO {\n");
        sb.append("    basicInfo: ").append(toIndentedString(basicInfo)).append("\n");
        sb.append("    adminInfo: ").append(toIndentedString(adminInfo)).append("\n");
        sb.append("    resInfo: ").append(toIndentedString(resInfo)).append("\n");
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
