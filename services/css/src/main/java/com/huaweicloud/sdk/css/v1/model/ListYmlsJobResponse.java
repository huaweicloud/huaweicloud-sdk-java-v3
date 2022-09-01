package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
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

    @JacksonXmlProperty(localName = "configList")

    private List<ConfigListRsp> configList = null;

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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListYmlsJobResponse listYmlsJobResponse = (ListYmlsJobResponse) o;
        return Objects.equals(this.configList, listYmlsJobResponse.configList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(configList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListYmlsJobResponse {\n");
        sb.append("    configList: ").append(toIndentedString(configList)).append("\n");
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
