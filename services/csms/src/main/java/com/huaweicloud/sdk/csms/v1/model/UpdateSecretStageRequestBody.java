package com.huaweicloud.sdk.csms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * UpdateSecretStageRequestBody
 */
public class UpdateSecretStageRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_id")

    @JacksonXmlProperty(localName = "version_id")

    private String versionId;

    public UpdateSecretStageRequestBody withVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }

    /**
     * 凭据的版本号标识符。 
     * @return versionId
     */
    public String getVersionId() {
        return versionId;
    }

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateSecretStageRequestBody updateSecretStageRequestBody = (UpdateSecretStageRequestBody) o;
        return Objects.equals(this.versionId, updateSecretStageRequestBody.versionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(versionId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateSecretStageRequestBody {\n");
        sb.append("    versionId: ").append(toIndentedString(versionId)).append("\n");
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
