package com.huaweicloud.sdk.drs.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.drs.v3.model.ContentCompareDetail;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class ContentCompareResultDetails  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="source_db_name")
    
    private String sourceDbName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="content_compare_detail")
    
    private List<ContentCompareDetail> contentCompareDetail = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="content_compare_detail_count")
    
    private Integer contentCompareDetailCount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="content_uncompare_detail")
    
    private List<ContentCompareDetail> contentUncompareDetail = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="content_uncompare_detail_count")
    
    private Integer contentUncompareDetailCount;

    public ContentCompareResultDetails withSourceDbName(String sourceDbName) {
        this.sourceDbName = sourceDbName;
        return this;
    }

    


    /**
     * 源库名称。
     * @return sourceDbName
     */
    public String getSourceDbName() {
        return sourceDbName;
    }

    public void setSourceDbName(String sourceDbName) {
        this.sourceDbName = sourceDbName;
    }

    

    public ContentCompareResultDetails withContentCompareDetail(List<ContentCompareDetail> contentCompareDetail) {
        this.contentCompareDetail = contentCompareDetail;
        return this;
    }

    
    public ContentCompareResultDetails addContentCompareDetailItem(ContentCompareDetail contentCompareDetailItem) {
        if(this.contentCompareDetail == null) {
            this.contentCompareDetail = new ArrayList<>();
        }
        this.contentCompareDetail.add(contentCompareDetailItem);
        return this;
    }

    public ContentCompareResultDetails withContentCompareDetail(Consumer<List<ContentCompareDetail>> contentCompareDetailSetter) {
        if(this.contentCompareDetail == null) {
            this.contentCompareDetail = new ArrayList<>();
        }
        contentCompareDetailSetter.accept(this.contentCompareDetail);
        return this;
    }

    /**
     * 该库的表的内容对比详情。
     * @return contentCompareDetail
     */
    public List<ContentCompareDetail> getContentCompareDetail() {
        return contentCompareDetail;
    }

    public void setContentCompareDetail(List<ContentCompareDetail> contentCompareDetail) {
        this.contentCompareDetail = contentCompareDetail;
    }

    

    public ContentCompareResultDetails withContentCompareDetailCount(Integer contentCompareDetailCount) {
        this.contentCompareDetailCount = contentCompareDetailCount;
        return this;
    }

    


    /**
     * 内容对比结果详情总数。
     * @return contentCompareDetailCount
     */
    public Integer getContentCompareDetailCount() {
        return contentCompareDetailCount;
    }

    public void setContentCompareDetailCount(Integer contentCompareDetailCount) {
        this.contentCompareDetailCount = contentCompareDetailCount;
    }

    

    public ContentCompareResultDetails withContentUncompareDetail(List<ContentCompareDetail> contentUncompareDetail) {
        this.contentUncompareDetail = contentUncompareDetail;
        return this;
    }

    
    public ContentCompareResultDetails addContentUncompareDetailItem(ContentCompareDetail contentUncompareDetailItem) {
        if(this.contentUncompareDetail == null) {
            this.contentUncompareDetail = new ArrayList<>();
        }
        this.contentUncompareDetail.add(contentUncompareDetailItem);
        return this;
    }

    public ContentCompareResultDetails withContentUncompareDetail(Consumer<List<ContentCompareDetail>> contentUncompareDetailSetter) {
        if(this.contentUncompareDetail == null) {
            this.contentUncompareDetail = new ArrayList<>();
        }
        contentUncompareDetailSetter.accept(this.contentUncompareDetail);
        return this;
    }

    /**
     * 该库的表的内容对比详情(无法对比的表)。
     * @return contentUncompareDetail
     */
    public List<ContentCompareDetail> getContentUncompareDetail() {
        return contentUncompareDetail;
    }

    public void setContentUncompareDetail(List<ContentCompareDetail> contentUncompareDetail) {
        this.contentUncompareDetail = contentUncompareDetail;
    }

    

    public ContentCompareResultDetails withContentUncompareDetailCount(Integer contentUncompareDetailCount) {
        this.contentUncompareDetailCount = contentUncompareDetailCount;
        return this;
    }

    


    /**
     * 内容对比结果详情总数(无法对比的表)。
     * @return contentUncompareDetailCount
     */
    public Integer getContentUncompareDetailCount() {
        return contentUncompareDetailCount;
    }

    public void setContentUncompareDetailCount(Integer contentUncompareDetailCount) {
        this.contentUncompareDetailCount = contentUncompareDetailCount;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ContentCompareResultDetails contentCompareResultDetails = (ContentCompareResultDetails) o;
        return Objects.equals(this.sourceDbName, contentCompareResultDetails.sourceDbName) &&
            Objects.equals(this.contentCompareDetail, contentCompareResultDetails.contentCompareDetail) &&
            Objects.equals(this.contentCompareDetailCount, contentCompareResultDetails.contentCompareDetailCount) &&
            Objects.equals(this.contentUncompareDetail, contentCompareResultDetails.contentUncompareDetail) &&
            Objects.equals(this.contentUncompareDetailCount, contentCompareResultDetails.contentUncompareDetailCount);
    }
    @Override
    public int hashCode() {
        return Objects.hash(sourceDbName, contentCompareDetail, contentCompareDetailCount, contentUncompareDetail, contentUncompareDetailCount);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ContentCompareResultDetails {\n");
        sb.append("    sourceDbName: ").append(toIndentedString(sourceDbName)).append("\n");
        sb.append("    contentCompareDetail: ").append(toIndentedString(contentCompareDetail)).append("\n");
        sb.append("    contentCompareDetailCount: ").append(toIndentedString(contentCompareDetailCount)).append("\n");
        sb.append("    contentUncompareDetail: ").append(toIndentedString(contentUncompareDetail)).append("\n");
        sb.append("    contentUncompareDetailCount: ").append(toIndentedString(contentUncompareDetailCount)).append("\n");
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

