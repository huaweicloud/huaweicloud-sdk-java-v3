package com.huaweicloud.sdk.vcm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 托管输出位置
 */
public class AudioResponseOutputHosting {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs")

    @JacksonXmlProperty(localName = "obs")

    private List<AudioOutputHostingObs> obs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result_json_overdue_at")

    @JacksonXmlProperty(localName = "result_json_overdue_at")

    private String resultJsonOverdueAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_obs_after_end_state")

    @JacksonXmlProperty(localName = "check_obs_after_end_state")

    private Boolean checkObsAfterEndState;

    public AudioResponseOutputHosting withObs(List<AudioOutputHostingObs> obs) {
        this.obs = obs;
        return this;
    }

    public AudioResponseOutputHosting addObsItem(AudioOutputHostingObs obsItem) {
        if (this.obs == null) {
            this.obs = new ArrayList<>();
        }
        this.obs.add(obsItem);
        return this;
    }

    public AudioResponseOutputHosting withObs(Consumer<List<AudioOutputHostingObs>> obsSetter) {
        if (this.obs == null) {
            this.obs = new ArrayList<>();
        }
        obsSetter.accept(this.obs);
        return this;
    }

    /**
     * 结果文件result.json的OBS信息。
     * @return obs
     */
    public List<AudioOutputHostingObs> getObs() {
        return obs;
    }

    public void setObs(List<AudioOutputHostingObs> obs) {
        this.obs = obs;
    }

    public AudioResponseOutputHosting withResultJsonOverdueAt(String resultJsonOverdueAt) {
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

    public AudioResponseOutputHosting withCheckObsAfterEndState(Boolean checkObsAfterEndState) {
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AudioResponseOutputHosting audioResponseOutputHosting = (AudioResponseOutputHosting) o;
        return Objects.equals(this.obs, audioResponseOutputHosting.obs)
            && Objects.equals(this.resultJsonOverdueAt, audioResponseOutputHosting.resultJsonOverdueAt)
            && Objects.equals(this.checkObsAfterEndState, audioResponseOutputHosting.checkObsAfterEndState);
    }

    @Override
    public int hashCode() {
        return Objects.hash(obs, resultJsonOverdueAt, checkObsAfterEndState);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AudioResponseOutputHosting {\n");
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
