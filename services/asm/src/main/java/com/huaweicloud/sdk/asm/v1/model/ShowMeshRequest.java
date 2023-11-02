package com.huaweicloud.sdk.asm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowMeshRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mesh_id")

    private String meshId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Apply-ProjectID")

    private String xApplyProjectID;

    public ShowMeshRequest withMeshId(String meshId) {
        this.meshId = meshId;
        return this;
    }

    /**
     * 网格ID
     * @return meshId
     */
    public String getMeshId() {
        return meshId;
    }

    public void setMeshId(String meshId) {
        this.meshId = meshId;
    }

    public ShowMeshRequest withXApplyProjectID(String xApplyProjectID) {
        this.xApplyProjectID = xApplyProjectID;
        return this;
    }

    /**
     * 网格所属ProjectID
     * @return xApplyProjectID
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Apply-ProjectID")
    public String getXApplyProjectID() {
        return xApplyProjectID;
    }

    public void setXApplyProjectID(String xApplyProjectID) {
        this.xApplyProjectID = xApplyProjectID;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowMeshRequest that = (ShowMeshRequest) obj;
        return Objects.equals(this.meshId, that.meshId) && Objects.equals(this.xApplyProjectID, that.xApplyProjectID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(meshId, xApplyProjectID);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowMeshRequest {\n");
        sb.append("    meshId: ").append(toIndentedString(meshId)).append("\n");
        sb.append("    xApplyProjectID: ").append(toIndentedString(xApplyProjectID)).append("\n");
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
