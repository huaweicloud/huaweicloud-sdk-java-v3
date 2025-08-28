package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowIpGroupRelatedListenersRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipgroup_id")

    private String ipgroupId;

    public ShowIpGroupRelatedListenersRequest withIpgroupId(String ipgroupId) {
        this.ipgroupId = ipgroupId;
        return this;
    }

    /**
     * **参数解释**：IP地址组ID。  **约束限制**：不涉及  **取值范围**：不涉及  **默认取值**：不涉及
     * @return ipgroupId
     */
    public String getIpgroupId() {
        return ipgroupId;
    }

    public void setIpgroupId(String ipgroupId) {
        this.ipgroupId = ipgroupId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowIpGroupRelatedListenersRequest that = (ShowIpGroupRelatedListenersRequest) obj;
        return Objects.equals(this.ipgroupId, that.ipgroupId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ipgroupId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowIpGroupRelatedListenersRequest {\n");
        sb.append("    ipgroupId: ").append(toIndentedString(ipgroupId)).append("\n");
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
