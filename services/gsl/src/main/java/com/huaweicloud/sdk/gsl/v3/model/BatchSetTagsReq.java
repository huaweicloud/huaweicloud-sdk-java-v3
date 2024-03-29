package com.huaweicloud.sdk.gsl.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

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

    private Long fileTempId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sim_card_ids")

    private List<Long> simCardIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iccids")

    private List<String> iccids = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_ids")

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
     * SIM卡id列表，最多500.sim_card_ids与iccids不能同时为空，sim_card_ids参数为空则根据iccids参数处理
     * @return simCardIds
     */
    public List<Long> getSimCardIds() {
        return simCardIds;
    }

    public void setSimCardIds(List<Long> simCardIds) {
        this.simCardIds = simCardIds;
    }

    public BatchSetTagsReq withIccids(List<String> iccids) {
        this.iccids = iccids;
        return this;
    }

    public BatchSetTagsReq addIccidsItem(String iccidsItem) {
        if (this.iccids == null) {
            this.iccids = new ArrayList<>();
        }
        this.iccids.add(iccidsItem);
        return this;
    }

    public BatchSetTagsReq withIccids(Consumer<List<String>> iccidsSetter) {
        if (this.iccids == null) {
            this.iccids = new ArrayList<>();
        }
        iccidsSetter.accept(this.iccids);
        return this;
    }

    /**
     * iccid列表，最多支持传入500个iccid。sim_card_ids与iccids不能同时为空，sim_card_ids参数为空则根据iccids参数处理
     * @return iccids
     */
    public List<String> getIccids() {
        return iccids;
    }

    public void setIccids(List<String> iccids) {
        this.iccids = iccids;
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
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchSetTagsReq that = (BatchSetTagsReq) obj;
        return Objects.equals(this.fileTempId, that.fileTempId) && Objects.equals(this.simCardIds, that.simCardIds)
            && Objects.equals(this.iccids, that.iccids) && Objects.equals(this.tagIds, that.tagIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileTempId, simCardIds, iccids, tagIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchSetTagsReq {\n");
        sb.append("    fileTempId: ").append(toIndentedString(fileTempId)).append("\n");
        sb.append("    simCardIds: ").append(toIndentedString(simCardIds)).append("\n");
        sb.append("    iccids: ").append(toIndentedString(iccids)).append("\n");
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
