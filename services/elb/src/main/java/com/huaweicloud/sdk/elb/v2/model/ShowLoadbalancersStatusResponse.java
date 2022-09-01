package com.huaweicloud.sdk.elb.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowLoadbalancersStatusResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "statuses")

    @JacksonXmlProperty(localName = "statuses")

    private StatusResp statuses;

    public ShowLoadbalancersStatusResponse withStatuses(StatusResp statuses) {
        this.statuses = statuses;
        return this;
    }

    public ShowLoadbalancersStatusResponse withStatuses(Consumer<StatusResp> statusesSetter) {
        if (this.statuses == null) {
            this.statuses = new StatusResp();
            statusesSetter.accept(this.statuses);
        }

        return this;
    }

    /**
     * Get statuses
     * @return statuses
     */
    public StatusResp getStatuses() {
        return statuses;
    }

    public void setStatuses(StatusResp statuses) {
        this.statuses = statuses;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowLoadbalancersStatusResponse showLoadbalancersStatusResponse = (ShowLoadbalancersStatusResponse) o;
        return Objects.equals(this.statuses, showLoadbalancersStatusResponse.statuses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(statuses);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowLoadbalancersStatusResponse {\n");
        sb.append("    statuses: ").append(toIndentedString(statuses)).append("\n");
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
