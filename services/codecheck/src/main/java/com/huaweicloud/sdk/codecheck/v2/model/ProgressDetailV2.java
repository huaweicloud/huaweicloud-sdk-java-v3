package com.huaweicloud.sdk.codecheck.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ProgressDetailV2
 */
public class ProgressDetailV2 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ratio")

    private String ratio;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "info")

    private String info;

    public ProgressDetailV2 withRatio(String ratio) {
        this.ratio = ratio;
        return this;
    }

    /**
     * 进度百分比
     * @return ratio
     */
    public String getRatio() {
        return ratio;
    }

    public void setRatio(String ratio) {
        this.ratio = ratio;
    }

    public ProgressDetailV2 withInfo(String info) {
        this.info = info;
        return this;
    }

    /**
     * 中文信息
     * @return info
     */
    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProgressDetailV2 progressDetailV2 = (ProgressDetailV2) o;
        return Objects.equals(this.ratio, progressDetailV2.ratio) && Objects.equals(this.info, progressDetailV2.info);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ratio, info);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProgressDetailV2 {\n");
        sb.append("    ratio: ").append(toIndentedString(ratio)).append("\n");
        sb.append("    info: ").append(toIndentedString(info)).append("\n");
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
