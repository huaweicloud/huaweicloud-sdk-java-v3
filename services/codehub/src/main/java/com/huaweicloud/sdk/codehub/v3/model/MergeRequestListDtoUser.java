package com.huaweicloud.sdk.codehub.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * MergeRequestListDtoUser
 */
public class MergeRequestListDtoUser {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "can_merge")

    private Boolean canMerge;

    public MergeRequestListDtoUser withCanMerge(Boolean canMerge) {
        this.canMerge = canMerge;
        return this;
    }

    /**
     * 当前用户是否可合入
     * @return canMerge
     */
    public Boolean getCanMerge() {
        return canMerge;
    }

    public void setCanMerge(Boolean canMerge) {
        this.canMerge = canMerge;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MergeRequestListDtoUser that = (MergeRequestListDtoUser) obj;
        return Objects.equals(this.canMerge, that.canMerge);
    }

    @Override
    public int hashCode() {
        return Objects.hash(canMerge);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MergeRequestListDtoUser {\n");
        sb.append("    canMerge: ").append(toIndentedString(canMerge)).append("\n");
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
