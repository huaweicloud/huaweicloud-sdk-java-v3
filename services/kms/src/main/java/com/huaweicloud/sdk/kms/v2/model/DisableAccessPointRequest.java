package com.huaweicloud.sdk.kms.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DisableAccessPointRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_point_id")

    private String accessPointId;

    public DisableAccessPointRequest withAccessPointId(String accessPointId) {
        this.accessPointId = accessPointId;
        return this;
    }

    /**
     * **参数解释：** 接入点ID。 **约束限制：** 不涉及 **取值范围：** UUID格式，字符长度36-36。 **默认取值：** 不涉及
     * @return accessPointId
     */
    public String getAccessPointId() {
        return accessPointId;
    }

    public void setAccessPointId(String accessPointId) {
        this.accessPointId = accessPointId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DisableAccessPointRequest that = (DisableAccessPointRequest) obj;
        return Objects.equals(this.accessPointId, that.accessPointId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessPointId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DisableAccessPointRequest {\n");
        sb.append("    accessPointId: ").append(toIndentedString(accessPointId)).append("\n");
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
