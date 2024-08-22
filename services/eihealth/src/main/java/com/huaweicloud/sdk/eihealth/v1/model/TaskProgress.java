package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 任务进度
 */
public class TaskProgress {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "overall")

    private Float overall;

    public TaskProgress withOverall(Float overall) {
        this.overall = overall;
        return this;
    }

    /**
     * 整体进度
     * minimum: 0
     * maximum: 1
     * @return overall
     */
    public Float getOverall() {
        return overall;
    }

    public void setOverall(Float overall) {
        this.overall = overall;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TaskProgress that = (TaskProgress) obj;
        return Objects.equals(this.overall, that.overall);
    }

    @Override
    public int hashCode() {
        return Objects.hash(overall);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskProgress {\n");
        sb.append("    overall: ").append(toIndentedString(overall)).append("\n");
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
