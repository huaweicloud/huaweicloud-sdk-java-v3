package com.huaweicloud.sdk.meeting.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.meeting.v1.model.ModAdminDTO;
import com.huaweicloud.sdk.meeting.v1.model.ModCorpBasicDTO;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ModCorpDTO
 */
public class ModCorpDTO  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="basicInfo")
    
    private ModCorpBasicDTO basicInfo;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="adminInfo")
    
    private ModAdminDTO adminInfo;

    public ModCorpDTO withBasicInfo(ModCorpBasicDTO basicInfo) {
        this.basicInfo = basicInfo;
        return this;
    }

    public ModCorpDTO withBasicInfo(Consumer<ModCorpBasicDTO> basicInfoSetter) {
        if(this.basicInfo == null ){
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
        if(this.adminInfo == null ){
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

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ModCorpDTO modCorpDTO = (ModCorpDTO) o;
        return Objects.equals(this.basicInfo, modCorpDTO.basicInfo) &&
            Objects.equals(this.adminInfo, modCorpDTO.adminInfo);
    }
    @Override
    public int hashCode() {
        return Objects.hash(basicInfo, adminInfo);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModCorpDTO {\n");
        sb.append("    basicInfo: ").append(toIndentedString(basicInfo)).append("\n");
        sb.append("    adminInfo: ").append(toIndentedString(adminInfo)).append("\n");
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

