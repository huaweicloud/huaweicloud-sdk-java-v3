package com.huaweicloud.sdk.iam.v3.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iam.v3.model.CreateAgencyOption;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 
 */
public class CreateAgencyRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="agency")
    
    private CreateAgencyOption agency = null;

    public CreateAgencyRequestBody withAgency(CreateAgencyOption agency) {
        this.agency = agency;
        return this;
    }

    public CreateAgencyRequestBody withAgency(Consumer<CreateAgencyOption> agencySetter) {
        if(this.agency == null ){
            this.agency = new CreateAgencyOption();
        }
        agencySetter.accept(this.agency);
        return this;
    }


    /**
     * Get agency
     * @return agency
     */
    public CreateAgencyOption getAgency() {
        return agency;
    }

    public void setAgency(CreateAgencyOption agency) {
        this.agency = agency;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateAgencyRequestBody createAgencyRequestBody = (CreateAgencyRequestBody) o;
        return Objects.equals(this.agency, createAgencyRequestBody.agency);
    }
    @Override
    public int hashCode() {
        return Objects.hash(agency);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAgencyRequestBody {\n");
            sb.append("    agency: ").append(toIndentedString(agency)).append("\n");
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

