package com.huaweicloud.sdk.ucs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListServerConfigsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "onpremises")

    private OnPremisesConfig onpremises;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "federations")

    private FederationConfig federations;

    public ListServerConfigsResponse withOnpremises(OnPremisesConfig onpremises) {
        this.onpremises = onpremises;
        return this;
    }

    public ListServerConfigsResponse withOnpremises(Consumer<OnPremisesConfig> onpremisesSetter) {
        if (this.onpremises == null) {
            this.onpremises = new OnPremisesConfig();
            onpremisesSetter.accept(this.onpremises);
        }

        return this;
    }

    /**
     * Get onpremises
     * @return onpremises
     */
    public OnPremisesConfig getOnpremises() {
        return onpremises;
    }

    public void setOnpremises(OnPremisesConfig onpremises) {
        this.onpremises = onpremises;
    }

    public ListServerConfigsResponse withFederations(FederationConfig federations) {
        this.federations = federations;
        return this;
    }

    public ListServerConfigsResponse withFederations(Consumer<FederationConfig> federationsSetter) {
        if (this.federations == null) {
            this.federations = new FederationConfig();
            federationsSetter.accept(this.federations);
        }

        return this;
    }

    /**
     * Get federations
     * @return federations
     */
    public FederationConfig getFederations() {
        return federations;
    }

    public void setFederations(FederationConfig federations) {
        this.federations = federations;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListServerConfigsResponse that = (ListServerConfigsResponse) obj;
        return Objects.equals(this.onpremises, that.onpremises) && Objects.equals(this.federations, that.federations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(onpremises, federations);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListServerConfigsResponse {\n");
        sb.append("    onpremises: ").append(toIndentedString(onpremises)).append("\n");
        sb.append("    federations: ").append(toIndentedString(federations)).append("\n");
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
