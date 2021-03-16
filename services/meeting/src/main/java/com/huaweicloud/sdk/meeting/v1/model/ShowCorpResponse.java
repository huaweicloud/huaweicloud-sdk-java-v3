package com.huaweicloud.sdk.meeting.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.meeting.v1.model.QueryAdminResultDTO;
import com.huaweicloud.sdk.meeting.v1.model.QueryCorpBasicResultDTO;
import com.huaweicloud.sdk.meeting.v1.model.QueryCorpResResultDTO;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowCorpResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="basicInfo")
    
    private QueryCorpBasicResultDTO basicInfo;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="adminInfo")
    
    private QueryAdminResultDTO adminInfo;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resInfo")
    
    private QueryCorpResResultDTO resInfo;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;

    public ShowCorpResponse withBasicInfo(QueryCorpBasicResultDTO basicInfo) {
        this.basicInfo = basicInfo;
        return this;
    }

    public ShowCorpResponse withBasicInfo(Consumer<QueryCorpBasicResultDTO> basicInfoSetter) {
        if(this.basicInfo == null ){
            this.basicInfo = new QueryCorpBasicResultDTO();
            basicInfoSetter.accept(this.basicInfo);
        }
        
        return this;
    }


    /**
     * Get basicInfo
     * @return basicInfo
     */
    public QueryCorpBasicResultDTO getBasicInfo() {
        return basicInfo;
    }

    public void setBasicInfo(QueryCorpBasicResultDTO basicInfo) {
        this.basicInfo = basicInfo;
    }

    

    public ShowCorpResponse withAdminInfo(QueryAdminResultDTO adminInfo) {
        this.adminInfo = adminInfo;
        return this;
    }

    public ShowCorpResponse withAdminInfo(Consumer<QueryAdminResultDTO> adminInfoSetter) {
        if(this.adminInfo == null ){
            this.adminInfo = new QueryAdminResultDTO();
            adminInfoSetter.accept(this.adminInfo);
        }
        
        return this;
    }


    /**
     * Get adminInfo
     * @return adminInfo
     */
    public QueryAdminResultDTO getAdminInfo() {
        return adminInfo;
    }

    public void setAdminInfo(QueryAdminResultDTO adminInfo) {
        this.adminInfo = adminInfo;
    }

    

    public ShowCorpResponse withResInfo(QueryCorpResResultDTO resInfo) {
        this.resInfo = resInfo;
        return this;
    }

    public ShowCorpResponse withResInfo(Consumer<QueryCorpResResultDTO> resInfoSetter) {
        if(this.resInfo == null ){
            this.resInfo = new QueryCorpResResultDTO();
            resInfoSetter.accept(this.resInfo);
        }
        
        return this;
    }


    /**
     * Get resInfo
     * @return resInfo
     */
    public QueryCorpResResultDTO getResInfo() {
        return resInfo;
    }

    public void setResInfo(QueryCorpResResultDTO resInfo) {
        this.resInfo = resInfo;
    }

    

    public ShowCorpResponse withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 企业id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowCorpResponse showCorpResponse = (ShowCorpResponse) o;
        return Objects.equals(this.basicInfo, showCorpResponse.basicInfo) &&
            Objects.equals(this.adminInfo, showCorpResponse.adminInfo) &&
            Objects.equals(this.resInfo, showCorpResponse.resInfo) &&
            Objects.equals(this.id, showCorpResponse.id);
    }
    @Override
    public int hashCode() {
        return Objects.hash(basicInfo, adminInfo, resInfo, id);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowCorpResponse {\n");
        sb.append("    basicInfo: ").append(toIndentedString(basicInfo)).append("\n");
        sb.append("    adminInfo: ").append(toIndentedString(adminInfo)).append("\n");
        sb.append("    resInfo: ").append(toIndentedString(resInfo)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

