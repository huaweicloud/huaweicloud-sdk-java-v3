package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 修改发布详情。
 */
public class BatchModifyPublicationsRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publication_ids")

    private List<String> publicationIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_schedule")

    private OperateUsedJobSchedule jobSchedule;

    public BatchModifyPublicationsRequestBody withPublicationIds(List<String> publicationIds) {
        this.publicationIds = publicationIds;
        return this;
    }

    public BatchModifyPublicationsRequestBody addPublicationIdsItem(String publicationIdsItem) {
        if (this.publicationIds == null) {
            this.publicationIds = new ArrayList<>();
        }
        this.publicationIds.add(publicationIdsItem);
        return this;
    }

    public BatchModifyPublicationsRequestBody withPublicationIds(Consumer<List<String>> publicationIdsSetter) {
        if (this.publicationIds == null) {
            this.publicationIds = new ArrayList<>();
        }
        publicationIdsSetter.accept(this.publicationIds);
        return this;
    }

    /**
     * 修改的发布id列表。
     * @return publicationIds
     */
    public List<String> getPublicationIds() {
        return publicationIds;
    }

    public void setPublicationIds(List<String> publicationIds) {
        this.publicationIds = publicationIds;
    }

    public BatchModifyPublicationsRequestBody withJobSchedule(OperateUsedJobSchedule jobSchedule) {
        this.jobSchedule = jobSchedule;
        return this;
    }

    public BatchModifyPublicationsRequestBody withJobSchedule(Consumer<OperateUsedJobSchedule> jobScheduleSetter) {
        if (this.jobSchedule == null) {
            this.jobSchedule = new OperateUsedJobSchedule();
            jobScheduleSetter.accept(this.jobSchedule);
        }

        return this;
    }

    /**
     * Get jobSchedule
     * @return jobSchedule
     */
    public OperateUsedJobSchedule getJobSchedule() {
        return jobSchedule;
    }

    public void setJobSchedule(OperateUsedJobSchedule jobSchedule) {
        this.jobSchedule = jobSchedule;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchModifyPublicationsRequestBody that = (BatchModifyPublicationsRequestBody) obj;
        return Objects.equals(this.publicationIds, that.publicationIds)
            && Objects.equals(this.jobSchedule, that.jobSchedule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publicationIds, jobSchedule);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchModifyPublicationsRequestBody {\n");
        sb.append("    publicationIds: ").append(toIndentedString(publicationIds)).append("\n");
        sb.append("    jobSchedule: ").append(toIndentedString(jobSchedule)).append("\n");
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
