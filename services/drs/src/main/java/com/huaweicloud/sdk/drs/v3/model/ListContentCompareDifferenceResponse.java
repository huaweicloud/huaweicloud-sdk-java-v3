package com.huaweicloud.sdk.drs.v3.model;

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
public class ListContentCompareDifferenceResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Long count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_meta_is_null")

    private Long targetMetaIsNull;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_meta_is_null")

    private Long sourceMetaIsNull;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_target_meta_not_null")

    private Long sourceTargetMetaNotNull;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "contents_infos")

    private List<CompareJobContentDetailInfo> contentsInfos = null;

    public ListContentCompareDifferenceResponse withCount(Long count) {
        this.count = count;
        return this;
    }

    /**
     * 总数量。
     * @return count
     */
    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public ListContentCompareDifferenceResponse withTargetMetaIsNull(Long targetMetaIsNull) {
        this.targetMetaIsNull = targetMetaIsNull;
        return this;
    }

    /**
     * 对比不一致详情数量：只有源库存在。
     * @return targetMetaIsNull
     */
    public Long getTargetMetaIsNull() {
        return targetMetaIsNull;
    }

    public void setTargetMetaIsNull(Long targetMetaIsNull) {
        this.targetMetaIsNull = targetMetaIsNull;
    }

    public ListContentCompareDifferenceResponse withSourceMetaIsNull(Long sourceMetaIsNull) {
        this.sourceMetaIsNull = sourceMetaIsNull;
        return this;
    }

    /**
     * 对比不一致详情数量：只有目标库存在。
     * @return sourceMetaIsNull
     */
    public Long getSourceMetaIsNull() {
        return sourceMetaIsNull;
    }

    public void setSourceMetaIsNull(Long sourceMetaIsNull) {
        this.sourceMetaIsNull = sourceMetaIsNull;
    }

    public ListContentCompareDifferenceResponse withSourceTargetMetaNotNull(Long sourceTargetMetaNotNull) {
        this.sourceTargetMetaNotNull = sourceTargetMetaNotNull;
        return this;
    }

    /**
     * 对比不一致详情数量：源和目标端均存在。
     * @return sourceTargetMetaNotNull
     */
    public Long getSourceTargetMetaNotNull() {
        return sourceTargetMetaNotNull;
    }

    public void setSourceTargetMetaNotNull(Long sourceTargetMetaNotNull) {
        this.sourceTargetMetaNotNull = sourceTargetMetaNotNull;
    }

    public ListContentCompareDifferenceResponse withContentsInfos(List<CompareJobContentDetailInfo> contentsInfos) {
        this.contentsInfos = contentsInfos;
        return this;
    }

    public ListContentCompareDifferenceResponse addContentsInfosItem(CompareJobContentDetailInfo contentsInfosItem) {
        if (this.contentsInfos == null) {
            this.contentsInfos = new ArrayList<>();
        }
        this.contentsInfos.add(contentsInfosItem);
        return this;
    }

    public ListContentCompareDifferenceResponse withContentsInfos(
        Consumer<List<CompareJobContentDetailInfo>> contentsInfosSetter) {
        if (this.contentsInfos == null) {
            this.contentsInfos = new ArrayList<>();
        }
        contentsInfosSetter.accept(this.contentsInfos);
        return this;
    }

    /**
     * 详细内容信息列表。
     * @return contentsInfos
     */
    public List<CompareJobContentDetailInfo> getContentsInfos() {
        return contentsInfos;
    }

    public void setContentsInfos(List<CompareJobContentDetailInfo> contentsInfos) {
        this.contentsInfos = contentsInfos;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListContentCompareDifferenceResponse that = (ListContentCompareDifferenceResponse) obj;
        return Objects.equals(this.count, that.count) && Objects.equals(this.targetMetaIsNull, that.targetMetaIsNull)
            && Objects.equals(this.sourceMetaIsNull, that.sourceMetaIsNull)
            && Objects.equals(this.sourceTargetMetaNotNull, that.sourceTargetMetaNotNull)
            && Objects.equals(this.contentsInfos, that.contentsInfos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, targetMetaIsNull, sourceMetaIsNull, sourceTargetMetaNotNull, contentsInfos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListContentCompareDifferenceResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    targetMetaIsNull: ").append(toIndentedString(targetMetaIsNull)).append("\n");
        sb.append("    sourceMetaIsNull: ").append(toIndentedString(sourceMetaIsNull)).append("\n");
        sb.append("    sourceTargetMetaNotNull: ").append(toIndentedString(sourceTargetMetaNotNull)).append("\n");
        sb.append("    contentsInfos: ").append(toIndentedString(contentsInfos)).append("\n");
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
