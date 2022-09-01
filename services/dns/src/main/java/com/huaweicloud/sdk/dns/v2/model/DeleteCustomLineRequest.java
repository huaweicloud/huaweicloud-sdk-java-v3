package com.huaweicloud.sdk.dns.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteCustomLineRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "line_id")

    @JacksonXmlProperty(localName = "line_id")

    private String lineId;

    public DeleteCustomLineRequest withLineId(String lineId) {
        this.lineId = lineId;
        return this;
    }

    /**
     * 解析线路ID。
     * @return lineId
     */
    public String getLineId() {
        return lineId;
    }

    public void setLineId(String lineId) {
        this.lineId = lineId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteCustomLineRequest deleteCustomLineRequest = (DeleteCustomLineRequest) o;
        return Objects.equals(this.lineId, deleteCustomLineRequest.lineId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lineId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteCustomLineRequest {\n");
        sb.append("    lineId: ").append(toIndentedString(lineId)).append("\n");
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
