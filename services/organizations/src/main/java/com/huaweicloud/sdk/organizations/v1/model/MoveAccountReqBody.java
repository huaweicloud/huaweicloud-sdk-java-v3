package com.huaweicloud.sdk.organizations.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * MoveAccount 操作的请求体。
 */
public class MoveAccountReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_parent_id")

    private String sourceParentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_parent_id")

    private String destinationParentId;

    public MoveAccountReqBody withSourceParentId(String sourceParentId) {
        this.sourceParentId = sourceParentId;
        return this;
    }

    /**
     * 要移出帐号的根或组织单元的唯一标识符（ID）。
     * @return sourceParentId
     */
    public String getSourceParentId() {
        return sourceParentId;
    }

    public void setSourceParentId(String sourceParentId) {
        this.sourceParentId = sourceParentId;
    }

    public MoveAccountReqBody withDestinationParentId(String destinationParentId) {
        this.destinationParentId = destinationParentId;
        return this;
    }

    /**
     * 要移入帐号的根或组织单元的唯一标识符（ID）。
     * @return destinationParentId
     */
    public String getDestinationParentId() {
        return destinationParentId;
    }

    public void setDestinationParentId(String destinationParentId) {
        this.destinationParentId = destinationParentId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MoveAccountReqBody that = (MoveAccountReqBody) obj;
        return Objects.equals(this.sourceParentId, that.sourceParentId)
            && Objects.equals(this.destinationParentId, that.destinationParentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceParentId, destinationParentId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MoveAccountReqBody {\n");
        sb.append("    sourceParentId: ").append(toIndentedString(sourceParentId)).append("\n");
        sb.append("    destinationParentId: ").append(toIndentedString(destinationParentId)).append("\n");
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
