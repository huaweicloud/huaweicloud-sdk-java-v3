package com.huaweicloud.sdk.dns.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CreateAuthorizeTxtRecordRequestBody
 */
public class CreateAuthorizeTxtRecordRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "zone_name")

    private String zoneName;

    public CreateAuthorizeTxtRecordRequestBody withZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }

    /**
     * **参数解释：** 待创建的子域名。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return zoneName
     */
    public String getZoneName() {
        return zoneName;
    }

    public void setZoneName(String zoneName) {
        this.zoneName = zoneName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateAuthorizeTxtRecordRequestBody that = (CreateAuthorizeTxtRecordRequestBody) obj;
        return Objects.equals(this.zoneName, that.zoneName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(zoneName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAuthorizeTxtRecordRequestBody {\n");
        sb.append("    zoneName: ").append(toIndentedString(zoneName)).append("\n");
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
