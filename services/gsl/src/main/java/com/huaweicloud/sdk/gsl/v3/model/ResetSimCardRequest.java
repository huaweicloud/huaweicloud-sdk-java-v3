package com.huaweicloud.sdk.gsl.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ResetSimCardRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sim_card_id")

    @JacksonXmlProperty(localName = "sim_card_id")

    private Long simCardId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    @JacksonXmlProperty(localName = "body")

    private DownUpTimeForSimCardReq body;

    public ResetSimCardRequest withSimCardId(Long simCardId) {
        this.simCardId = simCardId;
        return this;
    }

    /**
     * SIM卡标识，可通过[查询SIM卡列表接口](https://support.huaweicloud.com/api-ocgsl/gsl_07_0008.html)获取
     * minimum: 0
     * @return simCardId
     */
    public Long getSimCardId() {
        return simCardId;
    }

    public void setSimCardId(Long simCardId) {
        this.simCardId = simCardId;
    }

    public ResetSimCardRequest withBody(DownUpTimeForSimCardReq body) {
        this.body = body;
        return this;
    }

    public ResetSimCardRequest withBody(Consumer<DownUpTimeForSimCardReq> bodySetter) {
        if (this.body == null) {
            this.body = new DownUpTimeForSimCardReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public DownUpTimeForSimCardReq getBody() {
        return body;
    }

    public void setBody(DownUpTimeForSimCardReq body) {
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
        ResetSimCardRequest resetSimCardRequest = (ResetSimCardRequest) o;
        return Objects.equals(this.simCardId, resetSimCardRequest.simCardId)
            && Objects.equals(this.body, resetSimCardRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(simCardId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResetSimCardRequest {\n");
        sb.append("    simCardId: ").append(toIndentedString(simCardId)).append("\n");
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
