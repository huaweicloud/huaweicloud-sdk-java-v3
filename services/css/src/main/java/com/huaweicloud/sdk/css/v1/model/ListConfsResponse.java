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
public class ListConfsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confs")

    private List<Confs> confs = null;

    public ListConfsResponse withConfs(List<Confs> confs) {
        this.confs = confs;
        return this;
    }

    public ListConfsResponse addConfsItem(Confs confsItem) {
        if (this.confs == null) {
            this.confs = new ArrayList<>();
        }
        this.confs.add(confsItem);
        return this;
    }

    public ListConfsResponse withConfs(Consumer<List<Confs>> confsSetter) {
        if (this.confs == null) {
            this.confs = new ArrayList<>();
        }
        confsSetter.accept(this.confs);
        return this;
    }

    /**
     * 配置文件列表。
     * @return confs
     */
    public List<Confs> getConfs() {
        return confs;
    }

    public void setConfs(List<Confs> confs) {
        this.confs = confs;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListConfsResponse listConfsResponse = (ListConfsResponse) o;
        return Objects.equals(this.confs, listConfsResponse.confs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(confs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListConfsResponse {\n");
        sb.append("    confs: ").append(toIndentedString(confs)).append("\n");
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
