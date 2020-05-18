package com.huaweicloud.sdk.iam.v3.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iam.v3.model.AgencyAuthIdentity;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 
 */
public class AgencyAuth  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="identity")
    
    private AgencyAuthIdentity identity = null;

    public AgencyAuth withIdentity(AgencyAuthIdentity identity) {
        this.identity = identity;
        return this;
    }

    public AgencyAuth withIdentity(Consumer<AgencyAuthIdentity> identitySetter) {
        if(this.identity == null ){
            this.identity = new AgencyAuthIdentity();
        }
        identitySetter.accept(this.identity);
        return this;
    }


    /**
     * Get identity
     * @return identity
     */
    public AgencyAuthIdentity getIdentity() {
        return identity;
    }

    public void setIdentity(AgencyAuthIdentity identity) {
        this.identity = identity;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AgencyAuth agencyAuth = (AgencyAuth) o;
        return Objects.equals(this.identity, agencyAuth.identity);
    }
    @Override
    public int hashCode() {
        return Objects.hash(identity);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AgencyAuth {\n");
            sb.append("    identity: ").append(toIndentedString(identity)).append("\n");
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

