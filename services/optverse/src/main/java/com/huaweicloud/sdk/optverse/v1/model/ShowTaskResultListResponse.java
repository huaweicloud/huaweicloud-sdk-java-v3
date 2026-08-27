package com.huaweicloud.sdk.optverse.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowTaskResultListResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "meta_start_at")

    private Long metaStartAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "meta_finish_at")

    private Long metaFinishAt;

    public ShowTaskResultListResponse withMetaStartAt(Long metaStartAt) {
        this.metaStartAt = metaStartAt;
        return this;
    }

    /**
     * **参数解释**： 演化任务启动时间,单位毫秒。 **约束限制**： 不涉及 **取值范围**： 取值范围[0,9999999999999]。 **默认取值**： 不涉及 
     * minimum: 0
     * maximum: 9999999999999
     * @return metaStartAt
     */
    public Long getMetaStartAt() {
        return metaStartAt;
    }

    public void setMetaStartAt(Long metaStartAt) {
        this.metaStartAt = metaStartAt;
    }

    public ShowTaskResultListResponse withMetaFinishAt(Long metaFinishAt) {
        this.metaFinishAt = metaFinishAt;
        return this;
    }

    /**
     * **参数解释**： 演化任务完成时间,单位毫秒。 **约束限制**： 不涉及 **取值范围**： 取值范围[0,9999999999999]。 **默认取值**： 不涉及 
     * minimum: 0
     * maximum: 9999999999999
     * @return metaFinishAt
     */
    public Long getMetaFinishAt() {
        return metaFinishAt;
    }

    public void setMetaFinishAt(Long metaFinishAt) {
        this.metaFinishAt = metaFinishAt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowTaskResultListResponse that = (ShowTaskResultListResponse) obj;
        return Objects.equals(this.metaStartAt, that.metaStartAt)
            && Objects.equals(this.metaFinishAt, that.metaFinishAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(metaStartAt, metaFinishAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTaskResultListResponse {\n");
        sb.append("    metaStartAt: ").append(toIndentedString(metaStartAt)).append("\n");
        sb.append("    metaFinishAt: ").append(toIndentedString(metaFinishAt)).append("\n");
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
