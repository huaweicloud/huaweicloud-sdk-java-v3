package com.huaweicloud.sdk.hilens.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class UpdateNodeFirmwareResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "firmware_name")

    private String firmwareName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "firmware_id")

    private String firmwareId;

    public UpdateNodeFirmwareResponse withFirmwareName(String firmwareName) {
        this.firmwareName = firmwareName;
        return this;
    }

    /**
     * Get firmwareName
     * @return firmwareName
     */
    public String getFirmwareName() {
        return firmwareName;
    }

    public void setFirmwareName(String firmwareName) {
        this.firmwareName = firmwareName;
    }

    public UpdateNodeFirmwareResponse withFirmwareId(String firmwareId) {
        this.firmwareId = firmwareId;
        return this;
    }

    /**
     * Get firmwareId
     * @return firmwareId
     */
    public String getFirmwareId() {
        return firmwareId;
    }

    public void setFirmwareId(String firmwareId) {
        this.firmwareId = firmwareId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateNodeFirmwareResponse that = (UpdateNodeFirmwareResponse) obj;
        return Objects.equals(this.firmwareName, that.firmwareName) && Objects.equals(this.firmwareId, that.firmwareId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firmwareName, firmwareId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateNodeFirmwareResponse {\n");
        sb.append("    firmwareName: ").append(toIndentedString(firmwareName)).append("\n");
        sb.append("    firmwareId: ").append(toIndentedString(firmwareId)).append("\n");
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
