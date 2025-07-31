package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 查询配置信息请求体
 */
public class ListProjectConfigsRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config_name_list")

    private List<String> configNameList = null;

    public ListProjectConfigsRequestBody withConfigNameList(List<String> configNameList) {
        this.configNameList = configNameList;
        return this;
    }

    public ListProjectConfigsRequestBody addConfigNameListItem(String configNameListItem) {
        if (this.configNameList == null) {
            this.configNameList = new ArrayList<>();
        }
        this.configNameList.add(configNameListItem);
        return this;
    }

    public ListProjectConfigsRequestBody withConfigNameList(Consumer<List<String>> configNameListSetter) {
        if (this.configNameList == null) {
            this.configNameList = new ArrayList<>();
        }
        configNameListSetter.accept(this.configNameList);
        return this;
    }

    /**
     * 配置名称列表
     * @return configNameList
     */
    public List<String> getConfigNameList() {
        return configNameList;
    }

    public void setConfigNameList(List<String> configNameList) {
        this.configNameList = configNameList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListProjectConfigsRequestBody that = (ListProjectConfigsRequestBody) obj;
        return Objects.equals(this.configNameList, that.configNameList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(configNameList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListProjectConfigsRequestBody {\n");
        sb.append("    configNameList: ").append(toIndentedString(configNameList)).append("\n");
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
