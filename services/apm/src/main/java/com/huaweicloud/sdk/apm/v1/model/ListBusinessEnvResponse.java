package com.huaweicloud.sdk.apm.v1.model;

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
public class ListBusinessEnvResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "env_entry_list")

    private List<EnvEntry> envEntryList = null;

    public ListBusinessEnvResponse withEnvEntryList(List<EnvEntry> envEntryList) {
        this.envEntryList = envEntryList;
        return this;
    }

    public ListBusinessEnvResponse addEnvEntryListItem(EnvEntry envEntryListItem) {
        if (this.envEntryList == null) {
            this.envEntryList = new ArrayList<>();
        }
        this.envEntryList.add(envEntryListItem);
        return this;
    }

    public ListBusinessEnvResponse withEnvEntryList(Consumer<List<EnvEntry>> envEntryListSetter) {
        if (this.envEntryList == null) {
            this.envEntryList = new ArrayList<>();
        }
        envEntryListSetter.accept(this.envEntryList);
        return this;
    }

    /**
     * 环境列表。
     * @return envEntryList
     */
    public List<EnvEntry> getEnvEntryList() {
        return envEntryList;
    }

    public void setEnvEntryList(List<EnvEntry> envEntryList) {
        this.envEntryList = envEntryList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListBusinessEnvResponse listBusinessEnvResponse = (ListBusinessEnvResponse) o;
        return Objects.equals(this.envEntryList, listBusinessEnvResponse.envEntryList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(envEntryList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListBusinessEnvResponse {\n");
        sb.append("    envEntryList: ").append(toIndentedString(envEntryList)).append("\n");
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
