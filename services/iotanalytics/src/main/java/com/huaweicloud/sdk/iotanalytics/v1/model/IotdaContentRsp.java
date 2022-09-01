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
public class IotdaContentRsp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iotda_instance_id")

    @JacksonXmlProperty(localName = "iotda_instance_id")

    private String iotdaInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rules")

    @JacksonXmlProperty(localName = "rules")

    private List<IotdaContentRuleRsp> rules = null;

    public IotdaContentRsp withIotdaInstanceId(String iotdaInstanceId) {
        this.iotdaInstanceId = iotdaInstanceId;
        return this;
    }

    /**
     * IoTDA实例Id
     * @return iotdaInstanceId
     */
    public String getIotdaInstanceId() {
        return iotdaInstanceId;
    }

    public void setIotdaInstanceId(String iotdaInstanceId) {
        this.iotdaInstanceId = iotdaInstanceId;
    }

    public IotdaContentRsp withRules(List<IotdaContentRuleRsp> rules) {
        this.rules = rules;
        return this;
    }

    public IotdaContentRsp addRulesItem(IotdaContentRuleRsp rulesItem) {
        if (this.rules == null) {
            this.rules = new ArrayList<>();
        }
        this.rules.add(rulesItem);
        return this;
    }

    public IotdaContentRsp withRules(Consumer<List<IotdaContentRuleRsp>> rulesSetter) {
        if (this.rules == null) {
            this.rules = new ArrayList<>();
        }
        rulesSetter.accept(this.rules);
        return this;
    }

    /**
     * 在IoTDA实例中要配置的转发规则，包含推送数据的资源空间和产品列表
     * @return rules
     */
    public List<IotdaContentRuleRsp> getRules() {
        return rules;
    }

    public void setRules(List<IotdaContentRuleRsp> rules) {
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
        IotdaContentRsp iotdaContentRsp = (IotdaContentRsp) o;
        return Objects.equals(this.iotdaInstanceId, iotdaContentRsp.iotdaInstanceId)
            && Objects.equals(this.rules, iotdaContentRsp.rules);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iotdaInstanceId, rules);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IotdaContentRsp {\n");
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
