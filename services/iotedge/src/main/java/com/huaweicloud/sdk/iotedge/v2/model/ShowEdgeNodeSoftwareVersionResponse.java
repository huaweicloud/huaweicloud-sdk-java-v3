package com.huaweicloud.sdk.iotedge.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowEdgeNodeSoftwareVersionResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "software_version")

    private String softwareVersion;

    public ShowEdgeNodeSoftwareVersionResponse withSoftwareVersion(String softwareVersion) {
        this.softwareVersion = softwareVersion;
        return this;
    }

    /**
     * 边缘应用id，只允许数字、英文小写、中划线，切必须以字母或数字结尾
     * @return softwareVersion
     */
    public String getSoftwareVersion() {
        return softwareVersion;
    }

    public void setSoftwareVersion(String softwareVersion) {
        this.softwareVersion = softwareVersion;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowEdgeNodeSoftwareVersionResponse that = (ShowEdgeNodeSoftwareVersionResponse) obj;
        return Objects.equals(this.softwareVersion, that.softwareVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(softwareVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowEdgeNodeSoftwareVersionResponse {\n");
        sb.append("    softwareVersion: ").append(toIndentedString(softwareVersion)).append("\n");
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
