package com.huaweicloud.sdk.iamaccessanalyzer.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateNotificationSettingReqBody
 */
public class CreateNotificationSettingReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "analyzer_id")

    private String analyzerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mc_switch")

    private Boolean mcSwitch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "smn_topic_urns")

    private List<String> smnTopicUrns = null;

    public CreateNotificationSettingReqBody withAnalyzerId(String analyzerId) {
        this.analyzerId = analyzerId;
        return this;
    }

    /**
     * 分析器的唯一标识符。
     * @return analyzerId
     */
    public String getAnalyzerId() {
        return analyzerId;
    }

    public void setAnalyzerId(String analyzerId) {
        this.analyzerId = analyzerId;
    }

    public CreateNotificationSettingReqBody withMcSwitch(Boolean mcSwitch) {
        this.mcSwitch = mcSwitch;
        return this;
    }

    /**
     * 是否开启消息中心通知开关。
     * @return mcSwitch
     */
    public Boolean getMcSwitch() {
        return mcSwitch;
    }

    public void setMcSwitch(Boolean mcSwitch) {
        this.mcSwitch = mcSwitch;
    }

    public CreateNotificationSettingReqBody withSmnTopicUrns(List<String> smnTopicUrns) {
        this.smnTopicUrns = smnTopicUrns;
        return this;
    }

    public CreateNotificationSettingReqBody addSmnTopicUrnsItem(String smnTopicUrnsItem) {
        if (this.smnTopicUrns == null) {
            this.smnTopicUrns = new ArrayList<>();
        }
        this.smnTopicUrns.add(smnTopicUrnsItem);
        return this;
    }

    public CreateNotificationSettingReqBody withSmnTopicUrns(Consumer<List<String>> smnTopicUrnsSetter) {
        if (this.smnTopicUrns == null) {
            this.smnTopicUrns = new ArrayList<>();
        }
        smnTopicUrnsSetter.accept(this.smnTopicUrns);
        return this;
    }

    /**
     * 消息通知配置的SMN主题URN列表。
     * @return smnTopicUrns
     */
    public List<String> getSmnTopicUrns() {
        return smnTopicUrns;
    }

    public void setSmnTopicUrns(List<String> smnTopicUrns) {
        this.smnTopicUrns = smnTopicUrns;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateNotificationSettingReqBody that = (CreateNotificationSettingReqBody) obj;
        return Objects.equals(this.analyzerId, that.analyzerId) && Objects.equals(this.mcSwitch, that.mcSwitch)
            && Objects.equals(this.smnTopicUrns, that.smnTopicUrns);
    }

    @Override
    public int hashCode() {
        return Objects.hash(analyzerId, mcSwitch, smnTopicUrns);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateNotificationSettingReqBody {\n");
        sb.append("    analyzerId: ").append(toIndentedString(analyzerId)).append("\n");
        sb.append("    mcSwitch: ").append(toIndentedString(mcSwitch)).append("\n");
        sb.append("    smnTopicUrns: ").append(toIndentedString(smnTopicUrns)).append("\n");
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
