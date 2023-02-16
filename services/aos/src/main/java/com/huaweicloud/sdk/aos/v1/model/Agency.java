package com.huaweicloud.sdk.aos.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 委托授权的信息
 */
public class Agency  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="provider_name")
    
    
    private String providerName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="agency_name")
    
    
    private String agencyName;

    public Agency withProviderName(String providerName) {
        this.providerName = providerName;
        return this;
    }

    


    /**
     * 用户使用的provider的名字。如果用户给与的provider_name含有重复的值，则返回400
     * @return providerName
     */
    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    

    public Agency withAgencyName(String agencyName) {
        this.agencyName = agencyName;
        return this;
    }

    


    /**
     * 对应provider所使用的IAM委托名称，资源编排服务会使用此委托的权限去访问、创建对应provider的资源
     * @return agencyName
     */
    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Agency agency = (Agency) o;
        return Objects.equals(this.providerName, agency.providerName) &&
            Objects.equals(this.agencyName, agency.agencyName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(providerName, agencyName);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Agency {\n");
        sb.append("    providerName: ").append(toIndentedString(providerName)).append("\n");
        sb.append("    agencyName: ").append(toIndentedString(agencyName)).append("\n");
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

