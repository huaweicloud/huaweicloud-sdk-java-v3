package com.huaweicloud.sdk.iotedge.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * TPM芯片信息
 */
public class TPMInfoDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "manufacture_id")

    private String manufactureId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec_version")

    private String specVersion;

    public TPMInfoDTO withManufactureId(String manufactureId) {
        this.manufactureId = manufactureId;
        return this;
    }

    /**
     * 厂商信息
     * @return manufactureId
     */
    public String getManufactureId() {
        return manufactureId;
    }

    public void setManufactureId(String manufactureId) {
        this.manufactureId = manufactureId;
    }

    public TPMInfoDTO withSpecVersion(String specVersion) {
        this.specVersion = specVersion;
        return this;
    }

    /**
     * 协议版本
     * @return specVersion
     */
    public String getSpecVersion() {
        return specVersion;
    }

    public void setSpecVersion(String specVersion) {
        this.specVersion = specVersion;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TPMInfoDTO that = (TPMInfoDTO) obj;
        return Objects.equals(this.manufactureId, that.manufactureId)
            && Objects.equals(this.specVersion, that.specVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufactureId, specVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TPMInfoDTO {\n");
        sb.append("    manufactureId: ").append(toIndentedString(manufactureId)).append("\n");
        sb.append("    specVersion: ").append(toIndentedString(specVersion)).append("\n");
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
