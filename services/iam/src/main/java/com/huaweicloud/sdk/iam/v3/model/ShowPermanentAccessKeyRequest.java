package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowPermanentAccessKeyRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_key")

    @JacksonXmlProperty(localName = "access_key")

    private String accessKey;

    public ShowPermanentAccessKeyRequest withAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }

    /**
     * 待查询的指定AK。
     * @return accessKey
     */
    public String getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowPermanentAccessKeyRequest showPermanentAccessKeyRequest = (ShowPermanentAccessKeyRequest) o;
        return Objects.equals(this.accessKey, showPermanentAccessKeyRequest.accessKey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessKey);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowPermanentAccessKeyRequest {\n");
        sb.append("    accessKey: ").append(toIndentedString(accessKey)).append("\n");
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
