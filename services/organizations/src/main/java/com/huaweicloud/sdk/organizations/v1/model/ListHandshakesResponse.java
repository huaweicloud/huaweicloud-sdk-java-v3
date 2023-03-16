package com.huaweicloud.sdk.organizations.v1.model;

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
public class ListHandshakesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "handshakes")

    private List<HandshakeDto> handshakes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfoDto pageInfo;

    public ListHandshakesResponse withHandshakes(List<HandshakeDto> handshakes) {
        this.handshakes = handshakes;
        return this;
    }

    public ListHandshakesResponse addHandshakesItem(HandshakeDto handshakesItem) {
        if (this.handshakes == null) {
            this.handshakes = new ArrayList<>();
        }
        this.handshakes.add(handshakesItem);
        return this;
    }

    public ListHandshakesResponse withHandshakes(Consumer<List<HandshakeDto>> handshakesSetter) {
        if (this.handshakes == null) {
            this.handshakes = new ArrayList<>();
        }
        handshakesSetter.accept(this.handshakes);
        return this;
    }

    /**
     * 邀请（握手）对象的列表，其中包含与指定帐号关联的每个邀请（握手）的详细信息。
     * @return handshakes
     */
    public List<HandshakeDto> getHandshakes() {
        return handshakes;
    }

    public void setHandshakes(List<HandshakeDto> handshakes) {
        this.handshakes = handshakes;
    }

    public ListHandshakesResponse withPageInfo(PageInfoDto pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListHandshakesResponse withPageInfo(Consumer<PageInfoDto> pageInfoSetter) {
        if (this.pageInfo == null) {
            this.pageInfo = new PageInfoDto();
            pageInfoSetter.accept(this.pageInfo);
        }

        return this;
    }

    /**
     * Get pageInfo
     * @return pageInfo
     */
    public PageInfoDto getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfoDto pageInfo) {
        this.pageInfo = pageInfo;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListHandshakesResponse listHandshakesResponse = (ListHandshakesResponse) o;
        return Objects.equals(this.handshakes, listHandshakesResponse.handshakes)
            && Objects.equals(this.pageInfo, listHandshakesResponse.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(handshakes, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListHandshakesResponse {\n");
        sb.append("    handshakes: ").append(toIndentedString(handshakes)).append("\n");
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
