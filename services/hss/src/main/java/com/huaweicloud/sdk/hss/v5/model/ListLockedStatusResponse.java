package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ListLockedStatusResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "locked_status")

    private Boolean lockedStatus;

    public ListLockedStatusResponse withLockedStatus(Boolean lockedStatus) {
        this.lockedStatus = lockedStatus;
        return this;
    }

    /**
     * **参数解释**: 主机安全防护配额资源的锁定状态。 **取值范围**: - true：已锁定，不可将按需计费的防护配额转为包年/包月。 - false：未锁定，可将按需计费的防护配额转为包年/包月。 
     * @return lockedStatus
     */
    public Boolean getLockedStatus() {
        return lockedStatus;
    }

    public void setLockedStatus(Boolean lockedStatus) {
        this.lockedStatus = lockedStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListLockedStatusResponse that = (ListLockedStatusResponse) obj;
        return Objects.equals(this.lockedStatus, that.lockedStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lockedStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListLockedStatusResponse {\n");
        sb.append("    lockedStatus: ").append(toIndentedString(lockedStatus)).append("\n");
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
