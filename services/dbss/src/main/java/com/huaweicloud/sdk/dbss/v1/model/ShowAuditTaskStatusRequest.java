package com.huaweicloud.sdk.dbss.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowAuditTaskStatusRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "busi_type")

    private String busiType;

    public ShowAuditTaskStatusRequest withBusiType(String busiType) {
        this.busiType = busiType;
        return this;
    }

    /**
     * **参数解释**： 业务类型。 **约束限制**： 不涉及 **取值范围**：   - audit：审计实例    - risk：风险 **默认取值**： 不涉及 
     * @return busiType
     */
    public String getBusiType() {
        return busiType;
    }

    public void setBusiType(String busiType) {
        this.busiType = busiType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowAuditTaskStatusRequest that = (ShowAuditTaskStatusRequest) obj;
        return Objects.equals(this.busiType, that.busiType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(busiType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAuditTaskStatusRequest {\n");
        sb.append("    busiType: ").append(toIndentedString(busiType)).append("\n");
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
