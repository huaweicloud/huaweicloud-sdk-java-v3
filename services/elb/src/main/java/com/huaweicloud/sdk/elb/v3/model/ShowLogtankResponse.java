package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowLogtankResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    @JacksonXmlProperty(localName = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logtank")

    @JacksonXmlProperty(localName = "logtank")

    private Logtank logtank;

    public ShowLogtankResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 请求ID。  注：自动生成 。
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public ShowLogtankResponse withLogtank(Logtank logtank) {
        this.logtank = logtank;
        return this;
    }

    public ShowLogtankResponse withLogtank(Consumer<Logtank> logtankSetter) {
        if (this.logtank == null) {
            this.logtank = new Logtank();
            logtankSetter.accept(this.logtank);
        }

        return this;
    }

    /**
     * Get logtank
     * @return logtank
     */
    public Logtank getLogtank() {
        return logtank;
    }

    public void setLogtank(Logtank logtank) {
        this.logtank = logtank;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowLogtankResponse showLogtankResponse = (ShowLogtankResponse) o;
        return Objects.equals(this.requestId, showLogtankResponse.requestId)
            && Objects.equals(this.logtank, showLogtankResponse.logtank);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, logtank);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowLogtankResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    logtank: ").append(toIndentedString(logtank)).append("\n");
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
