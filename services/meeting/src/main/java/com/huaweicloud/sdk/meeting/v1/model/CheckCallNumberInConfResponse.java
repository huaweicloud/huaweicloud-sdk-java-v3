package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class CheckCallNumberInConfResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "in_conf")

    private Boolean inConf;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conf_id")

    private String confId;

    public CheckCallNumberInConfResponse withInConf(Boolean inConf) {
        this.inConf = inConf;
        return this;
    }

    /**
     * 是否在会议中
     * @return inConf
     */
    public Boolean getInConf() {
        return inConf;
    }

    public void setInConf(Boolean inConf) {
        this.inConf = inConf;
    }

    public CheckCallNumberInConfResponse withConfId(String confId) {
        this.confId = confId;
        return this;
    }

    /**
     * 会议id
     * @return confId
     */
    public String getConfId() {
        return confId;
    }

    public void setConfId(String confId) {
        this.confId = confId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CheckCallNumberInConfResponse that = (CheckCallNumberInConfResponse) obj;
        return Objects.equals(this.inConf, that.inConf) && Objects.equals(this.confId, that.confId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(inConf, confId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckCallNumberInConfResponse {\n");
        sb.append("    inConf: ").append(toIndentedString(inConf)).append("\n");
        sb.append("    confId: ").append(toIndentedString(confId)).append("\n");
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
