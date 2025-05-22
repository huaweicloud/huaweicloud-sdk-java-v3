package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 逻辑集群缩容请求体。 **约束限制**： 该值不能为空。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
 */
public class ClusterShrinkReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shrink_number")

    private Integer shrinkNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "online")

    private Boolean online;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retry")

    private Boolean retry;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "need_agency")

    private Boolean needAgency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parallel_jobs")

    private Integer parallelJobs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "force_backup")

    private Boolean forceBackup;

    public ClusterShrinkReq withShrinkNumber(Integer shrinkNumber) {
        this.shrinkNumber = shrinkNumber;
        return this;
    }

    /**
     * **参数解释**：  缩容节点个数。  **约束限制**：  该值不能为空。  **取值范围**：  大于0的整数。  **默认取值**：  不涉及。
     * @return shrinkNumber
     */
    public Integer getShrinkNumber() {
        return shrinkNumber;
    }

    public void setShrinkNumber(Integer shrinkNumber) {
        this.shrinkNumber = shrinkNumber;
    }

    public ClusterShrinkReq withOnline(Boolean online) {
        this.online = online;
        return this;
    }

    /**
     * **参数解释**：  是否是在线缩容。  **约束限制**：  不涉及。  **取值范围**：  false|true。  **默认取值**：  false。
     * @return online
     */
    public Boolean getOnline() {
        return online;
    }

    public void setOnline(Boolean online) {
        this.online = online;
    }

    public ClusterShrinkReq withRetry(Boolean retry) {
        this.retry = retry;
        return this;
    }

    /**
     * **参数解释**：  是否是缩容失败后重试。  **约束限制**：  不涉及。  **取值范围**：  false|true。  **默认取值**：  false。
     * @return retry
     */
    public Boolean getRetry() {
        return retry;
    }

    public void setRetry(Boolean retry) {
        this.retry = retry;
    }

    public ClusterShrinkReq withNeedAgency(Boolean needAgency) {
        this.needAgency = needAgency;
        return this;
    }

    /**
     * **参数解释**：  是否需要委托。  **约束限制**：  不涉及。  **取值范围**：  false或true。  **默认取值**：  false。
     * @return needAgency
     */
    public Boolean getNeedAgency() {
        return needAgency;
    }

    public void setNeedAgency(Boolean needAgency) {
        this.needAgency = needAgency;
    }

    public ClusterShrinkReq withParallelJobs(Integer parallelJobs) {
        this.parallelJobs = parallelJobs;
        return this;
    }

    /**
     * **参数解释**：  重分布并发配置数。  **约束限制**：  不涉及。  **取值范围**：  1~200。  **默认取值**：  4。
     * @return parallelJobs
     */
    public Integer getParallelJobs() {
        return parallelJobs;
    }

    public void setParallelJobs(Integer parallelJobs) {
        this.parallelJobs = parallelJobs;
    }

    public ClusterShrinkReq withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**：  类型字段，字段已废弃不再生效。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ClusterShrinkReq withForceBackup(Boolean forceBackup) {
        this.forceBackup = forceBackup;
        return this;
    }

    /**
     * **参数解释**：  操作前是否执行备份，字段已废弃不再生效。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return forceBackup
     */
    public Boolean getForceBackup() {
        return forceBackup;
    }

    public void setForceBackup(Boolean forceBackup) {
        this.forceBackup = forceBackup;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ClusterShrinkReq that = (ClusterShrinkReq) obj;
        return Objects.equals(this.shrinkNumber, that.shrinkNumber) && Objects.equals(this.online, that.online)
            && Objects.equals(this.retry, that.retry) && Objects.equals(this.needAgency, that.needAgency)
            && Objects.equals(this.parallelJobs, that.parallelJobs) && Objects.equals(this.type, that.type)
            && Objects.equals(this.forceBackup, that.forceBackup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shrinkNumber, online, retry, needAgency, parallelJobs, type, forceBackup);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClusterShrinkReq {\n");
        sb.append("    shrinkNumber: ").append(toIndentedString(shrinkNumber)).append("\n");
        sb.append("    online: ").append(toIndentedString(online)).append("\n");
        sb.append("    retry: ").append(toIndentedString(retry)).append("\n");
        sb.append("    needAgency: ").append(toIndentedString(needAgency)).append("\n");
        sb.append("    parallelJobs: ").append(toIndentedString(parallelJobs)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    forceBackup: ").append(toIndentedString(forceBackup)).append("\n");
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
