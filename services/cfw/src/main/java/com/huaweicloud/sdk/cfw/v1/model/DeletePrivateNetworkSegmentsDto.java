package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DeletePrivateNetworkSegmentsDto
 */
public class DeletePrivateNetworkSegmentsDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conf_ids")

    private List<String> confIds = null;

    public DeletePrivateNetworkSegmentsDto withConfIds(List<String> confIds) {
        this.confIds = confIds;
        return this;
    }

    public DeletePrivateNetworkSegmentsDto addConfIdsItem(String confIdsItem) {
        if (this.confIds == null) {
            this.confIds = new ArrayList<>();
        }
        this.confIds.add(confIdsItem);
        return this;
    }

    public DeletePrivateNetworkSegmentsDto withConfIds(Consumer<List<String>> confIdsSetter) {
        if (this.confIds == null) {
            this.confIds = new ArrayList<>();
        }
        confIdsSetter.accept(this.confIds);
        return this;
    }

    /**
     * **参数解释**： 删除的私网网段ID列表，可以通过调用[获取私网网段的信息]获得，通过返回值中的data.private_network_list.conf_id获得 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及
     * @return confIds
     */
    public List<String> getConfIds() {
        return confIds;
    }

    public void setConfIds(List<String> confIds) {
        this.confIds = confIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeletePrivateNetworkSegmentsDto that = (DeletePrivateNetworkSegmentsDto) obj;
        return Objects.equals(this.confIds, that.confIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(confIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeletePrivateNetworkSegmentsDto {\n");
        sb.append("    confIds: ").append(toIndentedString(confIds)).append("\n");
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
