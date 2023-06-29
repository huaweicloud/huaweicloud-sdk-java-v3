package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 申请联席主持人请求。
 */
public class RestSetCohostBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isCohost")

    private Integer isCohost;

    public RestSetCohostBody withIsCohost(Integer isCohost) {
        this.isCohost = isCohost;
        return this;
    }

    /**
     * - 0：撤销联席主持人 - 1：设置联席主持人
     * minimum: 0
     * maximum: 1
     * @return isCohost
     */
    public Integer getIsCohost() {
        return isCohost;
    }

    public void setIsCohost(Integer isCohost) {
        this.isCohost = isCohost;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RestSetCohostBody that = (RestSetCohostBody) obj;
        return Objects.equals(this.isCohost, that.isCohost);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isCohost);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RestSetCohostBody {\n");
        sb.append("    isCohost: ").append(toIndentedString(isCohost)).append("\n");
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
