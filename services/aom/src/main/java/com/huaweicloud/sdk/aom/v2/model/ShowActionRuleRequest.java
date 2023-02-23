package com.huaweicloud.sdk.aom.v2.model;






import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
@JacksonXmlRootElement(localName = "ShowActionRuleRequest")
public class ShowActionRuleRequest  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="rule_name")
    
    @JacksonXmlProperty(localName = "rule_name")

    private String ruleName;

    public ShowActionRuleRequest withRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }

    


    /**
     * 告警规则名称
     * @return ruleName
     */
    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowActionRuleRequest showActionRuleRequest = (ShowActionRuleRequest) o;
        return Objects.equals(this.ruleName, showActionRuleRequest.ruleName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(ruleName);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowActionRuleRequest {\n");
        sb.append("    ruleName: ").append(toIndentedString(ruleName)).append("\n");
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

