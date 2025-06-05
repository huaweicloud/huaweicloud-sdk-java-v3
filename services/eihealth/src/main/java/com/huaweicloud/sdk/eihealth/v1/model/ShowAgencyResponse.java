package com.huaweicloud.sdk.eihealth.v1.model;

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
public class ShowAgencyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "existing_agencies")

    private List<AgencyDto> existingAgencies = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "wanted_agencies")

    private List<AgencyDto> wantedAgencies = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "redundant_agencies")

    private List<AgencyDto> redundantAgencies = null;

    public ShowAgencyResponse withExistingAgencies(List<AgencyDto> existingAgencies) {
        this.existingAgencies = existingAgencies;
        return this;
    }

    public ShowAgencyResponse addExistingAgenciesItem(AgencyDto existingAgenciesItem) {
        if (this.existingAgencies == null) {
            this.existingAgencies = new ArrayList<>();
        }
        this.existingAgencies.add(existingAgenciesItem);
        return this;
    }

    public ShowAgencyResponse withExistingAgencies(Consumer<List<AgencyDto>> existingAgenciesSetter) {
        if (this.existingAgencies == null) {
            this.existingAgencies = new ArrayList<>();
        }
        existingAgenciesSetter.accept(this.existingAgencies);
        return this;
    }

    /**
     * 当前存在的委托权限列表。
     * @return existingAgencies
     */
    public List<AgencyDto> getExistingAgencies() {
        return existingAgencies;
    }

    public void setExistingAgencies(List<AgencyDto> existingAgencies) {
        this.existingAgencies = existingAgencies;
    }

    public ShowAgencyResponse withWantedAgencies(List<AgencyDto> wantedAgencies) {
        this.wantedAgencies = wantedAgencies;
        return this;
    }

    public ShowAgencyResponse addWantedAgenciesItem(AgencyDto wantedAgenciesItem) {
        if (this.wantedAgencies == null) {
            this.wantedAgencies = new ArrayList<>();
        }
        this.wantedAgencies.add(wantedAgenciesItem);
        return this;
    }

    public ShowAgencyResponse withWantedAgencies(Consumer<List<AgencyDto>> wantedAgenciesSetter) {
        if (this.wantedAgencies == null) {
            this.wantedAgencies = new ArrayList<>();
        }
        wantedAgenciesSetter.accept(this.wantedAgencies);
        return this;
    }

    /**
     * 仍需要的委托权限列表。
     * @return wantedAgencies
     */
    public List<AgencyDto> getWantedAgencies() {
        return wantedAgencies;
    }

    public void setWantedAgencies(List<AgencyDto> wantedAgencies) {
        this.wantedAgencies = wantedAgencies;
    }

    public ShowAgencyResponse withRedundantAgencies(List<AgencyDto> redundantAgencies) {
        this.redundantAgencies = redundantAgencies;
        return this;
    }

    public ShowAgencyResponse addRedundantAgenciesItem(AgencyDto redundantAgenciesItem) {
        if (this.redundantAgencies == null) {
            this.redundantAgencies = new ArrayList<>();
        }
        this.redundantAgencies.add(redundantAgenciesItem);
        return this;
    }

    public ShowAgencyResponse withRedundantAgencies(Consumer<List<AgencyDto>> redundantAgenciesSetter) {
        if (this.redundantAgencies == null) {
            this.redundantAgencies = new ArrayList<>();
        }
        redundantAgenciesSetter.accept(this.redundantAgencies);
        return this;
    }

    /**
     * 冗余的委托权限列表。
     * @return redundantAgencies
     */
    public List<AgencyDto> getRedundantAgencies() {
        return redundantAgencies;
    }

    public void setRedundantAgencies(List<AgencyDto> redundantAgencies) {
        this.redundantAgencies = redundantAgencies;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowAgencyResponse that = (ShowAgencyResponse) obj;
        return Objects.equals(this.existingAgencies, that.existingAgencies)
            && Objects.equals(this.wantedAgencies, that.wantedAgencies)
            && Objects.equals(this.redundantAgencies, that.redundantAgencies);
    }

    @Override
    public int hashCode() {
        return Objects.hash(existingAgencies, wantedAgencies, redundantAgencies);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAgencyResponse {\n");
        sb.append("    existingAgencies: ").append(toIndentedString(existingAgencies)).append("\n");
        sb.append("    wantedAgencies: ").append(toIndentedString(wantedAgencies)).append("\n");
        sb.append("    redundantAgencies: ").append(toIndentedString(redundantAgencies)).append("\n");
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
