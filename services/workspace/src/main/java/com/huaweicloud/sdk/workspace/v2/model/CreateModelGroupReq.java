package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建模型组请求。
 */
public class CreateModelGroupReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider_ids")

    private List<String> providerIds = null;

    public CreateModelGroupReq withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 分组名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateModelGroupReq withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 分组描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateModelGroupReq withProviderIds(List<String> providerIds) {
        this.providerIds = providerIds;
        return this;
    }

    public CreateModelGroupReq addProviderIdsItem(String providerIdsItem) {
        if (this.providerIds == null) {
            this.providerIds = new ArrayList<>();
        }
        this.providerIds.add(providerIdsItem);
        return this;
    }

    public CreateModelGroupReq withProviderIds(Consumer<List<String>> providerIdsSetter) {
        if (this.providerIds == null) {
            this.providerIds = new ArrayList<>();
        }
        providerIdsSetter.accept(this.providerIds);
        return this;
    }

    /**
     * 初始关联的供应商ID列表（可选）。
     * @return providerIds
     */
    public List<String> getProviderIds() {
        return providerIds;
    }

    public void setProviderIds(List<String> providerIds) {
        this.providerIds = providerIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateModelGroupReq that = (CreateModelGroupReq) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.providerIds, that.providerIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, providerIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateModelGroupReq {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    providerIds: ").append(toIndentedString(providerIds)).append("\n");
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
