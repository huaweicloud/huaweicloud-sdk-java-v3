package com.huaweicloud.sdk.meeting.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 企业注册信息
 */
public class ModCorpBasicInfoDTO  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="address")
    
    private String address;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="autoUserCreate")
    
    private Boolean autoUserCreate;

    public ModCorpBasicInfoDTO withAddress(String address) {
        this.address = address;
        return this;
    }

    


    /**
     * 企业所在地,最大长度为255个字符。 maxLength：255。 
     * @return address
     */
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ModCorpBasicInfoDTO withAutoUserCreate(Boolean autoUserCreate) {
        this.autoUserCreate = autoUserCreate;
        return this;
    }

    


    /**
     * 企业自动开户开关
     * @return autoUserCreate
     */
    public Boolean getAutoUserCreate() {
        return autoUserCreate;
    }

    public void setAutoUserCreate(Boolean autoUserCreate) {
        this.autoUserCreate = autoUserCreate;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ModCorpBasicInfoDTO modCorpBasicInfoDTO = (ModCorpBasicInfoDTO) o;
        return Objects.equals(this.address, modCorpBasicInfoDTO.address) &&
            Objects.equals(this.autoUserCreate, modCorpBasicInfoDTO.autoUserCreate);
    }
    @Override
    public int hashCode() {
        return Objects.hash(address, autoUserCreate);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModCorpBasicInfoDTO {\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    autoUserCreate: ").append(toIndentedString(autoUserCreate)).append("\n");
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

