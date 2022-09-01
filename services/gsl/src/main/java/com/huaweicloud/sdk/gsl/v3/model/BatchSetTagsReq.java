package com.huaweicloud.sdk.gsl.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BatchSetTagsReq
 */
public class BatchSetTagsReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_temp_id")

    @JacksonXmlProperty(localName = "file_temp_id")

    private Long fileTempId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sim_card_ids")

    @JacksonXmlProperty(localName = "sim_card_ids")

    private List<Long> simCardIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_ids")

    @JacksonXmlProperty(localName = "tag_ids")

    private List<Long> tagIds = null;

    public BatchSetTagsReq withFileTempId(Long fileTempId) {
        this.fileTempId = fileTempId;
        return this;
    }

    /**
     * 临时文件ID
     * @return fileTempId
     */
    public Long getFileTempId() {
        return fileTempId;
    }

    public void setFileTempId(Long fileTempId) {
        this.fileTempId = fileTempId;
    }

    public BatchSetTagsReq withSimCardIds(List<Long> simCardIds) {
        this.simCardIds = simCardIds;
        return this;
    }

    public BatchSetTagsReq addSimCardIdsItem(Long simCardIdsItem) {
        if (this.simCardIds == null) {
            this.simCardIds = new ArrayList<>();
        }
        this.simCardIds.add(simCardIdsItem);
        return this;
    }

    public BatchSetTagsReq withSimCardIds(Consumer<List<Long>> simCardIdsSetter) {
        if (this.simCardIds == null) {
            this.simCardIds = new ArrayList<>();
        }
        simCardIdsSetter.accept(this.simCardIds);
        return this;
    }

    /**
     * SIM卡id列表，最多500
     * @return simCardIds
     */
    public List<Long> getSimCardIds() {
        return simCardIds;
    }

    public void setSimCardIds(List<Long> simCardIds) {
        this.simCardIds = simCardIds;
    }

    public BatchSetTagsReq withTagIds(List<Long> tagIds) {
        this.tagIds = tagIds;
        return this;
    }

    public BatchSetTagsReq addTagIdsItem(Long tagIdsItem) {
        if (this.tagIds == null) {
            this.tagIds = new ArrayList<>();
        }
        this.tagIds.add(tagIdsItem);
        return this;
    }

    public BatchSetTagsReq withTagIds(Consumer<List<Long>> tagIdsSetter) {
        if (this.tagIds == null) {
            this.tagIds = new ArrayList<>();
        }
        tagIdsSetter.accept(this.tagIds);
        return this;
    }

    /**
     * 绑定的标签id列表，最多10
     * @return tagIds
     */
    public List<Long> getTagIds() {
        return tagIds;
    }

    public void setTagIds(List<Long> tagIds) {
        this.tagIds = tagIds;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchSetTagsReq batchSetTagsReq = (BatchSetTagsReq) o;
        return Objects.equals(this.fileTempId, batchSetTagsReq.fileTempId)
            && Objects.equals(this.simCardIds, batchSetTagsReq.simCardIds)
            && Objects.equals(this.tagIds, batchSetTagsReq.tagIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileTempId, simCardIds, tagIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchSetTagsReq {\n");
        sb.append("    fileTempId: ").append(toIndentedString(fileTempId)).append("\n");
        sb.append("    simCardIds: ").append(toIndentedString(simCardIds)).append("\n");
        sb.append("    tagIds: ").append(toIndentedString(tagIds)).append("\n");
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
