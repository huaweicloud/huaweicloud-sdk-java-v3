package com.huaweicloud.sdk.asm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AccessLogging
 */
public class AccessLogging {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lts")

    private List<LtsConfig> lts = null;

    public AccessLogging withLts(List<LtsConfig> lts) {
        this.lts = lts;
        return this;
    }

    public AccessLogging addLtsItem(LtsConfig ltsItem) {
        if (this.lts == null) {
            this.lts = new ArrayList<>();
        }
        this.lts.add(ltsItem);
        return this;
    }

    public AccessLogging withLts(Consumer<List<LtsConfig>> ltsSetter) {
        if (this.lts == null) {
            this.lts = new ArrayList<>();
        }
        ltsSetter.accept(this.lts);
        return this;
    }

    /**
     * LTS配置
     * @return lts
     */
    public List<LtsConfig> getLts() {
        return lts;
    }

    public void setLts(List<LtsConfig> lts) {
        this.lts = lts;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AccessLogging that = (AccessLogging) obj;
        return Objects.equals(this.lts, that.lts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lts);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccessLogging {\n");
        sb.append("    lts: ").append(toIndentedString(lts)).append("\n");
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
