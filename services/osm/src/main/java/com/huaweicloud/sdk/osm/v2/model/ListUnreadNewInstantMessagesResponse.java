package com.huaweicloud.sdk.osm.v2.model;

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
public class ListUnreadNewInstantMessagesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "imunread")

    private List<ImUnreadV2> imunread = null;

    public ListUnreadNewInstantMessagesResponse withImunread(List<ImUnreadV2> imunread) {
        this.imunread = imunread;
        return this;
    }

    public ListUnreadNewInstantMessagesResponse addImunreadItem(ImUnreadV2 imunreadItem) {
        if (this.imunread == null) {
            this.imunread = new ArrayList<>();
        }
        this.imunread.add(imunreadItem);
        return this;
    }

    public ListUnreadNewInstantMessagesResponse withImunread(Consumer<List<ImUnreadV2>> imunreadSetter) {
        if (this.imunread == null) {
            this.imunread = new ArrayList<>();
        }
        imunreadSetter.accept(this.imunread);
        return this;
    }

    /**
     * 未读消息列表
     * @return imunread
     */
    public List<ImUnreadV2> getImunread() {
        return imunread;
    }

    public void setImunread(List<ImUnreadV2> imunread) {
        this.imunread = imunread;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListUnreadNewInstantMessagesResponse listUnreadNewInstantMessagesResponse =
            (ListUnreadNewInstantMessagesResponse) o;
        return Objects.equals(this.imunread, listUnreadNewInstantMessagesResponse.imunread);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imunread);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListUnreadNewInstantMessagesResponse {\n");
        sb.append("    imunread: ").append(toIndentedString(imunread)).append("\n");
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
