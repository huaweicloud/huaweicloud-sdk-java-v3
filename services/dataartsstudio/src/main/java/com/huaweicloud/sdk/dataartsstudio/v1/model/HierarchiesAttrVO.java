package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 层级属性。
 */
public class HierarchiesAttrVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hierarchies_id")

    private String hierarchiesId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attr_id")

    private String attrId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "level")

    private Integer level;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attr_name_en")

    private String attrNameEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attr_name_ch")

    private String attrNameCh;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detail_attr_ids")

    private List<String> detailAttrIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detail_attr_name_ens")

    private List<String> detailAttrNameEns = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detail_attr_name_chs")

    private List<String> detailAttrNameChs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attr")

    private DimensionAttributeVO attr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detail_attrs")

    private List<DimensionAttributeVO> detailAttrs = null;

    public HierarchiesAttrVO withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 编码，ID字符串。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public HierarchiesAttrVO withHierarchiesId(String hierarchiesId) {
        this.hierarchiesId = hierarchiesId;
        return this;
    }

    /**
     * 层级ID，ID字符串。
     * @return hierarchiesId
     */
    public String getHierarchiesId() {
        return hierarchiesId;
    }

    public void setHierarchiesId(String hierarchiesId) {
        this.hierarchiesId = hierarchiesId;
    }

    public HierarchiesAttrVO withAttrId(String attrId) {
        this.attrId = attrId;
        return this;
    }

    /**
     * 属性ID，ID字符串。
     * @return attrId
     */
    public String getAttrId() {
        return attrId;
    }

    public void setAttrId(String attrId) {
        this.attrId = attrId;
    }

    public HierarchiesAttrVO withLevel(Integer level) {
        this.level = level;
        return this;
    }

    /**
     * 层次。
     * @return level
     */
    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public HierarchiesAttrVO withAttrNameEn(String attrNameEn) {
        this.attrNameEn = attrNameEn;
        return this;
    }

    /**
     * 引用属性编码。
     * @return attrNameEn
     */
    public String getAttrNameEn() {
        return attrNameEn;
    }

    public void setAttrNameEn(String attrNameEn) {
        this.attrNameEn = attrNameEn;
    }

    public HierarchiesAttrVO withAttrNameCh(String attrNameCh) {
        this.attrNameCh = attrNameCh;
        return this;
    }

    /**
     * 引用属性名称，只读。
     * @return attrNameCh
     */
    public String getAttrNameCh() {
        return attrNameCh;
    }

    public void setAttrNameCh(String attrNameCh) {
        this.attrNameCh = attrNameCh;
    }

    public HierarchiesAttrVO withDetailAttrIds(List<String> detailAttrIds) {
        this.detailAttrIds = detailAttrIds;
        return this;
    }

    public HierarchiesAttrVO addDetailAttrIdsItem(String detailAttrIdsItem) {
        if (this.detailAttrIds == null) {
            this.detailAttrIds = new ArrayList<>();
        }
        this.detailAttrIds.add(detailAttrIdsItem);
        return this;
    }

    public HierarchiesAttrVO withDetailAttrIds(Consumer<List<String>> detailAttrIdsSetter) {
        if (this.detailAttrIds == null) {
            this.detailAttrIds = new ArrayList<>();
        }
        detailAttrIdsSetter.accept(this.detailAttrIds);
        return this;
    }

    /**
     * 详情属性ID，ID字符串。
     * @return detailAttrIds
     */
    public List<String> getDetailAttrIds() {
        return detailAttrIds;
    }

    public void setDetailAttrIds(List<String> detailAttrIds) {
        this.detailAttrIds = detailAttrIds;
    }

    public HierarchiesAttrVO withDetailAttrNameEns(List<String> detailAttrNameEns) {
        this.detailAttrNameEns = detailAttrNameEns;
        return this;
    }

    public HierarchiesAttrVO addDetailAttrNameEnsItem(String detailAttrNameEnsItem) {
        if (this.detailAttrNameEns == null) {
            this.detailAttrNameEns = new ArrayList<>();
        }
        this.detailAttrNameEns.add(detailAttrNameEnsItem);
        return this;
    }

    public HierarchiesAttrVO withDetailAttrNameEns(Consumer<List<String>> detailAttrNameEnsSetter) {
        if (this.detailAttrNameEns == null) {
            this.detailAttrNameEns = new ArrayList<>();
        }
        detailAttrNameEnsSetter.accept(this.detailAttrNameEns);
        return this;
    }

    /**
     * 详情属性英文。
     * @return detailAttrNameEns
     */
    public List<String> getDetailAttrNameEns() {
        return detailAttrNameEns;
    }

    public void setDetailAttrNameEns(List<String> detailAttrNameEns) {
        this.detailAttrNameEns = detailAttrNameEns;
    }

    public HierarchiesAttrVO withDetailAttrNameChs(List<String> detailAttrNameChs) {
        this.detailAttrNameChs = detailAttrNameChs;
        return this;
    }

    public HierarchiesAttrVO addDetailAttrNameChsItem(String detailAttrNameChsItem) {
        if (this.detailAttrNameChs == null) {
            this.detailAttrNameChs = new ArrayList<>();
        }
        this.detailAttrNameChs.add(detailAttrNameChsItem);
        return this;
    }

    public HierarchiesAttrVO withDetailAttrNameChs(Consumer<List<String>> detailAttrNameChsSetter) {
        if (this.detailAttrNameChs == null) {
            this.detailAttrNameChs = new ArrayList<>();
        }
        detailAttrNameChsSetter.accept(this.detailAttrNameChs);
        return this;
    }

    /**
     * 详情属性中文，只读。
     * @return detailAttrNameChs
     */
    public List<String> getDetailAttrNameChs() {
        return detailAttrNameChs;
    }

    public void setDetailAttrNameChs(List<String> detailAttrNameChs) {
        this.detailAttrNameChs = detailAttrNameChs;
    }

    public HierarchiesAttrVO withAttr(DimensionAttributeVO attr) {
        this.attr = attr;
        return this;
    }

    public HierarchiesAttrVO withAttr(Consumer<DimensionAttributeVO> attrSetter) {
        if (this.attr == null) {
            this.attr = new DimensionAttributeVO();
            attrSetter.accept(this.attr);
        }

        return this;
    }

    /**
     * Get attr
     * @return attr
     */
    public DimensionAttributeVO getAttr() {
        return attr;
    }

    public void setAttr(DimensionAttributeVO attr) {
        this.attr = attr;
    }

    public HierarchiesAttrVO withDetailAttrs(List<DimensionAttributeVO> detailAttrs) {
        this.detailAttrs = detailAttrs;
        return this;
    }

    public HierarchiesAttrVO addDetailAttrsItem(DimensionAttributeVO detailAttrsItem) {
        if (this.detailAttrs == null) {
            this.detailAttrs = new ArrayList<>();
        }
        this.detailAttrs.add(detailAttrsItem);
        return this;
    }

    public HierarchiesAttrVO withDetailAttrs(Consumer<List<DimensionAttributeVO>> detailAttrsSetter) {
        if (this.detailAttrs == null) {
            this.detailAttrs = new ArrayList<>();
        }
        detailAttrsSetter.accept(this.detailAttrs);
        return this;
    }

    /**
     * 详情字段，只读。
     * @return detailAttrs
     */
    public List<DimensionAttributeVO> getDetailAttrs() {
        return detailAttrs;
    }

    public void setDetailAttrs(List<DimensionAttributeVO> detailAttrs) {
        this.detailAttrs = detailAttrs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HierarchiesAttrVO that = (HierarchiesAttrVO) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.hierarchiesId, that.hierarchiesId)
            && Objects.equals(this.attrId, that.attrId) && Objects.equals(this.level, that.level)
            && Objects.equals(this.attrNameEn, that.attrNameEn) && Objects.equals(this.attrNameCh, that.attrNameCh)
            && Objects.equals(this.detailAttrIds, that.detailAttrIds)
            && Objects.equals(this.detailAttrNameEns, that.detailAttrNameEns)
            && Objects.equals(this.detailAttrNameChs, that.detailAttrNameChs) && Objects.equals(this.attr, that.attr)
            && Objects.equals(this.detailAttrs, that.detailAttrs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            hierarchiesId,
            attrId,
            level,
            attrNameEn,
            attrNameCh,
            detailAttrIds,
            detailAttrNameEns,
            detailAttrNameChs,
            attr,
            detailAttrs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HierarchiesAttrVO {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    hierarchiesId: ").append(toIndentedString(hierarchiesId)).append("\n");
        sb.append("    attrId: ").append(toIndentedString(attrId)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("    attrNameEn: ").append(toIndentedString(attrNameEn)).append("\n");
        sb.append("    attrNameCh: ").append(toIndentedString(attrNameCh)).append("\n");
        sb.append("    detailAttrIds: ").append(toIndentedString(detailAttrIds)).append("\n");
        sb.append("    detailAttrNameEns: ").append(toIndentedString(detailAttrNameEns)).append("\n");
        sb.append("    detailAttrNameChs: ").append(toIndentedString(detailAttrNameChs)).append("\n");
        sb.append("    attr: ").append(toIndentedString(attr)).append("\n");
        sb.append("    detailAttrs: ").append(toIndentedString(detailAttrs)).append("\n");
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
