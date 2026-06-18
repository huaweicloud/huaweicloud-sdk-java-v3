package com.huaweicloud.sdk.iam.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowSAMLProviderV5Response extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "saml_provider")

    private InlineResponse2001SamlProvider samlProvider;

    public ShowSAMLProviderV5Response withSamlProvider(InlineResponse2001SamlProvider samlProvider) {
        this.samlProvider = samlProvider;
        return this;
    }

    public ShowSAMLProviderV5Response withSamlProvider(Consumer<InlineResponse2001SamlProvider> samlProviderSetter) {
        if (this.samlProvider == null) {
            this.samlProvider = new InlineResponse2001SamlProvider();
            samlProviderSetter.accept(this.samlProvider);
        }

        return this;
    }

    /**
     * Get samlProvider
     * @return samlProvider
     */
    public InlineResponse2001SamlProvider getSamlProvider() {
        return samlProvider;
    }

    public void setSamlProvider(InlineResponse2001SamlProvider samlProvider) {
        this.samlProvider = samlProvider;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowSAMLProviderV5Response that = (ShowSAMLProviderV5Response) obj;
        return Objects.equals(this.samlProvider, that.samlProvider);
    }

    @Override
    public int hashCode() {
        return Objects.hash(samlProvider);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSAMLProviderV5Response {\n");
        sb.append("    samlProvider: ").append(toIndentedString(samlProvider)).append("\n");
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
