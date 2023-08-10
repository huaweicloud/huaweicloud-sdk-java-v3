package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 配体预览任务结果
 */
public class LigandPreviewTaskResultDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ligands")

    private List<LigandPreviewInfoDto> ligands = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "has_more")

    private Boolean hasMore;

    public LigandPreviewTaskResultDto withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 已知的配体数量
     * minimum: 0
     * maximum: 1000000
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public LigandPreviewTaskResultDto withLigands(List<LigandPreviewInfoDto> ligands) {
        this.ligands = ligands;
        return this;
    }

    public LigandPreviewTaskResultDto addLigandsItem(LigandPreviewInfoDto ligandsItem) {
        if (this.ligands == null) {
            this.ligands = new ArrayList<>();
        }
        this.ligands.add(ligandsItem);
        return this;
    }

    public LigandPreviewTaskResultDto withLigands(Consumer<List<LigandPreviewInfoDto>> ligandsSetter) {
        if (this.ligands == null) {
            this.ligands = new ArrayList<>();
        }
        ligandsSetter.accept(this.ligands);
        return this;
    }

    /**
     * 预览配体信息列表
     * @return ligands
     */
    public List<LigandPreviewInfoDto> getLigands() {
        return ligands;
    }

    public void setLigands(List<LigandPreviewInfoDto> ligands) {
        this.ligands = ligands;
    }

    public LigandPreviewTaskResultDto withHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
        return this;
    }

    /**
     * 文件中是否还有更多配体没有处理；即当前数量是否表示整个文件的配体数量，若该值为false则表该配体文件含有count数量个配体；若该值为true则表示改配体文件含有大于count数量个配体（即count不完全统计）；例如：count=100且has_more=true，则前端可显示该配体文件含有\"100+个\"小分子
     * @return hasMore
     */
    public Boolean getHasMore() {
        return hasMore;
    }

    public void setHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LigandPreviewTaskResultDto that = (LigandPreviewTaskResultDto) obj;
        return Objects.equals(this.count, that.count) && Objects.equals(this.ligands, that.ligands)
            && Objects.equals(this.hasMore, that.hasMore);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, ligands, hasMore);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LigandPreviewTaskResultDto {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    ligands: ").append(toIndentedString(ligands)).append("\n");
        sb.append("    hasMore: ").append(toIndentedString(hasMore)).append("\n");
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
