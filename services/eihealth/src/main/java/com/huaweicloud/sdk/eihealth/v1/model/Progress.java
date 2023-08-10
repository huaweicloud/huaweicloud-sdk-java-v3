package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Progress
 */
public class Progress {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "overall")

    private Float overall;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "estimated_finish_time")

    private Long estimatedFinishTime;

    public Progress withOverall(Float overall) {
        this.overall = overall;
        return this;
    }

    /**
     * 整体进度
     * @return overall
     */
    public Float getOverall() {
        return overall;
    }

    public void setOverall(Float overall) {
        this.overall = overall;
    }

    public Progress withEstimatedFinishTime(Long estimatedFinishTime) {
        this.estimatedFinishTime = estimatedFinishTime;
        return this;
    }

    /**
     * 预计结束时间，毫秒
     * @return estimatedFinishTime
     */
    public Long getEstimatedFinishTime() {
        return estimatedFinishTime;
    }

    public void setEstimatedFinishTime(Long estimatedFinishTime) {
        this.estimatedFinishTime = estimatedFinishTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Progress that = (Progress) obj;
        return Objects.equals(this.overall, that.overall)
            && Objects.equals(this.estimatedFinishTime, that.estimatedFinishTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(overall, estimatedFinishTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Progress {\n");
        sb.append("    overall: ").append(toIndentedString(overall)).append("\n");
        sb.append("    estimatedFinishTime: ").append(toIndentedString(estimatedFinishTime)).append("\n");
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
