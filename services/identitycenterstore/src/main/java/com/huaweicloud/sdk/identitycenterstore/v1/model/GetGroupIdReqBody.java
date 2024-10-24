package com.huaweicloud.sdk.identitycenterstore.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 获取用户组id请求体
 */
public class GetGroupIdReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alternate_identifier")

    private AlternateIdentifierDto alternateIdentifier;

    public GetGroupIdReqBody withAlternateIdentifier(AlternateIdentifierDto alternateIdentifier) {
        this.alternateIdentifier = alternateIdentifier;
        return this;
    }

    public GetGroupIdReqBody withAlternateIdentifier(Consumer<AlternateIdentifierDto> alternateIdentifierSetter) {
        if (this.alternateIdentifier == null) {
            this.alternateIdentifier = new AlternateIdentifierDto();
            alternateIdentifierSetter.accept(this.alternateIdentifier);
        }

        return this;
    }

    /**
     * Get alternateIdentifier
     * @return alternateIdentifier
     */
    public AlternateIdentifierDto getAlternateIdentifier() {
        return alternateIdentifier;
    }

    public void setAlternateIdentifier(AlternateIdentifierDto alternateIdentifier) {
        this.alternateIdentifier = alternateIdentifier;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GetGroupIdReqBody that = (GetGroupIdReqBody) obj;
        return Objects.equals(this.alternateIdentifier, that.alternateIdentifier);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alternateIdentifier);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetGroupIdReqBody {\n");
        sb.append("    alternateIdentifier: ").append(toIndentedString(alternateIdentifier)).append("\n");
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
