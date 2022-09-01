package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteKeywordsAlarmRuleRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keywords_alarm_rule_id")

    @JacksonXmlProperty(localName = "keywords_alarm_rule_id")

    private String keywordsAlarmRuleId;

    public DeleteKeywordsAlarmRuleRequest withKeywordsAlarmRuleId(String keywordsAlarmRuleId) {
        this.keywordsAlarmRuleId = keywordsAlarmRuleId;
        return this;
    }

    /**
     * 关键词告警规则id
     * @return keywordsAlarmRuleId
     */
    public String getKeywordsAlarmRuleId() {
        return keywordsAlarmRuleId;
    }

    public void setKeywordsAlarmRuleId(String keywordsAlarmRuleId) {
        this.keywordsAlarmRuleId = keywordsAlarmRuleId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteKeywordsAlarmRuleRequest deleteKeywordsAlarmRuleRequest = (DeleteKeywordsAlarmRuleRequest) o;
        return Objects.equals(this.keywordsAlarmRuleId, deleteKeywordsAlarmRuleRequest.keywordsAlarmRuleId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keywordsAlarmRuleId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteKeywordsAlarmRuleRequest {\n");
        sb.append("    keywordsAlarmRuleId: ").append(toIndentedString(keywordsAlarmRuleId)).append("\n");
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
