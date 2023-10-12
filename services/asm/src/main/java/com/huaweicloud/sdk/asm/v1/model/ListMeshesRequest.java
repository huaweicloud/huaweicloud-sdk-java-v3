package com.huaweicloud.sdk.asm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListMeshesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Apply-DomainID")

    private String xApplyDomainID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Apply-ProjectID")

    private String xApplyProjectID;

    public ListMeshesRequest withXApplyDomainID(String xApplyDomainID) {
        this.xApplyDomainID = xApplyDomainID;
        return this;
    }

    /**
     * 网格所属DomainID
     * @return xApplyDomainID
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Apply-DomainID")
    public String getXApplyDomainID() {
        return xApplyDomainID;
    }

    public void setXApplyDomainID(String xApplyDomainID) {
        this.xApplyDomainID = xApplyDomainID;
    }

    public ListMeshesRequest withXApplyProjectID(String xApplyProjectID) {
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
        ListMeshesRequest that = (ListMeshesRequest) obj;
        return Objects.equals(this.xApplyDomainID, that.xApplyDomainID)
            && Objects.equals(this.xApplyProjectID, that.xApplyProjectID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xApplyDomainID, xApplyProjectID);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListMeshesRequest {\n");
        sb.append("    xApplyDomainID: ").append(toIndentedString(xApplyDomainID)).append("\n");
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
