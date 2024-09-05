package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class CreateAuthRandomRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conf_id")

    private String confId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "guest_waiting")

    private Integer guestWaiting;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Password")

    private String xPassword;

    public CreateAuthRandomRequest withConfId(String confId) {
        this.confId = confId;
        return this;
    }

    /**
     * 会议ID
     * @return confId
     */
    public String getConfId() {
        return confId;
    }

    public void setConfId(String confId) {
        this.confId = confId;
    }

    public CreateAuthRandomRequest withGuestWaiting(Integer guestWaiting) {
        this.guestWaiting = guestWaiting;
        return this;
    }

    /**
     * 0-不支持来宾会前等待页能力（默认）、1-支持来宾会前等待页能力
     * minimum: 0
     * maximum: 1
     * @return guestWaiting
     */
    public Integer getGuestWaiting() {
        return guestWaiting;
    }

    public void setGuestWaiting(Integer guestWaiting) {
        this.guestWaiting = guestWaiting;
    }

    public CreateAuthRandomRequest withXPassword(String xPassword) {
        this.xPassword = xPassword;
        return this;
    }

    /**
     * 会议密码
     * @return xPassword
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Password")
    public String getXPassword() {
        return xPassword;
    }

    public void setXPassword(String xPassword) {
        this.xPassword = xPassword;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateAuthRandomRequest that = (CreateAuthRandomRequest) obj;
        return Objects.equals(this.confId, that.confId) && Objects.equals(this.guestWaiting, that.guestWaiting)
            && Objects.equals(this.xPassword, that.xPassword);
    }

    @Override
    public int hashCode() {
        return Objects.hash(confId, guestWaiting, xPassword);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAuthRandomRequest {\n");
        sb.append("    confId: ").append(toIndentedString(confId)).append("\n");
        sb.append("    guestWaiting: ").append(toIndentedString(guestWaiting)).append("\n");
        sb.append("    xPassword: ").append(toIndentedString(xPassword)).append("\n");
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
