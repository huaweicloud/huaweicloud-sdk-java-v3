package com.huaweicloud.sdk.mrs.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.mrs.v2.model.AgencyMapping;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 用户（组）与IAM委托的映射关系数组结构体
 */
public class AgencyMappingArray  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="agency_mappings")
    
    @JacksonXmlProperty(localName = "agency_mappings")
    
    private List<AgencyMapping> agencyMappings = null;
    
    public AgencyMappingArray withAgencyMappings(List<AgencyMapping> agencyMappings) {
        this.agencyMappings = agencyMappings;
        return this;
    }

    
    public AgencyMappingArray addAgencyMappingsItem(AgencyMapping agencyMappingsItem) {
        if(this.agencyMappings == null) {
            this.agencyMappings = new ArrayList<>();
        }
        this.agencyMappings.add(agencyMappingsItem);
        return this;
    }

    public AgencyMappingArray withAgencyMappings(Consumer<List<AgencyMapping>> agencyMappingsSetter) {
        if(this.agencyMappings == null) {
            this.agencyMappings = new ArrayList<>();
        }
        agencyMappingsSetter.accept(this.agencyMappings);
        return this;
    }

    /**
     * 用户（组）与委托之间的映射关系详细信息。
     * @return agencyMappings
     */
    public List<AgencyMapping> getAgencyMappings() {
        return agencyMappings;
    }

    public void setAgencyMappings(List<AgencyMapping> agencyMappings) {
        this.agencyMappings = agencyMappings;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AgencyMappingArray agencyMappingArray = (AgencyMappingArray) o;
        return Objects.equals(this.agencyMappings, agencyMappingArray.agencyMappings);
    }
    @Override
    public int hashCode() {
        return Objects.hash(agencyMappings);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AgencyMappingArray {\n");
        sb.append("    agencyMappings: ").append(toIndentedString(agencyMappings)).append("\n");
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

