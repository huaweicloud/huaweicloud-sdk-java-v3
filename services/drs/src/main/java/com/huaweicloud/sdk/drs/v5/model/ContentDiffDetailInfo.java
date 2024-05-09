package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 内容对比不一致数据的详情。
 */
public class ContentDiffDetailInfo {

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

    private List<ContentDiffDetailVO> contentsInfos = null;

    public ContentDiffDetailInfo withCount(Long count) {
        this.count = count;
        return this;
    }

    /**
     * 数量。
     * @return count
     */
    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public ContentDiffDetailInfo withTargetMetaIsNull(Long targetMetaIsNull) {
        this.targetMetaIsNull = targetMetaIsNull;
        return this;
    }

    /**
     * 对比不一致详情：只有源库存在。
     * @return targetMetaIsNull
     */
    public Long getTargetMetaIsNull() {
        return targetMetaIsNull;
    }

    public void setTargetMetaIsNull(Long targetMetaIsNull) {
        this.targetMetaIsNull = targetMetaIsNull;
    }

    public ContentDiffDetailInfo withSourceMetaIsNull(Long sourceMetaIsNull) {
        this.sourceMetaIsNull = sourceMetaIsNull;
        return this;
    }

    /**
     * 对比不一致详情：只有目标库存在。
     * @return sourceMetaIsNull
     */
    public Long getSourceMetaIsNull() {
        return sourceMetaIsNull;
    }

    public void setSourceMetaIsNull(Long sourceMetaIsNull) {
        this.sourceMetaIsNull = sourceMetaIsNull;
    }

    public ContentDiffDetailInfo withSourceTargetMetaNotNull(Long sourceTargetMetaNotNull) {
        this.sourceTargetMetaNotNull = sourceTargetMetaNotNull;
        return this;
    }

    /**
     * 对比不一致详情：源和目标端均存在。
     * @return sourceTargetMetaNotNull
     */
    public Long getSourceTargetMetaNotNull() {
        return sourceTargetMetaNotNull;
    }

    public void setSourceTargetMetaNotNull(Long sourceTargetMetaNotNull) {
        this.sourceTargetMetaNotNull = sourceTargetMetaNotNull;
    }

    public ContentDiffDetailInfo withContentsInfos(List<ContentDiffDetailVO> contentsInfos) {
        this.contentsInfos = contentsInfos;
        return this;
    }

    public ContentDiffDetailInfo addContentsInfosItem(ContentDiffDetailVO contentsInfosItem) {
        if (this.contentsInfos == null) {
            this.contentsInfos = new ArrayList<>();
        }
        this.contentsInfos.add(contentsInfosItem);
        return this;
    }

    public ContentDiffDetailInfo withContentsInfos(Consumer<List<ContentDiffDetailVO>> contentsInfosSetter) {
        if (this.contentsInfos == null) {
            this.contentsInfos = new ArrayList<>();
        }
        contentsInfosSetter.accept(this.contentsInfos);
        return this;
    }

    /**
     * 信息列表。
     * @return contentsInfos
     */
    public List<ContentDiffDetailVO> getContentsInfos() {
        return contentsInfos;
    }

    public void setContentsInfos(List<ContentDiffDetailVO> contentsInfos) {
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
        ContentDiffDetailInfo that = (ContentDiffDetailInfo) obj;
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
        sb.append("class ContentDiffDetailInfo {\n");
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
