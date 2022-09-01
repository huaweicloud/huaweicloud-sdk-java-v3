package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * IoTDA数据源详细配置内容
 */
public class EdgeContentReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iotda_instance_id")

    @JacksonXmlProperty(localName = "iotda_instance_id")

    private String iotdaInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rules")

    @JacksonXmlProperty(localName = "rules")

    private List<EdgeContentRuleReq> rules = null;

    public EdgeContentReq withIotdaInstanceId(String iotdaInstanceId) {
        this.iotdaInstanceId = iotdaInstanceId;
        return this;
    }

    /**
     * edge实例Id
     * @return iotdaInstanceId
     */
    public String getIotdaInstanceId() {
        return iotdaInstanceId;
    }

    public void setIotdaInstanceId(String iotdaInstanceId) {
        this.iotdaInstanceId = iotdaInstanceId;
    }

    public EdgeContentReq withRules(List<EdgeContentRuleReq> rules) {
        this.rules = rules;
        return this;
    }

    public EdgeContentReq addRulesItem(EdgeContentRuleReq rulesItem) {
        if (this.rules == null) {
            this.rules = new ArrayList<>();
        }
        this.rules.add(rulesItem);
        return this;
    }

    public EdgeContentReq withRules(Consumer<List<EdgeContentRuleReq>> rulesSetter) {
        if (this.rules == null) {
            this.rules = new ArrayList<>();
        }
        rulesSetter.accept(this.rules);
        return this;
    }

    /**
     * 在edge实例中要配置转发规则推送数据的资源空间和产品列表
     * @return rules
     */
    public List<EdgeContentRuleReq> getRules() {
        return rules;
    }

    public void setRules(List<EdgeContentRuleReq> rules) {
        this.rules = rules;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EdgeContentReq edgeContentReq = (EdgeContentReq) o;
        return Objects.equals(this.iotdaInstanceId, edgeContentReq.iotdaInstanceId)
            && Objects.equals(this.rules, edgeContentReq.rules);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iotdaInstanceId, rules);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EdgeContentReq {\n");
        sb.append("    iotdaInstanceId: ").append(toIndentedString(iotdaInstanceId)).append("\n");
        sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
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
