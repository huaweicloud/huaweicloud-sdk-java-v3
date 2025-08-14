package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 批量设置应用预启动请求体。
 */
public class UpdatePreBootPolicyReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ids")

    private List<String> ids = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_pre_boot")

    private Boolean isPreBoot;

    public UpdatePreBootPolicyReq withIds(List<String> ids) {
        this.ids = ids;
        return this;
    }

    public UpdatePreBootPolicyReq addIdsItem(String idsItem) {
        if (this.ids == null) {
            this.ids = new ArrayList<>();
        }
        this.ids.add(idsItem);
        return this;
    }

    public UpdatePreBootPolicyReq withIds(Consumer<List<String>> idsSetter) {
        if (this.ids == null) {
            this.ids = new ArrayList<>();
        }
        idsSetter.accept(this.ids);
        return this;
    }

    /**
     * 应用ID,最多同时操作5个。
     * @return ids
     */
    public List<String> getIds() {
        return ids;
    }

    public void setIds(List<String> ids) {
        this.ids = ids;
    }

    public UpdatePreBootPolicyReq withIsPreBoot(Boolean isPreBoot) {
        this.isPreBoot = isPreBoot;
        return this;
    }

    /**
     * 是否设置应用预启动。
     * @return isPreBoot
     */
    public Boolean getIsPreBoot() {
        return isPreBoot;
    }

    public void setIsPreBoot(Boolean isPreBoot) {
        this.isPreBoot = isPreBoot;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdatePreBootPolicyReq that = (UpdatePreBootPolicyReq) obj;
        return Objects.equals(this.ids, that.ids) && Objects.equals(this.isPreBoot, that.isPreBoot);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ids, isPreBoot);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePreBootPolicyReq {\n");
        sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
        sb.append("    isPreBoot: ").append(toIndentedString(isPreBoot)).append("\n");
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
