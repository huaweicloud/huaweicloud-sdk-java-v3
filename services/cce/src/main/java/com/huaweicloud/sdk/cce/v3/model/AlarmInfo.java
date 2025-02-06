package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 告警助手参数配置。基于AOM服务的告警能力实现，提供集群内的告警快速检索、告警快速配置的能力，告警中心的指标类告警规则依赖云原生监控插件上报数据到AOM实例。 **约束限制：** 不涉及
 */
public class AlarmInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topics")

    private List<String> topics = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarmRuleTemplateId")

    private String alarmRuleTemplateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "promInstanceID")

    private String promInstanceID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "promEnterpriseProjectID")

    private String promEnterpriseProjectID;

    public AlarmInfo withTopics(List<String> topics) {
        this.topics = topics;
        return this;
    }

    public AlarmInfo addTopicsItem(String topicsItem) {
        if (this.topics == null) {
            this.topics = new ArrayList<>();
        }
        this.topics.add(topicsItem);
        return this;
    }

    public AlarmInfo withTopics(Consumer<List<String>> topicsSetter) {
        if (this.topics == null) {
            this.topics = new ArrayList<>();
        }
        topicsSetter.accept(this.topics);
        return this;
    }

    /**
     * **参数解释：** 联系组列表。填写SMN主题名称，通过配置告警联系组，分组管理订阅终端，接收告警信息。 **约束限制：** 不涉及
     * @return topics
     */
    public List<String> getTopics() {
        return topics;
    }

    public void setTopics(List<String> topics) {
        this.topics = topics;
    }

    public AlarmInfo withAlarmRuleTemplateId(String alarmRuleTemplateId) {
        this.alarmRuleTemplateId = alarmRuleTemplateId;
        return this;
    }

    /**
     * **参数解释：** 开启告警助手时传入告警模板ID。默认采用容器场景下的告警规则模板。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return alarmRuleTemplateId
     */
    public String getAlarmRuleTemplateId() {
        return alarmRuleTemplateId;
    }

    public void setAlarmRuleTemplateId(String alarmRuleTemplateId) {
        this.alarmRuleTemplateId = alarmRuleTemplateId;
    }

    public AlarmInfo withPromInstanceID(String promInstanceID) {
        this.promInstanceID = promInstanceID;
        return this;
    }

    /**
     * **参数解释：** 开启告警助手时传入AOM普罗实例的id。若未安装普罗插件或者未对接AOM实例，此参数无需指定，告警中心将不会创建指标类告警规则。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return promInstanceID
     */
    public String getPromInstanceID() {
        return promInstanceID;
    }

    public void setPromInstanceID(String promInstanceID) {
        this.promInstanceID = promInstanceID;
    }

    public AlarmInfo withPromEnterpriseProjectID(String promEnterpriseProjectID) {
        this.promEnterpriseProjectID = promEnterpriseProjectID;
        return this;
    }

    /**
     * **参数解释：** 开启告警助手时传入AOM普罗实例的企业项目id。若未安装普罗插件或者未对接AOM实例，此参数无需指定，告警中心将不会创建指标类告警规则。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return promEnterpriseProjectID
     */
    public String getPromEnterpriseProjectID() {
        return promEnterpriseProjectID;
    }

    public void setPromEnterpriseProjectID(String promEnterpriseProjectID) {
        this.promEnterpriseProjectID = promEnterpriseProjectID;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AlarmInfo that = (AlarmInfo) obj;
        return Objects.equals(this.topics, that.topics)
            && Objects.equals(this.alarmRuleTemplateId, that.alarmRuleTemplateId)
            && Objects.equals(this.promInstanceID, that.promInstanceID)
            && Objects.equals(this.promEnterpriseProjectID, that.promEnterpriseProjectID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topics, alarmRuleTemplateId, promInstanceID, promEnterpriseProjectID);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AlarmInfo {\n");
        sb.append("    topics: ").append(toIndentedString(topics)).append("\n");
        sb.append("    alarmRuleTemplateId: ").append(toIndentedString(alarmRuleTemplateId)).append("\n");
        sb.append("    promInstanceID: ").append(toIndentedString(promInstanceID)).append("\n");
        sb.append("    promEnterpriseProjectID: ").append(toIndentedString(promEnterpriseProjectID)).append("\n");
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
