package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowAutoSearchTrialEarlyStopResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "earlystop_trial")

    private String earlystopTrial;

    public ShowAutoSearchTrialEarlyStopResponse withEarlystopTrial(String earlystopTrial) {
        this.earlystopTrial = earlystopTrial;
        return this;
    }

    /**
     * 提前终止的trial的trial_id。
     * @return earlystopTrial
     */
    public String getEarlystopTrial() {
        return earlystopTrial;
    }

    public void setEarlystopTrial(String earlystopTrial) {
        this.earlystopTrial = earlystopTrial;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowAutoSearchTrialEarlyStopResponse that = (ShowAutoSearchTrialEarlyStopResponse) obj;
        return Objects.equals(this.earlystopTrial, that.earlystopTrial);
    }

    @Override
    public int hashCode() {
        return Objects.hash(earlystopTrial);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAutoSearchTrialEarlyStopResponse {\n");
        sb.append("    earlystopTrial: ").append(toIndentedString(earlystopTrial)).append("\n");
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
