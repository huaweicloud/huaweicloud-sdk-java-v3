package com.huaweicloud.sdk.vod.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class CheckMd5DuplicationResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="is_duplicated")
    
    private Integer isDuplicated;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="asset_ids")
    
    private List<String> assetIds = null;
    
    public CheckMd5DuplicationResponse withIsDuplicated(Integer isDuplicated) {
        this.isDuplicated = isDuplicated;
        return this;
    }

    


    /**
     * 是否重复。 取值如下： - 0：表示不重复。 - 1：表示重复。
     * @return isDuplicated
     */
    public Integer getIsDuplicated() {
        return isDuplicated;
    }

    public void setIsDuplicated(Integer isDuplicated) {
        this.isDuplicated = isDuplicated;
    }

    

    public CheckMd5DuplicationResponse withAssetIds(List<String> assetIds) {
        this.assetIds = assetIds;
        return this;
    }

    
    public CheckMd5DuplicationResponse addAssetIdsItem(String assetIdsItem) {
        if(this.assetIds == null) {
            this.assetIds = new ArrayList<>();
        }
        this.assetIds.add(assetIdsItem);
        return this;
    }

    public CheckMd5DuplicationResponse withAssetIds(Consumer<List<String>> assetIdsSetter) {
        if(this.assetIds == null) {
            this.assetIds = new ArrayList<>();
        }
        assetIdsSetter.accept(this.assetIds);
        return this;
    }

    /**
     * 重复的媒资ID
     * @return assetIds
     */
    public List<String> getAssetIds() {
        return assetIds;
    }

    public void setAssetIds(List<String> assetIds) {
        this.assetIds = assetIds;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CheckMd5DuplicationResponse checkMd5DuplicationResponse = (CheckMd5DuplicationResponse) o;
        return Objects.equals(this.isDuplicated, checkMd5DuplicationResponse.isDuplicated) &&
            Objects.equals(this.assetIds, checkMd5DuplicationResponse.assetIds);
    }
    @Override
    public int hashCode() {
        return Objects.hash(isDuplicated, assetIds);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckMd5DuplicationResponse {\n");
        sb.append("    isDuplicated: ").append(toIndentedString(isDuplicated)).append("\n");
        sb.append("    assetIds: ").append(toIndentedString(assetIds)).append("\n");
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

