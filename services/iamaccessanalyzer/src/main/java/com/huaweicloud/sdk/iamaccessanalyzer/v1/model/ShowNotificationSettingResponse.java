package com.huaweicloud.sdk.iamaccessanalyzer.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowNotificationSettingResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "urn")

    private String urn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "analyzer_id")

    private String analyzerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "analyzer_name")

    private String analyzerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "analyzer_type")

    private AnalyzerType analyzerType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mc_switch")

    private Boolean mcSwitch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "smn_topic_urns")

    private List<String> smnTopicUrns = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private OffsetDateTime updatedAt;

    public ShowNotificationSettingResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 消息通知配置的唯一标识符。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowNotificationSettingResponse withUrn(String urn) {
        this.urn = urn;
        return this;
    }

    /**
     * 消息通知配置的唯一资源标识符。
     * @return urn
     */
    public String getUrn() {
        return urn;
    }

    public void setUrn(String urn) {
        this.urn = urn;
    }

    public ShowNotificationSettingResponse withAnalyzerId(String analyzerId) {
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

    public ShowNotificationSettingResponse withAnalyzerName(String analyzerName) {
        this.analyzerName = analyzerName;
        return this;
    }

    /**
     * 分析器的名称。
     * @return analyzerName
     */
    public String getAnalyzerName() {
        return analyzerName;
    }

    public void setAnalyzerName(String analyzerName) {
        this.analyzerName = analyzerName;
    }

    public ShowNotificationSettingResponse withAnalyzerType(AnalyzerType analyzerType) {
        this.analyzerType = analyzerType;
        return this;
    }

    /**
     * Get analyzerType
     * @return analyzerType
     */
    public AnalyzerType getAnalyzerType() {
        return analyzerType;
    }

    public void setAnalyzerType(AnalyzerType analyzerType) {
        this.analyzerType = analyzerType;
    }

    public ShowNotificationSettingResponse withMcSwitch(Boolean mcSwitch) {
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

    public ShowNotificationSettingResponse withSmnTopicUrns(List<String> smnTopicUrns) {
        this.smnTopicUrns = smnTopicUrns;
        return this;
    }

    public ShowNotificationSettingResponse addSmnTopicUrnsItem(String smnTopicUrnsItem) {
        if (this.smnTopicUrns == null) {
            this.smnTopicUrns = new ArrayList<>();
        }
        this.smnTopicUrns.add(smnTopicUrnsItem);
        return this;
    }

    public ShowNotificationSettingResponse withSmnTopicUrns(Consumer<List<String>> smnTopicUrnsSetter) {
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

    public ShowNotificationSettingResponse withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 创建消息通知配置的时间。
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public ShowNotificationSettingResponse withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 上次更新消息通知配置的时间。
     * @return updatedAt
     */
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowNotificationSettingResponse that = (ShowNotificationSettingResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.urn, that.urn)
            && Objects.equals(this.analyzerId, that.analyzerId) && Objects.equals(this.analyzerName, that.analyzerName)
            && Objects.equals(this.analyzerType, that.analyzerType) && Objects.equals(this.mcSwitch, that.mcSwitch)
            && Objects.equals(this.smnTopicUrns, that.smnTopicUrns) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(id, urn, analyzerId, analyzerName, analyzerType, mcSwitch, smnTopicUrns, createdAt, updatedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowNotificationSettingResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    urn: ").append(toIndentedString(urn)).append("\n");
        sb.append("    analyzerId: ").append(toIndentedString(analyzerId)).append("\n");
        sb.append("    analyzerName: ").append(toIndentedString(analyzerName)).append("\n");
        sb.append("    analyzerType: ").append(toIndentedString(analyzerType)).append("\n");
        sb.append("    mcSwitch: ").append(toIndentedString(mcSwitch)).append("\n");
        sb.append("    smnTopicUrns: ").append(toIndentedString(smnTopicUrns)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
