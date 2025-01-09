package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 通用音视频旁路。
 */
public class PoliciesSeamless {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "seamless_enable")

    private Boolean seamlessEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "options")

    private PoliciesSeamlessOptions options;

    public PoliciesSeamless withSeamlessEnable(Boolean seamlessEnable) {
        this.seamlessEnable = seamlessEnable;
        return this;
    }

    /**
     * 是否开启通用音视频开关。取值为： false：表示关闭。 true：表示开启。
     * @return seamlessEnable
     */
    public Boolean getSeamlessEnable() {
        return seamlessEnable;
    }

    public void setSeamlessEnable(Boolean seamlessEnable) {
        this.seamlessEnable = seamlessEnable;
    }

    public PoliciesSeamless withOptions(PoliciesSeamlessOptions options) {
        this.options = options;
        return this;
    }

    public PoliciesSeamless withOptions(Consumer<PoliciesSeamlessOptions> optionsSetter) {
        if (this.options == null) {
            this.options = new PoliciesSeamlessOptions();
            optionsSetter.accept(this.options);
        }

        return this;
    }

    /**
     * Get options
     * @return options
     */
    public PoliciesSeamlessOptions getOptions() {
        return options;
    }

    public void setOptions(PoliciesSeamlessOptions options) {
        this.options = options;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PoliciesSeamless that = (PoliciesSeamless) obj;
        return Objects.equals(this.seamlessEnable, that.seamlessEnable) && Objects.equals(this.options, that.options);
    }

    @Override
    public int hashCode() {
        return Objects.hash(seamlessEnable, options);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PoliciesSeamless {\n");
        sb.append("    seamlessEnable: ").append(toIndentedString(seamlessEnable)).append("\n");
        sb.append("    options: ").append(toIndentedString(options)).append("\n");
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
