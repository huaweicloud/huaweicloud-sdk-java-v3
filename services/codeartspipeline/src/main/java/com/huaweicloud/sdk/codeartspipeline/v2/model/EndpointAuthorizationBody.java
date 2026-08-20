package com.huaweicloud.sdk.codeartspipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 鉴权信息。 **取值范围**： 不涉及。 
 */
public class EndpointAuthorizationBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parameters")

    private Object parameters;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scheme")

    private String scheme;

    public EndpointAuthorizationBody withParameters(Object parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * **参数解释**： 鉴权参数。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return parameters
     */
    public Object getParameters() {
        return parameters;
    }

    public void setParameters(Object parameters) {
        this.parameters = parameters;
    }

    public EndpointAuthorizationBody withScheme(String scheme) {
        this.scheme = scheme;
        return this;
    }

    /**
     * **参数解释**： 鉴权模式。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return scheme
     */
    public String getScheme() {
        return scheme;
    }

    public void setScheme(String scheme) {
        this.scheme = scheme;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EndpointAuthorizationBody that = (EndpointAuthorizationBody) obj;
        return Objects.equals(this.parameters, that.parameters) && Objects.equals(this.scheme, that.scheme);
    }

    @Override
    public int hashCode() {
        return Objects.hash(parameters, scheme);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EndpointAuthorizationBody {\n");
        sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
        sb.append("    scheme: ").append(toIndentedString(scheme)).append("\n");
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
