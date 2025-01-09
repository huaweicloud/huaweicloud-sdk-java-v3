package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateOuInfoRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ou_id")

    private String ouId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private ModifyOuNameInfoV2Req body;

    public UpdateOuInfoRequest withOuId(String ouId) {
        this.ouId = ouId;
        return this;
    }

    /**
     * OU的id。
     * @return ouId
     */
    public String getOuId() {
        return ouId;
    }

    public void setOuId(String ouId) {
        this.ouId = ouId;
    }

    public UpdateOuInfoRequest withBody(ModifyOuNameInfoV2Req body) {
        this.body = body;
        return this;
    }

    public UpdateOuInfoRequest withBody(Consumer<ModifyOuNameInfoV2Req> bodySetter) {
        if (this.body == null) {
            this.body = new ModifyOuNameInfoV2Req();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public ModifyOuNameInfoV2Req getBody() {
        return body;
    }

    public void setBody(ModifyOuNameInfoV2Req body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateOuInfoRequest that = (UpdateOuInfoRequest) obj;
        return Objects.equals(this.ouId, that.ouId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ouId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateOuInfoRequest {\n");
        sb.append("    ouId: ").append(toIndentedString(ouId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
