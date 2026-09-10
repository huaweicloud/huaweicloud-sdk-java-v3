package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 当前分析任务的进度
 */
public class OpsTaskProgress {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "progressed")

    private Integer progressed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "progress_rate")

    private Integer progressRate;

    public OpsTaskProgress withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * **参数解释：**  对于周期任务，表示总计计划执行的次数。 对于运行中的单次任务，值为计划要分析的trace条数。 对还未开始运行的单次任务，值为null。 **取值范围：** null或0-5000
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public OpsTaskProgress withProgressed(Integer progressed) {
        this.progressed = progressed;
        return this;
    }

    /**
     * **参数解释：**  对于周期任务，表示已经处理的次数。 对于运行中的单次任务，值为计划要已分析的trace条数。 对还未开始运行的单次任务，值为0。 **取值范围：** 0-5000
     * @return progressed
     */
    public Integer getProgressed() {
        return progressed;
    }

    public void setProgressed(Integer progressed) {
        this.progressed = progressed;
    }

    public OpsTaskProgress withProgressRate(Integer progressRate) {
        this.progressRate = progressRate;
        return this;
    }

    /**
     * **参数解释：**  进度百分比 **取值范围：**  0-100
     * @return progressRate
     */
    public Integer getProgressRate() {
        return progressRate;
    }

    public void setProgressRate(Integer progressRate) {
        this.progressRate = progressRate;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OpsTaskProgress that = (OpsTaskProgress) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.progressed, that.progressed)
            && Objects.equals(this.progressRate, that.progressRate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, progressed, progressRate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpsTaskProgress {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    progressed: ").append(toIndentedString(progressed)).append("\n");
        sb.append("    progressRate: ").append(toIndentedString(progressRate)).append("\n");
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
