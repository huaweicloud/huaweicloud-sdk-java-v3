package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListStudyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "studies")

    private List<StudyRsp> studies = null;

    public ListStudyResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * study总数
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListStudyResponse withStudies(List<StudyRsp> studies) {
        this.studies = studies;
        return this;
    }

    public ListStudyResponse addStudiesItem(StudyRsp studiesItem) {
        if (this.studies == null) {
            this.studies = new ArrayList<>();
        }
        this.studies.add(studiesItem);
        return this;
    }

    public ListStudyResponse withStudies(Consumer<List<StudyRsp>> studiesSetter) {
        if (this.studies == null) {
            this.studies = new ArrayList<>();
        }
        studiesSetter.accept(this.studies);
        return this;
    }

    /**
     * study列表
     * @return studies
     */
    public List<StudyRsp> getStudies() {
        return studies;
    }

    public void setStudies(List<StudyRsp> studies) {
        this.studies = studies;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListStudyResponse listStudyResponse = (ListStudyResponse) o;
        return Objects.equals(this.count, listStudyResponse.count)
            && Objects.equals(this.studies, listStudyResponse.studies);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, studies);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListStudyResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    studies: ").append(toIndentedString(studies)).append("\n");
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
