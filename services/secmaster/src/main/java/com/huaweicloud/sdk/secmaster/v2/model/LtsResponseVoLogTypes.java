package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 日志类型列表
 */
public class LtsResponseVoLogTypes {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secm_lts_")

    private List<String> secmLts = null;

    public LtsResponseVoLogTypes withSecmLts(List<String> secmLts) {
        this.secmLts = secmLts;
        return this;
    }

    public LtsResponseVoLogTypes addSecmLtsItem(String secmLtsItem) {
        if (this.secmLts == null) {
            this.secmLts = new ArrayList<>();
        }
        this.secmLts.add(secmLtsItem);
        return this;
    }

    public LtsResponseVoLogTypes withSecmLts(Consumer<List<String>> secmLtsSetter) {
        if (this.secmLts == null) {
            this.secmLts = new ArrayList<>();
        }
        secmLtsSetter.accept(this.secmLts);
        return this;
    }

    /**
     * 类型前缀
     * @return secmLts
     */
    public List<String> getSecmLts() {
        return secmLts;
    }

    public void setSecmLts(List<String> secmLts) {
        this.secmLts = secmLts;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LtsResponseVoLogTypes that = (LtsResponseVoLogTypes) obj;
        return Objects.equals(this.secmLts, that.secmLts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(secmLts);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LtsResponseVoLogTypes {\n");
        sb.append("    secmLts: ").append(toIndentedString(secmLts)).append("\n");
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
