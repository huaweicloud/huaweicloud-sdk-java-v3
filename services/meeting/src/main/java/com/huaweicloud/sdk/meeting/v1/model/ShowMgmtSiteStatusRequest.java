package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowMgmtSiteStatusRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Schema-Type")

    private String xSchemaType;

    public ShowMgmtSiteStatusRequest withXSchemaType(String xSchemaType) {
        this.xSchemaType = xSchemaType;
        return this;
    }

    /**
     * 模版类型。
     * @return xSchemaType
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Schema-Type")
    public String getXSchemaType() {
        return xSchemaType;
    }

    public void setXSchemaType(String xSchemaType) {
        this.xSchemaType = xSchemaType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowMgmtSiteStatusRequest that = (ShowMgmtSiteStatusRequest) obj;
        return Objects.equals(this.xSchemaType, that.xSchemaType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xSchemaType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowMgmtSiteStatusRequest {\n");
        sb.append("    xSchemaType: ").append(toIndentedString(xSchemaType)).append("\n");
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
