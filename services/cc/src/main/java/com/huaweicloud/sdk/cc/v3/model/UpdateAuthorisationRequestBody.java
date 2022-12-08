package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新授权的详细信息。
 */
public class UpdateAuthorisationRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authorisation")

    private UpdateAuthorisation authorisation;

    public UpdateAuthorisationRequestBody withAuthorisation(UpdateAuthorisation authorisation) {
        this.authorisation = authorisation;
        return this;
    }

    public UpdateAuthorisationRequestBody withAuthorisation(Consumer<UpdateAuthorisation> authorisationSetter) {
        if (this.authorisation == null) {
            this.authorisation = new UpdateAuthorisation();
            authorisationSetter.accept(this.authorisation);
        }

        return this;
    }

    /**
     * Get authorisation
     * @return authorisation
     */
    public UpdateAuthorisation getAuthorisation() {
        return authorisation;
    }

    public void setAuthorisation(UpdateAuthorisation authorisation) {
        this.authorisation = authorisation;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateAuthorisationRequestBody updateAuthorisationRequestBody = (UpdateAuthorisationRequestBody) o;
        return Objects.equals(this.authorisation, updateAuthorisationRequestBody.authorisation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorisation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateAuthorisationRequestBody {\n");
        sb.append("    authorisation: ").append(toIndentedString(authorisation)).append("\n");
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
