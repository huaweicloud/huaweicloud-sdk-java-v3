package com.huaweicloud.sdk.workspace.v2.model;

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
public class ListScriptRecordsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "script_records")

    private List<ScriptRecordSimpleInfo> scriptRecords = null;

    public ListScriptRecordsResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 总数。
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListScriptRecordsResponse withScriptRecords(List<ScriptRecordSimpleInfo> scriptRecords) {
        this.scriptRecords = scriptRecords;
        return this;
    }

    public ListScriptRecordsResponse addScriptRecordsItem(ScriptRecordSimpleInfo scriptRecordsItem) {
        if (this.scriptRecords == null) {
            this.scriptRecords = new ArrayList<>();
        }
        this.scriptRecords.add(scriptRecordsItem);
        return this;
    }

    public ListScriptRecordsResponse withScriptRecords(Consumer<List<ScriptRecordSimpleInfo>> scriptRecordsSetter) {
        if (this.scriptRecords == null) {
            this.scriptRecords = new ArrayList<>();
        }
        scriptRecordsSetter.accept(this.scriptRecords);
        return this;
    }

    /**
     * 脚本执行记录列表。
     * @return scriptRecords
     */
    public List<ScriptRecordSimpleInfo> getScriptRecords() {
        return scriptRecords;
    }

    public void setScriptRecords(List<ScriptRecordSimpleInfo> scriptRecords) {
        this.scriptRecords = scriptRecords;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListScriptRecordsResponse that = (ListScriptRecordsResponse) obj;
        return Objects.equals(this.count, that.count) && Objects.equals(this.scriptRecords, that.scriptRecords);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, scriptRecords);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListScriptRecordsResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    scriptRecords: ").append(toIndentedString(scriptRecords)).append("\n");
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
