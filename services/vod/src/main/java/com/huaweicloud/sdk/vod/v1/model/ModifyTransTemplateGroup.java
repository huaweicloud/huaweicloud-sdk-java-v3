package com.huaweicloud.sdk.vod.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class ModifyTransTemplateGroup {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /** 是否设置默认。 */
    public static final class StatusEnum {

        /** Enum _1 for value: "1" */
        public static final StatusEnum _1 = new StatusEnum("1");

        /** Enum _0 for value: "0" */
        public static final StatusEnum _0 = new StatusEnum("0");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("1", _1);
            map.put("0", _0);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StatusEnum(value);
            }
            return result;
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_encrypt")

    private Integer autoEncrypt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quality_info_list")

    private List<QualityInfo> qualityInfoList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "watermark_template_ids")

    private List<String> watermarkTemplateIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "common")

    private Common common;

    public ModifyTransTemplateGroup withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /** 模板组名称。
     * 
     * @return groupId */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public ModifyTransTemplateGroup withName(String name) {
        this.name = name;
        return this;
    }

    /** 模板组名称。
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ModifyTransTemplateGroup withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /** 是否设置默认。
     * 
     * @return status */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ModifyTransTemplateGroup withAutoEncrypt(Integer autoEncrypt) {
        this.autoEncrypt = autoEncrypt;
        return this;
    }

    /** 是否自动加密。 取值如下： - 0：表示不加密。 - 1：表示需要加密。 默认值：0。 加密与转码必须要一起进行，当需要加密时，转码参数不能为空，且转码输出格式必须要为HLS。
     * 
     * @return autoEncrypt */
    public Integer getAutoEncrypt() {
        return autoEncrypt;
    }

    public void setAutoEncrypt(Integer autoEncrypt) {
        this.autoEncrypt = autoEncrypt;
    }

    public ModifyTransTemplateGroup withQualityInfoList(List<QualityInfo> qualityInfoList) {
        this.qualityInfoList = qualityInfoList;
        return this;
    }

    public ModifyTransTemplateGroup addQualityInfoListItem(QualityInfo qualityInfoListItem) {
        if (this.qualityInfoList == null) {
            this.qualityInfoList = new ArrayList<>();
        }
        this.qualityInfoList.add(qualityInfoListItem);
        return this;
    }

    public ModifyTransTemplateGroup withQualityInfoList(Consumer<List<QualityInfo>> qualityInfoListSetter) {
        if (this.qualityInfoList == null) {
            this.qualityInfoList = new ArrayList<>();
        }
        qualityInfoListSetter.accept(this.qualityInfoList);
        return this;
    }

    /** 画质配置信息列表。
     * 
     * @return qualityInfoList */
    public List<QualityInfo> getQualityInfoList() {
        return qualityInfoList;
    }

    public void setQualityInfoList(List<QualityInfo> qualityInfoList) {
        this.qualityInfoList = qualityInfoList;
    }

    public ModifyTransTemplateGroup withWatermarkTemplateIds(List<String> watermarkTemplateIds) {
        this.watermarkTemplateIds = watermarkTemplateIds;
        return this;
    }

    public ModifyTransTemplateGroup addWatermarkTemplateIdsItem(String watermarkTemplateIdsItem) {
        if (this.watermarkTemplateIds == null) {
            this.watermarkTemplateIds = new ArrayList<>();
        }
        this.watermarkTemplateIds.add(watermarkTemplateIdsItem);
        return this;
    }

    public ModifyTransTemplateGroup withWatermarkTemplateIds(Consumer<List<String>> watermarkTemplateIdsSetter) {
        if (this.watermarkTemplateIds == null) {
            this.watermarkTemplateIds = new ArrayList<>();
        }
        watermarkTemplateIdsSetter.accept(this.watermarkTemplateIds);
        return this;
    }

    /** 绑定的水印模板组ID数组。
     * 
     * @return watermarkTemplateIds */
    public List<String> getWatermarkTemplateIds() {
        return watermarkTemplateIds;
    }

    public void setWatermarkTemplateIds(List<String> watermarkTemplateIds) {
        this.watermarkTemplateIds = watermarkTemplateIds;
    }

    public ModifyTransTemplateGroup withDescription(String description) {
        this.description = description;
        return this;
    }

    /** 模板介绍。
     * 
     * @return description */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ModifyTransTemplateGroup withCommon(Common common) {
        this.common = common;
        return this;
    }

    public ModifyTransTemplateGroup withCommon(Consumer<Common> commonSetter) {
        if (this.common == null) {
            this.common = new Common();
            commonSetter.accept(this.common);
        }

        return this;
    }

    /** Get common
     * 
     * @return common */
    public Common getCommon() {
        return common;
    }

    public void setCommon(Common common) {
        this.common = common;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ModifyTransTemplateGroup modifyTransTemplateGroup = (ModifyTransTemplateGroup) o;
        return Objects.equals(this.groupId, modifyTransTemplateGroup.groupId)
            && Objects.equals(this.name, modifyTransTemplateGroup.name)
            && Objects.equals(this.status, modifyTransTemplateGroup.status)
            && Objects.equals(this.autoEncrypt, modifyTransTemplateGroup.autoEncrypt)
            && Objects.equals(this.qualityInfoList, modifyTransTemplateGroup.qualityInfoList)
            && Objects.equals(this.watermarkTemplateIds, modifyTransTemplateGroup.watermarkTemplateIds)
            && Objects.equals(this.description, modifyTransTemplateGroup.description)
            && Objects.equals(this.common, modifyTransTemplateGroup.common);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(groupId, name, status, autoEncrypt, qualityInfoList, watermarkTemplateIds, description, common);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModifyTransTemplateGroup {\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    autoEncrypt: ").append(toIndentedString(autoEncrypt)).append("\n");
        sb.append("    qualityInfoList: ").append(toIndentedString(qualityInfoList)).append("\n");
        sb.append("    watermarkTemplateIds: ").append(toIndentedString(watermarkTemplateIds)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    common: ").append(toIndentedString(common)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
