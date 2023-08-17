package com.huaweicloud.sdk.ec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class AddEcnWithIegRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ecn_id")

    private String ecnId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private EcnWithIegRequest body;

    public AddEcnWithIegRequest withEcnId(String ecnId) {
        this.ecnId = ecnId;
        return this;
    }

    /**
     * 企业连接网络ID
     * @return ecnId
     */
    public String getEcnId() {
        return ecnId;
    }

    public void setEcnId(String ecnId) {
        this.ecnId = ecnId;
    }

    public AddEcnWithIegRequest withBody(EcnWithIegRequest body) {
        this.body = body;
        return this;
    }

    public AddEcnWithIegRequest withBody(Consumer<EcnWithIegRequest> bodySetter) {
        if (this.body == null) {
            this.body = new EcnWithIegRequest();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public EcnWithIegRequest getBody() {
        return body;
    }

    public void setBody(EcnWithIegRequest body) {
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
        AddEcnWithIegRequest that = (AddEcnWithIegRequest) obj;
        return Objects.equals(this.ecnId, that.ecnId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ecnId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddEcnWithIegRequest {\n");
        sb.append("    ecnId: ").append(toIndentedString(ecnId)).append("\n");
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
