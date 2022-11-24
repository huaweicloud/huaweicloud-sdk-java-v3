package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListKeywordsAlarmRulesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keywords_alarm_rules")

    private List<KeywordsAlarmRuleRespList> keywordsAlarmRules = null;

    public ListKeywordsAlarmRulesResponse withKeywordsAlarmRules(List<KeywordsAlarmRuleRespList> keywordsAlarmRules) {
        this.keywordsAlarmRules = keywordsAlarmRules;
        return this;
    }

    public ListKeywordsAlarmRulesResponse addKeywordsAlarmRulesItem(KeywordsAlarmRuleRespList keywordsAlarmRulesItem) {
        if (this.keywordsAlarmRules == null) {
            this.keywordsAlarmRules = new ArrayList<>();
        }
        this.keywordsAlarmRules.add(keywordsAlarmRulesItem);
        return this;
    }

    public ListKeywordsAlarmRulesResponse withKeywordsAlarmRules(
        Consumer<List<KeywordsAlarmRuleRespList>> keywordsAlarmRulesSetter) {
        if (this.keywordsAlarmRules == null) {
            this.keywordsAlarmRules = new ArrayList<>();
        }
        keywordsAlarmRulesSetter.accept(this.keywordsAlarmRules);
        return this;
    }

    /**
     * 项目id
     * @return keywordsAlarmRules
     */
    public List<KeywordsAlarmRuleRespList> getKeywordsAlarmRules() {
        return keywordsAlarmRules;
    }

    public void setKeywordsAlarmRules(List<KeywordsAlarmRuleRespList> keywordsAlarmRules) {
        this.keywordsAlarmRules = keywordsAlarmRules;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListKeywordsAlarmRulesResponse listKeywordsAlarmRulesResponse = (ListKeywordsAlarmRulesResponse) o;
        return Objects.equals(this.keywordsAlarmRules, listKeywordsAlarmRulesResponse.keywordsAlarmRules);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keywordsAlarmRules);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListKeywordsAlarmRulesResponse {\n");
        sb.append("    keywordsAlarmRules: ").append(toIndentedString(keywordsAlarmRules)).append("\n");
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
