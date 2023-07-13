package com.huaweicloud.sdk.cloudide.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ExtensionStatistics
 */
public class ExtensionStatistics {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "install")

    private Integer install;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stars")

    private Double stars;

    public ExtensionStatistics withInstall(Integer install) {
        this.install = install;
        return this;
    }

    /**
     * 下载量
     * minimum: 0
     * maximum: 2147483647
     * @return install
     */
    public Integer getInstall() {
        return install;
    }

    public void setInstall(Integer install) {
        this.install = install;
    }

    public ExtensionStatistics withStars(Double stars) {
        this.stars = stars;
        return this;
    }

    /**
     * 评星
     * minimum: 0
     * maximum: 5
     * @return stars
     */
    public Double getStars() {
        return stars;
    }

    public void setStars(Double stars) {
        this.stars = stars;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExtensionStatistics that = (ExtensionStatistics) obj;
        return Objects.equals(this.install, that.install) && Objects.equals(this.stars, that.stars);
    }

    @Override
    public int hashCode() {
        return Objects.hash(install, stars);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExtensionStatistics {\n");
        sb.append("    install: ").append(toIndentedString(install)).append("\n");
        sb.append("    stars: ").append(toIndentedString(stars)).append("\n");
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
