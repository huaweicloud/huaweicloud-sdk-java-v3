package com.huaweicloud.sdk.kms.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class CreateGrantResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "grant_id")

    @JacksonXmlProperty(localName = "grant_id")

    private String grantId;

    public CreateGrantResponse withGrantId(String grantId) {
        this.grantId = grantId;
        return this;
    }

    /**
     * 授权ID，64字节。
     * @return grantId
     */
    public String getGrantId() {
        return grantId;
    }

    public void setGrantId(String grantId) {
        this.grantId = grantId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateGrantResponse createGrantResponse = (CreateGrantResponse) o;
        return Objects.equals(this.grantId, createGrantResponse.grantId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(grantId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateGrantResponse {\n");
        sb.append("    grantId: ").append(toIndentedString(grantId)).append("\n");
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
