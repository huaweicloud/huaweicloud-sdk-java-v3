package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CollectWdrSnapshotRequestBody
 */
public class CollectWdrSnapshotRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "wdr_type")

    private List<String> wdrType = null;

    public CollectWdrSnapshotRequestBody withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * **参数解释**： 快照开始时间。 **约束限制**： 格式为“yyyy-mm-ddThh:mm:ssZ”。其中，T指某个时间的开始；Z指时区偏移量，例如北京时间偏移显示为+0800。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public CollectWdrSnapshotRequestBody withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * **参数解释**： 快照结束时间。 **约束限制**： 格式为“yyyy-mm-ddThh:mm:ssZ”。其中，T指某个时间的开始；Z指时区偏移量，例如北京时间偏移显示为+0800。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public CollectWdrSnapshotRequestBody withWdrType(List<String> wdrType) {
        this.wdrType = wdrType;
        return this;
    }

    public CollectWdrSnapshotRequestBody addWdrTypeItem(String wdrTypeItem) {
        if (this.wdrType == null) {
            this.wdrType = new ArrayList<>();
        }
        this.wdrType.add(wdrTypeItem);
        return this;
    }

    public CollectWdrSnapshotRequestBody withWdrType(Consumer<List<String>> wdrTypeSetter) {
        if (this.wdrType == null) {
            this.wdrType = new ArrayList<>();
        }
        wdrTypeSetter.accept(this.wdrType);
        return this;
    }

    /**
     * **参数解释**： 采集类型，包括实例级和组件级。 **约束限制**： 实例级则需要输入\"cluster\",组件级则需要输入组件ID。实例级和组件级无法同时输入。
     * @return wdrType
     */
    public List<String> getWdrType() {
        return wdrType;
    }

    public void setWdrType(List<String> wdrType) {
        this.wdrType = wdrType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CollectWdrSnapshotRequestBody that = (CollectWdrSnapshotRequestBody) obj;
        return Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.wdrType, that.wdrType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startTime, endTime, wdrType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CollectWdrSnapshotRequestBody {\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    wdrType: ").append(toIndentedString(wdrType)).append("\n");
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
