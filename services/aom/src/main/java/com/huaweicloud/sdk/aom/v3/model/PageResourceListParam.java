package com.huaweicloud.sdk.aom.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.aom.v3.model.WaterfallPageListParam;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * PageResourceListParam
 */
public class PageResourceListParam  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="marker")
    

    private String marker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="keywords")
    
    private Map<String, String> keywords = null;
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ci_relationships")
    

    private Boolean ciRelationships;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ci_type")
    

    private String ciType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ci_region")
    

    private String ciRegion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ci_ids")
    
    private List<String> ciIds = null;
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ci_id")
    

    private String ciId;

    public PageResourceListParam withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    


    /**
     * 页面的分页标志位；为分页的最后一条记录的id
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    

    public PageResourceListParam withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * 查询返回记录的数量限制
     * minimum: 1
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    

    public PageResourceListParam withKeywords(Map<String, String> keywords) {
        this.keywords = keywords;
        return this;
    }

    

    public PageResourceListParam putKeywordsItem(String key, String keywordsItem) {
        if(this.keywords == null) {
            this.keywords = new HashMap<>();
        }
        this.keywords.put(key, keywordsItem);
        return this;
    }

    public PageResourceListParam withKeywords(Consumer<Map<String, String>> keywordsSetter) {
        if(this.keywords == null) {
            this.keywords = new HashMap<>();
        }
        keywordsSetter.accept(this.keywords);
        return this;
    }
    /**
     * 关键字模糊搜索
     * @return keywords
     */
    public Map<String, String> getKeywords() {
        return keywords;
    }

    public void setKeywords(Map<String, String> keywords) {
        this.keywords = keywords;
    }

    

    public PageResourceListParam withCiRelationships(Boolean ciRelationships) {
        this.ciRelationships = ciRelationships;
        return this;
    }

    


    /**
     * 是否需要返回拓扑树,默认是false。需要：true---性能差，不需要false--性能好
     * @return ciRelationships
     */
    public Boolean getCiRelationships() {
        return ciRelationships;
    }

    public void setCiRelationships(Boolean ciRelationships) {
        this.ciRelationships = ciRelationships;
    }

    

    public PageResourceListParam withCiType(String ciType) {
        this.ciType = ciType;
        return this;
    }

    


    /**
     * 节点类型，取值：application、sub_application、component、environment
     * @return ciType
     */
    public String getCiType() {
        return ciType;
    }

    public void setCiType(String ciType) {
        this.ciType = ciType;
    }

    

    public PageResourceListParam withCiRegion(String ciRegion) {
        this.ciRegion = ciRegion;
        return this;
    }

    


    /**
     * 环境的region信息，若没有值，代表全部
     * @return ciRegion
     */
    public String getCiRegion() {
        return ciRegion;
    }

    public void setCiRegion(String ciRegion) {
        this.ciRegion = ciRegion;
    }

    

    public PageResourceListParam withCiIds(List<String> ciIds) {
        this.ciIds = ciIds;
        return this;
    }

    
    public PageResourceListParam addCiIdsItem(String ciIdsItem) {
        if(this.ciIds == null) {
            this.ciIds = new ArrayList<>();
        }
        this.ciIds.add(ciIdsItem);
        return this;
    }

    public PageResourceListParam withCiIds(Consumer<List<String>> ciIdsSetter) {
        if(this.ciIds == null) {
            this.ciIds = new ArrayList<>();
        }
        ciIdsSetter.accept(this.ciIds);
        return this;
    }

    /**
     * 节点id列表;如果ci_ids和ci_id同时有，则优先ci_ids，但是不能同时为空
     * @return ciIds
     */
    public List<String> getCiIds() {
        return ciIds;
    }

    public void setCiIds(List<String> ciIds) {
        this.ciIds = ciIds;
    }

    

    public PageResourceListParam withCiId(String ciId) {
        this.ciId = ciId;
        return this;
    }

    


    /**
     * 节点id列表;如果ci_ids和ci_id同时有，则优先ci_ids，但是不能同时为空。但是不支持应用批量查询
     * @return ciId
     */
    public String getCiId() {
        return ciId;
    }

    public void setCiId(String ciId) {
        this.ciId = ciId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PageResourceListParam pageResourceListParam = (PageResourceListParam) o;
        return Objects.equals(this.marker, pageResourceListParam.marker) &&
            Objects.equals(this.limit, pageResourceListParam.limit) &&
            Objects.equals(this.keywords, pageResourceListParam.keywords) &&
            Objects.equals(this.ciRelationships, pageResourceListParam.ciRelationships) &&
            Objects.equals(this.ciType, pageResourceListParam.ciType) &&
            Objects.equals(this.ciRegion, pageResourceListParam.ciRegion) &&
            Objects.equals(this.ciIds, pageResourceListParam.ciIds) &&
            Objects.equals(this.ciId, pageResourceListParam.ciId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(marker, limit, keywords, ciRelationships, ciType, ciRegion, ciIds, ciId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PageResourceListParam {\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
        sb.append("    ciRelationships: ").append(toIndentedString(ciRelationships)).append("\n");
        sb.append("    ciType: ").append(toIndentedString(ciType)).append("\n");
        sb.append("    ciRegion: ").append(toIndentedString(ciRegion)).append("\n");
        sb.append("    ciIds: ").append(toIndentedString(ciIds)).append("\n");
        sb.append("    ciId: ").append(toIndentedString(ciId)).append("\n");
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

