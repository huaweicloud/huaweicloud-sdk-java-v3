package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class DeleteDesktopVolumesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_id")

    private String desktopId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private DeleteVolumesReq body;

    public DeleteDesktopVolumesRequest withDesktopId(String desktopId) {
        this.desktopId = desktopId;
        return this;
    }

    /**
     * 桌面ID。
     * @return desktopId
     */
    public String getDesktopId() {
        return desktopId;
    }

    public void setDesktopId(String desktopId) {
        this.desktopId = desktopId;
    }

    public DeleteDesktopVolumesRequest withBody(DeleteVolumesReq body) {
        this.body = body;
        return this;
    }

    public DeleteDesktopVolumesRequest withBody(Consumer<DeleteVolumesReq> bodySetter) {
        if (this.body == null) {
            this.body = new DeleteVolumesReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public DeleteVolumesReq getBody() {
        return body;
    }

    public void setBody(DeleteVolumesReq body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteDesktopVolumesRequest deleteDesktopVolumesRequest = (DeleteDesktopVolumesRequest) o;
        return Objects.equals(this.desktopId, deleteDesktopVolumesRequest.desktopId)
            && Objects.equals(this.body, deleteDesktopVolumesRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(desktopId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteDesktopVolumesRequest {\n");
        sb.append("    desktopId: ").append(toIndentedString(desktopId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
