package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 需求通过情况
 */
public class IssuePassDetailsVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "testing")

    private Integer testing;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "finished")

    private Integer finished;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "not_tested")

    private Integer notTested;

    public IssuePassDetailsVo withTesting(Integer testing) {
        this.testing = testing;
        return this;
    }

    /**
     * 统计测试中的需求
     * @return testing
     */
    public Integer getTesting() {
        return testing;
    }

    public void setTesting(Integer testing) {
        this.testing = testing;
    }

    public IssuePassDetailsVo withFinished(Integer finished) {
        this.finished = finished;
        return this;
    }

    /**
     * 统计已完成的需求
     * @return finished
     */
    public Integer getFinished() {
        return finished;
    }

    public void setFinished(Integer finished) {
        this.finished = finished;
    }

    public IssuePassDetailsVo withNotTested(Integer notTested) {
        this.notTested = notTested;
        return this;
    }

    /**
     * 统计未完成的需求
     * @return notTested
     */
    public Integer getNotTested() {
        return notTested;
    }

    public void setNotTested(Integer notTested) {
        this.notTested = notTested;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IssuePassDetailsVo that = (IssuePassDetailsVo) obj;
        return Objects.equals(this.testing, that.testing) && Objects.equals(this.finished, that.finished)
            && Objects.equals(this.notTested, that.notTested);
    }

    @Override
    public int hashCode() {
        return Objects.hash(testing, finished, notTested);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IssuePassDetailsVo {\n");
        sb.append("    testing: ").append(toIndentedString(testing)).append("\n");
        sb.append("    finished: ").append(toIndentedString(finished)).append("\n");
        sb.append("    notTested: ").append(toIndentedString(notTested)).append("\n");
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
