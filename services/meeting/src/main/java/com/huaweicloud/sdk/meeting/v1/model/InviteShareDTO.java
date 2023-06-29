package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 邀请共享请求。
 */
public class InviteShareDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "share")

    private Integer share;

    public InviteShareDTO withShare(Integer share) {
        this.share = share;
        return this;
    }

    /**
     * 邀请标志。 * 0：取消邀请 * 1：邀请 
     * minimum: 0
     * maximum: 1
     * @return share
     */
    public Integer getShare() {
        return share;
    }

    public void setShare(Integer share) {
        this.share = share;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InviteShareDTO that = (InviteShareDTO) obj;
        return Objects.equals(this.share, that.share);
    }

    @Override
    public int hashCode() {
        return Objects.hash(share);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InviteShareDTO {\n");
        sb.append("    share: ").append(toIndentedString(share)).append("\n");
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
