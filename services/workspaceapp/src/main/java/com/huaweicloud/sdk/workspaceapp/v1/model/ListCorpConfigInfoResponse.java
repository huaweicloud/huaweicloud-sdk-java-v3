package com.huaweicloud.sdk.workspaceapp.v1.model;

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
public class ListCorpConfigInfoResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config_infos")

    private List<CorpConfigInfo> configInfos = null;

    public ListCorpConfigInfoResponse withConfigInfos(List<CorpConfigInfo> configInfos) {
        this.configInfos = configInfos;
        return this;
    }

    public ListCorpConfigInfoResponse addConfigInfosItem(CorpConfigInfo configInfosItem) {
        if (this.configInfos == null) {
            this.configInfos = new ArrayList<>();
        }
        this.configInfos.add(configInfosItem);
        return this;
    }

    public ListCorpConfigInfoResponse withConfigInfos(Consumer<List<CorpConfigInfo>> configInfosSetter) {
        if (this.configInfos == null) {
            this.configInfos = new ArrayList<>();
        }
        configInfosSetter.accept(this.configInfos);
        return this;
    }

    /**
     * 批量配置项列表。
     * @return configInfos
     */
    public List<CorpConfigInfo> getConfigInfos() {
        return configInfos;
    }

    public void setConfigInfos(List<CorpConfigInfo> configInfos) {
        this.configInfos = configInfos;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListCorpConfigInfoResponse that = (ListCorpConfigInfoResponse) obj;
        return Objects.equals(this.configInfos, that.configInfos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(configInfos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCorpConfigInfoResponse {\n");
        sb.append("    configInfos: ").append(toIndentedString(configInfos)).append("\n");
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
