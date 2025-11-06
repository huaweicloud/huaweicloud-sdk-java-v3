package com.huaweicloud.sdk.aom.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class AddOrUpdateMetricOrEventAlarmRuleRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_id")

    private String actionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Enterprise-Project-Id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private AddOrUpdateAlarmRuleV4RequestBody body;

    public AddOrUpdateMetricOrEventAlarmRuleRequest withActionId(String actionId) {
        this.actionId = actionId;
        return this;
    }

    /**
     * 告警规则id。 - 新增告警时，填写\"add-alarm-action\" - 更新告警时，填写“update-alarm-action”
     * @return actionId
     */
    public String getActionId() {
        return actionId;
    }

    public void setActionId(String actionId) {
        this.actionId = actionId;
    }

    public AddOrUpdateMetricOrEventAlarmRuleRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目id。获取方式请参见：[获取企业项目ID](aom_04_0024.xml) 。 - 查询单个企业项目下实例，填写企业项目id。  - 查询所有企业项目下实例，填写“all_granted_eps”。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public AddOrUpdateMetricOrEventAlarmRuleRequest withBody(AddOrUpdateAlarmRuleV4RequestBody body) {
        this.body = body;
        return this;
    }

    public AddOrUpdateMetricOrEventAlarmRuleRequest withBody(Consumer<AddOrUpdateAlarmRuleV4RequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new AddOrUpdateAlarmRuleV4RequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public AddOrUpdateAlarmRuleV4RequestBody getBody() {
        return body;
    }

    public void setBody(AddOrUpdateAlarmRuleV4RequestBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AddOrUpdateMetricOrEventAlarmRuleRequest that = (AddOrUpdateMetricOrEventAlarmRuleRequest) obj;
        return Objects.equals(this.actionId, that.actionId)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(actionId, enterpriseProjectId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddOrUpdateMetricOrEventAlarmRuleRequest {\n");
        sb.append("    actionId: ").append(toIndentedString(actionId)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
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
