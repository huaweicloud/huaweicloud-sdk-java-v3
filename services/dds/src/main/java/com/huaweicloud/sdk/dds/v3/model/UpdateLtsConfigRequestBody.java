package com.huaweicloud.sdk.dds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateLtsConfigRequestBody
 */
public class UpdateLtsConfigRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lts_configs")

    private List<UpdateLtsConfigRequestBodyLtsConfigs> ltsConfigs = null;

    public UpdateLtsConfigRequestBody withLtsConfigs(List<UpdateLtsConfigRequestBodyLtsConfigs> ltsConfigs) {
        this.ltsConfigs = ltsConfigs;
        return this;
    }

    public UpdateLtsConfigRequestBody addLtsConfigsItem(UpdateLtsConfigRequestBodyLtsConfigs ltsConfigsItem) {
        if (this.ltsConfigs == null) {
            this.ltsConfigs = new ArrayList<>();
        }
        this.ltsConfigs.add(ltsConfigsItem);
        return this;
    }

    public UpdateLtsConfigRequestBody withLtsConfigs(
        Consumer<List<UpdateLtsConfigRequestBodyLtsConfigs>> ltsConfigsSetter) {
        if (this.ltsConfigs == null) {
            this.ltsConfigs = new ArrayList<>();
        }
        ltsConfigsSetter.accept(this.ltsConfigs);
        return this;
    }

    /**
     * 每个Item是实例需要设置的LTS策略。
     * @return ltsConfigs
     */
    public List<UpdateLtsConfigRequestBodyLtsConfigs> getLtsConfigs() {
        return ltsConfigs;
    }

    public void setLtsConfigs(List<UpdateLtsConfigRequestBodyLtsConfigs> ltsConfigs) {
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
        UpdateLtsConfigRequestBody that = (UpdateLtsConfigRequestBody) obj;
        return Objects.equals(this.ltsConfigs, that.ltsConfigs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ltsConfigs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateLtsConfigRequestBody {\n");
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
