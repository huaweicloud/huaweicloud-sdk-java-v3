package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeletefavoriteRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fav_res_id")

    private String favResId;

    public DeletefavoriteRequest withFavResId(String favResId) {
        this.favResId = favResId;
        return this;
    }

    /**
     * 收藏资源id
     * @return favResId
     */
    public String getFavResId() {
        return favResId;
    }

    public void setFavResId(String favResId) {
        this.favResId = favResId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeletefavoriteRequest deletefavoriteRequest = (DeletefavoriteRequest) o;
        return Objects.equals(this.favResId, deletefavoriteRequest.favResId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(favResId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeletefavoriteRequest {\n");
        sb.append("    favResId: ").append(toIndentedString(favResId)).append("\n");
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
