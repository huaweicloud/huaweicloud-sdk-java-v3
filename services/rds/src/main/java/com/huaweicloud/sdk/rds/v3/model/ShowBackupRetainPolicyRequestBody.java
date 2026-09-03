package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 查询备份保留策略的请求体
 */
public class ShowBackupRetainPolicyRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instanceids")

    private List<String> instanceids = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_status")

    private String instanceStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "begin_time")

    private String beginTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    public ShowBackupRetainPolicyRequestBody withInstanceids(List<String> instanceids) {
        this.instanceids = instanceids;
        return this;
    }

    public ShowBackupRetainPolicyRequestBody addInstanceidsItem(String instanceidsItem) {
        if (this.instanceids == null) {
            this.instanceids = new ArrayList<>();
        }
        this.instanceids.add(instanceidsItem);
        return this;
    }

    public ShowBackupRetainPolicyRequestBody withInstanceids(Consumer<List<String>> instanceidsSetter) {
        if (this.instanceids == null) {
            this.instanceids = new ArrayList<>();
        }
        instanceidsSetter.accept(this.instanceids);
        return this;
    }

    /**
     * **参数解释**：  实例ID列表，实例ID是实例的唯一标识。  **约束限制**：  不涉及。  **取值范围**：  实例ID只能由英文字母、数字组成，长度为36个字符。  **默认取值**：  不涉及。
     * @return instanceids
     */
    public List<String> getInstanceids() {
        return instanceids;
    }

    public void setInstanceids(List<String> instanceids) {
        this.instanceids = instanceids;
    }

    public ShowBackupRetainPolicyRequestBody withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * **参数解释**  索引位置，偏移量。  **约束限制**  从第一条数据偏移offset条数据后开始查询，默认为0（偏移0条数据，表示从第一条数据开始查询），必须为数字，不能为负数。  **取值范围**  大于等于0的整数。  **默认取值**  0
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ShowBackupRetainPolicyRequestBody withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数解释**  查询记录数。  **约束限制**  不能为负数。  **取值范围**  最小值为1，最大值为100。  **默认取值**  10
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ShowBackupRetainPolicyRequestBody withInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
        return this;
    }

    /**
     * **参数解释**：  实例状态  **约束限制**：  不涉及。  **取值范围**：  normal、deleted  **默认取值**：  不涉及。
     * @return instanceStatus
     */
    public String getInstanceStatus() {
        return instanceStatus;
    }

    public void setInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
    }

    public ShowBackupRetainPolicyRequestBody withBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }

    /**
     * **参数解释**  查询开始时间。时间指实例的删除时间。  **约束限制**  “begin_time”有值时，“end_time”必选。 “begin_time”有值时，查询实例状态为已删除的实例。  **取值范围**  格式为“yyyy-mm-ddThh:mm:ss±HH:mm”。  其中，T指某个时间的开始；±HH:mm指时区偏移量，例如北京时间偏移显示为+08:00。  **默认取值**  不涉及。
     * @return beginTime
     */
    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public ShowBackupRetainPolicyRequestBody withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * **参数解释**  查询结束时间。时间指实例的删除时间  **约束限制**  “end_time”有值时，“begin_time”必选。 “end_time”有值时，查询实例状态为已删除的实例。  **取值范围**  格式为“yyyy-mm-ddThh:mm:ss±HH:mm”，且大于查询开始时间。  其中，T指某个时间的开始；±HH:mm指时区偏移量，例如北京时间偏移显示为+08:00。  **默认取值**  不涉及。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowBackupRetainPolicyRequestBody that = (ShowBackupRetainPolicyRequestBody) obj;
        return Objects.equals(this.instanceids, that.instanceids) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.instanceStatus, that.instanceStatus)
            && Objects.equals(this.beginTime, that.beginTime) && Objects.equals(this.endTime, that.endTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceids, offset, limit, instanceStatus, beginTime, endTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowBackupRetainPolicyRequestBody {\n");
        sb.append("    instanceids: ").append(toIndentedString(instanceids)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    instanceStatus: ").append(toIndentedString(instanceStatus)).append("\n");
        sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
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
