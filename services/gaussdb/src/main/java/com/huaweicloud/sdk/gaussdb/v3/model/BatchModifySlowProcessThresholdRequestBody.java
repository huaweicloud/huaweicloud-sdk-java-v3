package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**：  批量修改实例慢会话阈值请求体。  **约束限制**：  不涉及。
 */
public class BatchModifySlowProcessThresholdRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_ids")

    private List<String> instanceIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "slow_process_threshold")

    private Integer slowProcessThreshold;

    public BatchModifySlowProcessThresholdRequestBody withInstanceIds(List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }

    public BatchModifySlowProcessThresholdRequestBody addInstanceIdsItem(String instanceIdsItem) {
        if (this.instanceIds == null) {
            this.instanceIds = new ArrayList<>();
        }
        this.instanceIds.add(instanceIdsItem);
        return this;
    }

    public BatchModifySlowProcessThresholdRequestBody withInstanceIds(Consumer<List<String>> instanceIdsSetter) {
        if (this.instanceIds == null) {
            this.instanceIds = new ArrayList<>();
        }
        instanceIdsSetter.accept(this.instanceIds);
        return this;
    }

    /**
     * **参数解释**：  批量修改慢会话阈值的实例ID列表。实例ID只能由英文字母、数字组成，后缀为in07，长度为36个字符。  获取方法请参见[查询实例列表](https://support.huaweicloud.com/api-taurusdb/ListGaussMySqlInstancesUnifyStatus.html)。  **约束限制**：  列表不能为空，且列表长度小于等于100。
     * @return instanceIds
     */
    public List<String> getInstanceIds() {
        return instanceIds;
    }

    public void setInstanceIds(List<String> instanceIds) {
        this.instanceIds = instanceIds;
    }

    public BatchModifySlowProcessThresholdRequestBody withSlowProcessThreshold(Integer slowProcessThreshold) {
        this.slowProcessThreshold = slowProcessThreshold;
        return this;
    }

    /**
     * **参数解释**：  实例慢会话阈值。单位为秒。  **约束限制**：   不涉及。  **取值范围**：  1-86400。  **默认取值**：  不涉及。
     * @return slowProcessThreshold
     */
    public Integer getSlowProcessThreshold() {
        return slowProcessThreshold;
    }

    public void setSlowProcessThreshold(Integer slowProcessThreshold) {
        this.slowProcessThreshold = slowProcessThreshold;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchModifySlowProcessThresholdRequestBody that = (BatchModifySlowProcessThresholdRequestBody) obj;
        return Objects.equals(this.instanceIds, that.instanceIds)
            && Objects.equals(this.slowProcessThreshold, that.slowProcessThreshold);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceIds, slowProcessThreshold);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchModifySlowProcessThresholdRequestBody {\n");
        sb.append("    instanceIds: ").append(toIndentedString(instanceIds)).append("\n");
        sb.append("    slowProcessThreshold: ").append(toIndentedString(slowProcessThreshold)).append("\n");
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
