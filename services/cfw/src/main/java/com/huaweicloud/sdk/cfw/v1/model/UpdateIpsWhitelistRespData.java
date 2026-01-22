package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释** 返回数据 **取值范围**： 不涉及
 */
public class UpdateIpsWhitelistRespData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ips_whitelist_id")

    private String ipsWhitelistId;

    public UpdateIpsWhitelistRespData withIpsWhitelistId(String ipsWhitelistId) {
        this.ipsWhitelistId = ipsWhitelistId;
        return this;
    }

    /**
     * **参数解释** 白名单id  **取值范围**： 不涉及
     * @return ipsWhitelistId
     */
    public String getIpsWhitelistId() {
        return ipsWhitelistId;
    }

    public void setIpsWhitelistId(String ipsWhitelistId) {
        this.ipsWhitelistId = ipsWhitelistId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateIpsWhitelistRespData that = (UpdateIpsWhitelistRespData) obj;
        return Objects.equals(this.ipsWhitelistId, that.ipsWhitelistId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ipsWhitelistId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateIpsWhitelistRespData {\n");
        sb.append("    ipsWhitelistId: ").append(toIndentedString(ipsWhitelistId)).append("\n");
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
