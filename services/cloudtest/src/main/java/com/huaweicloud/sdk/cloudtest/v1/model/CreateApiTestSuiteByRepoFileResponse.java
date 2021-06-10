package com.huaweicloud.sdk.cloudtest.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class CreateApiTestSuiteByRepoFileResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="testsuite_id")
    
    private String testsuiteId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="testcase_ids")
    
    private List<String> testcaseIds = null;
    
    public CreateApiTestSuiteByRepoFileResponse withTestsuiteId(String testsuiteId) {
        this.testsuiteId = testsuiteId;
        return this;
    }

    


    /**
     * 生成的测试套的id
     * @return testsuiteId
     */
    public String getTestsuiteId() {
        return testsuiteId;
    }

    public void setTestsuiteId(String testsuiteId) {
        this.testsuiteId = testsuiteId;
    }

    

    public CreateApiTestSuiteByRepoFileResponse withTestcaseIds(List<String> testcaseIds) {
        this.testcaseIds = testcaseIds;
        return this;
    }

    
    public CreateApiTestSuiteByRepoFileResponse addTestcaseIdsItem(String testcaseIdsItem) {
        if(this.testcaseIds == null) {
            this.testcaseIds = new ArrayList<>();
        }
        this.testcaseIds.add(testcaseIdsItem);
        return this;
    }

    public CreateApiTestSuiteByRepoFileResponse withTestcaseIds(Consumer<List<String>> testcaseIdsSetter) {
        if(this.testcaseIds == null) {
            this.testcaseIds = new ArrayList<>();
        }
        testcaseIdsSetter.accept(this.testcaseIds);
        return this;
    }

    /**
     * 生成的测试用例id列表
     * @return testcaseIds
     */
    public List<String> getTestcaseIds() {
        return testcaseIds;
    }

    public void setTestcaseIds(List<String> testcaseIds) {
        this.testcaseIds = testcaseIds;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateApiTestSuiteByRepoFileResponse createApiTestSuiteByRepoFileResponse = (CreateApiTestSuiteByRepoFileResponse) o;
        return Objects.equals(this.testsuiteId, createApiTestSuiteByRepoFileResponse.testsuiteId) &&
            Objects.equals(this.testcaseIds, createApiTestSuiteByRepoFileResponse.testcaseIds);
    }
    @Override
    public int hashCode() {
        return Objects.hash(testsuiteId, testcaseIds);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateApiTestSuiteByRepoFileResponse {\n");
        sb.append("    testsuiteId: ").append(toIndentedString(testsuiteId)).append("\n");
        sb.append("    testcaseIds: ").append(toIndentedString(testcaseIds)).append("\n");
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

