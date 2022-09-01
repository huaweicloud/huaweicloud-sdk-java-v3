package com.huaweicloud.sdk.cdm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowSubmissionsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "submissions")

    @JacksonXmlProperty(localName = "submissions")

    private List<Submission> submissions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    @JacksonXmlProperty(localName = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_no")

    @JacksonXmlProperty(localName = "page_no")

    private Integer pageNo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_size")

    @JacksonXmlProperty(localName = "page_size")

    private Integer pageSize;

    public ShowSubmissionsResponse withSubmissions(List<Submission> submissions) {
        this.submissions = submissions;
        return this;
    }

    public ShowSubmissionsResponse addSubmissionsItem(Submission submissionsItem) {
        if (this.submissions == null) {
            this.submissions = new ArrayList<>();
        }
        this.submissions.add(submissionsItem);
        return this;
    }

    public ShowSubmissionsResponse withSubmissions(Consumer<List<Submission>> submissionsSetter) {
        if (this.submissions == null) {
            this.submissions = new ArrayList<>();
        }
        submissionsSetter.accept(this.submissions);
        return this;
    }

    /**
     * 作业运行信息，详见submissions参数说明。
     * @return submissions
     */
    public List<Submission> getSubmissions() {
        return submissions;
    }

    public void setSubmissions(List<Submission> submissions) {
        this.submissions = submissions;
    }

    public ShowSubmissionsResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 查询该作业总的历史记录数。
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ShowSubmissionsResponse withPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    /**
     * 查询作业记录时，分页数。
     * @return pageNo
     */
    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public ShowSubmissionsResponse withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * 分页查询，每页返回的记录数。默认值：10。
     * @return pageSize
     */
    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowSubmissionsResponse showSubmissionsResponse = (ShowSubmissionsResponse) o;
        return Objects.equals(this.submissions, showSubmissionsResponse.submissions)
            && Objects.equals(this.total, showSubmissionsResponse.total)
            && Objects.equals(this.pageNo, showSubmissionsResponse.pageNo)
            && Objects.equals(this.pageSize, showSubmissionsResponse.pageSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(submissions, total, pageNo, pageSize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSubmissionsResponse {\n");
        sb.append("    submissions: ").append(toIndentedString(submissions)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    pageNo: ").append(toIndentedString(pageNo)).append("\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
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
