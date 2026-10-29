package com.huaweicloud.sdk.codeartscheck.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 任务列表响应。
 */
public class ShowTasksListResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "info")

    private List<TaskBasicInfo> info = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public ShowTasksListResult withInfo(List<TaskBasicInfo> info) {
        this.info = info;
        return this;
    }

    public ShowTasksListResult addInfoItem(TaskBasicInfo infoItem) {
        if (this.info == null) {
            this.info = new ArrayList<>();
        }
        this.info.add(infoItem);
        return this;
    }

    public ShowTasksListResult withInfo(Consumer<List<TaskBasicInfo>> infoSetter) {
        if (this.info == null) {
            this.info = new ArrayList<>();
        }
        infoSetter.accept(this.info);
        return this;
    }

    /**
     * **参数解释：** 任务列表。
     * @return info
     */
    public List<TaskBasicInfo> getInfo() {
        return info;
    }

    public void setInfo(List<TaskBasicInfo> info) {
        this.info = info;
    }

    public ShowTasksListResult withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * **参数解释：** 代码检查任务总数。 **取值范围：** 不涉及。
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowTasksListResult that = (ShowTasksListResult) obj;
        return Objects.equals(this.info, that.info) && Objects.equals(this.total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(info, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTasksListResult {\n");
        sb.append("    info: ").append(toIndentedString(info)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
