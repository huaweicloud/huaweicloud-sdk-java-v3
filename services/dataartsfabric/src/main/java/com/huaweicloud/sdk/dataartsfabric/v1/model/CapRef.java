package com.huaweicloud.sdk.dataartsfabric.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CAP信息
 */
public class CapRef {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cap_id")

    private String capId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_id")

    private String versionId;

    public CapRef withCapId(String capId) {
        this.capId = capId;
        return this;
    }

    /**
     * CapId，32~36位的英文、数字、短横组合
     * @return capId
     */
    public String getCapId() {
        return capId;
    }

    public void setCapId(String capId) {
        this.capId = capId;
    }

    public CapRef withVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }

    /**
     * CapVersionId，32~36位的英文、数字、短横组合
     * @return versionId
     */
    public String getVersionId() {
        return versionId;
    }

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CapRef that = (CapRef) obj;
        return Objects.equals(this.capId, that.capId) && Objects.equals(this.versionId, that.versionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(capId, versionId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CapRef {\n");
        sb.append("    capId: ").append(toIndentedString(capId)).append("\n");
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
