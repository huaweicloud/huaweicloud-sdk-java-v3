package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** IoTDA数据源详细配置内容 */
public class IotdaContentReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iotda_instance_id")

    private String iotdaInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rules")

    private List<IotdaContentRuleReq> rules = null;

    public IotdaContentReq withIotdaInstanceId(String iotdaInstanceId) {
        this.iotdaInstanceId = iotdaInstanceId;
        return this;
    }

    /** IoTDA实例Id
     * 
     * @return iotdaInstanceId */
    public String getIotdaInstanceId() {
        return iotdaInstanceId;
    }

    public void setIotdaInstanceId(String iotdaInstanceId) {
        this.iotdaInstanceId = iotdaInstanceId;
    }

    public IotdaContentReq withRules(List<IotdaContentRuleReq> rules) {
        this.rules = rules;
        return this;
    }

    public IotdaContentReq addRulesItem(IotdaContentRuleReq rulesItem) {
        if (this.rules == null) {
            this.rules = new ArrayList<>();
        }
        this.rules.add(rulesItem);
        return this;
    }

    public IotdaContentReq withRules(Consumer<List<IotdaContentRuleReq>> rulesSetter) {
        if (this.rules == null) {
            this.rules = new ArrayList<>();
        }
        rulesSetter.accept(this.rules);
        return this;
    }

    /** 在IoTDA实例中要配置转发规则推送数据的资源空间和产品列表
     * 
     * @return rules */
    public List<IotdaContentRuleReq> getRules() {
        return rules;
    }

    public void setRules(List<IotdaContentRuleReq> rules) {
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
        IotdaContentReq iotdaContentReq = (IotdaContentReq) o;
        return Objects.equals(this.iotdaInstanceId, iotdaContentReq.iotdaInstanceId)
            && Objects.equals(this.rules, iotdaContentReq.rules);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iotdaInstanceId, rules);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IotdaContentReq {\n");
        sb.append("    iotdaInstanceId: ").append(toIndentedString(iotdaInstanceId)).append("\n");
        sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
