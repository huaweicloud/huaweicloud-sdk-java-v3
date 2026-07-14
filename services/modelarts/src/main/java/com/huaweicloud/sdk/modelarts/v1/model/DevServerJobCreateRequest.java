package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DevServerJobCreateRequest
 */
public class DevServerJobCreateRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_ids")

    private List<String> serverIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_reboot")

    private Boolean isReboot;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "items")

    private List<DevServerJobItem> items = null;

    public DevServerJobCreateRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**：任务名称。 **约束限制**：^[-_.a-zA-Z0-9]{1,64}$。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DevServerJobCreateRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**：任务描述。 **约束限制**：^[-_.a-zA-Z0-9]{1,64}$。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public DevServerJobCreateRequest withServerIds(List<String> serverIds) {
        this.serverIds = serverIds;
        return this;
    }

    public DevServerJobCreateRequest addServerIdsItem(String serverIdsItem) {
        if (this.serverIds == null) {
            this.serverIds = new ArrayList<>();
        }
        this.serverIds.add(serverIdsItem);
        return this;
    }

    public DevServerJobCreateRequest withServerIds(Consumer<List<String>> serverIdsSetter) {
        if (this.serverIds == null) {
            this.serverIds = new ArrayList<>();
        }
        serverIdsSetter.accept(this.serverIds);
        return this;
    }

    /**
     * **参数解释**：DevServer实例id列表。 **取值范围**：不涉及。
     * @return serverIds
     */
    public List<String> getServerIds() {
        return serverIds;
    }

    public void setServerIds(List<String> serverIds) {
        this.serverIds = serverIds;
    }

    public DevServerJobCreateRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**：任务模板类型。 **约束限制**：^[-_.a-zA-Z0-9]{1,64}$。 **取值范围**：-COMMON  -SERVICE_DEPLOY 等。 **默认取值**：不涉及。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public DevServerJobCreateRequest withIsReboot(Boolean isReboot) {
        this.isReboot = isReboot;
        return this;
    }

    /**
     * **参数解释**：任务失败后是否重启。 **约束限制**：不涉及。 **取值范围**：- true   -false。 **默认取值**：false。
     * @return isReboot
     */
    public Boolean getIsReboot() {
        return isReboot;
    }

    public void setIsReboot(Boolean isReboot) {
        this.isReboot = isReboot;
    }

    public DevServerJobCreateRequest withItems(List<DevServerJobItem> items) {
        this.items = items;
        return this;
    }

    public DevServerJobCreateRequest addItemsItem(DevServerJobItem itemsItem) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(itemsItem);
        return this;
    }

    public DevServerJobCreateRequest withItems(Consumer<List<DevServerJobItem>> itemsSetter) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        itemsSetter.accept(this.items);
        return this;
    }

    /**
     * **参数解释**：任务实例列表。 **取值范围**：不涉及。
     * @return items
     */
    public List<DevServerJobItem> getItems() {
        return items;
    }

    public void setItems(List<DevServerJobItem> items) {
        this.items = items;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DevServerJobCreateRequest that = (DevServerJobCreateRequest) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.serverIds, that.serverIds) && Objects.equals(this.type, that.type)
            && Objects.equals(this.isReboot, that.isReboot) && Objects.equals(this.items, that.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, serverIds, type, isReboot, items);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DevServerJobCreateRequest {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    serverIds: ").append(toIndentedString(serverIds)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    isReboot: ").append(toIndentedString(isReboot)).append("\n");
        sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
