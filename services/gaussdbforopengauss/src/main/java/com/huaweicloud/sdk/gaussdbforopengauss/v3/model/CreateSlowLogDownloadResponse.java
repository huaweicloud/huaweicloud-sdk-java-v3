package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

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
public class CreateSlowLogDownloadResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "list")

    private List<SlowLogDownloadInfo> list = null;

    public CreateSlowLogDownloadResponse withList(List<SlowLogDownloadInfo> list) {
        this.list = list;
        return this;
    }

    public CreateSlowLogDownloadResponse addListItem(SlowLogDownloadInfo listItem) {
        if (this.list == null) {
            this.list = new ArrayList<>();
        }
        this.list.add(listItem);
        return this;
    }

    public CreateSlowLogDownloadResponse withList(Consumer<List<SlowLogDownloadInfo>> listSetter) {
        if (this.list == null) {
            this.list = new ArrayList<>();
        }
        listSetter.accept(this.list);
        return this;
    }

    /**
     * 慢日志下载信息列表
     * @return list
     */
    public List<SlowLogDownloadInfo> getList() {
        return list;
    }

    public void setList(List<SlowLogDownloadInfo> list) {
        this.list = list;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateSlowLogDownloadResponse that = (CreateSlowLogDownloadResponse) obj;
        return Objects.equals(this.list, that.list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(list);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSlowLogDownloadResponse {\n");
        sb.append("    list: ").append(toIndentedString(list)).append("\n");
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
