package com.huaweicloud.sdk.imagesearch.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.imagesearch.v1.model.SearchPictureItem;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class RunSearchPictureResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="count")
    
    
    private Integer count;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="result")
    
    
    private List<SearchPictureItem> result = null;
    
    public RunSearchPictureResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    


    /**
     * 搜索结果总数。
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    

    public RunSearchPictureResponse withResult(List<SearchPictureItem> result) {
        this.result = result;
        return this;
    }

    
    public RunSearchPictureResponse addResultItem(SearchPictureItem resultItem) {
        if(this.result == null) {
            this.result = new ArrayList<>();
        }
        this.result.add(resultItem);
        return this;
    }

    public RunSearchPictureResponse withResult(Consumer<List<SearchPictureItem>> resultSetter) {
        if(this.result == null) {
            this.result = new ArrayList<>();
        }
        resultSetter.accept(this.result);
        return this;
    }

    /**
     * 搜索结果详情。
     * @return result
     */
    public List<SearchPictureItem> getResult() {
        return result;
    }

    public void setResult(List<SearchPictureItem> result) {
        this.result = result;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RunSearchPictureResponse runSearchPictureResponse = (RunSearchPictureResponse) o;
        return Objects.equals(this.count, runSearchPictureResponse.count) &&
            Objects.equals(this.result, runSearchPictureResponse.result);
    }
    @Override
    public int hashCode() {
        return Objects.hash(count, result);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunSearchPictureResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
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

