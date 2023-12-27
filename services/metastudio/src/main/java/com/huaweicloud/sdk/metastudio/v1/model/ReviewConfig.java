package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 内容审核配置
 */
public class ReviewConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "no_need_review")

    private Boolean noNeedReview;

    public ReviewConfig withNoNeedReview(Boolean noNeedReview) {
        this.noNeedReview = noNeedReview;
        return this;
    }

    /**
     * 免审核。 目前仅白名单用户可使用此参数，非白名单用户跟随系统策略审核。
     * @return noNeedReview
     */
    public Boolean getNoNeedReview() {
        return noNeedReview;
    }

    public void setNoNeedReview(Boolean noNeedReview) {
        this.noNeedReview = noNeedReview;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ReviewConfig that = (ReviewConfig) obj;
        return Objects.equals(this.noNeedReview, that.noNeedReview);
    }

    @Override
    public int hashCode() {
        return Objects.hash(noNeedReview);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReviewConfig {\n");
        sb.append("    noNeedReview: ").append(toIndentedString(noNeedReview)).append("\n");
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
