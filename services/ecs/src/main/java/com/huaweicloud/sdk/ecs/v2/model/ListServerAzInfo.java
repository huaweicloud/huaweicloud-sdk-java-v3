package com.huaweicloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ListServerAzInfo
 */
public class ListServerAzInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone_id")

    private String availabilityZoneId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mode")

    private String mode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_border_group")

    private String publicBorderGroup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alias")

    private String alias;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "az_group_ids")

    private List<String> azGroupIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private Integer category;

    public ListServerAzInfo withAvailabilityZoneId(String availabilityZoneId) {
        this.availabilityZoneId = availabilityZoneId;
        return this;
    }

    /**
     * 可用区ID
     * @return availabilityZoneId
     */
    public String getAvailabilityZoneId() {
        return availabilityZoneId;
    }

    public void setAvailabilityZoneId(String availabilityZoneId) {
        this.availabilityZoneId = availabilityZoneId;
    }

    public ListServerAzInfo withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 可用区类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ListServerAzInfo withMode(String mode) {
        this.mode = mode;
        return this;
    }

    /**
     * 可用区模式
     * @return mode
     */
    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public ListServerAzInfo withPublicBorderGroup(String publicBorderGroup) {
        this.publicBorderGroup = publicBorderGroup;
        return this;
    }

    /**
     * 公网边界组，网络eip类别标识，用于查找az可用的eip池
     * @return publicBorderGroup
     */
    public String getPublicBorderGroup() {
        return publicBorderGroup;
    }

    public void setPublicBorderGroup(String publicBorderGroup) {
        this.publicBorderGroup = publicBorderGroup;
    }

    public ListServerAzInfo withAlias(String alias) {
        this.alias = alias;
        return this;
    }

    /**
     * 可用区别名
     * @return alias
     */
    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public ListServerAzInfo withAzGroupIds(List<String> azGroupIds) {
        this.azGroupIds = azGroupIds;
        return this;
    }

    public ListServerAzInfo addAzGroupIdsItem(String azGroupIdsItem) {
        if (this.azGroupIds == null) {
            this.azGroupIds = new ArrayList<>();
        }
        this.azGroupIds.add(azGroupIdsItem);
        return this;
    }

    public ListServerAzInfo withAzGroupIds(Consumer<List<String>> azGroupIdsSetter) {
        if (this.azGroupIds == null) {
            this.azGroupIds = new ArrayList<>();
        }
        azGroupIdsSetter.accept(this.azGroupIds);
        return this;
    }

    /**
     * 可用区所属的AZGroup列表
     * @return azGroupIds
     */
    public List<String> getAzGroupIds() {
        return azGroupIds;
    }

    public void setAzGroupIds(List<String> azGroupIds) {
        this.azGroupIds = azGroupIds;
    }

    public ListServerAzInfo withCategory(Integer category) {
        this.category = category;
        return this;
    }

    /**
     * 可用区类型对应的子类型
     * @return category
     */
    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListServerAzInfo that = (ListServerAzInfo) obj;
        return Objects.equals(this.availabilityZoneId, that.availabilityZoneId) && Objects.equals(this.type, that.type)
            && Objects.equals(this.mode, that.mode) && Objects.equals(this.publicBorderGroup, that.publicBorderGroup)
            && Objects.equals(this.alias, that.alias) && Objects.equals(this.azGroupIds, that.azGroupIds)
            && Objects.equals(this.category, that.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(availabilityZoneId, type, mode, publicBorderGroup, alias, azGroupIds, category);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListServerAzInfo {\n");
        sb.append("    availabilityZoneId: ").append(toIndentedString(availabilityZoneId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    publicBorderGroup: ").append(toIndentedString(publicBorderGroup)).append("\n");
        sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
        sb.append("    azGroupIds: ").append(toIndentedString(azGroupIds)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
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
