package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteLogtankRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logtank_id")

    @JacksonXmlProperty(localName = "logtank_id")

    private String logtankId;

    public DeleteLogtankRequest withLogtankId(String logtankId) {
        this.logtankId = logtankId;
        return this;
    }

    /**
     * 云日志ID。
     * @return logtankId
     */
    public String getLogtankId() {
        return logtankId;
    }

    public void setLogtankId(String logtankId) {
        this.logtankId = logtankId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteLogtankRequest deleteLogtankRequest = (DeleteLogtankRequest) o;
        return Objects.equals(this.logtankId, deleteLogtankRequest.logtankId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logtankId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteLogtankRequest {\n");
        sb.append("    logtankId: ").append(toIndentedString(logtankId)).append("\n");
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
