package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** Request Object */
public class ChangeLoadbalancerChargeModeRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private ChangeLoadbalancerChargeModeRequestBody body;

    public ChangeLoadbalancerChargeModeRequest withBody(ChangeLoadbalancerChargeModeRequestBody body) {
        this.body = body;
        return this;
    }

    public ChangeLoadbalancerChargeModeRequest withBody(Consumer<ChangeLoadbalancerChargeModeRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new ChangeLoadbalancerChargeModeRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /** Get body
     * 
     * @return body */
    public ChangeLoadbalancerChargeModeRequestBody getBody() {
        return body;
    }

    public void setBody(ChangeLoadbalancerChargeModeRequestBody body) {
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
        ChangeLoadbalancerChargeModeRequest changeLoadbalancerChargeModeRequest =
            (ChangeLoadbalancerChargeModeRequest) o;
        return Objects.equals(this.body, changeLoadbalancerChargeModeRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChangeLoadbalancerChargeModeRequest {\n");
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
