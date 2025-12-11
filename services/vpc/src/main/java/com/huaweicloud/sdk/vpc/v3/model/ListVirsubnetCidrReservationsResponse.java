package com.huaweicloud.sdk.vpc.v3.model;

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
public class ListVirsubnetCidrReservationsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "virsubnet_cidr_reservations")

    private List<VirsubnetCidrReservation> virsubnetCidrReservations = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    public ListVirsubnetCidrReservationsResponse withVirsubnetCidrReservations(
        List<VirsubnetCidrReservation> virsubnetCidrReservations) {
        this.virsubnetCidrReservations = virsubnetCidrReservations;
        return this;
    }

    public ListVirsubnetCidrReservationsResponse addVirsubnetCidrReservationsItem(
        VirsubnetCidrReservation virsubnetCidrReservationsItem) {
        if (this.virsubnetCidrReservations == null) {
            this.virsubnetCidrReservations = new ArrayList<>();
        }
        this.virsubnetCidrReservations.add(virsubnetCidrReservationsItem);
        return this;
    }

    public ListVirsubnetCidrReservationsResponse withVirsubnetCidrReservations(
        Consumer<List<VirsubnetCidrReservation>> virsubnetCidrReservationsSetter) {
        if (this.virsubnetCidrReservations == null) {
            this.virsubnetCidrReservations = new ArrayList<>();
        }
        virsubnetCidrReservationsSetter.accept(this.virsubnetCidrReservations);
        return this;
    }

    /**
     * **参数解释**： 查询子网预留网段列表的响应体。 **取值范围**： 不涉及。
     * @return virsubnetCidrReservations
     */
    public List<VirsubnetCidrReservation> getVirsubnetCidrReservations() {
        return virsubnetCidrReservations;
    }

    public void setVirsubnetCidrReservations(List<VirsubnetCidrReservation> virsubnetCidrReservations) {
        this.virsubnetCidrReservations = virsubnetCidrReservations;
    }

    public ListVirsubnetCidrReservationsResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * **参数解释**： 请求ID。 **取值范围**： 不涉及。
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public ListVirsubnetCidrReservationsResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListVirsubnetCidrReservationsResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
        if (this.pageInfo == null) {
            this.pageInfo = new PageInfo();
            pageInfoSetter.accept(this.pageInfo);
        }

        return this;
    }

    /**
     * Get pageInfo
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListVirsubnetCidrReservationsResponse that = (ListVirsubnetCidrReservationsResponse) obj;
        return Objects.equals(this.virsubnetCidrReservations, that.virsubnetCidrReservations)
            && Objects.equals(this.requestId, that.requestId) && Objects.equals(this.pageInfo, that.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(virsubnetCidrReservations, requestId, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListVirsubnetCidrReservationsResponse {\n");
        sb.append("    virsubnetCidrReservations: ").append(toIndentedString(virsubnetCidrReservations)).append("\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
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
