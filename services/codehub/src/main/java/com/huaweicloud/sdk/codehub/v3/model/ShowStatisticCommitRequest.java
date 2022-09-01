package com.huaweicloud.sdk.codehub.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowStatisticCommitRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repository_id")

    @JacksonXmlProperty(localName = "repository_id")

    private Integer repositoryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ref_name")

    @JacksonXmlProperty(localName = "ref_name")

    private String refName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "begin_date")

    @JacksonXmlProperty(localName = "begin_date")

    private String beginDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_date")

    @JacksonXmlProperty(localName = "end_date")

    private String endDate;

    public ShowStatisticCommitRequest withRepositoryId(Integer repositoryId) {
        this.repositoryId = repositoryId;
        return this;
    }

    /**
     * 仓库短id
     * @return repositoryId
     */
    public Integer getRepositoryId() {
        return repositoryId;
    }

    public void setRepositoryId(Integer repositoryId) {
        this.repositoryId = repositoryId;
    }

    public ShowStatisticCommitRequest withRefName(String refName) {
        this.refName = refName;
        return this;
    }

    /**
     * 分支名称
     * @return refName
     */
    public String getRefName() {
        return refName;
    }

    public void setRefName(String refName) {
        this.refName = refName;
    }

    public ShowStatisticCommitRequest withBeginDate(String beginDate) {
        this.beginDate = beginDate;
        return this;
    }

    /**
     * 起始提交日期,格式为yyyy-MM-dd
     * @return beginDate
     */
    public String getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(String beginDate) {
        this.beginDate = beginDate;
    }

    public ShowStatisticCommitRequest withEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * 终止提交日期,格式为yyyy-MM-dd（begin_date和end_date时间间隔不超过60天）
     * @return endDate
     */
    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowStatisticCommitRequest showStatisticCommitRequest = (ShowStatisticCommitRequest) o;
        return Objects.equals(this.repositoryId, showStatisticCommitRequest.repositoryId)
            && Objects.equals(this.refName, showStatisticCommitRequest.refName)
            && Objects.equals(this.beginDate, showStatisticCommitRequest.beginDate)
            && Objects.equals(this.endDate, showStatisticCommitRequest.endDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(repositoryId, refName, beginDate, endDate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowStatisticCommitRequest {\n");
        sb.append("    repositoryId: ").append(toIndentedString(repositoryId)).append("\n");
        sb.append("    refName: ").append(toIndentedString(refName)).append("\n");
        sb.append("    beginDate: ").append(toIndentedString(beginDate)).append("\n");
        sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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
