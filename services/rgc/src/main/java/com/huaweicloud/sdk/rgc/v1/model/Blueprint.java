package com.huaweicloud.sdk.rgc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 模板。
 */
public class Blueprint {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "blueprint_product_id")

    private String blueprintProductId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "blueprint_product_version")

    private String blueprintProductVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "variables")

    private String variables;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_blueprint_has_multi_account_resource")

    private Boolean isBlueprintHasMultiAccountResource;

    public Blueprint withBlueprintProductId(String blueprintProductId) {
        this.blueprintProductId = blueprintProductId;
        return this;
    }

    /**
     * 模板ID。
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
     * 模板版本。
     * @return blueprintProductVersion
     */
    public String getBlueprintProductVersion() {
        return blueprintProductVersion;
    }

    public void setBlueprintProductVersion(String blueprintProductVersion) {
        this.blueprintProductVersion = blueprintProductVersion;
    }

    public Blueprint withVariables(String variables) {
        this.variables = variables;
        return this;
    }

    /**
     * 模板部署参数。
     * @return variables
     */
    public String getVariables() {
        return variables;
    }

    public void setVariables(String variables) {
        this.variables = variables;
    }

    public Blueprint withIsBlueprintHasMultiAccountResource(Boolean isBlueprintHasMultiAccountResource) {
        this.isBlueprintHasMultiAccountResource = isBlueprintHasMultiAccountResource;
        return this;
    }

    /**
     * 模板是否包含多账号资源。
     * @return isBlueprintHasMultiAccountResource
     */
    public Boolean getIsBlueprintHasMultiAccountResource() {
        return isBlueprintHasMultiAccountResource;
    }

    public void setIsBlueprintHasMultiAccountResource(Boolean isBlueprintHasMultiAccountResource) {
        this.isBlueprintHasMultiAccountResource = isBlueprintHasMultiAccountResource;
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
            && Objects.equals(this.blueprintProductVersion, that.blueprintProductVersion)
            && Objects.equals(this.variables, that.variables)
            && Objects.equals(this.isBlueprintHasMultiAccountResource, that.isBlueprintHasMultiAccountResource);
    }

    @Override
    public int hashCode() {
        return Objects.hash(blueprintProductId, blueprintProductVersion, variables, isBlueprintHasMultiAccountResource);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Blueprint {\n");
        sb.append("    blueprintProductId: ").append(toIndentedString(blueprintProductId)).append("\n");
        sb.append("    blueprintProductVersion: ").append(toIndentedString(blueprintProductVersion)).append("\n");
        sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
        sb.append("    isBlueprintHasMultiAccountResource: ")
            .append(toIndentedString(isBlueprintHasMultiAccountResource))
            .append("\n");
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
