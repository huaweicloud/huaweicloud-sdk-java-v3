package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class StartRemoteMirrorSynchronizationResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "jid")

    private String jid;

    public StartRemoteMirrorSynchronizationResponse withJid(String jid) {
        this.jid = jid;
        return this;
    }

    /**
     * **参数解释：** 同步任务Id。
     * @return jid
     */
    public String getJid() {
        return jid;
    }

    public void setJid(String jid) {
        this.jid = jid;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StartRemoteMirrorSynchronizationResponse that = (StartRemoteMirrorSynchronizationResponse) obj;
        return Objects.equals(this.jid, that.jid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jid);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StartRemoteMirrorSynchronizationResponse {\n");
        sb.append("    jid: ").append(toIndentedString(jid)).append("\n");
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
