package com.huaweicloud.sdk.sfsturbo.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** Request Object */
public class ChangeSecurityGroupRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "share_id")

    private String shareId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private ChangeSecurityGroupRequestBody body;

    public ChangeSecurityGroupRequest withShareId(String shareId) {
        this.shareId = shareId;
        return this;
    }

    /** 文件系统ID
     * 
     * @return shareId */
    public String getShareId() {
        return shareId;
    }

    public void setShareId(String shareId) {
        this.shareId = shareId;
    }

    public ChangeSecurityGroupRequest withBody(ChangeSecurityGroupRequestBody body) {
        this.body = body;
        return this;
    }

    public ChangeSecurityGroupRequest withBody(Consumer<ChangeSecurityGroupRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new ChangeSecurityGroupRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /** Get body
     * 
     * @return body */
    public ChangeSecurityGroupRequestBody getBody() {
        return body;
    }

    public void setBody(ChangeSecurityGroupRequestBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ChangeSecurityGroupRequest changeSecurityGroupRequest = (ChangeSecurityGroupRequest) o;
        return Objects.equals(this.shareId, changeSecurityGroupRequest.shareId)
            && Objects.equals(this.body, changeSecurityGroupRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shareId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChangeSecurityGroupRequest {\n");
        sb.append("    shareId: ").append(toIndentedString(shareId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
