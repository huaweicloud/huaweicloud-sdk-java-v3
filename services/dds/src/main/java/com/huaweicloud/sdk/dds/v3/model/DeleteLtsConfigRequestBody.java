package com.huaweicloud.sdk.dds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DeleteLtsConfigRequestBody
 */
public class DeleteLtsConfigRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lts_configs")

    private List<DeleteLtsConfigRequestBodyLtsConfigs> ltsConfigs = null;

    public DeleteLtsConfigRequestBody withLtsConfigs(List<DeleteLtsConfigRequestBodyLtsConfigs> ltsConfigs) {
        this.ltsConfigs = ltsConfigs;
        return this;
    }

    public DeleteLtsConfigRequestBody addLtsConfigsItem(DeleteLtsConfigRequestBodyLtsConfigs ltsConfigsItem) {
        if (this.ltsConfigs == null) {
            this.ltsConfigs = new ArrayList<>();
        }
        this.ltsConfigs.add(ltsConfigsItem);
        return this;
    }

    public DeleteLtsConfigRequestBody withLtsConfigs(
        Consumer<List<DeleteLtsConfigRequestBodyLtsConfigs>> ltsConfigsSetter) {
        if (this.ltsConfigs == null) {
            this.ltsConfigs = new ArrayList<>();
        }
        ltsConfigsSetter.accept(this.ltsConfigs);
        return this;
    }

    /**
     * 需要解除的LTS配置列表，一个实例解除多种日志配置需要填写多个item。
     * @return ltsConfigs
     */
    public List<DeleteLtsConfigRequestBodyLtsConfigs> getLtsConfigs() {
        return ltsConfigs;
    }

    public void setLtsConfigs(List<DeleteLtsConfigRequestBodyLtsConfigs> ltsConfigs) {
        this.ltsConfigs = ltsConfigs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteLtsConfigRequestBody that = (DeleteLtsConfigRequestBody) obj;
        return Objects.equals(this.ltsConfigs, that.ltsConfigs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ltsConfigs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteLtsConfigRequestBody {\n");
        sb.append("    ltsConfigs: ").append(toIndentedString(ltsConfigs)).append("\n");
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
