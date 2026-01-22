package com.huaweicloud.sdk.css.v1.model;

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
public class ListYmlsJobResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "configList")

    private List<ConfigListRsp> configList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "totalSize")

    private Integer totalSize;

    public ListYmlsJobResponse withConfigList(List<ConfigListRsp> configList) {
        this.configList = configList;
        return this;
    }

    public ListYmlsJobResponse addConfigListItem(ConfigListRsp configListItem) {
        if (this.configList == null) {
            this.configList = new ArrayList<>();
        }
        this.configList.add(configListItem);
        return this;
    }

    public ListYmlsJobResponse withConfigList(Consumer<List<ConfigListRsp>> configListSetter) {
        if (this.configList == null) {
            this.configList = new ArrayList<>();
        }
        configListSetter.accept(this.configList);
        return this;
    }

    /**
     * 历史修改配置列表。
     * @return configList
     */
    public List<ConfigListRsp> getConfigList() {
        return configList;
    }

    public void setConfigList(List<ConfigListRsp> configList) {
        this.configList = configList;
    }

    public ListYmlsJobResponse withTotalSize(Integer totalSize) {
        this.totalSize = totalSize;
        return this;
    }

    /**
     * **参数解释**： 配置任务数量。 **取值范围**： 不涉及
     * @return totalSize
     */
    public Integer getTotalSize() {
        return totalSize;
    }

    public void setTotalSize(Integer totalSize) {
        this.totalSize = totalSize;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListYmlsJobResponse that = (ListYmlsJobResponse) obj;
        return Objects.equals(this.configList, that.configList) && Objects.equals(this.totalSize, that.totalSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(configList, totalSize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListYmlsJobResponse {\n");
        sb.append("    configList: ").append(toIndentedString(configList)).append("\n");
        sb.append("    totalSize: ").append(toIndentedString(totalSize)).append("\n");
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
