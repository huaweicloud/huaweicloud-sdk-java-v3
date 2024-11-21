package com.huaweicloud.sdk.eihealth.v1.model;

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
public class ListFavoriteResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "favorites")

    private List<FavoriteDto> favorites = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    public ListFavoriteResponse withFavorites(List<FavoriteDto> favorites) {
        this.favorites = favorites;
        return this;
    }

    public ListFavoriteResponse addFavoritesItem(FavoriteDto favoritesItem) {
        if (this.favorites == null) {
            this.favorites = new ArrayList<>();
        }
        this.favorites.add(favoritesItem);
        return this;
    }

    public ListFavoriteResponse withFavorites(Consumer<List<FavoriteDto>> favoritesSetter) {
        if (this.favorites == null) {
            this.favorites = new ArrayList<>();
        }
        favoritesSetter.accept(this.favorites);
        return this;
    }

    /**
     * 收藏列表。
     * @return favorites
     */
    public List<FavoriteDto> getFavorites() {
        return favorites;
    }

    public void setFavorites(List<FavoriteDto> favorites) {
        this.favorites = favorites;
    }

    public ListFavoriteResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 收藏总数。
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListFavoriteResponse that = (ListFavoriteResponse) obj;
        return Objects.equals(this.favorites, that.favorites) && Objects.equals(this.count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(favorites, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFavoriteResponse {\n");
        sb.append("    favorites: ").append(toIndentedString(favorites)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
