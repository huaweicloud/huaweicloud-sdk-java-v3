package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListAssessTaskRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "application_id")

    private String applicationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "assess_status_list")

    private List<String> assessStatusList = null;

    public ListAssessTaskRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 分页参数
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListAssessTaskRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页显示的条目数量
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListAssessTaskRequest withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * 应用id
     * @return applicationId
     */
    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public ListAssessTaskRequest withAssessStatusList(List<String> assessStatusList) {
        this.assessStatusList = assessStatusList;
        return this;
    }

    public ListAssessTaskRequest addAssessStatusListItem(String assessStatusListItem) {
        if (this.assessStatusList == null) {
            this.assessStatusList = new ArrayList<>();
        }
        this.assessStatusList.add(assessStatusListItem);
        return this;
    }

    public ListAssessTaskRequest withAssessStatusList(Consumer<List<String>> assessStatusListSetter) {
        if (this.assessStatusList == null) {
            this.assessStatusList = new ArrayList<>();
        }
        assessStatusListSetter.accept(this.assessStatusList);
        return this;
    }

    /**
     * 评估任务状态
     * @return assessStatusList
     */
    public List<String> getAssessStatusList() {
        return assessStatusList;
    }

    public void setAssessStatusList(List<String> assessStatusList) {
        this.assessStatusList = assessStatusList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAssessTaskRequest that = (ListAssessTaskRequest) obj;
        return Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.applicationId, that.applicationId)
            && Objects.equals(this.assessStatusList, that.assessStatusList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(offset, limit, applicationId, assessStatusList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAssessTaskRequest {\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
        sb.append("    assessStatusList: ").append(toIndentedString(assessStatusList)).append("\n");
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
