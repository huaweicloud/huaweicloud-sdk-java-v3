package com.huaweicloud.sdk.vcm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 托管输出位置
 */
public class AudioOutputHosting {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs")

    private AudioOutputHostingObs obs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result_json_overdue_at")

    private String resultJsonOverdueAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_obs_after_end_state")

    private Boolean checkObsAfterEndState;

    public AudioOutputHosting withObs(AudioOutputHostingObs obs) {
        this.obs = obs;
        return this;
    }

    public AudioOutputHosting withObs(Consumer<AudioOutputHostingObs> obsSetter) {
        if (this.obs == null) {
            this.obs = new AudioOutputHostingObs();
            obsSetter.accept(this.obs);
        }

        return this;
    }

    /**
     * Get obs
     * @return obs
     */
    public AudioOutputHostingObs getObs() {
        return obs;
    }

    public void setObs(AudioOutputHostingObs obs) {
        this.obs = obs;
    }

    public AudioOutputHosting withResultJsonOverdueAt(String resultJsonOverdueAt) {
        this.resultJsonOverdueAt = resultJsonOverdueAt;
        return this;
    }

    /**
     * 托管文件result.json的过期日期，文件默认保存48小时。  result.json文件生成且未过期时，会有这个字段。 
     * @return resultJsonOverdueAt
     */
    public String getResultJsonOverdueAt() {
        return resultJsonOverdueAt;
    }

    public void setResultJsonOverdueAt(String resultJsonOverdueAt) {
        this.resultJsonOverdueAt = resultJsonOverdueAt;
    }

    public AudioOutputHosting withCheckObsAfterEndState(Boolean checkObsAfterEndState) {
        this.checkObsAfterEndState = checkObsAfterEndState;
        return this;
    }

    /**
     * True表示校验obs。
     * @return checkObsAfterEndState
     */
    public Boolean getCheckObsAfterEndState() {
        return checkObsAfterEndState;
    }

    public void setCheckObsAfterEndState(Boolean checkObsAfterEndState) {
        this.checkObsAfterEndState = checkObsAfterEndState;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AudioOutputHosting that = (AudioOutputHosting) obj;
        return Objects.equals(this.obs, that.obs) && Objects.equals(this.resultJsonOverdueAt, that.resultJsonOverdueAt)
            && Objects.equals(this.checkObsAfterEndState, that.checkObsAfterEndState);
    }

    @Override
    public int hashCode() {
        return Objects.hash(obs, resultJsonOverdueAt, checkObsAfterEndState);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AudioOutputHosting {\n");
        sb.append("    obs: ").append(toIndentedString(obs)).append("\n");
        sb.append("    resultJsonOverdueAt: ").append(toIndentedString(resultJsonOverdueAt)).append("\n");
        sb.append("    checkObsAfterEndState: ").append(toIndentedString(checkObsAfterEndState)).append("\n");
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
