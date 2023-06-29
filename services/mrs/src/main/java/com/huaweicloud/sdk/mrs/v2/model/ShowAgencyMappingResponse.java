package com.huaweicloud.sdk.mrs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowAgencyMappingResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agency_mappings")

    private List<AgencyMapping> agencyMappings = null;

    public ShowAgencyMappingResponse withAgencyMappings(List<AgencyMapping> agencyMappings) {
        this.agencyMappings = agencyMappings;
        return this;
    }

    public ShowAgencyMappingResponse addAgencyMappingsItem(AgencyMapping agencyMappingsItem) {
        if (this.agencyMappings == null) {
            this.agencyMappings = new ArrayList<>();
        }
        this.agencyMappings.add(agencyMappingsItem);
        return this;
    }

    public ShowAgencyMappingResponse withAgencyMappings(Consumer<List<AgencyMapping>> agencyMappingsSetter) {
        if (this.agencyMappings == null) {
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
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowAgencyMappingResponse that = (ShowAgencyMappingResponse) obj;
        return Objects.equals(this.agencyMappings, that.agencyMappings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agencyMappings);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAgencyMappingResponse {\n");
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
