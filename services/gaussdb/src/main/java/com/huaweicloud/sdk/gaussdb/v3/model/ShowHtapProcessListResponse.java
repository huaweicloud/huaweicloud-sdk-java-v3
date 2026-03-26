package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowHtapProcessListResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_list")

    private List<HtapProcessInfo> processList = null;

    public ShowHtapProcessListResponse withProcessList(List<HtapProcessInfo> processList) {
        this.processList = processList;
        return this;
    }

    public ShowHtapProcessListResponse addProcessListItem(HtapProcessInfo processListItem) {
        if (this.processList == null) {
            this.processList = new ArrayList<>();
        }
        this.processList.add(processListItem);
        return this;
    }

    public ShowHtapProcessListResponse withProcessList(Consumer<List<HtapProcessInfo>> processListSetter) {
        if (this.processList == null) {
            this.processList = new ArrayList<>();
        }
        processListSetter.accept(this.processList);
        return this;
    }

    /**
     * **参数解释**：  HTAP标准版查询的会话信息。  **默认值**：  不涉及。
     * @return processList
     */
    public List<HtapProcessInfo> getProcessList() {
        return processList;
    }

    public void setProcessList(List<HtapProcessInfo> processList) {
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
        ShowHtapProcessListResponse that = (ShowHtapProcessListResponse) obj;
        return Objects.equals(this.processList, that.processList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(processList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowHtapProcessListResponse {\n");
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
