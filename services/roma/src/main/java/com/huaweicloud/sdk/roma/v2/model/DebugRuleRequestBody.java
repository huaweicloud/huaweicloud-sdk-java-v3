package com.huaweicloud.sdk.roma.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * DebugRuleRequestBody
 */
public class DebugRuleRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="test_data")
    
    private String testData;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="test_rule_express")
    
    private String testRuleExpress;

    public DebugRuleRequestBody withTestData(String testData) {
        this.testData = testData;
        return this;
    }

    


    /**
     * 测试的被规则执行的数据
     * @return testData
     */
    public String getTestData() {
        return testData;
    }

    public void setTestData(String testData) {
        this.testData = testData;
    }

    public DebugRuleRequestBody withTestRuleExpress(String testRuleExpress) {
        this.testRuleExpress = testRuleExpress;
        return this;
    }

    


    /**
     * 测试的规则
     * @return testRuleExpress
     */
    public String getTestRuleExpress() {
        return testRuleExpress;
    }

    public void setTestRuleExpress(String testRuleExpress) {
        this.testRuleExpress = testRuleExpress;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DebugRuleRequestBody debugRuleRequestBody = (DebugRuleRequestBody) o;
        return Objects.equals(this.testData, debugRuleRequestBody.testData) &&
            Objects.equals(this.testRuleExpress, debugRuleRequestBody.testRuleExpress);
    }
    @Override
    public int hashCode() {
        return Objects.hash(testData, testRuleExpress);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DebugRuleRequestBody {\n");
        sb.append("    testData: ").append(toIndentedString(testData)).append("\n");
        sb.append("    testRuleExpress: ").append(toIndentedString(testRuleExpress)).append("\n");
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

