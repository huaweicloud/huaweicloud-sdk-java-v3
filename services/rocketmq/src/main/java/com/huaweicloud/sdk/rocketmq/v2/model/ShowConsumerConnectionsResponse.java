package com.huaweicloud.sdk.rocketmq.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowConsumerConnectionsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_name")

    private String groupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "online")

    private Boolean online;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subscription_consistency")

    private Boolean subscriptionConsistency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "next_offset")

    private Integer nextOffset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "previous_offset")

    private Integer previousOffset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clients")

    private List<ClientData> clients = null;

    public ShowConsumerConnectionsResponse withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * **参数解释**： 消费组名称。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return groupName
     */
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public ShowConsumerConnectionsResponse withOnline(Boolean online) {
        this.online = online;
        return this;
    }

    /**
     * **参数解释**： 消费组是否在线。 **约束限制**： 不涉及。 **取值范围**： - true：在线。 - false：不在线。 **默认取值**： 不涉及。
     * @return online
     */
    public Boolean getOnline() {
        return online;
    }

    public void setOnline(Boolean online) {
        this.online = online;
    }

    public ShowConsumerConnectionsResponse withSubscriptionConsistency(Boolean subscriptionConsistency) {
        this.subscriptionConsistency = subscriptionConsistency;
        return this;
    }

    /**
     * **参数解释**： 订阅关系是否一致。 **约束限制**： 不涉及。 **取值范围**： - true：一致。 - false：不一致。 **默认取值**： 不涉及。
     * @return subscriptionConsistency
     */
    public Boolean getSubscriptionConsistency() {
        return subscriptionConsistency;
    }

    public void setSubscriptionConsistency(Boolean subscriptionConsistency) {
        this.subscriptionConsistency = subscriptionConsistency;
    }

    public ShowConsumerConnectionsResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * **参数解释**： 消费者总数。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ShowConsumerConnectionsResponse withNextOffset(Integer nextOffset) {
        this.nextOffset = nextOffset;
        return this;
    }

    /**
     * **参数解释**： 下个分页的offset。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return nextOffset
     */
    public Integer getNextOffset() {
        return nextOffset;
    }

    public void setNextOffset(Integer nextOffset) {
        this.nextOffset = nextOffset;
    }

    public ShowConsumerConnectionsResponse withPreviousOffset(Integer previousOffset) {
        this.previousOffset = previousOffset;
        return this;
    }

    /**
     * **参数解释**： 上个分页的offset。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return previousOffset
     */
    public Integer getPreviousOffset() {
        return previousOffset;
    }

    public void setPreviousOffset(Integer previousOffset) {
        this.previousOffset = previousOffset;
    }

    public ShowConsumerConnectionsResponse withClients(List<ClientData> clients) {
        this.clients = clients;
        return this;
    }

    public ShowConsumerConnectionsResponse addClientsItem(ClientData clientsItem) {
        if (this.clients == null) {
            this.clients = new ArrayList<>();
        }
        this.clients.add(clientsItem);
        return this;
    }

    public ShowConsumerConnectionsResponse withClients(Consumer<List<ClientData>> clientsSetter) {
        if (this.clients == null) {
            this.clients = new ArrayList<>();
        }
        clientsSetter.accept(this.clients);
        return this;
    }

    /**
     * **参数解释**： 消费者订阅详情列表。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return clients
     */
    public List<ClientData> getClients() {
        return clients;
    }

    public void setClients(List<ClientData> clients) {
        this.clients = clients;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowConsumerConnectionsResponse that = (ShowConsumerConnectionsResponse) obj;
        return Objects.equals(this.groupName, that.groupName) && Objects.equals(this.online, that.online)
            && Objects.equals(this.subscriptionConsistency, that.subscriptionConsistency)
            && Objects.equals(this.total, that.total) && Objects.equals(this.nextOffset, that.nextOffset)
            && Objects.equals(this.previousOffset, that.previousOffset) && Objects.equals(this.clients, that.clients);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupName, online, subscriptionConsistency, total, nextOffset, previousOffset, clients);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowConsumerConnectionsResponse {\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    online: ").append(toIndentedString(online)).append("\n");
        sb.append("    subscriptionConsistency: ").append(toIndentedString(subscriptionConsistency)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    nextOffset: ").append(toIndentedString(nextOffset)).append("\n");
        sb.append("    previousOffset: ").append(toIndentedString(previousOffset)).append("\n");
        sb.append("    clients: ").append(toIndentedString(clients)).append("\n");
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
