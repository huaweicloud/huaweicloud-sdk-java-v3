package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AnimationItem
 */
public class AnimationItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "animation_asset_id")

    private String animationAssetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timestamp")

    private Float timestamp;

    public AnimationItem withAnimationAssetId(String animationAssetId) {
        this.animationAssetId = animationAssetId;
        return this;
    }

    /**
     * 动作资产ID。
     * @return animationAssetId
     */
    public String getAnimationAssetId() {
        return animationAssetId;
    }

    public void setAnimationAssetId(String animationAssetId) {
        this.animationAssetId = animationAssetId;
    }

    public AnimationItem withTimestamp(Float timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * 时间戳，相对时间戳，单位S，保留3位小数。
     * minimum: 0
     * maximum: 7.2E+3
     * @return timestamp
     */
    public Float getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Float timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AnimationItem animationItem = (AnimationItem) o;
        return Objects.equals(this.animationAssetId, animationItem.animationAssetId)
            && Objects.equals(this.timestamp, animationItem.timestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(animationAssetId, timestamp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AnimationItem {\n");
        sb.append("    animationAssetId: ").append(toIndentedString(animationAssetId)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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
