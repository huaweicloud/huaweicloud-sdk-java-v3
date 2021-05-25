package com.huaweicloud.sdk.dns.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ListCustomLineRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="line_id")
    
    private String lineId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="offset")
    
    private Integer offset;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="show_detail")
    
    private Boolean showDetail;

    public ListCustomLineRequest withLineId(String lineId) {
        this.lineId = lineId;
        return this;
    }

    


    /**
     * 解析线路ID。
     * @return lineId
     */
    public String getLineId() {
        return lineId;
    }

    public void setLineId(String lineId) {
        this.lineId = lineId;
    }

    

    public ListCustomLineRequest withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 解析线路名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public ListCustomLineRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * 每页返回的资源个数。取值范围为0~100。
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    

    public ListCustomLineRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    


    /**
     * 分页查询起始偏移量，表示从偏移量的下一个资源开始查询。
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    

    public ListCustomLineRequest withShowDetail(Boolean showDetail) {
        this.showDetail = showDetail;
        return this;
    }

    


    /**
     * 是否查询详细信息。  取值范围：  true：是，查询详细信息。 false：否，不查询详细信息。 默认为true。
     * @return showDetail
     */
    public Boolean getShowDetail() {
        return showDetail;
    }

    public void setShowDetail(Boolean showDetail) {
        this.showDetail = showDetail;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListCustomLineRequest listCustomLineRequest = (ListCustomLineRequest) o;
        return Objects.equals(this.lineId, listCustomLineRequest.lineId) &&
            Objects.equals(this.name, listCustomLineRequest.name) &&
            Objects.equals(this.limit, listCustomLineRequest.limit) &&
            Objects.equals(this.offset, listCustomLineRequest.offset) &&
            Objects.equals(this.showDetail, listCustomLineRequest.showDetail);
    }
    @Override
    public int hashCode() {
        return Objects.hash(lineId, name, limit, offset, showDetail);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCustomLineRequest {\n");
        sb.append("    lineId: ").append(toIndentedString(lineId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    showDetail: ").append(toIndentedString(showDetail)).append("\n");
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

