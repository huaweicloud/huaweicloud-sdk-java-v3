package com.huaweicloud.sdk.rgc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 蓝图。
 */
public class Blueprint {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "blueprint_product_id")

    private String blueprintProductId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "blueprint_product_version")

    private String blueprintProductVersion;

    public Blueprint withBlueprintProductId(String blueprintProductId) {
        this.blueprintProductId = blueprintProductId;
        return this;
    }

    /**
     * 蓝图ID。
     * @return blueprintProductId
     */
    public String getBlueprintProductId() {
        return blueprintProductId;
    }

    public void setBlueprintProductId(String blueprintProductId) {
        this.blueprintProductId = blueprintProductId;
    }

    public Blueprint withBlueprintProductVersion(String blueprintProductVersion) {
        this.blueprintProductVersion = blueprintProductVersion;
        return this;
    }

    /**
     * 蓝图版本。
     * @return blueprintProductVersion
     */
    public String getBlueprintProductVersion() {
        return blueprintProductVersion;
    }

    public void setBlueprintProductVersion(String blueprintProductVersion) {
        this.blueprintProductVersion = blueprintProductVersion;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Blueprint that = (Blueprint) obj;
        return Objects.equals(this.blueprintProductId, that.blueprintProductId)
            && Objects.equals(this.blueprintProductVersion, that.blueprintProductVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(blueprintProductId, blueprintProductVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Blueprint {\n");
        sb.append("    blueprintProductId: ").append(toIndentedString(blueprintProductId)).append("\n");
        sb.append("    blueprintProductVersion: ").append(toIndentedString(blueprintProductVersion)).append("\n");
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
