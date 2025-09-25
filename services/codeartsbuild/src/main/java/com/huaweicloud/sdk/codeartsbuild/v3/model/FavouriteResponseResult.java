package com.huaweicloud.sdk.codeartsbuild.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 结果
 */
public class FavouriteResponseResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "favorite")

    private Boolean favorite;

    public FavouriteResponseResult withFavorite(Boolean favorite) {
        this.favorite = favorite;
        return this;
    }

    /**
     * 是否收藏任务
     * @return favorite
     */
    public Boolean getFavorite() {
        return favorite;
    }

    public void setFavorite(Boolean favorite) {
        this.favorite = favorite;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FavouriteResponseResult that = (FavouriteResponseResult) obj;
        return Objects.equals(this.favorite, that.favorite);
    }

    @Override
    public int hashCode() {
        return Objects.hash(favorite);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FavouriteResponseResult {\n");
        sb.append("    favorite: ").append(toIndentedString(favorite)).append("\n");
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
