package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 绑定策略请求体。
 */
public class BindDevicePolicy {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_type")

    private String targetType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_ids")

    private List<String> targetIds = null;

    public BindDevicePolicy withTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }

    /**
     * **参数说明**：策略绑定的目标类型。 **取值范围**：device|product|app，device表示设备，product表示产品，app表示整个资源空间。
     * @return targetType
     */
    public String getTargetType() {
        return targetType;
    }

    public void setTargetType(String targetType) {
        this.targetType = targetType;
    }

    public BindDevicePolicy withTargetIds(List<String> targetIds) {
        this.targetIds = targetIds;
        return this;
    }

    public BindDevicePolicy addTargetIdsItem(String targetIdsItem) {
        if (this.targetIds == null) {
            this.targetIds = new ArrayList<>();
        }
        this.targetIds.add(targetIdsItem);
        return this;
    }

    public BindDevicePolicy withTargetIds(Consumer<List<String>> targetIdsSetter) {
        if (this.targetIds == null) {
            this.targetIds = new ArrayList<>();
        }
        targetIdsSetter.accept(this.targetIds);
        return this;
    }

    /**
     * 策略绑定的目标ID列表 
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
        BindDevicePolicy that = (BindDevicePolicy) obj;
        return Objects.equals(this.targetType, that.targetType) && Objects.equals(this.targetIds, that.targetIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(targetType, targetIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BindDevicePolicy {\n");
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
