package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**：  删除HTAP实例会话请求体。  **约束限制**：  不涉及。
 */
public class DeleteHtapProcessReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_list")

    private List<String> processList = null;

    public DeleteHtapProcessReq withProcessList(List<String> processList) {
        this.processList = processList;
        return this;
    }

    public DeleteHtapProcessReq addProcessListItem(String processListItem) {
        if (this.processList == null) {
            this.processList = new ArrayList<>();
        }
        this.processList.add(processListItem);
        return this;
    }

    public DeleteHtapProcessReq withProcessList(Consumer<List<String>> processListSetter) {
        if (this.processList == null) {
            this.processList = new ArrayList<>();
        }
        processListSetter.accept(this.processList);
        return this;
    }

    /**
     * **参数解释**：  HTAP实例会话ID列表，可通过调用[查询HTAP实例当前会话](https://support.huaweicloud.com/api-taurusdb/ShowHtapProcessList.html)。  **约束限制**：  实例会话ID小于等于20个。  **取值范围**：  不涉及。  **默认值**：  不涉及。
     * @return processList
     */
    public List<String> getProcessList() {
        return processList;
    }

    public void setProcessList(List<String> processList) {
        this.processList = processList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteHtapProcessReq that = (DeleteHtapProcessReq) obj;
        return Objects.equals(this.processList, that.processList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(processList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteHtapProcessReq {\n");
        sb.append("    processList: ").append(toIndentedString(processList)).append("\n");
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
