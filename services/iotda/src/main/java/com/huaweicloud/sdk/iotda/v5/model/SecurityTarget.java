package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * SecurityTarget
 */
public class SecurityTarget {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_type")

    private String targetType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_ids")

    private List<String> targetIds = null;

    public SecurityTarget withTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }

    /**
     * 安全态势感知配置绑定的对象，目前仅支持PRODUCT产品级别，仅对设备级别的安全态势感知项生效。
     * @return targetType
     */
    public String getTargetType() {
        return targetType;
    }

    public void setTargetType(String targetType) {
        this.targetType = targetType;
    }

    public SecurityTarget withTargetIds(List<String> targetIds) {
        this.targetIds = targetIds;
        return this;
    }

    public SecurityTarget addTargetIdsItem(String targetIdsItem) {
        if (this.targetIds == null) {
            this.targetIds = new ArrayList<>();
        }
        this.targetIds.add(targetIdsItem);
        return this;
    }

    public SecurityTarget withTargetIds(Consumer<List<String>> targetIdsSetter) {
        if (this.targetIds == null) {
            this.targetIds = new ArrayList<>();
        }
        targetIdsSetter.accept(this.targetIds);
        return this;
    }

    /**
     * 绑定对象id列表，target_type为PRODUCT时，由于产品ID在不同资源空间下可以重复，target_id格式为：资源空间ID:产品ID；资源空间ID与产品ID使用冒号拼接而成。
     * @return targetIds
     */
    public List<String> getTargetIds() {
        return targetIds;
    }

    public void setTargetIds(List<String> targetIds) {
        this.targetIds = targetIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SecurityTarget that = (SecurityTarget) obj;
        return Objects.equals(this.targetType, that.targetType) && Objects.equals(this.targetIds, that.targetIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(targetType, targetIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SecurityTarget {\n");
        sb.append("    targetType: ").append(toIndentedString(targetType)).append("\n");
        sb.append("    targetIds: ").append(toIndentedString(targetIds)).append("\n");
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
