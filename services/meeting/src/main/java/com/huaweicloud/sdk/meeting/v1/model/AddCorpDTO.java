package com.huaweicloud.sdk.meeting.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.meeting.v1.model.AddCorpResDTO;
import com.huaweicloud.sdk.meeting.v1.model.AdminDTO;
import com.huaweicloud.sdk.meeting.v1.model.CorpBasicDTO;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * AddCorpDTO
 */
public class AddCorpDTO  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="basicInfo")
    
    private CorpBasicDTO basicInfo = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="adminInfo")
    
    private AdminDTO adminInfo = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resInfo")
    
    private AddCorpResDTO resInfo = null;

    public AddCorpDTO withBasicInfo(CorpBasicDTO basicInfo) {
        this.basicInfo = basicInfo;
        return this;
    }

    public AddCorpDTO withBasicInfo(Consumer<CorpBasicDTO> basicInfoSetter) {
        if(this.basicInfo == null ){
            this.basicInfo = new CorpBasicDTO();
        }
        basicInfoSetter.accept(this.basicInfo);
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
        if(this.adminInfo == null ){
            this.adminInfo = new AdminDTO();
        }
        adminInfoSetter.accept(this.adminInfo);
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
        if(this.resInfo == null ){
            this.resInfo = new AddCorpResDTO();
        }
        resInfoSetter.accept(this.resInfo);
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
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AddCorpDTO addCorpDTO = (AddCorpDTO) o;
        return Objects.equals(this.basicInfo, addCorpDTO.basicInfo) &&
            Objects.equals(this.adminInfo, addCorpDTO.adminInfo) &&
            Objects.equals(this.resInfo, addCorpDTO.resInfo);
    }
    @Override
    public int hashCode() {
        return Objects.hash(basicInfo, adminInfo, resInfo);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddCorpDTO {\n");
        sb.append("    basicInfo: ").append(toIndentedString(basicInfo)).append("\n");
        sb.append("    adminInfo: ").append(toIndentedString(adminInfo)).append("\n");
        sb.append("    resInfo: ").append(toIndentedString(resInfo)).append("\n");
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

