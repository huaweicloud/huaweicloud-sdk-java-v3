package com.huaweicloud.sdk.testhub.v1.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 测试用例执行信息，数组长度小于等于50
 */
public class TestCaseExecuteBean  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="testcase_id")
    
    private String testcaseId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="execute_id")
    
    private String executeId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="result_id")
    
    private String resultId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="start_time")
    
    private Long startTime;

    public TestCaseExecuteBean withTestcaseId(String testcaseId) {
        this.testcaseId = testcaseId;
        return this;
    }

    


    /**
     * 测试用例唯一标识，列表中不允许存在重复的id，固定长度32位字符
     * @return testcaseId
     */
    public String getTestcaseId() {
        return testcaseId;
    }

    public void setTestcaseId(String testcaseId) {
        this.testcaseId = testcaseId;
    }

    public TestCaseExecuteBean withExecuteId(String executeId) {
        this.executeId = executeId;
        return this;
    }

    


    /**
     * 注册服务执行id，该值不允许重复，不超过32位字符
     * @return executeId
     */
    public String getExecuteId() {
        return executeId;
    }

    public void setExecuteId(String executeId) {
        this.executeId = executeId;
    }

    public TestCaseExecuteBean withResultId(String resultId) {
        this.resultId = resultId;
        return this;
    }

    


    /**
     * 测试用例结果，（0-成功，1-失败，5-执行中，6-停止）
     * @return resultId
     */
    public String getResultId() {
        return resultId;
    }

    public void setResultId(String resultId) {
        this.resultId = resultId;
    }

    public TestCaseExecuteBean withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    


    /**
     * 用例开始执行的时间戳，在执行开始时该字段必传
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TestCaseExecuteBean testCaseExecuteBean = (TestCaseExecuteBean) o;
        return Objects.equals(this.testcaseId, testCaseExecuteBean.testcaseId) &&
            Objects.equals(this.executeId, testCaseExecuteBean.executeId) &&
            Objects.equals(this.resultId, testCaseExecuteBean.resultId) &&
            Objects.equals(this.startTime, testCaseExecuteBean.startTime);
    }
    @Override
    public int hashCode() {
        return Objects.hash(testcaseId, executeId, resultId, startTime);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TestCaseExecuteBean {\n");
        sb.append("    testcaseId: ").append(toIndentedString(testcaseId)).append("\n");
        sb.append("    executeId: ").append(toIndentedString(executeId)).append("\n");
        sb.append("    resultId: ").append(toIndentedString(resultId)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
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

