package com.huaweicloud.sdk.nat.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新SNAT规则的请求体。
 */
public class UpdatePrivateSnatOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transit_ip_ids")

    private List<String> transitIpIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public UpdatePrivateSnatOption withTransitIpIds(List<String> transitIpIds) {
        this.transitIpIds = transitIpIds;
        return this;
    }

    public UpdatePrivateSnatOption addTransitIpIdsItem(String transitIpIdsItem) {
        if (this.transitIpIds == null) {
            this.transitIpIds = new ArrayList<>();
        }
        this.transitIpIds.add(transitIpIdsItem);
        return this;
    }

    public UpdatePrivateSnatOption withTransitIpIds(Consumer<List<String>> transitIpIdsSetter) {
        if (this.transitIpIds == null) {
            this.transitIpIds = new ArrayList<>();
        }
        transitIpIdsSetter.accept(this.transitIpIds);
        return this;
    }

    /**
     * 中转IP的ID的列表。
     * @return transitIpIds
     */
    public List<String> getTransitIpIds() {
        return transitIpIds;
    }

    public void setTransitIpIds(List<String> transitIpIds) {
        this.transitIpIds = transitIpIds;
    }

    public UpdatePrivateSnatOption withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * SNAT规则的描述。长度范围小于等于255个字符，不能包含“<”和“>”。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdatePrivateSnatOption that = (UpdatePrivateSnatOption) obj;
        return Objects.equals(this.transitIpIds, that.transitIpIds)
            && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transitIpIds, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePrivateSnatOption {\n");
        sb.append("    transitIpIds: ").append(toIndentedString(transitIpIds)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
