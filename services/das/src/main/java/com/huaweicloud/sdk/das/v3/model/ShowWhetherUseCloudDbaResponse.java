package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowWhetherUseCloudDbaResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "can_use")

    private Boolean canUse;

    public ShowWhetherUseCloudDbaResponse withCanUse(Boolean canUse) {
        this.canUse = canUse;
        return this;
    }

    /**
     * 能否使用云DBA功能
     * @return canUse
     */
    public Boolean getCanUse() {
        return canUse;
    }

    public void setCanUse(Boolean canUse) {
        this.canUse = canUse;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowWhetherUseCloudDbaResponse that = (ShowWhetherUseCloudDbaResponse) obj;
        return Objects.equals(this.canUse, that.canUse);
    }

    @Override
    public int hashCode() {
        return Objects.hash(canUse);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowWhetherUseCloudDbaResponse {\n");
        sb.append("    canUse: ").append(toIndentedString(canUse)).append("\n");
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
